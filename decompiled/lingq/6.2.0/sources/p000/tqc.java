package p000;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzjk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tqc extends ynb {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f62744e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uoc f62745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqc(C1043b c1043b, uoc uocVar, int i) {
        super(uocVar);
        this.f62744e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c1043b);
                this.f62745f = c1043b;
                super(uocVar);
                break;
            default:
                Objects.requireNonNull(c1043b);
                this.f62745f = c1043b;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:79:0x023b  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d3 A[Catch: IllegalArgumentException | MalformedURLException -> 0x02da, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x02da, blocks: (B:82:0x028b, B:84:0x02d3, B:87:0x02dc, B:89:0x02e2, B:91:0x02ea, B:92:0x02f0, B:93:0x02f4), top: B:114:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02e2 A[Catch: IllegalArgumentException | MalformedURLException -> 0x02da, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x02da, blocks: (B:82:0x028b, B:84:0x02d3, B:87:0x02dc, B:89:0x02e2, B:91:0x02ea, B:92:0x02f0, B:93:0x02f4), top: B:114:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ea A[Catch: IllegalArgumentException | MalformedURLException -> 0x02da, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x02da, blocks: (B:82:0x028b, B:84:0x02d3, B:87:0x02dc, B:89:0x02e2, B:91:0x02ea, B:92:0x02f0, B:93:0x02f4), top: B:114:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x030e  */
    @Override // p000.ynb
    /* JADX INFO: renamed from: a */
    public final void mo55a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        v4d v4dVarM15287o;
        kjc kjcVar;
        q9c q9cVar;
        zzao zzaoVarMo11304s;
        Bundle bundle;
        String str;
        int i;
        String str2;
        String string;
        kjc kjcVar2;
        URL url;
        String strConcat;
        int i2 = this.f62744e;
        int i3 = 0;
        uoc uocVar = this.f62745f;
        switch (i2) {
            case 0:
                C1043b c1043b = ((kjc) ((C1043b) uocVar).f60774a).f47414H;
                kjc.m15279k(c1043b);
                new Thread(new pqc(c1043b, i3)).start();
                break;
            case 1:
                ((C1043b) uocVar).m5872c0();
                break;
            case 2:
                C1043b c1043b2 = (C1043b) uocVar;
                kjc kjcVar3 = (kjc) c1043b2.f60774a;
                qfc qfcVar = kjcVar3.f47437e;
                xcc xccVar = kjcVar3.f47438f;
                tic ticVar = kjcVar3.f47439g;
                kjc.m15280l(ticVar);
                ticVar.mo12359D();
                fyc fycVar = kjcVar3.f47416J;
                kjc.m15280l(fycVar);
                kjc kjcVar4 = (kjc) fycVar.f60774a;
                kjc.m15280l(fycVar);
                String strM21928J = kjcVar3.m15289q().m21928J();
                Boolean boolM4871Q = kjcVar3.f47436d.m4871Q("google_analytics_adid_collection_enabled");
                if (boolM4871Q == null || boolM4871Q.booleanValue()) {
                    kjc.m15278j(qfcVar);
                    kjc kjcVar5 = (kjc) qfcVar.f60774a;
                    qfcVar.mo12359D();
                    if (qfcVar.m19933K().m17590i(zzjk.AD_STORAGE)) {
                        kjcVar5.f47443k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = qfcVar.f57730h;
                        if (str3 == null || jElapsedRealtime >= qfcVar.f57732j) {
                            qfcVar.f57732j = kjcVar5.f47436d.m4866L(strM21928J, z8c.f71156b) + jElapsedRealtime;
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(kjcVar5.f47433a);
                                qfcVar.f57730h = "";
                                String id = advertisingIdInfo.getId();
                                if (id != null) {
                                    qfcVar.f57730h = id;
                                }
                                qfcVar.f57731i = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e) {
                                xcc xccVar2 = kjcVar5.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68075H.m17924b(e, "Unable to get advertising id");
                                qfcVar.f57730h = "";
                            }
                            pair = new Pair(qfcVar.f57730h, Boolean.valueOf(qfcVar.f57731i));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(qfcVar.f57731i));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        kjc.m15280l(fycVar);
                        fycVar.m18192F();
                        ConnectivityManager connectivityManager = (ConnectivityManager) kjcVar4.f47433a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            v4d v4dVarM15287o2 = kjcVar3.m15287o();
                            v4dVarM15287o2.mo12359D();
                            v4dVarM15287o2.m13744E();
                            if (!v4dVarM15287o2.m23110K()) {
                                C1043b c1043b3 = kjcVar3.f47414H;
                                kjc.m15279k(c1043b3);
                                kjc kjcVar6 = (kjc) c1043b3.f60774a;
                                c1043b3.mo12359D();
                                v4dVarM15287o = kjcVar6.m15287o();
                                kjcVar = (kjc) v4dVarM15287o.f60774a;
                                v4dVarM15287o.mo12359D();
                                v4dVarM15287o.m13744E();
                                q9cVar = v4dVarM15287o.f64866d;
                                if (q9cVar == null) {
                                    v4dVarM15287o.m23109J();
                                    xcc xccVar3 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar3);
                                    xccVar3.f68075H.m17923a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        zzaoVarMo11304s = q9cVar.mo11304s(v4dVarM15287o.m23119T(false));
                                        v4dVarM15287o.m23116Q();
                                    } catch (RemoteException e2) {
                                        xcc xccVar4 = kjcVar.f47438f;
                                        kjc.m15280l(xccVar4);
                                        xccVar4.f68080f.m17924b(e2, "Failed to get consents; remote exception");
                                        zzaoVarMo11304s = null;
                                    }
                                    if (zzaoVarMo11304s != null) {
                                        bundle = zzaoVarMo11304s.f12387a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = kjcVar3.f47429W;
                                        kjcVar3.f47429W = i + 1;
                                        i3 = i < 10 ? 1 : 0;
                                        kjc.m15280l(xccVar);
                                        occ occVar = xccVar.f68075H;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        occVar.m17924b(Integer.valueOf(kjcVar3.f47429W), AbstractC3393o1.m17738m(sb2, str2, " retryCount"));
                                    } else {
                                        npc npcVarM17582b = npc.m17582b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(npcVarM17582b.m17588f());
                                        mob mobVarM16961c = mob.m16961c(100, bundle);
                                        str = mobVarM16961c.f51670d;
                                        sb.append("&dma=");
                                        sb.append(!Objects.equals(mobVarM16961c.f51669c, Boolean.FALSE) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        int i4 = !Objects.equals(mob.m16962d(bundle), Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        kjc.m15280l(xccVar);
                                        xccVar.f68076I.m17924b(sb, "Consent query parameters to Bow");
                                        rad radVar = kjcVar3.f47441i;
                                        kjc.m15278j(radVar);
                                        ((kjc) kjcVar3.m15289q().f60774a).f47436d.m4864J();
                                        String str4 = (String) pair.first;
                                        long jM19952g = qfcVar.f57720P.m19952g() - 1;
                                        string = sb.toString();
                                        kjcVar2 = (kjc) radVar.f60774a;
                                        try {
                                            lda.m16127m(str4);
                                            lda.m16127m(strM21928J);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + radVar.m20549n0()) + "&rdid=" + str4 + "&bundleid=" + strM21928J + "&retry=" + jM19952g;
                                            if (strM21928J.equals(kjcVar2.f47436d.m4862H("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException | MalformedURLException e3) {
                                            xcc xccVar5 = kjcVar2.f47438f;
                                            kjc.m15280l(xccVar5);
                                            xccVar5.f68080f.m17924b(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            kjc.m15280l(fycVar);
                                            vf9 vf9Var = new vf9(kjcVar3);
                                            fycVar.m18192F();
                                            tic ticVar2 = kjcVar4.f47439g;
                                            kjc.m15280l(ticVar2);
                                            ticVar2.m22079P(new cyc(fycVar, strM21928J, url, null, null, vf9Var));
                                        }
                                    }
                                }
                                zzaoVarMo11304s = null;
                                if (zzaoVarMo11304s != null) {
                                    bundle = zzaoVarMo11304s.f12387a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = kjcVar3.f47429W;
                                    kjcVar3.f47429W = i + 1;
                                    if (i < 10) {
                                    }
                                    kjc.m15280l(xccVar);
                                    occ occVar2 = xccVar.f68075H;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    occVar2.m17924b(Integer.valueOf(kjcVar3.f47429W), AbstractC3393o1.m17738m(sb3, str2, " retryCount"));
                                } else {
                                    npc npcVarM17582b2 = npc.m17582b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(npcVarM17582b2.m17588f());
                                    mob mobVarM16961c2 = mob.m16961c(100, bundle);
                                    str = mobVarM16961c2.f51670d;
                                    sb.append("&dma=");
                                    sb.append(!Objects.equals(mobVarM16961c2.f51669c, Boolean.FALSE) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    int i5 = !Objects.equals(mob.m16962d(bundle), Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i5);
                                    kjc.m15280l(xccVar);
                                    xccVar.f68076I.m17924b(sb, "Consent query parameters to Bow");
                                    rad radVar2 = kjcVar3.f47441i;
                                    kjc.m15278j(radVar2);
                                    ((kjc) kjcVar3.m15289q().f60774a).f47436d.m4864J();
                                    String str5 = (String) pair.first;
                                    long jM19952g2 = qfcVar.f57720P.m19952g() - 1;
                                    string = sb.toString();
                                    kjcVar2 = (kjc) radVar2.f60774a;
                                    lda.m16127m(str5);
                                    lda.m16127m(strM21928J);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + radVar2.m20549n0()) + "&rdid=" + str5 + "&bundleid=" + strM21928J + "&retry=" + jM19952g2;
                                    if (strM21928J.equals(kjcVar2.f47436d.m4862H("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        kjc.m15280l(fycVar);
                                        vf9 vf9Var2 = new vf9(kjcVar3);
                                        fycVar.m18192F();
                                        tic ticVar3 = kjcVar4.f47439g;
                                        kjc.m15280l(ticVar3);
                                        ticVar3.m22079P(new cyc(fycVar, strM21928J, url, null, null, vf9Var2));
                                    }
                                }
                                break;
                            } else {
                                rad radVar3 = ((kjc) v4dVarM15287o2.f60774a).f47441i;
                                kjc.m15278j(radVar3);
                                if (radVar3.m20549n0() >= 234200) {
                                    C1043b c1043b4 = kjcVar3.f47414H;
                                    kjc.m15279k(c1043b4);
                                    kjc kjcVar7 = (kjc) c1043b4.f60774a;
                                    c1043b4.mo12359D();
                                    v4dVarM15287o = kjcVar7.m15287o();
                                    kjcVar = (kjc) v4dVarM15287o.f60774a;
                                    v4dVarM15287o.mo12359D();
                                    v4dVarM15287o.m13744E();
                                    q9cVar = v4dVarM15287o.f64866d;
                                    if (q9cVar == null) {
                                        v4dVarM15287o.m23109J();
                                        xcc xccVar6 = kjcVar.f47438f;
                                        kjc.m15280l(xccVar6);
                                        xccVar6.f68075H.m17923a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        zzaoVarMo11304s = q9cVar.mo11304s(v4dVarM15287o.m23119T(false));
                                        v4dVarM15287o.m23116Q();
                                        if (zzaoVarMo11304s != null) {
                                            bundle = zzaoVarMo11304s.f12387a;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = kjcVar3.f47429W;
                                            kjcVar3.f47429W = i + 1;
                                            if (i < 10) {
                                            }
                                            kjc.m15280l(xccVar);
                                            occ occVar3 = xccVar.f68075H;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            occVar3.m17924b(Integer.valueOf(kjcVar3.f47429W), AbstractC3393o1.m17738m(sb4, str2, " retryCount"));
                                        } else {
                                            npc npcVarM17582b3 = npc.m17582b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(npcVarM17582b3.m17588f());
                                            mob mobVarM16961c3 = mob.m16961c(100, bundle);
                                            str = mobVarM16961c3.f51670d;
                                            sb.append("&dma=");
                                            sb.append(!Objects.equals(mobVarM16961c3.f51669c, Boolean.FALSE) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            int i6 = !Objects.equals(mob.m16962d(bundle), Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i6);
                                            kjc.m15280l(xccVar);
                                            xccVar.f68076I.m17924b(sb, "Consent query parameters to Bow");
                                            rad radVar4 = kjcVar3.f47441i;
                                            kjc.m15278j(radVar4);
                                            ((kjc) kjcVar3.m15289q().f60774a).f47436d.m4864J();
                                            String str6 = (String) pair.first;
                                            long jM19952g3 = qfcVar.f57720P.m19952g() - 1;
                                            string = sb.toString();
                                            kjcVar2 = (kjc) radVar4.f60774a;
                                            lda.m16127m(str6);
                                            lda.m16127m(strM21928J);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + radVar4.m20549n0()) + "&rdid=" + str6 + "&bundleid=" + strM21928J + "&retry=" + jM19952g3;
                                            if (strM21928J.equals(kjcVar2.f47436d.m4862H("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                kjc.m15280l(fycVar);
                                                vf9 vf9Var3 = new vf9(kjcVar3);
                                                fycVar.m18192F();
                                                tic ticVar4 = kjcVar4.f47439g;
                                                kjc.m15280l(ticVar4);
                                                ticVar4.m22079P(new cyc(fycVar, strM21928J, url, null, null, vf9Var3));
                                            }
                                        }
                                    }
                                    zzaoVarMo11304s = null;
                                    if (zzaoVarMo11304s != null) {
                                        bundle = zzaoVarMo11304s.f12387a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = kjcVar3.f47429W;
                                        kjcVar3.f47429W = i + 1;
                                        if (i < 10) {
                                        }
                                        kjc.m15280l(xccVar);
                                        occ occVar4 = xccVar.f68075H;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        occVar4.m17924b(Integer.valueOf(kjcVar3.f47429W), AbstractC3393o1.m17738m(sb5, str2, " retryCount"));
                                    } else {
                                        npc npcVarM17582b4 = npc.m17582b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(npcVarM17582b4.m17588f());
                                        mob mobVarM16961c4 = mob.m16961c(100, bundle);
                                        str = mobVarM16961c4.f51670d;
                                        sb.append("&dma=");
                                        sb.append(!Objects.equals(mobVarM16961c4.f51669c, Boolean.FALSE) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        int i7 = !Objects.equals(mob.m16962d(bundle), Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i7);
                                        kjc.m15280l(xccVar);
                                        xccVar.f68076I.m17924b(sb, "Consent query parameters to Bow");
                                        rad radVar5 = kjcVar3.f47441i;
                                        kjc.m15278j(radVar5);
                                        ((kjc) kjcVar3.m15289q().f60774a).f47436d.m4864J();
                                        String str7 = (String) pair.first;
                                        long jM19952g4 = qfcVar.f57720P.m19952g() - 1;
                                        string = sb.toString();
                                        kjcVar2 = (kjc) radVar5.f60774a;
                                        lda.m16127m(str7);
                                        lda.m16127m(strM21928J);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + radVar5.m20549n0()) + "&rdid=" + str7 + "&bundleid=" + strM21928J + "&retry=" + jM19952g4;
                                        if (strM21928J.equals(kjcVar2.f47436d.m4862H("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            kjc.m15280l(fycVar);
                                            vf9 vf9Var4 = new vf9(kjcVar3);
                                            fycVar.m18192F();
                                            tic ticVar5 = kjcVar4.f47439g;
                                            kjc.m15280l(ticVar5);
                                            ticVar5.m22079P(new cyc(fycVar, strM21928J, url, null, null, vf9Var4));
                                        }
                                    }
                                } else {
                                    rad radVar6 = kjcVar3.f47441i;
                                    kjc.m15278j(radVar6);
                                    ((kjc) kjcVar3.m15289q().f60774a).f47436d.m4864J();
                                    String str8 = (String) pair.first;
                                    long jM19952g5 = qfcVar.f57720P.m19952g() - 1;
                                    string = sb.toString();
                                    kjcVar2 = (kjc) radVar6.f60774a;
                                    lda.m16127m(str8);
                                    lda.m16127m(strM21928J);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + radVar6.m20549n0()) + "&rdid=" + str8 + "&bundleid=" + strM21928J + "&retry=" + jM19952g5;
                                    if (strM21928J.equals(kjcVar2.f47436d.m4862H("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        kjc.m15280l(fycVar);
                                        vf9 vf9Var5 = new vf9(kjcVar3);
                                        fycVar.m18192F();
                                        tic ticVar6 = kjcVar4.f47439g;
                                        kjc.m15280l(ticVar6);
                                        ticVar6.m22079P(new cyc(fycVar, strM21928J, url, null, null, vf9Var5));
                                    }
                                }
                            }
                        } else {
                            kjc.m15280l(xccVar);
                            xccVar.f68083i.m17923a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        kjc.m15280l(xccVar);
                        xccVar.f68076I.m17923a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17923a("ADID collection is disabled from Manifest. Skipping");
                }
                if (i3 != 0) {
                    c1043b2.f12321N.m25215b(2000L);
                }
                break;
            default:
                C1045d c1045d = (C1045d) uocVar;
                c1045d.mo5913d().mo12359D();
                String str9 = (String) c1045d.f12341L.pollFirst();
                if (str9 != null) {
                    c1045d.mo5911c().getClass();
                    c1045d.f12363d0 = SystemClock.elapsedRealtime();
                    c1045d.mo5909b().f68076I.m17924b(str9, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str9);
                    Context context = c1045d.f12372l.f47433a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                c1045d.m5891H();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqc(uoc uocVar, uoc uocVar2, int i) {
        super(uocVar2);
        this.f62744e = i;
        this.f62745f = uocVar;
    }
}
