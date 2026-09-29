package cc;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1986y3 extends AbstractC1772a5 {

    /* JADX INFO: renamed from: S */
    public static final Pair f10389S = new Pair("", 0L);

    /* JADX INFO: renamed from: H */
    public final C1941t3 f10390H;

    /* JADX INFO: renamed from: I */
    public final C1959v3 f10391I;

    /* JADX INFO: renamed from: J */
    public final C1959v3 f10392J;

    /* JADX INFO: renamed from: K */
    public boolean f10393K;

    /* JADX INFO: renamed from: L */
    public final C1941t3 f10394L;

    /* JADX INFO: renamed from: M */
    public final C1941t3 f10395M;

    /* JADX INFO: renamed from: N */
    public final C1959v3 f10396N;

    /* JADX INFO: renamed from: O */
    public final C1977x3 f10397O;

    /* JADX INFO: renamed from: P */
    public final C1977x3 f10398P;

    /* JADX INFO: renamed from: Q */
    public final C1959v3 f10399Q;

    /* JADX INFO: renamed from: R */
    public final C1950u3 f10400R;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f10401c;

    /* JADX INFO: renamed from: d */
    public C1968w3 f10402d;

    /* JADX INFO: renamed from: e */
    public final C1959v3 f10403e;

    /* JADX INFO: renamed from: f */
    public final C1977x3 f10404f;

    /* JADX INFO: renamed from: g */
    public String f10405g;

    /* JADX INFO: renamed from: h */
    public boolean f10406h;

    /* JADX INFO: renamed from: i */
    public long f10407i;

    /* JADX INFO: renamed from: j */
    public final C1959v3 f10408j;

    /* JADX INFO: renamed from: k */
    public final C1941t3 f10409k;

    /* JADX INFO: renamed from: l */
    public final C1977x3 f10410l;

    public C1986y3(C1897o4 c1897o4) {
        super(c1897o4);
        this.f10408j = new C1959v3(this, "session_timeout", 1800000L);
        this.f10409k = new C1941t3(this, "start_new_session", true);
        this.f10391I = new C1959v3(this, "last_pause_time", 0L);
        this.f10392J = new C1959v3(this, "session_id", 0L);
        this.f10410l = new C1977x3(this, "non_personalized_ads");
        this.f10390H = new C1941t3(this, "allow_remote_dynamite", false);
        this.f10403e = new C1959v3(this, "first_open_time", 0L);
        C6272i.m12912f("app_install_time");
        this.f10404f = new C1977x3(this, "app_instance_id");
        this.f10394L = new C1941t3(this, "app_backgrounded", false);
        this.f10395M = new C1941t3(this, "deep_link_retrieval_complete", false);
        this.f10396N = new C1959v3(this, "deep_link_retrieval_attempts", 0L);
        this.f10397O = new C1977x3(this, "firebase_feature_rollouts");
        this.f10398P = new C1977x3(this, "deferred_attribution_cache");
        this.f10399Q = new C1959v3(this, "deferred_attribution_cache_timestamp", 0L);
        this.f10400R = new C1950u3(this);
    }

    @Override // cc.AbstractC1772a5
    /* JADX INFO: renamed from: h */
    public final boolean mo5491h() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final SharedPreferences m5917l() {
        mo5748g();
        m5492j();
        C6272i.m12915i(this.f10401c);
        return this.f10401c;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* JADX INFO: renamed from: m */
    public final void m5918m() {
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        SharedPreferences sharedPreferences = c1897o4.f10076a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f10401c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f10393K = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f10401c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c1897o4.getClass();
        this.f10402d = new C1968w3(this, Math.max(0L, ((Long) C1985y2.f10347e.m5912a(null)).longValue()));
    }

    /* JADX INFO: renamed from: n */
    public final C1811f m5919n() {
        mo5748g();
        return C1811f.m5593b(m5917l().getString("consent_settings", "G1"));
    }

    /* JADX INFO: renamed from: o */
    public final Boolean m5920o() {
        mo5748g();
        if (m5917l().contains("measurement_enabled")) {
            return Boolean.valueOf(m5917l().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m5921p(Boolean bool) {
        mo5748g();
        SharedPreferences.Editor editorEdit = m5917l().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: q */
    public final void m5922q(boolean z10) {
        mo5748g();
        C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5624b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m5917l().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5923r(long j10) {
        return j10 - this.f10408j.m5897a() > this.f10391I.m5897a();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5924s(int i10) {
        int i11 = m5917l().getInt("consent_source", 100);
        C1811f c1811f = C1811f.f9788b;
        return i10 <= i11;
    }
}
