package p000;

import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;

/* JADX INFO: loaded from: classes.dex */
public final class uo3 {

    /* JADX INFO: renamed from: a */
    public final long f64127a;

    /* JADX INFO: renamed from: b */
    public final int f64128b;

    /* JADX INFO: renamed from: c */
    public final double f64129c;

    /* JADX INFO: renamed from: d */
    public final GoogleReferrerStatus f64130d;

    /* JADX INFO: renamed from: e */
    public final String f64131e;

    /* JADX INFO: renamed from: f */
    public final Long f64132f;

    /* JADX INFO: renamed from: g */
    public final Long f64133g;

    /* JADX INFO: renamed from: h */
    public final Long f64134h;

    /* JADX INFO: renamed from: i */
    public final Long f64135i;

    /* JADX INFO: renamed from: j */
    public final Boolean f64136j;

    /* JADX INFO: renamed from: k */
    public final String f64137k;

    public uo3(long j, int i, double d, GoogleReferrerStatus googleReferrerStatus, String str, Long l, Long l2, Long l3, Long l4, Boolean bool, String str2) {
        this.f64127a = j;
        this.f64128b = i;
        this.f64129c = d;
        this.f64130d = googleReferrerStatus;
        this.f64131e = str;
        this.f64132f = l;
        this.f64133g = l2;
        this.f64134h = l3;
        this.f64135i = l4;
        this.f64136j = bool;
        this.f64137k = str2;
    }

    /* JADX INFO: renamed from: a */
    public static uo3 m22843a(int i, double d, GoogleReferrerStatus googleReferrerStatus) {
        return new uo3(System.currentTimeMillis(), i, d, googleReferrerStatus, null, null, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public static uo3 m22844c(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new uo3(dg4Var.m10343m("gather_time_millis", 0L).longValue(), dg4Var.m10339i(0, "attempt_count").intValue(), dg4Var.m10338h("duration", Double.valueOf(0.0d)).doubleValue(), GoogleReferrerStatus.fromKey(dg4Var.m10344n("status", "")), dg4Var.m10344n("referrer", null), dg4Var.m10343m("install_begin_time", null), dg4Var.m10343m("install_begin_server_time", null), dg4Var.m10343m("referrer_click_time", null), dg4Var.m10343m("referrer_click_server_time", null), dg4Var.m10337g("google_play_instant", null), dg4Var.m10344n("install_version", null));
    }

    /* JADX INFO: renamed from: b */
    public final dg4 m22845b() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10353w(this.f64128b, "attempt_count");
        dg4VarM10328c.m10352v(this.f64129c, "duration");
        dg4VarM10328c.m10331B("status", this.f64130d.key);
        String str = this.f64131e;
        if (str != null) {
            dg4VarM10328c.m10331B("referrer", str);
        }
        Long l = this.f64132f;
        if (l != null) {
            dg4VarM10328c.m10330A("install_begin_time", l.longValue());
        }
        Long l2 = this.f64133g;
        if (l2 != null) {
            dg4VarM10328c.m10330A("install_begin_server_time", l2.longValue());
        }
        Long l3 = this.f64134h;
        if (l3 != null) {
            dg4VarM10328c.m10330A("referrer_click_time", l3.longValue());
        }
        Long l4 = this.f64135i;
        if (l4 != null) {
            dg4VarM10328c.m10330A("referrer_click_server_time", l4.longValue());
        }
        Boolean bool = this.f64136j;
        if (bool != null) {
            dg4VarM10328c.m10351u("google_play_instant", bool.booleanValue());
        }
        String str2 = this.f64137k;
        if (str2 != null) {
            dg4VarM10328c.m10331B("install_version", str2);
        }
        return dg4VarM10328c;
    }

    /* JADX INFO: renamed from: d */
    public final dg4 m22846d() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10330A("gather_time_millis", this.f64127a);
        dg4VarM10328c.m10353w(this.f64128b, "attempt_count");
        dg4VarM10328c.m10352v(this.f64129c, "duration");
        dg4VarM10328c.m10331B("status", this.f64130d.key);
        String str = this.f64131e;
        if (str != null) {
            dg4VarM10328c.m10331B("referrer", str);
        }
        Long l = this.f64132f;
        if (l != null) {
            dg4VarM10328c.m10330A("install_begin_time", l.longValue());
        }
        Long l2 = this.f64133g;
        if (l2 != null) {
            dg4VarM10328c.m10330A("install_begin_server_time", l2.longValue());
        }
        Long l3 = this.f64134h;
        if (l3 != null) {
            dg4VarM10328c.m10330A("referrer_click_time", l3.longValue());
        }
        Long l4 = this.f64135i;
        if (l4 != null) {
            dg4VarM10328c.m10330A("referrer_click_server_time", l4.longValue());
        }
        Boolean bool = this.f64136j;
        if (bool != null) {
            dg4VarM10328c.m10351u("google_play_instant", bool.booleanValue());
        }
        String str2 = this.f64137k;
        if (str2 != null) {
            dg4VarM10328c.m10331B("install_version", str2);
        }
        return dg4VarM10328c;
    }
}
