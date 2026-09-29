package p459wg;

import android.net.Uri;
import java.util.ArrayList;
import p121fh.C5533b;
import p121fh.InterfaceC5534c;
import p176ib.C6259c1;
import p349qo.C8656b;
import p534zf.C10483a;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: wg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9917a {

    /* JADX INFO: renamed from: a */
    public final C9918b f50557a;

    /* JADX INFO: renamed from: b */
    public final C9920d f50558b;

    /* JADX INFO: renamed from: c */
    public final C9921e f50559c;

    /* JADX INFO: renamed from: d */
    public final C9922f f50560d;

    /* JADX INFO: renamed from: e */
    public final C9919c f50561e;

    /* JADX INFO: renamed from: f */
    public final C9923g f50562f;

    /* JADX INFO: renamed from: g */
    public final C9924h f50563g;

    /* JADX INFO: renamed from: h */
    public final C9918b f50564h;

    /* JADX INFO: renamed from: i */
    public final C9925i f50565i;

    /* JADX INFO: renamed from: j */
    public final C9928l f50566j;

    /* JADX INFO: renamed from: k */
    public final C9930n f50567k;

    /* JADX INFO: renamed from: l */
    public final C9931o f50568l;

    /* JADX INFO: renamed from: m */
    public final C9922f f50569m;

    public C9917a() {
        this.f50557a = new C9918b(0);
        this.f50558b = new C9920d();
        this.f50559c = new C9921e();
        this.f50560d = new C9922f();
        this.f50561e = new C9919c();
        this.f50562f = new C9923g();
        this.f50563g = new C9924h();
        this.f50564h = new C9918b(1);
        this.f50565i = new C9925i();
        this.f50566j = new C9928l();
        this.f50567k = new C9930n();
        this.f50568l = new C9931o();
        this.f50569m = new C9922f();
    }

    public C9917a(C9918b c9918b, C9920d c9920d, C9921e c9921e, C9922f c9922f, C9919c c9919c, C9923g c9923g, C9924h c9924h, C9918b c9918b2, C9925i c9925i, C9928l c9928l, C9930n c9930n, C9931o c9931o, C9922f c9922f2) {
        this.f50557a = c9918b;
        this.f50558b = c9920d;
        this.f50559c = c9921e;
        this.f50560d = c9922f;
        this.f50561e = c9919c;
        this.f50562f = c9923g;
        this.f50563g = c9924h;
        this.f50564h = c9918b2;
        this.f50565i = c9925i;
        this.f50566j = c9928l;
        this.f50567k = c9930n;
        this.f50568l = c9931o;
        this.f50569m = c9922f2;
    }

    /* JADX INFO: renamed from: a */
    public static C9917a m18411a(InterfaceC10488f interfaceC10488f) {
        InterfaceC10488f interfaceC10488fMo19454d = interfaceC10488f.mo19454d("attribution", true);
        Boolean bool = Boolean.TRUE;
        C9918b c9918b = new C9918b(interfaceC10488fMo19454d.mo19468r("enabled", bool).booleanValue(), interfaceC10488fMo19454d.mo19462l("wait", Double.valueOf(3.0d)).doubleValue());
        InterfaceC10488f interfaceC10488fMo19454d2 = interfaceC10488f.mo19454d("deeplinks", true);
        boolean zBooleanValue = interfaceC10488fMo19454d2.mo19468r("allow_deferred", bool).booleanValue();
        double dDoubleValue = interfaceC10488fMo19454d2.mo19462l("timeout_minimum", Double.valueOf(0.25d)).doubleValue();
        Double dValueOf = Double.valueOf(30.0d);
        double dDoubleValue2 = interfaceC10488fMo19454d2.mo19462l("timeout_maximum", dValueOf).doubleValue();
        InterfaceC10488f interfaceC10488fMo19454d3 = interfaceC10488fMo19454d2.mo19454d("deferred_prefetch", false);
        C9920d c9920d = new C9920d(zBooleanValue, dDoubleValue, dDoubleValue2, interfaceC10488fMo19454d3 != null ? new C6259c1(interfaceC10488fMo19454d3.mo19468r("match", Boolean.FALSE).booleanValue(), interfaceC10488fMo19454d3.mo19467q("detail", null), interfaceC10488fMo19454d3.mo19454d("deeplink", false)) : null);
        InterfaceC10488f interfaceC10488fMo19454d4 = interfaceC10488f.mo19454d("general", true);
        C9921e c9921e = new C9921e(interfaceC10488fMo19454d4.mo19468r("sdk_disabled", Boolean.FALSE).booleanValue(), interfaceC10488fMo19454d4.mo19462l("servertime", Double.valueOf(0.0d)).doubleValue(), interfaceC10488fMo19454d4.mo19467q("app_id_override", ""), interfaceC10488fMo19454d4.mo19467q("device_id_override", ""));
        InterfaceC10488f interfaceC10488fMo19454d5 = interfaceC10488f.mo19454d("huawei_referrer", true);
        C9922f c9922f = new C9922f(interfaceC10488fMo19454d5.mo19468r("enabled", bool).booleanValue(), interfaceC10488fMo19454d5.mo19466p(1, "retries").intValue(), interfaceC10488fMo19454d5.mo19462l("retry_wait", Double.valueOf(1.0d)).doubleValue(), interfaceC10488fMo19454d5.mo19462l("timeout", Double.valueOf(10.0d)).doubleValue());
        InterfaceC10488f interfaceC10488fMo19454d6 = interfaceC10488f.mo19454d("config", true);
        C9919c c9919c = new C9919c(interfaceC10488fMo19454d6.mo19467q("init_token", ""), interfaceC10488fMo19454d6.mo19462l("staleness", Double.valueOf(14400.0d)).doubleValue());
        InterfaceC10488f interfaceC10488fMo19454d7 = interfaceC10488f.mo19454d("install", true);
        C9923g c9923g = new C9923g(interfaceC10488fMo19454d7.mo19467q("resend_id", ""), interfaceC10488fMo19454d7.mo19468r("updates_enabled", bool).booleanValue());
        InterfaceC10488f interfaceC10488fMo19454d8 = interfaceC10488f.mo19454d("install_referrer", true);
        C9924h c9924h = new C9924h(interfaceC10488fMo19454d8.mo19468r("enabled", bool).booleanValue(), interfaceC10488fMo19454d8.mo19466p(1, "retries").intValue(), interfaceC10488fMo19454d8.mo19462l("retry_wait", Double.valueOf(1.0d)).doubleValue(), interfaceC10488fMo19454d8.mo19462l("timeout", Double.valueOf(10.0d)).doubleValue());
        InterfaceC10488f interfaceC10488fMo19454d9 = interfaceC10488f.mo19454d("instant_apps", true);
        C9918b c9918b2 = new C9918b(interfaceC10488fMo19454d9.mo19462l("install_deeplink_wait", Double.valueOf(10.0d)).doubleValue(), interfaceC10488fMo19454d9.mo19468r("install_deeplink_clicks_kill", bool).booleanValue());
        InterfaceC10488f interfaceC10488fMo19454d10 = interfaceC10488f.mo19454d("networking", true);
        double dDoubleValue3 = interfaceC10488fMo19454d10.mo19462l("tracking_wait", Double.valueOf(10.0d)).doubleValue();
        double dDoubleValue4 = interfaceC10488fMo19454d10.mo19462l("seconds_per_request", Double.valueOf(0.0d)).doubleValue();
        InterfaceC10488f interfaceC10488fMo19454d11 = interfaceC10488fMo19454d10.mo19454d("urls", true);
        C9925i c9925i = new C9925i(dDoubleValue3, dDoubleValue4, new C9926j(C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("init", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("install", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("get_attribution", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("update", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("identityLink", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("smartlink", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("push_token_add", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("push_token_remove", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("session", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("session_begin", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("session_end", ""), Uri.EMPTY), C8656b.m16890Q(interfaceC10488fMo19454d11.mo19467q("event", ""), Uri.EMPTY), interfaceC10488fMo19454d11.mo19454d("event_by_name", true)), interfaceC10488fMo19454d10.mo19455e("retry_waterfall"));
        InterfaceC10488f interfaceC10488fMo19454d12 = interfaceC10488f.mo19454d("privacy", true);
        InterfaceC10484b interfaceC10484bMo19455e = interfaceC10488fMo19454d12.mo19455e("profiles");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < interfaceC10484bMo19455e.length()) {
            InterfaceC10488f interfaceC10488fMo19434d = interfaceC10484bMo19455e.mo19434d(i10);
            if (interfaceC10488fMo19434d != null) {
                arrayList.add(new C5533b(interfaceC10488fMo19434d.mo19467q("name", ""), interfaceC10488fMo19434d.mo19468r("sleep", Boolean.FALSE).booleanValue(), C8656b.m16879F(interfaceC10488fMo19434d.mo19455e("payloads")), C8656b.m16879F(interfaceC10488fMo19434d.mo19455e("keys"))));
            }
            i10++;
            interfaceC10484bMo19455e = interfaceC10484bMo19455e;
            c9918b2 = c9918b2;
            c9920d = c9920d;
            c9918b = c9918b;
        }
        C9920d c9920d2 = c9920d;
        C9918b c9918b3 = c9918b2;
        InterfaceC5534c[] interfaceC5534cArr = (InterfaceC5534c[]) arrayList.toArray(new InterfaceC5534c[0]);
        String[] strArrM16879F = C8656b.m16879F(interfaceC10488fMo19454d12.mo19455e("allow_custom_ids"));
        String[] strArrM16879F2 = C8656b.m16879F(interfaceC10488fMo19454d12.mo19455e("deny_datapoints"));
        String[] strArrM16879F3 = C8656b.m16879F(interfaceC10488fMo19454d12.mo19455e("deny_event_names"));
        String[] strArrM16879F4 = C8656b.m16879F(interfaceC10488fMo19454d12.mo19455e("deny_identity_links"));
        InterfaceC10488f interfaceC10488fMo19454d13 = interfaceC10488fMo19454d12.mo19454d("intelligent_consent", true);
        Boolean bool2 = Boolean.FALSE;
        C9928l c9928l = new C9928l(interfaceC5534cArr, strArrM16879F, strArrM16879F2, strArrM16879F3, strArrM16879F4, new C9929m(interfaceC10488fMo19454d13.mo19468r("gdpr_enabled", bool2).booleanValue(), interfaceC10488fMo19454d13.mo19468r("gdpr_applies", bool2).booleanValue()));
        InterfaceC10488f interfaceC10488fMo19454d14 = interfaceC10488f.mo19454d("push_notifications", true);
        C9930n c9930n = new C9930n(interfaceC10488fMo19454d14.mo19467q("resend_id", ""), interfaceC10488fMo19454d14.mo19468r("enabled", bool2).booleanValue());
        InterfaceC10488f interfaceC10488fMo19454d15 = interfaceC10488f.mo19454d("sessions", true);
        Boolean bool3 = Boolean.TRUE;
        C9931o c9931o = new C9931o(interfaceC10488fMo19454d15.mo19462l("minimum", dValueOf).doubleValue(), interfaceC10488fMo19454d15.mo19462l("window", Double.valueOf(600.0d)).doubleValue(), interfaceC10488fMo19454d15.mo19468r("enabled", bool3).booleanValue());
        InterfaceC10488f interfaceC10488fMo19454d16 = interfaceC10488f.mo19454d("samsung_referrer", true);
        return new C9917a(c9918b, c9920d2, c9921e, c9922f, c9919c, c9923g, c9924h, c9918b3, c9925i, c9928l, c9930n, c9931o, new C9922f(interfaceC10488fMo19454d16.mo19468r("enabled", bool3).booleanValue(), interfaceC10488fMo19454d16.mo19466p(1, "retries").intValue(), interfaceC10488fMo19454d16.mo19462l("retry_wait", Double.valueOf(1.0d)).doubleValue(), interfaceC10488fMo19454d16.mo19462l("timeout", Double.valueOf(10.0d)).doubleValue()));
    }

    /* JADX INFO: renamed from: b */
    public final C10487e m18412b() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19448B(this.f50557a.m18413a(), "attribution");
        C9920d c9920d = this.f50558b;
        c9920d.getClass();
        C10487e c10487eM19445u2 = C10487e.m19445u();
        c10487eM19445u2.m19472x("allow_deferred", c9920d.f50575a);
        c10487eM19445u2.m19473y("timeout_minimum", c9920d.f50576b);
        c10487eM19445u2.m19473y("timeout_maximum", c9920d.f50577c);
        C6259c1 c6259c1 = c9920d.f50578d;
        if (c6259c1 != null) {
            c10487eM19445u2.m19448B(c6259c1.m12893a(), "deferred_prefetch");
        }
        c10487eM19445u.m19448B(c10487eM19445u2, "deeplinks");
        C9921e c9921e = this.f50559c;
        c9921e.getClass();
        C10487e c10487eM19445u3 = C10487e.m19445u();
        c10487eM19445u3.m19472x("sdk_disabled", c9921e.f50579a);
        c10487eM19445u3.m19473y("servertime", c9921e.f50580b);
        c10487eM19445u3.m19450D("app_id_override", c9921e.f50581c);
        c10487eM19445u3.m19450D("device_id_override", c9921e.f50582d);
        c10487eM19445u.m19448B(c10487eM19445u3, "general");
        C9922f c9922f = this.f50560d;
        c9922f.getClass();
        C10487e c10487eM19445u4 = C10487e.m19445u();
        c10487eM19445u4.m19472x("enabled", c9922f.f50583a);
        c10487eM19445u4.m19474z("retries", c9922f.f50584b);
        c10487eM19445u4.m19473y("retry_wait", c9922f.f50585c);
        c10487eM19445u4.m19473y("timeout", c9922f.f50586d);
        c10487eM19445u.m19448B(c10487eM19445u4, "huawei_referrer");
        C9919c c9919c = this.f50561e;
        c9919c.getClass();
        C10487e c10487eM19445u5 = C10487e.m19445u();
        c10487eM19445u5.m19473y("staleness", c9919c.f50573a);
        c10487eM19445u5.m19450D("init_token", c9919c.f50574b);
        c10487eM19445u.m19448B(c10487eM19445u5, "config");
        C9923g c9923g = this.f50562f;
        c9923g.getClass();
        C10487e c10487eM19445u6 = C10487e.m19445u();
        c10487eM19445u6.m19450D("resend_id", c9923g.f50587a);
        c10487eM19445u6.m19472x("updates_enabled", c9923g.f50588b);
        c10487eM19445u.m19448B(c10487eM19445u6, "install");
        C9924h c9924h = this.f50563g;
        c9924h.getClass();
        C10487e c10487eM19445u7 = C10487e.m19445u();
        c10487eM19445u7.m19472x("enabled", c9924h.f50589a);
        c10487eM19445u7.m19474z("retries", c9924h.f50590b);
        c10487eM19445u7.m19473y("retry_wait", c9924h.f50591c);
        c10487eM19445u7.m19473y("timeout", c9924h.f50592d);
        c10487eM19445u.m19448B(c10487eM19445u7, "install_referrer");
        c10487eM19445u.m19448B(this.f50564h.m18413a(), "instant_apps");
        C9925i c9925i = this.f50565i;
        c9925i.getClass();
        C10487e c10487eM19445u8 = C10487e.m19445u();
        c10487eM19445u8.m19473y("tracking_wait", c9925i.f50593a);
        c10487eM19445u8.m19473y("seconds_per_request", c9925i.f50594b);
        C9926j c9926j = (C9926j) c9925i.f50595c;
        c9926j.getClass();
        C10487e c10487eM19445u9 = C10487e.m19445u();
        c10487eM19445u9.m19450D("init", c9926j.f50597a.toString());
        c10487eM19445u9.m19450D("install", c9926j.f50598b.toString());
        c10487eM19445u9.m19450D("get_attribution", c9926j.f50599c.toString());
        c10487eM19445u9.m19450D("update", c9926j.f50600d.toString());
        c10487eM19445u9.m19450D("identityLink", c9926j.f50601e.toString());
        c10487eM19445u9.m19450D("smartlink", c9926j.f50602f.toString());
        c10487eM19445u9.m19450D("push_token_add", c9926j.f50603g.toString());
        c10487eM19445u9.m19450D("push_token_remove", c9926j.f50604h.toString());
        c10487eM19445u9.m19450D("session", c9926j.f50605i.toString());
        c10487eM19445u9.m19450D("session_begin", c9926j.f50606j.toString());
        c10487eM19445u9.m19450D("session_end", c9926j.f50607k.toString());
        c10487eM19445u9.m19450D("event", c9926j.f50608l.toString());
        c10487eM19445u9.m19448B(c9926j.f50609m, "event_by_name");
        c10487eM19445u8.m19448B(c10487eM19445u9, "urls");
        c10487eM19445u8.m19447A("retry_waterfall", c9925i.f50596d);
        c10487eM19445u.m19448B(c10487eM19445u8, "networking");
        C9928l c9928l = this.f50566j;
        c9928l.getClass();
        C10487e c10487eM19445u10 = C10487e.m19445u();
        C10483a c10483aM19430i = C10483a.m19430i();
        for (InterfaceC5534c interfaceC5534c : c9928l.f50610a) {
            if (interfaceC5534c != null) {
                c10483aM19430i.m19438h(interfaceC5534c.mo11778c());
            }
        }
        c10487eM19445u10.m19447A("profiles", c10483aM19430i);
        c10487eM19445u10.m19447A("allow_custom_ids", C8656b.m16895V(c9928l.f50611b));
        c10487eM19445u10.m19447A("deny_datapoints", C8656b.m16895V(c9928l.f50612c));
        c10487eM19445u10.m19447A("deny_event_names", C8656b.m16895V(c9928l.f50613d));
        c10487eM19445u10.m19447A("deny_identity_links", C8656b.m16895V(c9928l.f50614e));
        C9929m c9929m = c9928l.f50615f;
        c9929m.getClass();
        C10487e c10487eM19445u11 = C10487e.m19445u();
        c10487eM19445u11.m19472x("gdpr_enabled", c9929m.f50616a);
        c10487eM19445u11.m19472x("gdpr_applies", c9929m.f50617b);
        c10487eM19445u10.m19448B(c10487eM19445u11, "intelligent_consent");
        c10487eM19445u.m19448B(c10487eM19445u10, "privacy");
        C9930n c9930n = this.f50567k;
        c9930n.getClass();
        C10487e c10487eM19445u12 = C10487e.m19445u();
        c10487eM19445u12.m19472x("enabled", c9930n.f50618a);
        c10487eM19445u12.m19450D("resend_id", c9930n.f50619b);
        c10487eM19445u.m19448B(c10487eM19445u12, "push_notifications");
        C9931o c9931o = this.f50568l;
        c9931o.getClass();
        C10487e c10487eM19445u13 = C10487e.m19445u();
        c10487eM19445u13.m19472x("enabled", c9931o.f50620a);
        c10487eM19445u13.m19473y("minimum", c9931o.f50621b);
        c10487eM19445u13.m19473y("window", c9931o.f50622c);
        c10487eM19445u.m19448B(c10487eM19445u13, "sessions");
        C9922f c9922f2 = this.f50569m;
        c9922f2.getClass();
        C10487e c10487eM19445u14 = C10487e.m19445u();
        c10487eM19445u14.m19472x("enabled", c9922f2.f50583a);
        c10487eM19445u14.m19474z("retries", c9922f2.f50584b);
        c10487eM19445u14.m19473y("retry_wait", c9922f2.f50585c);
        c10487eM19445u14.m19473y("timeout", c9922f2.f50586d);
        c10487eM19445u.m19448B(c10487eM19445u14, "samsung_referrer");
        return c10487eM19445u;
    }
}
