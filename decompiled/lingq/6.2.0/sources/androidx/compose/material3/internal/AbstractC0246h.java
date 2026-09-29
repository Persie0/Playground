package androidx.compose.material3.internal;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.foundation.interaction.AbstractC0122a;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.internal.AbstractC0246h;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.C3794yf;
import p000.InterfaceC3457pe;
import p000.a97;
import p000.aa1;
import p000.aj3;
import p000.aw9;
import p000.ax9;
import p000.b16;
import p000.baa;
import p000.bb0;
import p000.bc3;
import p000.bna;
import p000.ci8;
import p000.cv9;
import p000.d32;
import p000.dh9;
import p000.dr2;
import p000.e16;
import p000.eg5;
import p000.eu9;
import p000.faa;
import p000.fb2;
import p000.g97;
import p000.gm5;
import p000.hc5;
import p000.he9;
import p000.ht5;
import p000.i39;
import p000.ib9;
import p000.ie9;
import p000.j37;
import p000.jc9;
import p000.jd0;
import p000.jda;
import p000.k37;
import p000.kaa;
import p000.ks9;
import p000.kx3;
import p000.l39;
import p000.l43;
import p000.l70;
import p000.l77;
import p000.lda;
import p000.m01;
import p000.mda;
import p000.ml2;
import p000.ms5;
import p000.mu9;
import p000.nj0;
import p000.nu9;
import p000.nv8;
import p000.oa0;
import p000.oha;
import p000.omd;
import p000.ou9;
import p000.p84;
import p000.pd9;
import p000.pk9;
import p000.po7;
import p000.ps5;
import p000.pvc;
import p000.q6d;
import p000.qh0;
import p000.rc5;
import p000.rt9;
import p000.ru9;
import p000.sa1;
import p000.se1;
import p000.sk1;
import p000.ss5;
import p000.su9;
import p000.sw5;
import p000.t17;
import p000.t66;
import p000.te1;
import p000.tj3;
import p000.tr3;
import p000.ui3;
import p000.ui5;
import p000.ux5;
import p000.v56;
import p000.v63;
import p000.vi0;
import p000.vi3;
import p000.vt9;
import p000.vx9;
import p000.vz1;
import p000.wb3;
import p000.we1;
import p000.wq1;
import p000.wv9;
import p000.x18;
import p000.x89;
import p000.xa1;
import p000.xa3;
import p000.xb3;
import p000.xc9;
import p000.xfa;
import p000.xi0;
import p000.xi5;
import p000.xj2;
import p000.xv9;
import p000.ye1;
import p000.yv9;
import p000.z9a;
import p000.zda;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.internal.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0246h {
    /* JADX WARN: Code duplicated, block: B:249:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:266:0x0438  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX INFO: renamed from: a */
    public static final void m1166a(final TextFieldType textFieldType, final CharSequence charSequence, final zi3 zi3Var, final cv9 cv9Var, final aj3 aj3Var, final zi3 zi3Var2, final zi3 zi3Var3, final zi3 zi3Var4, final zi3 zi3Var5, final zi3 zi3Var6, final boolean z, final boolean z2, final boolean z3, final v56 v56Var, final t17 t17Var, final eu9 eu9Var, final zi3 zi3Var7, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        tj3 tj3Var;
        InputPhase inputPhase;
        final baa baaVarM15041c;
        Integer num;
        boolean z4;
        final baa baaVar;
        faa faaVar;
        tj3 tj3Var2;
        char c;
        char c2;
        final baa baaVarM15041c2;
        tj3 tj3Var3;
        boolean z5;
        final int i6;
        final vx9 vx9Var;
        C0282a c0282a;
        final ?? r3;
        final long j;
        C0282a c0282a2;
        long j2;
        C0282a c0282a3;
        long j3;
        final baa baaVar2;
        Object obj;
        boolean z6;
        tj3 tj3Var4;
        C0282a c0282a4;
        boolean z7;
        tj3 tj3Var5;
        long j4;
        C0282a c0282a5;
        long j5;
        C0282a c0282aM4703P;
        final int i7;
        Object objM24111g;
        float f;
        Object objM1254d;
        Object objM24111g2;
        float f2;
        float f3;
        Object objM24111g3;
        float f4;
        float f5;
        tr3 tr3Var = tr3.f62761g;
        jda jdaVar = pk9.f56363h;
        tj3 tj3Var6 = (tj3) ye1Var;
        tj3Var6.m22115d0(546805032);
        if ((i & 6) == 0) {
            i3 = (tj3Var6.m22116e(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = i3 | (tj3Var6.m22124i(charSequence) ? 32 : 16);
        } else {
            i4 = i3;
        }
        if ((i & 384) == 0) {
            i4 |= tj3Var6.m22124i(zi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var6.m22120g(cv9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= tj3Var6.m22124i(aj3Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= tj3Var6.m22124i(zi3Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= tj3Var6.m22124i(zi3Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= tj3Var6.m22124i(zi3Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= tj3Var6.m22124i(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= tj3Var6.m22124i(zi3Var5) ? 536870912 : 268435456;
        }
        int i8 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (tj3Var6.m22124i(zi3Var6) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= tj3Var6.m22122h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= tj3Var6.m22122h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= tj3Var6.m22122h(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= tj3Var6.m22120g(v56Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= tj3Var6.m22120g(t17Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= tj3Var6.m22120g(eu9Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= tj3Var6.m22124i(zi3Var7) ? 8388608 : 4194304;
        }
        int i9 = i5;
        if (tj3Var6.m22099R(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var6, (i9 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            zda zdaVar = ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b;
            vx9 vx9Var2 = zdaVar.f71406j;
            final vx9 vx9Var3 = zdaVar.f71408l;
            long jM23586c = vx9Var2.m23586c();
            long j6 = aa1.f412k;
            boolean z8 = (aa1.m199c(jM23586c, j6) && !aa1.m199c(vx9Var3.m23586c(), j6)) || (!aa1.m199c(vx9Var2.m23586c(), j6) && aa1.m199c(vx9Var3.m23586c(), j6));
            faa faaVarM15046h = kaa.m15046h(inputPhase, "TextFieldInputState", tj3Var6, 48, 0);
            boolean z9 = aj3Var != null;
            float f6 = 1.0f;
            Object obj2 = we1.f66679a;
            if (aj3Var != null) {
                tj3Var6.m22111b0(-940723593);
                l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var6);
                if (faaVarM15046h.m11673g()) {
                    z8 = z8;
                    z9 = z9;
                    objM24111g3 = wq1.m24111g(tj3Var6, 1666827533, false, faaVarM15046h);
                } else {
                    tj3Var6.m22111b0(1666573488);
                    boolean zM22120g = tj3Var6.m22120g(faaVarM15046h);
                    objM24111g3 = tj3Var6.m22097O();
                    if (zM22120g || objM24111g3 == obj2) {
                        jc9 jc9VarM16139y = lda.m16139y();
                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            Object objM11669c = faaVarM15046h.m11669c();
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            tj3Var6.m22131l0(objM11669c);
                            objM24111g3 = objM11669c;
                        } catch (Throwable th) {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            throw th;
                        }
                    }
                    tj3Var6.m22139q(false);
                }
                tj3Var6.m22111b0(1071902915);
                int[] iArr = AbstractC0245g.f3508b;
                int i10 = iArr[((InputPhase) objM24111g3).ordinal()];
                if (i10 == 1) {
                    f4 = 1.0f;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            gm5.m12750e();
                            return;
                        }
                    } else if (z9) {
                        f4 = 0.0f;
                    }
                    f4 = 1.0f;
                }
                tj3Var6.m22139q(false);
                Float fValueOf = Float.valueOf(f4);
                boolean zM22120g2 = tj3Var6.m22120g(faaVarM15046h);
                Object objM22097O = tj3Var6.m22097O();
                if (zM22120g2 || objM22097O == obj2) {
                    objM22097O = AbstractC0278f.m1254d(new m01(faaVarM15046h, 12));
                    tj3Var6.m22131l0(objM22097O);
                }
                InputPhase inputPhase2 = (InputPhase) ((dh9) objM22097O).getValue();
                tj3Var6.m22111b0(1071902915);
                int i11 = iArr[inputPhase2.ordinal()];
                if (i11 == 1) {
                    f5 = 1.0f;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            gm5.m12750e();
                            return;
                        }
                    } else if (z9) {
                        f5 = 0.0f;
                    }
                    f5 = 1.0f;
                }
                tj3Var6.m22139q(false);
                Float fValueOf2 = Float.valueOf(f5);
                boolean zM22120g3 = tj3Var6.m22120g(faaVarM15046h);
                Object objM22097O2 = tj3Var6.m22097O();
                if (zM22120g3 || objM22097O2 == obj2) {
                    objM22097O2 = AbstractC0278f.m1254d(new m01(faaVarM15046h, 13));
                    tj3Var6.m22131l0(objM22097O2);
                }
                tj3Var6.m22111b0(1806589607);
                tj3Var6.m22139q(false);
                baaVarM15041c = kaa.m15041c(faaVarM15046h, fValueOf, fValueOf2, l43VarM21705c0, jdaVar, tj3Var6, 196608);
                tj3Var6.m22139q(false);
            } else {
                vx9Var2 = vx9Var2;
                z8 = z8;
                z9 = z9;
                tj3Var6.m22111b0(-940652386);
                tj3Var6.m22139q(false);
                baaVarM15041c = null;
            }
            if (zi3Var2 != null) {
                tj3Var6.m22111b0(-940561742);
                final l43 l43VarM21705c1 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var6);
                final l43 l43VarM21705c2 = ss5.m21705c0(MotionSchemeKeyTokens.SlowEffects, tj3Var6);
                aj3 aj3Var2 = new aj3() { // from class: androidx.compose.material3.internal.e
                    @Override // p000.aj3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        z9a z9aVar = (z9a) obj3;
                        ((Integer) obj5).intValue();
                        tj3 tj3Var7 = (tj3) ((ye1) obj4);
                        tj3Var7.m22111b0(-1370891590);
                        InputPhase inputPhase3 = InputPhase.Focused;
                        InputPhase inputPhase4 = InputPhase.UnfocusedEmpty;
                        l43 l43Var = (!z9aVar.m25516b(inputPhase3, inputPhase4) && (z9aVar.m25516b(inputPhase4, inputPhase3) || z9aVar.m25516b(InputPhase.UnfocusedNotEmpty, inputPhase4))) ? l43VarM21705c2 : l43VarM21705c1;
                        tj3Var7.m22139q(false);
                        return l43Var;
                    }
                };
                if (faaVarM15046h.m11673g()) {
                    baaVarM15041c = baaVarM15041c;
                    objM24111g2 = wq1.m24111g(tj3Var6, 1666827533, false, faaVarM15046h);
                } else {
                    tj3Var6.m22111b0(1666573488);
                    boolean zM22120g4 = tj3Var6.m22120g(faaVarM15046h);
                    objM24111g2 = tj3Var6.m22097O();
                    if (zM22120g4 || objM24111g2 == obj2) {
                        jc9 jc9VarM16139y2 = lda.m16139y();
                        vi3 vi3VarMo3163e2 = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
                        jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                        try {
                            Object objM11669c2 = faaVarM15046h.m11669c();
                            lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                            tj3Var6.m22131l0(objM11669c2);
                            objM24111g2 = objM11669c2;
                        } catch (Throwable th2) {
                            lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                            throw th2;
                        }
                    }
                    tj3Var6.m22139q(false);
                }
                tj3Var6.m22111b0(-2037958114);
                int[] iArr2 = AbstractC0245g.f3508b;
                int i12 = iArr2[((InputPhase) objM24111g2).ordinal()];
                if (i12 == 1) {
                    f2 = 1.0f;
                } else {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            gm5.m12750e();
                            return;
                        }
                    } else if (!z9) {
                        f2 = 1.0f;
                    }
                    f2 = 0.0f;
                }
                tj3Var6.m22139q(false);
                Float fValueOf3 = Float.valueOf(f2);
                boolean zM22120g5 = tj3Var6.m22120g(faaVarM15046h);
                Object objM22097O3 = tj3Var6.m22097O();
                if (zM22120g5 || objM22097O3 == obj2) {
                    objM22097O3 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 10));
                    tj3Var6.m22131l0(objM22097O3);
                }
                InputPhase inputPhase3 = (InputPhase) ((dh9) objM22097O3).getValue();
                tj3Var6.m22111b0(-2037958114);
                int i13 = iArr2[inputPhase3.ordinal()];
                if (i13 == 1) {
                    f3 = 1.0f;
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            gm5.m12750e();
                            return;
                        }
                    } else if (!z9) {
                        f3 = 1.0f;
                    }
                    f3 = 0.0f;
                }
                tj3Var6.m22139q(false);
                Float fValueOf4 = Float.valueOf(f3);
                boolean zM22120g6 = tj3Var6.m22120g(faaVarM15046h);
                Object objM22097O4 = tj3Var6.m22097O();
                if (zM22120g6 || objM22097O4 == obj2) {
                    objM22097O4 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 11));
                    tj3Var6.m22131l0(objM22097O4);
                }
                Object value = ((dh9) objM22097O4).getValue();
                num = 0;
                baa baaVarM15041c3 = kaa.m15041c(faaVarM15046h, fValueOf3, fValueOf4, (l43) aj3Var2.invoke(value, tj3Var6, null), jdaVar, tj3Var6, 196608);
                z4 = false;
                tj3Var6.m22139q(false);
                baaVar = baaVarM15041c3;
            } else {
                baaVarM15041c = baaVarM15041c;
                num = 0;
                z4 = false;
                tj3Var6.m22111b0(-940485730);
                tj3Var6.m22139q(false);
                baaVar = null;
            }
            if (zi3Var5 != null) {
                tj3Var6.m22111b0(-940388328);
                nu9 nu9Var = new nu9(ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var6), z4 ? 1 : 0);
                if (faaVarM15046h.m11673g()) {
                    i8 = i8;
                    objM24111g = wq1.m24111g(tj3Var6, 1666827533, false, faaVarM15046h);
                } else {
                    tj3Var6.m22111b0(1666573488);
                    boolean zM22120g7 = tj3Var6.m22120g(faaVarM15046h);
                    objM24111g = tj3Var6.m22097O();
                    if (zM22120g7 || objM24111g == obj2) {
                        jc9 jc9VarM16139y3 = lda.m16139y();
                        vi3 vi3VarMo3163e3 = jc9VarM16139y3 != null ? jc9VarM16139y3.mo3163e() : null;
                        jc9 jc9VarM16106F3 = lda.m16106F(jc9VarM16139y3);
                        try {
                            Object objM11669c3 = faaVarM15046h.m11669c();
                            lda.m16110J(jc9VarM16139y3, jc9VarM16106F3, vi3VarMo3163e3);
                            tj3Var6.m22131l0(objM11669c3);
                            objM24111g = objM11669c3;
                        } catch (Throwable th3) {
                            lda.m16110J(jc9VarM16139y3, jc9VarM16106F3, vi3VarMo3163e3);
                            throw th3;
                        }
                    }
                    tj3Var6.m22139q(false);
                }
                tj3Var6.m22111b0(-2144425951);
                int[] iArr3 = AbstractC0245g.f3508b;
                int i14 = iArr3[((InputPhase) objM24111g).ordinal()];
                if (i14 == 1) {
                    f = 1.0f;
                } else {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            gm5.m12750e();
                            return;
                        }
                    } else if (z9) {
                        f = 0.0f;
                    }
                    f = 1.0f;
                }
                tj3Var6.m22139q(false);
                Float fValueOf5 = Float.valueOf(f);
                boolean zM22120g8 = tj3Var6.m22120g(faaVarM15046h);
                Object objM22097O5 = tj3Var6.m22097O();
                if (zM22120g8 || objM22097O5 == obj2) {
                    c2 = 6;
                    objM1254d = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 6));
                    tj3Var6.m22131l0(objM1254d);
                } else {
                    objM1254d = objM22097O5;
                    c2 = 6;
                }
                InputPhase inputPhase4 = (InputPhase) ((dh9) objM1254d).getValue();
                tj3Var6.m22111b0(-2144425951);
                int i15 = iArr3[inputPhase4.ordinal()];
                if (i15 != 1) {
                    c = 2;
                    if (i15 != 2) {
                        if (i15 != 3) {
                            gm5.m12750e();
                            return;
                        }
                    } else if (z9) {
                        f6 = 0.0f;
                    }
                } else {
                    c = 2;
                }
                tj3Var6.m22139q(false);
                Float fValueOf6 = Float.valueOf(f6);
                boolean zM22120g9 = tj3Var6.m22120g(faaVarM15046h);
                Object objM22097O6 = tj3Var6.m22097O();
                if (zM22120g9 || objM22097O6 == obj2) {
                    objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 7));
                    tj3Var6.m22131l0(objM22097O6);
                }
                faaVar = faaVarM15046h;
                baaVarM15041c2 = kaa.m15041c(faaVar, fValueOf5, fValueOf6, (l43) nu9Var.invoke(((dh9) objM22097O6).getValue(), tj3Var6, num), jdaVar, tj3Var6, 196608);
                tj3 tj3Var7 = tj3Var6;
                z4 = false;
                tj3Var7.m22139q(false);
                tj3Var3 = tj3Var7;
            } else {
                faaVar = faaVarM15046h;
                i8 = i8;
                tj3Var2 = tj3Var6;
                c = 2;
                c2 = 6;
                tj3Var2.m22111b0(-940318082);
                tj3Var2.m22139q(z4);
                baaVarM15041c2 = null;
            }
            if (aj3Var == null) {
                tj3Var3 = tj3Var2;
                tj3Var3.m22111b0(-940231841);
                tj3Var3.m22139q(z4);
                r3 = z4;
                c0282a = null;
                vx9Var = vx9Var2;
                i6 = 4;
            } else {
                tj3Var3 = tj3Var2;
                tj3Var3.m22111b0(-940231840);
                z5 = z4;
                vx9 vx9Var4 = vx9Var2;
                i6 = 4;
                vx9Var = vx9Var4;
                C0282a c0282aM4703P2 = ci8.m4703P(1632654811, new ou9(baaVarM15041c, eu9Var, z2, z3, zBooleanValue, z8, faaVar, vx9Var3, vx9Var4, aj3Var), tj3Var3);
                tj3Var3.m22139q(z5);
                c0282a = c0282aM4703P2;
            }
            if (!z2) {
                r3 = z5;
                j = eu9Var.f37876D;
            } else if (z3) {
                j = r11.f37877E;
            } else {
                j = zBooleanValue ? r11.f37874B : r11.f37875C;
            }
            Object objM22097O7 = tj3Var3.m22097O();
            if (objM22097O7 == obj2) {
                objM22097O7 = AbstractC0278f.m1255e(new ui3() { // from class: ku9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i16 = i6;
                        dh9 dh9Var = baaVar;
                        switch (i16) {
                            case 0:
                                return Boolean.valueOf((dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 0.0f) > 0.0f);
                            case 1:
                                return Float.valueOf(dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 1.0f);
                            case 2:
                                return Float.valueOf(dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 0.0f);
                            case 3:
                                return Float.valueOf(dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 0.0f);
                            default:
                                return Boolean.valueOf((dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 0.0f) > 0.0f);
                        }
                    }
                }, tr3Var);
                tj3Var3.m22131l0(objM22097O7);
            }
            dh9 dh9Var = (dh9) objM22097O7;
            if (zi3Var2 != null && charSequence.length() == 0 && ((Boolean) dh9Var.getValue()).booleanValue()) {
                tj3Var3.m22111b0(-939160356);
                C0282a c0282aM4703P3 = ci8.m4703P(-720601610, new aj3() { // from class: qu9
                    @Override // p000.aj3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        e16 e16Var = (e16) obj3;
                        ye1 ye1Var2 = (ye1) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((tj3) ye1Var2).m22120g(e16Var) ? 4 : 2;
                        }
                        tj3 tj3Var8 = (tj3) ye1Var2;
                        if (tj3Var8.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                            int iHashCode = Long.hashCode(tj3Var8.f62385T);
                            l77 l77VarM22132m = tj3Var8.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var8, e16Var);
                            se1.f60731q.getClass();
                            ui3 ui3Var = C0352b.f4299b;
                            tj3Var8.m22119f0();
                            if (tj3Var8.f62384S) {
                                tj3Var8.m22130l(ui3Var);
                            } else {
                                tj3Var8.m22137o0();
                            }
                            oha.m18001g(tj3Var8, C0352b.f4303f, ht5VarM19966d);
                            oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m);
                            oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode));
                            oha.m18000f(tj3Var8, C0352b.f4305h);
                            oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c);
                            AbstractC0246h.m1168c(j, vx9Var, zi3Var2, tj3Var8, 0);
                            tj3Var8.m22139q(true);
                        } else {
                            tj3Var8.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var3);
                tj3Var3.m22139q(r3);
                c0282a2 = c0282aM4703P3;
            } else {
                tj3Var3.m22111b0(-938848683);
                tj3Var3.m22139q(r3);
                c0282a2 = null;
            }
            Object objM22097O8 = tj3Var3.m22097O();
            if (objM22097O8 == obj2) {
                objM22097O8 = AbstractC0278f.m1255e(new ui3() { // from class: ku9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i16 = r3;
                        dh9 dh9Var2 = baaVarM15041c2;
                        switch (i16) {
                            case 0:
                                return Boolean.valueOf((dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 0.0f) > 0.0f);
                            case 1:
                                return Float.valueOf(dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 1.0f);
                            case 2:
                                return Float.valueOf(dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 0.0f);
                            case 3:
                                return Float.valueOf(dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 0.0f);
                            default:
                                return Boolean.valueOf((dh9Var2 != null ? ((Number) dh9Var2.getValue()).floatValue() : 0.0f) > 0.0f);
                        }
                    }
                }, r23);
                tj3Var3.m22131l0(objM22097O8);
            }
            dh9 dh9Var2 = (dh9) objM22097O8;
            tj3Var3.m22111b0(-938405259);
            tj3Var3.m22139q(r3);
            if (!z2) {
                j2 = r11.f37888P;
            } else if (z3) {
                j2 = r11.f37889Q;
            } else {
                j2 = zBooleanValue ? r11.f37886N : r11.f37887O;
            }
            final long j7 = j2;
            if (zi3Var5 == null || !((Boolean) dh9Var2.getValue()).booleanValue()) {
                tj3Var3.m22111b0(-938084843);
                tj3Var3.m22139q(r3);
                c0282a3 = null;
            } else {
                tj3Var3.m22111b0(-938232185);
                final int i16 = 0;
                C0282a c0282aM4703P4 = ci8.m4703P(123777469, new zi3() { // from class: lu9
                    @Override // p000.zi3
                    public final Object invoke(Object obj3, Object obj4) {
                        int i17 = i16;
                        xfa xfaVar = xfa.f68157a;
                        ye1 ye1Var2 = (ye1) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i17) {
                            case 0:
                                tj3 tj3Var8 = (tj3) ye1Var2;
                                if (!tj3Var8.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    AbstractC0246h.m1168c(j7, vx9Var, zi3Var5, tj3Var8, 0);
                                }
                                break;
                            default:
                                tj3 tj3Var9 = (tj3) ye1Var2;
                                if (!tj3Var9.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    AbstractC0246h.m1168c(j7, vx9Var, zi3Var5, tj3Var9, 0);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var3);
                tj3Var3.m22139q(r3);
                c0282a3 = c0282aM4703P4;
            }
            if (!z2) {
                j3 = r11.f37907r;
            } else if (z3) {
                j3 = r11.f37908s;
            } else {
                j3 = zBooleanValue ? r11.f37905p : r11.f37906q;
            }
            if (zi3Var3 == null) {
                tj3Var3.m22111b0(-937922124);
                tj3Var3.m22139q(r3);
                baaVar2 = baaVarM15041c2;
                tj3Var5 = tj3Var3;
                z7 = r3;
                c0282a4 = null;
                obj = obj2;
            } else {
                tj3Var3.m22111b0(-937922123);
                baaVar2 = baaVarM15041c2;
                obj = obj2;
                z6 = r3;
                tj3Var4 = tj3Var3;
                C0282a c0282aM4703P5 = ci8.m4703P(-906968406, new mu9(j3, zi3Var3, 0, (byte) 0), tj3Var4);
                tj3Var4.m22139q(z6);
                c0282a4 = c0282aM4703P5;
            }
            if (!z2) {
                tj3Var5 = tj3Var4;
                z7 = z6;
                j4 = r11.f37911v;
            } else if (z3) {
                j4 = r11.f37912w;
            } else {
                j4 = zBooleanValue ? r11.f37909t : r11.f37910u;
            }
            long j8 = j4;
            if (zi3Var4 == null) {
                tj3Var5.m22111b0(-937662189);
                tj3Var5.m22139q(z7);
                c0282a5 = null;
            } else {
                tj3Var5.m22111b0(-937662188);
                C0282a c0282aM4703P6 = ci8.m4703P(-1287792574, new mu9(j8, zi3Var4, 1, (byte) 0), tj3Var5);
                tj3Var5.m22139q(z7);
                c0282a5 = c0282aM4703P6;
            }
            if (!z2) {
                j5 = r11.f37880H;
            } else if (z3) {
                j5 = r11.f37881I;
            } else {
                j5 = zBooleanValue ? r11.f37878F : r11.f37879G;
            }
            final long j9 = j5;
            if (zi3Var6 == null) {
                tj3Var5.m22111b0(-937391714);
                tj3Var5.m22139q(z7);
                c0282aM4703P = null;
            } else {
                tj3Var5.m22111b0(-937391713);
                final int i17 = 1;
                c0282aM4703P = ci8.m4703P(-1612592437, new zi3() { // from class: lu9
                    @Override // p000.zi3
                    public final Object invoke(Object obj3, Object obj4) {
                        int i18 = i17;
                        xfa xfaVar = xfa.f68157a;
                        ye1 ye1Var2 = (ye1) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i18) {
                            case 0:
                                tj3 tj3Var8 = (tj3) ye1Var2;
                                if (!tj3Var8.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var8.m22102U();
                                } else {
                                    AbstractC0246h.m1168c(j9, vx9Var3, zi3Var6, tj3Var8, 0);
                                }
                                break;
                            default:
                                tj3 tj3Var9 = (tj3) ye1Var2;
                                if (!tj3Var9.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    tj3Var9.m22102U();
                                } else {
                                    AbstractC0246h.m1168c(j9, vx9Var3, zi3Var6, tj3Var9, 0);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                }, tj3Var5);
                tj3Var5.m22139q(z7);
            }
            boolean zM22120g10 = tj3Var5.m22120g(baaVarM15041c);
            Object objM22097O9 = tj3Var5.m22097O();
            if (zM22120g10 || objM22097O9 == obj) {
                final int i18 = 1;
                objM22097O9 = new ui3() { // from class: ku9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i19 = i18;
                        dh9 dh9Var3 = baaVarM15041c;
                        switch (i19) {
                            case 0:
                                return Boolean.valueOf((dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f) > 0.0f);
                            case 1:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 1.0f);
                            case 2:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f);
                            case 3:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f);
                            default:
                                return Boolean.valueOf((dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f) > 0.0f);
                        }
                    }
                };
                tj3Var5.m22131l0(objM22097O9);
            }
            ui3 ui3Var = (ui3) objM22097O9;
            boolean zM22120g11 = tj3Var5.m22120g(baaVar);
            Object objM22097O10 = tj3Var5.m22097O();
            if (zM22120g11 || objM22097O10 == obj) {
                i7 = 2;
                objM22097O10 = new ui3() { // from class: ku9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i19 = i7;
                        dh9 dh9Var3 = baaVar;
                        switch (i19) {
                            case 0:
                                return Boolean.valueOf((dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f) > 0.0f);
                            case 1:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 1.0f);
                            case 2:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f);
                            case 3:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f);
                            default:
                                return Boolean.valueOf((dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f) > 0.0f);
                        }
                    }
                };
                tj3Var5.m22131l0(objM22097O10);
            } else {
                i7 = 2;
            }
            ui3 ui3Var2 = (ui3) objM22097O10;
            boolean zM22120g12 = tj3Var5.m22120g(baaVar2);
            Object objM22097O11 = tj3Var5.m22097O();
            if (zM22120g12 || objM22097O11 == obj) {
                final int i19 = 3;
                objM22097O11 = new ui3() { // from class: ku9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i110 = i19;
                        dh9 dh9Var3 = baaVar2;
                        switch (i110) {
                            case 0:
                                return Boolean.valueOf((dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f) > 0.0f);
                            case 1:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 1.0f);
                            case 2:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f);
                            case 3:
                                return Float.valueOf(dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f);
                            default:
                                return Boolean.valueOf((dh9Var3 != null ? ((Number) dh9Var3.getValue()).floatValue() : 0.0f) > 0.0f);
                        }
                    }
                };
                tj3Var5.m22131l0(objM22097O11);
            }
            ui3 ui3Var3 = (ui3) objM22097O11;
            int i20 = AbstractC0245g.f3507a[textFieldType.ordinal()];
            if (i20 == 1) {
                tj3 tj3Var8 = tj3Var5;
                tj3Var8.m22111b0(-936973554);
                q6d.m19687d(zi3Var, c0282a, c0282a2, c0282a4, c0282a5, null, c0282a3, z, cv9Var, new su9(ui3Var), new su9(ui3Var2), new su9(ui3Var3), ci8.m4703P(-358432442, new eg5(1, zi3Var7), tj3Var8), c0282aM4703P, t17Var, tj3Var8, ((i8 >> 3) & 112) | 6 | ((i9 << 21) & 234881024) | ((i8 << 18) & 1879048192), (i9 & 458752) | 3072);
                tj3Var8.m22139q(false);
                tj3Var = tj3Var8;
            } else {
                if (i20 != i7) {
                    throw ux5.m23001x(tj3Var5, 1493796415, z7);
                }
                tj3Var5.m22111b0(-935939642);
                Object objM22097O12 = tj3Var5.m22097O();
                if (objM22097O12 == obj) {
                    objM22097O12 = AbstractC0278f.m1260j(new x89(0L));
                    tj3Var5.m22131l0(objM22097O12);
                }
                final t66 t66Var = (t66) objM22097O12;
                C0282a c0282aM4703P7 = ci8.m4703P(-403938615, new zi3() { // from class: androidx.compose.material3.internal.f
                    @Override // p000.zi3
                    public final Object invoke(Object obj3, Object obj4) {
                        ye1 ye1Var2 = (ye1) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        tj3 tj3Var9 = (tj3) ye1Var2;
                        if (tj3Var9.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            e16 e16VarM23656z = vz1.m23656z(l70.m15961x(b16.f7762a, "Container"), new bb0(new TextFieldImplKt$CommonDecorationBox$borderContainerWithId$1$1(t66Var, t66.class, "value", "getValue()Ljava/lang/Object;", 0), t17Var, AbstractC0246h.m1171f(cv9Var), 12));
                            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                            int iHashCode = Long.hashCode(tj3Var9.f62385T);
                            l77 l77VarM22132m = tj3Var9.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var9, e16VarM23656z);
                            se1.f60731q.getClass();
                            ui3 ui3Var4 = C0352b.f4299b;
                            tj3Var9.m22119f0();
                            if (tj3Var9.f62384S) {
                                tj3Var9.m22130l(ui3Var4);
                            } else {
                                tj3Var9.m22137o0();
                            }
                            oha.m18001g(tj3Var9, C0352b.f4303f, ht5VarM19966d);
                            oha.m18001g(tj3Var9, C0352b.f4302e, l77VarM22132m);
                            oha.m18001g(tj3Var9, C0352b.f4304g, Integer.valueOf(iHashCode));
                            oha.m18000f(tj3Var9, C0352b.f4305h);
                            oha.m18001g(tj3Var9, C0352b.f4301d, e16VarM1322c);
                            zi3Var7.invoke(tj3Var9, 0);
                            tj3Var9.m22139q(true);
                        } else {
                            tj3Var9.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var5);
                su9 su9Var = new su9(ui3Var);
                su9 su9Var2 = new su9(ui3Var2);
                su9 su9Var3 = new su9(ui3Var3);
                int i21 = i8;
                boolean zM22120g13 = ((i21 & 7168) == 2048) | tj3Var5.m22120g(ui3Var);
                Object objM22097O13 = tj3Var5.m22097O();
                if (zM22120g13 || objM22097O13 == obj) {
                    objM22097O13 = new ui5(cv9Var, ui3Var, t66Var, 15);
                    tj3Var5.m22131l0(objM22097O13);
                }
                C0282a c0282a6 = c0282a;
                tj3 tj3Var9 = tj3Var5;
                bna.m3944d(zi3Var, c0282a2, c0282a6, c0282a4, c0282a5, null, c0282a3, z, cv9Var, su9Var, su9Var2, su9Var3, (vi3) objM22097O13, c0282aM4703P7, c0282aM4703P, t17Var, tj3Var9, ((i21 >> 3) & 112) | 6 | ((i9 << 21) & 234881024) | ((i21 << 18) & 1879048192), (3670016 & (i9 << 3)) | 24576);
                tj3 tj3Var10 = tj3Var9;
                tj3Var10.m22139q(false);
                tj3Var = tj3Var10;
            }
        } else {
            tj3Var6.m22102U();
            tj3Var = tj3Var6;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: pu9
                @Override // p000.zi3
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0246h.m1166a(textFieldType, charSequence, zi3Var, cv9Var, aj3Var, zi3Var2, zi3Var3, zi3Var4, zi3Var5, zi3Var6, z, z2, z3, v56Var, t17Var, eu9Var, zi3Var7, (ye1) obj3, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:131:0x0224  */
    /* JADX WARN: Code duplicated, block: B:133:0x022c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0250  */
    /* JADX WARN: Code duplicated, block: B:147:0x0255  */
    /* JADX WARN: Code duplicated, block: B:215:0x0411 A[PHI: r67
      0x0411: PHI (r67v2 wv9) = (r67v1 wv9), (r67v1 wv9), (r67v4 wv9) binds: [B:222:0x0434, B:227:0x0445, B:213:0x0409] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public static final void m1167b(dh9 dh9Var, eu9 eu9Var, boolean z, boolean z2, boolean z3, boolean z4, faa faaVar, vx9 vx9Var, vx9 vx9Var2, aj3 aj3Var, ye1 ye1Var, int i) {
        long j;
        t66 t66Var;
        ru9 ru9Var;
        p84 p84Var;
        boolean z5;
        int i2;
        baa baaVarM15041c;
        Object objM24111g;
        wv9 wv9Var;
        xv9 xi0Var;
        l39 l39VarM21969B;
        g97 g97Var;
        a97 a97Var;
        vx9 vx9VarM23584b;
        boolean z6;
        Object objM24111g2;
        int i3;
        boolean z7;
        Object objM22097O;
        InputPhase inputPhase;
        long j2;
        boolean z8;
        Object objM22097O2;
        p84 p84Var2;
        t66 t66Var2 = faaVar.f38738d;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(376119213);
        int i4 = i | (tj3Var.m22120g(dh9Var) ? 4 : 2) | (tj3Var.m22120g(eu9Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22122h(z2) ? 2048 : 1024) | (tj3Var.m22122h(z3) ? 16384 : 8192) | (tj3Var.m22122h(z4) ? 131072 : 65536) | (tj3Var.m22120g(faaVar) ? 1048576 : 524288) | (tj3Var.m22120g(vx9Var) ? 8388608 : 4194304) | (tj3Var.m22120g(vx9Var2) ? 67108864 : 33554432) | (tj3Var.m22124i(aj3Var) ? 536870912 : 268435456);
        if (tj3Var.m22099R(i4 & 1, (i4 & 306783379) != 306783378)) {
            Object objM22097O3 = tj3Var.m22097O();
            p84 p84Var3 = we1.f66679a;
            if (objM22097O3 == p84Var3) {
                objM22097O3 = new ru9();
                tj3Var.m22131l0(objM22097O3);
            }
            ru9 ru9Var2 = (ru9) objM22097O3;
            if (!z) {
                j = eu9Var.f37915z;
            } else if (z2) {
                j = eu9Var.f37873A;
            } else {
                j = z3 ? eu9Var.f37913x : eu9Var.f37914y;
            }
            if (z4) {
                tj3Var.m22111b0(-601510006);
                long jM23586c = vx9Var.m23586c();
                if (z4 && jM23586c == 16) {
                    jM23586c = j;
                }
                long jM23586c2 = vx9Var2.m23586c();
                if (z4 && jM23586c2 == 16) {
                    jM23586c2 = j;
                }
                nu9 nu9Var = new nu9(ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var), 1);
                int i5 = ((i4 >> 18) & 14) | 384;
                InputPhase inputPhase2 = (InputPhase) ((xc9) t66Var2).getValue();
                tj3Var.m22111b0(-759924327);
                int[] iArr = AbstractC0245g.f3508b;
                long j3 = iArr[inputPhase2.ordinal()] == 1 ? jM23586c : jM23586c2;
                tj3Var.m22139q(false);
                sa1 sa1VarM202f = aa1.m202f(j3);
                boolean zM22120g = tj3Var.m22120g(sa1VarM202f);
                Object objM22097O4 = tj3Var.m22097O();
                if (zM22120g || objM22097O4 == p84Var3) {
                    int i6 = aa1.f413l;
                    objM22097O4 = (jda) AbstractC0054a.m735j().invoke(sa1VarM202f);
                    tj3Var.m22131l0(objM22097O4);
                }
                jda jdaVar = (jda) objM22097O4;
                int i7 = (i5 & 14) | 3072;
                if (faaVar.m11673g()) {
                    i7 = i7;
                    z6 = false;
                    objM24111g2 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
                } else {
                    tj3Var.m22111b0(1666573488);
                    boolean z9 = (((i7 & 14) ^ 6) > 4 && tj3Var.m22120g(faaVar)) || (i7 & 6) == 4;
                    objM24111g2 = tj3Var.m22097O();
                    if (z9 || objM24111g2 == p84Var3) {
                        jc9 jc9VarM16139y = lda.m16139y();
                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            Object objM11669c = faaVar.m11669c();
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            tj3Var.m22131l0(objM11669c);
                            objM24111g2 = objM11669c;
                        } catch (Throwable th) {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            throw th;
                        }
                    }
                    z6 = false;
                    tj3Var.m22139q(false);
                }
                tj3Var.m22111b0(-759924327);
                long j4 = iArr[((InputPhase) objM24111g2).ordinal()] == 1 ? jM23586c : jM23586c2;
                tj3Var.m22139q(z6);
                aa1 aa1Var = new aa1(j4);
                int i8 = i7 & 14;
                int i9 = i8 ^ 6;
                if (i9 <= 4 || !tj3Var.m22120g(faaVar)) {
                    i3 = i8;
                    if ((i7 & 6) != 4) {
                        z7 = false;
                    }
                    objM22097O = tj3Var.m22097O();
                    if (z7 || objM22097O == p84Var3) {
                        objM22097O = AbstractC0278f.m1254d(new sw5(faaVar, 8));
                        tj3Var.m22131l0(objM22097O);
                    }
                    inputPhase = (InputPhase) ((dh9) objM22097O).getValue();
                    tj3Var.m22111b0(-759924327);
                    if (iArr[inputPhase.ordinal()] == 1) {
                        j2 = jM23586c;
                    } else {
                        j2 = jM23586c2;
                    }
                    tj3Var.m22139q(false);
                    aa1 aa1Var2 = new aa1(j2);
                    z8 = (i9 <= 4 && tj3Var.m22120g(faaVar)) || (i7 & 6) == 4;
                    objM22097O2 = tj3Var.m22097O();
                    if (z8) {
                        p84Var2 = p84Var3;
                    } else {
                        p84Var2 = p84Var3;
                        if (objM22097O2 == p84Var2) {
                        }
                        p84 p84Var4 = p84Var2;
                        ru9Var = ru9Var2;
                        t66Var = t66Var2;
                        z5 = false;
                        p84Var = p84Var4;
                        i2 = 1666573488;
                        baaVarM15041c = kaa.m15041c(faaVar, aa1Var, aa1Var2, (l43) nu9Var.invoke(((dh9) objM22097O2).getValue(), tj3Var, 0), jdaVar, tj3Var, i3 | 196608);
                        tj3Var.m22139q(false);
                    }
                    objM22097O2 = AbstractC0278f.m1254d(new sw5(faaVar, 9));
                    tj3Var.m22131l0(objM22097O2);
                    p84 p84Var5 = p84Var2;
                    ru9Var = ru9Var2;
                    t66Var = t66Var2;
                    z5 = false;
                    p84Var = p84Var5;
                    i2 = 1666573488;
                    baaVarM15041c = kaa.m15041c(faaVar, aa1Var, aa1Var2, (l43) nu9Var.invoke(((dh9) objM22097O2).getValue(), tj3Var, 0), jdaVar, tj3Var, i3 | 196608);
                    tj3Var.m22139q(false);
                } else {
                    i3 = i8;
                }
                z7 = true;
                objM22097O = tj3Var.m22097O();
                if (z7) {
                    objM22097O = AbstractC0278f.m1254d(new sw5(faaVar, 8));
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = AbstractC0278f.m1254d(new sw5(faaVar, 8));
                    tj3Var.m22131l0(objM22097O);
                }
                inputPhase = (InputPhase) ((dh9) objM22097O).getValue();
                tj3Var.m22111b0(-759924327);
                if (iArr[inputPhase.ordinal()] == 1) {
                    j2 = jM23586c;
                } else {
                    j2 = jM23586c2;
                }
                tj3Var.m22139q(false);
                aa1 aa1Var3 = new aa1(j2);
                if (i9 <= 4) {
                }
                objM22097O2 = tj3Var.m22097O();
                if (z8) {
                    p84Var2 = p84Var3;
                    if (objM22097O2 == p84Var2) {
                    }
                    p84 p84Var6 = p84Var2;
                    ru9Var = ru9Var2;
                    t66Var = t66Var2;
                    z5 = false;
                    p84Var = p84Var6;
                    i2 = 1666573488;
                    baaVarM15041c = kaa.m15041c(faaVar, aa1Var, aa1Var3, (l43) nu9Var.invoke(((dh9) objM22097O2).getValue(), tj3Var, 0), jdaVar, tj3Var, i3 | 196608);
                    tj3Var.m22139q(false);
                } else {
                    p84Var2 = p84Var3;
                }
                objM22097O2 = AbstractC0278f.m1254d(new sw5(faaVar, 9));
                tj3Var.m22131l0(objM22097O2);
                p84 p84Var7 = p84Var2;
                ru9Var = ru9Var2;
                t66Var = t66Var2;
                z5 = false;
                p84Var = p84Var7;
                i2 = 1666573488;
                baaVarM15041c = kaa.m15041c(faaVar, aa1Var, aa1Var3, (l43) nu9Var.invoke(((dh9) objM22097O2).getValue(), tj3Var, 0), jdaVar, tj3Var, i3 | 196608);
                tj3Var.m22139q(false);
            } else {
                t66Var = t66Var2;
                ru9Var = ru9Var2;
                p84Var = p84Var3;
                z5 = false;
                i2 = 1666573488;
                tj3Var.m22111b0(-601031335);
                tj3Var.m22139q(false);
                baaVarM15041c = null;
            }
            l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var);
            int i10 = ((i4 >> 18) & 14) | 384;
            tj3Var.m22111b0(1139343725);
            tj3Var.m22139q(z5);
            sa1 sa1VarM202f2 = aa1.m202f(j);
            boolean zM22120g2 = tj3Var.m22120g(sa1VarM202f2);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var) {
                int i11 = aa1.f413l;
                objM22097O5 = (jda) AbstractC0054a.m735j().invoke(sa1VarM202f2);
                tj3Var.m22131l0(objM22097O5);
            }
            jda jdaVar2 = (jda) objM22097O5;
            int i12 = (i10 & 14) | 3072;
            if (faaVar.m11673g()) {
                objM24111g = wq1.m24111g(tj3Var, 1666827533, z5, faaVar);
            } else {
                tj3Var.m22111b0(i2);
                boolean z10 = ((((i12 & 14) ^ 6) <= 4 || !tj3Var.m22120g(faaVar)) && (i12 & 6) != 4) ? z5 : true;
                objM24111g = tj3Var.m22097O();
                if (z10 || objM24111g == p84Var) {
                    jc9 jc9VarM16139y2 = lda.m16139y();
                    vi3 vi3VarMo3163e2 = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
                    jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    try {
                        Object objM11669c2 = faaVar.m11669c();
                        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                        tj3Var.m22131l0(objM11669c2);
                        objM24111g = objM11669c2;
                        z5 = false;
                    } catch (Throwable th2) {
                        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                        throw th2;
                    }
                }
                tj3Var.m22139q(z5);
            }
            tj3Var.m22111b0(1139343725);
            tj3Var.m22139q(z5);
            baa baaVar = baaVarM15041c;
            long j5 = j;
            aa1 aa1Var4 = new aa1(j5);
            int i13 = i12 & 14;
            int i14 = i13 ^ 6;
            boolean z11 = (i14 > 4 && tj3Var.m22120g(faaVar)) || (i12 & 6) == 4;
            Object objM22097O6 = tj3Var.m22097O();
            if (z11 || objM22097O6 == p84Var) {
                objM22097O6 = AbstractC0278f.m1254d(new m01(faaVar, 10));
                tj3Var.m22131l0(objM22097O6);
            }
            tj3Var.m22111b0(1139343725);
            tj3Var.m22139q(false);
            aa1 aa1Var5 = new aa1(j5);
            boolean z12 = (i14 > 4 && tj3Var.m22120g(faaVar)) || (i12 & 6) == 4;
            Object objM22097O7 = tj3Var.m22097O();
            if (z12 || objM22097O7 == p84Var) {
                objM22097O7 = AbstractC0278f.m1254d(new m01(faaVar, 11));
                tj3Var.m22131l0(objM22097O7);
            }
            tj3Var.m22111b0(-1207102280);
            tj3Var.m22139q(false);
            baa baaVarM15041c2 = kaa.m15041c(faaVar, aa1Var4, aa1Var5, l43VarM21705c0, jdaVar2, tj3Var, i13 | 196608);
            float fFloatValue = dh9Var != null ? ((Number) dh9Var.getValue()).floatValue() : 1.0f;
            he9 he9Var = vx9Var2.f66065a;
            he9 he9Var2 = vx9Var.f66065a;
            xv9 xv9Var = ie9.f44030d;
            xv9 xv9Var2 = he9Var.f42264a;
            xv9 xv9Var3 = he9Var2.f42264a;
            boolean z13 = xv9Var2 instanceof xi0;
            wv9 wv9Var2 = wv9.f67395a;
            if (z13 || (xv9Var3 instanceof xi0)) {
                wv9Var = wv9Var2;
                if (z13 && (xv9Var3 instanceof xi0)) {
                    xi0 xi0Var2 = (xi0) xv9Var2;
                    xi0 xi0Var3 = (xi0) xv9Var3;
                    vi0 vi0Var = (vi0) ie9.m13813b(fFloatValue, xi0Var2.f68231a, xi0Var3.f68231a);
                    float fM18232Q = AbstractC3423or.m18232Q(xi0Var2.f68232b, xi0Var3.f68232b, fFloatValue);
                    if (vi0Var == null) {
                        xi0Var = wv9Var;
                    } else if (vi0Var instanceof pd9) {
                        long jM18135Y = omd.m18135Y(fM18232Q, ((pd9) vi0Var).f55989a);
                        if (jM18135Y != 16) {
                            xi0Var = new xa1(jM18135Y);
                        } else {
                            xi0Var = wv9Var;
                        }
                    } else {
                        if (!(vi0Var instanceof i39)) {
                            gm5.m12750e();
                            return;
                        }
                        xi0Var = new xi0((i39) vi0Var, fM18232Q);
                    }
                } else {
                    xi0Var = (xv9) ie9.m13813b(fFloatValue, xv9Var2, xv9Var3);
                }
            } else {
                wv9Var = wv9Var2;
                long jM10026X = d32.m10026X(xv9Var2.mo24173a(), xv9Var3.mo24173a(), fFloatValue);
                if (jM10026X != 16) {
                    xi0Var = new xa1(jM10026X);
                } else {
                    xi0Var = wv9Var;
                }
            }
            xv9 xv9Var4 = xi0Var;
            xa3 xa3Var = (xa3) ie9.m13813b(fFloatValue, he9Var.f42269f, he9Var2.f42269f);
            long jM13814c = ie9.m13814c(he9Var.f42265b, he9Var2.f42265b, fFloatValue);
            bc3 bc3Var = he9Var.f42266c;
            if (bc3Var == null) {
                bc3Var = bc3.f8321g;
            }
            bc3 bc3Var2 = he9Var2.f42266c;
            if (bc3Var2 == null) {
                bc3Var2 = bc3.f8321g;
            }
            bc3 bc3Var3 = new bc3(l70.m15945h(AbstractC3423or.m18233R(bc3Var.f8327a, fFloatValue, bc3Var2.f8327a), 1, DescriptorProtos.Edition.EDITION_2023_VALUE));
            wb3 wb3Var = (wb3) ie9.m13813b(fFloatValue, he9Var.f42267d, he9Var2.f42267d);
            xb3 xb3Var = (xb3) ie9.m13813b(fFloatValue, he9Var.f42268e, he9Var2.f42268e);
            String str = (String) ie9.m13813b(fFloatValue, he9Var.f42270g, he9Var2.f42270g);
            long jM13814c2 = ie9.m13814c(he9Var.f42271h, he9Var2.f42271h, fFloatValue);
            oa0 oa0Var = he9Var.f42272i;
            float f = oa0Var != null ? oa0Var.f54096a : 0.0f;
            oa0 oa0Var2 = he9Var2.f42272i;
            float fM18232Q2 = AbstractC3423or.m18232Q(f, oa0Var2 != null ? oa0Var2.f54096a : 0.0f, fFloatValue);
            yv9 yv9Var = he9Var.f42273j;
            yv9 yv9Var2 = yv9.f70559c;
            if (yv9Var == null) {
                yv9Var = yv9Var2;
            }
            yv9 yv9Var3 = he9Var2.f42273j;
            if (yv9Var3 != null) {
                yv9Var2 = yv9Var3;
            }
            yv9 yv9Var4 = new yv9(AbstractC3423or.m18232Q(yv9Var.f70560a, yv9Var2.f70560a, fFloatValue), AbstractC3423or.m18232Q(yv9Var.f70561b, yv9Var2.f70561b, fFloatValue));
            xi5 xi5Var = (xi5) ie9.m13813b(fFloatValue, he9Var.f42274k, he9Var2.f42274k);
            long jM10026X2 = d32.m10026X(he9Var.f42275l, he9Var2.f42275l, fFloatValue);
            rt9 rt9Var = (rt9) ie9.m13813b(fFloatValue, he9Var.f42276m, he9Var2.f42276m);
            l39 l39Var = he9Var.f42277n;
            l39 l39Var2 = he9Var2.f42277n;
            if (l39Var == null && l39Var2 == null) {
                yv9Var4 = yv9Var4;
                l39VarM21969B = null;
            } else if (l39Var == null) {
                l39Var2.getClass();
                l39VarM21969B = te1.m21969B(new l39(aa1.m198b(0.0f, l39Var2.f48993a), l39Var2.f48994b, l39Var2.f48995c), l39Var2, fFloatValue);
                yv9Var4 = yv9Var4;
            } else {
                l39VarM21969B = l39Var2 == null ? te1.m21969B(l39Var, new l39(aa1.m198b(0.0f, l39Var.f48993a), l39Var.f48994b, l39Var.f48995c), fFloatValue) : te1.m21969B(l39Var, l39Var2, fFloatValue);
            }
            g97 g97Var2 = he9Var.f42278o;
            g97 g97Var3 = he9Var2.f42278o;
            if (g97Var2 == null && g97Var3 == null) {
                g97Var = null;
            } else {
                if (g97Var2 == null) {
                    g97Var2 = g97.f40423a;
                }
                g97Var = g97Var2;
            }
            he9 he9Var3 = new he9(xv9Var4, jM13814c, bc3Var3, wb3Var, xb3Var, xa3Var, str, jM13814c2, new oa0(fM18232Q2), yv9Var4, xi5Var, jM10026X2, rt9Var, l39VarM21969B, g97Var, (ml2) ie9.m13813b(fFloatValue, he9Var.f42279p, he9Var2.f42279p));
            j37 j37Var = vx9Var2.f66066b;
            j37 j37Var2 = vx9Var.f66066b;
            int i15 = k37.f46626b;
            int i16 = ((ks9) ie9.m13813b(fFloatValue, new ks9(j37Var.f45012a), new ks9(j37Var2.f45012a))).f48393a;
            int i17 = ((vt9) ie9.m13813b(fFloatValue, new vt9(j37Var.f45013b), new vt9(j37Var2.f45013b))).f65894a;
            long jM13814c3 = ie9.m13814c(j37Var.f45014c, j37Var2.f45014c, fFloatValue);
            aw9 aw9Var = j37Var.f45015d;
            if (aw9Var == null) {
                aw9Var = aw9.f7624c;
            }
            aw9 aw9Var2 = j37Var2.f45015d;
            if (aw9Var2 == null) {
                aw9Var2 = aw9.f7624c;
            }
            aw9 aw9Var3 = new aw9(ie9.m13814c(aw9Var.f7625a, aw9Var2.f7625a, fFloatValue), ie9.m13814c(aw9Var.f7626b, aw9Var2.f7626b, fFloatValue));
            a97 a97Var2 = j37Var.f45016e;
            a97 a97Var3 = j37Var2.f45016e;
            if (a97Var2 == null && a97Var3 == null) {
                a97Var = null;
            } else {
                a97 a97Var4 = a97.f381c;
                if (a97Var2 == null) {
                    a97Var2 = a97Var4;
                }
                boolean z14 = a97Var2.f382a;
                if (a97Var3 == null) {
                    a97Var3 = a97Var4;
                }
                boolean z15 = a97Var3.f382a;
                a97Var = z14 == z15 ? a97Var2 : new a97(((dr2) ie9.m13813b(fFloatValue, new dr2(a97Var2.f383b), new dr2(a97Var3.f383b))).f36076a, ((Boolean) ie9.m13813b(fFloatValue, Boolean.valueOf(z14), Boolean.valueOf(z15))).booleanValue());
            }
            vx9 vx9Var3 = new vx9(he9Var3, new j37(i16, i17, jM13814c3, aw9Var3, a97Var, (rc5) ie9.m13813b(fFloatValue, j37Var.f45017f, j37Var2.f45017f), ((hc5) ie9.m13813b(fFloatValue, new hc5(j37Var.f45018g), new hc5(j37Var2.f45018g))).f42172a, ((kx3) ie9.m13813b(fFloatValue, new kx3(j37Var.f45019h), new kx3(j37Var2.f45019h))).f48540a, (ax9) ie9.m13813b(fFloatValue, j37Var.f45020i, j37Var2.f45020i)));
            if (z4) {
                baaVar.getClass();
                vx9VarM23584b = vx9.m23584b(vx9Var3, ((aa1) ((xc9) baaVar.f8247h).getValue()).f414a, 0L, null, null, null, 0L, null, null, 0, 0L, null, 16777214);
            } else {
                vx9VarM23584b = vx9Var3;
            }
            tj3Var = tj3Var;
            m1168c(((aa1) ((xc9) baaVarM15041c2.f8247h).getValue()).f414a, vx9VarM23584b, ci8.m4703P(57043598, new C3794yf(21, aj3Var, ru9Var), tj3Var), tj3Var, 384);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ou9(dh9Var, eu9Var, z, z2, z3, z4, faaVar, vx9Var, vx9Var2, aj3Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1168c(long j, vx9 vx9Var, zi3 zi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(396611577);
        int i2 = (tj3Var.m22118f(j) ? 4 : 2) | i | (tj3Var.m22120g(vx9Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            AbstractC3489q9.m19773c(j, vx9Var, zi3Var, tj3Var, i2 & 1022);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new po7(j, vx9Var, zi3Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1169d(long j, zi3 zi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(590397809);
        int i2 = (tj3Var.m22118f(j) ? 4 : 2) | i | (tj3Var.m22124i(zi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            pvc.m19507c(AbstractC3393o1.m17727b(j, sk1.f60948a), zi3Var, tj3Var, (i2 & 112) | 8);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mu9(j, zi3Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final e16 m1170e(e16 e16Var, boolean z, String str) {
        return z ? nv8.m17643c(e16Var, false, new jd0(str, 15)) : e16Var;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3457pe m1171f(cv9 cv9Var) {
        if (cv9Var instanceof cv9) {
            return cv9Var.f34614a;
        }
        v63.m23142t(cv9Var, "Unknown position: ");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final float m1172g(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71408l.f66066b.f45014c;
        long j2 = mda.f51160l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo901B(j) / 2.0f;
    }

    /* JADX INFO: renamed from: h */
    public static final float m1173h(ye1 ye1Var) {
        float f = ((xj2) ((tj3) ye1Var).m22128k(AbstractC0262s.f3629c)).f68285a;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - ib9.f43908c) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }
}
