package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x87 implements dr3 {

    /* JADX INFO: renamed from: a */
    public final View f67933a;

    public x87(View view) {
        this.f67933a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m24403a(int i) {
        int i2 = 16;
        if (i != 16) {
            i2 = 6;
            if (i != 6) {
                i2 = 13;
                if (i != 13) {
                    i2 = 23;
                    if (i != 23) {
                        i2 = 3;
                        if (i != 3) {
                            if (i == 0) {
                                i2 = 0;
                            } else {
                                i2 = 17;
                                if (i != 17) {
                                    i2 = 27;
                                    if (i != 27) {
                                        i2 = 26;
                                        if (i != 26) {
                                            i2 = 9;
                                            if (i != 9) {
                                                i2 = 22;
                                                if (i != 22) {
                                                    i2 = 21;
                                                    if (i != 21) {
                                                        i2 = 1;
                                                        if (i != 1) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = dta.f36217a;
        int iM23890a = wed.m23890a(i2);
        if (iM23890a == -1) {
            return;
        }
        this.f67933a.performHapticFeedback(iM23890a);
    }
}
