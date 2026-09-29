package com.lingq.feature.karaoke;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0072k;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.video.AbstractC1824e;
import com.lingq.feature.karaoke.AbstractC2117b;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3456pd;
import p000.C3537ri;
import p000.C3661uu;
import p000.aa1;
import p000.ab1;
import p000.ab7;
import p000.ac7;
import p000.aj3;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.bb7;
import p000.bc3;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.db7;
import p000.dh9;
import p000.do7;
import p000.dua;
import p000.e16;
import p000.ea7;
import p000.ec0;
import p000.eh0;
import p000.ex0;
import p000.fa4;
import p000.fc0;
import p000.fe9;
import p000.fn0;
import p000.fy9;
import p000.ga7;
import p000.gb7;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.hb7;
import p000.hc7;
import p000.ja7;
import p000.jb7;
import p000.ke2;
import p000.kh4;
import p000.l77;
import p000.lb7;
import p000.lw9;
import p000.ma7;
import p000.mb7;
import p000.mbb;
import p000.ms5;
import p000.mv4;
import p000.mx0;
import p000.nb7;
import p000.nj0;
import p000.nu1;
import p000.nw1;
import p000.oa7;
import p000.ob7;
import p000.oh4;
import p000.oha;
import p000.or1;
import p000.p84;
import p000.pb1;
import p000.pbb;
import p000.pfa;
import p000.ps5;
import p000.py3;
import p000.qh0;
import p000.qj8;
import p000.r46;
import p000.ra7;
import p000.rw1;
import p000.ry3;
import p000.sa7;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.ss5;
import p000.t66;
import p000.t9a;
import p000.te0;
import p000.te1;
import p000.tj3;
import p000.u45;
import p000.u91;
import p000.ui3;
import p000.ui8;
import p000.un1;
import p000.va7;
import p000.vh9;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.x74;
import p000.xa0;
import p000.xfa;
import p000.xj2;
import p000.y38;
import p000.ya7;
import p000.ye1;
import p000.zf1;
import p000.zi3;
import p000.zs0;

/* JADX INFO: renamed from: com.lingq.feature.karaoke.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2117b {
    /* JADX INFO: renamed from: a */
    public static final void m9021a(int i, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-203883384);
        int i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16.f7762a, ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
            if (i > 0) {
                tj3Var.m22111b0(756300730);
                boolean z = (i3 & 14) == 4;
                Object objM22097O = tj3Var.m22097O();
                if (z || objM22097O == we1.f66679a) {
                    objM22097O = new kh4(i, 0);
                    tj3Var.m22131l0(objM22097O);
                }
                do7.m10526b((ui3) objM22097O, null, 0L, 0.0f, 0.0f, 0L, tj3Var, 0, 62);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(756379160);
                do7.m10527c(null, 0L, 0.0f, 0.0f, tj3Var, 0, 15);
                tj3Var.m22139q(false);
            }
            tj3 tj3Var2 = tj3Var;
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.karaoke_downloading_audio), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ex0(i, i2, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9022b(oh4 oh4Var, u45 u45Var, pbb pbbVar, ui3 ui3Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        boolean z;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(2028485293);
        int i2 = i | (tj3Var2.m22124i(oh4Var) ? 4 : 2) | (tj3Var2.m22124i(u45Var) ? 32 : 16) | (tj3Var2.m22120g(pbbVar) ? 256 : 128) | (tj3Var2.m22124i(vi3Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 131072 : 65536;
        }
        if (!tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else if (oh4Var.f54343e) {
            tj3Var2.m22111b0(-540774805);
            String str = u45Var != null ? u45Var.f63398e : null;
            if (str == null) {
                tj3Var2.m22111b0(415850230);
                tj3Var2.m22139q(false);
                tj3Var = tj3Var2;
                z = false;
            } else {
                tj3Var2.m22111b0(415850231);
                e16 e16VarM19045o = pb1.m19045o(te1.m21995i(1.7777778f, e16Var, false), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64858d);
                String strM17131l0 = AbstractC3352my.m17131l0(str);
                hc7 hc7Var = oh4Var.f54345g;
                float f = hc7Var.f42177e / 1000.0f;
                ac7 ac7Var = hc7Var.f42181i;
                String str2 = oh4Var.f54347i;
                int i3 = 57344 & i2;
                boolean z2 = i3 == 16384;
                Object objM22097O = tj3Var2.m22097O();
                p84 p84Var = we1.f66679a;
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new te0(vi3Var, 22);
                    tj3Var2.m22131l0(objM22097O);
                }
                vi3 vi3Var2 = (vi3) objM22097O;
                boolean z3 = i3 == 16384;
                Object objM22097O2 = tj3Var2.m22097O();
                if (z3 || objM22097O2 == p84Var) {
                    objM22097O2 = new te0(vi3Var, 23);
                    tj3Var2.m22131l0(objM22097O2);
                }
                vi3 vi3Var3 = (vi3) objM22097O2;
                boolean z4 = i3 == 16384;
                Object objM22097O3 = tj3Var2.m22097O();
                if (z4 || objM22097O3 == p84Var) {
                    objM22097O3 = new te0(vi3Var, 24);
                    tj3Var2.m22131l0(objM22097O3);
                }
                vi3 vi3Var4 = (vi3) objM22097O3;
                boolean z5 = i3 == 16384;
                Object objM22097O4 = tj3Var2.m22097O();
                if (z5 || objM22097O4 == p84Var) {
                    objM22097O4 = new nw1(vi3Var, 28);
                    tj3Var2.m22131l0(objM22097O4);
                }
                z = false;
                AbstractC1824e.m8502a(e16VarM19045o, strM17131l0, pbbVar, ac7Var, f, false, false, str2, ui3Var, vi3Var2, vi3Var3, vi3Var4, (ui3) objM22097O4, tj3Var2, (i2 & 896) | 100663296, 0, 96);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22111b0(417084341);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(oh4Var, u45Var, pbbVar, ui3Var, vi3Var, e16Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9023c(C2118c c2118c, final vi3 vi3Var, ye1 ye1Var, int i) {
        final C2118c c2118c2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2139613360);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2118c2 = (C2118c) pfa.m19114d(y38.m24933a(C2118c.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2118c2 = c2118c;
            }
            tj3Var.m22140r();
            final t66 t66VarM2513c = AbstractC0711a.m2513c(c2118c2.f26308v, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2118c2.f26303q, tj3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O);
            }
            final un1 un1Var = (un1) objM22097O;
            oh4 oh4Var = (oh4) t66VarM2513c.getValue();
            u45 u45Var = (u45) t66VarM2513c2.getValue();
            int i4 = i2 & 112;
            boolean zM22124i = tj3Var.m22124i(c2118c2) | tj3Var.m22120g(t66VarM2513c) | tj3Var.m22124i(un1Var) | (i4 == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new vi3() { // from class: com.lingq.feature.karaoke.a
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Double d;
                        C2118c c2118c3 = c2118c2;
                        C1808b c1808b = c2118c3.f26293g;
                        ob7 ob7Var = (ob7) obj;
                        ob7Var.getClass();
                        if (ob7Var instanceof gb7) {
                            c1808b.m8442C(new nb7(((gb7) ob7Var).f40501a));
                        } else if (ob7Var instanceof ja7) {
                            c1808b.m8464c0(((int) ((ja7) ob7Var).f45351a) * DescriptorProtos.Edition.EDITION_2023_VALUE);
                        } else if (ob7Var instanceof ma7) {
                            c1808b.m8462b0((long) (((ma7) ob7Var).f50841a * 1000.0f));
                        } else if (ob7Var.equals(ab7.f464a)) {
                            c1808b.m8442C(ea7.f36943k);
                        } else if (ob7Var.equals(jb7.f45380a)) {
                            c1808b.m8442C(ea7.f36947o);
                        } else if (ob7Var.equals(ga7.f40463a)) {
                            c1808b.m8442C(ea7.f36936d);
                        } else if (ob7Var.equals(ra7.f58973a)) {
                            c1808b.m8442C(ea7.f36938f);
                        } else if (ob7Var.equals(lb7.f49414a)) {
                            c1808b.m8442C(ea7.f36944l);
                        } else if (ob7Var.equals(oa7.f54102a)) {
                            PlayerState playerState = PlayerState.Paused;
                            playerState.getClass();
                            c1808b.m8465d0(playerState, true);
                            c2118c3.mo9034v0(AppUsageType.Listening);
                            if (c1808b.f21969v) {
                                LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) u91.m22591I0(((oh4) ((C3244l) c2118c3.f26308v.f9311a).getValue()).f54339a);
                                if (lessonTranslationSentence != null && (d = lessonTranslationSentence.f19294c) != null) {
                                    c2118c3.m9031W2(d.doubleValue());
                                }
                            } else {
                                c1808b.m8457V();
                            }
                        } else if (ob7Var.equals(va7.f65143a)) {
                            c2118c3.mo9034v0(AppUsageType.Listening);
                            PlayerState playerState2 = PlayerState.Paused;
                            playerState2.getClass();
                            c1808b.m8465d0(playerState2, true);
                        } else if (ob7Var.equals(ya7.f69552a)) {
                            PlayerState playerState3 = PlayerState.Playing;
                            playerState3.getClass();
                            c1808b.m8465d0(playerState3, true);
                            c2118c3.mo9033o1(AppUsageType.Listening, Integer.valueOf(((Number) c2118c3.f26300n.getValue()).intValue()));
                        } else if (ob7Var.equals(sa7.f60595a)) {
                            c1808b.m8442C(ea7.f36939g);
                        } else if (ob7Var.equals(bb7.f8280a)) {
                            c1808b.m8442C(ea7.f36945m);
                        } else if (ob7Var.equals(db7.f35359a)) {
                            c1808b.m8442C(ea7.f36946n);
                        } else if (ob7Var.equals(hb7.f42136a)) {
                            LessonTranslationSentence lessonTranslationSentence2 = ((oh4) t66VarM2513c.getValue()).f54340b;
                            wfb.m23926u(un1Var, null, null, new KaraokeScreenKt$KaraokeRoute$1$1$1(c2118c3, lessonTranslationSentence2 != null ? Integer.valueOf(lessonTranslationSentence2.f19292a) : null, vi3Var, null), 3);
                        } else {
                            if (!ob7Var.equals(mb7.f50880a)) {
                                gm5.m12750e();
                                return null;
                            }
                            C3244l c3244l = c2118c3.f26304r;
                            Boolean bool = Boolean.TRUE;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool);
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            vi3 vi3Var2 = (vi3) objM22097O2;
            boolean zM22124i2 = tj3Var.m22124i(c2118c2);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O3 == p84Var) {
                objM22097O3 = new KaraokeScreenKt$KaraokeRoute$2$1(1, c2118c2, C2118c.class, "selectSentence", "selectSentence(Lcom/lingq/core/domain/model/lesson/LessonTranslationSentence;)V", 0);
                tj3Var.m22131l0(objM22097O3);
            }
            vi3 vi3Var3 = (vi3) ((FunctionReference) objM22097O3);
            boolean zM22124i3 = tj3Var.m22124i(c2118c2);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O4 == p84Var) {
                KaraokeScreenKt$KaraokeRoute$3$1 karaokeScreenKt$KaraokeRoute$3$1 = new KaraokeScreenKt$KaraokeRoute$3$1(0, c2118c2, C2118c.class, "clearProgressForVideo", "clearProgressForVideo()V", 0);
                tj3Var.m22131l0(karaokeScreenKt$KaraokeRoute$3$1);
                objM22097O4 = karaokeScreenKt$KaraokeRoute$3$1;
            }
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O4);
            boolean zM22124i4 = tj3Var.m22124i(c2118c2);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O5 == p84Var) {
                KaraokeScreenKt$KaraokeRoute$4$1 karaokeScreenKt$KaraokeRoute$4$1 = new KaraokeScreenKt$KaraokeRoute$4$1(1, c2118c2, C2118c.class, "changeFontSize", "changeFontSize(I)V", 0);
                tj3Var.m22131l0(karaokeScreenKt$KaraokeRoute$4$1);
                objM22097O5 = karaokeScreenKt$KaraokeRoute$4$1;
            }
            vi3 vi3Var4 = (vi3) ((FunctionReference) objM22097O5);
            boolean z = i4 == 32;
            Object objM22097O6 = tj3Var.m22097O();
            if (z || objM22097O6 == p84Var) {
                objM22097O6 = new nw1(vi3Var, 27);
                tj3Var.m22131l0(objM22097O6);
            }
            m9024d(oh4Var, u45Var, vi3Var2, vi3Var3, ui3Var, vi3Var4, (ui3) objM22097O6, tj3Var, 0);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
            c2118c2 = c2118c;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(c2118c2, i, 17, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9024d(final oh4 oh4Var, final u45 u45Var, final vi3 vi3Var, final vi3 vi3Var2, ui3 ui3Var, final vi3 vi3Var3, final ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        String str;
        oh4Var.getClass();
        Double d = oh4Var.f54346h;
        vi3Var.getClass();
        vi3Var2.getClass();
        ui3Var.getClass();
        vi3Var3.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(862523997);
        int i2 = (tj3Var2.m22124i(oh4Var) ? 4 : 2) | i | (tj3Var2.m22124i(u45Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 1048576 : 524288;
        }
        if (tj3Var2.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            final fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O);
            }
            final t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O2);
            }
            final t66 t66Var2 = (t66) objM22097O2;
            final boolean zM12248c = fy9.m12248c(t9a.m21912b(tj3Var2));
            final boolean z = oh4Var.f54343e;
            boolean zM22120g = tj3Var2.m22120g(u45Var != null ? u45Var.f63398e : null);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = (u45Var == null || (str = u45Var.f63398e) == null) ? null : AbstractC3352my.m17131l0(str);
                tj3Var2.m22131l0(objM22097O3);
            }
            String str2 = (String) objM22097O3;
            Object objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O4);
            }
            t66 t66Var3 = (t66) objM22097O4;
            boolean zM22120g2 = tj3Var2.m22120g(str2);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var) {
                objM22097O5 = new KaraokeScreenKt$KaraokeScreen$1$1(str2, t66Var3, t66Var, null);
                tj3Var2.m22131l0(objM22097O5);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O5, str2);
            if (d != null) {
                t66Var.setValue(new mbb(((int) d.doubleValue()) * DescriptorProtos.Edition.EDITION_2023_VALUE));
                ui3Var.mo0a();
            }
            tj3Var = tj3Var2;
            b34.m3232b(c99.m4410c(b16.f7762a, 1.0f), null, null, null, null, 0, 0L, 0L, null, ci8.m4703P(2038227244, new aj3() { // from class: lh4
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v1, types: [tj3, ye1] */
                /* JADX WARN: Type inference failed for: r15v3, types: [tj3, ye1] */
                /* JADX WARN: Type inference failed for: r15v4, types: [tj3] */
                /* JADX WARN: Type inference failed for: r15v6, types: [tj3, ye1] */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r15v8 */
                /* JADX WARN: Type inference failed for: r18v0 */
                /* JADX WARN: Type inference failed for: r18v1, types: [int] */
                /* JADX WARN: Type inference failed for: r18v2 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v9 */
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    b16 b16Var;
                    final oh4 oh4Var2;
                    u45 u45Var2;
                    final ?? r4;
                    ?? r15;
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    ?? r16 = (tj3) ye1Var2;
                    if (r16.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        b16 b16Var2 = b16.f7762a;
                        e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4412e(b16Var2, 1.0f), t17Var);
                        fe9 fe9Var2 = fe9Var;
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM21606S, fe9Var2.f38960i, 0.0f, 2);
                        ec0 ec0Var = nj0.f52792K;
                        C3587su c3587su = eh0.f37238d;
                        bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, r16, 48);
                        int iHashCode = Long.hashCode(r16.f62385T);
                        l77 l77VarM22132m = r16.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(r16, e16VarM21609V);
                        se1.f60731q.getClass();
                        ui3 ui3Var3 = C0352b.f4299b;
                        r16.m22119f0();
                        if (r16.f62384S) {
                            r16.m22130l(ui3Var3);
                        } else {
                            r16.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(r16, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(r16, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(r16, zi3Var3, numValueOf);
                        vi3 vi3Var4 = C0352b.f4305h;
                        oha.m18000f(r16, vi3Var4);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(r16, zi3Var4, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                        C3549ru c3549ru = eh0.f37237c;
                        fc0 fc0Var = nj0.f52817l;
                        sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, r16, 6);
                        int iHashCode2 = Long.hashCode(r16.f62385T);
                        l77 l77VarM22132m2 = r16.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(r16, e16VarM4412e);
                        r16.m22119f0();
                        if (r16.f62384S) {
                            r16.m22130l(ui3Var3);
                        } else {
                            r16.m22137o0();
                        }
                        oha.m18001g(r16, zi3Var, sj8VarM20003a);
                        oha.m18001g(r16, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, r16, zi3Var3, r16, vi3Var4);
                        oha.m18001g(r16, zi3Var4, e16VarM1322c2);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode3 = Long.hashCode(r16.f62385T);
                        l77 l77VarM22132m3 = r16.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(r16, b16Var2);
                        r16.m22119f0();
                        if (r16.f62384S) {
                            r16.m22130l(ui3Var3);
                        } else {
                            r16.m22137o0();
                        }
                        oha.m18001g(r16, zi3Var, ht5VarM19966d);
                        oha.m18001g(r16, zi3Var2, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, r16, zi3Var3, r16, vi3Var4);
                        oha.m18001g(r16, zi3Var4, e16VarM1322c3);
                        Object objM22097O6 = r16.m22097O();
                        t66 t66Var4 = t66Var2;
                        Object obj4 = we1.f66679a;
                        if (objM22097O6 == obj4) {
                            objM22097O6 = new C3799yk(22, t66Var4);
                            r16.m22131l0(objM22097O6);
                        }
                        omd.m18141c((ui3) objM22097O6, null, false, null, null, brb.f8904a, r16, 1572870, 62);
                        boolean zBooleanValue = ((Boolean) t66Var4.getValue()).booleanValue();
                        final oh4 oh4Var3 = oh4Var;
                        int i3 = oh4Var3.f54344f;
                        Object objM22097O7 = r16.m22097O();
                        if (objM22097O7 == obj4) {
                            objM22097O7 = new C3799yk(23, t66Var4);
                            r16.m22131l0(objM22097O7);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O7;
                        vi3 vi3Var5 = vi3Var3;
                        boolean zM22120g3 = r16.m22120g(vi3Var5);
                        Object objM22097O8 = r16.m22097O();
                        if (zM22120g3 || objM22097O8 == obj4) {
                            objM22097O8 = new te0(vi3Var5, 25);
                            r16.m22131l0(objM22097O8);
                        }
                        tdd.m21966a(i3, 48, r16, ui3Var4, (vi3) objM22097O8, zBooleanValue);
                        r16.m22139q(true);
                        omd.m18141c(ui3Var2, null, false, null, null, brb.f8905b, r16, 1572864, 62);
                        r16.m22139q(true);
                        boolean z2 = zM12248c;
                        boolean z3 = z;
                        final u45 u45Var3 = u45Var;
                        final vi3 vi3Var6 = vi3Var;
                        final t66 t66Var5 = t66Var;
                        final vi3 vi3Var7 = vi3Var2;
                        if (z2 && z3) {
                            r16.m22111b0(-232993630);
                            e16 e16VarM4412e2 = c99.m4412e(new as4(1.0f, true), 1.0f);
                            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(fe9Var2.f38963l, true, new gm5(28)), fc0Var, r16, 0);
                            int iHashCode4 = Long.hashCode(r16.f62385T);
                            l77 l77VarM22132m4 = r16.m22132m();
                            e16 e16VarM1322c4 = AbstractC0287b.m1322c(r16, e16VarM4412e2);
                            r16.m22119f0();
                            if (r16.f62384S) {
                                r16.m22130l(ui3Var3);
                            } else {
                                r16.m22137o0();
                            }
                            oha.m18001g(r16, zi3Var, sj8VarM20003a2);
                            oha.m18001g(r16, zi3Var2, l77VarM22132m4);
                            AbstractC3393o1.m17747v(iHashCode4, r16, zi3Var3, r16, vi3Var4);
                            oha.m18001g(r16, zi3Var4, e16VarM1322c4);
                            if (0.45f <= 0.0d) {
                                g54.m12362a("invalid weight; must be greater than zero");
                            }
                            as4 as4Var = new as4(0.45f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.45f, true);
                            pbb pbbVar = (pbb) t66Var5.getValue();
                            Object objM22097O9 = r16.m22097O();
                            if (objM22097O9 == obj4) {
                                objM22097O9 = new C3799yk(24, t66Var5);
                                r16.m22131l0(objM22097O9);
                            }
                            AbstractC2117b.m9022b(oh4Var3, u45Var3, pbbVar, (ui3) objM22097O9, vi3Var6, as4Var, r16, 3072);
                            if (0.55f <= 0.0d) {
                                g54.m12362a("invalid weight; must be greater than zero");
                            }
                            as4 as4Var2 = new as4(0.55f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.55f, true);
                            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, r16, 48);
                            int iHashCode5 = Long.hashCode(r16.f62385T);
                            l77 l77VarM22132m5 = r16.m22132m();
                            e16 e16VarM1322c5 = AbstractC0287b.m1322c(r16, as4Var2);
                            r16.m22119f0();
                            if (r16.f62384S) {
                                r16.m22130l(ui3Var3);
                            } else {
                                r16.m22137o0();
                            }
                            oha.m18001g(r16, zi3Var, bb1VarM230a2);
                            oha.m18001g(r16, zi3Var2, l77VarM22132m5);
                            AbstractC3393o1.m17747v(iHashCode5, r16, zi3Var3, r16, vi3Var4);
                            oha.m18001g(r16, zi3Var4, e16VarM1322c5);
                            final int i4 = 1;
                            AbstractC0054a.m734i(Integer.valueOf(u45Var3 != null ? u45Var3.f63394a : 0), new as4(1.0f, true), null, "karaoke-lesson-crossfade", ci8.m4703P(1847969179, new aj3() { // from class: jh4
                                @Override // p000.aj3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    int i5 = i4;
                                    xfa xfaVar = xfa.f68157a;
                                    oh4 oh4Var4 = oh4Var3;
                                    b16 b16Var3 = b16.f7762a;
                                    switch (i5) {
                                        case 0:
                                            ((Integer) obj5).getClass();
                                            ye1 ye1Var3 = (ye1) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                                tj3Var3.m22102U();
                                            } else if (!oh4Var4.f54341c) {
                                                tj3Var3.m22111b0(1328771607);
                                                AbstractC2117b.m9025e(c99.m4411d(b16Var3, 1.0f), oh4Var4.f54339a, oh4Var4.f54340b, Integer.valueOf(oh4Var4.f54344f), oh4Var4.f54347i, vi3Var7, tj3Var3, 6);
                                                tj3Var3.m22139q(false);
                                            } else {
                                                tj3Var3.m22111b0(1328631859);
                                                AbstractC2117b.m9027g(c99.m4411d(b16Var3, 1.0f), tj3Var3, 6);
                                                tj3Var3.m22139q(false);
                                            }
                                            break;
                                        default:
                                            ((Integer) obj5).getClass();
                                            ye1 ye1Var4 = (ye1) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else if (!oh4Var4.f54341c) {
                                                tj3Var4.m22111b0(-40762640);
                                                AbstractC2117b.m9025e(c99.m4411d(b16Var3, 1.0f), oh4Var4.f54339a, oh4Var4.f54340b, Integer.valueOf(oh4Var4.f54344f), oh4Var4.f54347i, vi3Var7, tj3Var4, 6);
                                                tj3Var4.m22139q(false);
                                            } else {
                                                tj3Var4.m22111b0(-40927436);
                                                AbstractC2117b.m9027g(c99.m4411d(b16Var3, 1.0f), tj3Var4, 6);
                                                tj3Var4.m22139q(false);
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            }, r16), r16, 27648, 4);
                            ?? r17 = r16;
                            final int i5 = 0;
                            AbstractC2117b.m9028h(ci8.m4703P(-1361503520, new zi3() { // from class: ih4
                                @Override // p000.zi3
                                public final Object invoke(Object obj5, Object obj6) {
                                    String str3;
                                    String str4;
                                    int i6 = i5;
                                    xfa xfaVar = xfa.f68157a;
                                    p84 p84Var2 = we1.f66679a;
                                    String strM17131l0 = null;
                                    t66 t66Var6 = t66Var5;
                                    u45 u45Var4 = u45Var3;
                                    oh4 oh4Var4 = oh4Var3;
                                    switch (i6) {
                                        case 0:
                                            ye1 ye1Var3 = (ye1) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                tj3Var3.m22102U();
                                            } else if (!oh4Var4.f54348j) {
                                                tj3Var3.m22111b0(1120023200);
                                                boolean z4 = oh4Var4.f54342d;
                                                hc7 hc7Var = oh4Var4.f54345g;
                                                int i7 = hc7Var.f42177e;
                                                int i8 = (int) hc7Var.f42176d;
                                                boolean z5 = hc7Var.f42174b == PlayerState.Playing;
                                                boolean z6 = hc7Var.f42180h;
                                                boolean z7 = hc7Var.f42179g;
                                                ac7 ac7Var = hc7Var.f42181i;
                                                if (u45Var4 != null && (str3 = u45Var4.f63398e) != null) {
                                                    strM17131l0 = AbstractC3352my.m17131l0(str3);
                                                }
                                                String str5 = strM17131l0;
                                                Object objM22097O10 = tj3Var3.m22097O();
                                                if (objM22097O10 == p84Var2) {
                                                    objM22097O10 = new C0023al(17, t66Var6);
                                                    tj3Var3.m22131l0(objM22097O10);
                                                }
                                                hed.m13213a(null, i7, i8, z5, z4, z6, z7, ac7Var, str5, vi3Var6, (vi3) objM22097O10, tj3Var3, 0);
                                                tj3Var3.m22139q(false);
                                            } else {
                                                tj3Var3.m22111b0(1119839401);
                                                AbstractC2117b.m9021a(oh4Var4.f54349k, tj3Var3, 0);
                                                tj3Var3.m22139q(false);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var4 = (ye1) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                tj3Var4.m22102U();
                                            } else if (!oh4Var4.f54348j) {
                                                tj3Var4.m22111b0(-564943001);
                                                boolean z8 = oh4Var4.f54342d;
                                                hc7 hc7Var2 = oh4Var4.f54345g;
                                                int i9 = hc7Var2.f42177e;
                                                int i10 = (int) hc7Var2.f42176d;
                                                boolean z9 = hc7Var2.f42174b == PlayerState.Playing;
                                                boolean z10 = hc7Var2.f42180h;
                                                boolean z11 = hc7Var2.f42179g;
                                                ac7 ac7Var2 = hc7Var2.f42181i;
                                                if (u45Var4 != null && (str4 = u45Var4.f63398e) != null) {
                                                    strM17131l0 = AbstractC3352my.m17131l0(str4);
                                                }
                                                String str6 = strM17131l0;
                                                Object objM22097O11 = tj3Var4.m22097O();
                                                if (objM22097O11 == p84Var2) {
                                                    objM22097O11 = new C0023al(16, t66Var6);
                                                    tj3Var4.m22131l0(objM22097O11);
                                                }
                                                hed.m13213a(null, i9, i10, z9, z8, z10, z11, ac7Var2, str6, vi3Var6, (vi3) objM22097O11, tj3Var4, 0);
                                                tj3Var4.m22139q(false);
                                            } else {
                                                tj3Var4.m22111b0(-565100760);
                                                AbstractC2117b.m9021a(oh4Var4.f54349k, tj3Var4, 0);
                                                tj3Var4.m22139q(false);
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            }, r17), r17, 6);
                            r17.m22139q(true);
                            r17.m22139q(true);
                            r17.m22139q(false);
                            r15 = r17;
                        } else {
                            r16.m22111b0(-229946082);
                            if (z3) {
                                r16.m22111b0(-229951848);
                                e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                                pbb pbbVar2 = (pbb) t66Var5.getValue();
                                Object objM22097O10 = r16.m22097O();
                                if (objM22097O10 == obj4) {
                                    b16Var = b16Var2;
                                    objM22097O10 = new C3799yk(21, t66Var5);
                                    r16.m22131l0(objM22097O10);
                                }
                                b16Var = b16Var2;
                                AbstractC2117b.m9022b(oh4Var3, u45Var3, pbbVar2, (ui3) objM22097O10, vi3Var6, e16VarM4412e3, r16, 199680);
                                oh4Var2 = oh4Var3;
                                u45Var2 = u45Var3;
                                r4 = 0;
                                r16.m22139q(false);
                            } else {
                                oh4Var2 = oh4Var3;
                                u45Var2 = u45Var3;
                                r4 = 0;
                                r16.m22111b0(-229576500);
                                r16.m22139q(false);
                            }
                            if (u45Var2 == null) {
                                b16Var = b16Var2;
                                r16.m22111b0(-229545377);
                                r16.m22139q(r4);
                            } else {
                                b16Var = b16Var2;
                                r16.m22111b0(-229545376);
                                if (oh4Var2.f54343e) {
                                    r16.m22111b0(2029695086);
                                    r16.m22139q(r4);
                                } else {
                                    r16.m22111b0(2029595142);
                                    AbstractC2117b.m9026f(c99.m4412e(b16Var, 1.0f), u45Var2, r16, 6);
                                    r16.m22139q(r4);
                                }
                                r16.m22139q(r4);
                            }
                            AbstractC0054a.m734i(Integer.valueOf((int) (u45Var2 != null ? u45Var2.f63394a : r4)), new as4(1.0f, true), null, "karaoke-lesson-crossfade", ci8.m4703P(-1855999476, new aj3() { // from class: jh4
                                @Override // p000.aj3
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    int i6 = r4;
                                    xfa xfaVar = xfa.f68157a;
                                    oh4 oh4Var4 = oh4Var2;
                                    b16 b16Var3 = b16.f7762a;
                                    switch (i6) {
                                        case 0:
                                            ((Integer) obj5).getClass();
                                            ye1 ye1Var3 = (ye1) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                                tj3Var3.m22102U();
                                            } else if (!oh4Var4.f54341c) {
                                                tj3Var3.m22111b0(1328771607);
                                                AbstractC2117b.m9025e(c99.m4411d(b16Var3, 1.0f), oh4Var4.f54339a, oh4Var4.f54340b, Integer.valueOf(oh4Var4.f54344f), oh4Var4.f54347i, vi3Var7, tj3Var3, 6);
                                                tj3Var3.m22139q(false);
                                            } else {
                                                tj3Var3.m22111b0(1328631859);
                                                AbstractC2117b.m9027g(c99.m4411d(b16Var3, 1.0f), tj3Var3, 6);
                                                tj3Var3.m22139q(false);
                                            }
                                            break;
                                        default:
                                            ((Integer) obj5).getClass();
                                            ye1 ye1Var4 = (ye1) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else if (!oh4Var4.f54341c) {
                                                tj3Var4.m22111b0(-40762640);
                                                AbstractC2117b.m9025e(c99.m4411d(b16Var3, 1.0f), oh4Var4.f54339a, oh4Var4.f54340b, Integer.valueOf(oh4Var4.f54344f), oh4Var4.f54347i, vi3Var7, tj3Var4, 6);
                                                tj3Var4.m22139q(false);
                                            } else {
                                                tj3Var4.m22111b0(-40927436);
                                                AbstractC2117b.m9027g(c99.m4411d(b16Var3, 1.0f), tj3Var4, 6);
                                                tj3Var4.m22139q(false);
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            }, r16), r16, 27648, 4);
                            ?? r18 = r16;
                            final int i6 = 1;
                            final oh4 oh4Var4 = oh4Var2;
                            final u45 u45Var4 = u45Var2;
                            AbstractC2117b.m9028h(ci8.m4703P(901475793, new zi3() { // from class: ih4
                                @Override // p000.zi3
                                public final Object invoke(Object obj5, Object obj6) {
                                    String str3;
                                    String str4;
                                    int i7 = i6;
                                    xfa xfaVar = xfa.f68157a;
                                    p84 p84Var2 = we1.f66679a;
                                    String strM17131l0 = null;
                                    t66 t66Var6 = t66Var5;
                                    u45 u45Var5 = u45Var4;
                                    oh4 oh4Var5 = oh4Var4;
                                    switch (i7) {
                                        case 0:
                                            ye1 ye1Var3 = (ye1) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                tj3Var3.m22102U();
                                            } else if (!oh4Var5.f54348j) {
                                                tj3Var3.m22111b0(1120023200);
                                                boolean z4 = oh4Var5.f54342d;
                                                hc7 hc7Var = oh4Var5.f54345g;
                                                int i8 = hc7Var.f42177e;
                                                int i9 = (int) hc7Var.f42176d;
                                                boolean z5 = hc7Var.f42174b == PlayerState.Playing;
                                                boolean z6 = hc7Var.f42180h;
                                                boolean z7 = hc7Var.f42179g;
                                                ac7 ac7Var = hc7Var.f42181i;
                                                if (u45Var5 != null && (str3 = u45Var5.f63398e) != null) {
                                                    strM17131l0 = AbstractC3352my.m17131l0(str3);
                                                }
                                                String str5 = strM17131l0;
                                                Object objM22097O11 = tj3Var3.m22097O();
                                                if (objM22097O11 == p84Var2) {
                                                    objM22097O11 = new C0023al(17, t66Var6);
                                                    tj3Var3.m22131l0(objM22097O11);
                                                }
                                                hed.m13213a(null, i8, i9, z5, z4, z6, z7, ac7Var, str5, vi3Var6, (vi3) objM22097O11, tj3Var3, 0);
                                                tj3Var3.m22139q(false);
                                            } else {
                                                tj3Var3.m22111b0(1119839401);
                                                AbstractC2117b.m9021a(oh4Var5.f54349k, tj3Var3, 0);
                                                tj3Var3.m22139q(false);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var4 = (ye1) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                tj3Var4.m22102U();
                                            } else if (!oh4Var5.f54348j) {
                                                tj3Var4.m22111b0(-564943001);
                                                boolean z8 = oh4Var5.f54342d;
                                                hc7 hc7Var2 = oh4Var5.f54345g;
                                                int i10 = hc7Var2.f42177e;
                                                int i11 = (int) hc7Var2.f42176d;
                                                boolean z9 = hc7Var2.f42174b == PlayerState.Playing;
                                                boolean z10 = hc7Var2.f42180h;
                                                boolean z11 = hc7Var2.f42179g;
                                                ac7 ac7Var2 = hc7Var2.f42181i;
                                                if (u45Var5 != null && (str4 = u45Var5.f63398e) != null) {
                                                    strM17131l0 = AbstractC3352my.m17131l0(str4);
                                                }
                                                String str6 = strM17131l0;
                                                Object objM22097O12 = tj3Var4.m22097O();
                                                if (objM22097O12 == p84Var2) {
                                                    objM22097O12 = new C0023al(16, t66Var6);
                                                    tj3Var4.m22131l0(objM22097O12);
                                                }
                                                hed.m13213a(null, i10, i11, z9, z8, z10, z11, ac7Var2, str6, vi3Var6, (vi3) objM22097O12, tj3Var4, 0);
                                                tj3Var4.m22139q(false);
                                            } else {
                                                tj3Var4.m22111b0(-565100760);
                                                AbstractC2117b.m9021a(oh4Var5.f54349k, tj3Var4, 0);
                                                tj3Var4.m22139q(false);
                                            }
                                            break;
                                    }
                                    return xfaVar;
                                }
                            }, r18), r18, 6);
                            r18.m22139q(false);
                            r15 = r18;
                        }
                        r15.m22139q(true);
                    } else {
                        r16.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, 805306374, 510);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fn0(oh4Var, u45Var, vi3Var, vi3Var2, ui3Var, vi3Var3, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9025e(e16 e16Var, List list, LessonTranslationSentence lessonTranslationSentence, Integer num, String str, vi3 vi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        C3661uu c3661uu;
        list.getClass();
        str.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1425588328);
        int i2 = i | (tj3Var.m22124i(list) ? 32 : 16) | (tj3Var.m22124i(lessonTranslationSentence) ? 256 : 128) | (tj3Var.m22120g(num) ? 2048 : 1024) | (tj3Var.m22120g(str) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
            boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22124i(lessonTranslationSentence) | tj3Var.m22120g(c0127bM17056a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new KaraokeSentenceViewKt$KaraokeSentenceView$1$1(list, lessonTranslationSentence, c0127bM17056a, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10049l(list, lessonTranslationSentence, (zi3) objM22097O, tj3Var);
            e16Var2 = e16Var;
            e16 e16VarM4411d = c99.m4411d(e16Var2, 1.0f);
            C3661uu c3661uu2 = new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28));
            boolean zM22124i2 = ((i2 & 7168) == 2048) | tj3Var.m22124i(list) | tj3Var.m22124i(lessonTranslationSentence) | ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                c3661uu = c3661uu2;
                C3537ri c3537ri = new C3537ri(list, lessonTranslationSentence, num, str, vi3Var, 3);
                tj3Var.m22131l0(c3537ri);
                objM22097O2 = c3537ri;
            } else {
                c3661uu = c3661uu2;
            }
            fa4.m11642c(e16VarM4411d, c0127bM17056a, null, c3661uu, null, null, false, null, (vi3) objM22097O2, tj3Var, 0, 492);
        } else {
            e16Var2 = e16Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zs0(e16Var2, list, lessonTranslationSentence, num, str, vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9026f(e16 e16Var, u45 u45Var, ye1 ye1Var, int i) {
        u45Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1678325651);
        int i2 = i | (tj3Var.m22124i(u45Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            fc0 fc0Var = nj0.f52789H;
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), fc0Var, tj3Var, 48);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            String str = u45Var.f63396c;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            b16 b16Var = b16.f7762a;
            ss5.m21702b(str, null, pb1.m19045o(c99.m4422o(b16Var, 64.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64857c), null, null, tj3Var, 48, 4088);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(u45Var.f63395b, b34.m3236d(c99.m4412e(b16Var, 1.0f)), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 48, 0, 262140);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            String str2 = u45Var.f63397d;
            if (str2 == null) {
                str2 = "";
            }
            lw9.m16554b(str2, e16VarM4412e, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 48, 0, 262140);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(e16Var, i, 16, u45Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9027g(e16 e16Var, ye1 ye1Var, int i) {
        ec0 ec0Var = nj0.f52791J;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(602739573);
        if (tj3Var.m22099R(i & 1, (i & 3) != 2)) {
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), ec0Var, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
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
            tj3Var.m22111b0(974552907);
            for (int i2 = 0; i2 < 3; i2++) {
                b16 b16Var = b16.f7762a;
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), ec0Var, tj3Var, 0);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a2);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 1.0f), 16.0f), ui8.m22752a(50))), tj3Var, 0);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 0.85f), 16.0f), ui8.m22752a(50))), tj3Var, 0);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 0.5f), 16.0f), ui8.m22752a(50))), tj3Var, 0);
                tj3Var.m22139q(true);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 8, e16Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m9028h(C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1203199729);
        int i2 = 1;
        if (tj3Var2.m22099R(i & 1, (i & 3) != 2)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            r46.m20381f(e16VarM4412e, ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64858d, te1.m22000n(62, 4.0f), te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55868n, 0L, tj3Var2), ci8.m4703P(-471745061, new mx0(c0282a, i2), tj3Var2), tj3Var2, 24582, 0);
            tj3Var = tj3Var2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ry3(c0282a, i, 3);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m9029i(e16 e16Var, LessonTranslationSentence lessonTranslationSentence, boolean z, Integer num, String str, ui3 ui3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        long jM198b;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1302143611);
        int i2 = i | 6 | (tj3Var.m22124i(lessonTranslationSentence) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22120g(num) ? 2048 : 1024) | (tj3Var.m22120g(str) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                tj3Var.m22111b0(-15425089);
                jM198b = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55870o;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-15357044);
                jM198b = aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55870o);
                tj3Var.m22139q(false);
            }
            boolean z2 = false;
            dh9 dh9VarM785b = AbstractC0072k.m785b(jM198b, ss5.m21703b0(200, 0, null, 6), "textColor", tj3Var, 432, 8);
            dh9 dh9VarM750b = AbstractC0060b.m750b(z ? 1.0f : 0.8f, ss5.m21698Y(0.75f, 400.0f, null, 4), "scale", null, tj3Var, 3120, 20);
            dh9 dh9VarM749a = AbstractC0060b.m749a(num.intValue(), ss5.m21703b0(200, 0, null, 6), "fontSize", tj3Var, 432, 8);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            boolean z3 = (458752 & i2) == 131072;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                objM22097O = new xa0(4, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15);
            if ((i2 & 57344) == 16384) {
                z2 = true;
            }
            boolean zM22120g = tj3Var.m22120g(dh9VarM750b) | z2;
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new ke2(9, str, dh9VarM750b);
                tj3Var.m22131l0(objM22097O2);
            }
            lw9.m16554b(lessonTranslationSentence.f19296e, AbstractC0309d.m1406a(e16VarM815b, (vi3) objM22097O2), ((aa1) dh9VarM785b.getValue()).f414a, null, d32.m10032c0(((xj2) dh9VarM749a.getValue()).f68285a, 4294967296L), null, z ? bc3.f8324j : bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71401e, 0L, 0L, null, null, null, 0L, null, null, AbstractC3184kh.m15194A(str) ? 2 : 1, 0L, null, 16711679), tj3Var, 0, 0, 130984);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py3(e16Var2, lessonTranslationSentence, z, num, str, ui3Var, i);
        }
    }
}
