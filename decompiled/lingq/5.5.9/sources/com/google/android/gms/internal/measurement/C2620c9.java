package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2620c9 implements InterfaceC2606b9 {

    /* JADX INFO: renamed from: A */
    public static final C2795p4 f14098A;

    /* JADX INFO: renamed from: B */
    public static final C2795p4 f14099B;

    /* JADX INFO: renamed from: C */
    public static final C2795p4 f14100C;

    /* JADX INFO: renamed from: D */
    public static final C2795p4 f14101D;

    /* JADX INFO: renamed from: E */
    public static final C2795p4 f14102E;

    /* JADX INFO: renamed from: F */
    public static final C2795p4 f14103F;

    /* JADX INFO: renamed from: G */
    public static final C2795p4 f14104G;

    /* JADX INFO: renamed from: H */
    public static final C2795p4 f14105H;

    /* JADX INFO: renamed from: I */
    public static final C2795p4 f14106I;

    /* JADX INFO: renamed from: J */
    public static final C2795p4 f14107J;

    /* JADX INFO: renamed from: K */
    public static final C2834s4 f14108K;

    /* JADX INFO: renamed from: L */
    public static final C2795p4 f14109L;

    /* JADX INFO: renamed from: a */
    public static final C2795p4 f14110a;

    /* JADX INFO: renamed from: b */
    public static final C2795p4 f14111b;

    /* JADX INFO: renamed from: c */
    public static final C2795p4 f14112c;

    /* JADX INFO: renamed from: d */
    public static final C2795p4 f14113d;

    /* JADX INFO: renamed from: e */
    public static final C2834s4 f14114e;

    /* JADX INFO: renamed from: f */
    public static final C2834s4 f14115f;

    /* JADX INFO: renamed from: g */
    public static final C2795p4 f14116g;

    /* JADX INFO: renamed from: h */
    public static final C2795p4 f14117h;

    /* JADX INFO: renamed from: i */
    public static final C2795p4 f14118i;

    /* JADX INFO: renamed from: j */
    public static final C2795p4 f14119j;

    /* JADX INFO: renamed from: k */
    public static final C2795p4 f14120k;

    /* JADX INFO: renamed from: l */
    public static final C2795p4 f14121l;

    /* JADX INFO: renamed from: m */
    public static final C2795p4 f14122m;

    /* JADX INFO: renamed from: n */
    public static final C2795p4 f14123n;

    /* JADX INFO: renamed from: o */
    public static final C2795p4 f14124o;

    /* JADX INFO: renamed from: p */
    public static final C2795p4 f14125p;

    /* JADX INFO: renamed from: q */
    public static final C2795p4 f14126q;

    /* JADX INFO: renamed from: r */
    public static final C2795p4 f14127r;

    /* JADX INFO: renamed from: s */
    public static final C2795p4 f14128s;

    /* JADX INFO: renamed from: t */
    public static final C2795p4 f14129t;

    /* JADX INFO: renamed from: u */
    public static final C2795p4 f14130u;

    /* JADX INFO: renamed from: v */
    public static final C2795p4 f14131v;

    /* JADX INFO: renamed from: w */
    public static final C2795p4 f14132w;

    /* JADX INFO: renamed from: x */
    public static final C2795p4 f14133x;

    /* JADX INFO: renamed from: y */
    public static final C2795p4 f14134y;

    /* JADX INFO: renamed from: z */
    public static final C2795p4 f14135z;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        f14110a = c2847t4.m8257a("measurement.ad_id_cache_time", 10000L);
        f14111b = c2847t4.m8257a("measurement.app_uninstalled_additional_ad_id_cache_time", 0L);
        f14112c = c2847t4.m8257a("measurement.max_bundles_per_iteration", 100L);
        f14113d = c2847t4.m8257a("measurement.config.cache_time", 86400000L);
        c2847t4.m8258b("measurement.log_tag", "FA");
        f14114e = new C2834s4(c2847t4, "measurement.config.url_authority", "app-measurement.com");
        f14115f = new C2834s4(c2847t4, "measurement.config.url_scheme", "https");
        f14116g = c2847t4.m8257a("measurement.upload.debug_upload_interval", 1000L);
        c2847t4.m8257a("measurement.id.app_uninstalled_additional_ad_id_cache_time", 0L);
        f14117h = c2847t4.m8257a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f14118i = c2847t4.m8257a("measurement.store.max_stored_events_per_app", 100000L);
        f14119j = c2847t4.m8257a("measurement.experiment.max_ids", 50L);
        f14120k = c2847t4.m8257a("measurement.audience.filter_result_max_count", 200L);
        f14121l = c2847t4.m8257a("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f14122m = c2847t4.m8257a("measurement.alarm_manager.minimum_interval", 60000L);
        f14123n = c2847t4.m8257a("measurement.upload.minimum_delay", 500L);
        f14124o = c2847t4.m8257a("measurement.monitoring.sample_period_millis", 86400000L);
        f14125p = c2847t4.m8257a("measurement.upload.realtime_upload_interval", 10000L);
        f14126q = c2847t4.m8257a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        c2847t4.m8257a("measurement.config.cache_time.service", 3600000L);
        f14127r = c2847t4.m8257a("measurement.service_client.idle_disconnect_millis", 5000L);
        c2847t4.m8258b("measurement.log_tag.service", "FA-SVC");
        f14128s = c2847t4.m8257a("measurement.upload.stale_data_deletion_interval", 86400000L);
        f14129t = c2847t4.m8257a("measurement.sdk.attribution.cache.ttl", 604800000L);
        f14130u = c2847t4.m8257a("measurement.redaction.app_instance_id.ttl", 7200000L);
        f14131v = c2847t4.m8257a("measurement.upload.backoff_period", 43200000L);
        f14132w = c2847t4.m8257a("measurement.upload.initial_upload_delay_time", 15000L);
        f14133x = c2847t4.m8257a("measurement.upload.interval", 3600000L);
        f14134y = c2847t4.m8257a("measurement.upload.max_bundle_size", 65536L);
        f14135z = c2847t4.m8257a("measurement.upload.max_bundles", 100L);
        f14098A = c2847t4.m8257a("measurement.upload.max_conversions_per_day", 500L);
        f14099B = c2847t4.m8257a("measurement.upload.max_error_events_per_day", 1000L);
        f14100C = c2847t4.m8257a("measurement.upload.max_events_per_bundle", 1000L);
        f14101D = c2847t4.m8257a("measurement.upload.max_events_per_day", 100000L);
        f14102E = c2847t4.m8257a("measurement.upload.max_public_events_per_day", 50000L);
        f14103F = c2847t4.m8257a("measurement.upload.max_queue_time", 2419200000L);
        f14104G = c2847t4.m8257a("measurement.upload.max_realtime_events_per_day", 10L);
        f14105H = c2847t4.m8257a("measurement.upload.max_batch_size", 65536L);
        f14106I = c2847t4.m8257a("measurement.upload.retry_count", 6L);
        f14107J = c2847t4.m8257a("measurement.upload.retry_time", 1800000L);
        f14108K = new C2834s4(c2847t4, "measurement.upload.url", "https://app-measurement.com/a");
        f14109L = c2847t4.m8257a("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: A */
    public final long mo7702A() {
        return ((Long) f14101D.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: B */
    public final long mo7703B() {
        return ((Long) f14132w.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: C */
    public final long mo7704C() {
        return ((Long) f14124o.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: D */
    public final String mo7705D() {
        return (String) f14115f.m8330b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: E */
    public final long mo7706E() {
        return ((Long) f14133x.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: F */
    public final long mo7707F() {
        return ((Long) f14102E.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: G */
    public final long mo7708G() {
        return ((Long) f14107J.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: H */
    public final long mo7709H() {
        return ((Long) f14130u.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: I */
    public final long mo7710I() {
        return ((Long) f14109L.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: J */
    public final long mo7711J() {
        return ((Long) f14100C.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: K */
    public final long mo7712K() {
        return ((Long) f14131v.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: a */
    public final long mo7713a() {
        return ((Long) f14113d.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: b */
    public final long mo7714b() {
        return ((Long) f14116g.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: c */
    public final long mo7715c() {
        return ((Long) f14111b.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: d */
    public final long mo7716d() {
        return ((Long) f14112c.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: e */
    public final long mo7717e() {
        return ((Long) f14119j.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: f */
    public final long mo7718f() {
        return ((Long) f14120k.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: g */
    public final long mo7719g() {
        return ((Long) f14117h.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: h */
    public final long mo7720h() {
        return ((Long) f14121l.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: i */
    public final long mo7721i() {
        return ((Long) f14118i.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: j */
    public final long mo7722j() {
        return ((Long) f14122m.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: k */
    public final long mo7723k() {
        return ((Long) f14127r.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: l */
    public final long mo7724l() {
        return ((Long) f14123n.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: m */
    public final long mo7725m() {
        return ((Long) f14105H.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: n */
    public final long mo7726n() {
        return ((Long) f14098A.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: o */
    public final long mo7727o() {
        return ((Long) f14128s.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: p */
    public final long mo7728p() {
        return ((Long) f14099B.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: q */
    public final long mo7729q() {
        return ((Long) f14106I.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: r */
    public final long mo7730r() {
        return ((Long) f14129t.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: s */
    public final long mo7731s() {
        return ((Long) f14125p.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: t */
    public final String mo7732t() {
        return (String) f14108K.m8330b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: u */
    public final long mo7733u() {
        return ((Long) f14134y.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: v */
    public final long mo7734v() {
        return ((Long) f14103F.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: w */
    public final long mo7735w() {
        return ((Long) f14126q.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: x */
    public final long mo7736x() {
        return ((Long) f14104G.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: y */
    public final long mo7737y() {
        return ((Long) f14135z.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    /* JADX INFO: renamed from: z */
    public final String mo7738z() {
        return (String) f14114e.m8330b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2606b9
    public final long zza() {
        return ((Long) f14110a.m8330b()).longValue();
    }
}
