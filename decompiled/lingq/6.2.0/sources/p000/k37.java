package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class k37 {

    /* JADX INFO: renamed from: a */
    public static final long f46625a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f46626b = 0;

    static {
        ay9[] ay9VarArr = zx9.f72358b;
        f46625a = zx9.f72359c;
    }

    /* JADX INFO: renamed from: a */
    public static final j37 m14787a(j37 j37Var, int i, int i2, long j, aw9 aw9Var, a97 a97Var, rc5 rc5Var, int i3, int i4, ax9 ax9Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        aw9 aw9Var2 = aw9Var;
        a97 a97Var2 = a97Var;
        rc5 rc5Var2 = rc5Var;
        int i7 = i3;
        int i8 = i4;
        ax9 ax9Var2 = ax9Var;
        if (i5 == 0 || i5 == j37Var.f45012a) {
            ay9[] ay9VarArr = zx9.f72358b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (zx9.m25846a(j3, j37Var.f45014c)) {
                }
            }
            if ((aw9Var2 == null || aw9Var2.equals(j37Var.f45015d)) && ((i6 == 0 || i6 == j37Var.f45013b) && ((a97Var2 == null || a97Var2.equals(j37Var.f45016e)) && ((rc5Var2 == null || rc5Var2.equals(j37Var.f45017f)) && ((i7 == 0 || i7 == j37Var.f45018g) && ((i8 == 0 || i8 == j37Var.f45019h) && (ax9Var2 == null || ax9Var2.equals(j37Var.f45020i)))))))) {
                return j37Var;
            }
        } else {
            j2 = 0;
        }
        ay9[] ay9VarArr2 = zx9.f72358b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = j37Var.f45014c;
        }
        if (aw9Var2 == null) {
            aw9Var2 = j37Var.f45015d;
        }
        if (i5 == 0) {
            i5 = j37Var.f45012a;
        }
        if (i6 == 0) {
            i6 = j37Var.f45013b;
        }
        a97 a97Var3 = j37Var.f45016e;
        if (a97Var3 != null && a97Var2 == null) {
            a97Var2 = a97Var3;
        }
        if (rc5Var2 == null) {
            rc5Var2 = j37Var.f45017f;
        }
        if (i7 == 0) {
            i7 = j37Var.f45018g;
        }
        if (i8 == 0) {
            i8 = j37Var.f45019h;
        }
        if (ax9Var2 == null) {
            ax9Var2 = j37Var.f45020i;
        }
        return new j37(i5, i6, j3, aw9Var2, a97Var2, rc5Var2, i7, i8, ax9Var2);
    }
}
