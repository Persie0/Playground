package p000;

import android.widget.EdgeEffect;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.C0116v;

/* JADX INFO: loaded from: classes.dex */
public final class ho8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0116v f42716a;

    public ho8(C0116v c0116v) {
        this.f42716a = c0116v;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0204  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x0220  */
    /* JADX WARN: Code duplicated, block: B:111:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x0230  */
    /* JADX WARN: Code duplicated, block: B:116:0x0235  */
    /* JADX WARN: Code duplicated, block: B:118:0x023d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0241  */
    /* JADX WARN: Code duplicated, block: B:121:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x024a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0252  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:145:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:154:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:164:0x0301  */
    /* JADX WARN: Code duplicated, block: B:170:0x0311  */
    /* JADX WARN: Code duplicated, block: B:177:0x032e  */
    /* JADX WARN: Code duplicated, block: B:179:0x033f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0343  */
    /* JADX WARN: Code duplicated, block: B:186:0x0353  */
    /* JADX WARN: Code duplicated, block: B:191:0x035b  */
    /* JADX WARN: Code duplicated, block: B:194:0x035f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146 A[PHI: r8
      0x0146: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:78:0x0174, B:67:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    /* JADX WARN: Code duplicated, block: B:82:0x0192  */
    /* JADX INFO: renamed from: a */
    public final long m13413a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM811g;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM12824e;
        long jM12824e2;
        boolean z;
        boolean zM16408f;
        boolean z2;
        EdgeEffect edgeEffectM16411b;
        float fIntBitsToFloat3;
        ao3 ao3Var;
        float f;
        EdgeEffect edgeEffectM16414e;
        float fIntBitsToFloat4;
        ao3 ao3Var2;
        float f2;
        EdgeEffect edgeEffectM16413d;
        float fIntBitsToFloat5;
        ao3 ao3Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        C0116v c0116v = this.f42716a;
        c0116v.f2369j = i;
        C0077c c0077c = c0116v.f2361b;
        if (c0077c == null || !(c0116v.f2360a.mo975d() || c0116v.f2360a.mo974b())) {
            return c0116v.m931c(c0116v.f2370k, j, i);
        }
        int i5 = c0116v.f2369j;
        kv4 kv4Var = c0116v.f2372m;
        lo2 lo2Var = c0077c.f1740c;
        if (x89.m24408e(c0077c.f1744g)) {
            return ((gq6) kv4Var.invoke(new gq6(j))).f41189a;
        }
        if (!c0077c.f1743f) {
            if (lo2.m16409g(lo2Var.f49926f)) {
                c0077c.m810f(0L);
            }
            if (lo2.m16409g(lo2Var.f49927g)) {
                c0077c.m811g(0L);
            }
            if (lo2.m16409g(lo2Var.f49924d)) {
                c0077c.m812h(0L);
            }
            if (lo2.m16409g(lo2Var.f49925e)) {
                c0077c.m809e(0L);
            }
            c0077c.f1743f = true;
        }
        int i6 = AbstractC3113ij.f44172a;
        float f4 = i5 == 2 ? 4.0f : 1.0f;
        long jM12826g = gq6.m12826g(f4, j);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!lo2.m16409g(lo2Var.f49924d) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (lo2.m16409g(lo2Var.f49925e) && Float.intBitsToFloat(i7) > 0.0f) {
                    float fM809e = c0077c.m809e(jM12826g);
                    if (!lo2.m16409g(lo2Var.f49925e)) {
                        lo2Var.m16411b().finish();
                    }
                    fIntBitsToFloat = fM809e == Float.intBitsToFloat((int) (jM12826g & 4294967295L)) ? Float.intBitsToFloat(i7) : fM809e / f4;
                }
            } else {
                float fM812h = c0077c.m812h(jM12826g);
                j2 = 4294967295L;
                if (!lo2.m16409g(lo2Var.f49924d)) {
                    lo2Var.m16414e().finish();
                }
                fIntBitsToFloat = fM812h == Float.intBitsToFloat((int) (jM12826g & 4294967295L)) ? Float.intBitsToFloat(i7) : fM812h / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!lo2.m16409g(lo2Var.f49926f) && Float.intBitsToFloat(i2) < 0.0f) {
                fM811g = c0077c.m810f(jM12826g);
                if (!lo2.m16409g(lo2Var.f49926f)) {
                    lo2Var.m16412c().finish();
                }
                if (fM811g == Float.intBitsToFloat((int) (jM12826g >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM811g / f4;
                }
            } else if (lo2.m16409g(lo2Var.f49927g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fM811g = c0077c.m811g(jM12826g);
                if (!lo2.m16409g(lo2Var.f49927g)) {
                    lo2Var.m16413d().finish();
                }
                if (fM811g == Float.intBitsToFloat((int) (jM12826g >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM811g / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!gq6.m12821b(jFloatToRawIntBits, 0L)) {
                c0077c.m808d();
            }
            jM12824e = gq6.m12824e(j, jFloatToRawIntBits);
            long j3 = ((gq6) kv4Var.invoke(new gq6(jM12824e))).f41189a;
            jM12824e2 = gq6.m12824e(jM12824e, j3);
            if ((Float.intBitsToFloat((int) (jM12824e >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM12824e & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (lo2.m16409g(lo2Var.f49926f) || lo2.m16409g(lo2Var.f49924d) || lo2.m16409g(lo2Var.f49927g) || lo2.m16409g(lo2Var.f49925e)))) {
                c0077c.m805a();
            }
            if (i5 == 1) {
                i3 = (int) (jM12824e2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    c0077c.m810f(jM12824e2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        c0077c.m811g(jM12824e2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jM12824e2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        c0077c.m812h(jM12824e2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            c0077c.m809e(jM12824e2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jM12824e2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    c0077c.m812h(jM12824e2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        c0077c.m809e(jM12824e2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!gq6.m12821b(jM12824e, 0L)) {
                if (lo2.m16408f(lo2Var.f49926f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM16408f = false;
                } else {
                    EdgeEffect edgeEffectM16412c = lo2Var.m16412c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectM16412c instanceof ao3) {
                        ao3 ao3Var4 = (ao3) edgeEffectM16412c;
                        float f5 = ao3Var4.f7289b + fIntBitsToFloat6;
                        ao3Var4.f7289b = f5;
                        if (Math.abs(f5) > ao3Var4.f7288a) {
                            ao3Var4.onRelease();
                        }
                    } else {
                        edgeEffectM16412c.onRelease();
                    }
                    zM16408f = lo2.m16408f(lo2Var.f49926f);
                }
                if (lo2.m16408f(lo2Var.f49927g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectM16413d = lo2Var.m16413d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectM16413d instanceof ao3) {
                        ao3Var3 = (ao3) edgeEffectM16413d;
                        f3 = ao3Var3.f7289b + fIntBitsToFloat5;
                        ao3Var3.f7289b = f3;
                        if (Math.abs(f3) > ao3Var3.f7288a) {
                            ao3Var3.onRelease();
                        }
                    } else {
                        edgeEffectM16413d.onRelease();
                    }
                    if (!zM16408f || lo2.m16408f(lo2Var.f49927g)) {
                        zM16408f = true;
                    } else {
                        zM16408f = false;
                    }
                }
                if (lo2.m16408f(lo2Var.f49924d) && Float.intBitsToFloat(i7) < 0.0f) {
                    edgeEffectM16414e = lo2Var.m16414e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectM16414e instanceof ao3) {
                        ao3Var2 = (ao3) edgeEffectM16414e;
                        f2 = ao3Var2.f7289b + fIntBitsToFloat4;
                        ao3Var2.f7289b = f2;
                        if (Math.abs(f2) > ao3Var2.f7288a) {
                            ao3Var2.onRelease();
                        }
                    } else {
                        edgeEffectM16414e.onRelease();
                    }
                    if (!zM16408f || lo2.m16408f(lo2Var.f49924d)) {
                        zM16408f = true;
                    } else {
                        zM16408f = false;
                    }
                }
                if (lo2.m16408f(lo2Var.f49925e) && Float.intBitsToFloat(i7) > 0.0f) {
                    edgeEffectM16411b = lo2Var.m16411b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectM16411b instanceof ao3) {
                        ao3Var = (ao3) edgeEffectM16411b;
                        f = ao3Var.f7289b + fIntBitsToFloat3;
                        ao3Var.f7289b = f;
                        if (Math.abs(f) > ao3Var.f7288a) {
                            ao3Var.onRelease();
                        }
                    } else {
                        edgeEffectM16411b.onRelease();
                    }
                    if (!zM16408f || lo2.m16408f(lo2Var.f49925e)) {
                        zM16408f = true;
                    } else {
                        zM16408f = false;
                    }
                }
                if (!zM16408f || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                c0077c.m808d();
            }
            return gq6.m12825f(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!lo2.m16409g(lo2Var.f49926f)) {
            if (lo2.m16409g(lo2Var.f49927g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (lo2.m16409g(lo2Var.f49927g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!gq6.m12821b(jFloatToRawIntBits, 0L)) {
            c0077c.m808d();
        }
        jM12824e = gq6.m12824e(j, jFloatToRawIntBits);
        long j4 = ((gq6) kv4Var.invoke(new gq6(jM12824e))).f41189a;
        jM12824e2 = gq6.m12824e(jM12824e, j4);
        if (Float.intBitsToFloat((int) (jM12824e >> 32)) == 0.0f) {
            c0077c.m805a();
        } else {
            c0077c.m805a();
        }
        if (i5 == 1) {
            i3 = (int) (jM12824e2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                c0077c.m810f(jM12824e2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    c0077c.m811g(jM12824e2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jM12824e2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    c0077c.m812h(jM12824e2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        c0077c.m809e(jM12824e2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jM12824e2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                c0077c.m812h(jM12824e2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    c0077c.m809e(jM12824e2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!gq6.m12821b(jM12824e, 0L)) {
            if (lo2.m16408f(lo2Var.f49926f)) {
                zM16408f = false;
            } else {
                zM16408f = false;
            }
            if (lo2.m16408f(lo2Var.f49927g)) {
                edgeEffectM16413d = lo2Var.m16413d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectM16413d instanceof ao3) {
                    ao3Var3 = (ao3) edgeEffectM16413d;
                    f3 = ao3Var3.f7289b + fIntBitsToFloat5;
                    ao3Var3.f7289b = f3;
                    if (Math.abs(f3) > ao3Var3.f7288a) {
                        ao3Var3.onRelease();
                    }
                } else {
                    edgeEffectM16413d.onRelease();
                }
                if (zM16408f) {
                    zM16408f = true;
                } else {
                    zM16408f = true;
                }
            }
            if (lo2.m16408f(lo2Var.f49924d)) {
                edgeEffectM16414e = lo2Var.m16414e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                if (edgeEffectM16414e instanceof ao3) {
                    ao3Var2 = (ao3) edgeEffectM16414e;
                    f2 = ao3Var2.f7289b + fIntBitsToFloat4;
                    ao3Var2.f7289b = f2;
                    if (Math.abs(f2) > ao3Var2.f7288a) {
                        ao3Var2.onRelease();
                    }
                } else {
                    edgeEffectM16414e.onRelease();
                }
                if (zM16408f) {
                    zM16408f = true;
                } else {
                    zM16408f = true;
                }
            }
            if (lo2.m16408f(lo2Var.f49925e)) {
                edgeEffectM16411b = lo2Var.m16411b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (edgeEffectM16411b instanceof ao3) {
                    ao3Var = (ao3) edgeEffectM16411b;
                    f = ao3Var.f7289b + fIntBitsToFloat3;
                    ao3Var.f7289b = f;
                    if (Math.abs(f) > ao3Var.f7288a) {
                        ao3Var.onRelease();
                    }
                } else {
                    edgeEffectM16411b.onRelease();
                }
                if (zM16408f) {
                    zM16408f = true;
                } else {
                    zM16408f = true;
                }
            }
            if (zM16408f) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            c0077c.m808d();
        }
        return gq6.m12825f(jFloatToRawIntBits, j4);
    }
}
