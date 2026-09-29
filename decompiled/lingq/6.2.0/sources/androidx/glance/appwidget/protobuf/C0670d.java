package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import p000.f73;
import p000.hk5;
import p000.jf0;
import p000.n41;
import p000.n94;
import p000.q94;
import p000.qx2;
import p000.v74;
import p000.vi2;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0670d {

    /* JADX INFO: renamed from: a */
    public final n41 f6062a;

    /* JADX INFO: renamed from: b */
    public int f6063b;

    /* JADX INFO: renamed from: c */
    public int f6064c;

    /* JADX INFO: renamed from: d */
    public int f6065d = 0;

    public C0670d(n41 n41Var) {
        Charset charset = q94.f57449a;
        this.f6062a = n41Var;
        n41Var.f52311b = this;
    }

    /* JADX INFO: renamed from: w */
    public static void m2320w(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m2272f();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m2321x(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m2272f();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2322a() {
        int i = this.f6065d;
        if (i != 0) {
            this.f6063b = i;
            this.f6065d = 0;
        } else {
            this.f6063b = this.f6062a.mo2279A();
        }
        int i2 = this.f6063b;
        if (i2 == 0 || i2 == this.f6064c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m2323b(Object obj, ym8 ym8Var, qx2 qx2Var) {
        int i = this.f6064c;
        this.f6064c = ((this.f6063b >>> 3) << 3) | 4;
        try {
            ym8Var.mo2417c(obj, this, qx2Var);
            if (this.f6063b != this.f6064c) {
                throw InvalidProtocolBufferException.m2272f();
            }
            this.f6064c = i;
        } catch (Throwable th) {
            this.f6064c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2324c(Object obj, ym8 ym8Var, qx2 qx2Var) {
        n41 n41Var = this.f6062a;
        int iMo2280B = n41Var.mo2280B();
        if (n41Var.f52310a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo2292k = n41Var.mo2292k(iMo2280B);
        n41Var.f52310a++;
        ym8Var.mo2417c(obj, this, qx2Var);
        n41Var.mo2288b(0);
        n41Var.f52310a--;
        n41Var.mo2291i(iMo2292k);
    }

    /* JADX INFO: renamed from: d */
    public final void m2325d(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof jf0;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Boolean.valueOf(n41Var.mo2293l()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Boolean.valueOf(n41Var.mo2293l()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        jf0 jf0Var = (jf0) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                jf0Var.addBoolean(n41Var.mo2293l());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            jf0Var.addBoolean(n41Var.mo2293l());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: e */
    public final ByteString m2326e() {
        m2343v(2);
        return this.f6062a.mo2294m();
    }

    /* JADX INFO: renamed from: f */
    public final void m2327f(n94 n94Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo2279A;
        if ((this.f6063b & 7) != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            n94Var.add(m2326e());
            n41 n41Var = this.f6062a;
            if (n41Var.mo2290g()) {
                return;
            } else {
                iMo2279A = n41Var.mo2279A();
            }
        } while (iMo2279A == this.f6063b);
        this.f6065d = iMo2279A;
    }

    /* JADX INFO: renamed from: g */
    public final void m2328g(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof vi2;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    n94Var.add(Double.valueOf(n41Var.mo2295n()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2280B = n41Var.mo2280B();
            m2321x(iMo2280B);
            int iMo2289f = n41Var.mo2289f() + iMo2280B;
            do {
                n94Var.add(Double.valueOf(n41Var.mo2295n()));
            } while (n41Var.mo2289f() < iMo2289f);
            return;
        }
        vi2 vi2Var = (vi2) n94Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                vi2Var.addDouble(n41Var.mo2295n());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2280B2 = n41Var.mo2280B();
        m2321x(iMo2280B2);
        int iMo2289f2 = n41Var.mo2289f() + iMo2280B2;
        do {
            vi2Var.addDouble(n41Var.mo2295n());
        } while (n41Var.mo2289f() < iMo2289f2);
    }

    /* JADX INFO: renamed from: h */
    public final void m2329h(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof v74;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Integer.valueOf(n41Var.mo2296o()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Integer.valueOf(n41Var.mo2296o()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        v74 v74Var = (v74) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                v74Var.addInt(n41Var.mo2296o());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            v74Var.addInt(n41Var.mo2296o());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: i */
    public final void m2330i(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof v74;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo2280B = n41Var.mo2280B();
                m2320w(iMo2280B);
                int iMo2289f = n41Var.mo2289f() + iMo2280B;
                do {
                    n94Var.add(Integer.valueOf(n41Var.mo2297p()));
                } while (n41Var.mo2289f() < iMo2289f);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m2269c();
            }
            do {
                n94Var.add(Integer.valueOf(n41Var.mo2297p()));
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A = n41Var.mo2279A();
                }
            } while (iMo2279A == this.f6063b);
            this.f6065d = iMo2279A;
            return;
        }
        v74 v74Var = (v74) n94Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo2280B2 = n41Var.mo2280B();
            m2320w(iMo2280B2);
            int iMo2289f2 = n41Var.mo2289f() + iMo2280B2;
            do {
                v74Var.addInt(n41Var.mo2297p());
            } while (n41Var.mo2289f() < iMo2289f2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            v74Var.addInt(n41Var.mo2297p());
            if (n41Var.mo2290g()) {
                return;
            } else {
                iMo2279A2 = n41Var.mo2279A();
            }
        } while (iMo2279A2 == this.f6063b);
        this.f6065d = iMo2279A2;
    }

    /* JADX INFO: renamed from: j */
    public final void m2331j(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof hk5;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    n94Var.add(Long.valueOf(n41Var.mo2298q()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2280B = n41Var.mo2280B();
            m2321x(iMo2280B);
            int iMo2289f = n41Var.mo2289f() + iMo2280B;
            do {
                n94Var.add(Long.valueOf(n41Var.mo2298q()));
            } while (n41Var.mo2289f() < iMo2289f);
            return;
        }
        hk5 hk5Var = (hk5) n94Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                hk5Var.addLong(n41Var.mo2298q());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2280B2 = n41Var.mo2280B();
        m2321x(iMo2280B2);
        int iMo2289f2 = n41Var.mo2289f() + iMo2280B2;
        do {
            hk5Var.addLong(n41Var.mo2298q());
        } while (n41Var.mo2289f() < iMo2289f2);
    }

    /* JADX INFO: renamed from: k */
    public final void m2332k(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof f73;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo2280B = n41Var.mo2280B();
                m2320w(iMo2280B);
                int iMo2289f = n41Var.mo2289f() + iMo2280B;
                do {
                    n94Var.add(Float.valueOf(n41Var.mo2299r()));
                } while (n41Var.mo2289f() < iMo2289f);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m2269c();
            }
            do {
                n94Var.add(Float.valueOf(n41Var.mo2299r()));
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A = n41Var.mo2279A();
                }
            } while (iMo2279A == this.f6063b);
            this.f6065d = iMo2279A;
            return;
        }
        f73 f73Var = (f73) n94Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo2280B2 = n41Var.mo2280B();
            m2320w(iMo2280B2);
            int iMo2289f2 = n41Var.mo2289f() + iMo2280B2;
            do {
                f73Var.addFloat(n41Var.mo2299r());
            } while (n41Var.mo2289f() < iMo2289f2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            f73Var.addFloat(n41Var.mo2299r());
            if (n41Var.mo2290g()) {
                return;
            } else {
                iMo2279A2 = n41Var.mo2279A();
            }
        } while (iMo2279A2 == this.f6063b);
        this.f6065d = iMo2279A2;
    }

    /* JADX INFO: renamed from: l */
    public final void m2333l(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof v74;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Integer.valueOf(n41Var.mo2300s()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Integer.valueOf(n41Var.mo2300s()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        v74 v74Var = (v74) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                v74Var.addInt(n41Var.mo2300s());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            v74Var.addInt(n41Var.mo2300s());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: m */
    public final void m2334m(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof hk5;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Long.valueOf(n41Var.mo2301t()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Long.valueOf(n41Var.mo2301t()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        hk5 hk5Var = (hk5) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                hk5Var.addLong(n41Var.mo2301t());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            hk5Var.addLong(n41Var.mo2301t());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: n */
    public final void m2335n(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof v74;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo2280B = n41Var.mo2280B();
                m2320w(iMo2280B);
                int iMo2289f = n41Var.mo2289f() + iMo2280B;
                do {
                    n94Var.add(Integer.valueOf(n41Var.mo2302u()));
                } while (n41Var.mo2289f() < iMo2289f);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m2269c();
            }
            do {
                n94Var.add(Integer.valueOf(n41Var.mo2302u()));
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A = n41Var.mo2279A();
                }
            } while (iMo2279A == this.f6063b);
            this.f6065d = iMo2279A;
            return;
        }
        v74 v74Var = (v74) n94Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo2280B2 = n41Var.mo2280B();
            m2320w(iMo2280B2);
            int iMo2289f2 = n41Var.mo2289f() + iMo2280B2;
            do {
                v74Var.addInt(n41Var.mo2302u());
            } while (n41Var.mo2289f() < iMo2289f2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            v74Var.addInt(n41Var.mo2302u());
            if (n41Var.mo2290g()) {
                return;
            } else {
                iMo2279A2 = n41Var.mo2279A();
            }
        } while (iMo2279A2 == this.f6063b);
        this.f6065d = iMo2279A2;
    }

    /* JADX INFO: renamed from: o */
    public final void m2336o(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof hk5;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    n94Var.add(Long.valueOf(n41Var.mo2303v()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2280B = n41Var.mo2280B();
            m2321x(iMo2280B);
            int iMo2289f = n41Var.mo2289f() + iMo2280B;
            do {
                n94Var.add(Long.valueOf(n41Var.mo2303v()));
            } while (n41Var.mo2289f() < iMo2289f);
            return;
        }
        hk5 hk5Var = (hk5) n94Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                hk5Var.addLong(n41Var.mo2303v());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2280B2 = n41Var.mo2280B();
        m2321x(iMo2280B2);
        int iMo2289f2 = n41Var.mo2289f() + iMo2280B2;
        do {
            hk5Var.addLong(n41Var.mo2303v());
        } while (n41Var.mo2289f() < iMo2289f2);
    }

    /* JADX INFO: renamed from: p */
    public final void m2337p(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof v74;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Integer.valueOf(n41Var.mo2304w()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Integer.valueOf(n41Var.mo2304w()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        v74 v74Var = (v74) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                v74Var.addInt(n41Var.mo2304w());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            v74Var.addInt(n41Var.mo2304w());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: q */
    public final void m2338q(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof hk5;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Long.valueOf(n41Var.mo2305x()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Long.valueOf(n41Var.mo2305x()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        hk5 hk5Var = (hk5) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                hk5Var.addLong(n41Var.mo2305x());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            hk5Var.addLong(n41Var.mo2305x());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: r */
    public final void m2339r(n94 n94Var, boolean z) {
        String strMo2306y;
        int iMo2279A;
        if ((this.f6063b & 7) != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        do {
            n41 n41Var = this.f6062a;
            if (z) {
                m2343v(2);
                strMo2306y = n41Var.mo2307z();
            } else {
                m2343v(2);
                strMo2306y = n41Var.mo2306y();
            }
            n94Var.add(strMo2306y);
            if (n41Var.mo2290g()) {
                return;
            } else {
                iMo2279A = n41Var.mo2279A();
            }
        } while (iMo2279A == this.f6063b);
        this.f6065d = iMo2279A;
    }

    /* JADX INFO: renamed from: s */
    public final void m2340s(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof v74;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Integer.valueOf(n41Var.mo2280B()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Integer.valueOf(n41Var.mo2280B()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        v74 v74Var = (v74) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                v74Var.addInt(n41Var.mo2280B());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            v74Var.addInt(n41Var.mo2280B());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: t */
    public final void m2341t(n94 n94Var) throws InvalidProtocolBufferException {
        int iMo2279A;
        int iMo2279A2;
        boolean z = n94Var instanceof hk5;
        int i = this.f6063b;
        n41 n41Var = this.f6062a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    n94Var.add(Long.valueOf(n41Var.mo2281C()));
                    if (n41Var.mo2290g()) {
                        return;
                    } else {
                        iMo2279A = n41Var.mo2279A();
                    }
                } while (iMo2279A == this.f6063b);
                this.f6065d = iMo2279A;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m2269c();
            }
            int iMo2289f = n41Var.mo2289f() + n41Var.mo2280B();
            do {
                n94Var.add(Long.valueOf(n41Var.mo2281C()));
            } while (n41Var.mo2289f() < iMo2289f);
            m2342u(iMo2289f);
            return;
        }
        hk5 hk5Var = (hk5) n94Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                hk5Var.addLong(n41Var.mo2281C());
                if (n41Var.mo2290g()) {
                    return;
                } else {
                    iMo2279A2 = n41Var.mo2279A();
                }
            } while (iMo2279A2 == this.f6063b);
            this.f6065d = iMo2279A2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m2269c();
        }
        int iMo2289f2 = n41Var.mo2289f() + n41Var.mo2280B();
        do {
            hk5Var.addLong(n41Var.mo2281C());
        } while (n41Var.mo2289f() < iMo2289f2);
        m2342u(iMo2289f2);
    }

    /* JADX INFO: renamed from: u */
    public final void m2342u(int i) throws InvalidProtocolBufferException {
        if (this.f6062a.mo2289f() != i) {
            throw InvalidProtocolBufferException.m2273g();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2343v(int i) {
        if ((this.f6063b & 7) != i) {
            throw InvalidProtocolBufferException.m2269c();
        }
    }
}
