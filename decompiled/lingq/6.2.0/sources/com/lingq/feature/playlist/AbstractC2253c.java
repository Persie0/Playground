package com.lingq.feature.playlist;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.input.nestedscroll.C0317a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.core.p012ui.dragdrop.C1919b;
import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.video.AbstractC1824e;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.playlist.AbstractC2253c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3003fj;
import p000.AbstractC3122is;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C2966ej;
import p000.C3304ln;
import p000.C3341mn;
import p000.C3419on;
import p000.C3456pd;
import p000.C3539rk;
import p000.C3598t4;
import p000.C3661uu;
import p000.C3741x;
import p000.C3836zk;
import p000.a05;
import p000.a45;
import p000.ab1;
import p000.ac7;
import p000.ad7;
import p000.aj3;
import p000.as4;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.be7;
import p000.bq1;
import p000.c81;
import p000.c99;
import p000.cgc;
import p000.ci8;
import p000.cl9;
import p000.cw0;
import p000.cx2;
import p000.cy0;
import p000.d32;
import p000.do4;
import p000.do7;
import p000.dz4;
import p000.e16;
import p000.ee7;
import p000.eh0;
import p000.eqb;
import p000.et6;
import p000.f91;
import p000.fb2;
import p000.fe9;
import p000.fy9;
import p000.g41;
import p000.g54;
import p000.gc0;
import p000.ge9;
import p000.gm5;
import p000.gv5;
import p000.h41;
import p000.h7a;
import p000.h85;
import p000.hc7;
import p000.he7;
import p000.hl1;
import p000.ht5;
import p000.hz4;
import p000.i75;
import p000.ibd;
import p000.ie7;
import p000.ii6;
import p000.jc7;
import p000.je7;
import p000.k3c;
import p000.k87;
import p000.kc7;
import p000.ki6;
import p000.ks3;
import p000.ks9;
import p000.l55;
import p000.l70;
import p000.l77;
import p000.lc7;
import p000.lda;
import p000.le7;
import p000.lo1;
import p000.lw9;
import p000.mbd;
import p000.mc7;
import p000.mo1;
import p000.ms5;
import p000.mv4;
import p000.nc7;
import p000.nj0;
import p000.nn1;
import p000.oc7;
import p000.oe7;
import p000.oha;
import p000.ok9;
import p000.omd;
import p000.p58;
import p000.p84;
import p000.p87;
import p000.pb1;
import p000.pbb;
import p000.pc7;
import p000.ph5;
import p000.ps2;
import p000.ps5;
import p000.pvc;
import p000.pz5;
import p000.q2c;
import p000.q2d;
import p000.q65;
import p000.qc7;
import p000.qh0;
import p000.qi3;
import p000.qj8;
import p000.r46;
import p000.rc7;
import p000.rd7;
import p000.re7;
import p000.s35;
import p000.s70;
import p000.sc7;
import p000.sc9;
import p000.sd7;
import p000.se1;
import p000.sj8;
import p000.so1;
import p000.ss5;
import p000.t66;
import p000.t9a;
import p000.tb7;
import p000.tc7;
import p000.td7;
import p000.te1;
import p000.tj3;
import p000.ty3;
import p000.u0c;
import p000.u54;
import p000.u91;
import p000.uc7;
import p000.ud7;
import p000.ui3;
import p000.un1;
import p000.ux5;
import p000.uy0;
import p000.v91;
import p000.vc7;
import p000.vd7;
import p000.vh9;
import p000.vi3;
import p000.vk9;
import p000.vo1;
import p000.vx9;
import p000.vz1;
import p000.wa5;
import p000.wc7;
import p000.we1;
import p000.wfb;
import p000.wo1;
import p000.ws6;
import p000.x17;
import p000.x18;
import p000.xa0;
import p000.xc7;
import p000.xfa;
import p000.xj2;
import p000.y25;
import p000.ye1;
import p000.ye7;
import p000.yoc;
import p000.yu4;
import p000.ze7;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.playlist.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2253c {
    /* JADX INFO: renamed from: a */
    public static final void m9215a(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1355380875);
        int i2 = 2;
        int i3 = i | (tj3Var2.m22124i(ui3Var) ? 4 : 2) | (tj3Var2.m22124i(ui3Var2) ? 32 : 16);
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var2, ci8.m4703P(481317075, new he7(i2, ui3Var), tj3Var2), null, ci8.m4703P(1880270677, new he7(3, ui3Var2), tj3Var2), null, cgc.f10058x, cgc.f10059y, null, 0L, 0L, 0L, 0L, null, tj3Var, ((i3 >> 3) & 14) | 1772592, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9216b(int i, int i2, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i3) {
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-780174103);
        int i4 = i3 | (tj3Var2.m22116e(i) ? 4 : 2) | (tj3Var2.m22116e(i2) ? 32 : 16) | (tj3Var2.m22124i(ui3Var) ? 256 : 128) | (tj3Var2.m22124i(ui3Var2) ? 2048 : 1024);
        int i5 = 1;
        if (tj3Var2.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = (i4 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new xa0(23, ui3Var);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            q2d.m19625a((ui3) objM22097O, ci8.m4703P(500746657, new he7(6, ui3Var2), tj3Var2), null, ci8.m4703P(789566047, new he7(7, ui3Var), tj3Var2), null, cgc.f10052r, ci8.m4703P(1222795132, new ie7(i, i2, i5), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je7(i, i2, ui3Var, ui3Var2, i3, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9217c(final C2251a c2251a, final vi3 vi3Var, ye1 ye1Var, int i) {
        c2251a.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1588833112);
        int i2 = (tj3Var.m22124i(c2251a) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            final Activity activity = (Activity) tj3Var.m22128k(ph5.f56222a);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2251a.f27797z, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2251a.f27784m.f21946D, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2251a.f27788q, tj3Var);
            wo1 wo1Var = (wo1) t66VarM2513c.getValue();
            vo1 vo1Var = wo1Var instanceof vo1 ? (vo1) wo1Var : null;
            y25 y25Var = vo1Var != null ? vo1Var.f65701l : null;
            int i3 = 10;
            p84 p84Var = we1.f66679a;
            if (y25Var == null || !y25Var.f69128a) {
                tj3Var.m22111b0(1909631066);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1907942589);
                s35 s35Var = new s35(y25Var.f69129b, y25Var.f69130c, y25Var.f69131d, y25Var.f69132e, LessonInfoSource.CoursePlaylist, null, 80);
                gv5 gv5Var = new gv5(c2251a, vi3Var, activity, 12);
                boolean zM22124i = tj3Var.m22124i(c2251a);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == p84Var) {
                    objM22097O = new C3539rk(c2251a, 10);
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC2131b.m9046e(s35Var, gv5Var, (ui3) objM22097O, tj3Var, 48);
                tj3Var.m22139q(false);
            }
            wo1 wo1Var2 = (wo1) t66VarM2513c.getValue();
            String str = c2251a.f27785n.f71041b;
            tb7 tb7Var = ((hc7) t66VarM2513c2.getValue()).f42185m;
            CoursePlaylistSort coursePlaylistSort = (CoursePlaylistSort) t66VarM2513c3.getValue();
            int i4 = i2 & 112;
            boolean zM22124i2 = tj3Var.m22124i(c2251a) | (i4 == 32) | tj3Var.m22124i(activity);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                objM22097O2 = new vi3() { // from class: com.lingq.feature.playlist.b
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Object value;
                        int i5;
                        String str2;
                        String str3;
                        String str4;
                        ad7 ad7Var = (ad7) obj;
                        ad7Var.getClass();
                        boolean z = ad7Var instanceof tc7;
                        C2251a c2251a2 = c2251a;
                        Object obj2 = null;
                        if (z) {
                            tc7 tc7Var = (tc7) ad7Var;
                            ud7 ud7Var = tc7Var.f62153b;
                            int i6 = ud7Var.f63767a;
                            int i7 = ud7Var.f63776j;
                            if (c2251a2.m9207Z2(i6)) {
                                c2251a2.m9209b3(i6);
                            } else {
                                int i8 = so1.f61087a[tc7Var.f62152a.ordinal()];
                                if (i8 != 1) {
                                    vi3 vi3Var2 = vi3Var;
                                    if (i8 == 2) {
                                        String str5 = ud7Var.f63775i;
                                        vi3Var2.invoke(new ki6(i6, str5 != null ? str5 : "", i7));
                                    } else if (i8 == 3) {
                                        vi3Var2.invoke(new ii6(i7));
                                    } else if (i8 == 4) {
                                        C3244l c3244l = c2251a2.f27796y;
                                        do {
                                            value = c3244l.getValue();
                                            i5 = ud7Var.f63767a;
                                            str2 = ud7Var.f63774h;
                                            String str6 = ud7Var.f63772f;
                                            str3 = str6 == null ? "" : str6;
                                            str4 = ud7Var.f63771e;
                                        } while (!c3244l.m15570h(value, new y25(i5, str2, str3, str4 == null ? "" : str4, true)));
                                    } else {
                                        if (i8 != 5) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        c2251a2.m9204W2(ud7Var);
                                    }
                                }
                            }
                        } else if (ad7Var instanceof vc7) {
                            vc7 vc7Var = (vc7) ad7Var;
                            ud7 ud7Var2 = vc7Var.f65193a;
                            String str7 = ud7Var2.f63779m;
                            int i9 = ud7Var2.f63767a;
                            if ((str7 == null || vk9.m23391n0(str7)) && !vc7Var.f65194b && ud7Var2.f63780n == null && !ud7Var2.f63782p) {
                                c2251a2.m9210c3(i9);
                            } else if (c2251a2.m9207Z2(i9)) {
                                for (Object obj3 : q2c.m19624a((List) c2251a2.f27786o.getValue())) {
                                    if (((l55) obj3).f49081a.f63767a == i9) {
                                        obj2 = obj3;
                                        break;
                                    }
                                }
                                if (((l55) obj2) != null) {
                                    c2251a2.m9209b3(i9);
                                }
                            } else {
                                c2251a2.f27784m.m8446I(i9, true);
                            }
                        } else if (ad7Var instanceof pc7) {
                            c2251a2.m9204W2(((pc7) ad7Var).f55948a);
                        } else if (ad7Var instanceof sc7) {
                            int i10 = ((sc7) ad7Var).f60682a;
                            c2251a2.getClass();
                            AbstractC1263a.m7047b(lda.m16103C(c2251a2), c2251a2.f27783l, "generateLessonAudio", new CollectionPlaylistViewModel$generateLessonAudio$1(c2251a2, i10, null));
                        } else if (ad7Var instanceof kc7) {
                            kc7 kc7Var = (kc7) ad7Var;
                            int i11 = kc7Var.f47029a;
                            int i12 = kc7Var.f47030b;
                            c2251a2.getClass();
                            wfb.m23926u(lda.m16103C(c2251a2), c2251a2.f27783l, null, new CollectionPlaylistViewModel$buyLesson$1(c2251a2, i12, i11, null), 2);
                        } else if (!(ad7Var instanceof xc7) && !(ad7Var instanceof qc7) && !ad7Var.equals(mc7.f51076a)) {
                            if (ad7Var.equals(oc7.f54174a)) {
                                c2251a2.m9206Y2();
                            } else if (ad7Var.equals(lc7.f49475a)) {
                                Activity activity2 = activity;
                                if (activity2 != null) {
                                    mbd.m16755c(activity2, ux5.m22991n("https://www.lingq.com/", c2251a2.f27773b.mo4580K1(), "/learn/", c2251a2.f27773b.mo4589b2(), "/web/settings/points"), null, 30);
                                }
                            } else if (ad7Var.equals(wc7.f66618a)) {
                                c2251a2.m9205X2();
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            }
            vi3 vi3Var2 = (vi3) objM22097O2;
            boolean zM22124i3 = tj3Var.m22124i(c2251a) | (i4 == 32);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O3 == p84Var) {
                objM22097O3 = new s70(26, c2251a, vi3Var);
                tj3Var.m22131l0(objM22097O3);
            }
            vi3 vi3Var3 = (vi3) objM22097O3;
            boolean zM22124i4 = tj3Var.m22124i(c2251a);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O4 == p84Var) {
                objM22097O4 = new C3741x(c2251a, i3);
                tj3Var.m22131l0(objM22097O4);
            }
            vi3 vi3Var4 = (vi3) objM22097O4;
            boolean z = i4 == 32;
            Object objM22097O5 = tj3Var.m22097O();
            if (z || objM22097O5 == p84Var) {
                objM22097O5 = new f91(vi3Var, 19);
                tj3Var.m22131l0(objM22097O5);
            }
            m9218d(wo1Var2, tb7Var, str, coursePlaylistSort, vi3Var2, vi3Var3, vi3Var4, (ui3) objM22097O5, tj3Var, 64);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3598t4(c2251a, i, 19, vi3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r12v2, types: [tj3] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r14v1, types: [ye1] */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16, types: [tj3] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6, types: [tj3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [tj3, ye1] */
    /* JADX INFO: renamed from: d */
    public static final void m9218d(final wo1 wo1Var, tb7 tb7Var, String str, CoursePlaylistSort coursePlaylistSort, final vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var, ye1 ye1Var, int i) {
        ?? r12;
        final int i2;
        int i3;
        ?? r6;
        ?? r8;
        C0317a c0317a;
        Pair pair;
        Triple triple;
        final int i4;
        wo1Var.getClass();
        coursePlaylistSort.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        ui3Var.getClass();
        ?? r13 = (tj3) ye1Var;
        r13.m22115d0(547837620);
        int i5 = i | (r13.m22120g(wo1Var) ? 4 : 2) | (r13.m22124i(tb7Var) ? 32 : 16) | (r13.m22120g(str) ? 256 : 128) | (r13.m22116e(coursePlaylistSort.ordinal()) ? 2048 : 1024) | (r13.m22124i(vi3Var) ? 16384 : 8192) | (r13.m22124i(vi3Var2) ? 131072 : 65536) | (r13.m22124i(vi3Var3) ? 1048576 : 524288) | (r13.m22124i(ui3Var) ? 8388608 : 4194304);
        if (r13.m22099R(i5 & 1, (4793491 & i5) != 4793490)) {
            fe9 fe9Var = (fe9) r13.m22128k(ge9.f40637a);
            fb2 fb2Var = (fb2) r13.m22128k(AbstractC0402n.f4816h);
            Object objM22097O = r13.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(new xj2(0.0f));
                r13.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = r13.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                r13.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            Object objM22097O3 = r13.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                r13.m22131l0(objM22097O3);
            }
            t66 t66Var3 = (t66) objM22097O3;
            Object objM22097O4 = r13.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j(null);
                r13.m22131l0(objM22097O4);
            }
            t66 t66Var4 = (t66) objM22097O4;
            C0127b c0127bM17056a = mv4.m17056a(0, r13, 3);
            boolean z = wo1Var instanceof vo1;
            if (!z || ((vo1) wo1Var).f65691b <= 0) {
                i2 = 1;
                r13.m22111b0(-244087250);
                r13.m22139q(false);
            } else {
                r13.m22111b0(-244373628);
                int i6 = i5 & 57344;
                boolean z2 = i6 == 16384;
                Object objM22097O5 = r13.m22097O();
                if (z2 || objM22097O5 == p84Var) {
                    objM22097O5 = new f91(vi3Var, 20);
                    r13.m22131l0(objM22097O5);
                }
                ui3 ui3Var2 = (ui3) objM22097O5;
                boolean z3 = ((i5 & 14) == 4) | (i6 == 16384);
                Object objM22097O6 = r13.m22097O();
                if (z3 || objM22097O6 == p84Var) {
                    i2 = 1;
                    objM22097O6 = new ui3() { // from class: ko1
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i7 = i2;
                            xfa xfaVar = xfa.f68157a;
                            wo1 wo1Var2 = wo1Var;
                            vi3 vi3Var4 = vi3Var;
                            switch (i7) {
                                case 0:
                                    vo1 vo1Var = (vo1) wo1Var2;
                                    vi3Var4.invoke(new kc7(((Number) vo1Var.f65697h.f47633a).intValue(), ((Number) vo1Var.f65697h.f47635c).intValue()));
                                    break;
                                default:
                                    vi3Var4.invoke(new sc7(((vo1) wo1Var2).f65691b));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    r13.m22131l0(objM22097O6);
                } else {
                    i2 = 1;
                }
                m9220f(ui3Var2, (ui3) objM22097O6, r13, 0);
                r13.m22139q(false);
            }
            if (z && ((vo1) wo1Var).f65693d) {
                r13.m22111b0(-244005007);
                int i7 = (i5 & 57344) == 16384 ? i2 : 0;
                Object objM22097O7 = r13.m22097O();
                if (i7 != 0 || objM22097O7 == p84Var) {
                    objM22097O7 = new f91(vi3Var, 21);
                    r13.m22131l0(objM22097O7);
                }
                m9232r(0, r13, (ui3) objM22097O7);
                r13.m22139q(false);
            } else {
                r13.m22111b0(-243854130);
                r13.m22139q(false);
            }
            if (!z || (triple = ((vo1) wo1Var).f65697h) == null) {
                i3 = i2;
                r6 = 0;
                r13.m22111b0(-243228178);
                r13.m22139q(false);
            } else {
                r13.m22111b0(-243740577);
                int iIntValue = ((Number) triple.f47633a).intValue();
                int iIntValue2 = ((Number) triple.f47634b).intValue();
                int i8 = i5 & 57344;
                boolean z4 = i8 == 16384;
                Object objM22097O8 = r13.m22097O();
                if (z4 || objM22097O8 == p84Var) {
                    objM22097O8 = new f91(vi3Var, 16);
                    r13.m22131l0(objM22097O8);
                }
                ui3 ui3Var3 = (ui3) objM22097O8;
                boolean z5 = ((i5 & 14) == 4) | (i8 == 16384);
                Object objM22097O9 = r13.m22097O();
                if (z5 || objM22097O9 == p84Var) {
                    i4 = 0;
                    objM22097O9 = new ui3() { // from class: ko1
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i9 = i4;
                            xfa xfaVar = xfa.f68157a;
                            wo1 wo1Var2 = wo1Var;
                            vi3 vi3Var4 = vi3Var;
                            switch (i9) {
                                case 0:
                                    vo1 vo1Var = (vo1) wo1Var2;
                                    vi3Var4.invoke(new kc7(((Number) vo1Var.f65697h.f47633a).intValue(), ((Number) vo1Var.f65697h.f47635c).intValue()));
                                    break;
                                default:
                                    vi3Var4.invoke(new sc7(((vo1) wo1Var2).f65691b));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    r13.m22131l0(objM22097O9);
                } else {
                    i4 = 0;
                }
                i3 = 1;
                ?? r7 = i4;
                m9216b(iIntValue, iIntValue2, ui3Var3, (ui3) objM22097O9, r13, 0);
                r13.m22139q(r7);
                r6 = r7;
            }
            if (!z || (pair = ((vo1) wo1Var).f65698i) == null) {
                ?? r9 = r13;
                r9.m22111b0(-242776818);
                r9.m22139q(r6);
                r8 = r9;
            } else {
                r13.m22111b0(-243120081);
                int iIntValue3 = ((Number) pair.f47623a).intValue();
                int iIntValue4 = ((Number) pair.f47624b).intValue();
                int i9 = i5 & 57344;
                ?? r11 = i9 == 16384 ? i3 : r6;
                Object objM22097O10 = r13.m22097O();
                if (r11 != 0 || objM22097O10 == p84Var) {
                    objM22097O10 = new f91(vi3Var, 17);
                    r13.m22131l0(objM22097O10);
                }
                ui3 ui3Var4 = (ui3) objM22097O10;
                ?? r14 = i9 == 16384 ? i3 : r6;
                Object objM22097O11 = r13.m22097O();
                if (r14 != 0 || objM22097O11 == p84Var) {
                    objM22097O11 = new f91(vi3Var, 18);
                    r13.m22131l0(objM22097O11);
                }
                m9224j(iIntValue3, iIntValue4, ui3Var4, (ui3) objM22097O11, r13, 0);
                ?? r10 = r13;
                r10.m22139q(r6);
                r8 = r10;
            }
            Boolean bool = (Boolean) t66Var2.getValue();
            bool.getClass();
            Object objM22097O12 = r8.m22097O();
            if (objM22097O12 == p84Var) {
                c0317a = null;
                objM22097O12 = new CoursePlaylistScreenKt$CoursePlaylistScreen$8$1(t66Var2, null);
                r8.m22131l0(objM22097O12);
            } else {
                c0317a = null;
            }
            d32.m10047k(r8, (zi3) objM22097O12, bool);
            x17 x17Var = h7a.f41916a;
            ps2 ps2VarM13114a = h7a.m13114a(AbstractC0218a.m1129i(r8), r8);
            ?? r15 = r8;
            b34.m3232b(c99.m4410c(AbstractC0319c.m1450a(b16.f7762a, ps2VarM13114a.f56741e, c0317a), 1.0f), ci8.m4703P(1779395192, new C3836zk(ps2VarM13114a, str, ui3Var, 6), r8), null, null, null, 0, 0L, 0L, null, ci8.m4703P(802679427, new lo1(vi3Var, t66Var2, fe9Var, c0127bM17056a, coursePlaylistSort, vi3Var3, wo1Var, tb7Var, fb2Var, vi3Var2, t66Var3, t66Var, t66Var4), r15), r15, 805306416, 508);
            r12 = r15;
        } else {
            r13.m22102U();
            r12 = r13;
        }
        x18 x18VarM22143u = r12.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mo1(wo1Var, tb7Var, str, coursePlaylistSort, vi3Var, vi3Var2, vi3Var3, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9219e(e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1133879012);
        int i2 = i | 6;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            String strM4839V = cl9.m4839V(vz1.m23620a0(tj3Var, R$string.texts_add_to_playlist), "YYYYY", "...");
            int iM23389l0 = vk9.m23389l0(strM4839V, "XXXXX", 0, false, 6);
            if (iM23389l0 == -1) {
                iM23389l0 = vk9.m23389l0(strM4839V, "    ", 0, false, 6);
            }
            String strM4839V2 = cl9.m4839V(strM4839V, "XXXXX", "    ");
            C3341mn c3341mn = new C3341mn();
            c3341mn.m16929d(strM4839V2.substring(0, iM23389l0 + 1));
            C3304ln c3304ln = new C3304ln(new ok9("iconId"), c3341mn.f51543a.length(), 0, 4);
            ArrayList arrayList = c3341mn.f51544b;
            arrayList.add(c3304ln);
            c3341mn.f51545c.add(c3304ln);
            arrayList.size();
            c3341mn.m16929d("Playlist Icon");
            c3341mn.m16930e();
            int i3 = iM23389l0 + 3;
            if (i3 < strM4839V2.length()) {
                c3341mn.m16929d(strM4839V2.substring(i3));
            }
            C3419on c3419onM16933h = c3341mn.m16933h();
            vh9 vh9Var = ps5.f56764b;
            Map mapM15364Q = AbstractC3194a.m15364Q(new Pair("iconId", new u54(new p87(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g.f66065a.f42265b, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g.f66065a.f42265b))));
            zf1 zf1Var = ge9.f40637a;
            float f = ((fe9) tj3Var.m22128k(zf1Var)).f38960i;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
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
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_empty_playlist, tj3Var, 0), null, null, null, null, 0.0f, null, tj3Var, 56, 124);
            lw9.m16555c(c3419onM16933h, null, 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, mapM15364Q, null, null, tj3Var, 0, 0, 457726);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 15, e16Var2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9220f(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(163719091);
        int i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var2) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new xa0(24, ui3Var);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            q2d.m19625a((ui3) objM22097O, ci8.m4703P(1228512763, new he7(8, ui3Var2), tj3Var2), null, ci8.m4703P(1716559869, new he7(9, ui3Var), tj3Var2), null, null, cgc.f10046l, null, 0L, 0L, 0L, 0L, null, tj3Var, 1575984, 16308);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9221g(e16 e16Var, final int i, final int i2, final boolean z, final boolean z2, final ac7 ac7Var, final PlayerType playerType, final pbb pbbVar, final vi3 vi3Var, final String str, String str2, final vi3 vi3Var2, ye1 ye1Var, final int i3, final int i4, final int i5) {
        e16 e16Var2;
        int i6;
        int i7;
        boolean z3;
        pbb pbbVar2;
        String str3;
        int i8;
        tj3 tj3Var;
        final String str4;
        final e16 e16Var3;
        ac7Var.getClass();
        playerType.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1862494286);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i6 = i3 | 6;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i6 = (tj3Var2.m22120g(e16Var2) ? 4 : 2) | i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 = i2;
            i6 |= tj3Var2.m22116e(i7) ? 256 : 128;
        } else {
            i7 = i2;
        }
        if ((i3 & 3072) == 0) {
            i6 |= tj3Var2.m22122h(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            z3 = z2;
            i6 |= tj3Var2.m22122h(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        int i10 = 32;
        int i11 = i6 | (tj3Var2.m22120g(ac7Var) ? 131072 : 65536);
        if ((i3 & 1572864) == 0) {
            i11 |= tj3Var2.m22116e(playerType.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            pbbVar2 = pbbVar;
            i11 |= tj3Var2.m22120g(pbbVar2) ? 8388608 : 4194304;
        } else {
            pbbVar2 = pbbVar;
        }
        if ((i3 & 805306368) == 0) {
            i11 |= tj3Var2.m22120g(str) ? 536870912 : 268435456;
        }
        int i12 = i11;
        int i13 = i5 & 1024;
        if (i13 != 0) {
            i8 = i4 | 6;
            str3 = str2;
        } else {
            str3 = str2;
            i8 = i4 | (tj3Var2.m22120g(str3) ? 4 : 2);
        }
        if ((i4 & 48) == 0) {
            if (!tj3Var2.m22124i(vi3Var2)) {
                i10 = 16;
            }
            i8 |= i10;
        }
        if (tj3Var2.m22099R(i12 & 1, ((i12 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            e16Var3 = i9 != 0 ? b16.f7762a : e16Var2;
            final String str5 = i13 != 0 ? null : str3;
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            final boolean zM12248c = fy9.m12248c(t9a.m21912b(tj3Var2));
            boolean z4 = (i12 & 1879048192) == 536870912;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z4 || objM22097O2 == p84Var) {
                objM22097O2 = new MiniPlayerKt$MiniPlayer$1$1(str, vi3Var, t66Var, null);
                tj3Var2.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O2, str);
            boolean z5 = (i12 & 3670016) == 1048576;
            Object objM22097O3 = tj3Var2.m22097O();
            if (z5 || objM22097O3 == p84Var) {
                objM22097O3 = new MiniPlayerKt$MiniPlayer$2$1(playerType, t66Var, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, playerType);
            boolean z6 = (playerType == PlayerType.Audio || ((String) t66Var.getValue()) == null) ? false : true;
            String str6 = (String) t66Var.getValue();
            if (str6 == null) {
                str6 = "";
            }
            boolean zM22122h = tj3Var2.m22122h(z6);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22122h || objM22097O4 == p84Var) {
                objM22097O4 = new cy0(z6, vi3Var, 1);
                tj3Var2.m22131l0(objM22097O4);
            }
            final vi3 vi3Var3 = (vi3) objM22097O4;
            final int i14 = i7;
            final pbb pbbVar3 = pbbVar2;
            final boolean z7 = z6;
            final String str7 = str6;
            final boolean z8 = z3;
            tj3Var = tj3Var2;
            r46.m20381f(e16Var3, null, te1.m22000n(62, 4.0f), null, ci8.m4703P(885031836, new aj3() { // from class: wz5
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        boolean z9 = zM12248c;
                        boolean z10 = z7;
                        final String str8 = str7;
                        final boolean z11 = z8;
                        final ac7 ac7Var2 = ac7Var;
                        final int i15 = i;
                        final String str9 = str5;
                        final pbb pbbVar4 = pbbVar3;
                        final vi3 vi3Var4 = vi3Var;
                        final vi3 vi3Var5 = vi3Var2;
                        int i16 = i14;
                        boolean z12 = z;
                        vi3 vi3Var6 = vi3Var3;
                        if (z9 && z10) {
                            tj3Var3.m22111b0(-820714214);
                            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                            zf1 zf1Var = ge9.f40637a;
                            e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var3.m22128k(zf1Var)).f38957f);
                            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var3.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var3, 0);
                            int iHashCode = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m = tj3Var3.m22132m();
                            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T);
                            se1.f60731q.getClass();
                            ui3 ui3Var = C0352b.f4299b;
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a);
                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                            oha.m18000f(tj3Var3, C0352b.f4305h);
                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                            if (0.5f <= 0.0d) {
                                g54.m12362a("invalid weight; must be greater than zero");
                            }
                            as4 as4Var = new as4(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
                            boolean zM22120g = tj3Var3.m22120g(vi3Var4);
                            Object objM22097O5 = tj3Var3.m22097O();
                            if (zM22120g || objM22097O5 == we1.f66679a) {
                                objM22097O5 = new q65(vi3Var4, 5);
                                tj3Var3.m22131l0(objM22097O5);
                            }
                            AbstractC2253c.m9223i(as4Var, str8, z11, ac7Var2, i15, str9, pbbVar4, (ui3) objM22097O5, vi3Var5, tj3Var3, 0, 0);
                            if (0.5f <= 0.0d) {
                                g54.m12362a("invalid weight; must be greater than zero");
                            }
                            AbstractC2253c.m9222h(new as4(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true), i15, i16, z12, ac7Var2, vi3Var5, vi3Var6, tj3Var3, 0, 0);
                            tj3Var3.m22139q(true);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(-819486831);
                            e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f);
                            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m2 = tj3Var3.m22132m();
                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21607T2);
                            se1.f60731q.getClass();
                            ui3 ui3Var2 = C0352b.f4299b;
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var2);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                            oha.m18000f(tj3Var3, C0352b.f4305h);
                            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                            AbstractC0054a.m731f(z10, null, null, null, null, ci8.m4703P(864960490, new aj3() { // from class: yz5
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    ye1 ye1Var3 = (ye1) obj5;
                                    ((Integer) obj6).getClass();
                                    ((InterfaceC0067f) obj4).getClass();
                                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, ye1Var3, 0);
                                    tj3 tj3Var4 = (tj3) ye1Var3;
                                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                                    b16 b16Var2 = b16.f7762a;
                                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(ye1Var3, b16Var2);
                                    se1.f60731q.getClass();
                                    ui3 ui3Var3 = C0352b.f4299b;
                                    tj3 tj3Var5 = (tj3) ye1Var3;
                                    tj3Var5.m22119f0();
                                    if (tj3Var5.f62384S) {
                                        tj3Var5.m22130l(ui3Var3);
                                    } else {
                                        tj3Var5.m22137o0();
                                    }
                                    oha.m18001g(ye1Var3, C0352b.f4303f, bb1VarM230a2);
                                    oha.m18001g(ye1Var3, C0352b.f4302e, l77VarM22132m3);
                                    oha.m18001g(ye1Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                                    oha.m18000f(ye1Var3, C0352b.f4305h);
                                    oha.m18001g(ye1Var3, C0352b.f4301d, e16VarM1322c3);
                                    vi3 vi3Var7 = vi3Var4;
                                    boolean zM22120g2 = tj3Var5.m22120g(vi3Var7);
                                    Object objM22097O6 = tj3Var5.m22097O();
                                    if (zM22120g2 || objM22097O6 == we1.f66679a) {
                                        objM22097O6 = new q65(vi3Var7, 8);
                                        tj3Var5.m22131l0(objM22097O6);
                                    }
                                    AbstractC2253c.m9223i(null, str8, z11, ac7Var2, i15, str9, pbbVar4, (ui3) objM22097O6, vi3Var5, ye1Var3, 0, 1);
                                    thb.m22044c(ye1Var3, c99.m4414g(b16Var2, ((fe9) tj3Var5.m22128k(ge9.f40637a)).f38952a));
                                    tj3Var5.m22139q(true);
                                    return xfa.f68157a;
                                }
                            }, tj3Var3), tj3Var3, 1572870, 30);
                            AbstractC2253c.m9222h(null, i15, i16, z12, ac7Var2, vi3Var5, vi3Var6, tj3Var3, 0, 1);
                            tj3Var3.m22139q(true);
                            tj3Var3.m22139q(false);
                        }
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, (i12 & 14) | 24576, 10);
            str4 = str5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            str4 = str3;
            e16Var3 = e16Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: xz5
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    int iM19383z2 = pk9.m19383z(i4);
                    AbstractC2253c.m9221g(e16Var3, i, i2, z, z2, ac7Var, playerType, pbbVar, vi3Var, str, str4, vi3Var2, (ye1) obj, iM19383z, iM19383z2, i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m9222h(e16 e16Var, final int i, final int i2, boolean z, ac7 ac7Var, vi3 vi3Var, final vi3 vi3Var2, ye1 ye1Var, final int i3, final int i4) {
        e16 e16Var2;
        int i5;
        boolean z2;
        final vi3 vi3Var3;
        final e16 e16Var3;
        final int i6;
        final int i7 = i;
        final ac7 ac7Var2 = ac7Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1996529613);
        int i8 = i4 & 1;
        if (i8 != 0) {
            i5 = i3 | 6;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i5 = i3 | (tj3Var.m22120g(e16Var2) ? 4 : 2);
        }
        int i9 = i5 | (tj3Var.m22116e(i7) ? 32 : 16) | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22120g(ac7Var2) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var) ? 131072 : 65536) | (tj3Var.m22124i(vi3Var2) ? 1048576 : 524288);
        if (tj3Var.m22099R(i9 & 1, (599187 & i9) != 599186)) {
            b16 b16Var = b16.f7762a;
            e16 e16Var4 = i8 != 0 ? b16Var : e16Var2;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var4);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16Var5 = e16Var4;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            float fM17125i0 = AbstractC3352my.m17125i0(i7);
            float fM17125i1 = AbstractC3352my.m17125i0(i2);
            float fM15944g = l70.m15944g(fM17125i0, 0.0f, fM17125i1 < 0.0f ? 0.0f : fM17125i1);
            float fM17125i2 = AbstractC3352my.m17125i0(i2);
            if (fM17125i2 < 0.0f) {
                fM17125i2 = 0.0f;
            }
            h41 h41Var = new h41(0.0f, fM17125i2);
            int i10 = 458752 & i9;
            int i11 = i9 & 3670016;
            boolean z3 = (i10 == 131072) | (i11 == 1048576);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                objM22097O = new h85(11, vi3Var, vi3Var2);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0226d0.m1132c(fM15944g, (vi3) objM22097O, e16VarM4412e, false, h41Var, 0, null, null, null, tj3Var, 384, 488);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(AbstractC3352my.m17123h0(i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
            int i12 = i2 - i;
            if (i12 < 0) {
                i12 = 0;
            }
            lw9.m16554b(AbstractC3352my.m17123h0(i12), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var, 54);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            boolean z4 = i10 == 131072;
            Object objM22097O2 = tj3Var.m22097O();
            if (z4 || objM22097O2 == p84Var) {
                vi3Var3 = vi3Var;
                objM22097O2 = new q65(vi3Var3, 6);
                tj3Var.m22131l0(objM22097O2);
            } else {
                vi3Var3 = vi3Var;
            }
            ac7Var2 = ac7Var;
            omd.m18141c((ui3) objM22097O2, null, false, null, null, ci8.m4703P(-909225502, new qi3(ac7Var2, 2), tj3Var), tj3Var, 1572864, 62);
            int i13 = i9 & 112;
            boolean z5 = (i11 == 1048576) | (i10 == 131072) | (i13 == 32);
            Object objM22097O3 = tj3Var.m22097O();
            if (z5 || objM22097O3 == p84Var) {
                i6 = 0;
                objM22097O3 = new ui3() { // from class: zz5
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i14 = i6;
                        xfa xfaVar = xfa.f68157a;
                        int i15 = i;
                        vi3 vi3Var5 = vi3Var2;
                        vi3 vi3Var6 = vi3Var3;
                        switch (i14) {
                            case 0:
                                vi3Var6.invoke(fa7.f38723a);
                                vi3Var5.invoke(new gbb(i15 - 5000));
                                break;
                            default:
                                vi3Var6.invoke(qa7.f57501a);
                                vi3Var5.invoke(new ibb(i15 + 5000));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O3);
            } else {
                i6 = 0;
            }
            int i14 = i6;
            omd.m18141c((ui3) objM22097O3, null, false, null, null, u0c.f63222a, tj3Var, 1572864, 62);
            e16 e16VarM4422o = c99.m4422o(b16Var, 56.0f);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM10007D = d32.m10007D(e16VarM4422o, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55842a, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c);
            int i15 = (i11 == 1048576 ? 1 : i14) | (i10 == 131072 ? 1 : i14) | ((i9 & 7168) == 2048 ? 1 : i14);
            Object objM22097O4 = tj3Var.m22097O();
            if (i15 != 0 || objM22097O4 == p84Var) {
                z2 = z;
                objM22097O4 = new dz4(vi3Var3, vi3Var2, z2);
                tj3Var.m22131l0(objM22097O4);
            } else {
                z2 = z;
            }
            omd.m18141c((ui3) objM22097O4, e16VarM10007D, false, null, null, ci8.m4703P(1232729050, new c81(7, z2), tj3Var), tj3Var, 1572864, 60);
            int i16 = (i11 == 1048576 ? 1 : i14) | (i10 == 131072 ? 1 : i14) | (i13 == 32 ? 1 : i14);
            Object objM22097O5 = tj3Var.m22097O();
            if (i16 != 0 || objM22097O5 == p84Var) {
                i7 = i;
                final int i17 = 1;
                objM22097O5 = new ui3() { // from class: zz5
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i18 = i17;
                        xfa xfaVar = xfa.f68157a;
                        int i19 = i7;
                        vi3 vi3Var5 = vi3Var2;
                        vi3 vi3Var6 = vi3Var3;
                        switch (i18) {
                            case 0:
                                vi3Var6.invoke(fa7.f38723a);
                                vi3Var5.invoke(new gbb(i19 - 5000));
                                break;
                            default:
                                vi3Var6.invoke(qa7.f57501a);
                                vi3Var5.invoke(new ibb(i19 + 5000));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O5);
            } else {
                i7 = i;
            }
            omd.m18141c((ui3) objM22097O5, null, false, null, null, u0c.f63223b, tj3Var, 1572864, 62);
            int i18 = i10 == 131072 ? 1 : i14;
            Object objM22097O6 = tj3Var.m22097O();
            if (i18 != 0 || objM22097O6 == p84Var) {
                objM22097O6 = new q65(vi3Var3, 7);
                tj3Var.m22131l0(objM22097O6);
            }
            omd.m18141c((ui3) objM22097O6, null, false, null, null, u0c.f63224c, tj3Var, 1572864, 62);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16Var3 = e16Var5;
        } else {
            z2 = z;
            vi3Var3 = vi3Var;
            tj3Var.m22102U();
            e16Var3 = e16Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final boolean z6 = z2;
            final vi3 vi3Var5 = vi3Var3;
            x18VarM22143u.f67642d = new zi3(i7, i2, z6, ac7Var2, vi3Var5, vi3Var2, i3, i4) { // from class: a06

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f27b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f28c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f29d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ac7 f30e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ vi3 f31f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ vi3 f32g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f33h;

                {
                    this.f33h = i4;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC2253c.m9222h(this.f26a, this.f27b, this.f28c, this.f29d, this.f30e, this.f31f, this.f32g, (ye1) obj, iM19383z, this.f33h);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m9223i(e16 e16Var, String str, boolean z, ac7 ac7Var, int i, String str2, pbb pbbVar, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i2, int i3) {
        e16 e16Var2;
        int i4;
        tj3 tj3Var;
        e16 e16Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1821081307);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i4 = i2 | (tj3Var2.m22120g(e16Var2) ? 4 : 2);
        }
        int i6 = i4 | (tj3Var2.m22120g(str) ? 32 : 16) | (tj3Var2.m22122h(z) ? 256 : 128) | (tj3Var2.m22120g(ac7Var) ? 2048 : 1024) | (tj3Var2.m22116e(i) ? 16384 : 8192) | (tj3Var2.m22120g(str2) ? 131072 : 65536) | (tj3Var2.m22120g(pbbVar) ? 1048576 : 524288) | (tj3Var2.m22124i(ui3Var) ? 8388608 : 4194304) | (tj3Var2.m22124i(vi3Var) ? 67108864 : 33554432);
        if (tj3Var2.m22099R(i6 & 1, (38347923 & i6) != 38347922)) {
            e16 e16Var4 = i5 != 0 ? b16.f7762a : e16Var2;
            e16 e16VarM19045o = pb1.m19045o(te1.m21995i(1.7777778f, c99.m4412e(e16Var4, 1.0f), false), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64858d);
            float f = i / 1000.0f;
            int i7 = i6 & 234881024;
            boolean z2 = i7 == 67108864;
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new i75(vi3Var, 6);
                tj3Var2.m22131l0(objM22097O);
            }
            vi3 vi3Var2 = (vi3) objM22097O;
            boolean z3 = i7 == 67108864;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z3 || objM22097O2 == p84Var) {
                objM22097O2 = new i75(vi3Var, 7);
                tj3Var2.m22131l0(objM22097O2);
            }
            vi3 vi3Var3 = (vi3) objM22097O2;
            boolean z4 = i7 == 67108864;
            Object objM22097O3 = tj3Var2.m22097O();
            if (z4 || objM22097O3 == p84Var) {
                objM22097O3 = new i75(vi3Var, 8);
                tj3Var2.m22131l0(objM22097O3);
            }
            tj3Var = tj3Var2;
            AbstractC1824e.m8502a(e16VarM19045o, str, pbbVar, ac7Var, f, z, false, str2, ui3Var, vi3Var2, vi3Var3, (vi3) objM22097O3, null, tj3Var, (i6 & 112) | ((i6 >> 12) & 896) | (i6 & 7168) | ((i6 << 9) & 458752) | ((i6 << 6) & 29360128) | ((i6 << 3) & 234881024), 0, 4160);
            e16Var3 = e16Var4;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var3 = e16Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2966ej(e16Var3, str, z, ac7Var, i, str2, pbbVar, ui3Var, vi3Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m9224j(int i, int i2, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i3) {
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1755999545);
        int i4 = 4;
        int i5 = i3 | (tj3Var2.m22116e(i) ? 4 : 2) | (tj3Var2.m22116e(i2) ? 32 : 16) | (tj3Var2.m22124i(ui3Var) ? 256 : 128) | (tj3Var2.m22124i(ui3Var2) ? 2048 : 1024);
        int i6 = 0;
        if (tj3Var2.m22099R(i5 & 1, (i5 & 1171) != 1170)) {
            boolean z = (i5 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new xa0(22, ui3Var);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            q2d.m19625a((ui3) objM22097O, ci8.m4703P(-1258046991, new he7(i4, ui3Var2), tj3Var2), null, ci8.m4703P(-969227601, new he7(5, ui3Var), tj3Var2), null, cgc.f10055u, ci8.m4703P(-535998516, new ie7(i, i2, i6), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772592, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je7(i, i2, ui3Var, ui3Var2, i3, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m9225k(e16 e16Var, ud7 ud7Var, boolean z, vi3 vi3Var, zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        zi3 zi3Var2;
        boolean z2;
        t66 t66Var;
        vi3Var.getClass();
        zi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1578679361);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ud7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Resources resources = (Resources) tj3Var.m22128k(AbstractC0394f.f4762c);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM10007D = d32.m10007D(e16VarM4412e, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55868n, ss5.f61356d);
            boolean zM22124i = ((i2 & 7168) == 2048) | tj3Var.m22124i(ud7Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new a45(14, vi3Var, ud7Var);
                tj3Var.m22131l0(objM22097O2);
            }
            int i3 = i2;
            e16 e16VarM14092f = AbstractC3122is.m14092f(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM10007D, 15), null, 3);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM14092f);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_collection_course_m, tj3Var, 0), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_course), c99.m4422o(b16Var, 24.0f), 0L, tj3Var, 392, 8);
            lw9.m16554b(ud7Var.f63774h, AbstractC3393o1.m17728c(1.0f, c99.m4429v(b16Var), true), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 24960, 110584);
            tj3Var = tj3Var;
            if (z) {
                zi3Var2 = zi3Var;
                z2 = true;
                tj3Var.m22111b0(-727965219);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-728863754);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    t66Var = t66Var2;
                    objM22097O3 = new do4(18, t66Var);
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    t66Var = t66Var2;
                }
                ty3.m22351a(eqb.m11322a(), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_menu), AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), 0L, tj3Var, 0, 8);
                boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                ArrayList arrayListM9233s = m9233s(ud7Var, false, false, tj3Var);
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new do4(19, t66Var);
                    tj3Var.m22131l0(objM22097O4);
                }
                ui3 ui3Var2 = (ui3) objM22097O4;
                boolean zM22124i2 = tj3Var.m22124i(resources) | ((i3 & 57344) == 16384) | tj3Var.m22124i(ud7Var);
                Object objM22097O5 = tj3Var.m22097O();
                if (zM22124i2 || objM22097O5 == p84Var) {
                    zi3Var2 = zi3Var;
                    objM22097O5 = new ws6(resources, zi3Var2, ud7Var, 3);
                    tj3Var.m22131l0(objM22097O5);
                } else {
                    zi3Var2 = zi3Var;
                }
                m9227m(3072, tj3Var, ui3Var2, (vi3) objM22097O5, null, arrayListM9233s, zBooleanValue);
                tj3Var = tj3Var;
                z2 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            if (z) {
                tj3Var.m22111b0(-727935118);
                ty3.m22351a(yoc.m25219a(), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_reorder), null, 0L, tj3Var, 0, 12);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-727770787);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z2);
        } else {
            zi3Var2 = zi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new be7(e16Var, ud7Var, z, vi3Var, zi3Var2, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m9226l(final e16 e16Var, final rd7 rd7Var, final Integer num, final boolean z, final boolean z2, final vi3 vi3Var, final vi3 vi3Var2, final zi3 zi3Var, final zi3 zi3Var2, ye1 ye1Var, final int i) {
        boolean z3;
        rd7Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        zi3Var.getClass();
        zi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1982799683);
        int i2 = (i & 6) == 0 ? (tj3Var.m22120g(e16Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(rd7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        boolean z4 = z2;
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22122h(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 131072 : 65536;
        }
        vi3 vi3Var3 = vi3Var2;
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22124i(vi3Var3) ? 1048576 : 524288;
        }
        zi3 zi3Var3 = zi3Var;
        if ((12582912 & i) == 0) {
            i2 |= tj3Var.m22124i(zi3Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= tj3Var.m22124i(zi3Var2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 38347923) != 38347922)) {
            e16 e16VarM14092f = AbstractC3122is.m14092f(c99.m4412e(e16Var, 1.0f), null, 3);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38964m, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM14092f);
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
            boolean z5 = true;
            m9225k(e16Var, rd7Var.f59116a, z, vi3Var, zi3Var2, tj3Var, (i3 & 14) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168) | ((i3 >> 12) & 57344));
            if (z) {
                tj3Var = tj3Var;
                z3 = true;
                tj3Var.m22111b0(-1419657303);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1420237747);
                for (l55 l55Var : rd7Var.f59117b) {
                    m9229o(AbstractC3584sr.m21611X(e16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 0.0f, 0.0f, 14), l55Var, (num != null && num.intValue() == l55Var.f49081a.f63767a) ? z5 : false, false, z4, vi3Var, vi3Var3, zi3Var3, tj3Var, (i3 & 57344) | 3072 | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128));
                    z4 = z2;
                    vi3Var3 = vi3Var2;
                    zi3Var3 = zi3Var;
                    z5 = z5;
                }
                tj3Var = tj3Var;
                z3 = z5;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z3);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ae7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2253c.m9226l(e16Var, rd7Var, num, z, z2, vi3Var, vi3Var2, zi3Var, zi3Var2, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m9227m(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, e16 e16Var, List list, boolean z) {
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1490796794);
        int i2 = i | 6 | (tj3Var2.m22124i(list) ? 32 : 16) | (tj3Var2.m22122h(z) ? 256 : 128) | (tj3Var2.m22124i(vi3Var) ? 16384 : 8192);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            tj3Var = tj3Var2;
            AbstractC3003fj.m11885a(z, ui3Var, b16Var, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(94740895, new a05(7, vi3Var, list, ui3Var), tj3Var2), tj3Var, ((i2 >> 6) & 126) | 384, 2040);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uy0(e16Var2, list, z, ui3Var, vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m9228n(e16 e16Var, td7 td7Var, Integer num, boolean z, boolean z2, vi3 vi3Var, vi3 vi3Var2, zi3 zi3Var, zi3 zi3Var2, ye1 ye1Var, int i, int i2) {
        zi3 zi3Var3;
        int i3;
        tj3 tj3Var;
        zi3 zi3Var4;
        zi3 zi3Var5;
        td7Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        zi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(82892596);
        int i4 = (tj3Var2.m22124i(td7Var) ? 32 : 16) | i | (tj3Var2.m22120g(num) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= tj3Var2.m22122h(z) ? 2048 : 1024;
        }
        int i5 = i4 | (tj3Var2.m22124i(vi3Var) ? 131072 : 65536) | (tj3Var2.m22124i(vi3Var2) ? 1048576 : 524288) | (tj3Var2.m22124i(zi3Var) ? 8388608 : 4194304);
        int i6 = i2 & 256;
        if (i6 != 0) {
            i3 = i5 | 100663296;
            zi3Var3 = zi3Var2;
        } else {
            zi3Var3 = zi3Var2;
            i3 = i5 | (tj3Var2.m22124i(zi3Var3) ? 67108864 : 33554432);
        }
        if (tj3Var2.m22099R(i3 & 1, (38347923 & i3) != 38347922)) {
            if (i6 != 0) {
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new yu4(28);
                    tj3Var2.m22131l0(objM22097O);
                }
                zi3Var3 = (zi3) objM22097O;
            }
            if (td7Var instanceof rd7) {
                tj3Var2.m22111b0(-152393927);
                tj3Var = tj3Var2;
                zi3 zi3Var6 = zi3Var3;
                m9226l(e16Var, (rd7) td7Var, num, z, z2, vi3Var, vi3Var2, zi3Var, zi3Var6, tj3Var, i3 & 268435454);
                zi3Var5 = zi3Var6;
                tj3Var.m22139q(false);
            } else {
                zi3Var5 = zi3Var3;
                if (!(td7Var instanceof sd7)) {
                    throw ux5.m23001x(tj3Var2, -1944579813, false);
                }
                tj3Var2.m22111b0(-151893122);
                l55 l55Var = ((sd7) td7Var).f60709a;
                m9229o(e16Var, l55Var, num != null && num.intValue() == l55Var.f49081a.f63767a, z, z2, vi3Var, vi3Var2, zi3Var, tj3Var2, i3 & 33553422);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            }
            zi3Var4 = zi3Var5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            zi3Var4 = zi3Var3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new le7(e16Var, td7Var, num, z, z2, vi3Var, vi3Var2, zi3Var, zi3Var4, i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0391  */
    /* JADX WARN: Code duplicated, block: B:138:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x0546  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final void m9229o(final e16 e16Var, l55 l55Var, final boolean z, final boolean z2, final boolean z3, final vi3 vi3Var, final vi3 vi3Var2, zi3 zi3Var, ye1 ye1Var, final int i) {
        boolean z4;
        long j;
        int i2;
        String str;
        b16 b16Var;
        final l55 l55Var2;
        p84 p84Var;
        boolean z5;
        t66 t66Var;
        p84 p84Var2;
        boolean z6;
        int i3;
        final l55 l55Var3 = l55Var;
        final zi3 zi3Var2 = zi3Var;
        final vd7 vd7Var = l55Var3.f49082b;
        gc0 gc0Var = nj0.f52812g;
        ud7 ud7Var = l55Var3.f49081a;
        vi3Var.getClass();
        vi3Var2.getClass();
        zi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1747140596);
        int i4 = (i & 6) == 0 ? (tj3Var.m22120g(e16Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= tj3Var.m22124i(l55Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var.m22122h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= tj3Var.m22122h(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= tj3Var.m22124i(vi3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= tj3Var.m22124i(vi3Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= tj3Var.m22124i(zi3Var2) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (tj3Var.m22099R(i5 & 1, (i5 & 4793491) != 4793490)) {
            Resources resources = (Resources) tj3Var.m22128k(AbstractC0394f.f4762c);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var3 = we1.f66679a;
            if (objM22097O == p84Var3) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            e16 e16VarM10007D = d32.m10007D(c99.m4412e(e16Var, 1.0f), p58.m18900f(tj3Var).f55868n, ss5.f61356d);
            boolean zM22124i = ((i5 & 458752) == 131072) | tj3Var.m22124i(l55Var3);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var3) {
                z4 = false;
                final Object[] objArr = 0 == true ? 1 : 0;
                objM22097O2 = new ui3() { // from class: ce7
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i6 = objArr;
                        xfa xfaVar = xfa.f68157a;
                        l55 l55Var4 = l55Var3;
                        vi3 vi3Var3 = vi3Var;
                        switch (i6) {
                            case 0:
                                vi3Var3.invoke(l55Var4);
                                break;
                            case 1:
                                vi3Var3.invoke(l55Var4);
                                break;
                            default:
                                vi3Var3.invoke(l55Var4);
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(objM22097O2);
            } else {
                z4 = false;
            }
            e16 e16VarM14092f = AbstractC3122is.m14092f(AbstractC0080f.m815b(null, z4, (ui3) objM22097O2, e16VarM10007D, 15), null, 3);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM14092f);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            b16 b16Var2 = b16.f7762a;
            ss5.m21702b(ud7Var.f63772f, null, pb1.m19045o(c99.m4422o(b16Var2, 64.0f), p58.m18901i(tj3Var).f64857c), null, hl1.f42564a, tj3Var, 1572912, 4024);
            e16 e16VarM17728c = AbstractC3393o1.m17728c(1.0f, e16Var, true);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38953b, false, new gm5(29)), nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM17728c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
            String str2 = ud7Var.f63774h;
            vx9 vx9Var = p58.m18902j(tj3Var).f71406j;
            if (z) {
                tj3Var.m22111b0(-1478043027);
                long jM4212e = cx2.m9917a(tj3Var).m4212e();
                tj3Var.m22139q(false);
                j = jM4212e;
            } else {
                tj3Var.m22111b0(-1477958831);
                j = p58.m18900f(tj3Var).f55873q;
                tj3Var.m22139q(false);
            }
            lw9.m16554b(str2, null, j, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, vx9Var, tj3Var, 0, 24960, 110586);
            e16 e16VarM19514j = pvc.m19514j(b16Var2, 0.7f);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52790I, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM19514j);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var5, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c3);
            int i6 = ud7Var.f63778l;
            TimeUnit timeUnit = TimeUnit.MINUTES;
            if (i6 > 0) {
                Locale locale = Locale.getDefault();
                long j2 = i6;
                long j3 = j2 / 60000;
                Object[] objArr2 = {Long.valueOf(j3), Long.valueOf((j2 / 1000) - timeUnit.toSeconds(j3))};
                i2 = 2;
                str = String.format(locale, "%02d:%02d min", Arrays.copyOf(objArr2, 2));
            } else {
                Locale locale2 = Locale.getDefault();
                long j4 = i6;
                long j5 = j4 / 60000;
                Object[] objArr3 = {Long.valueOf(j5), Long.valueOf((j4 / 1000) - timeUnit.toSeconds(j5))};
                i2 = 2;
                str = String.format(locale2, "--:--", Arrays.copyOf(objArr3, 2));
            }
            final int i7 = i2;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(r13).f71406j, r13, 0, 0, 131070);
            lw9.m16554b(String.format(Locale.getDefault(), "%.1fx", Arrays.copyOf(new Object[]{ud7Var.f63777k}, 1)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(r13).f71407k, r13, 0, 0, 131070);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            if (vd7Var != null) {
                tj3Var.m22111b0(870122274);
                String str3 = vd7Var.f65239d;
                switch (str3.hashCode()) {
                    case -1402931637:
                        b16Var = b16Var2;
                        p84Var2 = p84Var3;
                        if (!str3.equals("completed")) {
                            tj3Var.m22111b0(871663160);
                            if (!vd7Var.f65237b || (i3 = vd7Var.f65238c) <= 0 || i3 >= 100) {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            } else {
                                tj3Var.m22111b0(871857561);
                                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                                l77 l77VarM22132m4 = tj3Var.m22132m();
                                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
                                tj3Var.m22119f0();
                                if (tj3Var.f62384S) {
                                    tj3Var.m22130l(ui3Var);
                                } else {
                                    tj3Var.m22137o0();
                                }
                                oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d);
                                oha.m18001g(tj3Var, zi3Var4, l77VarM22132m4);
                                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var5, tj3Var, vi3Var3);
                                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c4);
                                boolean zM22124i2 = tj3Var.m22124i(vd7Var);
                                Object objM22097O3 = tj3Var.m22097O();
                                if (zM22124i2 || objM22097O3 == p84Var2) {
                                    final int i8 = 1;
                                    objM22097O3 = new ui3() { // from class: ge7
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            int i9;
                                            int i10 = i8;
                                            vd7 vd7Var2 = vd7Var;
                                            switch (i10) {
                                                case 0:
                                                    i9 = vd7Var2.f65238c;
                                                    break;
                                                default:
                                                    i9 = vd7Var2.f65238c;
                                                    break;
                                            }
                                            return Float.valueOf(i9 / 100.0f);
                                        }
                                    };
                                    tj3Var.m22131l0(objM22097O3);
                                }
                                do7.m10526b((ui3) objM22097O3, null, 0L, 24.0f, 2.0f, 0L, tj3Var, 27648, 38);
                                tj3Var = tj3Var;
                                tj3Var.m22139q(true);
                                z6 = false;
                                tj3Var.m22139q(false);
                            }
                            tj3Var.m22139q(z6);
                        } else {
                            z6 = false;
                            tj3Var.m22111b0(871202469);
                            tj3Var.m22139q(false);
                        }
                        break;
                    case -1211129254:
                        b16Var = b16Var2;
                        p84Var2 = p84Var3;
                        if (!str3.equals("downloading")) {
                            tj3Var.m22111b0(871663160);
                            if (vd7Var.f65237b) {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            } else {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            }
                            tj3Var.m22139q(z6);
                        } else {
                            tj3Var.m22111b0(870347737);
                            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                            l77 l77VarM22132m5 = tj3Var.m22132m();
                            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var);
                            tj3Var.m22119f0();
                            if (tj3Var.f62384S) {
                                tj3Var.m22130l(ui3Var);
                            } else {
                                tj3Var.m22137o0();
                            }
                            oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d2);
                            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m5);
                            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var5, tj3Var, vi3Var3);
                            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c5);
                            boolean zM22124i3 = tj3Var.m22124i(vd7Var);
                            Object objM22097O4 = tj3Var.m22097O();
                            if (zM22124i3 || objM22097O4 == p84Var2) {
                                final int i9 = 0;
                                objM22097O4 = new ui3() { // from class: ge7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i10;
                                        int i11 = i9;
                                        vd7 vd7Var2 = vd7Var;
                                        switch (i11) {
                                            case 0:
                                                i10 = vd7Var2.f65238c;
                                                break;
                                            default:
                                                i10 = vd7Var2.f65238c;
                                                break;
                                        }
                                        return Float.valueOf(i10 / 100.0f);
                                    }
                                };
                                tj3Var.m22131l0(objM22097O4);
                            }
                            do7.m10526b((ui3) objM22097O4, null, 0L, 24.0f, 2.0f, 0L, tj3Var, 27648, 38);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(true);
                            z6 = false;
                            tj3Var.m22139q(false);
                        }
                        break;
                    case 96784904:
                        if (!str3.equals("error")) {
                            b16Var = b16Var2;
                            p84Var2 = p84Var3;
                            tj3Var.m22111b0(871663160);
                            if (vd7Var.f65237b) {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            } else {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            }
                            tj3Var.m22139q(z6);
                        } else {
                            tj3Var.m22111b0(870778947);
                            boolean zM22124i4 = tj3Var.m22124i(l55Var3) | ((i5 & 3670016) == 1048576);
                            Object objM22097O5 = tj3Var.m22097O();
                            p84Var2 = p84Var3;
                            if (zM22124i4 || objM22097O5 == p84Var2) {
                                final int i10 = 1;
                                objM22097O5 = new ui3() { // from class: ce7
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i11 = i10;
                                        xfa xfaVar = xfa.f68157a;
                                        l55 l55Var4 = l55Var3;
                                        vi3 vi3Var4 = vi3Var2;
                                        switch (i11) {
                                            case 0:
                                                vi3Var4.invoke(l55Var4);
                                                break;
                                            case 1:
                                                vi3Var4.invoke(l55Var4);
                                                break;
                                            default:
                                                vi3Var4.invoke(l55Var4);
                                                break;
                                        }
                                        return xfaVar;
                                    }
                                };
                                tj3Var.m22131l0(objM22097O5);
                            }
                            b16Var = b16Var2;
                            ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_download, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_download), AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), p58.m18900f(tj3Var).f55879w, tj3Var, 8, 0);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(false);
                            z6 = false;
                        }
                        break;
                    case 305703154:
                        if (!str3.equals("generating")) {
                            b16Var = b16Var2;
                            p84Var2 = p84Var3;
                            tj3Var.m22111b0(871663160);
                            if (vd7Var.f65237b) {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            } else {
                                z6 = false;
                                tj3Var.m22111b0(872250610);
                                tj3Var.m22139q(false);
                            }
                            tj3Var.m22139q(z6);
                        } else {
                            tj3Var.m22111b0(870123452);
                            do7.m10527c(null, 0L, 24.0f, 2.0f, tj3Var, 3456, 3);
                            tj3Var = tj3Var;
                            z6 = false;
                            tj3Var.m22139q(false);
                            b16Var = b16Var2;
                            p84Var2 = p84Var3;
                        }
                        break;
                    default:
                        b16Var = b16Var2;
                        p84Var2 = p84Var3;
                        tj3Var.m22111b0(871663160);
                        if (vd7Var.f65237b) {
                            z6 = false;
                            tj3Var.m22111b0(872250610);
                            tj3Var.m22139q(false);
                        } else {
                            z6 = false;
                            tj3Var.m22111b0(872250610);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(z6);
                        break;
                }
                tj3Var.m22139q(z6);
                z5 = z6;
                p84Var = p84Var2;
                l55Var2 = l55Var;
            } else {
                b16Var = b16Var2;
                if (ud7Var.f63782p) {
                    l55Var2 = l55Var;
                    p84Var = p84Var3;
                    z5 = false;
                    tj3Var.m22111b0(872658322);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(872377927);
                    l55Var2 = l55Var;
                    boolean zM22124i5 = ((i5 & 3670016) == 1048576) | tj3Var.m22124i(l55Var2);
                    Object objM22097O6 = tj3Var.m22097O();
                    if (zM22124i5 || objM22097O6 == p84Var3) {
                        objM22097O6 = new ui3() { // from class: ce7
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i11 = i7;
                                xfa xfaVar = xfa.f68157a;
                                l55 l55Var4 = l55Var2;
                                vi3 vi3Var4 = vi3Var2;
                                switch (i11) {
                                    case 0:
                                        vi3Var4.invoke(l55Var4);
                                        break;
                                    case 1:
                                        vi3Var4.invoke(l55Var4);
                                        break;
                                    default:
                                        vi3Var4.invoke(l55Var4);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var.m22131l0(objM22097O6);
                    }
                    p84Var = p84Var3;
                    z5 = false;
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.ic_download, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.ui_download), AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), 0L, tj3Var, 8, 8);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                }
            }
            if (z2) {
                zi3Var2 = zi3Var;
                l55Var3 = l55Var2;
                tj3Var.m22111b0(873741586);
                tj3Var.m22139q(z5);
            } else {
                tj3Var.m22111b0(872717160);
                ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52808c, z5);
                int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m6 = tj3Var.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d3);
                oha.m18001g(tj3Var, zi3Var4, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var5, tj3Var, vi3Var3);
                oha.m18001g(tj3Var, zi3Var6, e16VarM1322c6);
                Object objM22097O7 = tj3Var.m22097O();
                if (objM22097O7 == p84Var) {
                    t66Var = t66Var2;
                    objM22097O7 = new do4(22, t66Var);
                    tj3Var.m22131l0(objM22097O7);
                } else {
                    t66Var = t66Var2;
                }
                tj3 tj3Var2 = tj3Var;
                ty3.m22351a(eqb.m11322a(), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_menu), AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), 0L, tj3Var2, 0, 8);
                tj3Var = tj3Var2;
                boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                ArrayList arrayListM9233s = m9233s(ud7Var, z3, vd7Var != null && vd7Var.f65237b, tj3Var);
                Object objM22097O8 = tj3Var.m22097O();
                if (objM22097O8 == p84Var) {
                    objM22097O8 = new do4(23, t66Var);
                    tj3Var.m22131l0(objM22097O8);
                }
                ui3 ui3Var2 = (ui3) objM22097O8;
                l55Var3 = l55Var;
                boolean zM22124i6 = tj3Var.m22124i(resources) | ((i5 & 29360128) == 8388608) | tj3Var.m22124i(l55Var3);
                Object objM22097O9 = tj3Var.m22097O();
                if (zM22124i6 || objM22097O9 == p84Var) {
                    zi3Var2 = zi3Var;
                    objM22097O9 = new ws6(resources, zi3Var2, l55Var3, 4);
                    tj3Var.m22131l0(objM22097O9);
                } else {
                    zi3Var2 = zi3Var;
                }
                m9227m(3072, tj3Var, ui3Var2, (vi3) objM22097O9, null, arrayListM9233s, zBooleanValue);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            if (z2) {
                tj3Var.m22111b0(873771687);
                tj3 tj3Var3 = tj3Var;
                ty3.m22351a(yoc.m25219a(), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_reorder), null, 0L, tj3Var3, 0, 12);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(873936018);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ne7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2253c.m9229o(e16Var, l55Var3, z, z2, z3, vi3Var, vi3Var2, zi3Var2, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m9230p(final C2255e c2255e, vi3 vi3Var, ye1 ye1Var, int i) {
        p84 p84Var;
        String str;
        boolean z;
        Object obj;
        final vi3 vi3Var2 = vi3Var;
        c2255e.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2062449418);
        int i2 = (tj3Var.m22124i(c2255e) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var2) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            final Activity activity = (Activity) tj3Var.m22128k(ph5.f56222a);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2255e.f27824S, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2255e.f27810E, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2255e.f27845v.f21946D, tj3Var);
            boolean zM12247b = fy9.m12247b(t9a.m21912b(tj3Var));
            final boolean z2 = !zM12247b;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O == p84Var2) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            final t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var2) {
                objM22097O2 = new oe7(t66Var, c2255e);
                tj3Var.m22131l0(objM22097O2);
            }
            oe7 oe7Var = (oe7) objM22097O2;
            if (zM12247b) {
                tj3Var.m22111b0(-1370217759);
                k3c.m14792c(((Boolean) t66Var.getValue()).booleanValue(), oe7Var, null, tj3Var, 48);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1370072648);
                tj3Var.m22139q(false);
            }
            ze7 ze7Var = (ze7) t66VarM2513c.getValue();
            ye7 ye7Var = ze7Var instanceof ye7 ? (ye7) ze7Var : null;
            y25 y25Var = ye7Var != null ? ye7Var.f69744o : null;
            if (y25Var == null || !y25Var.f69128a) {
                tj3Var.m22111b0(-1368179912);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1369862623);
                s35 s35Var = new s35(y25Var.f69129b, y25Var.f69130c, y25Var.f69131d, y25Var.f69132e, LessonInfoSource.Playlist, null, 80);
                gv5 gv5Var = new gv5(c2255e, vi3Var2, activity, 29);
                boolean zM22124i = tj3Var.m22124i(c2255e);
                Object objM22097O3 = tj3Var.m22097O();
                if (zM22124i || objM22097O3 == p84Var2) {
                    objM22097O3 = new hz4(c2255e, 14);
                    tj3Var.m22131l0(objM22097O3);
                }
                AbstractC2131b.m9046e(s35Var, gv5Var, (ui3) objM22097O3, tj3Var, 48);
                tj3Var.m22139q(false);
            }
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
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
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            if (zM12247b) {
                p84Var = p84Var2;
                str = null;
                z = false;
                tj3Var.m22111b0(1958421756);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1958199765);
                if (0.3f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                as4 as4Var = new as4(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                k3c.m14791b(oe7Var, tj3Var, 6);
                tj3Var.m22139q(true);
                p84Var = p84Var2;
                str = null;
                pb1.m19037g(0.0f, 0, 7, 0L, tj3Var, null);
                z = false;
                tj3Var.m22139q(false);
            }
            float f = !zM12247b ? 0.7f : 1.0f;
            if (f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            as4 as4Var2 = new as4(f, true);
            ze7 ze7Var2 = (ze7) t66VarM2513c.getValue();
            Playlist playlist = (Playlist) t66VarM2513c2.getValue();
            String str2 = playlist != null ? playlist.f19555c : str;
            tb7 tb7Var = ((hc7) t66VarM2513c3.getValue()).f42185m;
            int i3 = i2 & 112;
            boolean zM22124i2 = tj3Var.m22124i(c2255e) | (i3 == 32 ? true : z) | tj3Var.m22122h(z2) | tj3Var.m22124i(activity);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O4 == p84Var) {
                vi3Var2 = vi3Var;
                obj = new vi3() { // from class: com.lingq.feature.playlist.d
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
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        Object value;
                        ud7 ud7Var;
                        Object value2;
                        Object value3;
                        int i4;
                        String str3;
                        String str4;
                        String str5;
                        ad7 ad7Var = (ad7) obj2;
                        ad7Var.getClass();
                        boolean z3 = ad7Var instanceof tc7;
                        C2255e c2255e2 = c2255e;
                        if (z3) {
                            tc7 tc7Var = (tc7) ad7Var;
                            ud7 ud7Var2 = tc7Var.f62153b;
                            int i5 = ud7Var2.f63767a;
                            int i6 = ud7Var2.f63776j;
                            if (c2255e2.m9242d3(i5)) {
                                c2255e2.m9245g3(i5);
                            } else {
                                int i7 = re7.f59162a[tc7Var.f62152a.ordinal()];
                                if (i7 != 1) {
                                    vi3 vi3Var4 = vi3Var2;
                                    if (i7 == 2) {
                                        String str6 = ud7Var2.f63775i;
                                        vi3Var4.invoke(new ki6(i5, str6 != null ? str6 : "", i6));
                                    } else if (i7 == 3) {
                                        vi3Var4.invoke(new ii6(i6));
                                    } else if (i7 == 4) {
                                        C3244l c3244l = c2255e2.f27820O;
                                        do {
                                            value3 = c3244l.getValue();
                                            i4 = ud7Var2.f63767a;
                                            str3 = ud7Var2.f63774h;
                                            String str7 = ud7Var2.f63772f;
                                            str4 = str7 == null ? "" : str7;
                                            str5 = ud7Var2.f63771e;
                                        } while (!c3244l.m15570h(value3, new y25(i4, str3, str4, str5 == null ? "" : str5, true)));
                                    } else {
                                        if (i7 != 5) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        c2255e2.m9240b3(ud7Var2);
                                    }
                                } else {
                                    nn1 nn1Var = c2255e2.f27840q;
                                    if (ud7Var2.f63782p) {
                                        AbstractC1263a.m7047b(lda.m16103C(c2255e2), nn1Var, ux5.m22988k(i5, "removeCourseFromPlaylist "), new PlaylistViewModel$removeCourseFromPlaylist$1(c2255e2, i5, null));
                                    } else {
                                        String str8 = ud7Var2.f63768b;
                                        AbstractC1263a.m7047b(lda.m16103C(c2255e2), nn1Var, ux5.m22988k(i5, "removeLessonFromPlaylist "), new PlaylistViewModel$removeLessonFromPlaylist$1(c2255e2, str8 != null ? str8 : "", i5, null));
                                    }
                                }
                            }
                        } else if (ad7Var instanceof uc7) {
                            int i8 = re7.f59163b[((uc7) ad7Var).f63719a.ordinal()];
                            if (i8 == 1) {
                                c2255e2.getClass();
                                g41 g41VarM16103C = lda.m16103C(c2255e2);
                                nn1 nn1Var2 = c2255e2.f27840q;
                                Playlist playlist2 = (Playlist) ((C3244l) c2255e2.f27810E.f9311a).getValue();
                                AbstractC1263a.m7047b(g41VarM16103C, nn1Var2, "downloadAll " + (playlist2 != null ? Integer.valueOf(playlist2.f19556d) : null), new PlaylistViewModel$downloadAll$1(c2255e2, null));
                            } else if (i8 == 2) {
                                Playlist playlist3 = (Playlist) c2255e2.f27809D.getValue();
                                if (playlist3 != null && !playlist3.f19557e) {
                                    C3244l c3244l2 = c2255e2.f27822Q;
                                    Boolean bool = Boolean.TRUE;
                                    c3244l2.getClass();
                                    c3244l2.m15572j(null, bool);
                                }
                            } else if (i8 == 3) {
                                c2255e2.getClass();
                                wfb.m23926u(lda.m16103C(c2255e2), null, null, new PlaylistViewModel$setDisableDownloadsPlaylist$1(c2255e2, true, null), 3);
                                ArrayList arrayListM19624a = q2c.m19624a((List) c2255e2.f27807B.getValue());
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : arrayListM19624a) {
                                    if (!((l55) obj3).f49081a.f63782p) {
                                        arrayList.add(obj3);
                                    }
                                }
                                C3244l c3244l3 = c2255e2.f27849z;
                                do {
                                    value2 = c3244l3.getValue();
                                    ((Boolean) value2).getClass();
                                } while (!c3244l3.m15570h(value2, Boolean.TRUE));
                                String strMo4589b2 = c2255e2.f27825b.mo4589b2();
                                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((l55) it.next()).f49081a.f63767a));
                                }
                                c2255e2.mo8233e2(strMo4589b2, arrayList2);
                                wfb.m23926u(lda.m16103C(c2255e2), null, null, new PlaylistViewModel$clearDownloads$2$3(c2255e2, null), 3);
                                C3244l c3244l4 = c2255e2.f27816K;
                                Boolean bool2 = Boolean.FALSE;
                                c3244l4.getClass();
                                c3244l4.m15572j(null, bool2);
                                c2255e2.f27821P.m15571i(null);
                                c2255e2.f27845v.m8447J();
                            } else {
                                if (i8 != 4) {
                                    gm5.m12750e();
                                    return null;
                                }
                                C3244l c3244l5 = c2255e2.f27806A;
                                String strMo4589b3 = c2255e2.f27825b.mo4589b2();
                                Iterable iterable = (Iterable) ((C3244l) c2255e2.f27808C.f9311a).getValue();
                                ArrayList arrayList3 = new ArrayList(v91.m23189q0(iterable, 10));
                                Iterator it2 = iterable.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(Integer.valueOf(((tb7) it2.next()).f62101a));
                                }
                                c2255e2.mo8233e2(strMo4589b3, arrayList3);
                                boolean z4 = !((Boolean) c3244l5.getValue()).booleanValue();
                                c3244l5.m15572j(null, Boolean.valueOf(z4));
                                wfb.m23926u(lda.m16103C(c2255e2), null, null, new PlaylistViewModel$disableDownloads$2(c2255e2, z4, null), 3);
                            }
                        } else if (ad7Var instanceof vc7) {
                            vc7 vc7Var = (vc7) ad7Var;
                            ud7 ud7Var3 = vc7Var.f65193a;
                            String str9 = ud7Var3.f63779m;
                            int i9 = ud7Var3.f63767a;
                            if ((str9 == null || vk9.m23391n0(str9)) && !vc7Var.f65194b && ud7Var3.f63780n == null && !ud7Var3.f63782p) {
                                c2255e2.m9246h3(i9);
                            } else {
                                c2255e2.m9244f3(i9, true);
                            }
                        } else if (ad7Var instanceof pc7) {
                            c2255e2.m9240b3(((pc7) ad7Var).f55948a);
                        } else if (ad7Var instanceof sc7) {
                            int i10 = ((sc7) ad7Var).f60682a;
                            c2255e2.getClass();
                            AbstractC1263a.m7047b(lda.m16103C(c2255e2), c2255e2.f27840q, ux5.m22988k(i10, "generateLessonAudio "), new PlaylistViewModel$generateLessonAudio$1(c2255e2, i10, null));
                        } else if (ad7Var instanceof kc7) {
                            kc7 kc7Var = (kc7) ad7Var;
                            int i11 = kc7Var.f47029a;
                            int i12 = kc7Var.f47030b;
                            c2255e2.getClass();
                            wfb.m23926u(lda.m16103C(c2255e2), c2255e2.f27840q, null, new PlaylistViewModel$buyLesson$1(c2255e2, i12, i11, null), 2);
                        } else if (ad7Var instanceof xc7) {
                            xc7 xc7Var = (xc7) ad7Var;
                            int i13 = xc7Var.f68064a;
                            int i14 = xc7Var.f68065b;
                            td7 td7Var = (td7) ((List) c2255e2.f27807B.getValue()).get(i13);
                            td7Var.getClass();
                            if (td7Var instanceof sd7) {
                                ud7Var = ((sd7) td7Var).f60709a.f49081a;
                            } else {
                                if (!(td7Var instanceof rd7)) {
                                    gm5.m12750e();
                                    return null;
                                }
                                ud7Var = ((rd7) td7Var).f59116a;
                            }
                            wfb.m23926u(lda.m16103C(c2255e2), c2255e2.f27840q, null, new PlaylistViewModel$changePosition$1(c2255e2, i13, i14, ud7Var.f63767a, null), 2);
                        } else if (ad7Var instanceof qc7) {
                            ux5.m22977D(((qc7) ad7Var).f57566a, c2255e2.f27812G, null);
                        } else if (ad7Var.equals(mc7.f51076a)) {
                            if (!z2) {
                                t66Var.setValue(Boolean.TRUE);
                            }
                        } else if (ad7Var.equals(rc7.f59071a)) {
                            C3244l c3244l6 = c2255e2.f27813H;
                            c3244l6.m15572j(null, Boolean.valueOf(!((Boolean) c3244l6.getValue()).booleanValue()));
                            if (((Boolean) c3244l6.getValue()).booleanValue()) {
                                c2255e2.f27845v.m8447J();
                            }
                        } else if (ad7Var.equals(nc7.f52597a)) {
                            C3244l c3244l7 = c2255e2.f27849z;
                            do {
                                value = c3244l7.getValue();
                                ((Boolean) value).getClass();
                            } while (!c3244l7.m15570h(value, Boolean.FALSE));
                        } else if (ad7Var.equals(jc7.f45414a)) {
                            Playlist playlist4 = (Playlist) c2255e2.f27809D.getValue();
                            if (playlist4 != null) {
                                if (playlist4.f19557e) {
                                    playlist4 = null;
                                }
                                if (playlist4 != null) {
                                    C3244l c3244l8 = c2255e2.f27822Q;
                                    Boolean bool3 = Boolean.FALSE;
                                    c3244l8.getClass();
                                    c3244l8.m15572j(null, bool3);
                                    wfb.m23926u(lda.m16103C(c2255e2), null, null, new PlaylistViewModel$archiveCurrentPlaylist$1(c2255e2, playlist4, null), 3);
                                }
                            }
                        } else if (ad7Var.equals(oc7.f54174a)) {
                            c2255e2.m9241c3();
                        } else if (ad7Var.equals(lc7.f49475a)) {
                            Activity activity2 = activity;
                            if (activity2 != null) {
                                mbd.m16755c(activity2, ux5.m22991n("https://www.lingq.com/", c2255e2.f27825b.mo4580K1(), "/learn/", c2255e2.f27825b.mo4589b2(), "/web/settings/points"), null, 30);
                            }
                        } else {
                            if (!ad7Var.equals(wc7.f66618a)) {
                                gm5.m12750e();
                                return null;
                            }
                            Playlist playlist5 = (Playlist) c2255e2.f27809D.getValue();
                            if (playlist5 != null) {
                                AbstractC1263a.m7047b(lda.m16103C(c2255e2), c2255e2.f27840q, "fetchPlaylist", new PlaylistViewModel$fetchPlaylist$1(c2255e2, playlist5, null));
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(obj);
            } else {
                obj = objM22097O4;
                vi3Var2 = vi3Var;
            }
            vi3 vi3Var4 = (vi3) obj;
            boolean zM22124i3 = tj3Var.m22124i(c2255e) | (i3 == 32 ? true : z);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O5 == p84Var) {
                objM22097O5 = new h85(26, c2255e, vi3Var2);
                tj3Var.m22131l0(objM22097O5);
            }
            m9231q(ze7Var2, tb7Var, str2, vi3Var4, (vi3) objM22097O5, as4Var2, z2, tj3Var, 64, 0);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(c2255e, i, 19, vi3Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX INFO: renamed from: q */
    public static final void m9231q(final ze7 ze7Var, tb7 tb7Var, final String str, vi3 vi3Var, vi3 vi3Var2, e16 e16Var, boolean z, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        boolean z2;
        int i4;
        e16 e16Var3;
        tj3 tj3Var;
        Object playlistScreenKt$PlaylistScreen$1$1;
        Context context;
        int i5;
        final ze7 ze7Var2;
        t66 t66Var;
        t66 t66Var2;
        t66 t66Var3;
        final vi3 vi3Var3;
        t66 t66Var4;
        t66 t66Var5;
        Boolean bool;
        sc9 sc9Var;
        final t66 t66Var6;
        final int i6;
        int i7;
        tj3 tj3Var2;
        tj3 tj3Var3;
        C0317a c0317a;
        Object obj;
        Pair pair;
        Triple triple;
        Object obj2;
        ?? r0;
        Object obj3;
        ze7Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var4 = (tj3) ye1Var;
        tj3Var4.m22115d0(-1521031564);
        int i8 = (tj3Var4.m22120g(ze7Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i8 |= (i & 64) == 0 ? tj3Var4.m22120g(tb7Var) : tj3Var4.m22124i(tb7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= tj3Var4.m22120g(str) ? 256 : 128;
        }
        int i9 = i8 | (tj3Var4.m22124i(vi3Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i9 |= tj3Var4.m22124i(vi3Var2) ? 16384 : 8192;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 = i9 | 196608;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = i9 | (tj3Var4.m22120g(e16Var2) ? 131072 : 65536);
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i4 = i3 | 1572864;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (tj3Var4.m22122h(z2) ? 1048576 : 524288);
        }
        if (tj3Var4.m22099R(i4 & 1, (599187 & i4) != 599186)) {
            e16 e16Var4 = i10 != 0 ? b16.f7762a : e16Var2;
            boolean z3 = i11 != 0 ? false : z2;
            fe9 fe9Var = (fe9) tj3Var4.m22128k(ge9.f40637a);
            Context context2 = (Context) tj3Var4.m22128k(AbstractC0394f.f4761b);
            final Resources resources = (Resources) tj3Var4.m22128k(AbstractC0394f.f4762c);
            fb2 fb2Var = (fb2) tj3Var4.m22128k(AbstractC0402n.f4816h);
            Object objM22097O = tj3Var4.m22097O();
            p84 p84Var = we1.f66679a;
            Object obj4 = objM22097O;
            if (objM22097O == p84Var) {
                t66 t66VarM1260j = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j);
                obj4 = t66VarM1260j;
            }
            t66 t66Var7 = (t66) obj4;
            Object objM22097O2 = tj3Var4.m22097O();
            Object obj5 = objM22097O2;
            if (objM22097O2 == p84Var) {
                t66 t66VarM1260j2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j2);
                obj5 = t66VarM1260j2;
            }
            t66 t66Var8 = (t66) obj5;
            Object objM22097O3 = tj3Var4.m22097O();
            Object obj6 = objM22097O3;
            if (objM22097O3 == p84Var) {
                t66 t66VarM1260j3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j3);
                obj6 = t66VarM1260j3;
            }
            t66 t66Var9 = (t66) obj6;
            Object objM22097O4 = tj3Var4.m22097O();
            Object obj7 = objM22097O4;
            if (objM22097O4 == p84Var) {
                t66 t66VarM1260j4 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j4);
                obj7 = t66VarM1260j4;
            }
            t66 t66Var10 = (t66) obj7;
            Object objM22097O5 = tj3Var4.m22097O();
            Object obj8 = objM22097O5;
            if (objM22097O5 == p84Var) {
                t66 t66VarM1260j5 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j5);
                obj8 = t66VarM1260j5;
            }
            t66 t66Var11 = (t66) obj8;
            Object objM22097O6 = tj3Var4.m22097O();
            Object obj9 = objM22097O6;
            if (objM22097O6 == p84Var) {
                t66 t66VarM1260j6 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j6);
                obj9 = t66VarM1260j6;
            }
            t66 t66Var12 = (t66) obj9;
            Object objM22097O7 = tj3Var4.m22097O();
            Object obj10 = objM22097O7;
            if (objM22097O7 == p84Var) {
                sc9 sc9VarM1257g = AbstractC0278f.m1257g(0);
                tj3Var4.m22131l0(sc9VarM1257g);
                obj10 = sc9VarM1257g;
            }
            sc9 sc9Var2 = (sc9) obj10;
            Object objM22097O8 = tj3Var4.m22097O();
            Object obj11 = objM22097O8;
            if (objM22097O8 == p84Var) {
                t66 t66VarM1260j7 = AbstractC0278f.m1260j(new xj2(0.0f));
                tj3Var4.m22131l0(t66VarM1260j7);
                obj11 = t66VarM1260j7;
            }
            t66 t66Var13 = (t66) obj11;
            Object objM22097O9 = tj3Var4.m22097O();
            Object obj12 = objM22097O9;
            if (objM22097O9 == p84Var) {
                sc9 sc9VarM1257g2 = AbstractC0278f.m1257g(0);
                tj3Var4.m22131l0(sc9VarM1257g2);
                obj12 = sc9VarM1257g2;
            }
            final sc9 sc9Var3 = (sc9) obj12;
            Object objM22097O10 = tj3Var4.m22097O();
            Object obj13 = objM22097O10;
            if (objM22097O10 == p84Var) {
                t66 t66VarM1260j8 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var4.m22131l0(t66VarM1260j8);
                obj13 = t66VarM1260j8;
            }
            t66 t66Var14 = (t66) obj13;
            Object objM22097O11 = tj3Var4.m22097O();
            Object obj14 = objM22097O11;
            if (objM22097O11 == p84Var) {
                t66 t66VarM1260j9 = AbstractC0278f.m1260j(null);
                tj3Var4.m22131l0(t66VarM1260j9);
                obj14 = t66VarM1260j9;
            }
            t66 t66Var15 = (t66) obj14;
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var4, 3);
            Object objM22097O12 = tj3Var4.m22097O();
            Object obj15 = objM22097O12;
            if (objM22097O12 == p84Var) {
                un1 un1VarM10013K = d32.m10013K(tj3Var4);
                tj3Var4.m22131l0(un1VarM10013K);
                obj15 = un1VarM10013K;
            }
            un1 un1Var = (un1) obj15;
            int i12 = i4 & 7168;
            int i13 = i4;
            boolean z4 = i12 == 2048;
            Object objM22097O13 = tj3Var4.m22097O();
            int i14 = 19;
            Object obj16 = objM22097O13;
            if (z4 || objM22097O13 == p84Var) {
                ks3 ks3Var = new ks3(vi3Var, i14);
                tj3Var4.m22131l0(ks3Var);
                obj16 = ks3Var;
            }
            C1919b c1919bM13756b = ibd.m13756b(c0127bM17056a, (zi3) obj16, tj3Var4);
            int i15 = i13 & 14;
            boolean zM22124i = (i12 == 2048) | (i15 == 4) | tj3Var4.m22124i(context2);
            Object objM22097O14 = tj3Var4.m22097O();
            if (zM22124i || objM22097O14 == p84Var) {
                context = context2;
                i5 = i12;
                ze7Var2 = ze7Var;
                playlistScreenKt$PlaylistScreen$1$1 = new PlaylistScreenKt$PlaylistScreen$1$1(ze7Var2, context, vi3Var, t66Var9, t66Var8, t66Var10, t66Var12, t66Var14, null);
                t66Var = t66Var9;
                t66Var2 = t66Var10;
                t66Var3 = t66Var14;
                vi3Var3 = vi3Var;
                t66Var4 = t66Var12;
                t66Var5 = t66Var8;
                tj3Var4.m22131l0(playlistScreenKt$PlaylistScreen$1$1);
            } else {
                t66Var2 = t66Var10;
                context = context2;
                t66Var = t66Var9;
                i5 = i12;
                playlistScreenKt$PlaylistScreen$1$1 = objM22097O14;
                t66Var4 = t66Var12;
                t66Var3 = t66Var14;
                t66Var5 = t66Var8;
                ze7Var2 = ze7Var;
                vi3Var3 = vi3Var;
            }
            d32.m10047k(tj3Var4, (zi3) playlistScreenKt$PlaylistScreen$1$1, ze7Var2);
            Boolean bool2 = (Boolean) t66Var7.getValue();
            bool2.getClass();
            boolean zM22124i2 = (r21 == 4) | tj3Var4.m22124i(context);
            Object objM22097O15 = tj3Var4.m22097O();
            if (zM22124i2 || objM22097O15 == p84Var) {
                bool = bool2;
                PlaylistScreenKt$PlaylistScreen$2$1 playlistScreenKt$PlaylistScreen$2$1 = new PlaylistScreenKt$PlaylistScreen$2$1(ze7Var2, context, t66Var7, sc9Var2, null);
                sc9Var = sc9Var2;
                t66Var6 = t66Var7;
                tj3Var4.m22131l0(playlistScreenKt$PlaylistScreen$2$1);
                objM22097O15 = playlistScreenKt$PlaylistScreen$2$1;
            } else {
                t66Var6 = t66Var7;
                sc9Var = sc9Var2;
                bool = bool2;
            }
            d32.m10047k(tj3Var4, (zi3) objM22097O15, bool);
            boolean z5 = ze7Var2 instanceof ye7;
            if (!z5 || ((ye7) ze7Var2).f69734e <= 0) {
                tj3Var4.m22111b0(-1143595538);
                tj3Var4.m22139q(false);
            } else {
                tj3Var4.m22111b0(-1143881916);
                boolean z6 = i5 == 2048;
                Object objM22097O16 = tj3Var4.m22097O();
                Object obj17 = objM22097O16;
                if (z6 || objM22097O16 == p84Var) {
                    et6 et6Var = new et6(vi3Var3, 18);
                    tj3Var4.m22131l0(et6Var);
                    obj17 = et6Var;
                }
                ui3 ui3Var = (ui3) obj17;
                boolean z7 = (i5 == 2048) | (i15 == 4);
                Object objM22097O17 = tj3Var4.m22097O();
                if (z7 || objM22097O17 == p84Var) {
                    r0 = 0;
                    final boolean z8 = false ? 1 : 0;
                    ui3 ui3Var2 = new ui3() { // from class: fe7
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i16 = z8;
                            xfa xfaVar = xfa.f68157a;
                            ze7 ze7Var3 = ze7Var2;
                            vi3 vi3Var4 = vi3Var3;
                            switch (i16) {
                                case 0:
                                    vi3Var4.invoke(new sc7(((ye7) ze7Var3).f69734e));
                                    break;
                                default:
                                    ye7 ye7Var = (ye7) ze7Var3;
                                    vi3Var4.invoke(new kc7(((Number) ye7Var.f69740k.f47633a).intValue(), ((Number) ye7Var.f69740k.f47635c).intValue()));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var4.m22131l0(ui3Var2);
                    obj3 = ui3Var2;
                } else {
                    r0 = 0;
                    obj3 = objM22097O17;
                }
                m9220f(ui3Var, (ui3) obj3, tj3Var4, r0);
                tj3Var4.m22139q(r0);
            }
            if (z5 && ((ye7) ze7Var2).f69735f) {
                tj3Var4.m22111b0(-1143519247);
                boolean z9 = i5 == 2048;
                Object objM22097O18 = tj3Var4.m22097O();
                Object obj18 = objM22097O18;
                if (z9 || objM22097O18 == p84Var) {
                    et6 et6Var2 = new et6(vi3Var3, 19);
                    tj3Var4.m22131l0(et6Var2);
                    obj18 = et6Var2;
                }
                m9232r(0, tj3Var4, (ui3) obj18);
                tj3Var4.m22139q(false);
            } else {
                tj3Var4.m22111b0(-1143368370);
                tj3Var4.m22139q(false);
            }
            int i16 = 20;
            if (!z5 || (triple = ((ye7) ze7Var2).f69740k) == null) {
                tj3 tj3Var5 = tj3Var4;
                i6 = 1;
                i7 = 20;
                tj3Var5.m22111b0(-1142748370);
                tj3Var5.m22139q(false);
                tj3Var2 = tj3Var5;
            } else {
                tj3Var4.m22111b0(-1143260769);
                int iIntValue = ((Number) triple.f47633a).intValue();
                int iIntValue2 = ((Number) triple.f47634b).intValue();
                boolean z10 = i5 == 2048;
                Object objM22097O19 = tj3Var4.m22097O();
                Object obj19 = objM22097O19;
                if (z10 || objM22097O19 == p84Var) {
                    et6 et6Var3 = new et6(vi3Var3, i16);
                    tj3Var4.m22131l0(et6Var3);
                    obj19 = et6Var3;
                }
                ui3 ui3Var3 = (ui3) obj19;
                boolean z11 = (r21 == 4) | (i5 == 2048);
                Object objM22097O20 = tj3Var4.m22097O();
                if (z11 || objM22097O20 == p84Var) {
                    i6 = 1;
                    ui3 ui3Var4 = new ui3() { // from class: fe7
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i17 = i6;
                            xfa xfaVar = xfa.f68157a;
                            ze7 ze7Var3 = ze7Var2;
                            vi3 vi3Var4 = vi3Var3;
                            switch (i17) {
                                case 0:
                                    vi3Var4.invoke(new sc7(((ye7) ze7Var3).f69734e));
                                    break;
                                default:
                                    ye7 ye7Var = (ye7) ze7Var3;
                                    vi3Var4.invoke(new kc7(((Number) ye7Var.f69740k.f47633a).intValue(), ((Number) ye7Var.f69740k.f47635c).intValue()));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var4.m22131l0(ui3Var4);
                    obj2 = ui3Var4;
                } else {
                    i6 = 1;
                    obj2 = objM22097O20;
                }
                ui3 ui3Var5 = (ui3) obj2;
                tj3 tj3Var6 = tj3Var4;
                i7 = 20;
                m9216b(iIntValue, iIntValue2, ui3Var3, ui3Var5, tj3Var6, 0);
                tj3Var6.m22139q(false);
                tj3Var2 = tj3Var6;
            }
            if (!z5 || (pair = ((ye7) ze7Var).f69741l) == null) {
                tj3Var2.m22111b0(-1142302962);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1142646225);
                int iIntValue3 = ((Number) pair.f47623a).intValue();
                int iIntValue4 = ((Number) pair.f47624b).intValue();
                int i17 = i5 == 2048 ? i6 : 0;
                Object objM22097O21 = tj3Var2.m22097O();
                Object obj20 = objM22097O21;
                if (i17 != 0 || objM22097O21 == p84Var) {
                    Object et6Var4 = new et6(vi3Var3, 21);
                    tj3Var2.m22131l0(et6Var4);
                    obj20 = et6Var4;
                }
                ui3 ui3Var6 = (ui3) obj20;
                int i18 = i5 == 2048 ? i6 : 0;
                Object objM22097O22 = tj3Var2.m22097O();
                Object obj21 = objM22097O22;
                if (i18 != 0 || objM22097O22 == p84Var) {
                    Object et6Var5 = new et6(vi3Var3, 22);
                    tj3Var2.m22131l0(et6Var5);
                    obj21 = et6Var5;
                }
                m9224j(iIntValue3, iIntValue4, ui3Var6, (ui3) obj21, tj3Var2, 0);
                tj3Var2.m22139q(false);
            }
            if (ze7Var.mo23857a()) {
                tj3Var2.m22111b0(-1142255501);
                int i19 = i5 == 2048 ? i6 : 0;
                Object objM22097O23 = tj3Var2.m22097O();
                Object obj22 = objM22097O23;
                if (i19 != 0 || objM22097O23 == p84Var) {
                    Object et6Var6 = new et6(vi3Var3, 23);
                    tj3Var2.m22131l0(et6Var6);
                    obj22 = et6Var6;
                }
                ui3 ui3Var7 = (ui3) obj22;
                int i20 = i5 == 2048 ? i6 : 0;
                Object objM22097O24 = tj3Var2.m22097O();
                Object obj23 = objM22097O24;
                if (i20 != 0 || objM22097O24 == p84Var) {
                    Object et6Var7 = new et6(vi3Var3, 24);
                    tj3Var2.m22131l0(et6Var7);
                    obj23 = et6Var7;
                }
                m9215a(ui3Var7, (ui3) obj23, tj3Var2, 0);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1142045042);
                tj3Var2.m22139q(false);
            }
            if (ze7Var.mo23858b()) {
                tj3Var2.m22111b0(-1141997674);
                if (i5 != 2048) {
                    i6 = 0;
                }
                Object objM22097O25 = tj3Var2.m22097O();
                Object obj24 = objM22097O25;
                if (i6 != 0 || objM22097O25 == p84Var) {
                    Object et6Var8 = new et6(vi3Var3, 17);
                    tj3Var2.m22131l0(et6Var8);
                    obj24 = et6Var8;
                }
                tj3 tj3Var7 = tj3Var2;
                q2d.m19625a((ui3) obj24, ci8.m4703P(145996674, new ks3(vi3Var3, i7), tj3Var2), null, null, null, null, cgc.f10036b, null, 0L, 0L, 0L, 0L, null, tj3Var7, 1572912, 16316);
                tj3 tj3Var8 = tj3Var7;
                tj3Var8.m22139q(false);
                tj3Var3 = tj3Var8;
            } else {
                tj3 tj3Var9 = tj3Var2;
                tj3Var9.m22111b0(-1141574834);
                tj3Var9.m22139q(false);
                tj3Var3 = tj3Var9;
            }
            Boolean bool3 = (Boolean) t66Var11.getValue();
            bool3.getClass();
            Object objM22097O26 = tj3Var3.m22097O();
            if (objM22097O26 == p84Var) {
                c0317a = null;
                Object playlistScreenKt$PlaylistScreen$14$1 = new PlaylistScreenKt$PlaylistScreen$14$1(t66Var11, null);
                tj3Var3.m22131l0(playlistScreenKt$PlaylistScreen$14$1);
                obj = playlistScreenKt$PlaylistScreen$14$1;
            } else {
                c0317a = null;
                obj = objM22097O26;
            }
            d32.m10047k(tj3Var3, (zi3) obj, bool3);
            x17 x17Var = h7a.f41916a;
            final k87 k87VarM13118e = h7a.m13118e(AbstractC0218a.m1129i(tj3Var3), tj3Var3);
            e16 e16VarM4410c = c99.m4410c(AbstractC0319c.m1450a(e16Var4, k87VarM13118e.f46862c, c0317a), 1.0f);
            final vi3 vi3Var4 = vi3Var3;
            final t66 t66Var16 = t66Var4;
            e16 e16Var5 = e16Var4;
            final boolean z12 = z3;
            final sc9 sc9Var4 = sc9Var;
            final t66 t66Var17 = t66Var3;
            final t66 t66Var18 = t66Var5;
            tj3 tj3Var10 = tj3Var3;
            b34.m3232b(e16VarM4410c, ci8.m4703P(529600056, new zi3() { // from class: de7
                @Override // p000.zi3
                public final Object invoke(Object obj25, Object obj26) {
                    ye1 ye1Var2 = (ye1) obj25;
                    int iIntValue5 = ((Integer) obj26).intValue();
                    tj3 tj3Var11 = (tj3) ye1Var2;
                    if (tj3Var11.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                        x17 x17Var2 = h7a.f41916a;
                        vh9 vh9Var = ps5.f56764b;
                        g7a g7aVarM13120g = h7a.m13120g(((ms5) tj3Var11.m22128k(vh9Var)).f51799a.f55872p, 0L, ((ms5) tj3Var11.m22128k(vh9Var)).f51799a.f55873q, ((ms5) tj3Var11.m22128k(vh9Var)).f51799a.f55873q, tj3Var11, 50);
                        Object objM22097O27 = tj3Var11.m22097O();
                        if (objM22097O27 == we1.f66679a) {
                            objM22097O27 = new xe2(sc9Var3, 1);
                            tj3Var11.m22131l0(objM22097O27);
                        }
                        e16 e16VarM19025M = pb1.m19025M(b16.f7762a, (vi3) objM22097O27);
                        boolean z13 = z12;
                        vi3 vi3Var5 = vi3Var4;
                        AbstractC0218a.m1125e(ci8.m4703P(-1170683660, new uv1(z13, vi3Var5, str, 1), tj3Var11), e16VarM19025M, null, ci8.m4703P(1315085865, new ws0(vi3Var5, t66Var18, t66Var17, resources, t66Var6, ze7Var, sc9Var4, t66Var16), tj3Var11), 0.0f, null, g7aVarM13120g, k87VarM13118e, null, tj3Var11, 3126, 308);
                    } else {
                        tj3Var11.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var3), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-345328317, new ee7(vi3Var, t66Var11, c1919bM13756b, un1Var, fe9Var, c0127bM17056a, vi3Var2, ze7Var, tb7Var, fb2Var, t66Var18, sc9Var3, t66Var, t66Var15, t66Var2, t66Var13), tj3Var10), tj3Var10, 805306416, 508);
            tj3Var = tj3Var10;
            e16Var3 = e16Var5;
            z2 = z12;
        } else {
            tj3 tj3Var11 = tj3Var4;
            tj3Var11.m22102U();
            e16Var3 = e16Var2;
            tj3Var = tj3Var11;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pz5(ze7Var, tb7Var, str, vi3Var, vi3Var2, e16Var3, z2, i, i2);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m9232r(int i, ye1 ye1Var, ui3 ui3Var) {
        tj3 tj3Var;
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(860897895);
        int i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, ci8.m4703P(-1253172049, new he7(i3, ui3Var), tj3Var2), null, null, null, cgc.f10048n, cgc.f10049o, null, 0L, 0L, 0L, 0L, null, tj3Var, (i2 & 14) | 1769520, 16284);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new he7(i, 1, ui3Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final ArrayList m9233s(ud7 ud7Var, boolean z, boolean z2, ye1 ye1Var) {
        ud7Var.getClass();
        boolean z3 = ud7Var.f63782p;
        ArrayList arrayListM22624p1 = u91.m22624p1(MenuPlaylistItem.getEntries());
        if (ud7Var.f63783q || z) {
            arrayListM22624p1.remove(MenuPlaylistItem.RemovePlaylist);
        }
        if (ud7Var.f63780n != null || z3 || ud7Var.f63779m == null || z2) {
            arrayListM22624p1.remove(MenuPlaylistItem.Download);
        }
        if (z3) {
            arrayListM22624p1.remove(MenuPlaylistItem.OpenLesson);
            arrayListM22624p1.remove(MenuPlaylistItem.LessonInfo);
        } else {
            arrayListM22624p1.remove(MenuPlaylistItem.OpenCourse);
        }
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(1710954968);
        ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM22624p1, 10));
        Iterator it = arrayListM22624p1.iterator();
        while (it.hasNext()) {
            arrayList.add(vz1.m23620a0(tj3Var, ((MenuPlaylistItem) it.next()).getTitle()));
        }
        tj3Var.m22139q(false);
        return arrayList;
    }
}
