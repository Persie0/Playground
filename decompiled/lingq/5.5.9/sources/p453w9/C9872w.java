package p453w9;

import android.util.SparseArray;
import java.io.IOException;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p357r6.C8739a;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9872w implements InterfaceC7507h {

    /* JADX INFO: renamed from: e */
    public boolean f50394e;

    /* JADX INFO: renamed from: f */
    public boolean f50395f;

    /* JADX INFO: renamed from: g */
    public boolean f50396g;

    /* JADX INFO: renamed from: h */
    public long f50397h;

    /* JADX INFO: renamed from: i */
    public C9870u f50398i;

    /* JADX INFO: renamed from: j */
    public InterfaceC7509j f50399j;

    /* JADX INFO: renamed from: k */
    public boolean f50400k;

    /* JADX INFO: renamed from: a */
    public final C10130a0 f50390a = new C10130a0(0);

    /* JADX INFO: renamed from: c */
    public final C10151t f50392c = new C10151t(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray<a> f50391b = new SparseArray<>();

    /* JADX INFO: renamed from: d */
    public final C9871v f50393d = new C9871v();

    /* JADX INFO: renamed from: w9.w$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9859j f50401a;

        /* JADX INFO: renamed from: b */
        public final C10130a0 f50402b;

        /* JADX INFO: renamed from: c */
        public final C8739a f50403c = new C8739a(new byte[64], 64);

        /* JADX INFO: renamed from: d */
        public boolean f50404d;

        /* JADX INFO: renamed from: e */
        public boolean f50405e;

        /* JADX INFO: renamed from: f */
        public boolean f50406f;

        /* JADX INFO: renamed from: g */
        public long f50407g;

        public a(InterfaceC9859j interfaceC9859j, C10130a0 c10130a0) {
            this.f50401a = interfaceC9859j;
            this.f50402b = c10130a0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020c  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        long j10;
        long jMo14995d;
        InterfaceC9859j c9860k;
        C10129a.m18993e(this.f50399j);
        C7504e c7504e = (C7504e) interfaceC7508i;
        long j11 = c7504e.f41476c;
        int i10 = 1;
        boolean z10 = j11 != -1;
        long j12 = -9223372036854775807L;
        C9871v c9871v = this.f50393d;
        if (z10 && !c9871v.f50384c) {
            boolean z11 = c9871v.f50386e;
            C10151t c10151t = c9871v.f50383b;
            if (!z11) {
                int iMin = (int) Math.min(20000L, j11);
                long j13 = j11 - ((long) iMin);
                if (c7504e.f41477d != j13) {
                    c7519t.f41516a = j13;
                } else {
                    c10151t.m19121B(iMin);
                    c7504e.f41479f = 0;
                    c7504e.mo14994c(c10151t.f51438a, 0, iMin, false);
                    int i11 = c10151t.f51439b;
                    for (int i12 = c10151t.f51440c - 4; i12 >= i11; i12--) {
                        if (C9871v.m18367b(c10151t.f51438a, i12) == 442) {
                            c10151t.m19124E(i12 + 4);
                            long jM18368c = C9871v.m18368c(c10151t);
                            if (jM18368c != -9223372036854775807L) {
                                j12 = jM18368c;
                                break;
                            }
                        }
                    }
                    c9871v.f50388g = j12;
                    c9871v.f50386e = true;
                    i10 = 0;
                }
            } else {
                if (c9871v.f50388g == -9223372036854775807L) {
                    c9871v.m18369a(c7504e);
                    return 0;
                }
                if (c9871v.f50385d) {
                    long j14 = c9871v.f50387f;
                    if (j14 == -9223372036854775807L) {
                        c9871v.m18369a(c7504e);
                        return 0;
                    }
                    C10130a0 c10130a0 = c9871v.f50382a;
                    long jM19004b = c10130a0.m19004b(c9871v.f50388g) - c10130a0.m19004b(j14);
                    c9871v.f50389h = jM19004b;
                    if (jM19004b < 0) {
                        C10145n.m19099g("PsDurationReader", "Invalid duration: " + c9871v.f50389h + ". Using TIME_UNSET instead.");
                        c9871v.f50389h = -9223372036854775807L;
                    }
                    c9871v.m18369a(c7504e);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, j11);
                long j15 = 0;
                if (c7504e.f41477d != j15) {
                    c7519t.f41516a = j15;
                } else {
                    c10151t.m19121B(iMin2);
                    c7504e.f41479f = 0;
                    c7504e.mo14994c(c10151t.f51438a, 0, iMin2, false);
                    int i13 = c10151t.f51440c;
                    for (int i14 = c10151t.f51439b; i14 < i13 - 3; i14++) {
                        if (C9871v.m18367b(c10151t.f51438a, i14) == 442) {
                            c10151t.m19124E(i14 + 4);
                            long jM18368c2 = C9871v.m18368c(c10151t);
                            if (jM18368c2 != -9223372036854775807L) {
                                j12 = jM18368c2;
                                break;
                            }
                        }
                    }
                    c9871v.f50387f = j12;
                    c9871v.f50385d = true;
                    i10 = 0;
                }
            }
            return i10;
        }
        if (!this.f50400k) {
            this.f50400k = true;
            long j16 = c9871v.f50389h;
            if (j16 != -9223372036854775807L) {
                C9870u c9870u = new C9870u(c9871v.f50382a, j16, j11);
                this.f50398i = c9870u;
                this.f50399j.mo7364c(c9870u.f41438a);
            } else {
                this.f50399j.mo7364c(new InterfaceC7520u.b(j16));
            }
        }
        C9870u c9870u2 = this.f50398i;
        if (c9870u2 != null) {
            if (c9870u2.f41440c != null) {
                return c9870u2.m14980a(c7504e, c7519t);
            }
        }
        c7504e.f41479f = 0;
        if (j11 != -1) {
            jMo14995d = j11 - c7504e.mo14995d();
            j10 = -1;
        } else {
            j10 = -1;
            jMo14995d = -1;
        }
        if (jMo14995d != j10 && jMo14995d < 4) {
            return -1;
        }
        C10151t c10151t2 = this.f50392c;
        if (!c7504e.mo14994c(c10151t2.f51438a, 0, 4, true)) {
            return -1;
        }
        c10151t2.m19124E(0);
        int iM19129d = c10151t2.m19129d();
        if (iM19129d == 441) {
            return -1;
        }
        if (iM19129d == 442) {
            c7504e.mo14994c(c10151t2.f51438a, 0, 10, false);
            c10151t2.m19124E(9);
            c7504e.mo14998j((c10151t2.m19145t() & 7) + 14);
            return 0;
        }
        if (iM19129d == 443) {
            c7504e.mo14994c(c10151t2.f51438a, 0, 2, false);
            c10151t2.m19124E(0);
            c7504e.mo14998j(c10151t2.m19150y() + 6);
            return 0;
        }
        if (((iM19129d & (-256)) >> 8) != 1) {
            c7504e.mo14998j(1);
            return 0;
        }
        int i15 = iM19129d & 255;
        SparseArray<a> sparseArray = this.f50391b;
        a aVar = sparseArray.get(i15);
        if (!this.f50394e) {
            if (aVar == null) {
                InterfaceC9859j interfaceC9859j = null;
                if (i15 == 189) {
                    c9860k = new C9847b(null);
                    this.f50395f = true;
                    this.f50397h = c7504e.f41477d;
                } else if ((i15 & 224) == 192) {
                    c9860k = new C9866q(null);
                    this.f50395f = true;
                    this.f50397h = c7504e.f41477d;
                } else if ((i15 & 240) == 224) {
                    c9860k = new C9860k(null);
                    this.f50396g = true;
                    this.f50397h = c7504e.f41477d;
                } else if (interfaceC9859j != null) {
                    interfaceC9859j.mo18339d(this.f50399j, new InterfaceC9852d0.d(i15, 256));
                    aVar = new a(interfaceC9859j, this.f50390a);
                    sparseArray.put(i15, aVar);
                }
                interfaceC9859j = c9860k;
                if (interfaceC9859j != null) {
                    interfaceC9859j.mo18339d(this.f50399j, new InterfaceC9852d0.d(i15, 256));
                    aVar = new a(interfaceC9859j, this.f50390a);
                    sparseArray.put(i15, aVar);
                }
            }
            if (c7504e.f41477d > ((this.f50395f && this.f50396g) ? this.f50397h + 8192 : 1048576L)) {
                this.f50394e = true;
                this.f50399j.mo7365i();
            }
        }
        c7504e.mo14994c(c10151t2.f51438a, 0, 2, false);
        c10151t2.m19124E(0);
        int iM19150y = c10151t2.m19150y() + 6;
        if (aVar == null) {
            c7504e.mo14998j(iM19150y);
        } else {
            c10151t2.m19121B(iM19150y);
            c7504e.mo14993b(c10151t2.f51438a, 0, iM19150y, false);
            c10151t2.m19124E(6);
            C8739a c8739a = aVar.f50403c;
            c10151t2.m19127b((byte[]) c8739a.f46335d, 0, 3);
            c8739a.m16974k(0);
            c8739a.m16976m(8);
            aVar.f50404d = c8739a.m16969f();
            aVar.f50405e = c8739a.m16969f();
            c8739a.m16976m(6);
            c10151t2.m19127b((byte[]) c8739a.f46335d, 0, c8739a.m16970g(8));
            c8739a.m16974k(0);
            aVar.f50407g = 0L;
            if (aVar.f50404d) {
                c8739a.m16976m(4);
                long jM16970g = ((long) c8739a.m16970g(3)) << 30;
                c8739a.m16976m(1);
                long jM16970g2 = jM16970g | ((long) (c8739a.m16970g(15) << 15));
                c8739a.m16976m(1);
                long jM16970g3 = jM16970g2 | ((long) c8739a.m16970g(15));
                c8739a.m16976m(1);
                boolean z12 = aVar.f50406f;
                C10130a0 c10130a1 = aVar.f50402b;
                if (!z12 && aVar.f50405e) {
                    c8739a.m16976m(4);
                    long jM16970g4 = ((long) c8739a.m16970g(3)) << 30;
                    c8739a.m16976m(1);
                    long jM16970g5 = jM16970g4 | ((long) (c8739a.m16970g(15) << 15));
                    c8739a.m16976m(1);
                    long jM16970g6 = jM16970g5 | ((long) c8739a.m16970g(15));
                    c8739a.m16976m(1);
                    c10130a1.m19004b(jM16970g6);
                    aVar.f50406f = true;
                }
                aVar.f50407g = c10130a1.m19004b(jM16970g3);
            }
            long j17 = aVar.f50407g;
            InterfaceC9859j interfaceC9859j2 = aVar.f50401a;
            interfaceC9859j2.mo18340e(4, j17);
            interfaceC9859j2.mo18336a(c10151t2);
            interfaceC9859j2.mo18338c();
            c10151t2.m19123D(c10151t2.f51438a.length);
        }
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        long j12;
        C10130a0 c10130a0 = this.f50390a;
        synchronized (c10130a0) {
            try {
                j12 = c10130a0.f51350b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = true;
        boolean z11 = j12 == -9223372036854775807L;
        if (!z11) {
            long jM19005c = c10130a0.m19005c();
            if (jM19005c == -9223372036854775807L || jM19005c == 0 || jM19005c == j11) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            c10130a0.m19006d(j11);
        }
        C9870u c9870u = this.f50398i;
        if (c9870u != null) {
            c9870u.m14981c(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f50391b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            a aVarValueAt = sparseArray.valueAt(i10);
            aVarValueAt.f50406f = false;
            aVarValueAt.f50401a.mo18337b();
            i10++;
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f50399j = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        byte[] bArr = new byte[14];
        C7504e c7504e = (C7504e) interfaceC7508i;
        boolean z10 = false;
        c7504e.mo14994c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c7504e.m15001n(bArr[13] & 7, false);
        c7504e.mo14994c(bArr, 0, 3, false);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            z10 = true;
        }
        return z10;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
