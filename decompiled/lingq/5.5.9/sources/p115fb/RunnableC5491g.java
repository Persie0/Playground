package p115fb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import cc.C1802e;
import cc.C1860k3;
import cc.C1881m6;
import cc.C1897o4;
import cc.C1900o7;
import cc.C1925r5;
import cc.C1934s5;
import cc.C1936s7;
import cc.C1976x2;
import cc.C1985y2;
import cc.InterfaceC1779b3;
import cc.InterfaceC1781b5;
import cc.RunnableC1863k6;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.C2815qb;
import com.google.android.gms.internal.measurement.InterfaceC2828rb;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;
import p176ib.C6272i;

/* JADX INFO: renamed from: fb.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5491g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34082a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f34083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34084c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f34085d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f34086e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f34087f;

    public RunnableC5491g(C1881m6 c1881m6, zzq zzqVar, boolean z10, zzac zzacVar, zzac zzacVar2) {
        this.f34087f = c1881m6;
        this.f34084c = zzqVar;
        this.f34083b = z10;
        this.f34085d = zzacVar;
        this.f34086e = zzacVar2;
    }

    public RunnableC5491g(C1925r5 c1925r5, boolean z10, Uri uri, String str, String str2) {
        this.f34087f = c1925r5;
        this.f34083b = z10;
        this.f34084c = uri;
        this.f34085d = str;
        this.f34086e = str2;
    }

    public RunnableC5491g(C1934s5 c1934s5, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f34087f = c1934s5;
        this.f34084c = atomicReference;
        this.f34085d = str;
        this.f34086e = str2;
        this.f34083b = z10;
    }

    public /* synthetic */ RunnableC5491g(AbstractC5485a abstractC5485a, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f34084c = abstractC5485a;
        this.f34085d = intent;
        this.f34086e = context;
        this.f34083b = z10;
        this.f34087f = pendingResult;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127 A[Catch: RuntimeException -> 0x01ce, TryCatch #0 {RuntimeException -> 0x01ce, blocks: (B:6:0x0025, B:10:0x005a, B:12:0x0060, B:14:0x0066, B:16:0x006c, B:18:0x0072, B:20:0x007a, B:22:0x0082, B:25:0x008c, B:29:0x0097, B:31:0x00a7, B:33:0x00b7, B:36:0x00c2, B:38:0x00e7, B:41:0x00f4, B:43:0x00fa, B:44:0x0110, B:47:0x011f, B:50:0x0127, B:53:0x0146, B:55:0x015c, B:54:0x014d, B:56:0x0178, B:58:0x017e, B:60:0x0184, B:62:0x018a, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:70:0x01a6, B:71:0x01be), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: RuntimeException -> 0x01ce, TryCatch #0 {RuntimeException -> 0x01ce, blocks: (B:6:0x0025, B:10:0x005a, B:12:0x0060, B:14:0x0066, B:16:0x006c, B:18:0x0072, B:20:0x007a, B:22:0x0082, B:25:0x008c, B:29:0x0097, B:31:0x00a7, B:33:0x00b7, B:36:0x00c2, B:38:0x00e7, B:41:0x00f4, B:43:0x00fa, B:44:0x0110, B:47:0x011f, B:50:0x0127, B:53:0x0146, B:55:0x015c, B:54:0x014d, B:56:0x0178, B:58:0x017e, B:60:0x0184, B:62:0x018a, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:70:0x01a6, B:71:0x01be), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014d A[Catch: RuntimeException -> 0x01ce, TryCatch #0 {RuntimeException -> 0x01ce, blocks: (B:6:0x0025, B:10:0x005a, B:12:0x0060, B:14:0x0066, B:16:0x006c, B:18:0x0072, B:20:0x007a, B:22:0x0082, B:25:0x008c, B:29:0x0097, B:31:0x00a7, B:33:0x00b7, B:36:0x00c2, B:38:0x00e7, B:41:0x00f4, B:43:0x00fa, B:44:0x0110, B:47:0x011f, B:50:0x0127, B:53:0x0146, B:55:0x015c, B:54:0x014d, B:56:0x0178, B:58:0x017e, B:60:0x0184, B:62:0x018a, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:70:0x01a6, B:71:0x01be), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0178 A[Catch: RuntimeException -> 0x01ce, TryCatch #0 {RuntimeException -> 0x01ce, blocks: (B:6:0x0025, B:10:0x005a, B:12:0x0060, B:14:0x0066, B:16:0x006c, B:18:0x0072, B:20:0x007a, B:22:0x0082, B:25:0x008c, B:29:0x0097, B:31:0x00a7, B:33:0x00b7, B:36:0x00c2, B:38:0x00e7, B:41:0x00f4, B:43:0x00fa, B:44:0x0110, B:47:0x011f, B:50:0x0127, B:53:0x0146, B:55:0x015c, B:54:0x014d, B:56:0x0178, B:58:0x017e, B:60:0x0184, B:62:0x018a, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:70:0x01a6, B:71:0x01be), top: B:102:0x0025 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleM5836m0;
        String str;
        String str2;
        int i10 = this.f34082a;
        boolean z10 = this.f34083b;
        Object obj = this.f34086e;
        Object obj2 = this.f34087f;
        Object obj3 = this.f34085d;
        Object obj4 = this.f34084c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                AbstractC5485a abstractC5485a = (AbstractC5485a) obj4;
                Intent intent = (Intent) obj3;
                Context context = (Context) obj;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj2;
                abstractC5485a.getClass();
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int iM11715d = intent2 != null ? abstractC5485a.m11715d(context, intent2) : abstractC5485a.m11714c(context, intent);
                    if (z10) {
                        pendingResult.setResultCode(iM11715d);
                        break;
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                C1881m6 c1881m6M5788t = ((C1897o4) ((C1934s5) obj2).f10430a).m5788t();
                boolean z11 = this.f34083b;
                c1881m6M5788t.mo5748g();
                c1881m6M5788t.m5851h();
                c1881m6M5788t.m5766t(new RunnableC1863k6(c1881m6M5788t, (AtomicReference) obj4, (String) obj3, (String) obj, c1881m6M5788t.m5763q(false), z11));
                return;
            case 2:
                Uri uri = (Uri) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj;
                C1934s5 c1934s5 = ((C1925r5) obj2).f10172a;
                c1934s5.mo5748g();
                InterfaceC1781b5 interfaceC1781b5 = c1934s5.f10430a;
                try {
                    C1900o7 c1900o7 = ((C1897o4) interfaceC1781b5).f10089l;
                    C1897o4.m5774i(c1900o7);
                    C2815qb c2815qb = C2815qb.f14408b;
                    ((InterfaceC2828rb) c2815qb.f14409a.zza()).zza();
                    C1802e c1802e = ((C1897o4) interfaceC1781b5).f10084g;
                    C1976x2 c1976x2 = C1985y2.f10372q0;
                    boolean zM5582q = c1802e.m5582q(null, c1976x2);
                    if (TextUtils.isEmpty(str4)) {
                        bundleM5836m0 = null;
                    } else {
                        if (!str4.contains("gclid") && !str4.contains("utm_campaign") && !str4.contains("utm_source") && !str4.contains("utm_medium") && !str4.contains("utm_id") && !str4.contains("dclid") && !str4.contains("srsltid")) {
                            if (zM5582q && str4.contains("sfmc_id")) {
                                zM5582q = true;
                            }
                            C1860k3 c1860k3 = ((C1897o4) c1900o7.f10430a).f10086i;
                            C1897o4.m5776k(c1860k3);
                            c1860k3.f9937H.m5623a("Activity created with data 'referrer' without required params");
                            bundleM5836m0 = null;
                        }
                        bundleM5836m0 = c1900o7.m5836m0(zM5582q, Uri.parse("https://google.com/search?".concat(str4)));
                        if (bundleM5836m0 != null) {
                            bundleM5836m0.putString("_cis", "referrer");
                        }
                    }
                    C1936s7 c1936s7 = c1934s5.f10186I;
                    if (z10) {
                        C1900o7 c1900o8 = ((C1897o4) interfaceC1781b5).f10089l;
                        C1897o4.m5774i(c1900o8);
                        ((InterfaceC2828rb) c2815qb.f14409a.zza()).zza();
                        str = "Activity created with data 'referrer' without required params";
                        Bundle bundleM5836m1 = c1900o8.m5836m0(((C1897o4) interfaceC1781b5).f10084g.m5582q(null, c1976x2), uri);
                        if (bundleM5836m1 != null) {
                            bundleM5836m1.putString("_cis", "intent");
                            if (!bundleM5836m1.containsKey("gclid") && bundleM5836m0 != null && bundleM5836m0.containsKey("gclid")) {
                                bundleM5836m1.putString("_cer", String.format("gclid=%s", bundleM5836m0.getString("gclid")));
                            }
                            str2 = str3;
                            c1934s5.m5871o(str2, "_cmp", bundleM5836m1);
                            c1936s7.m5886a(bundleM5836m1, str2);
                        }
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9937H.m5624b(str4, "Activity created with referrer");
                        if (!((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10340a0)) {
                            if (bundleM5836m0 != null) {
                                c1934s5.m5871o(str2, "_cmp", bundleM5836m0);
                                c1936s7.m5886a(bundleM5836m0, str2);
                            } else {
                                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                                C1897o4.m5776k(c1860k5);
                                c1860k5.f9937H.m5624b(str4, "Referrer does not contain valid parameters");
                            }
                            ((C1897o4) interfaceC1781b5).f10058I.getClass();
                            c1934s5.m5879w("auto", "_ldl", null, true, System.currentTimeMillis());
                            return;
                        }
                        if (str4.contains("gclid") || !(str4.contains("utm_campaign") || str4.contains("utm_source") || str4.contains("utm_medium") || str4.contains("utm_term") || str4.contains("utm_content"))) {
                            C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                            C1897o4.m5776k(c1860k6);
                            c1860k6.f9937H.m5623a(str);
                            return;
                        } else {
                            if (TextUtils.isEmpty(str4)) {
                                return;
                            }
                            ((C1897o4) interfaceC1781b5).f10058I.getClass();
                            c1934s5.m5879w("auto", "_ldl", str4, true, System.currentTimeMillis());
                            return;
                        }
                    }
                    str = "Activity created with data 'referrer' without required params";
                    str2 = str3;
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    C1860k3 c1860k7 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k7);
                    c1860k7.f9937H.m5624b(str4, "Activity created with referrer");
                    if (!((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10340a0)) {
                        if (str4.contains("gclid")) {
                        }
                        C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k8);
                        c1860k8.f9937H.m5623a(str);
                        return;
                    }
                    if (bundleM5836m0 != null) {
                        c1934s5.m5871o(str2, "_cmp", bundleM5836m0);
                        c1936s7.m5886a(bundleM5836m0, str2);
                    } else {
                        C1860k3 c1860k9 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k9);
                        c1860k9.f9937H.m5624b(str4, "Referrer does not contain valid parameters");
                    }
                    ((C1897o4) interfaceC1781b5).f10058I.getClass();
                    c1934s5.m5879w("auto", "_ldl", null, true, System.currentTimeMillis());
                    return;
                } catch (RuntimeException e10) {
                    C1860k3 c1860k10 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k10);
                    c1860k10.f9942f.m5624b(e10, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
            default:
                C1881m6 c1881m6 = (C1881m6) obj2;
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k11 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k11);
                    c1860k11.f9942f.m5623a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    zzq zzqVar = (zzq) obj4;
                    C6272i.m12915i(zzqVar);
                    c1881m6.m5758l(interfaceC1779b3, z10 ? null : (zzac) obj3, zzqVar);
                    c1881m6.m5765s();
                    return;
                }
        }
    }
}
