package cc;

import ae.C0062b;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.C2734kb;
import com.google.android.gms.internal.measurement.C2891w9;
import com.google.android.gms.internal.measurement.InterfaceC2904x9;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p041c5.C1702c;
import p115fb.RunnableC5494j;
import p176ib.C6272i;
import p260m8.C7499b;
import p289o5.C7940t;
import p289o5.RunnableC7933m;
import p289o5.RunnableC7943w;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.s5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1934s5 extends AbstractC1914q3 {

    /* JADX INFO: renamed from: H */
    public int f10185H;

    /* JADX INFO: renamed from: I */
    public final C1936s7 f10186I;

    /* JADX INFO: renamed from: J */
    public boolean f10187J;

    /* JADX INFO: renamed from: K */
    public final C1995z4 f10188K;

    /* JADX INFO: renamed from: c */
    public C1925r5 f10189c;

    /* JADX INFO: renamed from: d */
    public C7940t f10190d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArraySet f10191e;

    /* JADX INFO: renamed from: f */
    public boolean f10192f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f10193g;

    /* JADX INFO: renamed from: h */
    public final Object f10194h;

    /* JADX INFO: renamed from: i */
    public C1811f f10195i;

    /* JADX INFO: renamed from: j */
    public int f10196j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f10197k;

    /* JADX INFO: renamed from: l */
    public long f10198l;

    public C1934s5(C1897o4 c1897o4) {
        super(c1897o4);
        this.f10191e = new CopyOnWriteArraySet();
        this.f10194h = new Object();
        this.f10187J = true;
        this.f10188K = new C1995z4(this);
        this.f10193g = new AtomicReference();
        this.f10195i = new C1811f(null, null);
        this.f10196j = 100;
        this.f10198l = -1L;
        this.f10185H = 100;
        this.f10197k = new AtomicLong(0L);
        this.f10186I = new C1936s7(c1897o4);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m5864B(C1934s5 c1934s5, C1811f c1811f, C1811f c1811f2) {
        boolean z10;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z10 = false;
                break;
            }
            zzah zzahVar = zzahVarArr[i10];
            if (!c1811f2.m5597f(zzahVar) && c1811f.m5597f(zzahVar)) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean zM5598g = c1811f.m5598g(c1811f2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z10 || zM5598g) {
            ((C1897o4) c1934s5.f10430a).m5785p().m5532o();
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m5865C(C1934s5 c1934s5, C1811f c1811f, int i10, long j10, boolean z10, boolean z11) {
        c1934s5.mo5748g();
        c1934s5.m5851h();
        long j11 = c1934s5.f10198l;
        InterfaceC1781b5 interfaceC1781b5 = c1934s5.f10430a;
        if (j10 <= j11) {
            int i11 = c1934s5.f10185H;
            C1811f c1811f2 = C1811f.f9788b;
            if (i11 <= i10) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9948l.m5624b(c1811f, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        C1986y3 c1986y3 = c1897o4.f10085h;
        C1897o4.m5774i(c1986y3);
        c1986y3.mo5748g();
        if (!c1986y3.m5924s(i10)) {
            C1860k3 c1860k4 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9948l.m5624b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c1986y3.m5917l().edit();
        editorEdit.putString("consent_settings", c1811f.m5596e());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        c1934s5.f10198l = j10;
        c1934s5.f10185H = i10;
        C1881m6 c1881m6M5788t = c1897o4.m5788t();
        c1881m6M5788t.mo5748g();
        c1881m6M5788t.m5851h();
        if (z10) {
            InterfaceC1781b5 interfaceC1781b6 = c1881m6M5788t.f10430a;
            ((C1897o4) interfaceC1781b6).getClass();
            ((C1897o4) interfaceC1781b6).m5786q().m5588m();
        }
        if (c1881m6M5788t.m5761o()) {
            c1881m6M5788t.m5766t(new RunnableC7933m(c1881m6M5788t, c1881m6M5788t.m5763q(false), 5));
        }
        if (z11) {
            c1897o4.m5788t().m5769x(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: A */
    public final String m5866A() {
        return (String) this.f10193g.get();
    }

    /* JADX INFO: renamed from: D */
    public final void m5867D() {
        mo5748g();
        m5851h();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        if (c1897o4.m5780h()) {
            if (c1897o4.f10084g.m5582q(null, C1985y2.f10338Z)) {
                C1802e c1802e = c1897o4.f10084g;
                ((C1897o4) c1802e.f10430a).getClass();
                Boolean boolM5581p = c1802e.m5581p("google_analytics_deferred_deep_link_enabled");
                if (boolM5581p != null && boolM5581p.booleanValue()) {
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9937H.m5623a("Deferred Deep Link feature enabled.");
                    C1879m4 c1879m4 = c1897o4.f10087j;
                    C1897o4.m5776k(c1879m4);
                    c1879m4.m5753p(new Runnable() { // from class: cc.h5
                        @Override // java.lang.Runnable
                        public final void run() {
                            Pair pair;
                            NetworkInfo activeNetworkInfo;
                            URL url;
                            C1934s5 c1934s5 = this.f9849a;
                            c1934s5.mo5748g();
                            C1897o4 c1897o5 = (C1897o4) c1934s5.f10430a;
                            C1986y3 c1986y3 = c1897o5.f10085h;
                            C1897o4.m5774i(c1986y3);
                            if (c1986y3.f10395M.m5890b()) {
                                C1860k3 c1860k4 = c1897o5.f10086i;
                                C1897o4.m5776k(c1860k4);
                                c1860k4.f9937H.m5623a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            C1986y3 c1986y4 = c1897o5.f10085h;
                            C1897o4.m5774i(c1986y4);
                            long jM5897a = c1986y4.f10396N.m5897a();
                            C1986y3 c1986y5 = c1897o5.f10085h;
                            C1897o4.m5774i(c1986y5);
                            c1986y5.f10396N.m5898b(1 + jM5897a);
                            c1897o5.getClass();
                            if (jM5897a >= 5) {
                                C1860k3 c1860k5 = c1897o5.f10086i;
                                C1897o4.m5776k(c1860k5);
                                c1860k5.f9945i.m5623a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                C1986y3 c1986y6 = c1897o5.f10085h;
                                C1897o4.m5774i(c1986y6);
                                c1986y6.f10395M.m5889a(true);
                                return;
                            }
                            C1879m4 c1879m5 = c1897o5.f10087j;
                            C1897o4.m5776k(c1879m5);
                            c1879m5.mo5748g();
                            C1970w5 c1970w5 = c1897o5.f10062M;
                            C1897o4.m5776k(c1970w5);
                            C1897o4.m5776k(c1970w5);
                            String strM5530m = c1897o5.m5785p().m5530m();
                            C1986y3 c1986y7 = c1897o5.f10085h;
                            C1897o4.m5774i(c1986y7);
                            c1986y7.mo5748g();
                            InterfaceC1781b5 interfaceC1781b5 = c1986y7.f10430a;
                            C1897o4 c1897o6 = (C1897o4) interfaceC1781b5;
                            c1897o6.f10058I.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            String str = c1986y7.f10405g;
                            if (str == null || jElapsedRealtime >= c1986y7.f10407i) {
                                c1986y7.f10407i = c1897o6.f10084g.m5579n(strM5530m, C1985y2.f10343c) + jElapsedRealtime;
                                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                                try {
                                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(((C1897o4) interfaceC1781b5).f10076a);
                                    c1986y7.f10405g = "";
                                    String id2 = advertisingIdInfo.getId();
                                    if (id2 != null) {
                                        c1986y7.f10405g = id2;
                                    }
                                    c1986y7.f10406h = advertisingIdInfo.isLimitAdTrackingEnabled();
                                } catch (Exception e10) {
                                    C1860k3 c1860k6 = c1897o6.f10086i;
                                    C1897o4.m5776k(c1860k6);
                                    c1860k6.f9937H.m5624b(e10, "Unable to get advertising id");
                                    c1986y7.f10405g = "";
                                }
                                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                                pair = new Pair(c1986y7.f10405g, Boolean.valueOf(c1986y7.f10406h));
                            } else {
                                pair = new Pair(str, Boolean.valueOf(c1986y7.f10406h));
                            }
                            Boolean boolM5581p2 = c1897o5.f10084g.m5581p("google_analytics_adid_collection_enabled");
                            boolean z10 = boolM5581p2 == null || boolM5581p2.booleanValue();
                            C1860k3 c1860k7 = c1897o5.f10086i;
                            if (!z10 || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                                C1897o4.m5776k(c1860k7);
                                c1860k7.f9937H.m5623a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                                return;
                            }
                            C1897o4.m5776k(c1970w5);
                            c1970w5.m5492j();
                            C1897o4 c1897o7 = (C1897o4) c1970w5.f10430a;
                            ConnectivityManager connectivityManager = (ConnectivityManager) c1897o7.f10076a.getSystemService("connectivity");
                            if (connectivityManager != null) {
                                try {
                                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                } catch (SecurityException unused) {
                                    activeNetworkInfo = null;
                                }
                            } else {
                                activeNetworkInfo = null;
                            }
                            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                C1897o4.m5776k(c1860k7);
                                c1860k7.f9945i.m5623a("Network is not available for Deferred Deep Link request. Skipping");
                                return;
                            }
                            C1900o7 c1900o7 = c1897o5.f10089l;
                            C1897o4.m5774i(c1900o7);
                            ((C1897o4) c1897o5.m5785p().f10430a).f10084g.m5578m();
                            String str2 = (String) pair.first;
                            long jM5897a2 = c1986y7.f10396N.m5897a() - 1;
                            InterfaceC1781b5 interfaceC1781b6 = c1900o7.f10430a;
                            try {
                                C6272i.m12912f(str2);
                                C6272i.m12912f(strM5530m);
                                String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 76003L, Integer.valueOf(c1900o7.m5832j0())), str2, strM5530m, Long.valueOf(jM5897a2));
                                if (strM5530m.equals(((C1897o4) interfaceC1781b6).f10084g.m5574h("debug.deferred.deeplink"))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                url = new URL(strConcat);
                            } catch (IllegalArgumentException | MalformedURLException e11) {
                                C1860k3 c1860k8 = ((C1897o4) interfaceC1781b6).f10086i;
                                C1897o4.m5776k(c1860k8);
                                c1860k8.f9942f.m5624b(e11.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                url = null;
                            }
                            if (url != null) {
                                C1897o4.m5776k(c1970w5);
                                C1702c c1702c = new C1702c(c1897o5);
                                c1970w5.mo5748g();
                                c1970w5.m5492j();
                                C1879m4 c1879m6 = c1897o7.f10087j;
                                C1897o4.m5776k(c1879m6);
                                c1879m6.m5752o(new RunnableC1961v5(c1970w5, strM5530m, url, c1702c));
                            }
                        }
                    });
                }
            }
            C1881m6 c1881m6M5788t = c1897o4.m5788t();
            c1881m6M5788t.mo5748g();
            c1881m6M5788t.m5851h();
            zzq zzqVarM5763q = c1881m6M5788t.m5763q(true);
            ((C1897o4) c1881m6M5788t.f10430a).m5786q().m5590o(new byte[0], 3);
            c1881m6M5788t.m5766t(new RunnableC1865l(c1881m6M5788t, 2, zzqVarM5763q));
            this.f10187J = false;
            C1986y3 c1986y3 = c1897o4.f10085h;
            C1897o4.m5774i(c1986y3);
            c1986y3.mo5748g();
            String string = c1986y3.m5917l().getString("previous_os_version", null);
            ((C1897o4) c1986y3.f10430a).m5784o().m5492j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c1986y3.m5917l().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1897o4.m5784o().m5492j();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m5871o("auto", "_ou", bundle);
        }
    }

    @Override // cc.AbstractC1914q3
    /* JADX INFO: renamed from: k */
    public final boolean mo5519k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m5868l(String str, String str2, Bundle bundle) {
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        c1897o4.f10058I.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6272i.m12912f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC5494j(this, bundle2, 3));
    }

    /* JADX INFO: renamed from: m */
    public final void m5869m() {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if ((((C1897o4) interfaceC1781b5).f10076a.getApplicationContext() instanceof Application) && this.f10189c != null) {
            ((Application) ((C1897o4) interfaceC1781b5).f10076a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10189c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
    
        if (r5 > 100) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0132, code lost:
    
        if (r6 > 100) goto L70;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5870n(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String strM5523o;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z12 = !z11 || this.f10190d == null || C1900o7.m5792V(str2);
            String str3 = str == null ? "app" : str;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            C1879m4 c1879m4 = ((C1897o4) this.f10430a).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC1853j5(this, str3, str2, j10, bundle3, z11, z12, z10));
            return;
        }
        C1782b6 c1782b6 = ((C1897o4) this.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        synchronized (c1782b6.f9694l) {
            try {
                if (!c1782b6.f9693k) {
                    C1860k3 c1860k3 = ((C1897o4) c1782b6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9947k.m5623a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((C1897o4) c1782b6.f10430a).getClass();
                    }
                    C1860k3 c1860k4 = ((C1897o4) c1782b6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9947k.m5624b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((C1897o4) c1782b6.f10430a).getClass();
                    }
                    C1860k3 c1860k5 = ((C1897o4) c1782b6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9947k.m5624b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = c1782b6.f9689g;
                    strM5523o = activity != null ? c1782b6.m5523o(activity.getClass()) : "Activity";
                } else {
                    strM5523o = string2;
                }
                C1988y5 c1988y5 = c1782b6.f9685c;
                if (c1782b6.f9690h && c1988y5 != null) {
                    c1782b6.f9690h = false;
                    boolean zM14913K0 = C7499b.m14913K0(c1988y5.f10415b, strM5523o);
                    boolean zM14913K1 = C7499b.m14913K0(c1988y5.f10414a, string);
                    if (zM14913K0 && zM14913K1) {
                        C1860k3 c1860k6 = ((C1897o4) c1782b6.f10430a).f10086i;
                        C1897o4.m5776k(c1860k6);
                        c1860k6.f9947k.m5623a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C1860k3 c1860k7 = ((C1897o4) c1782b6.f10430a).f10086i;
                C1897o4.m5776k(c1860k7);
                c1860k7.f9938I.m5625c(string == null ? "null" : string, strM5523o == null ? "null" : strM5523o, "Logging screen view with name, class");
                C1988y5 c1988y6 = c1782b6.f9685c == null ? c1782b6.f9686d : c1782b6.f9685c;
                C1900o7 c1900o7 = ((C1897o4) c1782b6.f10430a).f10089l;
                C1897o4.m5774i(c1900o7);
                C1988y5 c1988y7 = new C1988y5(string, strM5523o, c1900o7.m5834l0(), true, j10);
                c1782b6.f9685c = c1988y7;
                c1782b6.f9686d = c1988y6;
                c1782b6.f9691i = c1988y7;
                ((C1897o4) c1782b6.f10430a).f10058I.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C1879m4 c1879m5 = ((C1897o4) c1782b6.f10430a).f10087j;
                C1897o4.m5776k(c1879m5);
                c1879m5.m5753p(new RunnableC1862k5(c1782b6, bundle2, c1988y7, c1988y6, jElapsedRealtime, 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5871o(String str, String str2, Bundle bundle) {
        mo5748g();
        ((C1897o4) this.f10430a).f10058I.getClass();
        m5872p(System.currentTimeMillis(), bundle, str, str2);
    }

    /* JADX INFO: renamed from: p */
    public final void m5872p(long j10, Bundle bundle, String str, String str2) {
        mo5748g();
        m5873q(str, str2, j10, bundle, true, this.f10190d == null || C1900o7.m5792V(str2), true, null);
    }

    /* JADX WARN: Failed to calculate best type for var: r1v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v8 ??, new type: cc.b6
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v0 ??, new type: cc.b6
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v13 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v27 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v54 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v54 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v0 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v23 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: q */
    public final void m5873q(java.lang.String r22, java.lang.String r23, long r24, android.os.Bundle r26, boolean r27, boolean r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C1934s5.m5873q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* JADX INFO: renamed from: r */
    public final void m5874r(boolean z10, long j10) {
        mo5748g();
        m5851h();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1860k3 c1860k3 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9937H.m5623a("Resetting analytics data (FE)");
        C1971w6 c1971w6 = c1897o4.f10088k;
        C1897o4.m5775j(c1971w6);
        c1971w6.mo5748g();
        C1953u6 c1953u6 = c1971w6.f10279e;
        c1953u6.f10244c.m5745a();
        c1953u6.f10242a = 0L;
        c1953u6.f10243b = 0L;
        C2734kb.m7924a();
        if (c1897o4.f10084g.m5582q(null, C1985y2.f10360k0)) {
            c1897o4.m5785p().m5532o();
        }
        boolean zM5779g = c1897o4.m5779g();
        C1986y3 c1986y3 = c1897o4.f10085h;
        C1897o4.m5774i(c1986y3);
        c1986y3.f10403e.m5898b(j10);
        C1897o4 c1897o5 = (C1897o4) c1986y3.f10430a;
        C1986y3 c1986y4 = c1897o5.f10085h;
        C1897o4.m5774i(c1986y4);
        if (!TextUtils.isEmpty(c1986y4.f10397O.m5913a())) {
            c1986y3.f10397O.m5914b(null);
        }
        C2891w9 c2891w9 = C2891w9.f14500b;
        ((InterfaceC2904x9) c2891w9.f14501a.zza()).zza();
        C1802e c1802e = c1897o5.f10084g;
        C1976x2 c1976x2 = C1985y2.f10350f0;
        if (c1802e.m5582q(null, c1976x2)) {
            c1986y3.f10391I.m5898b(0L);
        }
        c1986y3.f10392J.m5898b(0L);
        if (!c1897o5.f10084g.m5584s()) {
            c1986y3.m5922q(!zM5779g);
        }
        c1986y3.f10398P.m5914b(null);
        c1986y3.f10399Q.m5898b(0L);
        c1986y3.f10400R.m5894b(null);
        if (z10) {
            C1881m6 c1881m6M5788t = c1897o4.m5788t();
            c1881m6M5788t.mo5748g();
            c1881m6M5788t.m5851h();
            zzq zzqVarM5763q = c1881m6M5788t.m5763q(false);
            InterfaceC1781b5 interfaceC1781b5 = c1881m6M5788t.f10430a;
            ((C1897o4) interfaceC1781b5).getClass();
            ((C1897o4) interfaceC1781b5).m5786q().m5588m();
            c1881m6M5788t.m5766t(new RunnableC1888n4(c1881m6M5788t, 3, zzqVarM5763q));
        }
        ((InterfaceC2904x9) c2891w9.f14501a.zza()).zza();
        if (c1897o4.f10084g.m5582q(null, c1976x2)) {
            C1971w6 c1971w7 = c1897o4.f10088k;
            C1897o4.m5775j(c1971w7);
            c1971w7.f10278d.m5900a();
        }
        this.f10187J = !zM5779g;
    }

    /* JADX INFO: renamed from: s */
    public final void m5875s(Bundle bundle, long j10) {
        C6272i.m12915i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (!zIsEmpty) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5623a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C0062b.m263E2(bundle2, "app_id", String.class, null);
        C0062b.m263E2(bundle2, "origin", String.class, null);
        C0062b.m263E2(bundle2, "name", String.class, null);
        C0062b.m263E2(bundle2, "value", Object.class, null);
        C0062b.m263E2(bundle2, "trigger_event_name", String.class, null);
        C0062b.m263E2(bundle2, "trigger_timeout", Long.class, 0L);
        C0062b.m263E2(bundle2, "timed_out_event_name", String.class, null);
        C0062b.m263E2(bundle2, "timed_out_event_params", Bundle.class, null);
        C0062b.m263E2(bundle2, "triggered_event_name", String.class, null);
        C0062b.m263E2(bundle2, "triggered_event_params", Bundle.class, null);
        C0062b.m263E2(bundle2, "time_to_live", Long.class, 0L);
        C0062b.m263E2(bundle2, "expired_event_name", String.class, null);
        C0062b.m263E2(bundle2, "expired_event_params", Bundle.class, null);
        C6272i.m12912f(bundle2.getString("name"));
        C6272i.m12912f(bundle2.getString("origin"));
        C6272i.m12915i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        C1900o7 c1900o7 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o7);
        if (c1900o7.m5831i0(string) != 0) {
            C1860k3 c1860k4 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5624b(c1897o4.f10057H.m5605f(string), "Invalid conditional user property name");
            return;
        }
        C1900o7 c1900o8 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o8);
        if (c1900o8.m5827e0(obj, string) != 0) {
            C1860k3 c1860k5 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9942f.m5625c(c1897o4.f10057H.m5605f(string), obj, "Invalid conditional user property value");
            return;
        }
        C1900o7 c1900o9 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o9);
        Object objM5835m = c1900o9.m5835m(obj, string);
        if (objM5835m == null) {
            C1860k3 c1860k6 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9942f.m5625c(c1897o4.f10057H.m5605f(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        C0062b.m275H2(bundle2, objM5835m);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c1897o4.getClass();
            if (j11 > 15552000000L || j11 < 1) {
                C1860k3 c1860k7 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k7);
                c1860k7.f9942f.m5625c(c1897o4.f10057H.m5605f(string), Long.valueOf(j11), "Invalid conditional user property timeout");
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        c1897o4.getClass();
        if (j12 <= 15552000000L && j12 >= 1) {
            C1879m4 c1879m4 = c1897o4.f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC1826g5(this, bundle2, 1));
        } else {
            C1860k3 c1860k8 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k8);
            c1860k8.f9942f.m5625c(c1897o4.f10057H.m5605f(string), Long.valueOf(j12), "Invalid conditional user property time to live");
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5876t(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        m5851h();
        C1811f c1811f = C1811f.f9788b;
        zzah[] zzahVarArrValues = zzah.values();
        int length = zzahVarArrValues.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            zzah zzahVar = zzahVarArrValues[i11];
            if (bundle.containsKey(zzahVar.zzd) && (string = bundle.getString(zzahVar.zzd)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else {
                    obj = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            C1897o4 c1897o4 = (C1897o4) this.f10430a;
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9947k.m5624b(obj, "Ignoring invalid consent setting");
            C1860k3 c1860k4 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9947k.m5623a("Valid consent values are 'granted', 'denied'");
        }
        m5877u(C1811f.m5592a(bundle), i10, j10);
    }

    /* JADX INFO: renamed from: u */
    public final void m5877u(C1811f c1811f, int i10, long j10) {
        C1811f c1811f2;
        boolean z10;
        boolean zM5598g;
        boolean z11;
        C1811f c1811fM5595d = c1811f;
        m5851h();
        if (i10 != -10 && ((Boolean) c1811fM5595d.f9789a.get(zzah.AD_STORAGE)) == null && ((Boolean) c1811fM5595d.f9789a.get(zzah.ANALYTICS_STORAGE)) == null) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9947k.m5623a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f10194h) {
            try {
                c1811f2 = this.f10195i;
                int i11 = this.f10196j;
                C1811f c1811f3 = C1811f.f9788b;
                z10 = false;
                if (i10 <= i11) {
                    zM5598g = c1811fM5595d.m5598g(c1811f2, (zzah[]) c1811fM5595d.f9789a.keySet().toArray(new zzah[0]));
                    zzah zzahVar = zzah.ANALYTICS_STORAGE;
                    if (c1811fM5595d.m5597f(zzahVar) && !this.f10195i.m5597f(zzahVar)) {
                        z10 = true;
                    }
                    c1811fM5595d = c1811fM5595d.m5595d(this.f10195i);
                    this.f10195i = c1811fM5595d;
                    this.f10196j = i10;
                    z11 = z10;
                    z10 = true;
                } else {
                    zM5598g = false;
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            C1860k3 c1860k4 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9948l.m5624b(c1811fM5595d, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f10197k.getAndIncrement();
        if (zM5598g) {
            this.f10193g.set(null);
            C1879m4 c1879m4 = ((C1897o4) this.f10430a).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5754q(new RunnableC1907p5(this, c1811fM5595d, j10, i10, andIncrement, z11, c1811f2));
            return;
        }
        RunnableC1916q5 runnableC1916q5 = new RunnableC1916q5(this, c1811fM5595d, i10, andIncrement, z11, c1811f2);
        if (i10 == 30 || i10 == -10) {
            C1879m4 c1879m5 = ((C1897o4) this.f10430a).f10087j;
            C1897o4.m5776k(c1879m5);
            c1879m5.m5754q(runnableC1916q5);
        } else {
            C1879m4 c1879m6 = ((C1897o4) this.f10430a).f10087j;
            C1897o4.m5776k(c1879m6);
            c1879m6.m5753p(runnableC1916q5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX INFO: renamed from: v */
    public final void m5878v(C1811f c1811f) {
        boolean z10;
        mo5748g();
        if (c1811f.m5597f(zzah.ANALYTICS_STORAGE) && c1811f.m5597f(zzah.AD_STORAGE)) {
            z10 = true;
        } else if (((C1897o4) this.f10430a).m5788t().m5761o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.mo5748g();
        if (z10 != c1897o4.f10074Y) {
            C1897o4 c1897o5 = (C1897o4) this.f10430a;
            C1879m4 c1879m5 = c1897o5.f10087j;
            C1897o4.m5776k(c1879m5);
            c1879m5.mo5748g();
            c1897o5.f10074Y = z10;
            C1986y3 c1986y3 = ((C1897o4) this.f10430a).f10085h;
            C1897o4.m5774i(c1986y3);
            c1986y3.mo5748g();
            Boolean boolValueOf = c1986y3.m5917l().contains("measurement_enabled_from_api") ? Boolean.valueOf(c1986y3.m5917l().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                m5881y(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX INFO: renamed from: w */
    public final void m5879w(String str, String str2, Object obj, boolean z10, long j10) {
        int iM5831i0;
        int length;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (z10) {
            C1900o7 c1900o7 = ((C1897o4) interfaceC1781b5).f10089l;
            C1897o4.m5774i(c1900o7);
            iM5831i0 = c1900o7.m5831i0(str2);
        } else {
            C1900o7 c1900o8 = ((C1897o4) interfaceC1781b5).f10089l;
            C1897o4.m5774i(c1900o8);
            if (!c1900o8.m5820P("user property", str2)) {
                iM5831i0 = 6;
            } else if (c1900o8.m5817M("user property", C8573r0.f45967d, null, str2)) {
                ((C1897o4) c1900o8.f10430a).getClass();
                if (c1900o8.m5814J("user property", 24, str2)) {
                    iM5831i0 = 0;
                } else {
                    iM5831i0 = 6;
                }
            } else {
                iM5831i0 = 15;
            }
        }
        C1995z4 c1995z4 = this.f10188K;
        if (iM5831i0 != 0) {
            C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
            C1900o7 c1900o9 = c1897o4.f10089l;
            C1897o4.m5774i(c1900o9);
            c1897o4.getClass();
            c1900o9.getClass();
            String strM5800o = C1900o7.m5800o(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            C1900o7 c1900o10 = c1897o4.f10089l;
            C1897o4.m5774i(c1900o10);
            c1900o10.getClass();
            C1900o7.m5804y(c1995z4, null, iM5831i0, "_ev", strM5800o, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            C1879m4 c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC1862k5(this, str3, str2, null, j10, 0));
            return;
        }
        C1897o4 c1897o5 = (C1897o4) interfaceC1781b5;
        C1900o7 c1900o11 = c1897o5.f10089l;
        C1897o4.m5774i(c1900o11);
        int iM5827e0 = c1900o11.m5827e0(obj, str2);
        if (iM5827e0 == 0) {
            C1900o7 c1900o12 = c1897o5.f10089l;
            C1897o4.m5774i(c1900o12);
            Object objM5835m = c1900o12.m5835m(obj, str2);
            if (objM5835m != null) {
                C1879m4 c1879m5 = ((C1897o4) interfaceC1781b5).f10087j;
                C1897o4.m5776k(c1879m5);
                c1879m5.m5753p(new RunnableC1862k5(this, str3, str2, objM5835m, j10, 0));
                return;
            }
            return;
        }
        C1900o7 c1900o13 = c1897o5.f10089l;
        C1897o4.m5774i(c1900o13);
        c1897o5.getClass();
        c1900o13.getClass();
        String strM5800o2 = C1900o7.m5800o(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
        C1900o7 c1900o14 = c1897o5.f10089l;
        C1897o4.m5774i(c1900o14);
        c1900o14.getClass();
        C1900o7.m5804y(c1995z4, null, iM5827e0, "_ev", strM5800o2, length);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX INFO: renamed from: x */
    public final void m5880x(long j10, Object obj, String str, String str2) {
        boolean zM5590o;
        Object obj2;
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        mo5748g();
        m5851h();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        Object obj3 = obj;
        if (zEquals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (TextUtils.isEmpty(str3)) {
                    obj3 = obj;
                    if (obj == null) {
                        C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
                        C1897o4.m5774i(c1986y3);
                        c1986y3.f10410l.m5914b("unset");
                        obj2 = obj;
                    }
                } else {
                    Long lValueOf = Long.valueOf(true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    C1986y3 c1986y4 = ((C1897o4) interfaceC1781b5).f10085h;
                    C1897o4.m5774i(c1986y4);
                    c1986y4.f10410l.m5914b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj2 = lValueOf;
                }
                str2 = "_npa";
                obj3 = obj2;
            } else {
                obj3 = obj;
                if (obj == null) {
                    C1986y3 c1986y5 = ((C1897o4) interfaceC1781b5).f10085h;
                    C1897o4.m5774i(c1986y5);
                    c1986y5.f10410l.m5914b("unset");
                    obj2 = obj;
                    str2 = "_npa";
                    obj3 = obj2;
                }
            }
        }
        Object obj4 = obj3;
        String str4 = str2;
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        if (!c1897o4.m5779g()) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5623a("User property not set since app measurement is disabled");
            return;
        }
        if (c1897o4.m5780h()) {
            zzli zzliVar = new zzli(j10, obj4, str4, str);
            C1881m6 c1881m6M5788t = c1897o4.m5788t();
            c1881m6M5788t.mo5748g();
            c1881m6M5788t.m5851h();
            InterfaceC1781b5 interfaceC1781b6 = c1881m6M5788t.f10430a;
            ((C1897o4) interfaceC1781b6).getClass();
            C1806e3 c1806e3M5786q = ((C1897o4) interfaceC1781b6).m5786q();
            c1806e3M5786q.getClass();
            Parcel parcelObtain = Parcel.obtain();
            C1873l7.m5744a(zzliVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                C1860k3 c1860k4 = ((C1897o4) c1806e3M5786q.f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9943g.m5623a("User property too long for local database. Sending directly to service");
                zM5590o = false;
            } else {
                zM5590o = c1806e3M5786q.m5590o(bArrMarshall, 1);
            }
            c1881m6M5788t.m5766t(new RunnableC1800d6(c1881m6M5788t, c1881m6M5788t.m5763q(true), zM5590o, zzliVar));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5881y(Boolean bool, boolean z10) {
        mo5748g();
        m5851h();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1860k3 c1860k3 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9937H.m5624b(bool, "Setting app measurement enabled (FE)");
        C1986y3 c1986y3 = c1897o4.f10085h;
        C1897o4.m5774i(c1986y3);
        c1986y3.m5921p(bool);
        if (z10) {
            C1986y3 c1986y4 = c1897o4.f10085h;
            C1897o4.m5774i(c1986y4);
            c1986y4.mo5748g();
            SharedPreferences.Editor editorEdit = c1986y4.m5917l().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.mo5748g();
        if (!c1897o4.f10074Y && (bool == null || bool.booleanValue())) {
            return;
        }
        m5882z();
    }

    /* JADX INFO: renamed from: z */
    public final void m5882z() {
        mo5748g();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1986y3 c1986y3 = c1897o4.f10085h;
        C1897o4.m5774i(c1986y3);
        String strM5913a = c1986y3.f10410l.m5913a();
        if (strM5913a != null) {
            if ("unset".equals(strM5913a)) {
                c1897o4.f10058I.getClass();
                m5880x(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strM5913a) ? 0L : 1L);
                c1897o4.f10058I.getClass();
                m5880x(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        int i10 = 5;
        if (!c1897o4.m5779g() || !this.f10187J) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9937H.m5623a("Updating Scion state (FE)");
            C1881m6 c1881m6M5788t = c1897o4.m5788t();
            c1881m6M5788t.mo5748g();
            c1881m6M5788t.m5851h();
            c1881m6M5788t.m5766t(new RunnableC5494j(c1881m6M5788t, c1881m6M5788t.m5763q(true), i10));
            return;
        }
        C1860k3 c1860k4 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k4);
        c1860k4.f9937H.m5623a("Recording app launch after enabling measurement for the first time (FE)");
        m5867D();
        ((InterfaceC2904x9) C2891w9.f14500b.f14501a.zza()).zza();
        if (c1897o4.f10084g.m5582q(null, C1985y2.f10350f0)) {
            C1971w6 c1971w6 = c1897o4.f10088k;
            C1897o4.m5775j(c1971w6);
            c1971w6.f10278d.m5900a();
        }
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC7943w(i10, this));
    }
}
