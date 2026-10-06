package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aft {
    /* JADX INFO: renamed from: a */
    static int m557a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    /* JADX INFO: renamed from: b */
    static void m558b(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m559c(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }
}
