package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class agn {
    /* JADX INFO: renamed from: a */
    static int m599a(int i) {
        int iStatusBars = 0;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i & i2) != 0) {
                switch (i2) {
                    case 1:
                        iStatusBars |= WindowInsets.Type.statusBars();
                        break;
                    case 2:
                        iStatusBars |= WindowInsets.Type.navigationBars();
                        break;
                    case 4:
                        iStatusBars |= WindowInsets.Type.captionBar();
                        break;
                    case 8:
                        iStatusBars |= WindowInsets.Type.ime();
                        break;
                    case 16:
                        iStatusBars |= WindowInsets.Type.systemGestures();
                        break;
                    case 32:
                        iStatusBars |= WindowInsets.Type.mandatorySystemGestures();
                        break;
                    case 64:
                        iStatusBars |= WindowInsets.Type.tappableElement();
                        break;
                    case 128:
                        iStatusBars |= WindowInsets.Type.displayCutout();
                        break;
                }
            }
        }
        return iStatusBars;
    }
}
