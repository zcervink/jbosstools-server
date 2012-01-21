/*******************************************************************************
 * Copyright (c) 2006 Jeff Mesnil
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    "Rob Stryker" <rob.stryker@redhat.com> - Initial implementation
 *******************************************************************************/
package org.jboss.tools.jmx.core.test;

import junit.framework.TestCase;

import org.jboss.tools.jmx.core.tree.ErrorRoot;

public class ErrorRootTest extends TestCase {

	public void testErrorRootConstructor() {
		// there should be no exceptions 
		new ErrorRoot();
	}

}
