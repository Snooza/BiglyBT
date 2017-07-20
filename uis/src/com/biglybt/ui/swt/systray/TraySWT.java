/*
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
 */

package com.biglybt.ui.swt.systray;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tray;

/**
 * Created by TuxPaper on 6/29/2017.
 */
public class TraySWT implements TrayDelegate {
	private final Tray tray;

	public TraySWT(Display display) {
		tray = display.getSystemTray();
	}

	public Tray getSWT() {
		return tray;
	}
}
