package p000;

import androidx.compose.foundation.interaction.AbstractC0122a;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.internal.AbstractC0246h;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.R$string;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.chart.AbstractC1917a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q6d {
    /* JADX INFO: renamed from: a */
    public static final void m19684a(e16 e16Var, ic5 ic5Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        int iM21692S;
        ArrayList arrayList = ic5Var.f43926a;
        List list = ic5Var.f43933h;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-967319353);
        int i2 = i | (tj3Var2.m22120g(e16Var) ? 4 : 2) | (tj3Var2.m22124i(ic5Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4411d = c99.m4411d(AbstractC3584sr.m21609V(e16Var, 4.0f, 0.0f, 2), 1.0f);
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, c99.m4411d(b16Var, 1.0f), true);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM17728c);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            int size = arrayList.size() - 1;
            if (size > 7) {
                size = 7;
            }
            p6d.m18932a(0.0f, size, 384, aa1.f405d, tj3Var2, null);
            ic5 ic5Var2 = new ic5(arrayList, ic5Var.f43927b, ic5Var.f43928c, ic5Var.f43929d, null, 240);
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new te0(vi3Var, 7);
                tj3Var2.m22131l0(objM22097O);
            }
            AbstractC1917a.m8795a(null, ic5Var2, (vi3) objM22097O, tj3Var2, 0);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
            int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m3 = tj3Var2.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, b16Var);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
            String str = (String) u91.m22589G0(list);
            long j = ic5Var.f43929d;
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71408l, tj3Var2, 0, 0, 131066);
            thb.m22044c(tj3Var2, new as4(1.0f, true));
            lw9.m16554b((String) list.get(1), null, ic5Var.f43929d, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71408l, tj3Var2, 0, 0, 131066);
            thb.m22044c(tj3Var2, new as4(1.0f, true));
            lw9.m16554b((String) u91.m22597O0(list), null, ic5Var.f43929d, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71408l, tj3Var2, 0, 0, 131066);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16 e16VarM4414g = c99.m4414g(b16Var, 24.0f);
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Float.valueOf(((lc5) it.next()).f49474c));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                uk9.m22784s();
                return;
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                float f = ((lc5) next).f49473b;
                do {
                    Object next2 = it2.next();
                    float f2 = ((lc5) next2).f49473b;
                    if (Float.compare(f, f2) < 0) {
                        next = next2;
                        f = f2;
                    }
                } while (it2.hasNext());
            }
            float f3 = ((lc5) next).f49473b;
            if (((lc5) u91.m22589G0(arrayList)).f49473b == 0.0f) {
                f3 += 1.0f;
            }
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                uk9.m22784s();
                return;
            }
            String str2 = ((lc5) it3.next()).f49472a;
            while (it3.hasNext()) {
                String str3 = ((lc5) it3.next()).f49472a;
                if (str2.compareTo(str3) < 0) {
                    str2 = str3;
                }
            }
            int i3 = str2.length() > 6 ? 3 : 7;
            int i4 = (int) f3;
            if (i4 > i3) {
                i4 = i3;
            }
            float f4 = f3;
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < i4; i5++) {
                if (f4 <= i4) {
                    iM21692S = i5;
                } else {
                    iM21692S = ss5.m21692S(Math.ceil((f4 / i3) * i5));
                    int size2 = arrayList2.size() - 1;
                    if (iM21692S > size2) {
                        iM21692S = size2;
                    }
                }
                arrayList3.add(((lc5) arrayList.get(iM21692S)).f49472a);
            }
            t6d.m21879a(e16VarM4414g, arrayList3, ic5Var.f43929d, tj3Var, 6);
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dv0(e16Var, ic5Var, vi3Var, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e9  */
    /* JADX INFO: renamed from: b */
    public static final void m19685b(final vv9 vv9Var, final vi3 vi3Var, final e16 e16Var, boolean z, final vx9 vx9Var, final zi3 zi3Var, zi3 zi3Var2, kwa kwaVar, hj4 hj4Var, gj4 gj4Var, final boolean z2, int i, int i2, o39 o39Var, final eu9 eu9Var, ye1 ye1Var, final int i3, final int i4, final int i5) {
        zi3 zi3Var3;
        int i6;
        int i7;
        int i8;
        hj4 hj4Var2;
        int i9;
        final int i10;
        char c;
        final int i11;
        boolean z3;
        final kwa kwaVar2;
        final gj4 gj4Var2;
        final int i12;
        final o39 o39Var2;
        final zi3 zi3Var4;
        final hj4 hj4Var3;
        final boolean z4;
        x18 x18VarM22143u;
        zi3 zi3Var5;
        hj4 hj4Var4;
        int i13;
        final zi3 zi3Var6;
        final kwa kwaVar3;
        final hj4 hj4Var5;
        final gj4 gj4Var3;
        final int i14;
        final o39 o39VarM24271b;
        final boolean z5;
        Object objM22097O;
        final v56 v56Var;
        long jM23586c;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1126989771);
        int i15 = (tj3Var.m22120g(vv9Var) ? 4 : 2) | i3 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i15 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        int i16 = i15 | 27648 | (tj3Var.m22120g(vx9Var) ? 131072 : 65536);
        int i17 = i16 | 1572864;
        int i18 = i5 & 256;
        int i19 = 33554432;
        if (i18 == 0) {
            if ((i3 & 100663296) == 0) {
                zi3Var3 = zi3Var2;
                i17 |= tj3Var.m22124i(zi3Var3) ? 67108864 : 33554432;
            }
            i6 = i17 | 805306368;
            i7 = i4 | 28086;
            i8 = i5 & 32768;
            if (i8 != 0) {
                if ((i4 & 196608) == 0) {
                    hj4Var2 = hj4Var;
                    i7 |= tj3Var.m22120g(hj4Var2) ? 131072 : 65536;
                }
                i9 = i7 | 1572864;
                if ((i4 & 100663296) == 0) {
                    if ((i5 & 262144) == 0) {
                        i10 = i;
                        if (tj3Var.m22116e(i10)) {
                            i19 = 67108864;
                        }
                    } else {
                        i10 = i;
                    }
                    i9 |= i19;
                } else {
                    i10 = i;
                }
                int i20 = i9 | 805306368;
                if (tj3Var.m22120g(eu9Var)) {
                    c = 256;
                } else {
                    c = 128;
                }
                int i21 = 22 | c;
                i11 = 1;
                if ((i6 & 306783379) != 306783378 && (i20 & 306783379) == 306783378 && (i21 & 147) == 146) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (tj3Var.m22099R(i6 & 1, z3)) {
                    tj3Var.m22104W();
                    if ((i3 & 1) != 0 || tj3Var.m22084B()) {
                        if (i18 != 0) {
                            zi3Var5 = null;
                        } else {
                            zi3Var5 = zi3Var3;
                        }
                        uk9 uk9Var = g9c.f40432f;
                        if (i8 != 0) {
                            hj4Var4 = hj4.f42487d;
                        } else {
                            hj4Var4 = hj4Var2;
                        }
                        gj4 gj4Var4 = gj4.f40872c;
                        if ((i5 & 262144) == 0) {
                            i13 = i10;
                        } else if (z2) {
                            i13 = 1;
                        } else {
                            i13 = Integer.MAX_VALUE;
                        }
                        zi3Var6 = zi3Var5;
                        kwaVar3 = uk9Var;
                        hj4Var5 = hj4Var4;
                        gj4Var3 = gj4Var4;
                        i14 = i13;
                        o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                        z5 = true;
                    } else {
                        tj3Var.m22102U();
                        kwaVar3 = kwaVar;
                        gj4Var3 = gj4Var;
                        i11 = i2;
                        o39VarM24271b = o39Var;
                        zi3Var6 = zi3Var3;
                        hj4Var5 = hj4Var2;
                        i14 = i10;
                        z5 = z;
                    }
                    tj3Var.m22140r();
                    tj3Var.m22111b0(-391753178);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var);
                    }
                    v56Var = (v56) objM22097O;
                    tj3Var.m22139q(false);
                    tj3Var.m22111b0(-705368401);
                    jM23586c = vx9Var.m23586c();
                    if (jM23586c == 16) {
                        jM23586c = eu9Var.m11350e(z5, false, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
                    }
                    long j = jM23586c;
                    tj3Var.m22139q(false);
                    final vx9 vx9VarM23588e = vx9Var.m23588e(new vx9(j, 0L, null, null, 0L, 0, 0L, 16777214));
                    pvc.m19507c(nx9.f53367a.mo1265a(eu9Var.f37900k), ci8.m4703P(-306109195, new zi3() { // from class: av9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                fa4.m11661w(tj3Var2, R$string.default_error_message);
                                e16 e16VarM4408a = c99.m4408a(e16Var, 280.0f, 56.0f);
                                final eu9 eu9Var2 = eu9Var;
                                pd9 pd9Var = new pd9(eu9Var2.f37898i);
                                final vv9 vv9Var2 = vv9Var;
                                final boolean z6 = z5;
                                final boolean z7 = z2;
                                final kwa kwaVar4 = kwaVar3;
                                final v56 v56Var2 = v56Var;
                                final zi3 zi3Var7 = zi3Var;
                                final zi3 zi3Var8 = zi3Var6;
                                final o39 o39Var3 = o39VarM24271b;
                                db0.m10262a(vv9Var2, vi3Var, e16VarM4408a, z6, vx9VarM23588e, hj4Var5, gj4Var3, z7, i14, i11, kwaVar4, null, v56Var2, pd9Var, ci8.m4703P(-609710734, new aj3() { // from class: vu9
                                    @Override // p000.aj3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        zi3 zi3Var9 = (zi3) obj3;
                                        ye1 ye1Var3 = (ye1) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var9) ? 4 : 2;
                                        }
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            mkd.f51459c.m16911c(vv9Var2.f65990a.f54604b, zi3Var9, z6, z7, kwaVar4, v56Var2, false, null, zi3Var7, zi3Var8, null, null, o39Var3, eu9Var2, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                        } else {
                                            tj3Var3.m22102U();
                                        }
                                        return xfa.f68157a;
                                    }
                                }, tj3Var2), tj3Var2, 0);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, 56);
                    z4 = z5;
                    hj4Var3 = hj4Var5;
                    gj4Var2 = gj4Var3;
                    i10 = i14;
                    i12 = i11;
                    kwaVar2 = kwaVar3;
                    zi3Var4 = zi3Var6;
                    o39Var2 = o39VarM24271b;
                } else {
                    tj3Var.m22102U();
                    kwaVar2 = kwaVar;
                    gj4Var2 = gj4Var;
                    i12 = i2;
                    o39Var2 = o39Var;
                    zi3Var4 = zi3Var3;
                    hj4Var3 = hj4Var2;
                    z4 = z;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: bv9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            int iM19383z2 = pk9.m19383z(i4);
                            q6d.m19685b(vv9Var, vi3Var, e16Var, z4, vx9Var, zi3Var, zi3Var4, kwaVar2, hj4Var3, gj4Var2, z2, i10, i12, o39Var2, eu9Var, (ye1) obj, iM19383z, iM19383z2, i5);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i7 = 224694 | i4;
            hj4Var2 = hj4Var;
            i9 = i7 | 1572864;
            if ((i4 & 100663296) == 0) {
                if ((i5 & 262144) == 0) {
                    i10 = i;
                    if (tj3Var.m22116e(i10)) {
                        i19 = 67108864;
                    }
                } else {
                    i10 = i;
                }
                i9 |= i19;
            } else {
                i10 = i;
            }
            int i22 = i9 | 805306368;
            if (tj3Var.m22120g(eu9Var)) {
                c = 256;
            } else {
                c = 128;
            }
            int i23 = 22 | c;
            i11 = 1;
            if ((i6 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        zi3Var5 = null;
                    } else {
                        zi3Var5 = zi3Var3;
                    }
                    uk9 uk9Var2 = g9c.f40432f;
                    if (i8 != 0) {
                        hj4Var4 = hj4.f42487d;
                    } else {
                        hj4Var4 = hj4Var2;
                    }
                    gj4 gj4Var5 = gj4.f40872c;
                    if ((i5 & 262144) == 0) {
                        i13 = i10;
                    } else if (z2) {
                        i13 = 1;
                    } else {
                        i13 = Integer.MAX_VALUE;
                    }
                    zi3Var6 = zi3Var5;
                    kwaVar3 = uk9Var2;
                    hj4Var5 = hj4Var4;
                    gj4Var3 = gj4Var5;
                    i14 = i13;
                    o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    z5 = true;
                } else {
                    if (i18 != 0) {
                        zi3Var5 = null;
                    } else {
                        zi3Var5 = zi3Var3;
                    }
                    uk9 uk9Var3 = g9c.f40432f;
                    if (i8 != 0) {
                        hj4Var4 = hj4.f42487d;
                    } else {
                        hj4Var4 = hj4Var2;
                    }
                    gj4 gj4Var6 = gj4.f40872c;
                    if ((i5 & 262144) == 0) {
                        i13 = i10;
                    } else if (z2) {
                        i13 = 1;
                    } else {
                        i13 = Integer.MAX_VALUE;
                    }
                    zi3Var6 = zi3Var5;
                    kwaVar3 = uk9Var3;
                    hj4Var5 = hj4Var4;
                    gj4Var3 = gj4Var6;
                    i14 = i13;
                    o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    z5 = true;
                }
                tj3Var.m22140r();
                tj3Var.m22111b0(-391753178);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                }
                v56Var = (v56) objM22097O;
                tj3Var.m22139q(false);
                tj3Var.m22111b0(-705368401);
                jM23586c = vx9Var.m23586c();
                if (jM23586c == 16) {
                    jM23586c = eu9Var.m11350e(z5, false, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
                }
                long j2 = jM23586c;
                tj3Var.m22139q(false);
                final vx9 vx9VarM23588e2 = vx9Var.m23588e(new vx9(j2, 0L, null, null, 0L, 0, 0L, 16777214));
                pvc.m19507c(nx9.f53367a.mo1265a(eu9Var.f37900k), ci8.m4703P(-306109195, new zi3() { // from class: av9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            fa4.m11661w(tj3Var2, R$string.default_error_message);
                            e16 e16VarM4408a = c99.m4408a(e16Var, 280.0f, 56.0f);
                            final eu9 eu9Var2 = eu9Var;
                            pd9 pd9Var = new pd9(eu9Var2.f37898i);
                            final vv9 vv9Var2 = vv9Var;
                            final boolean z6 = z5;
                            final boolean z7 = z2;
                            final kwa kwaVar4 = kwaVar3;
                            final v56 v56Var2 = v56Var;
                            final zi3 zi3Var7 = zi3Var;
                            final zi3 zi3Var8 = zi3Var6;
                            final o39 o39Var3 = o39VarM24271b;
                            db0.m10262a(vv9Var2, vi3Var, e16VarM4408a, z6, vx9VarM23588e2, hj4Var5, gj4Var3, z7, i14, i11, kwaVar4, null, v56Var2, pd9Var, ci8.m4703P(-609710734, new aj3() { // from class: vu9
                                @Override // p000.aj3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    zi3 zi3Var9 = (zi3) obj3;
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var9) ? 4 : 2;
                                    }
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        mkd.f51459c.m16911c(vv9Var2.f65990a.f54604b, zi3Var9, z6, z7, kwaVar4, v56Var2, false, null, zi3Var7, zi3Var8, null, null, o39Var3, eu9Var2, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                    } else {
                                        tj3Var3.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var2), tj3Var2, 0);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 56);
                z4 = z5;
                hj4Var3 = hj4Var5;
                gj4Var2 = gj4Var3;
                i10 = i14;
                i12 = i11;
                kwaVar2 = kwaVar3;
                zi3Var4 = zi3Var6;
                o39Var2 = o39VarM24271b;
            } else {
                tj3Var.m22102U();
                kwaVar2 = kwaVar;
                gj4Var2 = gj4Var;
                i12 = i2;
                o39Var2 = o39Var;
                zi3Var4 = zi3Var3;
                hj4Var3 = hj4Var2;
                z4 = z;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: bv9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        int iM19383z2 = pk9.m19383z(i4);
                        q6d.m19685b(vv9Var, vi3Var, e16Var, z4, vx9Var, zi3Var, zi3Var4, kwaVar2, hj4Var3, gj4Var2, z2, i10, i12, o39Var2, eu9Var, (ye1) obj, iM19383z, iM19383z2, i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i17 = 102236160 | i16;
        zi3Var3 = zi3Var2;
        i6 = i17 | 805306368;
        i7 = i4 | 28086;
        i8 = i5 & 32768;
        if (i8 != 0) {
            if ((i4 & 196608) == 0) {
                hj4Var2 = hj4Var;
                i7 |= tj3Var.m22120g(hj4Var2) ? 131072 : 65536;
            }
            i9 = i7 | 1572864;
            if ((i4 & 100663296) == 0) {
                if ((i5 & 262144) == 0) {
                    i10 = i;
                    if (tj3Var.m22116e(i10)) {
                        i19 = 67108864;
                    }
                } else {
                    i10 = i;
                }
                i9 |= i19;
            } else {
                i10 = i;
            }
            int i24 = i9 | 805306368;
            if (tj3Var.m22120g(eu9Var)) {
                c = 256;
            } else {
                c = 128;
            }
            int i25 = 22 | c;
            i11 = 1;
            if ((i6 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        zi3Var5 = null;
                    } else {
                        zi3Var5 = zi3Var3;
                    }
                    uk9 uk9Var4 = g9c.f40432f;
                    if (i8 != 0) {
                        hj4Var4 = hj4.f42487d;
                    } else {
                        hj4Var4 = hj4Var2;
                    }
                    gj4 gj4Var7 = gj4.f40872c;
                    if ((i5 & 262144) == 0) {
                        i13 = i10;
                    } else if (z2) {
                        i13 = 1;
                    } else {
                        i13 = Integer.MAX_VALUE;
                    }
                    zi3Var6 = zi3Var5;
                    kwaVar3 = uk9Var4;
                    hj4Var5 = hj4Var4;
                    gj4Var3 = gj4Var7;
                    i14 = i13;
                    o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    z5 = true;
                } else {
                    if (i18 != 0) {
                        zi3Var5 = null;
                    } else {
                        zi3Var5 = zi3Var3;
                    }
                    uk9 uk9Var5 = g9c.f40432f;
                    if (i8 != 0) {
                        hj4Var4 = hj4.f42487d;
                    } else {
                        hj4Var4 = hj4Var2;
                    }
                    gj4 gj4Var8 = gj4.f40872c;
                    if ((i5 & 262144) == 0) {
                        i13 = i10;
                    } else if (z2) {
                        i13 = 1;
                    } else {
                        i13 = Integer.MAX_VALUE;
                    }
                    zi3Var6 = zi3Var5;
                    kwaVar3 = uk9Var5;
                    hj4Var5 = hj4Var4;
                    gj4Var3 = gj4Var8;
                    i14 = i13;
                    o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    z5 = true;
                }
                tj3Var.m22140r();
                tj3Var.m22111b0(-391753178);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                }
                v56Var = (v56) objM22097O;
                tj3Var.m22139q(false);
                tj3Var.m22111b0(-705368401);
                jM23586c = vx9Var.m23586c();
                if (jM23586c == 16) {
                    jM23586c = eu9Var.m11350e(z5, false, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
                }
                long j3 = jM23586c;
                tj3Var.m22139q(false);
                final vx9 vx9VarM23588e3 = vx9Var.m23588e(new vx9(j3, 0L, null, null, 0L, 0, 0L, 16777214));
                pvc.m19507c(nx9.f53367a.mo1265a(eu9Var.f37900k), ci8.m4703P(-306109195, new zi3() { // from class: av9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            fa4.m11661w(tj3Var2, R$string.default_error_message);
                            e16 e16VarM4408a = c99.m4408a(e16Var, 280.0f, 56.0f);
                            final eu9 eu9Var2 = eu9Var;
                            pd9 pd9Var = new pd9(eu9Var2.f37898i);
                            final vv9 vv9Var2 = vv9Var;
                            final boolean z6 = z5;
                            final boolean z7 = z2;
                            final kwa kwaVar4 = kwaVar3;
                            final v56 v56Var2 = v56Var;
                            final zi3 zi3Var7 = zi3Var;
                            final zi3 zi3Var8 = zi3Var6;
                            final o39 o39Var3 = o39VarM24271b;
                            db0.m10262a(vv9Var2, vi3Var, e16VarM4408a, z6, vx9VarM23588e3, hj4Var5, gj4Var3, z7, i14, i11, kwaVar4, null, v56Var2, pd9Var, ci8.m4703P(-609710734, new aj3() { // from class: vu9
                                @Override // p000.aj3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    zi3 zi3Var9 = (zi3) obj3;
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var9) ? 4 : 2;
                                    }
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        mkd.f51459c.m16911c(vv9Var2.f65990a.f54604b, zi3Var9, z6, z7, kwaVar4, v56Var2, false, null, zi3Var7, zi3Var8, null, null, o39Var3, eu9Var2, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                    } else {
                                        tj3Var3.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var2), tj3Var2, 0);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 56);
                z4 = z5;
                hj4Var3 = hj4Var5;
                gj4Var2 = gj4Var3;
                i10 = i14;
                i12 = i11;
                kwaVar2 = kwaVar3;
                zi3Var4 = zi3Var6;
                o39Var2 = o39VarM24271b;
            } else {
                tj3Var.m22102U();
                kwaVar2 = kwaVar;
                gj4Var2 = gj4Var;
                i12 = i2;
                o39Var2 = o39Var;
                zi3Var4 = zi3Var3;
                hj4Var3 = hj4Var2;
                z4 = z;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: bv9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        int iM19383z2 = pk9.m19383z(i4);
                        q6d.m19685b(vv9Var, vi3Var, e16Var, z4, vx9Var, zi3Var, zi3Var4, kwaVar2, hj4Var3, gj4Var2, z2, i10, i12, o39Var2, eu9Var, (ye1) obj, iM19383z, iM19383z2, i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i7 = 224694 | i4;
        hj4Var2 = hj4Var;
        i9 = i7 | 1572864;
        if ((i4 & 100663296) == 0) {
            if ((i5 & 262144) == 0) {
                i10 = i;
                if (tj3Var.m22116e(i10)) {
                    i19 = 67108864;
                }
            } else {
                i10 = i;
            }
            i9 |= i19;
        } else {
            i10 = i;
        }
        int i26 = i9 | 805306368;
        if (tj3Var.m22120g(eu9Var)) {
            c = 256;
        } else {
            c = 128;
        }
        int i27 = 22 | c;
        i11 = 1;
        if ((i6 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (tj3Var.m22099R(i6 & 1, z3)) {
            tj3Var.m22104W();
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    zi3Var5 = null;
                } else {
                    zi3Var5 = zi3Var3;
                }
                uk9 uk9Var6 = g9c.f40432f;
                if (i8 != 0) {
                    hj4Var4 = hj4.f42487d;
                } else {
                    hj4Var4 = hj4Var2;
                }
                gj4 gj4Var9 = gj4.f40872c;
                if ((i5 & 262144) == 0) {
                    i13 = i10;
                } else if (z2) {
                    i13 = 1;
                } else {
                    i13 = Integer.MAX_VALUE;
                }
                zi3Var6 = zi3Var5;
                kwaVar3 = uk9Var6;
                hj4Var5 = hj4Var4;
                gj4Var3 = gj4Var9;
                i14 = i13;
                o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                z5 = true;
            } else {
                if (i18 != 0) {
                    zi3Var5 = null;
                } else {
                    zi3Var5 = zi3Var3;
                }
                uk9 uk9Var7 = g9c.f40432f;
                if (i8 != 0) {
                    hj4Var4 = hj4.f42487d;
                } else {
                    hj4Var4 = hj4Var2;
                }
                gj4 gj4Var10 = gj4.f40872c;
                if ((i5 & 262144) == 0) {
                    i13 = i10;
                } else if (z2) {
                    i13 = 1;
                } else {
                    i13 = Integer.MAX_VALUE;
                }
                zi3Var6 = zi3Var5;
                kwaVar3 = uk9Var7;
                hj4Var5 = hj4Var4;
                gj4Var3 = gj4Var10;
                i14 = i13;
                o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                z5 = true;
            }
            tj3Var.m22140r();
            tj3Var.m22111b0(-391753178);
            objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var);
            }
            v56Var = (v56) objM22097O;
            tj3Var.m22139q(false);
            tj3Var.m22111b0(-705368401);
            jM23586c = vx9Var.m23586c();
            if (jM23586c == 16) {
                jM23586c = eu9Var.m11350e(z5, false, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
            }
            long j4 = jM23586c;
            tj3Var.m22139q(false);
            final vx9 vx9VarM23588e4 = vx9Var.m23588e(new vx9(j4, 0L, null, null, 0L, 0, 0L, 16777214));
            pvc.m19507c(nx9.f53367a.mo1265a(eu9Var.f37900k), ci8.m4703P(-306109195, new zi3() { // from class: av9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fa4.m11661w(tj3Var2, R$string.default_error_message);
                        e16 e16VarM4408a = c99.m4408a(e16Var, 280.0f, 56.0f);
                        final eu9 eu9Var2 = eu9Var;
                        pd9 pd9Var = new pd9(eu9Var2.f37898i);
                        final vv9 vv9Var2 = vv9Var;
                        final boolean z6 = z5;
                        final boolean z7 = z2;
                        final kwa kwaVar4 = kwaVar3;
                        final v56 v56Var2 = v56Var;
                        final zi3 zi3Var7 = zi3Var;
                        final zi3 zi3Var8 = zi3Var6;
                        final o39 o39Var3 = o39VarM24271b;
                        db0.m10262a(vv9Var2, vi3Var, e16VarM4408a, z6, vx9VarM23588e4, hj4Var5, gj4Var3, z7, i14, i11, kwaVar4, null, v56Var2, pd9Var, ci8.m4703P(-609710734, new aj3() { // from class: vu9
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                zi3 zi3Var9 = (zi3) obj3;
                                ye1 ye1Var3 = (ye1) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var9) ? 4 : 2;
                                }
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    mkd.f51459c.m16911c(vv9Var2.f65990a.f54604b, zi3Var9, z6, z7, kwaVar4, v56Var2, false, null, zi3Var7, zi3Var8, null, null, o39Var3, eu9Var2, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var2), tj3Var2, 0);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 56);
            z4 = z5;
            hj4Var3 = hj4Var5;
            gj4Var2 = gj4Var3;
            i10 = i14;
            i12 = i11;
            kwaVar2 = kwaVar3;
            zi3Var4 = zi3Var6;
            o39Var2 = o39VarM24271b;
        } else {
            tj3Var.m22102U();
            kwaVar2 = kwaVar;
            gj4Var2 = gj4Var;
            i12 = i2;
            o39Var2 = o39Var;
            zi3Var4 = zi3Var3;
            hj4Var3 = hj4Var2;
            z4 = z;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: bv9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    int iM19383z2 = pk9.m19383z(i4);
                    q6d.m19685b(vv9Var, vi3Var, e16Var, z4, vx9Var, zi3Var, zi3Var4, kwaVar2, hj4Var3, gj4Var2, z2, i10, i12, o39Var2, eu9Var, (ye1) obj, iM19383z, iM19383z2, i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139  */
    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x015f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0162  */
    /* JADX WARN: Code duplicated, block: B:114:0x0167  */
    /* JADX WARN: Code duplicated, block: B:117:0x016f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174  */
    /* JADX WARN: Code duplicated, block: B:120:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0184  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:127:0x018f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01db  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:166:0x020d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0237  */
    /* JADX WARN: Code duplicated, block: B:174:0x023d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0246  */
    /* JADX WARN: Code duplicated, block: B:178:0x024a  */
    /* JADX WARN: Code duplicated, block: B:180:0x024d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0250  */
    /* JADX WARN: Code duplicated, block: B:184:0x0253  */
    /* JADX WARN: Code duplicated, block: B:185:0x0255  */
    /* JADX WARN: Code duplicated, block: B:188:0x025a  */
    /* JADX WARN: Code duplicated, block: B:190:0x025e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0260  */
    /* JADX WARN: Code duplicated, block: B:194:0x0266  */
    /* JADX WARN: Code duplicated, block: B:195:0x0269  */
    /* JADX WARN: Code duplicated, block: B:197:0x026d  */
    /* JADX WARN: Code duplicated, block: B:198:0x026f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x0277  */
    /* JADX WARN: Code duplicated, block: B:203:0x027a  */
    /* JADX WARN: Code duplicated, block: B:204:0x027e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0284  */
    /* JADX WARN: Code duplicated, block: B:208:0x028b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0291  */
    /* JADX WARN: Code duplicated, block: B:213:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:216:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:222:0x034f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0371  */
    /* JADX WARN: Code duplicated, block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0120  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m19686c(final String str, final vi3 vi3Var, final e16 e16Var, boolean z, vx9 vx9Var, zi3 zi3Var, zi3 zi3Var2, zi3 zi3Var3, zi3 zi3Var4, zi3 zi3Var5, boolean z2, kwa kwaVar, final hj4 hj4Var, gj4 gj4Var, boolean z3, int i, int i2, o39 o39Var, eu9 eu9Var, ye1 ye1Var, final int i3, final int i4, final int i5) {
        int i6;
        final boolean z4;
        int i7;
        vx9 vx9Var2;
        int i8;
        final zi3 zi3Var6;
        int i9;
        int i10;
        final zi3 zi3Var7;
        int i11;
        int i12;
        int i13;
        final zi3 zi3Var8;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        char c;
        int i29;
        final int i30;
        int i31;
        boolean z5;
        final zi3 zi3Var9;
        final zi3 zi3Var10;
        final kwa kwaVar2;
        final int i32;
        final o39 o39Var2;
        final eu9 eu9Var2;
        final vx9 vx9Var3;
        final zi3 zi3Var11;
        final zi3 zi3Var12;
        final zi3 zi3Var13;
        final boolean z6;
        final boolean z7;
        final gj4 gj4Var2;
        final boolean z8;
        x18 x18VarM22143u;
        vx9 vx9Var4;
        final zi3 zi3Var14;
        boolean z9;
        gj4 gj4Var3;
        boolean z10;
        final o39 o39VarM24271b;
        final eu9 eu9VarM16904g;
        final zi3 zi3Var15;
        final boolean z11;
        final uk9 uk9Var;
        Object objM22097O;
        final v56 v56Var;
        long jM23586c;
        int i33;
        int i34;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-154966360);
        if ((i3 & 6) == 0) {
            i6 = (tj3Var.m22120g(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= tj3Var.m22120g(e16Var) ? 256 : 128;
        }
        int i35 = i5 & 8;
        if (i35 == 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= tj3Var.m22122h(z4) ? 2048 : 1024;
            }
            i7 = i6 | 24576;
            if ((i3 & 196608) == 0) {
                vx9Var2 = vx9Var;
                if ((i5 & 32) == 0 || !tj3Var.m22120g(vx9Var2)) {
                    i34 = 65536;
                } else {
                    i34 = 131072;
                }
                i7 |= i34;
            } else {
                vx9Var2 = vx9Var;
            }
            i8 = i5 & 64;
            if (i8 != 0) {
                i7 |= 1572864;
                zi3Var6 = zi3Var;
            } else {
                zi3Var6 = zi3Var;
                if ((i3 & 1572864) == 0) {
                    if (tj3Var.m22124i(zi3Var6)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i7 |= i9;
                }
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                i7 |= 12582912;
                zi3Var7 = zi3Var2;
            } else {
                zi3Var7 = zi3Var2;
                if ((i3 & 12582912) == 0) {
                    if (tj3Var.m22124i(zi3Var7)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i7 |= i11;
                }
            }
            i12 = i5 & 256;
            i13 = 33554432;
            if (i12 != 0) {
                i7 |= 100663296;
                zi3Var8 = zi3Var3;
            } else {
                zi3Var8 = zi3Var3;
                if ((i3 & 100663296) == 0) {
                    if (tj3Var.m22124i(zi3Var8)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i7 |= i14;
                }
            }
            i15 = i5 & 512;
            if (i15 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (tj3Var.m22124i(zi3Var4)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i7 |= i16;
                }
                i17 = i4 | 54;
                i18 = i5 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (tj3Var.m22124i(zi3Var5)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i5 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i36 = i19;
                    if (tj3Var.m22122h(z2)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i36 | i22;
                }
                i24 = i23 | 24576;
                if ((i4 & 196608) == 0) {
                    if (tj3Var.m22120g(hj4Var)) {
                        i33 = 131072;
                    } else {
                        i33 = 65536;
                    }
                    i25 = i24 | i33;
                } else {
                    i25 = i24;
                }
                i26 = i5 & 65536;
                if (i26 != 0) {
                    i27 = i25 | 1572864;
                } else {
                    i27 = i25 | (tj3Var.m22120g(gj4Var) ? 1048576 : 524288);
                }
                i28 = i5 & 131072;
                if (i28 != 0) {
                    i27 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= tj3Var.m22122h(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 100663296) != 0) {
                    if ((i5 & 262144) == 0 && tj3Var.m22116e(i)) {
                        i13 = 67108864;
                    }
                    i27 |= i13;
                }
                int i37 = i27 | 805306368;
                if ((i5 & 2097152) == 0 || !tj3Var.m22120g(o39Var)) {
                    c = 16;
                } else {
                    c = ' ';
                }
                int i38 = 6 | c;
                if ((i5 & 4194304) == 0 || !tj3Var.m22120g(eu9Var)) {
                    i29 = 128;
                } else {
                    i29 = 256;
                }
                int i39 = i38 | i29;
                i30 = 1;
                i31 = i7;
                if ((i7 & 306783379) != 306783378 && (i37 & 306783379) == 306783378 && (i39 & 147) == 146) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (tj3Var.m22099R(i31 & 1, z5)) {
                    tj3Var.m22104W();
                    if ((i3 & 1) != 0 || tj3Var.m22084B()) {
                        if (i35 != 0) {
                            z4 = true;
                        }
                        if ((i5 & 32) != 0) {
                            vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i8 != 0) {
                            zi3Var6 = null;
                        }
                        if (i10 != 0) {
                            zi3Var7 = null;
                        }
                        if (i12 != 0) {
                            zi3Var8 = null;
                        }
                        if (i15 != 0) {
                            zi3Var14 = null;
                        } else {
                            zi3Var14 = zi3Var4;
                        }
                        zi3 zi3Var16 = i18 == 0 ? zi3Var5 : null;
                        if (i21 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        uk9 uk9Var2 = g9c.f40432f;
                        if (i26 != 0) {
                            gj4Var3 = gj4.f40872c;
                        } else {
                            gj4Var3 = gj4Var;
                        }
                        if (i28 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 262144) == 0) {
                            i32 = i;
                        } else if (z10) {
                            i32 = 1;
                        } else {
                            i32 = Integer.MAX_VALUE;
                        }
                        if ((i5 & 2097152) != 0) {
                            o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                        } else {
                            o39VarM24271b = o39Var;
                        }
                        if ((i5 & 4194304) != 0) {
                            eu9VarM16904g = mkd.m16904g(tj3Var);
                        } else {
                            eu9VarM16904g = eu9Var;
                        }
                        zi3Var15 = zi3Var16;
                        z11 = z9;
                        gj4Var2 = gj4Var3;
                        z8 = z10;
                        uk9Var = uk9Var2;
                    } else {
                        tj3Var.m22102U();
                        zi3Var14 = zi3Var4;
                        zi3Var15 = zi3Var5;
                        uk9Var = kwaVar;
                        i32 = i;
                        i30 = i2;
                        o39VarM24271b = o39Var;
                        eu9VarM16904g = eu9Var;
                        vx9Var4 = vx9Var2;
                        zi3Var6 = zi3Var6;
                        zi3Var7 = zi3Var7;
                        zi3Var8 = zi3Var8;
                        z4 = z4;
                        z11 = z2;
                        gj4Var2 = gj4Var;
                        z8 = z3;
                    }
                    tj3Var.m22140r();
                    tj3Var.m22111b0(488158419);
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var);
                    }
                    v56Var = (v56) objM22097O;
                    tj3Var.m22139q(false);
                    tj3Var.m22111b0(1401225826);
                    jM23586c = vx9Var4.m23586c();
                    if (jM23586c == 16) {
                        jM23586c = eu9VarM16904g.m11350e(z4, z11, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
                    }
                    long j = jM23586c;
                    tj3Var.m22139q(false);
                    final vx9 vx9VarM23588e = vx9Var4.m23588e(new vx9(j, 0L, null, null, 0L, 0, 0L, 16777214));
                    pvc.m19507c(nx9.f53367a.mo1265a(eu9VarM16904g.f37900k), ci8.m4703P(1459735400, new zi3() { // from class: xu9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                String strM11661w = fa4.m11661w(tj3Var2, R$string.default_error_message);
                                e16 e16Var2 = e16Var;
                                final boolean z12 = z11;
                                e16 e16VarM4408a = c99.m4408a(AbstractC0246h.m1170e(e16Var2, z12, strM11661w), 280.0f, 56.0f);
                                final eu9 eu9Var3 = eu9VarM16904g;
                                pd9 pd9Var = new pd9(z12 ? eu9Var3.f37899j : eu9Var3.f37898i);
                                final String str2 = str;
                                final boolean z13 = z4;
                                final boolean z14 = z8;
                                final kwa kwaVar3 = uk9Var;
                                final v56 v56Var2 = v56Var;
                                final zi3 zi3Var17 = zi3Var6;
                                final zi3 zi3Var18 = zi3Var7;
                                final zi3 zi3Var19 = zi3Var8;
                                final zi3 zi3Var20 = zi3Var14;
                                final zi3 zi3Var21 = zi3Var15;
                                final o39 o39Var3 = o39VarM24271b;
                                db0.m10263b(str2, vi3Var, e16VarM4408a, z13, vx9VarM23588e, hj4Var, gj4Var2, z14, i32, i30, kwaVar3, null, v56Var2, pd9Var, ci8.m4703P(1451491557, new aj3() { // from class: zu9
                                    @Override // p000.aj3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        zi3 zi3Var22 = (zi3) obj3;
                                        ye1 ye1Var3 = (ye1) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var22) ? 4 : 2;
                                        }
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            mkd.f51459c.m16911c(str2, zi3Var22, z13, z14, kwaVar3, v56Var2, z12, zi3Var17, zi3Var18, zi3Var19, zi3Var20, zi3Var21, o39Var3, eu9Var3, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                        } else {
                                            tj3Var3.m22102U();
                                        }
                                        return xfa.f68157a;
                                    }
                                }, tj3Var2), tj3Var2, 0, 4096);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, 56);
                    vx9Var3 = vx9Var4;
                    eu9Var2 = eu9VarM16904g;
                    z6 = z4;
                    kwaVar2 = uk9Var;
                    zi3Var11 = zi3Var6;
                    zi3Var13 = zi3Var8;
                    zi3Var9 = zi3Var14;
                    zi3Var10 = zi3Var15;
                    o39Var2 = o39VarM24271b;
                    z7 = z11;
                    zi3Var12 = zi3Var7;
                } else {
                    tj3Var.m22102U();
                    zi3Var9 = zi3Var4;
                    zi3Var10 = zi3Var5;
                    kwaVar2 = kwaVar;
                    i32 = i;
                    i30 = i2;
                    o39Var2 = o39Var;
                    eu9Var2 = eu9Var;
                    vx9Var3 = vx9Var2;
                    zi3Var11 = zi3Var6;
                    zi3Var12 = zi3Var7;
                    zi3Var13 = zi3Var8;
                    z6 = z4;
                    z7 = z2;
                    gj4Var2 = gj4Var;
                    z8 = z3;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: yu9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            int iM19383z2 = pk9.m19383z(i4);
                            q6d.m19686c(str, vi3Var, e16Var, z6, vx9Var3, zi3Var11, zi3Var12, zi3Var13, zi3Var9, zi3Var10, z7, kwaVar2, hj4Var, gj4Var2, z8, i32, i30, o39Var2, eu9Var2, (ye1) obj, iM19383z, iM19383z2, i5);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i7 |= 805306368;
            i17 = i4 | 54;
            i18 = i5 & 4096;
            if (i18 != 0) {
                i19 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (tj3Var.m22124i(zi3Var5)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i17 |= i20;
                }
                i19 = i17;
            }
            i21 = i5 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                int i310 = i19;
                if (tj3Var.m22122h(z2)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i310 | i22;
            }
            i24 = i23 | 24576;
            if ((i4 & 196608) == 0) {
                if (tj3Var.m22120g(hj4Var)) {
                    i33 = 131072;
                } else {
                    i33 = 65536;
                }
                i25 = i24 | i33;
            } else {
                i25 = i24;
            }
            i26 = i5 & 65536;
            if (i26 != 0) {
                i27 = i25 | 1572864;
            } else {
                i27 = i25 | (tj3Var.m22120g(gj4Var) ? 1048576 : 524288);
            }
            i28 = i5 & 131072;
            if (i28 != 0) {
                i27 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i27 |= tj3Var.m22122h(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) != 0) {
                if ((i5 & 262144) == 0) {
                    i13 = 67108864;
                }
                i27 |= i13;
            }
            int i311 = i27 | 805306368;
            if ((i5 & 2097152) == 0) {
                c = 16;
            } else {
                c = 16;
            }
            int i312 = 6 | c;
            if ((i5 & 4194304) == 0) {
                i29 = 128;
            } else {
                i29 = 128;
            }
            int i313 = i312 | i29;
            i30 = 1;
            i31 = i7;
            if ((i7 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (tj3Var.m22099R(i31 & 1, z5)) {
                tj3Var.m22104W();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i8 != 0) {
                        zi3Var6 = null;
                    }
                    if (i10 != 0) {
                        zi3Var7 = null;
                    }
                    if (i12 != 0) {
                        zi3Var8 = null;
                    }
                    if (i15 != 0) {
                        zi3Var14 = null;
                    } else {
                        zi3Var14 = zi3Var4;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    uk9 uk9Var3 = g9c.f40432f;
                    if (i26 != 0) {
                        gj4Var3 = gj4.f40872c;
                    } else {
                        gj4Var3 = gj4Var;
                    }
                    if (i28 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i32 = i;
                    } else if (z10) {
                        i32 = 1;
                    } else {
                        i32 = Integer.MAX_VALUE;
                    }
                    if ((i5 & 2097152) != 0) {
                        o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    } else {
                        o39VarM24271b = o39Var;
                    }
                    if ((i5 & 4194304) != 0) {
                        eu9VarM16904g = mkd.m16904g(tj3Var);
                    } else {
                        eu9VarM16904g = eu9Var;
                    }
                    zi3Var15 = zi3Var16;
                    z11 = z9;
                    gj4Var2 = gj4Var3;
                    z8 = z10;
                    uk9Var = uk9Var3;
                } else {
                    if (i35 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i8 != 0) {
                        zi3Var6 = null;
                    }
                    if (i10 != 0) {
                        zi3Var7 = null;
                    }
                    if (i12 != 0) {
                        zi3Var8 = null;
                    }
                    if (i15 != 0) {
                        zi3Var14 = null;
                    } else {
                        zi3Var14 = zi3Var4;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    uk9 uk9Var4 = g9c.f40432f;
                    if (i26 != 0) {
                        gj4Var3 = gj4.f40872c;
                    } else {
                        gj4Var3 = gj4Var;
                    }
                    if (i28 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i32 = i;
                    } else if (z10) {
                        i32 = 1;
                    } else {
                        i32 = Integer.MAX_VALUE;
                    }
                    if ((i5 & 2097152) != 0) {
                        o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    } else {
                        o39VarM24271b = o39Var;
                    }
                    if ((i5 & 4194304) != 0) {
                        eu9VarM16904g = mkd.m16904g(tj3Var);
                    } else {
                        eu9VarM16904g = eu9Var;
                    }
                    zi3Var15 = zi3Var16;
                    z11 = z9;
                    gj4Var2 = gj4Var3;
                    z8 = z10;
                    uk9Var = uk9Var4;
                }
                tj3Var.m22140r();
                tj3Var.m22111b0(488158419);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                }
                v56Var = (v56) objM22097O;
                tj3Var.m22139q(false);
                tj3Var.m22111b0(1401225826);
                jM23586c = vx9Var4.m23586c();
                if (jM23586c == 16) {
                    jM23586c = eu9VarM16904g.m11350e(z4, z11, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
                }
                long j2 = jM23586c;
                tj3Var.m22139q(false);
                final vx9 vx9VarM23588e2 = vx9Var4.m23588e(new vx9(j2, 0L, null, null, 0L, 0, 0L, 16777214));
                pvc.m19507c(nx9.f53367a.mo1265a(eu9VarM16904g.f37900k), ci8.m4703P(1459735400, new zi3() { // from class: xu9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String strM11661w = fa4.m11661w(tj3Var2, R$string.default_error_message);
                            e16 e16Var2 = e16Var;
                            final boolean z12 = z11;
                            e16 e16VarM4408a = c99.m4408a(AbstractC0246h.m1170e(e16Var2, z12, strM11661w), 280.0f, 56.0f);
                            final eu9 eu9Var3 = eu9VarM16904g;
                            pd9 pd9Var = new pd9(z12 ? eu9Var3.f37899j : eu9Var3.f37898i);
                            final String str2 = str;
                            final boolean z13 = z4;
                            final boolean z14 = z8;
                            final kwa kwaVar3 = uk9Var;
                            final v56 v56Var2 = v56Var;
                            final zi3 zi3Var17 = zi3Var6;
                            final zi3 zi3Var18 = zi3Var7;
                            final zi3 zi3Var19 = zi3Var8;
                            final zi3 zi3Var20 = zi3Var14;
                            final zi3 zi3Var21 = zi3Var15;
                            final o39 o39Var3 = o39VarM24271b;
                            db0.m10263b(str2, vi3Var, e16VarM4408a, z13, vx9VarM23588e2, hj4Var, gj4Var2, z14, i32, i30, kwaVar3, null, v56Var2, pd9Var, ci8.m4703P(1451491557, new aj3() { // from class: zu9
                                @Override // p000.aj3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    zi3 zi3Var22 = (zi3) obj3;
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var22) ? 4 : 2;
                                    }
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        mkd.f51459c.m16911c(str2, zi3Var22, z13, z14, kwaVar3, v56Var2, z12, zi3Var17, zi3Var18, zi3Var19, zi3Var20, zi3Var21, o39Var3, eu9Var3, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                    } else {
                                        tj3Var3.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var2), tj3Var2, 0, 4096);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 56);
                vx9Var3 = vx9Var4;
                eu9Var2 = eu9VarM16904g;
                z6 = z4;
                kwaVar2 = uk9Var;
                zi3Var11 = zi3Var6;
                zi3Var13 = zi3Var8;
                zi3Var9 = zi3Var14;
                zi3Var10 = zi3Var15;
                o39Var2 = o39VarM24271b;
                z7 = z11;
                zi3Var12 = zi3Var7;
            } else {
                tj3Var.m22102U();
                zi3Var9 = zi3Var4;
                zi3Var10 = zi3Var5;
                kwaVar2 = kwaVar;
                i32 = i;
                i30 = i2;
                o39Var2 = o39Var;
                eu9Var2 = eu9Var;
                vx9Var3 = vx9Var2;
                zi3Var11 = zi3Var6;
                zi3Var12 = zi3Var7;
                zi3Var13 = zi3Var8;
                z6 = z4;
                z7 = z2;
                gj4Var2 = gj4Var;
                z8 = z3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: yu9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        int iM19383z2 = pk9.m19383z(i4);
                        q6d.m19686c(str, vi3Var, e16Var, z6, vx9Var3, zi3Var11, zi3Var12, zi3Var13, zi3Var9, zi3Var10, z7, kwaVar2, hj4Var, gj4Var2, z8, i32, i30, o39Var2, eu9Var2, (ye1) obj, iM19383z, iM19383z2, i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i6 |= 3072;
        z4 = z;
        i7 = i6 | 24576;
        if ((i3 & 196608) == 0) {
            vx9Var2 = vx9Var;
            if ((i5 & 32) == 0) {
                i34 = 65536;
            } else {
                i34 = 65536;
            }
            i7 |= i34;
        } else {
            vx9Var2 = vx9Var;
        }
        i8 = i5 & 64;
        if (i8 != 0) {
            i7 |= 1572864;
            zi3Var6 = zi3Var;
        } else {
            zi3Var6 = zi3Var;
            if ((i3 & 1572864) == 0) {
                if (tj3Var.m22124i(zi3Var6)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
        }
        i10 = i5 & 128;
        if (i10 != 0) {
            i7 |= 12582912;
            zi3Var7 = zi3Var2;
        } else {
            zi3Var7 = zi3Var2;
            if ((i3 & 12582912) == 0) {
                if (tj3Var.m22124i(zi3Var7)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i7 |= i11;
            }
        }
        i12 = i5 & 256;
        i13 = 33554432;
        if (i12 != 0) {
            i7 |= 100663296;
            zi3Var8 = zi3Var3;
        } else {
            zi3Var8 = zi3Var3;
            if ((i3 & 100663296) == 0) {
                if (tj3Var.m22124i(zi3Var8)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i7 |= i14;
            }
        }
        i15 = i5 & 512;
        if (i15 != 0) {
            if ((i3 & 805306368) == 0) {
                if (tj3Var.m22124i(zi3Var4)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i7 |= i16;
            }
            i17 = i4 | 54;
            i18 = i5 & 4096;
            if (i18 != 0) {
                i19 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (tj3Var.m22124i(zi3Var5)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i17 |= i20;
                }
                i19 = i17;
            }
            i21 = i5 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                int i314 = i19;
                if (tj3Var.m22122h(z2)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i314 | i22;
            }
            i24 = i23 | 24576;
            if ((i4 & 196608) == 0) {
                if (tj3Var.m22120g(hj4Var)) {
                    i33 = 131072;
                } else {
                    i33 = 65536;
                }
                i25 = i24 | i33;
            } else {
                i25 = i24;
            }
            i26 = i5 & 65536;
            if (i26 != 0) {
                i27 = i25 | 1572864;
            } else {
                i27 = i25 | (tj3Var.m22120g(gj4Var) ? 1048576 : 524288);
            }
            i28 = i5 & 131072;
            if (i28 != 0) {
                i27 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i27 |= tj3Var.m22122h(z3) ? 8388608 : 4194304;
            }
            if ((i4 & 100663296) != 0) {
                if ((i5 & 262144) == 0) {
                    i13 = 67108864;
                }
                i27 |= i13;
            }
            int i315 = i27 | 805306368;
            if ((i5 & 2097152) == 0) {
                c = 16;
            } else {
                c = 16;
            }
            int i316 = 6 | c;
            if ((i5 & 4194304) == 0) {
                i29 = 128;
            } else {
                i29 = 128;
            }
            int i317 = i316 | i29;
            i30 = 1;
            i31 = i7;
            if ((i7 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (tj3Var.m22099R(i31 & 1, z5)) {
                tj3Var.m22104W();
                if ((i3 & 1) != 0) {
                    if (i35 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i8 != 0) {
                        zi3Var6 = null;
                    }
                    if (i10 != 0) {
                        zi3Var7 = null;
                    }
                    if (i12 != 0) {
                        zi3Var8 = null;
                    }
                    if (i15 != 0) {
                        zi3Var14 = null;
                    } else {
                        zi3Var14 = zi3Var4;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    uk9 uk9Var5 = g9c.f40432f;
                    if (i26 != 0) {
                        gj4Var3 = gj4.f40872c;
                    } else {
                        gj4Var3 = gj4Var;
                    }
                    if (i28 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i32 = i;
                    } else if (z10) {
                        i32 = 1;
                    } else {
                        i32 = Integer.MAX_VALUE;
                    }
                    if ((i5 & 2097152) != 0) {
                        o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    } else {
                        o39VarM24271b = o39Var;
                    }
                    if ((i5 & 4194304) != 0) {
                        eu9VarM16904g = mkd.m16904g(tj3Var);
                    } else {
                        eu9VarM16904g = eu9Var;
                    }
                    zi3Var15 = zi3Var16;
                    z11 = z9;
                    gj4Var2 = gj4Var3;
                    z8 = z10;
                    uk9Var = uk9Var5;
                } else {
                    if (i35 != 0) {
                        z4 = true;
                    }
                    if ((i5 & 32) != 0) {
                        vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i8 != 0) {
                        zi3Var6 = null;
                    }
                    if (i10 != 0) {
                        zi3Var7 = null;
                    }
                    if (i12 != 0) {
                        zi3Var8 = null;
                    }
                    if (i15 != 0) {
                        zi3Var14 = null;
                    } else {
                        zi3Var14 = zi3Var4;
                    }
                    if (i18 == 0) {
                    }
                    if (i21 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    uk9 uk9Var6 = g9c.f40432f;
                    if (i26 != 0) {
                        gj4Var3 = gj4.f40872c;
                    } else {
                        gj4Var3 = gj4Var;
                    }
                    if (i28 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 262144) == 0) {
                        i32 = i;
                    } else if (z10) {
                        i32 = 1;
                    } else {
                        i32 = Integer.MAX_VALUE;
                    }
                    if ((i5 & 2097152) != 0) {
                        o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                    } else {
                        o39VarM24271b = o39Var;
                    }
                    if ((i5 & 4194304) != 0) {
                        eu9VarM16904g = mkd.m16904g(tj3Var);
                    } else {
                        eu9VarM16904g = eu9Var;
                    }
                    zi3Var15 = zi3Var16;
                    z11 = z9;
                    gj4Var2 = gj4Var3;
                    z8 = z10;
                    uk9Var = uk9Var6;
                }
                tj3Var.m22140r();
                tj3Var.m22111b0(488158419);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                }
                v56Var = (v56) objM22097O;
                tj3Var.m22139q(false);
                tj3Var.m22111b0(1401225826);
                jM23586c = vx9Var4.m23586c();
                if (jM23586c == 16) {
                    jM23586c = eu9VarM16904g.m11350e(z4, z11, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
                }
                long j3 = jM23586c;
                tj3Var.m22139q(false);
                final vx9 vx9VarM23588e3 = vx9Var4.m23588e(new vx9(j3, 0L, null, null, 0L, 0, 0L, 16777214));
                pvc.m19507c(nx9.f53367a.mo1265a(eu9VarM16904g.f37900k), ci8.m4703P(1459735400, new zi3() { // from class: xu9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String strM11661w = fa4.m11661w(tj3Var2, R$string.default_error_message);
                            e16 e16Var2 = e16Var;
                            final boolean z12 = z11;
                            e16 e16VarM4408a = c99.m4408a(AbstractC0246h.m1170e(e16Var2, z12, strM11661w), 280.0f, 56.0f);
                            final eu9 eu9Var3 = eu9VarM16904g;
                            pd9 pd9Var = new pd9(z12 ? eu9Var3.f37899j : eu9Var3.f37898i);
                            final String str2 = str;
                            final boolean z13 = z4;
                            final boolean z14 = z8;
                            final kwa kwaVar3 = uk9Var;
                            final v56 v56Var2 = v56Var;
                            final zi3 zi3Var17 = zi3Var6;
                            final zi3 zi3Var18 = zi3Var7;
                            final zi3 zi3Var19 = zi3Var8;
                            final zi3 zi3Var20 = zi3Var14;
                            final zi3 zi3Var21 = zi3Var15;
                            final o39 o39Var3 = o39VarM24271b;
                            db0.m10263b(str2, vi3Var, e16VarM4408a, z13, vx9VarM23588e3, hj4Var, gj4Var2, z14, i32, i30, kwaVar3, null, v56Var2, pd9Var, ci8.m4703P(1451491557, new aj3() { // from class: zu9
                                @Override // p000.aj3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    zi3 zi3Var22 = (zi3) obj3;
                                    ye1 ye1Var3 = (ye1) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var22) ? 4 : 2;
                                    }
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        mkd.f51459c.m16911c(str2, zi3Var22, z13, z14, kwaVar3, v56Var2, z12, zi3Var17, zi3Var18, zi3Var19, zi3Var20, zi3Var21, o39Var3, eu9Var3, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                    } else {
                                        tj3Var3.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var2), tj3Var2, 0, 4096);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 56);
                vx9Var3 = vx9Var4;
                eu9Var2 = eu9VarM16904g;
                z6 = z4;
                kwaVar2 = uk9Var;
                zi3Var11 = zi3Var6;
                zi3Var13 = zi3Var8;
                zi3Var9 = zi3Var14;
                zi3Var10 = zi3Var15;
                o39Var2 = o39VarM24271b;
                z7 = z11;
                zi3Var12 = zi3Var7;
            } else {
                tj3Var.m22102U();
                zi3Var9 = zi3Var4;
                zi3Var10 = zi3Var5;
                kwaVar2 = kwaVar;
                i32 = i;
                i30 = i2;
                o39Var2 = o39Var;
                eu9Var2 = eu9Var;
                vx9Var3 = vx9Var2;
                zi3Var11 = zi3Var6;
                zi3Var12 = zi3Var7;
                zi3Var13 = zi3Var8;
                z6 = z4;
                z7 = z2;
                gj4Var2 = gj4Var;
                z8 = z3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: yu9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        int iM19383z2 = pk9.m19383z(i4);
                        q6d.m19686c(str, vi3Var, e16Var, z6, vx9Var3, zi3Var11, zi3Var12, zi3Var13, zi3Var9, zi3Var10, z7, kwaVar2, hj4Var, gj4Var2, z8, i32, i30, o39Var2, eu9Var2, (ye1) obj, iM19383z, iM19383z2, i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i7 |= 805306368;
        i17 = i4 | 54;
        i18 = i5 & 4096;
        if (i18 != 0) {
            i19 = i4 | 438;
        } else {
            if ((i4 & 384) != 0) {
                if (tj3Var.m22124i(zi3Var5)) {
                    i20 = 256;
                } else {
                    i20 = 128;
                }
                i17 |= i20;
            }
            i19 = i17;
        }
        i21 = i5 & 8192;
        if (i21 != 0) {
            i23 = i19 | 3072;
        } else {
            int i318 = i19;
            if (tj3Var.m22122h(z2)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i23 = i318 | i22;
        }
        i24 = i23 | 24576;
        if ((i4 & 196608) == 0) {
            if (tj3Var.m22120g(hj4Var)) {
                i33 = 131072;
            } else {
                i33 = 65536;
            }
            i25 = i24 | i33;
        } else {
            i25 = i24;
        }
        i26 = i5 & 65536;
        if (i26 != 0) {
            i27 = i25 | 1572864;
        } else {
            i27 = i25 | (tj3Var.m22120g(gj4Var) ? 1048576 : 524288);
        }
        i28 = i5 & 131072;
        if (i28 != 0) {
            i27 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i27 |= tj3Var.m22122h(z3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) != 0) {
            if ((i5 & 262144) == 0) {
                i13 = 67108864;
            }
            i27 |= i13;
        }
        int i319 = i27 | 805306368;
        if ((i5 & 2097152) == 0) {
            c = 16;
        } else {
            c = 16;
        }
        int i3110 = 6 | c;
        if ((i5 & 4194304) == 0) {
            i29 = 128;
        } else {
            i29 = 128;
        }
        int i3111 = i3110 | i29;
        i30 = 1;
        i31 = i7;
        if ((i7 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (tj3Var.m22099R(i31 & 1, z5)) {
            tj3Var.m22104W();
            if ((i3 & 1) != 0) {
                if (i35 != 0) {
                    z4 = true;
                }
                if ((i5 & 32) != 0) {
                    vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                } else {
                    vx9Var4 = vx9Var2;
                }
                if (i8 != 0) {
                    zi3Var6 = null;
                }
                if (i10 != 0) {
                    zi3Var7 = null;
                }
                if (i12 != 0) {
                    zi3Var8 = null;
                }
                if (i15 != 0) {
                    zi3Var14 = null;
                } else {
                    zi3Var14 = zi3Var4;
                }
                if (i18 == 0) {
                }
                if (i21 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                uk9 uk9Var7 = g9c.f40432f;
                if (i26 != 0) {
                    gj4Var3 = gj4.f40872c;
                } else {
                    gj4Var3 = gj4Var;
                }
                if (i28 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 262144) == 0) {
                    i32 = i;
                } else if (z10) {
                    i32 = 1;
                } else {
                    i32 = Integer.MAX_VALUE;
                }
                if ((i5 & 2097152) != 0) {
                    o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                } else {
                    o39VarM24271b = o39Var;
                }
                if ((i5 & 4194304) != 0) {
                    eu9VarM16904g = mkd.m16904g(tj3Var);
                } else {
                    eu9VarM16904g = eu9Var;
                }
                zi3Var15 = zi3Var16;
                z11 = z9;
                gj4Var2 = gj4Var3;
                z8 = z10;
                uk9Var = uk9Var7;
            } else {
                if (i35 != 0) {
                    z4 = true;
                }
                if ((i5 & 32) != 0) {
                    vx9Var4 = (vx9) tj3Var.m22128k(lw9.f50220a);
                } else {
                    vx9Var4 = vx9Var2;
                }
                if (i8 != 0) {
                    zi3Var6 = null;
                }
                if (i10 != 0) {
                    zi3Var7 = null;
                }
                if (i12 != 0) {
                    zi3Var8 = null;
                }
                if (i15 != 0) {
                    zi3Var14 = null;
                } else {
                    zi3Var14 = zi3Var4;
                }
                if (i18 == 0) {
                }
                if (i21 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                uk9 uk9Var8 = g9c.f40432f;
                if (i26 != 0) {
                    gj4Var3 = gj4.f40872c;
                } else {
                    gj4Var3 = gj4Var;
                }
                if (i28 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 262144) == 0) {
                    i32 = i;
                } else if (z10) {
                    i32 = 1;
                } else {
                    i32 = Integer.MAX_VALUE;
                }
                if ((i5 & 2097152) != 0) {
                    o39VarM24271b = x49.m24271b(c43.f9451d, tj3Var);
                } else {
                    o39VarM24271b = o39Var;
                }
                if ((i5 & 4194304) != 0) {
                    eu9VarM16904g = mkd.m16904g(tj3Var);
                } else {
                    eu9VarM16904g = eu9Var;
                }
                zi3Var15 = zi3Var16;
                z11 = z9;
                gj4Var2 = gj4Var3;
                z8 = z10;
                uk9Var = uk9Var8;
            }
            tj3Var.m22140r();
            tj3Var.m22111b0(488158419);
            objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var);
            }
            v56Var = (v56) objM22097O;
            tj3Var.m22139q(false);
            tj3Var.m22111b0(1401225826);
            jM23586c = vx9Var4.m23586c();
            if (jM23586c == 16) {
                jM23586c = eu9VarM16904g.m11350e(z4, z11, ((Boolean) AbstractC0122a.m957a(v56Var, tj3Var, 0).getValue()).booleanValue());
            }
            long j4 = jM23586c;
            tj3Var.m22139q(false);
            final vx9 vx9VarM23588e4 = vx9Var4.m23588e(new vx9(j4, 0L, null, null, 0L, 0, 0L, 16777214));
            pvc.m19507c(nx9.f53367a.mo1265a(eu9VarM16904g.f37900k), ci8.m4703P(1459735400, new zi3() { // from class: xu9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strM11661w = fa4.m11661w(tj3Var2, R$string.default_error_message);
                        e16 e16Var2 = e16Var;
                        final boolean z12 = z11;
                        e16 e16VarM4408a = c99.m4408a(AbstractC0246h.m1170e(e16Var2, z12, strM11661w), 280.0f, 56.0f);
                        final eu9 eu9Var3 = eu9VarM16904g;
                        pd9 pd9Var = new pd9(z12 ? eu9Var3.f37899j : eu9Var3.f37898i);
                        final String str2 = str;
                        final boolean z13 = z4;
                        final boolean z14 = z8;
                        final kwa kwaVar3 = uk9Var;
                        final v56 v56Var2 = v56Var;
                        final zi3 zi3Var17 = zi3Var6;
                        final zi3 zi3Var18 = zi3Var7;
                        final zi3 zi3Var19 = zi3Var8;
                        final zi3 zi3Var20 = zi3Var14;
                        final zi3 zi3Var21 = zi3Var15;
                        final o39 o39Var3 = o39VarM24271b;
                        db0.m10263b(str2, vi3Var, e16VarM4408a, z13, vx9VarM23588e4, hj4Var, gj4Var2, z14, i32, i30, kwaVar3, null, v56Var2, pd9Var, ci8.m4703P(1451491557, new aj3() { // from class: zu9
                            @Override // p000.aj3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                zi3 zi3Var22 = (zi3) obj3;
                                ye1 ye1Var3 = (ye1) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((tj3) ye1Var3).m22124i(zi3Var22) ? 4 : 2;
                                }
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    mkd.f51459c.m16911c(str2, zi3Var22, z13, z14, kwaVar3, v56Var2, z12, zi3Var17, zi3Var18, zi3Var19, zi3Var20, zi3Var21, o39Var3, eu9Var3, null, null, tj3Var3, (iIntValue2 << 3) & 112);
                                } else {
                                    tj3Var3.m22102U();
                                }
                                return xfa.f68157a;
                            }
                        }, tj3Var2), tj3Var2, 0, 4096);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 56);
            vx9Var3 = vx9Var4;
            eu9Var2 = eu9VarM16904g;
            z6 = z4;
            kwaVar2 = uk9Var;
            zi3Var11 = zi3Var6;
            zi3Var13 = zi3Var8;
            zi3Var9 = zi3Var14;
            zi3Var10 = zi3Var15;
            o39Var2 = o39VarM24271b;
            z7 = z11;
            zi3Var12 = zi3Var7;
        } else {
            tj3Var.m22102U();
            zi3Var9 = zi3Var4;
            zi3Var10 = zi3Var5;
            kwaVar2 = kwaVar;
            i32 = i;
            i30 = i2;
            o39Var2 = o39Var;
            eu9Var2 = eu9Var;
            vx9Var3 = vx9Var2;
            zi3Var11 = zi3Var6;
            zi3Var12 = zi3Var7;
            zi3Var13 = zi3Var8;
            z6 = z4;
            z7 = z2;
            gj4Var2 = gj4Var;
            z8 = z3;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: yu9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    int iM19383z2 = pk9.m19383z(i4);
                    q6d.m19686c(str, vi3Var, e16Var, z6, vx9Var3, zi3Var11, zi3Var12, zi3Var13, zi3Var9, zi3Var10, z7, kwaVar2, hj4Var, gj4Var2, z8, i32, i30, o39Var2, eu9Var2, (ye1) obj, iM19383z, iM19383z2, i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:237:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:240:0x0505  */
    /* JADX WARN: Code duplicated, block: B:241:0x0509  */
    /* JADX INFO: renamed from: d */
    public static final void m19687d(zi3 zi3Var, final zi3 zi3Var2, aj3 aj3Var, final zi3 zi3Var3, final zi3 zi3Var4, final zi3 zi3Var5, final zi3 zi3Var6, final boolean z, final cv9 cv9Var, su9 su9Var, final su9 su9Var2, final su9 su9Var3, final C0282a c0282a, zi3 zi3Var7, final t17 t17Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        zi3 zi3Var8;
        aj3 aj3Var2;
        zi3 zi3Var9;
        su9 su9Var4;
        tj3 tj3Var;
        Object fv9Var;
        t17 t17Var2;
        tj3 tj3Var2;
        gc0 gc0Var;
        boolean z2;
        zi3 zi3Var10;
        gc0 gc0Var2;
        zi3 zi3Var11;
        float f;
        zi3 zi3Var12;
        aj3 aj3Var3;
        zi3 zi3Var13;
        boolean z3;
        boolean z4;
        Object objM22097O;
        zi3 zi3Var14 = zi3Var4;
        gc0 gc0Var3 = nj0.f52812g;
        gc0 gc0Var4 = nj0.f52808c;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-1552532491);
        int i5 = i & 6;
        b16 b16Var = b16.f7762a;
        if (i5 == 0) {
            i3 = i | (tj3Var3.m22120g(b16Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var3.m22124i(zi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var3.m22124i(zi3Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var3.m22124i(aj3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var3.m22124i(zi3Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= tj3Var3.m22124i(zi3Var14) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= tj3Var3.m22124i(zi3Var5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var3.m22124i(zi3Var6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var3.m22122h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var3.m22120g(cv9Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? tj3Var3.m22120g(su9Var) : tj3Var3.m22124i(su9Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? tj3Var3.m22120g(su9Var2) : tj3Var3.m22124i(su9Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? tj3Var3.m22120g(su9Var3) : tj3Var3.m22124i(su9Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var3.m22124i(c0282a) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= tj3Var3.m22124i(zi3Var7) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= tj3Var3.m22120g(t17Var) ? 131072 : 65536;
        }
        int i6 = i4;
        if (tj3Var3.m22099R(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true)) {
            float fM1172g = AbstractC0246h.m1172g(tj3Var3);
            int i7 = i6 & 14;
            boolean zM22114d = ((458752 & i6) == 131072) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && tj3Var3.m22120g(su9Var))) | ((i6 & 112) == 32 || ((i6 & 64) != 0 && tj3Var3.m22120g(su9Var2))) | ((i6 & 896) == 256 || ((i6 & 512) != 0 && tj3Var3.m22120g(su9Var3))) | tj3Var3.m22114d(fM1172g);
            Object objM22097O2 = tj3Var3.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22114d || objM22097O2 == p84Var) {
                tj3 tj3Var4 = tj3Var3;
                fv9Var = new fv9(z, cv9Var, su9Var, su9Var2, su9Var3, t17Var, fM1172g);
                t17Var2 = t17Var;
                tj3Var4.m22131l0(fv9Var);
                tj3Var2 = tj3Var4;
            } else {
                fv9Var = objM22097O2;
                tj3Var2 = tj3Var3;
                t17Var2 = t17Var;
            }
            fv9 fv9Var2 = (fv9) fv9Var;
            LayoutDirection layoutDirection = (LayoutDirection) tj3Var2.m22128k(AbstractC0402n.f4822n);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var15 = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var15, fv9Var2);
            zi3 zi3Var16 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var17 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var17, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var);
            zi3 zi3Var18 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var18, e16VarM1322c);
            c0282a.invoke(tj3Var2, Integer.valueOf((i6 >> 9) & 14));
            c06 c06Var = c06.f9271b;
            if (zi3Var3 != null) {
                tj3Var2.m22111b0(993153366);
                e16 e16VarM15961x = l70.m15961x(b16Var, "Leading");
                iv3 iv3Var = AbstractC0262s.f3627a;
                e16 e16VarMo3161g = e16VarM15961x.mo3161g(c06Var);
                ht5 ht5VarM19966d = qh0.m19966d(r16, false);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g);
                tj3Var2.m22119f0();
                gc0Var = gc0Var3;
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d);
                oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var18, e16VarM1322c2);
                zi3Var3.invoke(tj3Var2, Integer.valueOf((i3 >> 12) & 14));
                tj3Var2.m22139q(true);
                z2 = false;
                tj3Var2.m22139q(false);
            } else {
                gc0Var = r16;
                z2 = false;
                tj3Var2.m22111b0(993399382);
                tj3Var2.m22139q(false);
            }
            if (zi3Var14 != null) {
                tj3Var2.m22111b0(993442100);
                e16 e16VarM15961x2 = l70.m15961x(b16Var, "Trailing");
                iv3 iv3Var2 = AbstractC0262s.f3627a;
                e16 e16VarMo3161g2 = e16VarM15961x2.mo3161g(c06Var);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, z2);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g2);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d2);
                oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var18, e16VarM1322c3);
                zi3 zi3Var19 = zi3Var4;
                zi3Var19.invoke(tj3Var2, Integer.valueOf((i3 >> 15) & 14));
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
                zi3Var10 = zi3Var19;
            } else {
                tj3Var2.m22111b0(993690038);
                tj3Var2.m22139q(z2);
                zi3Var10 = zi3Var14;
            }
            float fM21643u = AbstractC3584sr.m21643u(t17Var2, layoutDirection);
            float fM21642t = AbstractC3584sr.m21642t(t17Var2, layoutDirection);
            float fM1173h = AbstractC0246h.m1173h(tj3Var2);
            if (zi3Var3 != null) {
                fM21643u -= fM1173h;
                if (fM21643u < 0.0f) {
                    fM21643u = 0.0f;
                }
            }
            float f2 = fM21643u;
            if (zi3Var10 != null) {
                fM21642t -= fM1173h;
                if (fM21642t < 0.0f) {
                    fM21642t = 0.0f;
                }
            }
            if (zi3Var5 != null) {
                tj3Var2.m22111b0(994466433);
                e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4429v(c99.m4416i(l70.m15961x(b16Var, "Prefix"), 24.0f, 0.0f, 2)), f2, 0.0f, 2.0f, 0.0f, 10);
                gc0Var2 = gc0Var4;
                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var2, false);
                int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m4 = tj3Var2.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d3);
                oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var18, e16VarM1322c4);
                zi3Var5.invoke(tj3Var2, Integer.valueOf((i3 >> 18) & 14));
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
            } else {
                gc0Var2 = gc0Var4;
                tj3Var2.m22111b0(994794134);
                tj3Var2.m22139q(false);
            }
            if (zi3Var6 != null) {
                tj3Var2.m22111b0(994837379);
                f = fM21642t;
                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4429v(c99.m4416i(l70.m15961x(b16Var, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f, 0.0f, 10);
                ht5 ht5VarM19966d4 = qh0.m19966d(gc0Var2, false);
                zi3Var12 = zi3Var18;
                int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m5 = tj3Var2.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X2);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d4);
                oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var12, e16VarM1322c5);
                zi3 zi3Var20 = zi3Var6;
                zi3Var20.invoke(tj3Var2, Integer.valueOf((i3 >> 21) & 14));
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
                zi3Var11 = zi3Var20;
            } else {
                zi3Var11 = zi3Var6;
                f = fM21642t;
                zi3Var12 = zi3Var18;
                tj3Var2.m22111b0(995163158);
                tj3Var2.m22139q(false);
            }
            gc0 gc0Var5 = gc0Var2;
            e16 e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var, f2, 0.0f, f, 0.0f, 10);
            if (zi3Var2 != null) {
                tj3Var2.m22111b0(995662971);
                e16 e16VarM15961x3 = l70.m15961x(b16Var, "Label");
                if (i7 != 4) {
                    if ((i6 & 8) != 0) {
                        su9Var4 = su9Var;
                        if (tj3Var2.m22124i(su9Var4)) {
                        }
                        objM22097O = tj3Var2.m22097O();
                        if (z4 || objM22097O == p84Var) {
                            objM22097O = new br8(su9Var4, 7);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        e16 e16VarMo3161g3 = c99.m4429v(te1.m21968A(e16VarM15961x3, new rm0((ui3) objM22097O, 13))).mo3161g(e16VarM21611X3);
                        ht5 ht5VarM19966d5 = qh0.m19966d(gc0Var5, false);
                        int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m6 = tj3Var2.m22132m();
                        e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g3);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d5);
                        oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m6);
                        AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                        oha.m18001g(tj3Var2, zi3Var12, e16VarM1322c6);
                        zi3Var2.invoke(tj3Var2, Integer.valueOf((i3 >> 6) & 14));
                        tj3Var2.m22139q(true);
                        tj3Var2.m22139q(false);
                    } else {
                        su9Var4 = su9Var;
                    }
                    z4 = false;
                    objM22097O = tj3Var2.m22097O();
                    if (z4) {
                        objM22097O = new br8(su9Var4, 7);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new br8(su9Var4, 7);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    e16 e16VarMo3161g4 = c99.m4429v(te1.m21968A(e16VarM15961x3, new rm0((ui3) objM22097O, 13))).mo3161g(e16VarM21611X3);
                    ht5 ht5VarM19966d6 = qh0.m19966d(gc0Var5, false);
                    int iHashCode7 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m7 = tj3Var2.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g4);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d6);
                    oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                    oha.m18001g(tj3Var2, zi3Var12, e16VarM1322c7);
                    zi3Var2.invoke(tj3Var2, Integer.valueOf((i3 >> 6) & 14));
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(false);
                } else {
                    su9Var4 = su9Var;
                }
                z4 = true;
                objM22097O = tj3Var2.m22097O();
                if (z4) {
                    objM22097O = new br8(su9Var4, 7);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = new br8(su9Var4, 7);
                    tj3Var2.m22131l0(objM22097O);
                }
                e16 e16VarMo3161g5 = c99.m4429v(te1.m21968A(e16VarM15961x3, new rm0((ui3) objM22097O, 13))).mo3161g(e16VarM21611X3);
                ht5 ht5VarM19966d7 = qh0.m19966d(gc0Var5, false);
                int iHashCode8 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m8 = tj3Var2.m22132m();
                e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g5);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d7);
                oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m8);
                AbstractC3393o1.m17747v(iHashCode8, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var12, e16VarM1322c8);
                zi3Var2.invoke(tj3Var2, Integer.valueOf((i3 >> 6) & 14));
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
            } else {
                su9Var4 = su9Var;
                tj3Var2.m22111b0(996057942);
                tj3Var2.m22139q(false);
            }
            e16 e16VarM21611X4 = AbstractC3584sr.m21611X(c99.m4429v(c99.m4416i(b16Var, 24.0f, 0.0f, 2)), zi3Var5 == null ? f2 : 0.0f, 0.0f, zi3Var11 == null ? f : 0.0f, 0.0f, 10);
            if (aj3Var != null) {
                tj3Var2.m22111b0(996427927);
                aj3 aj3Var4 = aj3Var;
                aj3Var4.invoke(l70.m15961x(b16Var, "Hint").mo3161g(e16VarM21611X4), tj3Var2, Integer.valueOf((i3 >> 6) & 112));
                tj3Var2.m22139q(false);
                aj3Var3 = aj3Var4;
            } else {
                aj3Var3 = aj3Var;
                tj3Var2.m22111b0(996519222);
                tj3Var2.m22139q(false);
            }
            e16 e16VarMo3161g6 = l70.m15961x(b16Var, "TextField").mo3161g(e16VarM21611X4);
            ht5 ht5VarM19966d8 = qh0.m19966d(gc0Var5, true);
            int iHashCode9 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m9 = tj3Var2.m22132m();
            e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g6);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d8);
            oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m9);
            AbstractC3393o1.m17747v(iHashCode9, tj3Var2, zi3Var17, tj3Var2, vi3Var);
            oha.m18001g(tj3Var2, zi3Var12, e16VarM1322c9);
            zi3 zi3Var21 = zi3Var;
            zi3Var21.invoke(tj3Var2, Integer.valueOf((i3 >> 3) & 14));
            tj3Var2.m22139q(true);
            if (zi3Var7 != null) {
                tj3Var2.m22111b0(996767873);
                e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4429v(c99.m4416i(l70.m15961x(b16Var, "Supporting"), 16.0f, 0.0f, 2)), new x17(16.0f, 4.0f, 16.0f, 0.0f));
                ht5 ht5VarM19966d9 = qh0.m19966d(gc0Var5, false);
                int iHashCode10 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m10 = tj3Var2.m22132m();
                e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var2, e16VarM21606S);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var15, ht5VarM19966d9);
                oha.m18001g(tj3Var2, zi3Var16, l77VarM22132m10);
                AbstractC3393o1.m17747v(iHashCode10, tj3Var2, zi3Var17, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var12, e16VarM1322c10);
                zi3 zi3Var22 = zi3Var7;
                zi3Var22.invoke(tj3Var2, Integer.valueOf((i6 >> 12) & 14));
                z3 = true;
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
                zi3Var13 = zi3Var22;
            } else {
                zi3Var13 = zi3Var7;
                z3 = true;
                tj3Var2.m22111b0(997157078);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(z3);
            tj3Var = tj3Var2;
            zi3Var8 = zi3Var21;
            zi3Var9 = zi3Var13;
            aj3Var2 = aj3Var3;
        } else {
            zi3Var8 = zi3Var;
            aj3Var2 = aj3Var;
            zi3Var9 = zi3Var7;
            su9Var4 = su9Var;
            tj3 tj3Var5 = tj3Var3;
            tj3Var5.m22102U();
            tj3Var = tj3Var5;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final zi3 zi3Var23 = zi3Var8;
            final zi3 zi3Var24 = zi3Var9;
            final su9 su9Var5 = su9Var4;
            final aj3 aj3Var5 = aj3Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: wu9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    q6d.m19687d(zi3Var23, zi3Var2, aj3Var5, zi3Var3, zi3Var4, zi3Var5, zi3Var6, z, cv9Var, su9Var5, su9Var2, su9Var3, c0282a, zi3Var24, t17Var, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
