package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f06 {

    /* JADX INFO: renamed from: a */
    public static final PointF f38140a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m11420a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m11421b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: c */
    public static int m11422c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* JADX INFO: renamed from: d */
    public static int m11423d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* JADX INFO: renamed from: e */
    public static void m11424e(u39 u39Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = u39Var.f63362b;
        ArrayList arrayList = u39Var.f63361a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = f38140a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            as1 as1Var = (as1) arrayList.get(i);
            PointF pointF3 = as1Var.f7414a;
            PointF pointF4 = as1Var.f7415b;
            PointF pointF5 = as1Var.f7416c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (u39Var.f63363c) {
            path3.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public static float m11425f(float f, float f2, float f3) {
        return AbstractC3393o1.m17726a(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: g */
    public static void m11426g(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2, oi4 oi4Var) {
        if (mi4Var.m16841a(i, oi4Var.getName())) {
            String name = oi4Var.getName();
            mi4 mi4Var3 = new mi4(mi4Var2);
            mi4Var3.f51357a.add(name);
            mi4 mi4Var4 = new mi4(mi4Var3);
            mi4Var4.f51358b = oi4Var;
            arrayList.add(mi4Var4);
        }
    }
}
