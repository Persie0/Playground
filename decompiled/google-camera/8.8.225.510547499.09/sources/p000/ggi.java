package p000;

import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggi {
    /* JADX INFO: renamed from: a */
    public static int m9209a(kay kayVar, boolean z) {
        if (z) {
            if (kayVar == kay.CLOCKWISE_0) {
                return 1;
            }
            if (kayVar == kay.CLOCKWISE_90) {
                return 3;
            }
            return kayVar == kay.CLOCKWISE_180 ? 2 : 4;
        }
        if (kayVar == kay.CLOCKWISE_0) {
            return 3;
        }
        if (kayVar == kay.CLOCKWISE_90) {
            return 1;
        }
        return kayVar == kay.CLOCKWISE_180 ? 4 : 2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9210b(int i) {
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: c */
    public static int m9211c(WindowManager windowManager) {
        kay kayVarM13891d;
        switch (windowManager.getDefaultDisplay().getRotation()) {
            case 0:
                kayVarM13891d = kay.m13891d(0);
                break;
            case 1:
                kayVarM13891d = kay.m13891d(90);
                break;
            case 2:
                kayVarM13891d = kay.m13891d(180);
                break;
            case 3:
                kayVarM13891d = kay.m13891d(270);
                break;
            default:
                kayVarM13891d = kay.CLOCKWISE_0;
                break;
        }
        return kayVarM13891d.m13893a();
    }
}
