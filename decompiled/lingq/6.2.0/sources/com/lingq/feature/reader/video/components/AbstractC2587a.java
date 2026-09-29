package com.lingq.feature.reader.video.components;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.player.video.AbstractC1824e;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.aa1;
import p000.ac7;
import p000.b16;
import p000.b45;
import p000.c99;
import p000.cd4;
import p000.ci0;
import p000.ci8;
import p000.d32;
import p000.dsa;
import p000.du7;
import p000.e08;
import p000.e16;
import p000.fa4;
import p000.fb2;
import p000.fe9;
import p000.fl4;
import p000.gc0;
import p000.ge9;
import p000.gl4;
import p000.gm5;
import p000.hl4;
import p000.ho5;
import p000.hqa;
import p000.ht5;
import p000.hx7;
import p000.ix0;
import p000.k5d;
import p000.l6b;
import p000.l77;
import p000.mv4;
import p000.nj0;
import p000.nu1;
import p000.nw1;
import p000.nz9;
import p000.oha;
import p000.p84;
import p000.pad;
import p000.pbb;
import p000.qbb;
import p000.qh0;
import p000.qv2;
import p000.se1;
import p000.ss5;
import p000.t66;
import p000.te0;
import p000.te1;
import p000.tj3;
import p000.tpa;
import p000.ui3;
import p000.un1;
import p000.v56;
import p000.vi3;
import p000.vs2;
import p000.vs3;
import p000.we1;
import p000.wfb;
import p000.ws0;
import p000.wz7;
import p000.x17;
import p000.x18;
import p000.xs3;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.components.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2587a {
    /* JADX WARN: Code duplicated, block: B:160:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:165:0x0308  */
    /* JADX WARN: Code duplicated, block: B:168:0x031a  */
    /* JADX WARN: Code duplicated, block: B:169:0x031c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0325  */
    /* JADX WARN: Code duplicated, block: B:176:0x0337  */
    /* JADX WARN: Code duplicated, block: B:177:0x0339  */
    /* JADX WARN: Code duplicated, block: B:181:0x0342  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v4, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r20v3, types: [ye1] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r6v10, types: [tj3] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [tj3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r6v8, types: [tj3, ye1] */
    /* JADX INFO: renamed from: a */
    public static final void m9513a(tpa tpaVar, dsa dsaVar, hqa hqaVar, wz7 wz7Var, e08 e08Var, hx7 hx7Var, nz9 nz9Var, du7 du7Var, qbb qbbVar, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i, int i2) {
        int i3;
        int i4;
        ?? r6;
        un1 un1Var;
        t66 t66Var;
        Object obj;
        boolean z;
        boolean z2;
        ?? r12;
        ?? r0;
        ?? r1;
        ?? r7;
        vs3 vs3Var;
        vi3 vi3Var4;
        boolean z3;
        Object objM22097O;
        boolean z4;
        Object objM22097O2;
        boolean z5;
        Object objM22097O3;
        vi3 vi3Var5 = vi3Var;
        tpaVar.getClass();
        String str = tpaVar.f62707b;
        dsaVar.getClass();
        hqaVar.getClass();
        wz7Var.getClass();
        e08Var.getClass();
        hx7Var.getClass();
        nz9Var.getClass();
        vs3 vs3Var2 = nz9Var.f53461g;
        du7Var.getClass();
        vi3Var5.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1811467062);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(tpaVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(dsaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22120g(hqaVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22120g(wz7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22120g(e08Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var.m22120g(hx7Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= (i & 2097152) == 0 ? tj3Var.m22120g(nz9Var) : tj3Var.m22124i(nz9Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? tj3Var.m22120g(du7Var) : tj3Var.m22124i(du7Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var.m22120g(qbbVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var.m22124i(vi3Var5) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var.m22124i(vi3Var2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22124i(vi3Var3) ? 32 : 16;
        }
        int i6 = i4;
        if (tj3Var.m22099R(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            Object objM22097O4 = tj3Var.m22097O();
            Object obj2 = we1.f66679a;
            if (objM22097O4 == obj2) {
                objM22097O4 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O4);
            }
            t66 t66Var2 = (t66) objM22097O4;
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == obj2) {
                objM22097O5 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O5);
            }
            t66 t66Var3 = (t66) objM22097O5;
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == obj2) {
                objM22097O6 = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O6);
            }
            un1 un1Var2 = (un1) objM22097O6;
            Object objM22097O7 = tj3Var.m22097O();
            if (objM22097O7 == obj2) {
                objM22097O7 = AbstractC0278f.m1260j(null);
                tj3Var.m22131l0(objM22097O7);
            }
            t66 t66Var4 = (t66) objM22097O7;
            Boolean bool = (Boolean) t66Var3.getValue();
            bool.getClass();
            boolean zM22124i = tj3Var.m22124i(un1Var2);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22124i || objM22097O8 == obj2) {
                objM22097O8 = new LandscapeVideoScreenKt$LandscapeVideoScreen$1$1(t66Var3, un1Var2, t66Var4, t66Var2, null);
                un1Var = un1Var2;
                tj3Var.m22131l0(objM22097O8);
            } else {
                un1Var = un1Var2;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O8, bool);
            b16 b16Var = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), aa1.f403b, ss5.f61356d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var6 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var6);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            boolean zM22120g = tj3Var.m22120g(str);
            Object objM22097O9 = tj3Var.m22097O();
            if (zM22120g || objM22097O9 == obj2) {
                objM22097O9 = AbstractC3352my.m17131l0(str);
                tj3Var.m22131l0(objM22097O9);
            }
            String str2 = (String) objM22097O9;
            if (str2.length() <= 0 || !hqaVar.f42799g) {
                t66Var = t66Var3;
                tj3 tj3Var2 = tj3Var;
                obj = obj2;
                z = false;
                z2 = true;
                tj3Var2.m22111b0(2035684670);
                tj3Var2.m22139q(false);
                r12 = tj3Var2;
            } else {
                tj3Var.m22111b0(2033556055);
                e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var6);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                e16 e16VarM21995i = te1.m21995i(1.7777778f, c99.m4410c(b16Var, 1.0f), false);
                pbb pbbVar = qbbVar.f57547a;
                float f = hqaVar.f42798f;
                ac7 ac7Var = hqaVar.f42797e;
                boolean z6 = !hqaVar.f42796d || hqaVar.f42795c;
                String str3 = tpaVar.f62711f;
                ui3 ui3Var2 = qbbVar.f57548b;
                int i7 = i5 & 1879048192;
                boolean z7 = i7 == 536870912;
                Object objM22097O10 = tj3Var.m22097O();
                if (z7) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objM22097O10 != obj) {
                        vi3Var4 = vi3Var;
                        t66Var = t66Var3;
                    }
                    vi3 vi3Var7 = (vi3) objM22097O10;
                    if (i7 == 536870912) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objM22097O = tj3Var.m22097O();
                    if (z3 || objM22097O == obj) {
                        objM22097O = new te0(vi3Var4, 26);
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3 vi3Var8 = (vi3) objM22097O;
                    if (i7 == 536870912) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z4 || objM22097O2 == obj) {
                        objM22097O2 = new te0(vi3Var4, 27);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    vi3 vi3Var9 = (vi3) objM22097O2;
                    if (i7 == 536870912) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objM22097O3 = tj3Var.m22097O();
                    if (z5 || objM22097O3 == obj) {
                        objM22097O3 = new nw1(vi3Var4, 29);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    vi3Var5 = vi3Var4;
                    AbstractC1824e.m8502a(e16VarM21995i, str2, pbbVar, ac7Var, f, z6, true, str3, ui3Var2, vi3Var7, vi3Var8, vi3Var9, (ui3) objM22097O3, tj3Var, 1572870, 0, 0);
                    tj3 tj3Var3 = tj3Var;
                    z2 = true;
                    tj3Var3.m22139q(true);
                    z = false;
                    tj3Var3.m22139q(false);
                    r12 = tj3Var3;
                }
                vi3Var4 = vi3Var;
                t66Var = t66Var3;
                objM22097O10 = new ix0(vi3Var4, t66Var, 9);
                tj3Var.m22131l0(objM22097O10);
                vi3 vi3Var10 = (vi3) objM22097O10;
                if (i7 == 536870912) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM22097O = tj3Var.m22097O();
                if (z3) {
                    objM22097O = new te0(vi3Var4, 26);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new te0(vi3Var4, 26);
                    tj3Var.m22131l0(objM22097O);
                }
                vi3 vi3Var11 = (vi3) objM22097O;
                if (i7 == 536870912) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM22097O2 = tj3Var.m22097O();
                if (z4) {
                    objM22097O2 = new te0(vi3Var4, 27);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new te0(vi3Var4, 27);
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3 vi3Var12 = (vi3) objM22097O2;
                if (i7 == 536870912) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objM22097O3 = tj3Var.m22097O();
                if (z5) {
                    objM22097O3 = new nw1(vi3Var4, 29);
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new nw1(vi3Var4, 29);
                    tj3Var.m22131l0(objM22097O3);
                }
                vi3Var5 = vi3Var4;
                AbstractC1824e.m8502a(e16VarM21995i, str2, pbbVar, ac7Var, f, z6, true, str3, ui3Var2, vi3Var10, vi3Var11, vi3Var12, (ui3) objM22097O3, tj3Var, 1572870, 0, 0);
                tj3 tj3Var4 = tj3Var;
                z2 = true;
                tj3Var4.m22139q(true);
                z = false;
                tj3Var4.m22139q(false);
                r12 = tj3Var4;
            }
            if (wz7Var.f67566c == null && wz7Var.f67567d == null) {
                r12.m22111b0(2036169758);
                r12.m22139q(z);
                r1 = z;
            } else {
                r12.m22111b0(2035796890);
                e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
                Object objM22097O11 = r12.m22097O();
                if (objM22097O11 == obj) {
                    objM22097O11 = AbstractC3393o1.m17729d(r12);
                }
                v56 v56Var = (v56) objM22097O11;
                boolean z8 = (i5 & 1879048192) == 536870912 ? z2 : false;
                Object objM22097O12 = r12.m22097O();
                if (z8 || objM22097O12 == obj) {
                    r0 = 0;
                    objM22097O12 = new fl4(vi3Var5, 0);
                    r12.m22131l0(objM22097O12);
                } else {
                    r0 = 0;
                }
                qh0.m19963a(AbstractC0080f.m814a(e16VarM4411d2, v56Var, null, false, null, (ui3) objM22097O12, 28), r12, r0);
                r12.m22139q(r0);
                r1 = r0;
            }
            boolean zBooleanValue = ((Boolean) t66Var2.getValue()).booleanValue();
            vs2 vs2VarM772g = AbstractC0070i.m772g(null, 0.0f, 3);
            qv2 qv2VarM773h = AbstractC0070i.m773h(null, 3);
            gc0 gc0Var = nj0.f52809d;
            ci0 ci0Var = ci0.f10109a;
            e16 e16VarM4412e = c99.m4412e(ci0Var.mo3727a(b16Var, gc0Var), 1.0f);
            C0282a c0282aM4703P = ci8.m4703P(-1727730388, new ws0(du7Var, wz7Var, tpaVar, vi3Var5, un1Var, t66Var4, t66Var, t66Var2), r12);
            ?? r20 = r12;
            AbstractC0054a.m729d(zBooleanValue, e16VarM4412e, vs2VarM772g, qv2VarM773h, null, c0282aM4703P, r20, 200064, 16);
            ?? r8 = r20;
            if (tpaVar.f62712g || tpaVar.f62706a.isEmpty()) {
                r8.m22111b0(2040425438);
                r8.m22139q(false);
                r7 = r8;
            } else {
                r8.m22111b0(2039622042);
                boolean zM22120g2 = r8.m22120g(vs3Var2);
                Object objM22097O13 = r8.m22097O();
                if (zM22120g2 || objM22097O13 == obj) {
                    int i8 = hl4.f42576b[vs3Var2.f65846b.ordinal()];
                    if (i8 == z2) {
                        vs3Var = xs3.f68640e;
                    } else {
                        if (i8 != 2) {
                            gm5.m12750e();
                            return;
                        }
                        vs3Var = xs3.f68637b;
                    }
                    objM22097O13 = vs3Var;
                    r8.m22131l0(objM22097O13);
                }
                List list = tpaVar.f62706a;
                e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, nj0.f52815j);
                WeakHashMap weakHashMap = l6b.f49204w;
                k5d.m14876a(list, wz7Var, e08Var, nz9Var, (vs3) objM22097O13, vi3Var, wfb.m23904F(e16VarMo3727a, ho5.m13397r(r8).f49209e), r8, ((i5 >> 6) & 1008) | 4096 | ((i5 >> 9) & 7168) | ((i5 >> 12) & 458752));
                ?? r9 = r8;
                r9.m22139q(false);
                r7 = r9;
            }
            r7.m22139q(z2);
            int i9 = i6 << 12;
            pad.m19011a(dsaVar, nz9Var, hx7Var, vi3Var, vi3Var2, vi3Var3, r7, ((i5 >> 3) & 14) | 64 | ((i5 >> 15) & 112) | ((i5 >> 9) & 896) | ((i5 >> 18) & 7168) | (57344 & i9) | (i9 & 458752));
            r6 = r7;
        } else {
            tj3Var.m22102U();
            r6 = tj3Var;
        }
        x18 x18VarM22143u = r6.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gl4(tpaVar, dsaVar, hqaVar, wz7Var, e08Var, hx7Var, nz9Var, du7Var, qbbVar, vi3Var, vi3Var2, vi3Var3, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9514b(un1 un1Var, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        cd4 cd4Var = (cd4) t66Var.getValue();
        if (cd4Var != null) {
            cd4Var.mo4537a(null);
        }
        if (((Boolean) t66Var2.getValue()).booleanValue()) {
            t66Var.setValue(wfb.m23926u(un1Var, null, null, new C2586x9fb16e2a(t66Var3, null), 3));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9515c(tpa tpaVar, wz7 wz7Var, e08 e08Var, nz9 nz9Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        int iIntValue;
        List list;
        p84 p84Var;
        char c;
        C0127b c0127b;
        tpaVar.getClass();
        wz7Var.getClass();
        Integer num = wz7Var.f67565b;
        e08Var.getClass();
        nz9Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(910436336);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(tpaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(wz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(e08Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? tj3Var2.m22120g(nz9Var) : tj3Var2.m22124i(nz9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 131072 : 65536;
        }
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            List list2 = tpaVar.f62706a;
            Integer num2 = num == null ? tpaVar.f62715j : num;
            if (num2 != null) {
                iIntValue = num2.intValue() + 1;
                int size = list2.size();
                if (iIntValue > size) {
                    iIntValue = size;
                }
            } else {
                iIntValue = 0;
            }
            C0127b c0127bM17056a = mv4.m17056a(iIntValue, tj3Var2, 2);
            fb2 fb2Var = (fb2) tj3Var2.m22128k(AbstractC0402n.f4816h);
            boolean zM22120g = tj3Var2.m22120g(fb2Var);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22120g || objM22097O == p84Var2) {
                objM22097O = Integer.valueOf(fb2Var.mo916w0(96.0f));
                tj3Var2.m22131l0(objM22097O);
            }
            int iIntValue2 = ((Number) objM22097O).intValue();
            int i3 = i2 & 57344;
            boolean zM22120g2 = tj3Var2.m22120g(c0127bM17056a) | (i3 == 16384);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var2) {
                objM22097O2 = new ScrollableTextContentKt$ScrollableTextContent$1$1(c0127bM17056a, vi3Var, null);
                tj3Var2.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O2, c0127bM17056a);
            int i4 = i2 & 112;
            boolean zM22124i = (i4 == 32) | tj3Var2.m22124i(list2) | tj3Var2.m22120g(c0127bM17056a) | tj3Var2.m22116e(iIntValue2);
            int i5 = i2;
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i || objM22097O3 == p84Var2) {
                list = list2;
                p84Var = p84Var2;
                c = 2048;
                objM22097O3 = new ScrollableTextContentKt$ScrollableTextContent$2$1(wz7Var, list, c0127bM17056a, iIntValue2, null);
                c0127b = c0127bM17056a;
                tj3Var2.m22131l0(objM22097O3);
            } else {
                list = list2;
                p84Var = p84Var2;
                c0127b = c0127bM17056a;
                c = 2048;
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, num);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            float f = ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38960i;
            x17 x17Var = new x17(f, f, f, f);
            boolean zM22124i2 = ((i5 & 14) == 4) | tj3Var2.m22124i(list) | ((i5 & 896) == 256) | (i4 == 32) | ((i5 & 7168) == c || ((i5 & 4096) != 0 && tj3Var2.m22124i(nz9Var))) | (i3 == 16384);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O4 == p84Var) {
                b45 b45Var = new b45(list, tpaVar, wz7Var, nz9Var, vi3Var, e08Var, 4);
                tj3Var2.m22131l0(b45Var);
                objM22097O4 = b45Var;
            }
            fa4.m11642c(e16VarM4411d, c0127b, x17Var, null, null, null, false, null, (vi3) objM22097O4, tj3Var2, 6, 504);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(tpaVar, wz7Var, e08Var, nz9Var, vi3Var, e16Var, i, 5);
        }
    }
}
