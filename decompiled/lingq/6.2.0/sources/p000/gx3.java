package p000;

import com.kochava.tracker.store.huawei.referrer.internal.HuaweiReferrerStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class gx3 implements hx3 {

    /* JADX INFO: renamed from: a */
    public final long f41465a;

    /* JADX INFO: renamed from: b */
    public final int f41466b;

    /* JADX INFO: renamed from: c */
    public final double f41467c;

    /* JADX INFO: renamed from: d */
    public final HuaweiReferrerStatus f41468d;

    /* JADX INFO: renamed from: e */
    public final String f41469e;

    /* JADX INFO: renamed from: f */
    public final Long f41470f;

    /* JADX INFO: renamed from: g */
    public final Long f41471g;

    public gx3(long j, int i, double d, HuaweiReferrerStatus huaweiReferrerStatus, String str, Long l, Long l2) {
        this.f41465a = j;
        this.f41466b = i;
        this.f41467c = d;
        this.f41468d = huaweiReferrerStatus;
        this.f41469e = str;
        this.f41470f = l;
        this.f41471g = l2;
    }

    /* JADX INFO: renamed from: b */
    public static gx3 m12957b(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new gx3(dg4Var.m10343m("gather_time_millis", 0L).longValue(), dg4Var.m10339i(0, "attempt_count").intValue(), dg4Var.m10338h("duration", Double.valueOf(0.0d)).doubleValue(), HuaweiReferrerStatus.fromKey(dg4Var.m10344n("status", "")), dg4Var.m10344n("referrer", null), dg4Var.m10343m("install_begin_time", null), dg4Var.m10343m("referrer_click_time", null));
    }

    /* JADX INFO: renamed from: a */
    public final dg4 m12958a() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10353w(this.f41466b, "attempt_count");
        dg4VarM10328c.m10352v(this.f41467c, "duration");
        dg4VarM10328c.m10331B("status", this.f41468d.key);
        String str = this.f41469e;
        if (str != null) {
            dg4VarM10328c.m10331B("referrer", str);
        }
        Long l = this.f41470f;
        if (l != null) {
            dg4VarM10328c.m10330A("install_begin_time", l.longValue());
        }
        Long l2 = this.f41471g;
        if (l2 != null) {
            dg4VarM10328c.m10330A("referrer_click_time", l2.longValue());
        }
        return dg4VarM10328c;
    }

    /* JADX INFO: renamed from: c */
    public final long m12959c() {
        return this.f41465a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12960d() {
        return this.f41468d != HuaweiReferrerStatus.NotGathered;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12961e() {
        HuaweiReferrerStatus huaweiReferrerStatus = HuaweiReferrerStatus.FeatureNotSupported;
        HuaweiReferrerStatus huaweiReferrerStatus2 = this.f41468d;
        return (huaweiReferrerStatus2 == huaweiReferrerStatus || huaweiReferrerStatus2 == HuaweiReferrerStatus.MissingDependency) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12962f() {
        HuaweiReferrerStatus huaweiReferrerStatus = HuaweiReferrerStatus.Ok;
        HuaweiReferrerStatus huaweiReferrerStatus2 = this.f41468d;
        return huaweiReferrerStatus2 == huaweiReferrerStatus || huaweiReferrerStatus2 == HuaweiReferrerStatus.NoData;
    }

    /* JADX INFO: renamed from: g */
    public final dg4 m12963g() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10330A("gather_time_millis", this.f41465a);
        dg4VarM10328c.m10353w(this.f41466b, "attempt_count");
        dg4VarM10328c.m10352v(this.f41467c, "duration");
        dg4VarM10328c.m10331B("status", this.f41468d.key);
        String str = this.f41469e;
        if (str != null) {
            dg4VarM10328c.m10331B("referrer", str);
        }
        Long l = this.f41470f;
        if (l != null) {
            dg4VarM10328c.m10330A("install_begin_time", l.longValue());
        }
        Long l2 = this.f41471g;
        if (l2 != null) {
            dg4VarM10328c.m10330A("referrer_click_time", l2.longValue());
        }
        return dg4VarM10328c;
    }
}
