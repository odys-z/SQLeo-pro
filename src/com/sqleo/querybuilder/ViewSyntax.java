/*
 * SQLeonardo :: java database frontend
 * Copyright (C) 2004 nickyb@users.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package com.sqleo.querybuilder;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.sqleo.common.gui.BorderLayoutPanel;


public class ViewSyntax extends BorderLayoutPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextArea text;

	ViewSyntax() {
		JScrollPane scroll = new JScrollPane(text = new JTextArea());
		scroll.getVerticalScrollBar().setUnitIncrement(25);
		setComponentCenter(scroll);
	}

	String getText() {
		return text.getText();
	}

	void setText(String sql) {
		text.setText(sql);
	}
}
