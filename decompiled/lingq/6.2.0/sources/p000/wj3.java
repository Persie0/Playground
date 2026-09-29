package p000;

import java.util.ArrayList;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes.dex */
public final class wj3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f66926a;

    /* JADX INFO: renamed from: b */
    public final int f66927b;

    /* JADX INFO: renamed from: c */
    public int f66928c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f66929d;

    /* JADX INFO: renamed from: e */
    public final t56 f66930e;

    /* JADX INFO: renamed from: f */
    public final cs4 f66931f;

    public wj3(int i, ArrayList arrayList) {
        this.f66926a = arrayList;
        this.f66927b = i;
        if (i < 0) {
            hi7.m13278a("Invalid start index");
        }
        this.f66929d = new ArrayList();
        t56 t56Var = new t56();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ei4 ei4Var = (ei4) this.f66926a.get(i3);
            int i4 = ei4Var.f37283c;
            int i5 = ei4Var.f37284d;
            t56Var.m21850i(i4, new dq3(i3, i2, i5));
            i2 += i5;
        }
        this.f66930e = t56Var;
        this.f66931f = AbstractC3192a.m15356a(new c82(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24009a(int i, int i2) {
        dq3 dq3Var;
        int i3;
        int i4;
        t56 t56Var = this.f66930e;
        dq3 dq3Var2 = (dq3) t56Var.m10152b(i);
        if (dq3Var2 == null) {
            return false;
        }
        int i5 = dq3Var2.f36019b;
        int i6 = i2 - dq3Var2.f36020c;
        dq3Var2.f36020c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = t56Var.f35145c;
        long[] jArr = t56Var.f35143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (dq3Var = (dq3) objArr[(i7 << 3) + i9]).f36019b) >= i5 && dq3Var != dq3Var2 && (i4 = i3 + i6) >= 0) {
                        dq3Var.f36019b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
