package p000;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kta {
    /* JADX INFO: renamed from: a */
    public static int m15688a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m15689b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
