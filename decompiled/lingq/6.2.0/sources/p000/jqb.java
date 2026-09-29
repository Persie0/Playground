package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jqb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f46017a = new C0282a(976216332, false, new od1(26));

    /* JADX INFO: renamed from: b */
    public static final C0282a f46018b = new C0282a(435786826, false, new od1(27));

    /* JADX INFO: renamed from: c */
    public static final C0282a f46019c = new C0282a(-1617194620, false, new qd1(5));

    /* JADX INFO: renamed from: a */
    public static int m14617a(so0 so0Var, int i, int i2, int i3) {
        bna.m3969q(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        ggd.m12591a(ggd.m12591a(i4, i5), 1 << i3);
        if (so0Var.m21498b() < i) {
            return -1;
        }
        int iM21503g = so0Var.m21503g(i);
        if (iM21503g == i4) {
            if (so0Var.m21498b() < i2) {
                return -1;
            }
            int iM21503g2 = so0Var.m21503g(i2);
            iM21503g += iM21503g2;
            if (iM21503g2 == i5) {
                if (so0Var.m21498b() < i3) {
                    return -1;
                }
                return so0Var.m21503g(i3) + iM21503g;
            }
        }
        return iM21503g;
    }

    /* JADX INFO: renamed from: b */
    public static void m14618b(so0 so0Var) {
        so0Var.m21511o(3);
        so0Var.m21511o(8);
        boolean zM21502f = so0Var.m21502f();
        boolean zM21502f2 = so0Var.m21502f();
        if (zM21502f) {
            so0Var.m21511o(5);
        }
        if (zM21502f2) {
            so0Var.m21511o(6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m14619c(so0 so0Var) {
        int iM21503g;
        int iM21503g2 = so0Var.m21503g(2);
        if (iM21503g2 == 0) {
            so0Var.m21511o(6);
            return;
        }
        int iM14617a = m14617a(so0Var, 5, 8, 16) + 1;
        if (iM21503g2 == 1) {
            so0Var.m21511o(iM14617a * 7);
            return;
        }
        if (iM21503g2 == 2) {
            boolean zM21502f = so0Var.m21502f();
            int i = zM21502f ? 1 : 5;
            int i2 = zM21502f ? 7 : 5;
            int i3 = zM21502f ? 8 : 6;
            int i4 = 0;
            while (i4 < iM14617a) {
                if (so0Var.m21502f()) {
                    so0Var.m21511o(7);
                    iM21503g = 0;
                } else {
                    if (so0Var.m21503g(2) == 3 && so0Var.m21503g(i2) * i != 0) {
                        so0Var.m21510n();
                    }
                    iM21503g = so0Var.m21503g(i3) * i;
                    if (iM21503g != 0 && iM21503g != 180) {
                        so0Var.m21510n();
                    }
                    so0Var.m21510n();
                }
                if (iM21503g != 0 && iM21503g != 180 && so0Var.m21502f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
