package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hid {
    /* JADX INFO: renamed from: a */
    public static final Object m13290a(ct5 ct5Var) {
        Object objMo1509A = ct5Var.mo1509A();
        fq4 fq4Var = objMo1509A instanceof fq4 ? (fq4) objMo1509A : null;
        if (fq4Var != null) {
            return fq4Var.f39454J;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final int m13291b(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }
}
