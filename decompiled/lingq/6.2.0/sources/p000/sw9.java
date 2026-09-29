package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sw9 {

    /* JADX INFO: renamed from: a */
    public final rw9 f61519a;

    /* JADX INFO: renamed from: b */
    public aq4 f61520b = null;

    /* JADX INFO: renamed from: c */
    public aq4 f61521c;

    public sw9(rw9 rw9Var, aq4 aq4Var) {
        this.f61519a = rw9Var;
        this.f61521c = aq4Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m21753a(long j) {
        e28 e28VarMo1670Q;
        aq4 aq4Var = this.f61520b;
        e28 e28Var = e28.f36619e;
        if (aq4Var != null) {
            if (aq4Var.mo1691n()) {
                aq4 aq4Var2 = this.f61521c;
                e28VarMo1670Q = aq4Var2 != null ? aq4Var2.mo1670Q(aq4Var, true) : null;
            } else {
                e28VarMo1670Q = e28Var;
            }
            if (e28VarMo1670Q != null) {
                e28Var = e28VarMo1670Q;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = e28Var.f36620a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = e28Var.f36622c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = e28Var.f36621b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = e28Var.f36623d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final int m21754b(long j, boolean z) {
        if (z) {
            j = m21753a(j);
        }
        return this.f61519a.f59976b.m23746g(m21756d(j));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21755c(long j) {
        long jM21756d = m21756d(m21753a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM21756d));
        rw9 rw9Var = this.f61519a;
        int iM23744e = rw9Var.f59976b.m23744e(fIntBitsToFloat);
        int i = (int) (jM21756d >> 32);
        return Float.intBitsToFloat(i) >= rw9Var.m20958e(iM23744e) && Float.intBitsToFloat(i) <= rw9Var.m20959f(iM23744e);
    }

    /* JADX INFO: renamed from: d */
    public final long m21756d(long j) {
        aq4 aq4Var;
        aq4 aq4Var2 = this.f61520b;
        if (aq4Var2 != null) {
            if (!aq4Var2.mo1691n()) {
                aq4Var2 = null;
            }
            if (aq4Var2 != null && (aq4Var = this.f61521c) != null) {
                aq4 aq4Var3 = aq4Var.mo1691n() ? aq4Var : null;
                if (aq4Var3 != null) {
                    return aq4Var2.mo1667K(aq4Var3, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final long m21757e(long j) {
        aq4 aq4Var;
        aq4 aq4Var2 = this.f61520b;
        if (aq4Var2 != null) {
            if (!aq4Var2.mo1691n()) {
                aq4Var2 = null;
            }
            if (aq4Var2 != null && (aq4Var = this.f61521c) != null) {
                aq4 aq4Var3 = aq4Var.mo1691n() ? aq4Var : null;
                if (aq4Var3 != null) {
                    return aq4Var3.mo1667K(aq4Var2, j);
                }
            }
        }
        return j;
    }
}
