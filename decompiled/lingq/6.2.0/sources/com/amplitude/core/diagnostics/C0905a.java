package com.amplitude.core.diagnostics;

import android.content.Context;
import android.os.Build;
import com.amplitude.core.ServerZone;
import com.amplitude.core.remoteconfig.C0912a;
import com.amplitude.core.remoteconfig.RemoteConfigClient$Key;
import com.amplitude.core.utilities.http.HttpClient$Request$Method;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.channels.C3211a;
import p000.C0825bv;
import p000.C2926df;
import p000.C3722wh;
import p000.bl2;
import p000.dd2;
import p000.do7;
import p000.ed2;
import p000.eh0;
import p000.fd2;
import p000.gd2;
import p000.hd2;
import p000.id2;
import p000.jd2;
import p000.kd2;
import p000.l70;
import p000.md2;
import p000.nd2;
import p000.nn1;
import p000.od2;
import p000.pj5;
import p000.rd2;
import p000.s50;
import p000.sd2;
import p000.u91;
import p000.un1;
import p000.vw3;
import p000.wfb;
import p000.ww3;
import p000.xt3;
import p000.yt3;

/* JADX INFO: renamed from: com.amplitude.core.diagnostics.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0905a {

    /* JADX INFO: renamed from: a */
    public final String f11051a;

    /* JADX INFO: renamed from: b */
    public final ServerZone f11052b;

    /* JADX INFO: renamed from: c */
    public final pj5 f11053c;

    /* JADX INFO: renamed from: d */
    public final un1 f11054d;

    /* JADX INFO: renamed from: e */
    public final nn1 f11055e;

    /* JADX INFO: renamed from: f */
    public final nn1 f11056f;

    /* JADX INFO: renamed from: g */
    public final bl2 f11057g;

    /* JADX INFO: renamed from: h */
    public final C3722wh f11058h;

    /* JADX INFO: renamed from: i */
    public boolean f11059i;

    /* JADX INFO: renamed from: j */
    public final C0906b f11060j;

    /* JADX INFO: renamed from: k */
    public final String f11061k;

    /* JADX INFO: renamed from: l */
    public double f11062l;

    /* JADX INFO: renamed from: m */
    public boolean f11063m;

    /* JADX INFO: renamed from: n */
    public boolean f11064n;

    /* JADX INFO: renamed from: o */
    public boolean f11065o;

    /* JADX INFO: renamed from: p */
    public Long f11066p;

    /* JADX INFO: renamed from: q */
    public Long f11067q;

    /* JADX INFO: renamed from: r */
    public final C3211a f11068r;

    /* JADX INFO: renamed from: s */
    public final dd2 f11069s;

    public C0905a(String str, ServerZone serverZone, String str2, File file, pj5 pj5Var, un1 un1Var, nn1 nn1Var, nn1 nn1Var2, C0912a c0912a, bl2 bl2Var, C3722wh c3722wh, boolean z) {
        serverZone.getClass();
        str2.getClass();
        pj5Var.getClass();
        this.f11051a = str;
        this.f11052b = serverZone;
        this.f11053c = pj5Var;
        this.f11054d = un1Var;
        this.f11055e = nn1Var;
        this.f11056f = nn1Var2;
        this.f11057g = bl2Var;
        this.f11058h = c3722wh;
        this.f11059i = z;
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000.0d);
        this.f11061k = strValueOf;
        double dM15943f = l70.m15943f(0.0d, 0.0d, 1.0d);
        this.f11062l = dM15943f;
        int i = 1;
        this.f11063m = this.f11059i && eh0.m11104A(dM15943f, strValueOf);
        C3211a c3211aM10525a = do7.m10525a(Integer.MAX_VALUE, 6, null);
        this.f11068r = c3211aM10525a;
        this.f11069s = new dd2();
        s50 s50Var = c0912a != null ? new s50(this, i) : null;
        wfb.m23926u(un1Var, null, null, new DiagnosticsClientImpl$actorJob$1(this, null), 3);
        this.f11060j = new C0906b(file, str2, strValueOf, pj5Var, un1Var, nn1Var2);
        if (s50Var != null && c0912a != null) {
            c0912a.m5152f(RemoteConfigClient$Key.DIAGNOSTICS, s50Var);
        }
        c3211aM10525a.mo4677k(gd2.f40564a);
        try {
            Runtime.getRuntime().addShutdownHook(new C2926df(new WeakReference(this), i));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m5118a(C0905a c0905a) {
        LinkedHashMap linkedHashMap;
        C0906b c0906b = c0905a.f11060j;
        dd2 dd2Var = c0905a.f11069s;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = c0905a.f11067q;
        boolean z = l != null && l.longValue() <= jCurrentTimeMillis;
        Long l2 = c0905a.f11066p;
        boolean z2 = l2 != null ? l2.longValue() <= jCurrentTimeMillis : false;
        if (z) {
            c0905a.f11067q = null;
            if (c0905a.f11063m) {
                LinkedHashMap linkedHashMap2 = dd2Var.f35422b;
                C0825bv c0825bv = dd2Var.f35424d;
                LinkedHashMap linkedHashMap3 = dd2Var.f35423c;
                if (!linkedHashMap2.isEmpty() || !linkedHashMap3.isEmpty() || !c0825bv.isEmpty()) {
                    LinkedHashMap linkedHashMap4 = dd2Var.f35422b;
                    LinkedHashMap linkedHashMap5 = dd2Var.f35421a;
                    Map mapM15371X = !linkedHashMap5.isEmpty() ? AbstractC3194a.m15371X(linkedHashMap5) : null;
                    Map mapM15371X2 = !linkedHashMap4.isEmpty() ? AbstractC3194a.m15371X(linkedHashMap4) : null;
                    if (linkedHashMap3.isEmpty()) {
                        linkedHashMap = null;
                    } else {
                        linkedHashMap = new LinkedHashMap(AbstractC3194a.m15363P(linkedHashMap3.size()));
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            linkedHashMap.put(entry.getKey(), ((yt3) entry.getValue()).m25315a());
                        }
                    }
                    od2 od2Var = new od2(mapM15371X, mapM15371X2, linkedHashMap, !c0825bv.isEmpty() ? u91.m22622n1(c0825bv) : null);
                    linkedHashMap4.clear();
                    linkedHashMap3.clear();
                    c0825bv.clear();
                    dd2Var.f35425e.clear();
                    dd2Var.f35427g = false;
                    dd2Var.f35426f = false;
                    c0906b.f11076g.mo4677k(rd2.f59102a);
                    wfb.m23926u(c0905a.f11054d, c0905a.f11055e, null, new DiagnosticsClientImpl$flushActiveBuffer$1(c0905a, od2Var, c0905a.f11062l, null), 2);
                }
            }
        }
        if (z2) {
            c0905a.f11066p = null;
            if (c0905a.f11063m) {
                boolean z3 = dd2Var.f35426f;
                C0825bv c0825bv2 = dd2Var.f35425e;
                if (z3 || dd2Var.f35427g || !c0825bv2.isEmpty()) {
                    od2 od2Var2 = new od2(dd2Var.f35426f ? AbstractC3194a.m15371X(dd2Var.f35421a) : null, dd2Var.f35427g ? AbstractC3194a.m15371X(dd2Var.f35422b) : null, null, !c0825bv2.isEmpty() ? u91.m22622n1(c0825bv2) : null);
                    c0825bv2.clear();
                    dd2Var.f35426f = false;
                    dd2Var.f35427g = false;
                    c0906b.getClass();
                    c0906b.f11076g.mo4677k(new sd2(od2Var2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5119b(C0905a c0905a, kd2 kd2Var) {
        C3211a c3211a = c0905a.f11068r;
        dd2 dd2Var = c0905a.f11069s;
        if (kd2Var instanceof hd2) {
            hd2 hd2Var = (hd2) kd2Var;
            dd2Var.f35421a.put(hd2Var.f42207a, hd2Var.f42208b);
            dd2Var.f35426f = true;
            c0905a.m5123f();
            c0905a.m5122e();
            return;
        }
        if (kd2Var instanceof id2) {
            dd2Var.f35421a.putAll(((id2) kd2Var).f43958a);
            dd2Var.f35426f = true;
            c0905a.m5123f();
            c0905a.m5122e();
            return;
        }
        if (kd2Var instanceof fd2) {
            LinkedHashMap linkedHashMap = dd2Var.f35422b;
            fd2 fd2Var = (fd2) kd2Var;
            String str = fd2Var.f38883a;
            Long l = (Long) linkedHashMap.get(str);
            linkedHashMap.put(str, Long.valueOf((l != null ? l.longValue() : 0L) + fd2Var.f38884b));
            dd2Var.f35427g = true;
            c0905a.m5123f();
            c0905a.m5122e();
            return;
        }
        if (kd2Var instanceof ed2) {
            C0825bv c0825bv = dd2Var.f35424d;
            if (c0825bv.f9041c < 10) {
                md2 md2Var = ((ed2) kd2Var).f37040a;
                c0825bv.addLast(md2Var);
                dd2Var.f35425e.addLast(md2Var);
                c0905a.m5123f();
                c0905a.m5122e();
                return;
            }
            return;
        }
        String str2 = null;
        if (kd2Var instanceof jd2) {
            boolean z = c0905a.f11059i;
            boolean z2 = c0905a.f11063m;
            jd2 jd2Var = (jd2) kd2Var;
            Boolean bool = jd2Var.f45437a;
            c0905a.f11059i = bool != null ? bool.booleanValue() : z;
            Double d = jd2Var.f45438b;
            double dM15943f = d != null ? l70.m15943f(d.doubleValue(), 0.0d, 1.0d) : c0905a.f11062l;
            c0905a.f11062l = dM15943f;
            c0905a.f11063m = c0905a.f11059i && eh0.m11104A(dM15943f, c0905a.f11061k);
            if (!z && c0905a.f11059i) {
                c0905a.m5124g();
            }
            if (!z2 && c0905a.f11063m) {
                c0905a.m5123f();
                c0905a.m5122e();
                return;
            } else {
                if (!z2 || c0905a.f11063m) {
                    return;
                }
                c0905a.f11066p = null;
                c0905a.f11067q = null;
                return;
            }
        }
        if (kd2Var instanceof gd2) {
            c0905a.m5124g();
            if (c0905a.f11064n) {
                return;
            }
            c0905a.f11064n = true;
            if (c0905a.f11063m) {
                c3211a.mo4677k(new fd2("sampled.in.and.enabled", 1L));
            }
            C3722wh c3722wh = c0905a.f11058h;
            Build.MANUFACTURER.getClass();
            Build.MODEL.getClass();
            Build.VERSION.RELEASE.getClass();
            Context context = c3722wh.f66813a;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused) {
            }
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            String str5 = Build.VERSION.RELEASE;
            str3.getClass();
            str4.getClass();
            str5.getClass();
            MapBuilder mapBuilder = new MapBuilder();
            if (str2 == null) {
                str2 = "";
            }
            mapBuilder.put("version_name", str2);
            String str6 = Build.MANUFACTURER;
            if (str6 == null) {
                str6 = "";
            }
            mapBuilder.put("device_manufacturer", str6);
            String str7 = Build.MODEL;
            if (str7 == null) {
                str7 = "";
            }
            mapBuilder.put("device_model", str7);
            mapBuilder.put("os_name", "Android");
            String str8 = Build.VERSION.RELEASE;
            mapBuilder.put("os_version", str8 != null ? str8 : "");
            mapBuilder.put("platform", "Android");
            mapBuilder.put("sdk.amplitude-kotlin.version", "0.0.1");
            c3211a.mo4677k(new id2(mapBuilder.m15392b()));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Long m5120c(C0905a c0905a, long j) {
        Long l = c0905a.f11066p;
        Long lValueOf = l != null ? Long.valueOf(Math.max(0L, l.longValue() - j)) : null;
        Long l2 = c0905a.f11067q;
        Long lValueOf2 = l2 != null ? Long.valueOf(Math.max(0L, l2.longValue() - j)) : null;
        if (lValueOf == null && lValueOf2 == null) {
            return null;
        }
        if (lValueOf == null) {
            return lValueOf2;
        }
        return lValueOf2 == null ? lValueOf : Long.valueOf(Math.min(lValueOf.longValue(), lValueOf2.longValue()));
    }

    /* JADX INFO: renamed from: d */
    public static final void m5121d(C0905a c0905a, od2 od2Var, double d) {
        LinkedHashMap linkedHashMap;
        pj5 pj5Var = c0905a.f11053c;
        Map map = od2Var.f54199a;
        Map map2 = od2Var.f54200b;
        Map map3 = od2Var.f54201c;
        if (map3 != null) {
            linkedHashMap = new LinkedHashMap(AbstractC3194a.m15363P(map3.size()));
            for (Map.Entry entry : map3.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((xt3) entry.getValue()).m24673b());
            }
        } else {
            linkedHashMap = null;
        }
        try {
            String strM17376a = new nd2(map, map2, linkedHashMap, od2Var.f54202d).m17376a();
            ww3 ww3VarM3834O = c0905a.f11057g.m3834O(new vw3(c0905a.f11052b == ServerZone.EU ? "https://diagnostics.prod.eu-central-1.amplitude.com/v1/capture" : "https://diagnostics.prod.us-west-2.amplitude.com/v1/capture", HttpClient$Request$Method.POST, AbstractC3194a.m15365R(new Pair("X-ApiKey", c0905a.f11051a), new Pair("X-Client-Sample-Rate", String.valueOf(d))), strM17376a, false, 112));
            int i = ww3VarM3834O.f67408a;
            boolean z = false;
            if (200 <= i && i < 300) {
                z = true;
            }
            if (z) {
                pj5Var.mo16256b("DiagnosticsClient: Uploaded diagnostics : " + strM17376a);
                return;
            }
            String str = ww3VarM3834O.f67409b;
            if (str != null && str.length() != 0) {
                pj5Var.mo16255a("DiagnosticsClient: Failed to upload diagnostics: " + i + ": " + str);
                return;
            }
            pj5Var.mo16255a("DiagnosticsClient: Failed to upload diagnostics: " + i);
        } catch (Exception e) {
            pj5Var.mo16255a("DiagnosticsClient: Failed to upload diagnostics: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5122e() {
        if (this.f11063m && this.f11067q == null) {
            this.f11067q = Long.valueOf(System.currentTimeMillis() + 300000);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5123f() {
        if (this.f11063m && this.f11066p == null) {
            this.f11066p = Long.valueOf(System.currentTimeMillis() + 1000);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5124g() {
        if (!this.f11059i || this.f11065o) {
            return;
        }
        this.f11065o = true;
        wfb.m23926u(this.f11054d, this.f11056f, null, new DiagnosticsClientImpl$flushPreviousSessions$1(this, this.f11062l, null), 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m5125h(String str, String str2) {
        str2.getClass();
        this.f11068r.mo4677k(new hd2(str, str2));
    }
}
