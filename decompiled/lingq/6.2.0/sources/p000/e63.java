package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e63 extends wc3 {

    /* JADX INFO: renamed from: b */
    public final long f36754b;

    /* JADX INFO: renamed from: c */
    public final boolean f36755c;

    /* JADX INFO: renamed from: d */
    public long f36756d;

    public e63(yd9 yd9Var, long j, boolean z) {
        super(yd9Var);
        this.f36754b = j;
        this.f36755c = z;
    }

    @Override // p000.wc3, p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        aj0Var.getClass();
        long j2 = this.f36756d;
        long j3 = this.f36754b;
        if (j2 > j3) {
            j = 0;
        } else if (this.f36755c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jMo459F = this.f66615a.mo459F(aj0Var, j);
        if (jMo459F != -1) {
            this.f36756d += jMo459F;
        }
        long j5 = this.f36756d;
        if ((j5 >= j3 || jMo459F != -1) && j5 <= j3) {
            return jMo459F;
        }
        if (jMo459F > 0 && j5 > j3) {
            long j6 = aj0Var.f723b - (j5 - j3);
            aj0 aj0Var2 = new aj0();
            aj0Var2.mo456B(aj0Var);
            aj0Var.mo471X(aj0Var2, j6);
            aj0Var2.m473a();
        }
        StringBuilder sbM22996s = ux5.m22996s(j3, "expected ", " bytes but got ");
        sbM22996s.append(this.f36756d);
        throw new IOException(sbM22996s.toString());
    }
}
