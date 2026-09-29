package p000;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p44 {

    /* JADX INFO: renamed from: a */
    public final q44 f55552a;

    /* JADX INFO: renamed from: b */
    public final r44 f55553b;

    /* JADX INFO: renamed from: c */
    public final s44 f55554c;

    /* JADX INFO: renamed from: d */
    public final u44 f55555d;

    /* JADX INFO: renamed from: e */
    public final v44 f55556e;

    /* JADX INFO: renamed from: f */
    public final w44 f55557f;

    /* JADX INFO: renamed from: g */
    public final v44 f55558g;

    /* JADX INFO: renamed from: h */
    public final q44 f55559h;

    /* JADX INFO: renamed from: i */
    public final y44 f55560i;

    /* JADX INFO: renamed from: j */
    public final zc2 f55561j;

    /* JADX INFO: renamed from: k */
    public final w44 f55562k;

    /* JADX INFO: renamed from: l */
    public final v44 f55563l;

    /* JADX INFO: renamed from: m */
    public final b54 f55564m;

    /* JADX INFO: renamed from: n */
    public final x44 f55565n;

    public p44() {
        this.f55552a = new q44(0);
        this.f55553b = new r44();
        this.f55554c = new s44();
        this.f55555d = new u44();
        this.f55556e = new v44();
        this.f55557f = new w44(0);
        this.f55558g = new v44();
        this.f55559h = new q44(1);
        this.f55560i = new y44();
        this.f55561j = new zc2();
        this.f55562k = new w44(1);
        this.f55563l = new v44();
        this.f55564m = new b54();
        this.f55565n = new x44(0);
    }

    /* JADX INFO: renamed from: a */
    public static p44 m18883a(eg4 eg4Var) {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        Double dValueOf3 = Double.valueOf(10.0d);
        dg4 dg4Var = (dg4) eg4Var;
        eg4 eg4VarM10342l = dg4Var.m10342l("attribution", true);
        Boolean bool = Boolean.TRUE;
        dg4 dg4Var2 = (dg4) eg4VarM10342l;
        q44 q44Var = new q44(dg4Var2.m10337g("enabled", bool).booleanValue(), dg4Var2.m10338h("wait", Double.valueOf(3.0d)).doubleValue());
        dg4 dg4Var3 = (dg4) dg4Var.m10342l("config", true);
        r44 r44Var = new r44(dg4Var3.m10338h("staleness", Double.valueOf(14400.0d)).doubleValue(), dg4Var3.m10344n("init_token", ""));
        dg4 dg4Var4 = (dg4) dg4Var.m10342l("deeplinks", true);
        boolean zBooleanValue = dg4Var4.m10337g("allow_deferred", bool).booleanValue();
        double dDoubleValue = dg4Var4.m10338h("timeout_minimum", Double.valueOf(0.25d)).doubleValue();
        Double dValueOf4 = Double.valueOf(30.0d);
        double dDoubleValue2 = dg4Var4.m10338h("timeout_maximum", dValueOf4).doubleValue();
        eg4 eg4VarM10342l2 = dg4Var4.m10342l("deferred_prefetch", false);
        s44 s44Var = new s44(zBooleanValue, dDoubleValue, dDoubleValue2, eg4VarM10342l2 != null ? wmd.m24059a(eg4VarM10342l2) : null);
        dg4 dg4Var5 = (dg4) dg4Var.m10342l("general", true);
        u44 u44Var = new u44(dg4Var5.m10337g("sdk_disabled", Boolean.FALSE).booleanValue(), dg4Var5.m10338h("servertime", dValueOf).doubleValue(), dg4Var5.m10344n("app_id_override", ""), dg4Var5.m10344n("device_id_override", ""));
        dg4 dg4Var6 = (dg4) dg4Var.m10342l("huawei_referrer", true);
        v44 v44Var = new v44(dg4Var6.m10337g("enabled", bool).booleanValue(), dg4Var6.m10339i(1, "retries").intValue(), dg4Var6.m10338h("retry_wait", dValueOf2).doubleValue(), dg4Var6.m10338h("timeout", dValueOf3).doubleValue());
        dg4 dg4Var7 = (dg4) dg4Var.m10342l("install", true);
        w44 w44Var = new w44(dg4Var7.m10344n("resend_id", ""), dg4Var7.m10337g("updates_enabled", bool).booleanValue());
        dg4 dg4Var8 = (dg4) dg4Var.m10342l("install_referrer", true);
        v44 v44Var2 = new v44(dg4Var8.m10337g("enabled", bool).booleanValue(), dg4Var8.m10339i(1, "retries").intValue(), dg4Var8.m10338h("retry_wait", dValueOf2).doubleValue(), dg4Var8.m10338h("timeout", dValueOf3).doubleValue());
        dg4 dg4Var9 = (dg4) dg4Var.m10342l("instant_apps", true);
        q44 q44Var2 = new q44(dg4Var9.m10338h("install_deeplink_wait", dValueOf3).doubleValue(), dg4Var9.m10337g("install_deeplink_clicks_kill", bool).booleanValue());
        dg4 dg4Var10 = (dg4) dg4Var.m10342l("networking", true);
        double dDoubleValue3 = dg4Var10.m10338h("tracking_wait", dValueOf3).doubleValue();
        double dDoubleValue4 = dg4Var10.m10338h("seconds_per_request", dValueOf).doubleValue();
        dg4 dg4Var11 = (dg4) dg4Var10.m10342l("urls", true);
        String strM10344n = dg4Var11.m10344n("init", "");
        Uri uri = Uri.EMPTY;
        Uri uriM3218M = b34.m3218M(strM10344n);
        Uri uri2 = uriM3218M != null ? uriM3218M : uri;
        Uri uriM3218M2 = b34.m3218M(dg4Var11.m10344n("install", ""));
        Uri uri3 = uriM3218M2 != null ? uriM3218M2 : uri;
        Uri uriM3218M3 = b34.m3218M(dg4Var11.m10344n("get_attribution", ""));
        Uri uri4 = uriM3218M3 != null ? uriM3218M3 : uri;
        Uri uriM3218M4 = b34.m3218M(dg4Var11.m10344n("update", ""));
        Uri uri5 = uriM3218M4 != null ? uriM3218M4 : uri;
        Uri uriM3218M5 = b34.m3218M(dg4Var11.m10344n("identityLink", ""));
        Uri uri6 = uriM3218M5 != null ? uriM3218M5 : uri;
        Uri uriM3218M6 = b34.m3218M(dg4Var11.m10344n("smartlink", ""));
        Uri uri7 = uriM3218M6 != null ? uriM3218M6 : uri;
        Uri uriM3218M7 = b34.m3218M(dg4Var11.m10344n("push_token_add", ""));
        Uri uri8 = uriM3218M7 != null ? uriM3218M7 : uri;
        Uri uriM3218M8 = b34.m3218M(dg4Var11.m10344n("push_token_remove", ""));
        Uri uri9 = uriM3218M8 != null ? uriM3218M8 : uri;
        Uri uriM3218M9 = b34.m3218M(dg4Var11.m10344n("session", ""));
        Uri uri10 = uriM3218M9 != null ? uriM3218M9 : uri;
        Uri uriM3218M10 = b34.m3218M(dg4Var11.m10344n("session_begin", ""));
        Uri uri11 = uriM3218M10 != null ? uriM3218M10 : uri;
        Uri uriM3218M11 = b34.m3218M(dg4Var11.m10344n("session_end", ""));
        Uri uri12 = uriM3218M11 != null ? uriM3218M11 : uri;
        Uri uriM3218M12 = b34.m3218M(dg4Var11.m10344n("event", ""));
        y44 y44Var = new y44(dDoubleValue3, dDoubleValue4, new z44(uri2, uri3, uri4, uri5, uri6, uri7, uri8, uri9, uri10, uri11, uri12, uriM3218M12 != null ? uriM3218M12 : uri, dg4Var11.m10342l("event_by_name", true)), dg4Var10.m10340j("retry_waterfall", true));
        dg4 dg4Var12 = (dg4) dg4Var.m10342l("privacy", true);
        ff4 ff4VarM10340j = dg4Var12.m10340j("profiles", true);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ef4 ef4Var = (ef4) ff4VarM10340j;
            if (i >= ef4Var.m11093f()) {
                break;
            }
            eg4 eg4VarM11092e = ef4Var.m11092e(i);
            if (eg4VarM11092e != null) {
                dg4 dg4Var13 = (dg4) eg4VarM11092e;
                arrayList.add(new pk7(dg4Var13.m10344n("name", ""), dg4Var13.m10337g("sleep", Boolean.FALSE).booleanValue(), b34.m3206A(dg4Var13.m10340j("payloads", true)), b34.m3206A(dg4Var13.m10340j("keys", true))));
            }
            i++;
            ff4VarM10340j = ff4VarM10340j;
            q44Var2 = q44Var2;
            w44Var = w44Var;
        }
        q44 q44Var3 = q44Var2;
        w44 w44Var2 = w44Var;
        pk7[] pk7VarArr = (pk7[]) arrayList.toArray(new pk7[0]);
        String[] strArrM3206A = b34.m3206A(dg4Var12.m10340j("allow_custom_ids", true));
        String[] strArrM3206A2 = b34.m3206A(dg4Var12.m10340j("deny_datapoints", true));
        String[] strArrM3206A3 = b34.m3206A(dg4Var12.m10340j("deny_event_names", true));
        String[] strArrM3206A4 = b34.m3206A(dg4Var12.m10340j("allow_event_names", true));
        Boolean bool2 = Boolean.FALSE;
        boolean zBooleanValue2 = dg4Var12.m10337g("allow_event_names_enabled", bool2).booleanValue();
        String[] strArrM3206A5 = b34.m3206A(dg4Var12.m10340j("deny_identity_links", true));
        dg4 dg4Var14 = (dg4) dg4Var12.m10342l("intelligent_consent", true);
        zc2 zc2Var = new zc2(pk7VarArr, strArrM3206A, strArrM3206A2, strArrM3206A3, strArrM3206A4, zBooleanValue2, strArrM3206A5, new w83(dg4Var14.m10337g("gdpr_enabled", bool2).booleanValue(), dg4Var14.m10337g("gdpr_applies", bool2).booleanValue()));
        dg4 dg4Var15 = (dg4) dg4Var.m10342l("push_notifications", true);
        w44 w44Var3 = new w44(dg4Var15.m10337g("enabled", bool2).booleanValue(), dg4Var15.m10344n("resend_id", ""));
        eg4 eg4VarM10342l3 = dg4Var.m10342l("samsung_referrer", true);
        Boolean bool3 = Boolean.TRUE;
        dg4 dg4Var16 = (dg4) eg4VarM10342l3;
        v44 v44Var3 = new v44(dg4Var16.m10337g("enabled", bool3).booleanValue(), dg4Var16.m10339i(1, "retries").intValue(), dg4Var16.m10338h("retry_wait", dValueOf2).doubleValue(), dg4Var16.m10338h("timeout", dValueOf3).doubleValue());
        dg4 dg4Var17 = (dg4) dg4Var.m10342l("sessions", true);
        b54 b54Var = new b54(dg4Var17.m10337g("enabled", bool3).booleanValue(), dg4Var17.m10338h("minimum", dValueOf4).doubleValue(), dg4Var17.m10338h("window", Double.valueOf(600.0d)).doubleValue());
        dg4 dg4Var18 = (dg4) dg4Var.m10342l("meta_referrer", true);
        boolean zBooleanValue3 = dg4Var18.m10337g("enabled", bool3).booleanValue();
        int i2 = 0;
        ff4 ff4VarM10340j2 = dg4Var18.m10340j("sources", false);
        return new p44(q44Var, r44Var, s44Var, u44Var, v44Var, w44Var2, v44Var2, q44Var3, y44Var, zc2Var, w44Var3, v44Var3, b54Var, new x44(zBooleanValue3, ff4VarM10340j2 != null ? b34.m3206A(ff4VarM10340j2) : x44.f67749e, dg4Var18.m10344n("app_id", ""), i2));
    }

    /* JADX INFO: renamed from: b */
    public final dg4 m18884b() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4 dg4VarM10328c2 = dg4.m10328c();
        q44 q44Var = this.f55552a;
        dg4VarM10328c2.m10351u("enabled", q44Var.f57263b);
        dg4VarM10328c2.m10352v(q44Var.f57262a, "wait");
        dg4VarM10328c.m10356z("attribution", dg4VarM10328c2);
        dg4 dg4VarM10328c3 = dg4.m10328c();
        r44 r44Var = this.f55553b;
        dg4VarM10328c3.m10352v(r44Var.f58600a, "staleness");
        dg4VarM10328c3.m10331B("init_token", r44Var.f58601b);
        dg4VarM10328c.m10356z("config", dg4VarM10328c3);
        dg4 dg4VarM10328c4 = dg4.m10328c();
        s44 s44Var = this.f55554c;
        dg4VarM10328c4.m10351u("allow_deferred", s44Var.f60267a);
        dg4VarM10328c4.m10352v(s44Var.f60268b, "timeout_minimum");
        dg4VarM10328c4.m10352v(s44Var.f60269c, "timeout_maximum");
        t44 t44Var = s44Var.f60270d;
        if (t44Var != null) {
            dg4VarM10328c4.m10356z("deferred_prefetch", ((wmd) t44Var).m24064e());
        }
        dg4VarM10328c.m10356z("deeplinks", dg4VarM10328c4);
        dg4 dg4VarM10328c5 = dg4.m10328c();
        u44 u44Var = this.f55555d;
        dg4VarM10328c5.m10351u("sdk_disabled", u44Var.f63390a);
        dg4VarM10328c5.m10352v(u44Var.f63391b, "servertime");
        dg4VarM10328c5.m10331B("app_id_override", u44Var.f63392c);
        dg4VarM10328c5.m10331B("device_id_override", u44Var.f63393d);
        dg4VarM10328c.m10356z("general", dg4VarM10328c5);
        dg4 dg4VarM10328c6 = dg4.m10328c();
        v44 v44Var = this.f55556e;
        dg4VarM10328c6.m10351u("enabled", v44Var.f64836a);
        dg4VarM10328c6.m10353w(v44Var.f64837b, "retries");
        dg4VarM10328c6.m10352v(v44Var.f64838c, "retry_wait");
        dg4VarM10328c6.m10352v(v44Var.f64839d, "timeout");
        dg4VarM10328c.m10356z("huawei_referrer", dg4VarM10328c6);
        dg4 dg4VarM10328c7 = dg4.m10328c();
        w44 w44Var = this.f55557f;
        dg4VarM10328c7.m10331B("resend_id", w44Var.f66375b);
        dg4VarM10328c7.m10351u("updates_enabled", w44Var.f66374a);
        dg4VarM10328c.m10356z("install", dg4VarM10328c7);
        dg4 dg4VarM10328c8 = dg4.m10328c();
        v44 v44Var2 = this.f55558g;
        dg4VarM10328c8.m10351u("enabled", v44Var2.f64836a);
        dg4VarM10328c8.m10353w(v44Var2.f64837b, "retries");
        dg4VarM10328c8.m10352v(v44Var2.f64838c, "retry_wait");
        dg4VarM10328c8.m10352v(v44Var2.f64839d, "timeout");
        dg4VarM10328c.m10356z("install_referrer", dg4VarM10328c8);
        dg4 dg4VarM10328c9 = dg4.m10328c();
        q44 q44Var2 = this.f55559h;
        dg4VarM10328c9.m10352v(q44Var2.f57262a, "install_deeplink_wait");
        dg4VarM10328c9.m10351u("install_deeplink_clicks_kill", q44Var2.f57263b);
        dg4VarM10328c.m10356z("instant_apps", dg4VarM10328c9);
        y44 y44Var = this.f55560i;
        y44Var.getClass();
        dg4 dg4VarM10328c10 = dg4.m10328c();
        dg4VarM10328c10.m10352v(y44Var.f69272a, "tracking_wait");
        dg4VarM10328c10.m10352v(y44Var.f69273b, "seconds_per_request");
        z44 z44Var = y44Var.f69274c;
        z44Var.getClass();
        dg4 dg4VarM10328c11 = dg4.m10328c();
        dg4VarM10328c11.m10331B("init", z44Var.f70862a.toString());
        dg4VarM10328c11.m10331B("install", z44Var.f70863b.toString());
        dg4VarM10328c11.m10331B("get_attribution", z44Var.f70864c.toString());
        dg4VarM10328c11.m10331B("update", z44Var.f70865d.toString());
        dg4VarM10328c11.m10331B("identityLink", z44Var.f70866e.toString());
        dg4VarM10328c11.m10331B("smartlink", z44Var.f70867f.toString());
        dg4VarM10328c11.m10331B("push_token_add", z44Var.f70868g.toString());
        dg4VarM10328c11.m10331B("push_token_remove", z44Var.f70869h.toString());
        dg4VarM10328c11.m10331B("session", z44Var.f70870i.toString());
        dg4VarM10328c11.m10331B("session_begin", z44Var.f70871j.toString());
        dg4VarM10328c11.m10331B("session_end", z44Var.f70872k.toString());
        dg4VarM10328c11.m10331B("event", z44Var.f70873l.toString());
        dg4VarM10328c11.m10356z("event_by_name", z44Var.f70874m);
        dg4VarM10328c10.m10356z("urls", dg4VarM10328c11);
        dg4VarM10328c10.m10354x("retry_waterfall", y44Var.f69275d);
        dg4VarM10328c.m10356z("networking", dg4VarM10328c10);
        zc2 zc2Var = this.f55561j;
        zc2Var.getClass();
        dg4 dg4VarM10328c12 = dg4.m10328c();
        pk7[] pk7VarArr = (pk7[]) zc2Var.f71349b;
        ef4 ef4VarM11088d = ef4.m11088d();
        for (pk7 pk7Var : pk7VarArr) {
            if (pk7Var != null) {
                ef4VarM11088d.m11091c(pk7Var.m19363a());
            }
        }
        dg4VarM10328c12.m10354x("profiles", ef4VarM11088d);
        dg4VarM10328c12.m10354x("allow_custom_ids", b34.m3223T((String[]) zc2Var.f71350c));
        dg4VarM10328c12.m10354x("deny_datapoints", b34.m3223T((String[]) zc2Var.f71351d));
        dg4VarM10328c12.m10354x("deny_event_names", b34.m3223T((String[]) zc2Var.f71352e));
        dg4VarM10328c12.m10354x("allow_event_names", b34.m3223T((String[]) zc2Var.f71353f));
        dg4VarM10328c12.m10351u("allow_event_names_enabled", zc2Var.f71348a);
        dg4VarM10328c12.m10354x("deny_identity_links", b34.m3223T((String[]) zc2Var.f71354g));
        w83 w83Var = (w83) zc2Var.f71355h;
        dg4 dg4VarM10328c13 = dg4.m10328c();
        dg4VarM10328c13.m10351u("gdpr_enabled", w83Var.f66511a);
        dg4VarM10328c13.m10351u("gdpr_applies", w83Var.f66512b);
        dg4VarM10328c12.m10356z("intelligent_consent", dg4VarM10328c13);
        dg4VarM10328c.m10356z("privacy", dg4VarM10328c12);
        w44 w44Var2 = this.f55562k;
        w44Var2.getClass();
        dg4 dg4VarM10328c14 = dg4.m10328c();
        dg4VarM10328c14.m10351u("enabled", w44Var2.f66374a);
        dg4VarM10328c14.m10331B("resend_id", w44Var2.f66375b);
        dg4VarM10328c.m10356z("push_notifications", dg4VarM10328c14);
        v44 v44Var3 = this.f55563l;
        v44Var3.getClass();
        dg4 dg4VarM10328c15 = dg4.m10328c();
        dg4VarM10328c15.m10351u("enabled", v44Var3.f64836a);
        dg4VarM10328c15.m10353w(v44Var3.f64837b, "retries");
        dg4VarM10328c15.m10352v(v44Var3.f64838c, "retry_wait");
        dg4VarM10328c15.m10352v(v44Var3.f64839d, "timeout");
        dg4VarM10328c.m10356z("samsung_referrer", dg4VarM10328c15);
        b54 b54Var = this.f55564m;
        b54Var.getClass();
        dg4 dg4VarM10328c16 = dg4.m10328c();
        dg4VarM10328c16.m10351u("enabled", b54Var.f7959a);
        dg4VarM10328c16.m10352v(b54Var.f7960b, "minimum");
        dg4VarM10328c16.m10352v(b54Var.f7961c, "window");
        dg4VarM10328c.m10356z("sessions", dg4VarM10328c16);
        x44 x44Var = this.f55565n;
        x44Var.getClass();
        dg4 dg4VarM10328c17 = dg4.m10328c();
        dg4VarM10328c17.m10351u("enabled", x44Var.f67751b);
        dg4VarM10328c17.m10354x("sources", b34.m3223T((String[]) x44Var.f67752c));
        dg4VarM10328c17.m10331B("app_id", (String) x44Var.f67753d);
        dg4VarM10328c.m10356z("meta_referrer", dg4VarM10328c17);
        return dg4VarM10328c;
    }

    public p44(q44 q44Var, r44 r44Var, s44 s44Var, u44 u44Var, v44 v44Var, w44 w44Var, v44 v44Var2, q44 q44Var2, y44 y44Var, zc2 zc2Var, w44 w44Var2, v44 v44Var3, b54 b54Var, x44 x44Var) {
        this.f55552a = q44Var;
        this.f55553b = r44Var;
        this.f55554c = s44Var;
        this.f55555d = u44Var;
        this.f55556e = v44Var;
        this.f55557f = w44Var;
        this.f55558g = v44Var2;
        this.f55559h = q44Var2;
        this.f55560i = y44Var;
        this.f55561j = zc2Var;
        this.f55562k = w44Var2;
        this.f55563l = v44Var3;
        this.f55564m = b54Var;
        this.f55565n = x44Var;
    }
}
