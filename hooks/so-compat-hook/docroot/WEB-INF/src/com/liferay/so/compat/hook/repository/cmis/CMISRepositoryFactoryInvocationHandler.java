/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.so.compat.hook.repository.cmis;

import com.liferay.portal.kernel.repository.Repository;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.lang.Object;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Brian Wing Shun Chan
 */
public class CMISRepositoryFactoryInvocationHandler
	implements InvocationHandler {

	public CMISRepositoryFactoryInvocationHandler(Object repositoryFactory) {
		_repositoryFactory = repositoryFactory;
	}

	public Object getRepositoryFactory() {
		return _repositoryFactory;
	}

	public Object invoke(Object proxy, Method method, Object[] arguments)
		throws Throwable {

		try {
			String methodName = method.getName();

			Object value = method.invoke(_repositoryFactory, arguments);

			if (methodName.equals("getInstance")) {
				ClassLoader classLoader =
					PortalClassLoaderUtil.getClassLoader();

				value = ProxyUtil.newProxyInstance(
					classLoader, new Class<?>[] {Repository.class},
					new CMISRepositoryInvocationHandler((Repository)value));
			}

			return value;
		}
		catch (InvocationTargetException ite) {
			throw ite.getTargetException();
		}
	}

	private Object _repositoryFactory;

}