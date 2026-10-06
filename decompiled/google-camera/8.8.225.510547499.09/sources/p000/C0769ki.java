package p000;

import android.view.View;

/* JADX INFO: renamed from: ki */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0769ki {
    /* JADX INFO: renamed from: a */
    static void m14305a(View view, float f, float f2) {
        view.drawableHotspotChanged(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m14306b(int i) {
        switch (i) {
            case 1:
                return "PENDING";
            case 2:
                return "CREATING";
            case 3:
                return "CREATED";
            case 4:
                return "CLOSING";
            case 5:
                return "CLOSED";
            default:
                return "null";
        }
    }
}
