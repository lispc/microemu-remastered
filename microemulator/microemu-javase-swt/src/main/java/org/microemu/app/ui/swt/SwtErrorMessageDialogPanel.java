/**
 *  MicroEmulator
 *  Copyright (C) 2001-2007 Bartek Teodorczyk <barteo@barteo.net>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  @version $Id: ConnectionClosedException.java 877 2007-02-13 02:24:09Z vlads $
 */
package org.microemu.app.ui.swt;

import org.eclipse.swt.widgets.Shell;
import org.microemu.app.ui.Message;
import org.microemu.app.ui.MessageListener;

public class SwtErrorMessageDialogPanel implements MessageListener {
	
	private Shell shell;

	public SwtErrorMessageDialogPanel(Shell shell) {
		this.shell = shell;
	}

	public void showMessage(int level, String title, String text, Throwable throwable) {
		// TODO Add option to show throwable
		int messageType;
		switch (level) {
		case Message.ERROR:
			messageType = SwtMessageDialog.ERROR;
			break;
		case Message.WARN:
			messageType = SwtMessageDialog.WARNING;
			break;
		default:
			messageType = SwtMessageDialog.INFORMATION;
		}
		SwtMessageDialog.openMessageDialog(shell, title, text, messageType);
	}

}
