package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class rtc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59805a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f59806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f59807c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f59808d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59809e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59810f;

    public rtc(C1043b c1043b, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f59809e = atomicReference;
        this.f59807c = str;
        this.f59808d = str2;
        this.f59806b = z;
        Objects.requireNonNull(c1043b);
        this.f59810f = c1043b;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[Catch: RuntimeException -> 0x0095, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[Catch: RuntimeException -> 0x0095, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: RuntimeException -> 0x0095, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0117 A[Catch: RuntimeException -> 0x0095, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x011e A[Catch: RuntimeException -> 0x0095, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0139 A[Catch: RuntimeException -> 0x0095, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f A[Catch: RuntimeException -> 0x0095, TryCatch #1 {RuntimeException -> 0x0095, blocks: (B:38:0x00b7, B:40:0x00c2, B:43:0x00cf, B:45:0x00d5, B:47:0x00ef, B:49:0x00f8, B:51:0x00fe, B:54:0x0117, B:56:0x0126, B:55:0x011e, B:57:0x0139, B:59:0x013f, B:61:0x0145, B:63:0x014b, B:65:0x0151, B:67:0x0159, B:69:0x0161, B:71:0x0167, B:72:0x0179, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:17:0x005a, B:19:0x0060, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007e, B:29:0x0086, B:33:0x009c, B:35:0x00aa), top: B:84:0x0044 }] */
    @Override // java.lang.Runnable
    public final void run() {
        xcc xccVar;
        Bundle bundleM20517D0;
        boolean z;
        String str;
        xcc xccVar2;
        occ occVar;
        Bundle bundleM20517D1;
        int i = this.f59805a;
        Object obj = this.f59809e;
        Object obj2 = this.f59810f;
        switch (i) {
            case 0:
                v4d v4dVarM15287o = ((kjc) ((C1043b) obj2).f60774a).m15287o();
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23117R(new f3d(v4dVarM15287o, (AtomicReference) obj, this.f59807c, this.f59808d, v4dVarM15287o.m23119T(false), this.f59806b));
                break;
            default:
                C3600t6 c3600t6 = (C3600t6) obj2;
                C1043b c1043b = (C1043b) c3600t6.f61897b;
                c1043b.mo12359D();
                kjc kjcVar = (kjc) c1043b.f60774a;
                gw9 gw9Var = c1043b.f12319L;
                String str2 = this.f59808d;
                Uri uri = (Uri) obj;
                try {
                    rad radVar = kjcVar.f47441i;
                    xcc xccVar3 = kjcVar.f47438f;
                    kjc.m15278j(radVar);
                    try {
                        String str3 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str2)) {
                            xccVar = xccVar3;
                        } else {
                            try {
                                if (!str2.contains("gclid")) {
                                    xccVar = xccVar3;
                                    if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                                        xcc xccVar4 = ((kjc) radVar.f60774a).f47438f;
                                        kjc.m15280l(xccVar4);
                                        xccVar4.f68075H.m17923a("Activity created with data 'referrer' without required params");
                                    }
                                    z = this.f59806b;
                                    str = this.f59807c;
                                    if (z) {
                                        rad radVar2 = kjcVar.f47441i;
                                        kjc.m15278j(radVar2);
                                        bundleM20517D1 = radVar2.m20517D0(uri);
                                        if (bundleM20517D1 != null) {
                                            bundleM20517D1.putString("_cis", "intent");
                                            if (bundleM20517D1.containsKey("gclid") && bundleM20517D0 != null && bundleM20517D0.containsKey("gclid")) {
                                                bundleM20517D1.putString("_cer", "gclid=" + bundleM20517D0.getString("gclid"));
                                            }
                                            c1043b.m5854K(str, "_cmp", bundleM20517D1);
                                            gw9Var.m12939j(str, bundleM20517D1);
                                        } else {
                                            str3 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str3 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        kjc.m15280l(xccVar);
                                        xccVar2 = xccVar;
                                        occVar = xccVar2.f68075H;
                                        occVar.m17924b(str2, "Activity created with referrer");
                                        if (kjcVar.f47436d.m4869O(null, z8c.f71114G0)) {
                                            if (bundleM20517D0 != null) {
                                                c1043b.m5854K(str, "_cmp", bundleM20517D0);
                                                gw9Var.m12939j(str, bundleM20517D0);
                                            } else {
                                                kjc.m15280l(xccVar2);
                                                occVar.m17924b(str2, "Referrer does not contain valid parameters");
                                            }
                                            kjcVar.f47443k.getClass();
                                            c1043b.m5857N("auto", "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                                            kjc.m15280l(xccVar2);
                                            occVar.m17923a(str3);
                                        } else if (!TextUtils.isEmpty(str2)) {
                                            kjcVar.f47443k.getClass();
                                            c1043b.m5857N("auto", "_ldl", str2, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    xccVar = xccVar3;
                                }
                                bundleM20517D0 = radVar.m20517D0(Uri.parse("https://google.com/search?".concat(str2)));
                                if (bundleM20517D0 != null) {
                                    bundleM20517D0.putString("_cis", "referrer");
                                }
                                z = this.f59806b;
                                str = this.f59807c;
                                if (z) {
                                    rad radVar3 = kjcVar.f47441i;
                                    kjc.m15278j(radVar3);
                                    bundleM20517D1 = radVar3.m20517D0(uri);
                                    if (bundleM20517D1 != null) {
                                        bundleM20517D1.putString("_cis", "intent");
                                        if (bundleM20517D1.containsKey("gclid")) {
                                        }
                                        c1043b.m5854K(str, "_cmp", bundleM20517D1);
                                        gw9Var.m12939j(str, bundleM20517D1);
                                    } else {
                                        str3 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str3 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    kjc.m15280l(xccVar);
                                    xccVar2 = xccVar;
                                    occVar = xccVar2.f68075H;
                                    occVar.m17924b(str2, "Activity created with referrer");
                                    if (kjcVar.f47436d.m4869O(null, z8c.f71114G0)) {
                                        if (str2.contains("gclid")) {
                                        }
                                        kjc.m15280l(xccVar2);
                                        occVar.m17923a(str3);
                                    } else {
                                        if (bundleM20517D0 != null) {
                                            c1043b.m5854K(str, "_cmp", bundleM20517D0);
                                            gw9Var.m12939j(str, bundleM20517D0);
                                        } else {
                                            kjc.m15280l(xccVar2);
                                            occVar.m17924b(str2, "Referrer does not contain valid parameters");
                                        }
                                        kjcVar.f47443k.getClass();
                                        c1043b.m5857N("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                c3600t6 = c3600t6;
                                xcc xccVar5 = ((kjc) ((C1043b) c3600t6.f61897b).f60774a).f47438f;
                                kjc.m15280l(xccVar5);
                                xccVar5.f68080f.m17924b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                            }
                        }
                        bundleM20517D0 = null;
                        z = this.f59806b;
                        str = this.f59807c;
                        if (z) {
                            rad radVar4 = kjcVar.f47441i;
                            kjc.m15278j(radVar4);
                            bundleM20517D1 = radVar4.m20517D0(uri);
                            if (bundleM20517D1 != null) {
                                bundleM20517D1.putString("_cis", "intent");
                                if (bundleM20517D1.containsKey("gclid")) {
                                }
                                c1043b.m5854K(str, "_cmp", bundleM20517D1);
                                gw9Var.m12939j(str, bundleM20517D1);
                            } else {
                                str3 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str3 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            kjc.m15280l(xccVar);
                            xccVar2 = xccVar;
                            occVar = xccVar2.f68075H;
                            occVar.m17924b(str2, "Activity created with referrer");
                            if (kjcVar.f47436d.m4869O(null, z8c.f71114G0)) {
                                if (str2.contains("gclid")) {
                                }
                                kjc.m15280l(xccVar2);
                                occVar.m17923a(str3);
                            } else {
                                if (bundleM20517D0 != null) {
                                    c1043b.m5854K(str, "_cmp", bundleM20517D0);
                                    gw9Var.m12939j(str, bundleM20517D0);
                                } else {
                                    kjc.m15280l(xccVar2);
                                    occVar.m17924b(str2, "Referrer does not contain valid parameters");
                                }
                                kjcVar.f47443k.getClass();
                                c1043b.m5857N("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        xcc xccVar6 = ((kjc) ((C1043b) c3600t6.f61897b).f60774a).f47438f;
                        kjc.m15280l(xccVar6);
                        xccVar6.f68080f.m17924b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
        }
    }

    public rtc(C3600t6 c3600t6, boolean z, Uri uri, String str, String str2) {
        this.f59806b = z;
        this.f59809e = uri;
        this.f59807c = str;
        this.f59808d = str2;
        this.f59810f = c3600t6;
    }
}
