package com.lingq.core.achievements;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC3393o1;
import p000.C3304ln;
import p000.C3419on;
import p000.C3661uu;
import p000.a5d;
import p000.b16;
import p000.bc3;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.eh0;
import p000.fc0;
import p000.fe9;
import p000.g77;
import p000.ge9;
import p000.gm5;
import p000.he9;
import p000.i77;
import p000.j77;
import p000.l5d;
import p000.l77;
import p000.lw9;
import p000.mo1;
import p000.ms5;
import p000.nj0;
import p000.nu1;
import p000.oha;
import p000.p84;
import p000.ps5;
import p000.qj8;
import p000.se1;
import p000.sj8;
import p000.t66;
import p000.tj3;
import p000.ty1;
import p000.u0c;
import p000.ui3;
import p000.vh9;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.xy0;
import p000.ye1;
import p000.yy1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.achievements.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1234a {
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX INFO: renamed from: a */
    public static final void m6998a(e16 e16Var, final ty1 ty1Var, final vi3 vi3Var, ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        boolean z;
        ty1Var.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(525813430);
        int i2 = i | 6 | (tj3Var2.m22124i(ty1Var) ? 32 : 16) | (tj3Var2.m22124i(vi3Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        int i3 = i2 | (tj3Var2.m22124i(ui3Var2) ? 16384 : 8192) | (tj3Var2.m22124i(ui3Var3) ? 131072 : 65536);
        if (tj3Var2.m22099R(i3 & 1, (74899 & i3) != 74898)) {
            final Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            final g77 g77VarM22380a = u0c.m22380a(tj3Var2);
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
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                if (Build.VERSION.SDK_INT >= 33) {
                    j77 j77VarMo12408n = g77VarM22380a.mo12408n();
                    j77VarMo12408n.getClass();
                    if (j77VarMo12408n.equals(i77.f43628a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                objM22097O3 = AbstractC0278f.m1260j(Boolean.valueOf(z));
                tj3Var2.m22131l0(objM22097O3);
            }
            final t66 t66Var3 = (t66) objM22097O3;
            Bitmap bitmap = (Bitmap) t66Var.getValue();
            boolean z2 = (i3 & 896) == 256;
            Object objM22097O4 = tj3Var2.m22097O();
            if (z2 || objM22097O4 == p84Var) {
                objM22097O4 = new DailyGoalNotificationKt$DailyGoalNotification$1$1(vi3Var, t66Var, t66Var2, null);
                tj3Var2.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O4, bitmap);
            if (Build.VERSION.SDK_INT >= 33) {
                tj3Var2.m22111b0(763193169);
                j77 j77VarMo12408n2 = g77VarM22380a.mo12408n();
                boolean zM22120g = ((i3 & 7168) == 2048) | tj3Var2.m22120g(g77VarM22380a);
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22120g || objM22097O5 == p84Var) {
                    objM22097O5 = new DailyGoalNotificationKt$DailyGoalNotification$2$1(g77VarM22380a, ui3Var, t66Var3, null);
                    tj3Var2.m22131l0(objM22097O5);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O5, j77VarMo12408n2);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(763465132);
                tj3Var2.m22139q(false);
            }
            Object objM22097O6 = tj3Var2.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O6);
            }
            final t66 t66Var4 = (t66) objM22097O6;
            tj3Var = tj3Var2;
            l5d.m15820a(null, 0.0f, ui3Var3, ci8.m4703P(-1413522403, new zi3() { // from class: uy1
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    String strM23620a0;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = 0;
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e16 e16VarM14092f = AbstractC3122is.m14092f(b16.f7762a, null, 3);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM14092f);
                        se1.f60731q.getClass();
                        ui3 ui3Var4 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var4);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        t66 t66Var5 = t66Var4;
                        boolean zBooleanValue = ((Boolean) t66Var5.getValue()).booleanValue();
                        ty1 ty1Var2 = ty1Var;
                        Context context2 = context;
                        if (zBooleanValue) {
                            tj3Var3.m22111b0(-513598786);
                            tcd.m21954a(null, null, false, ui3Var3, ci8.m4703P(618289491, new sx0(ty1Var2, g77VarM22380a, vi3Var, t66Var2, context2, t66Var, t66Var3), tj3Var3), tj3Var3, 24576);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(-503019633);
                            if (ty1Var2.f63090d) {
                                tj3Var3.m22111b0(-502997995);
                                strM23620a0 = vz1.m23620a0(tj3Var3, R$string.quickstart_congratulations);
                                tj3Var3.m22139q(false);
                            } else if (ty1Var2.f63087a.f19518e) {
                                tj3Var3.m22111b0(-502842468);
                                strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.core.achievements.R$string.milestones_daily_goal_double_notification);
                                tj3Var3.m22139q(false);
                            } else {
                                tj3Var3.m22111b0(-502706657);
                                strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.core.achievements.R$string.milestones_daily_goal_met_notification);
                                tj3Var3.m22139q(false);
                            }
                            p04 p04VarM19521q = pvc.m19521q();
                            C0282a c0282aM4703P = ci8.m4703P(-567547501, new C3368nd(ty1Var2, 24), tj3Var3);
                            ui3 ui3Var5 = ui3Var2;
                            boolean zM22120g2 = tj3Var3.m22120g(ui3Var5);
                            Object objM22097O7 = tj3Var3.m22097O();
                            if (zM22120g2 || objM22097O7 == we1.f66679a) {
                                objM22097O7 = new wy1(0, ui3Var5, t66Var5);
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            l4d.m15801a(null, strM23620a0, c0282aM4703P, p04VarM19521q, false, false, (ui3) objM22097O7, ci8.m4703P(-772365458, new xy1(ty1Var2, context2, i4), tj3Var3), tj3Var3, 12583296, 49);
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, ((i3 >> 9) & 896) | 3072);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(e16Var2, ty1Var, vi3Var, ui3Var, ui3Var2, ui3Var3, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6999b(e16 e16Var, int i, int i2, int i3, ye1 ye1Var, int i4) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-479267942);
        int i5 = i4 | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22116e(i3) ? 2048 : 1024);
        if (tj3Var.m22099R(i5 & 1, (i5 & 1171) != 1170)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, true, new gm5(28));
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 48);
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
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            Locale locale = Locale.getDefault();
            String string = context.getString(R$string.stats_coins_goal);
            string.getClass();
            sb.append(String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)));
            bc3 bc3Var = bc3.f8324j;
            int i6 = 0;
            arrayList.add(new C3304ln(new he9(0L, 0L, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), 0, String.valueOf(i).length(), 8));
            String string2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            while (i6 < size) {
                arrayList2.add(((C3304ln) arrayList.get(i6)).m16392a(sb.length()));
                i6++;
                arrayList = arrayList;
            }
            C3419on c3419on = new C3419on(string2, arrayList2);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16555c(c3419on, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 262138);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            a5d.m126a(c99.m4422o(b16Var, 20.0f), i, i2, false, false, 0.0f, tj3Var, (i5 & 112) | 27654 | (i5 & 896), 32);
            StringBuilder sb2 = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            new ArrayList();
            Locale locale2 = Locale.getDefault();
            String string3 = context.getString(R$string.stats_n_day_streak);
            string3.getClass();
            sb2.append(String.format(locale2, string3, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
            arrayList3.add(new C3304ln(new he9(0L, 0L, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), 0, String.valueOf(i3).length(), 8));
            String string4 = sb2.toString();
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList4.add(((C3304ln) arrayList3.get(i7)).m16392a(sb2.length()));
            }
            C3419on c3419on2 = new C3419on(string4, arrayList4);
            vh9 vh9Var2 = ps5.f56764b;
            lw9.m16555c(c3419on2, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71406j, tj3Var, 0, 0, 262138);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yy1(e16Var, i, i2, i3, i4, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7000c(e16 e16Var, Milestone milestone, vi3 vi3Var, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        milestone.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1980253757);
        int i2 = i | 6 | (tj3Var2.m22124i(milestone) ? 32 : 16) | (tj3Var2.m22124i(vi3Var) ? 256 : 128) | (tj3Var2.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var2.m22124i(ui3Var2) ? 16384 : 8192);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            Bitmap bitmap = (Bitmap) t66Var.getValue();
            boolean z = (i2 & 896) == 256;
            Object objM22097O3 = tj3Var2.m22097O();
            if (z || objM22097O3 == p84Var) {
                objM22097O3 = new MilestonesNotificationKt$MilestonesNotification$1$1(vi3Var, t66Var, t66Var2, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, bitmap);
            Object objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O4);
            }
            tj3Var = tj3Var2;
            l5d.m15820a(null, 0.0f, ui3Var2, ci8.m4703P(1142871082, new mo1(ui3Var2, ui3Var, (t66) objM22097O4, vi3Var, t66Var2, milestone, context, t66Var), tj3Var2), tj3Var, ((i2 >> 6) & 896) | 3072);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(e16Var2, milestone, vi3Var, ui3Var, ui3Var2, i);
        }
    }
}
