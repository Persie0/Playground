package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class chd {
    /* JADX INFO: renamed from: a */
    public static final long m4667a(KeyEvent keyEvent) {
        return dhd.m10397a(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: b */
    public static final int m4668b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public static final int m4669c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m4670d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m4671e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m4672f(KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4673g(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
