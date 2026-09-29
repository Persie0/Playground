package p000;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class k63 implements wc0 {

    /* JADX INFO: renamed from: a */
    public final p63 f46759a;

    /* JADX INFO: renamed from: b */
    public final int f46760b;

    /* JADX INFO: renamed from: c */
    public final n63 f46761c = new n63();

    public k63(p63 p63Var, int i) {
        this.f46759a = p63Var;
        this.f46760b = i;
    }

    /* JADX INFO: renamed from: a */
    public final long m14880a(iy2 iy2Var) {
        n63 n63Var;
        p63 p63Var;
        int iMo13079g;
        while (true) {
            long jMo13077e = iy2Var.mo13077e();
            long length = iy2Var.getLength() - 6;
            n63Var = this.f46761c;
            p63Var = this.f46759a;
            if (jMo13077e >= length) {
                break;
            }
            long jMo13077e2 = iy2Var.mo13077e();
            k47 k47Var = new k47(17);
            int i = 0;
            boolean zM17390a = false;
            iy2Var.mo13085o(k47Var.f46700a, 0, 2);
            char cM14823g = k47Var.m14823g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.f46760b;
            if (cM14823g != i2) {
                iy2Var.mo13080i();
                iy2Var.mo13078f((int) (jMo13077e2 - iy2Var.getPosition()));
            } else {
                byte[] bArr = k47Var.f46700a;
                while (i < 15 && (iMo13079g = iy2Var.mo13079g(bArr, 2 + i, 15 - i)) != -1) {
                    i += iMo13079g;
                }
                k47Var.m14817L(i + 2);
                iy2Var.mo13080i();
                iy2Var.mo13078f((int) (jMo13077e2 - iy2Var.getPosition()));
                zM17390a = ndd.m17390a(k47Var, p63Var, i2, n63Var);
            }
            if (zM17390a) {
                break;
            }
            iy2Var.mo13078f(1);
        }
        if (iy2Var.mo13077e() < iy2Var.getLength() - 6) {
            return n63Var.f52394a;
        }
        iy2Var.mo13078f((int) (iy2Var.getLength() - iy2Var.mo13077e()));
        return p63Var.f55641j;
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: g */
    public final vc0 mo14881g(iy2 iy2Var, long j) {
        long position = iy2Var.getPosition();
        long jM14880a = m14880a(iy2Var);
        long jMo13077e = iy2Var.mo13077e();
        iy2Var.mo13078f(Math.max(6, this.f46759a.f55634c));
        long jM14880a2 = m14880a(iy2Var);
        long jMo13077e2 = iy2Var.mo13077e();
        if (jM14880a > j || jM14880a2 <= j) {
            return jM14880a2 <= j ? new vc0(-2, jM14880a2, jMo13077e2) : new vc0(-1, jM14880a, position);
        }
        return new vc0(0, -9223372036854775807L, jMo13077e);
    }
}
