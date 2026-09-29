package com.lingq.feature.notifications;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3456pd;
import p000.C3661uu;
import p000.C3836zk;
import p000.a45;
import p000.aa1;
import p000.ab1;
import p000.abd;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.bq1;
import p000.c99;
import p000.ci8;
import p000.cl9;
import p000.d32;
import p000.dua;
import p000.e16;
import p000.ec0;
import p000.eo6;
import p000.fa4;
import p000.fe9;
import p000.fo6;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.hn0;
import p000.i75;
import p000.l77;
import p000.lw9;
import p000.ms5;
import p000.mv4;
import p000.nj0;
import p000.oha;
import p000.om6;
import p000.or1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.ps5;
import p000.qh0;
import p000.qj8;
import p000.qo6;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.ss5;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vh9;
import p000.vi3;
import p000.wa5;
import p000.we1;
import p000.x18;
import p000.x74;
import p000.y27;
import p000.y38;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.notifications.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2167a {
    /* JADX INFO: renamed from: a */
    public static final void m9097a(e16 e16Var, om6 om6Var, vi3 vi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        long jM198b;
        int iM249e;
        zi3 zi3Var;
        vi3 vi3Var2;
        int i2;
        zi3 zi3Var2;
        boolean z;
        ui3 ui3Var;
        om6 om6Var2 = om6Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1726529985);
        int i3 = i | 6 | (tj3Var.m22124i(om6Var2) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean z2 = om6Var2.f54585g;
            String str = om6Var2.f54582d;
            if (z2) {
                tj3Var.m22111b0(-1473337906);
                jM198b = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1473280773);
                jM198b = aa1.m198b(0.5f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q);
                tj3Var.m22139q(false);
            }
            long j = jM198b;
            e16Var2 = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            boolean zM22124i = ((i3 & 896) == 256) | tj3Var.m22124i(om6Var2);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new a45(9, vi3Var, om6Var2);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
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
            if (str == null || !cl9.m4842Y(str, "http", true)) {
                tj3Var.m22111b0(-49478778);
                if (fa4.m11650l(str, "like")) {
                    iM249e = R$drawable.ic_notifications_heart_icon;
                } else if (fa4.m11650l(str, "challenge")) {
                    iM249e = R$drawable.ic_notifications_challenge_icon;
                } else {
                    String str2 = om6Var2.f54584f;
                    iM249e = str2 != null ? abd.m249e(R$drawable.ic_notifications_generic_icon, context, str2) : R$drawable.ic_notifications_generic_icon;
                }
                e16 e16VarM21611X = AbstractC3584sr.m21611X(pb1.m19045o(c99.m4422o(e16Var2, 45.0f), p58.m18901i(tj3Var).f64857c), 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13);
                y27 y27VarM18236U = AbstractC3423or.m18236U(iM249e, tj3Var, 0);
                zi3Var = zi3Var3;
                vi3Var2 = vi3Var3;
                i2 = 0;
                zi3Var2 = zi3Var6;
                z = true;
                ui3Var = ui3Var2;
                bq1.m4042R(y27VarM18236U, null, e16VarM21611X, null, null, 0.0f, null, tj3Var, 56, 120);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-49811377);
                ui3Var = ui3Var2;
                ss5.m21702b(om6Var2.f54582d, null, AbstractC3584sr.m21611X(pb1.m19045o(c99.m4422o(e16Var2, 45.0f), p58.m18901i(tj3Var).f64857c), 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), null, null, tj3Var, 48, 4088);
                tj3Var.m22139q(false);
                vi3Var2 = vi3Var3;
                zi3Var = zi3Var3;
                i2 = 0;
                zi3Var2 = zi3Var6;
                z = true;
            }
            e16 e16VarM4412e2 = c99.m4412e(e16Var2, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, z, new gm5(28)), nj0.f52791J, tj3Var, i2);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var2, e16VarM1322c2);
            om6Var2 = om6Var;
            String str3 = om6Var2.f54586h;
            str3.getClass();
            long time = 0;
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(str3);
                if (date != null) {
                    time = date.getTime();
                }
            } catch (Exception unused) {
            }
            String string = DateUtils.getRelativeTimeSpanString(time, System.currentTimeMillis(), 1000L, 262144).toString();
            vh9 vh9Var = ps5.f56764b;
            tj3 tj3Var2 = tj3Var;
            lw9.m16554b(string, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71409m, tj3Var2, 0, 0, 131066);
            lw9.m16554b(om6Var2.f54580b, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71404h, tj3Var2, 0, 0, 131066);
            String str4 = om6Var2.f54581c;
            if (str4 == null) {
                str4 = "";
            }
            lw9.m16554b(str4, null, j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71408l, tj3Var2, 0, 0, 131066);
            tj3Var = tj3Var2;
            tj3Var.m22139q(z);
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 27, e16Var2, om6Var2, vi3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: b */
    public static final void m9098b(e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        ec0 ec0Var = nj0.f52791J;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(901595152);
        int i2 = i | 6;
        ?? r6 = 0;
        boolean z = true;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e16Var2 = b16.f7762a;
            float f = 1.0f;
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            int i3 = 28;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38964m, true, new gm5(28)), ec0Var, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
            tj3Var.m22111b0(-1951258077);
            int i4 = 0;
            while (i4 < 4) {
                e16 e16VarM4412e2 = c99.m4412e(e16Var2, f);
                sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, z, new gm5(i3)), nj0.f52817l, tj3Var, r6);
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
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4422o(e16Var2, 45.0f), p58.m18901i(tj3Var).f64857c)), tj3Var, r6);
                e16 e16VarM4412e3 = c99.m4412e(e16Var2, f);
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(i3)), ec0Var, tj3Var, 0);
                int i5 = i4;
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e3);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                r6 = 0;
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4412e(c99.m4414g(e16Var2, 15.0f), 0.2f), p58.m18901i(tj3Var).f64857c)), tj3Var, 0);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4412e(c99.m4414g(e16Var2, 20.0f), 0.5f), p58.m18901i(tj3Var).f64857c)), tj3Var, 0);
                qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4412e(c99.m4414g(e16Var2, 15.0f), 0.3f), p58.m18901i(tj3Var).f64857c)), tj3Var, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                i4 = i5 + 1;
                z = true;
                f = 1.0f;
                i3 = 28;
            }
            tj3Var.m22139q(r6);
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 14, e16Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9099c(C2168b c2168b, vi3 vi3Var, ye1 ye1Var, int i) {
        C2168b c2168b2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1189671152);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2168b2 = (C2168b) pfa.m19114d(y38.m24933a(C2168b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2168b2 = c2168b;
            }
            tj3Var.m22140r();
            fo6 fo6Var = new fo6((qo6) AbstractC0711a.m2513c(c2168b2.f26892l, tj3Var).getValue());
            boolean zM22124i = tj3Var.m22124i(c2168b2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                NotificationsScreenKt$NotificationsRoute$1$1 notificationsScreenKt$NotificationsRoute$1$1 = new NotificationsScreenKt$NotificationsRoute$1$1(1, c2168b2, C2168b.class, "handleAction", "handleAction(Lcom/lingq/feature/notifications/NotificationsAction;)V", 0);
                tj3Var.m22131l0(notificationsScreenKt$NotificationsRoute$1$1);
                objM22097O = notificationsScreenKt$NotificationsRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new i75(vi3Var, 12);
                tj3Var.m22131l0(objM22097O2);
            }
            m9100d(fo6Var, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            c2168b2 = c2168b;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(c2168b2, i, 6, vi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9100d(fo6 fo6Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1451708217);
        int i2 = i | (tj3Var.m22120g(fo6Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        byte b = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
            boolean zM22120g = tj3Var.m22120g(c0127bM17056a) | ((i2 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new NotificationsScreenKt$NotificationsScreen$1$1(c0127bM17056a, vi3Var, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, c0127bM17056a);
            b34.m3232b(c99.m4410c(b16.f7762a, 1.0f), ci8.m4703P(-2071814147, new eo6(vi3Var2, vi3Var, b, b), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(1234404296, new hn0(vi3Var, t66Var, c0127bM17056a, fo6Var, vi3Var2), tj3Var), tj3Var, 805306422, 508);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 28, fo6Var, vi3Var, vi3Var2);
        }
    }
}
