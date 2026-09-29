package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class epb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f37694a = new C0282a(390534318, false, new kd1(26));

    /* JADX INFO: renamed from: b */
    public static final C0282a f37695b = new C0282a(980557134, false, new kd1(27));

    /* JADX INFO: renamed from: c */
    public static final C0282a f37696c = new C0282a(1114391925, false, new ld1(16));

    /* JADX INFO: renamed from: a */
    public static boolean m11314a(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
