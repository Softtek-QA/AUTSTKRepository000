package br.lry.components;

import com.borland.silktest.jtf.BaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.win32.ListView;
import com.borland.silktest.jtf.common.types.ClickType;
import com.microfocus.silktest.jtf.sap.SapWindow;
import com.microfocus.silktest.jtf.sap.SapTextField;
import com.microfocus.silktest.jtf.sap.common.types.VKey;
import com.borland.silktest.jtf.Desktop;

public class AUTSAPLogin {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		BaseState baseState = new BaseState();
		baseState.execute(desktop);
	}

	@Test
	public void autLogin() {
		desktop.<ListView>find("SAP Logon 730.ListView").textClick("LEROY-ECQ");
		desktop.<ListView>find("SAP Logon 730.ListView").textClick("LEROY-ECQ", 1, ClickType.LEFTDOUBLE);
		desktop.<SapWindow>find("wnd 0").setActive();
		desktop.<SapTextField>find("wnd 0.txtRSYST-BNAME").setText("51028487");
		desktop.<SapTextField>find("wnd 0.pwdRSYST-BCODE").setPasswordText("xFVqGp2NW8KDnw==");
		desktop.<SapTextField>find("wnd 0.pwdRSYST-BCODE").setFocus();
		desktop.<SapWindow>find("wnd 0").sendVKey(VKey.ENTER);
	}

}