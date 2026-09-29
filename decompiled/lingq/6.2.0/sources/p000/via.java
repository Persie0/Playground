package p000;

import android.app.Activity;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradeTier;
import com.lingq.core.premium.C1853l;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class via {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1853l f65422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f65423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f65424c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f65425d;

    public via(C1853l c1853l, t66 t66Var, Activity activity, ui3 ui3Var) {
        this.f65422a = c1853l;
        this.f65423b = t66Var;
        this.f65424c = activity;
        this.f65425d = ui3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m23292a() {
        Object value;
        C3244l c3244l = this.f65422a.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, null, null, false, false, true, null, false, 1966079)));
    }

    /* JADX INFO: renamed from: b */
    public final void m23293b() {
        Object value;
        C3244l c3244l = this.f65422a.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, null, null, false, false, false, null, false, 1966079)));
    }

    /* JADX INFO: renamed from: c */
    public final void m23294c(aia aiaVar) {
        aiaVar.getClass();
        String str = ((wia) this.f65423b.getValue()).f66882g;
        C1853l c1853l = this.f65422a;
        yia yiaVar = c1853l.f22543g;
        vj6 vj6Var = c1853l.f22542f;
        str.getClass();
        String str2 = aiaVar.f701a;
        pha phaVar = c1853l.f22539c;
        if (fa4.m11650l(str2, phaVar.mo8555K0())) {
            vj6Var.m23339A(LqAnalyticsValues$UpgradeTier.TwelveMonthPremium, yiaVar.f69880a);
            c1853l.mo8552H2(phaVar.mo8555K0(), str);
            return;
        }
        if (fa4.m11650l(str2, phaVar.mo8574o0())) {
            vj6Var.m23339A(LqAnalyticsValues$UpgradeTier.TwelveMonthPremiumPlus, yiaVar.f69880a);
            c1853l.mo8552H2(phaVar.mo8574o0(), str);
            return;
        }
        if (fa4.m11650l(str2, phaVar.mo8568f1())) {
            vj6Var.m23339A(LqAnalyticsValues$UpgradeTier.SixMonthPremium, yiaVar.f69880a);
            c1853l.mo8552H2(phaVar.mo8568f1(), str);
        } else if (fa4.m11650l(str2, phaVar.mo8551H1())) {
            vj6Var.m23339A(LqAnalyticsValues$UpgradeTier.OneMonthPremium, yiaVar.f69880a);
            c1853l.mo8552H2(phaVar.mo8551H1(), str);
        } else if (fa4.m11650l(str2, phaVar.mo8561S0())) {
            vj6Var.m23339A(LqAnalyticsValues$UpgradeTier.OneMonthPremiumPlus, yiaVar.f69880a);
            c1853l.mo8552H2(phaVar.mo8561S0(), str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23295d() {
        Object value;
        C3244l c3244l = this.f65422a.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, null, false, null, null, null, false, false, false, null, false, 1998847)));
        this.f65425d.mo0a();
    }
}
