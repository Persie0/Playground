package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blz {

    /* JADX INFO: renamed from: a */
    public static final PointF f3737a = new PointF();

    /* JADX INFO: renamed from: a */
    public static float m2693a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: b */
    static int m2694b(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* JADX INFO: renamed from: c */
    public static PointF m2695c(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: d */
    public static void m2696d(biw biwVar, int i, List list, biw biwVar2, bhq bhqVar) {
        if (biwVar.m2519d(bhqVar.mo2469g(), i)) {
            list.add(biwVar2.m2517b(bhqVar.mo2469g()).m2518c(bhqVar));
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m2697e(int i) {
        return Math.max(0, Math.min(255, i));
    }
}
