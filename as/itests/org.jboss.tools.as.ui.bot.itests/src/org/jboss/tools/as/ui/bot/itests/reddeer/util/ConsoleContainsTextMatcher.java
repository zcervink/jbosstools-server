/*******************************************************************************
 * Copyright (c) 2020 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package org.jboss.tools.as.ui.bot.itests.reddeer.util;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.eclipse.reddeer.eclipse.ui.console.ConsoleView;

/**
 * Checks if the active console in console view contains specified text.
 * 
 * @author Lucia Jelinkova
 *
 */
public class ConsoleContainsTextMatcher extends TypeSafeMatcher<ConsoleView> {

	private String expectedText;
	
	private String actualText;
	
	public ConsoleContainsTextMatcher(String expectedText) {
		this.expectedText = expectedText;
	}
	
	@Override
	protected boolean matchesSafely(ConsoleView view) {
		actualText = view.getConsoleText();
		return actualText.contains(expectedText);
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("Console should contain text '");
		description.appendText(expectedText);
		description.appendText("', but contains text '");
		description.appendText(actualText);
		description.appendText("'.");
	}
}
