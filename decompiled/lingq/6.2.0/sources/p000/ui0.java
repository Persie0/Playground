package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ui0 {
    /* JADX INFO: renamed from: a */
    public static xc5 m22745a(ui0 ui0Var, List list, float f, float f2, int i) {
        float f3 = (i & 2) != 0 ? 0.0f : f;
        float f4 = (i & 4) != 0 ? Float.POSITIVE_INFINITY : f2;
        ui0Var.getClass();
        return new xc5(list, null, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
    }

    /* JADX INFO: renamed from: b */
    public static xc5 m22746b(Pair[] pairArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new aa1(((aa1) pair.f47624b).f414a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.f47623a).floatValue()));
        }
        return new xc5(arrayList, arrayList2, j, j2, 0);
    }

    /* JADX INFO: renamed from: c */
    public static xc5 m22747c(ui0 ui0Var, List list, long j, long j2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        ui0Var.getClass();
        return new xc5(list, null, j3, j2, 0);
    }

    /* JADX INFO: renamed from: d */
    public static eq7 m22748d(ui0 ui0Var, List list, long j, float f) {
        ui0Var.getClass();
        return new eq7(list, null, j, f);
    }

    /* JADX INFO: renamed from: e */
    public static xc5 m22749e(ui0 ui0Var, List list, float f, float f2, int i) {
        float f3 = (i & 2) != 0 ? 0.0f : f;
        float f4 = (i & 4) != 0 ? Float.POSITIVE_INFINITY : f2;
        ui0Var.getClass();
        return new xc5(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), 0);
    }

    /* JADX INFO: renamed from: f */
    public static xc5 m22750f(ui0 ui0Var, Pair[] pairArr) {
        ui0Var.getClass();
        return m22746b((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }
}
