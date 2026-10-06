package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.PreferenceScreen;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgx {

    /* JADX INFO: renamed from: a */
    public final Context f27756a;

    /* JADX INFO: renamed from: b */
    public final Executor f27757b;

    /* JADX INFO: renamed from: c */
    public final had f27758c;

    /* JADX INFO: renamed from: d */
    public final hah f27759d;

    /* JADX INFO: renamed from: e */
    public final hai f27760e;

    /* JADX INFO: renamed from: f */
    public final hgy f27761f;

    /* JADX INFO: renamed from: g */
    public final fcp f27762g;

    /* JADX INFO: renamed from: h */
    public final mwn f27763h;

    /* JADX INFO: renamed from: i */
    public final Map f27764i;

    /* JADX INFO: renamed from: j */
    public final Map f27765j;

    /* JADX INFO: renamed from: k */
    public final PackageManager f27766k;

    /* JADX INFO: renamed from: l */
    public mws f27767l;

    /* JADX INFO: renamed from: m */
    public PreferenceScreen f27768m;

    /* JADX INFO: renamed from: n */
    public Toast f27769n;

    public hgx(Context context, Executor executor, had hadVar, hah hahVar, hai haiVar, hgy hgyVar, fcp fcpVar) {
        int i = mws.f41739d;
        this.f27767l = mzr.f41857a;
        this.f27756a = context;
        this.f27757b = executor;
        this.f27758c = hadVar;
        this.f27759d = hahVar;
        this.f27760e = haiVar;
        this.f27761f = hgyVar;
        this.f27762g = fcpVar;
        this.f27763h = mws.m17090e();
        this.f27764i = new HashMap();
        this.f27765j = new HashMap();
        this.f27766k = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public final int m10256a() {
        mws mwsVarM17081f = this.f27763h.m17081f();
        int i = ((mzr) mwsVarM17081f).f41859c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f27758c.mo10046m(((ManagedSwitchPreference) mwsVarM17081f.get(i3)).getKey())) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final int m10257b() {
        return kxk.m15025r(this.f27756a, C0100R.attr.colorPrimary, -16777216);
    }

    /* JADX INFO: renamed from: c */
    public final nps m10258c() {
        return kxk.m14970P(new cnm(this, 5), this.f27757b);
    }

    /* JADX INFO: renamed from: d */
    public final String m10259d(boolean z) {
        return this.f27756a.getResources().getString(true != z ? C0100R.string.social_share_off : C0100R.string.social_share_on);
    }

    /* JADX INFO: renamed from: e */
    public final void m10260e() {
        this.f27761f.mo10269f();
        if (((Boolean) this.f27759d.mo10031c(gzy.f27006R)).booleanValue() || ((Boolean) this.f27759d.mo10031c(gzy.f27007S)).booleanValue()) {
            return;
        }
        if (this.f27761f.mo10273j(voNZjxiJou.qyJHnOVxFfuEuHG) || this.f27761f.mo10273j("video/*")) {
            this.f27760e.mo10033e(gzy.f27004P, true);
        } else {
            this.f27760e.mo10033e(gzy.f27004P, false);
        }
        this.f27759d.mo10031c(gzy.f27004P);
    }

    /* JADX INFO: renamed from: f */
    public final void m10261f(ManagedSwitchPreference managedSwitchPreference, boolean z) {
        managedSwitchPreference.setChecked(z);
        this.f27758c.mo10045l(managedSwitchPreference.getKey(), z);
    }

    /* JADX INFO: renamed from: g */
    public final void m10262g(boolean z) {
        ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) this.f27768m.findPreference(gzy.f27004P.f26977a);
        managedSwitchPreference.setChecked(z);
        managedSwitchPreference.setTitle(m10259d(z));
        managedSwitchPreference.f7113f = Integer.valueOf(m10257b());
        this.f27760e.mo10033e(gzy.f27004P, Boolean.valueOf(z));
        this.f27760e.mo10033e(gzy.f27007S, true);
    }

    /* JADX INFO: renamed from: h */
    public final void m10263h() {
        int iM10256a = m10256a();
        String strMo11322a = jvh.m13549G(C0100R.plurals.social_apps_selected, iM10256a, Integer.valueOf(iM10256a)).mo11322a(this.f27756a.getResources());
        ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) this.f27768m.findPreference(gzy.f27004P.f26977a);
        Integer numValueOf = Integer.valueOf(kxk.m15025r(this.f27756a, C0100R.attr.colorOnPrimary, -1));
        managedSwitchPreference.f7118k = strMo11322a;
        managedSwitchPreference.f7115h = numValueOf;
    }
}
