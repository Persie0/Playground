package p000;

import androidx.compose.p002ui.focus.C0299a;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pdd {
    /* JADX INFO: renamed from: a */
    public static final void m19075a(p93 p93Var) {
        C0299a c0299a = ((C0301c) ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(p93Var)).getFocusOwner()).f3909d;
        if (c0299a.f3904d.m17811d(p93Var)) {
            c0299a.m1354a();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m19076b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }
}
