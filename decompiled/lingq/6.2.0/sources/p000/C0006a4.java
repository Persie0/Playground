package p000;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a4 {

    /* JADX INFO: renamed from: a */
    public Object f193a;

    public /* synthetic */ C0006a4(Object obj) {
        this.f193a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static C0006a4 m94b(int i, int i2, int i3) {
        return new C0006a4(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    /* JADX INFO: renamed from: a */
    public void m95a(q84 q84Var) {
        Object obj = this.f193a;
        if (obj == null) {
            this.f193a = q84Var;
            return;
        }
        if (obj instanceof o66) {
            ((o66) obj).m17811d(q84Var);
            return;
        }
        if (obj.equals(q84Var)) {
            return;
        }
        o66 o66Var = pm8.f56484a;
        o66 o66Var2 = new o66(2);
        o66Var2.m17818k((q84) obj);
        o66Var2.m17818k(q84Var);
        this.f193a = o66Var2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[LOOP:0: B:16:0x0028->B:27:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public void m96c(q84 q84Var) {
        Object obj = this.f193a;
        if (fa4.m11650l(obj, q84Var)) {
            this.f193a = null;
            return;
        }
        if (obj instanceof o66) {
            o66 o66Var = (o66) obj;
            o66Var.m17819l(q84Var);
            int i = o66Var.f1305d;
            if (i == 0) {
                this.f193a = null;
                return;
            }
            if (i != 1) {
                return;
            }
            Object[] objArr = o66Var.f1303b;
            long[] jArr = o66Var.f1302a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                this.f193a = objArr[(i2 << 3) + i4];
                                return;
                            }
                            j >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
            uk9.m22775i("The ScatterSet is empty");
        }
    }
}
