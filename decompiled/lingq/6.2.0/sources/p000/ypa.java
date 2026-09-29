package p000;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class ypa {

    /* JADX INFO: renamed from: a */
    public final fu5 f70263a;

    /* JADX INFO: renamed from: b */
    public final dqa f70264b;

    /* JADX INFO: renamed from: c */
    public final long f70265c;

    /* JADX INFO: renamed from: d */
    public boolean f70266d;

    /* JADX INFO: renamed from: g */
    public long f70269g;

    /* JADX INFO: renamed from: j */
    public boolean f70272j;

    /* JADX INFO: renamed from: m */
    public boolean f70275m;

    /* JADX INFO: renamed from: n */
    public boolean f70276n;

    /* JADX INFO: renamed from: e */
    public int f70267e = 0;

    /* JADX INFO: renamed from: f */
    public long f70268f = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f70270h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f70271i = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public float f70273k = 1.0f;

    /* JADX INFO: renamed from: l */
    public mp9 f70274l = mp9.f51705a;

    /* JADX INFO: renamed from: o */
    public final boolean f70277o = true;

    public ypa(Context context, fu5 fu5Var, long j) {
        this.f70263a = fu5Var;
        this.f70265c = j;
        this.f70264b = new dqa(context);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x0208  */
    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:116:0x020e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0220  */
    /* JADX WARN: Code duplicated, block: B:120:0x0224  */
    /* JADX WARN: Code duplicated, block: B:152:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final int m25262a(long j, long j2, long j3, long j4, boolean z, boolean z2, at2 at2Var) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        long jNanoTime;
        dqa dqaVar;
        long j8;
        int i3;
        int i4;
        aqa aqaVar;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z4;
        long j14;
        float f;
        float f2;
        long j15;
        c63 c63Var;
        long j16;
        b63 b63Var;
        long j17;
        at2Var.f7454a = -9223372036854775807L;
        at2Var.f7455b = -9223372036854775807L;
        if (this.f70266d && this.f70268f == -9223372036854775807L) {
            this.f70268f = j2;
        }
        if (this.f70270h != j) {
            dqa dqaVar2 = this.f70264b;
            j5 = -9223372036854775807L;
            long j18 = dqaVar2.f36054n;
            if (j18 != -1) {
                dqaVar2.f36057q = j18;
                dqaVar2.f36058r = dqaVar2.f36055o;
                dqaVar2.f36059s = dqaVar2.f36056p;
                dqaVar2.f36051k = dqaVar2.f36052l;
            }
            dqaVar2.f36053m++;
            c63 c63Var2 = dqaVar2.f36041a;
            j6 = 1000;
            long j19 = j * 1000;
            c63Var2.f9625a.m3346b(j19);
            if (c63Var2.f9625a.m3345a()) {
                c63Var2.f9627c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (c63Var2.f9628d != -9223372036854775807L) {
                    if (c63Var2.f9627c) {
                        b63 b63Var2 = c63Var2.f9626b;
                        long j20 = b63Var2.f7997d;
                        if (j20 == 0 ? false : b63Var2.f8000g[(int) ((j20 - 1) % 15)]) {
                            c63Var2.f9626b.m3347c();
                            c63Var2.f9626b.m3346b(c63Var2.f9628d);
                        }
                    } else {
                        c63Var2.f9626b.m3347c();
                        c63Var2.f9626b.m3346b(c63Var2.f9628d);
                    }
                    c63Var2.f9627c = true;
                    c63Var2.f9626b.m3346b(j19);
                }
            }
            if (c63Var2.f9627c && c63Var2.f9626b.m3345a()) {
                b63 b63Var3 = c63Var2.f9625a;
                c63Var2.f9625a = c63Var2.f9626b;
                c63Var2.f9626b = b63Var3;
                c63Var2.f9627c = false;
            }
            c63Var2.f9628d = j19;
            c63Var2.f9629e = c63Var2.f9625a.m3345a() ? 0 : c63Var2.f9629e + 1;
            dqaVar2.m10591c();
            this.f70270h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long jM22797B = (long) ((j - j2) / ((double) this.f70273k));
        if (this.f70266d) {
            this.f70274l.getClass();
            jM22797B -= uma.m22797B(SystemClock.elapsedRealtime()) - j3;
        }
        at2Var.f7454a = jM22797B;
        if (!z || z2) {
            if (this.f70275m || !this.f70277o) {
                if (!this.f70277o) {
                    this.f70276n = true;
                }
                long j21 = -30000;
                if (this.f70271i == j5 || this.f70272j) {
                    int i5 = this.f70267e;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i5 == 2) {
                            i = 3;
                            i2 = 5;
                            if (j2 >= j4) {
                            }
                        } else {
                            if (i5 != 3) {
                                uk9.m22770c();
                                return 0;
                            }
                            this.f70274l.getClass();
                            i = 3;
                            i2 = 5;
                            long jM22797B2 = uma.m22797B(SystemClock.elapsedRealtime()) - this.f70269g;
                            if (this.f70266d) {
                                long j22 = this.f70268f;
                                if (j22 == j5 || j22 == j2 || jM22797B >= -30000 || jM22797B2 <= 100000) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.f70266d;
                    }
                    if (z3) {
                        return 0;
                    }
                    if (this.f70266d && j2 != this.f70268f) {
                        this.f70274l.getClass();
                        jNanoTime = System.nanoTime();
                        dqaVar = this.f70264b;
                        j8 = (at2Var.f7454a * j6) + jNanoTime;
                        if (dqaVar.f36057q != -1) {
                            if (dqaVar.f36041a.f9625a.m3345a()) {
                                c63Var = dqaVar.f36041a;
                                if (c63Var.f9625a.m3345a()) {
                                    b63Var = c63Var.f9625a;
                                    i4 = 2;
                                    j17 = b63Var.f7998e;
                                    i3 = 1;
                                    if (j17 == j7) {
                                        j16 = j7;
                                    } else {
                                        j16 = b63Var.f7999f / j17;
                                    }
                                } else {
                                    i3 = 1;
                                    i4 = 2;
                                    j16 = j5;
                                }
                                f = (dqaVar.f36053m - dqaVar.f36057q) * j16;
                                f2 = dqaVar.f36049i;
                            } else {
                                i3 = 1;
                                i4 = 2;
                                f = (j - dqaVar.f36059s) * j6;
                                f2 = dqaVar.f36049i;
                            }
                            j15 = dqaVar.f36058r + ((long) (f / f2));
                            if (Math.abs(j8 - j15) <= 20000000) {
                                j8 = j15;
                            } else {
                                dqaVar.m10590b();
                            }
                        } else {
                            i3 = 1;
                            i4 = 2;
                            j21 = -30000;
                        }
                        dqaVar.f36054n = dqaVar.f36053m;
                        dqaVar.f36055o = j8;
                        dqaVar.f36056p = j;
                        aqaVar = dqaVar.f36043c;
                        if (aqaVar == null) {
                            j12 = jNanoTime;
                        } else {
                            j9 = aqaVar.f7372c;
                            long j23 = dqaVar.f36043c.f7373d;
                            if (j9 != j5 || j23 == j5) {
                                j12 = jNanoTime;
                            } else {
                                long j24 = (((j8 - j9) / j23) * j23) + j9;
                                if (j8 <= j24) {
                                    j10 = j24 - j23;
                                } else {
                                    j24 += j23;
                                    j10 = j24;
                                }
                                long j25 = j24 - j8;
                                long j26 = j8 - j10;
                                long jAbs = Math.abs(j25 - j26);
                                if (jAbs < j23 / 2) {
                                    j11 = j10;
                                    long j27 = j23 / 4;
                                    if (jAbs < j27) {
                                        j12 = jNanoTime;
                                        long j28 = dqaVar.f36051k;
                                        if (j28 != j7) {
                                            dqaVar.f36052l = j28;
                                        } else {
                                            if (j25 < j26) {
                                                j27 = -j27;
                                            }
                                            dqaVar.f36052l = j27;
                                        }
                                    } else {
                                        j12 = jNanoTime;
                                        dqaVar.f36052l = j7;
                                    }
                                } else {
                                    j11 = j10;
                                    j12 = jNanoTime;
                                    dqaVar.f36052l = dqaVar.f36051k;
                                }
                                if (j25 + dqaVar.f36052l >= j26) {
                                    j24 = j11;
                                }
                                j8 = j24 - ((j23 * 80) / 100);
                            }
                        }
                        at2Var.f7455b = j8;
                        j13 = (j8 - j12) / j6;
                        at2Var.f7454a = j13;
                        if (this.f70271i != j5 || this.f70272j) {
                            z4 = 0;
                        } else {
                            z4 = i3;
                        }
                        if (this.f70263a.m12169P0(j13, j2, z2, z4)) {
                            return 4;
                        }
                        j14 = at2Var.f7454a;
                        if (j14 >= j21 && !z2) {
                            return z4 != 0 ? i : i4;
                        }
                        if (j14 > 50000) {
                            return i3;
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (z3) {
                    return 0;
                }
                if (this.f70266d) {
                    this.f70274l.getClass();
                    jNanoTime = System.nanoTime();
                    dqaVar = this.f70264b;
                    j8 = (at2Var.f7454a * j6) + jNanoTime;
                    if (dqaVar.f36057q != -1) {
                        if (dqaVar.f36041a.f9625a.m3345a()) {
                            c63Var = dqaVar.f36041a;
                            if (c63Var.f9625a.m3345a()) {
                                b63Var = c63Var.f9625a;
                                i4 = 2;
                                j17 = b63Var.f7998e;
                                i3 = 1;
                                if (j17 == j7) {
                                    j16 = j7;
                                } else {
                                    j16 = b63Var.f7999f / j17;
                                }
                            } else {
                                i3 = 1;
                                i4 = 2;
                                j16 = j5;
                            }
                            f = (dqaVar.f36053m - dqaVar.f36057q) * j16;
                            f2 = dqaVar.f36049i;
                        } else {
                            i3 = 1;
                            i4 = 2;
                            f = (j - dqaVar.f36059s) * j6;
                            f2 = dqaVar.f36049i;
                        }
                        j15 = dqaVar.f36058r + ((long) (f / f2));
                        if (Math.abs(j8 - j15) <= 20000000) {
                            j8 = j15;
                        } else {
                            dqaVar.m10590b();
                        }
                    } else {
                        i3 = 1;
                        i4 = 2;
                        j21 = -30000;
                    }
                    dqaVar.f36054n = dqaVar.f36053m;
                    dqaVar.f36055o = j8;
                    dqaVar.f36056p = j;
                    aqaVar = dqaVar.f36043c;
                    if (aqaVar == null) {
                        j12 = jNanoTime;
                    } else {
                        j9 = aqaVar.f7372c;
                        long j29 = dqaVar.f36043c.f7373d;
                        if (j9 != j5) {
                            j12 = jNanoTime;
                        } else {
                            j12 = jNanoTime;
                        }
                    }
                    at2Var.f7455b = j8;
                    j13 = (j8 - j12) / j6;
                    at2Var.f7454a = j13;
                    if (this.f70271i != j5) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    if (this.f70263a.m12169P0(j13, j2, z2, z4)) {
                        return 4;
                    }
                    j14 = at2Var.f7454a;
                    if (j14 >= j21) {
                    }
                    if (j14 > 50000) {
                        return i3;
                    }
                }
                return i2;
            }
            if (this.f70263a.m12169P0(jM22797B, j2, z2, true)) {
                return 4;
            }
            if (!this.f70266d || at2Var.f7454a >= 30000) {
                this.f70276n = true;
                return 5;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25263b(boolean z) {
        if (z && (this.f70267e == 3 || (this.f70276n && (!this.f70275m || !this.f70277o)))) {
            this.f70271i = -9223372036854775807L;
            return true;
        }
        if (this.f70271i == -9223372036854775807L) {
            return false;
        }
        this.f70274l.getClass();
        if (SystemClock.elapsedRealtime() < this.f70271i) {
            return true;
        }
        this.f70271i = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m25264c(boolean z) {
        long jElapsedRealtime;
        this.f70272j = z;
        long j = this.f70265c;
        if (j > 0) {
            this.f70274l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f70271i = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: d */
    public final void m25265d() {
        this.f70266d = true;
        this.f70274l.getClass();
        this.f70269g = uma.m22797B(SystemClock.elapsedRealtime());
        dqa dqaVar = this.f70264b;
        dqaVar.f36044d = true;
        dqaVar.m10590b();
        aqa aqaVarM2992a = aqa.m2992a(dqaVar.f36042b);
        dqaVar.f36043c = aqaVarM2992a;
        if (aqaVarM2992a != null) {
            aqaVarM2992a.mo2993b();
        }
        dqaVar.m10592d(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m25266e(int i) {
        if (i == 0) {
            this.f70267e = 1;
        } else if (i == 1) {
            this.f70267e = 0;
        } else {
            if (i != 2) {
                uk9.m22770c();
                return;
            }
            this.f70267e = Math.min(this.f70267e, 2);
        }
        this.f70264b.m10590b();
    }

    /* JADX INFO: renamed from: f */
    public final void m25267f(float f) {
        dqa dqaVar = this.f70264b;
        dqaVar.f36046f = f;
        c63 c63Var = dqaVar.f36041a;
        c63Var.f9625a.m3347c();
        c63Var.f9626b.m3347c();
        c63Var.f9627c = false;
        c63Var.f9628d = -9223372036854775807L;
        c63Var.f9629e = 0;
        dqaVar.m10591c();
    }

    /* JADX INFO: renamed from: g */
    public final void m25268g(Surface surface) {
        this.f70275m = surface != null;
        this.f70276n = false;
        dqa dqaVar = this.f70264b;
        if (dqaVar.f36045e != surface) {
            dqaVar.m10589a();
            dqaVar.f36045e = surface;
            dqaVar.m10592d(true);
        }
        this.f70267e = Math.min(this.f70267e, 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m25269h(float f) {
        bna.m3969q(f > 0.0f);
        if (f == this.f70273k) {
            return;
        }
        this.f70273k = f;
        dqa dqaVar = this.f70264b;
        dqaVar.f36049i = f;
        dqaVar.m10592d(false);
    }
}
