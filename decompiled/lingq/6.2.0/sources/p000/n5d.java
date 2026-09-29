package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n5d {
    /* JADX INFO: renamed from: a */
    public static void m17243a(long j, k47 k47Var, n8a[] n8aVarArr) {
        int i;
        int iM14842z;
        while (true) {
            if (k47Var.m14820a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (k47Var.m14820a() == 0) {
                    i = -1;
                    break;
                }
                int iM14842z2 = k47Var.m14842z();
                i2 += iM14842z2;
                if (iM14842z2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (k47Var.m14820a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM14842z = k47Var.m14842z();
                    i3 += iM14842z;
                }
            } while (iM14842z == 255);
            int i4 = k47Var.f46701b + i3;
            if (i3 == -1 || i3 > k47Var.m14820a()) {
                ss5.m21707d0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = k47Var.f46702c;
            } else if (i == 4 && i3 >= 8) {
                int iM14842z3 = k47Var.m14842z();
                int iM14812G = k47Var.m14812G();
                int iM14829m = iM14812G == 49 ? k47Var.m14829m() : 0;
                int iM14842z4 = k47Var.m14842z();
                if (iM14812G == 47) {
                    k47Var.m14819N(1);
                }
                boolean z = iM14842z3 == 181 && (iM14812G == 49 || iM14812G == 47) && iM14842z4 == 3;
                if (iM14812G == 49) {
                    z &= iM14829m == 1195456820;
                }
                if (z) {
                    m17244b(j, k47Var, n8aVarArr);
                }
            }
            k47Var.m14818M(i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17244b(long j, k47 k47Var, n8a[] n8aVarArr) {
        int iM14842z = k47Var.m14842z();
        if ((iM14842z & 64) != 0) {
            k47Var.m14819N(1);
            int i = (iM14842z & 31) * 3;
            int i2 = k47Var.f46701b;
            for (n8a n8aVar : n8aVarArr) {
                k47Var.m14818M(i2);
                n8aVar.mo2535e(i, k47Var);
                bna.m3987z(j != -9223372036854775807L);
                n8aVar.mo2531a(j, 1, i, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final rp9 m17245c(a8b a8bVar, int i) {
        return new rp9(a8bVar.f364a, a8bVar.f365b, i);
    }
}
