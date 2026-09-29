package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zb5 extends wta {

    /* JADX INFO: renamed from: b */
    public final t56 f71302b;

    public zb5() {
        t56 t56Var = e84.f36837a;
        this.f71302b = new t56();
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        t56 t56Var = this.f71302b;
        int[] iArr = t56Var.f35144b;
        Object[] objArr = t56Var.f35145c;
        long[] jArr = t56Var.f35143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        h66 h66Var = (h66) objArr[i4];
                        Object[] objArr2 = h66Var.f1293a;
                        int i6 = h66Var.f1294b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            yb5 yb5Var = (yb5) objArr2[i7];
                            tm0 tm0Var = yb5Var.f69601d;
                            if (tm0Var != null) {
                                tm0Var.cancel();
                            }
                            yb5Var.f69601d = null;
                            ip5 ip5Var = (ip5) yb5Var.f69598a.f9881a;
                            ip5Var.f44396b = true;
                            ip5Var.f44395a = false;
                            ip5Var.m14063a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
