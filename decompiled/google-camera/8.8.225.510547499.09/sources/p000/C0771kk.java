package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: kk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0771kk {
    /* JADX INFO: renamed from: a */
    static void m14402a(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }

    /* JADX INFO: renamed from: b */
    static boolean m14403b(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m14404c(int i) {
        switch (i) {
            case 1:
                return "APP_CLOSED";
            case 2:
                return "APP_DISCONNECTED";
            case 3:
                return "CAMERA2_CLOSED";
            case 4:
                return "CAMERA2_DISCONNECTED";
            case 5:
                return "CAMERA2_ERROR";
            default:
                return "CAMERA2_EXCEPTION";
        }
    }
}
