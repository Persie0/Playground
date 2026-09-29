package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jcd {
    /* JADX INFO: renamed from: a */
    public static Set m14396a() {
        return Build.VERSION.SDK_INT >= 34 ? vq2.m23465a() : icd.m13783d();
    }

    /* JADX INFO: renamed from: b */
    public static Rect m14397b(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: c */
    public static List m14398c(zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(zzfVar.f12118e));
        double dCos = Math.cos(Math.toRadians(zzfVar.f12118e));
        int i = zzfVar.f12114a;
        int i2 = zzfVar.f12115b;
        pointArr[0] = new Point(i, i2);
        double d = zzfVar.f12116c;
        Point point = new Point((int) (((double) i) + (d * dCos)), (int) ((d * dSin) + ((double) i2)));
        pointArr[1] = point;
        double d2 = point.x;
        int i3 = zzfVar.f12117d;
        pointArr[2] = new Point((int) (d2 - (((double) i3) * dSin)), (int) ((((double) i3) * dCos) + ((double) pointArr[1].y)));
        Point point2 = pointArr[0];
        int i4 = point2.x;
        Point point3 = pointArr[2];
        int i5 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i5 - point4.x) + i4, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}
