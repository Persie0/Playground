package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kxb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f48569a = new C0282a(-1474199164, false, new sd1(15));

    /* JADX INFO: renamed from: a */
    public static final void m15715a(int i, long j, ye1 ye1Var, String str) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1520831815);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22118f(j) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new ie1(9);
                tj3Var.m22131l0(objM22097O);
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM21968A = te1.m21968A(b16Var, (aj3) objM22097O);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21968A);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(str, AbstractC0309d.m1407b(b16Var, 0.0f, 0.0f, 0.0f, 0.0f, -90.0f, 0L, null, false, 1048319), j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71411o, tj3Var, (i2 & 14) | ((i2 << 3) & 896), 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rx0(str, i, j);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m15716b(final zu0 zu0Var, final ev0 ev0Var, final hv0 hv0Var, final float f, final e16 e16Var, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(481375474);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(zu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(ev0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(hv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22114d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            pk9.m19366a(c99.m4414g(e16Var, f), null, ci8.m4703P(1666361180, new a05(zu0Var, hv0Var, ev0Var, 5), tj3Var), tj3Var, 3072);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: zv6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kxb.m15716b(zu0Var, ev0Var, hv0Var, f, e16Var, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m15717c(final int i, final String str, final float f, final long j, final e16 e16Var, ye1 ye1Var, final int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-607006711);
        int i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22114d(f) ? 256 : 128) | (tj3Var.m22118f(j) ? 2048 : 1024) | (tj3Var.m22120g(e16Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            y27 y27VarM18236U = AbstractC3423or.m18236U(i, tj3Var, i3 & 14);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4422o = c99.m4422o(b16Var, f);
            si8 si8Var = ui8.f63972a;
            e16 e16VarM19045o = pb1.m19045o(e16VarM4422o, si8Var);
            vh9 vh9Var = ps5.f56764b;
            bq1.m4042R(y27VarM18236U, null, r46.m20387m(e16VarM19045o, 2.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, si8Var), null, hl1.f42564a, 0.0f, null, tj3Var, 24632, 104);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, 4.0f));
            lw9.m16554b(str, null, j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71411o, tj3Var, (i3 >> 3) & 910, 0, 130042);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i, str, f, j, e16Var, i2) { // from class: yv6

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f70553a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f70554b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ float f70555c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f70556d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ e16 f70557e;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    kxb.m15717c(this.f70553a, this.f70554b, this.f70555c, this.f70556d, this.f70557e, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c4  */
    /* JADX INFO: renamed from: d */
    public static final void m15718d(final ei0 ei0Var, final av0 av0Var, final float f, final float f2, final float f3, final ev0 ev0Var, ye1 ye1Var, final int i) {
        ei0 ei0Var2;
        int i2;
        Object obj;
        p84 p84Var;
        p84 p84Var2;
        final t66 t66Var;
        Object obj2;
        String str;
        Object objM22097O;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1848756368);
        if ((i & 6) == 0) {
            ei0Var2 = ei0Var;
            i2 = (tj3Var.m22120g(ei0Var2) ? 4 : 2) | i;
        } else {
            ei0Var2 = ei0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(av0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22114d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22114d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22114d(f3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22120g(ev0Var) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            Object objM22097O2 = tj3Var.m22097O();
            p84 p84Var3 = we1.f66679a;
            if (objM22097O2 == p84Var3) {
                objM22097O2 = AbstractC0278f.m1260j(new n84(0L));
                tj3Var.m22131l0(objM22097O2);
            }
            final t66 t66Var2 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var3) {
                objM22097O3 = AbstractC0278f.m1260j(new n84(0L));
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var3 = (t66) objM22097O3;
            int i3 = ev0Var.f37924c;
            String str2 = ev0Var.f37922a;
            float f4 = ev0Var.f37926e;
            int i4 = i2;
            long j = ev0Var.f37927f;
            gc0 gc0Var = nj0.f52808c;
            ei0Var2.getClass();
            ci0 ci0Var = ci0.f10109a;
            b16 b16Var = b16.f7762a;
            e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, gc0Var);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            int i6 = i4 & 896;
            boolean z2 = z | (i6 == 256) | ((i4 & 7168) == 2048);
            Object objM22097O4 = tj3Var.m22097O();
            if (z2 || objM22097O4 == p84Var3) {
                final int i7 = 0;
                p84Var = p84Var3;
                obj = new vi3() { // from class: aw6
                    @Override // p000.vi3
                    public final Object invoke(Object obj3) {
                        int i8 = i7;
                        t66 t66Var4 = t66Var2;
                        float f5 = f2;
                        float f6 = f;
                        av0 av0Var2 = av0Var;
                        fb2 fb2Var = (fb2) obj3;
                        switch (i8) {
                            case 0:
                                fb2Var.getClass();
                                break;
                            default:
                                fb2Var.getClass();
                                break;
                        }
                        return new f84(kxb.m15720f(av0Var2, f6, f5, ((n84) t66Var4.getValue()).f52482a));
                    }
                };
                tj3Var.m22131l0(obj);
            } else {
                obj = objM22097O4;
                p84Var = p84Var3;
            }
            e16 e16VarM19527w = pvc.m19527w(e16VarMo3727a, (vi3) obj);
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new dt6(3, t66Var2);
                tj3Var.m22131l0(objM22097O5);
            }
            e16 e16VarM19025M = pb1.m19025M(e16VarM19527w, (vi3) objM22097O5);
            p84 p84Var4 = p84Var;
            m15717c(i3, str2, f4, j, e16VarM19025M, tj3Var, 0);
            int i8 = ev0Var.f37925d;
            String str3 = ev0Var.f37923b;
            float f5 = ev0Var.f37926e;
            long j2 = ev0Var.f37927f;
            e16 e16VarMo3727a2 = ci0Var.mo3727a(b16Var, gc0Var);
            boolean z3 = (i5 == 32) | (i6 == 256) | ((i4 & 57344) == 16384);
            Object objM22097O6 = tj3Var.m22097O();
            if (z3) {
                p84Var2 = p84Var4;
            } else {
                p84Var2 = p84Var4;
                if (objM22097O6 != p84Var2) {
                    obj2 = objM22097O6;
                    str = str3;
                    t66Var = t66Var3;
                }
                e16 e16VarM19527w2 = pvc.m19527w(e16VarMo3727a2, (vi3) obj2);
                objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var2) {
                    objM22097O = new dt6(2, t66Var);
                    tj3Var.m22131l0(objM22097O);
                }
                m15717c(i8, str, f5, j2, pb1.m19025M(e16VarM19527w2, (vi3) objM22097O), tj3Var, 0);
            }
            str = str3;
            final int i9 = 1;
            t66Var = t66Var3;
            obj2 = new vi3() { // from class: aw6
                @Override // p000.vi3
                public final Object invoke(Object obj3) {
                    int i10 = i9;
                    t66 t66Var4 = t66Var;
                    float f6 = f3;
                    float f7 = f;
                    av0 av0Var2 = av0Var;
                    fb2 fb2Var = (fb2) obj3;
                    switch (i10) {
                        case 0:
                            fb2Var.getClass();
                            break;
                        default:
                            fb2Var.getClass();
                            break;
                    }
                    return new f84(kxb.m15720f(av0Var2, f7, f6, ((n84) t66Var4.getValue()).f52482a));
                }
            };
            tj3Var.m22131l0(obj2);
            e16 e16VarM19527w3 = pvc.m19527w(e16VarMo3727a2, (vi3) obj2);
            objM22097O = tj3Var.m22097O();
            if (objM22097O == p84Var2) {
                objM22097O = new dt6(2, t66Var);
                tj3Var.m22131l0(objM22097O);
            }
            m15717c(i8, str, f5, j2, pb1.m19025M(e16VarM19527w3, (vi3) objM22097O), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: xv6
                @Override // p000.zi3
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    kxb.m15718d(ei0Var, av0Var, f, f2, f3, ev0Var, (ye1) obj3, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0172  */
    /* JADX WARN: Code duplicated, block: B:105:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0181  */
    /* JADX WARN: Code duplicated, block: B:108:0x0187  */
    /* JADX WARN: Code duplicated, block: B:110:0x018d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0197  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:141:0x020d  */
    /* JADX WARN: Code duplicated, block: B:142:0x020f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0213  */
    /* JADX WARN: Code duplicated, block: B:145:0x0217  */
    /* JADX WARN: Code duplicated, block: B:147:0x021b  */
    /* JADX WARN: Code duplicated, block: B:148:0x021f  */
    /* JADX WARN: Code duplicated, block: B:152:0x026a  */
    /* JADX WARN: Code duplicated, block: B:153:0x026e  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:161:0x0335  */
    /* JADX WARN: Code duplicated, block: B:164:0x0341  */
    /* JADX WARN: Code duplicated, block: B:166:0x0345  */
    /* JADX WARN: Code duplicated, block: B:169:0x0395  */
    /* JADX WARN: Code duplicated, block: B:171:0x039b  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:178:0x0408  */
    /* JADX WARN: Code duplicated, block: B:179:0x040b  */
    /* JADX WARN: Code duplicated, block: B:181:0x045f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0477  */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x0161  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x016c  */
    /* JADX INFO: renamed from: e */
    public static final void m15719e(final float f, final String str, final String str2, final String str3, final String str4, final String str5, final int i, final int i2, e16 e16Var, float f2, float f3, final long j, final long j2, long j3, final long j4, boolean z, float f4, float f5, final long j5, ye1 ye1Var, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        tj3 tj3Var;
        final e16 e16Var2;
        final float f6;
        final float f7;
        final long j6;
        final boolean z3;
        final float f8;
        final float f9;
        x18 x18VarM22143u;
        int i16;
        b16 b16Var;
        e16 e16Var3;
        float f10;
        float f11;
        boolean z4;
        float f12;
        float f13;
        float f14;
        boolean z5;
        int i17;
        float f15;
        float f16;
        long j7;
        float f17;
        ui3 ui3Var;
        float f18;
        float f19;
        int i18;
        int i19;
        ux5.m22975B(str, str2, str3, str4, str5);
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1440683362);
        int i20 = i3 | (tj3Var2.m22114d(f) ? 4 : 2) | (tj3Var2.m22120g(str) ? 32 : 16) | (tj3Var2.m22120g(str2) ? 256 : 128) | (tj3Var2.m22120g(str3) ? 2048 : 1024) | (tj3Var2.m22120g(str4) ? 16384 : 8192) | (tj3Var2.m22120g(str5) ? 131072 : 65536) | (tj3Var2.m22116e(i) ? 1048576 : 524288) | (tj3Var2.m22116e(i2) ? 8388608 : 4194304);
        int i21 = i5 & 256;
        if (i21 != 0) {
            i6 = i20 | 100663296;
        } else {
            i6 = i20 | (tj3Var2.m22120g(e16Var) ? 67108864 : 33554432);
        }
        int i22 = i6;
        int i23 = i5 & 512;
        if (i23 == 0) {
            if ((i3 & 805306368) == 0) {
                i22 |= tj3Var2.m22114d(f2) ? 536870912 : 268435456;
            }
            i7 = i5 & 1024;
            if (i7 != 0) {
                i8 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (tj3Var2.m22114d(f3)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 = i4 | i9;
            } else {
                i8 = i4;
            }
            if ((i4 & 48) == 0) {
                if (tj3Var2.m22118f(j)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i8 |= i19;
            }
            if ((i4 & 384) == 0) {
                if (tj3Var2.m22118f(j2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i8 |= i18;
            }
            i10 = i8 | 1024;
            if ((i4 & 24576) == 0) {
                i10 |= tj3Var2.m22118f(j4) ? 16384 : 8192;
            }
            i11 = 32768 & i5;
            if (i11 != 0) {
                i10 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (tj3Var2.m22122h(z)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i10 |= i12;
            }
            i13 = i5 & 65536;
            if (i13 != 0) {
                i10 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i10 |= tj3Var2.m22114d(f4) ? 1048576 : 524288;
            }
            i14 = i5 & 131072;
            if (i14 != 0) {
                i10 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i10 |= tj3Var2.m22114d(f5) ? 8388608 : 4194304;
            }
            i15 = i10 | (tj3Var2.m22118f(j5) ? 67108864 : 33554432);
            if ((i22 & 306783379) == 306783378 || (38347923 & i15) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i22 & 1, z2)) {
                tj3Var2.m22104W();
                i16 = i3 & 1;
                b16Var = b16.f7762a;
                if (i16 != 0 || tj3Var2.m22084B()) {
                    if (i21 != 0) {
                        e16Var3 = b16Var;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if (i23 != 0) {
                        f10 = 250.0f;
                    } else {
                        f10 = f2;
                    }
                    if (i7 != 0) {
                        f11 = 40.0f;
                    } else {
                        f11 = f3;
                    }
                    long jM198b = aa1.m198b(0.45f, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s);
                    int i24 = i15 & (-7169);
                    if (i11 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i13 != 0) {
                        f12 = 0.95f;
                    } else {
                        f12 = f4;
                    }
                    if (i14 != 0) {
                        f13 = 0.3f;
                    } else {
                        f13 = f5;
                    }
                    boolean z6 = z4;
                    f14 = f10;
                    z5 = z6;
                    float f20 = f11;
                    i17 = i24;
                    f15 = f12;
                    f16 = f13;
                    j7 = jM198b;
                    f17 = f20;
                } else {
                    tj3Var2.m22102U();
                    int i25 = i15 & (-7169);
                    f14 = f2;
                    f17 = f3;
                    j7 = j3;
                    z5 = z;
                    f15 = f4;
                    f16 = f5;
                    i17 = i25;
                    e16Var3 = e16Var;
                }
                tj3Var2.m22140r();
                float f21 = f14;
                float f22 = f17;
                e16 e16VarM4412e = c99.m4412e(e16Var3, 1.0f);
                e16 e16Var4 = e16Var3;
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
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
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                boolean z7 = z5;
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                fc0 fc0Var = nj0.f52789H;
                C3549ru c3549ru = eh0.f37236b;
                float f23 = f15;
                sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e2);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                m15715a(((i22 >> 3) & 14) | ((i17 >> 21) & 112), j5, tj3Var2, str);
                zu0 zu0Var = new zu0(f, f23, f16);
                float f24 = f16;
                ev0 ev0Var = new ev0(str4, str5, i, i2, f22, j5);
                long j8 = j7;
                hv0 hv0Var = new hv0(j, j2, j8, j4, j5, z7);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f18 = Float.MAX_VALUE;
                } else {
                    f18 = 1.0f;
                }
                m15716b(zu0Var, ev0Var, hv0Var, f21, new as4(f18, true), tj3Var2, (i22 >> 18) & 7168);
                tj3Var2.m22139q(true);
                e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 48.0f, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 0.0f, 10);
                sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                vh9 vh9Var = ps5.f56764b;
                int i26 = (i17 >> 18) & 896;
                lw9.m16554b(str2, null, j5, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71411o, tj3Var2, ((i22 >> 6) & 14) | i26, 0, 131066);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f19 = Float.MAX_VALUE;
                } else {
                    f19 = 1.0f;
                }
                thb.m22044c(tj3Var2, new as4(f19, true));
                lw9.m16554b(str3, null, j5, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71411o, tj3Var2, ((i22 >> 9) & 14) | i26, 0, 131066);
                tj3Var = tj3Var2;
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                e16Var2 = e16Var4;
                f8 = f23;
                f9 = f24;
                f7 = f22;
                j6 = j8;
                z3 = z7;
                f6 = f21;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                f6 = f2;
                f7 = f3;
                j6 = j3;
                z3 = z;
                f8 = f4;
                f9 = f5;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: wv6
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        int iM19383z2 = pk9.m19383z(i4);
                        kxb.m15719e(f, str, str2, str3, str4, str5, i, i2, e16Var2, f6, f7, j, j2, j6, j4, z3, f8, f9, j5, (ye1) obj, iM19383z, iM19383z2, i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i22 |= 805306368;
        i7 = i5 & 1024;
        if (i7 != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (tj3Var2.m22114d(f3)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i8 = i4 | i9;
        } else {
            i8 = i4;
        }
        if ((i4 & 48) == 0) {
            if (tj3Var2.m22118f(j)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i8 |= i19;
        }
        if ((i4 & 384) == 0) {
            if (tj3Var2.m22118f(j2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i8 |= i18;
        }
        i10 = i8 | 1024;
        if ((i4 & 24576) == 0) {
            i10 |= tj3Var2.m22118f(j4) ? 16384 : 8192;
        }
        i11 = 32768 & i5;
        if (i11 != 0) {
            i10 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (tj3Var2.m22122h(z)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        }
        i13 = i5 & 65536;
        if (i13 != 0) {
            i10 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i10 |= tj3Var2.m22114d(f4) ? 1048576 : 524288;
        }
        i14 = i5 & 131072;
        if (i14 != 0) {
            i10 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            i10 |= tj3Var2.m22114d(f5) ? 8388608 : 4194304;
        }
        i15 = i10 | (tj3Var2.m22118f(j5) ? 67108864 : 33554432);
        if ((i22 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (tj3Var2.m22099R(i22 & 1, z2)) {
            tj3Var2.m22104W();
            i16 = i3 & 1;
            b16Var = b16.f7762a;
            if (i16 != 0) {
                if (i21 != 0) {
                    e16Var3 = b16Var;
                } else {
                    e16Var3 = e16Var;
                }
                if (i23 != 0) {
                    f10 = 250.0f;
                } else {
                    f10 = f2;
                }
                if (i7 != 0) {
                    f11 = 40.0f;
                } else {
                    f11 = f3;
                }
                long jM198b2 = aa1.m198b(0.45f, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s);
                int i27 = i15 & (-7169);
                if (i11 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i13 != 0) {
                    f12 = 0.95f;
                } else {
                    f12 = f4;
                }
                if (i14 != 0) {
                    f13 = 0.3f;
                } else {
                    f13 = f5;
                }
                boolean z8 = z4;
                f14 = f10;
                z5 = z8;
                float f25 = f11;
                i17 = i27;
                f15 = f12;
                f16 = f13;
                j7 = jM198b2;
                f17 = f25;
            } else {
                if (i21 != 0) {
                    e16Var3 = b16Var;
                } else {
                    e16Var3 = e16Var;
                }
                if (i23 != 0) {
                    f10 = 250.0f;
                } else {
                    f10 = f2;
                }
                if (i7 != 0) {
                    f11 = 40.0f;
                } else {
                    f11 = f3;
                }
                long jM198b3 = aa1.m198b(0.45f, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s);
                int i28 = i15 & (-7169);
                if (i11 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i13 != 0) {
                    f12 = 0.95f;
                } else {
                    f12 = f4;
                }
                if (i14 != 0) {
                    f13 = 0.3f;
                } else {
                    f13 = f5;
                }
                boolean z9 = z4;
                f14 = f10;
                z5 = z9;
                float f26 = f11;
                i17 = i28;
                f15 = f12;
                f16 = f13;
                j7 = jM198b3;
                f17 = f26;
            }
            tj3Var2.m22140r();
            float f27 = f14;
            float f28 = f17;
            e16 e16VarM4412e3 = c99.m4412e(e16Var3, 1.0f);
            e16 e16Var5 = e16Var3;
            bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m4 = tj3Var2.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e3);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var5, bb1VarM230a2);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var7, numValueOf2);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var2);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c4);
            boolean z10 = z5;
            e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
            fc0 fc0Var2 = nj0.f52789H;
            C3549ru c3549ru2 = eh0.f37236b;
            float f29 = f15;
            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru2, fc0Var2, tj3Var2, 48);
            int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m5 = tj3Var2.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e4);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var5, sj8VarM20003a3);
            oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var7, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c5);
            m15715a(((i22 >> 3) & 14) | ((i17 >> 21) & 112), j5, tj3Var2, str);
            zu0 zu0Var2 = new zu0(f, f29, f16);
            float f210 = f16;
            ev0 ev0Var2 = new ev0(str4, str5, i, i2, f28, j5);
            long j9 = j7;
            hv0 hv0Var2 = new hv0(j, j2, j9, j4, j5, z10);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f18 = Float.MAX_VALUE;
            } else {
                f18 = 1.0f;
            }
            m15716b(zu0Var2, ev0Var2, hv0Var2, f27, new as4(f18, true), tj3Var2, (i22 >> 18) & 7168);
            tj3Var2.m22139q(true);
            e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 48.0f, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 0.0f, 10);
            sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru2, fc0Var2, tj3Var2, 48);
            int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m6 = tj3Var2.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X2);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var5, sj8VarM20003a4);
            oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var7, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c6);
            vh9 vh9Var2 = ps5.f56764b;
            int i29 = (i17 >> 18) & 896;
            lw9.m16554b(str2, null, j5, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71411o, tj3Var2, ((i22 >> 6) & 14) | i29, 0, 131066);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f19 = Float.MAX_VALUE;
            } else {
                f19 = 1.0f;
            }
            thb.m22044c(tj3Var2, new as4(f19, true));
            lw9.m16554b(str3, null, j5, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71411o, tj3Var2, ((i22 >> 9) & 14) | i29, 0, 131066);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16Var2 = e16Var5;
            f8 = f29;
            f9 = f210;
            f7 = f28;
            j6 = j9;
            z3 = z10;
            f6 = f27;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            f6 = f2;
            f7 = f3;
            j6 = j3;
            z3 = z;
            f8 = f4;
            f9 = f5;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: wv6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    int iM19383z2 = pk9.m19383z(i4);
                    kxb.m15719e(f, str, str2, str3, str4, str5, i, i2, e16Var2, f6, f7, j, j2, j6, j4, z3, f8, f9, j5, (ye1) obj, iM19383z, iM19383z2, i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    public static final long m15720f(av0 av0Var, float f, float f2, long j) {
        float f3 = av0Var.f7550g / 2.0f;
        float f4 = f - f3;
        float f5 = f2 - f3;
        float f6 = av0Var.f7544a - ((int) (j >> 32));
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        int iM21693T = ss5.m21693T(l70.m15944g(f4, 0.0f, f6));
        float f7 = av0Var.f7545b - ((int) (j & 4294967295L));
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        return (((long) iM21693T) << 32) | (((long) ss5.m21693T(l70.m15944g(f5, 0.0f, f7))) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public static final void m15721g(InterfaceC0310a interfaceC0310a, ArrayList arrayList, float f, long j, long j2, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (z) {
            C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
            c3500qjM22757a.m19989f(Float.intBitsToFloat((int) (((gq6) u91.m22589G0(arrayList)).f41189a >> 32)), f);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j3 = ((gq6) it.next()).f41189a;
                c3500qjM22757a.m19988e(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            }
            c3500qjM22757a.m19988e(Float.intBitsToFloat((int) (((gq6) u91.m22597O0(arrayList)).f41189a >> 32)), f);
            c3500qjM22757a.f57839a.close();
            InterfaceC0310a.m1413G0(interfaceC0310a, c3500qjM22757a, ui0.m22749e(vi0.Companion, vz1.m23605K(new aa1(j2), new aa1(aa1.m198b(0.08f, j2))), 0.0f, 0.0f, 14), 0.0f, w33.f66328a, null, 52);
        }
        C3500qj c3500qjM22757a2 = AbstractC3650uj.m22757a();
        c3500qjM22757a2.m19989f(Float.intBitsToFloat((int) (((gq6) u91.m22589G0(arrayList)).f41189a >> 32)), Float.intBitsToFloat((int) (((gq6) u91.m22589G0(arrayList)).f41189a & 4294967295L)));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long j4 = ((gq6) it2.next()).f41189a;
            c3500qjM22757a2.m19988e(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
        }
        InterfaceC0310a.m1408A0(interfaceC0310a, c3500qjM22757a2, j, 0.0f, new el9(interfaceC0310a.mo912g0(2.0f), 0.0f, 1, 0, 26), 52);
    }
}
