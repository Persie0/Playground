package p000;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.AppEvent;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f17 {

    /* JADX INFO: renamed from: a */
    public static final f17 f38243a = new f17();

    /* JADX INFO: renamed from: b */
    public static final String f38244b = "Fledge: ".concat(f17.class.getSimpleName());

    /* JADX INFO: renamed from: c */
    public static boolean f38245c;

    /* JADX INFO: renamed from: d */
    public static boolean f38246d;

    /* JADX INFO: renamed from: e */
    public static CustomAudienceManager f38247e;

    /* JADX INFO: renamed from: f */
    public static zo3 f38248f;

    /* JADX INFO: renamed from: g */
    public static String f38249g;

    /* JADX INFO: renamed from: a */
    public static final void m11496a() {
        String string;
        if (lp1.f49971a.contains(f17.class)) {
            return;
        }
        try {
            f38246d = true;
            Context contextM21766a = sy2.m21766a();
            f38248f = new zo3(contextM21766a);
            f38249g = "https://www." + sy2.f61603s + "/privacy_sandbox/pa/logic";
            try {
                CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextM21766a);
                f38247e = customAudienceManager;
                if (customAudienceManager != null) {
                    f38245c = true;
                }
                string = null;
            } catch (Error e) {
                string = e.toString();
                Log.w(f38244b, "Failed to get CustomAudienceManager: " + e);
            } catch (Exception e2) {
                string = e2.toString();
                Log.w(f38244b, "Failed to get CustomAudienceManager: " + e2);
            }
            if (f38245c) {
                return;
            }
            zo3 zo3Var = f38248f;
            if (zo3Var == null) {
                fa4.m11636J("gpsDebugLogger");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            zo3Var.m25724a("gps_pa_failed", bundle);
        } catch (Throwable th) {
            lp1.m16420a(f17.class, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11497b(String str) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (!f38246d) {
                m11496a();
            }
            if (f38245c) {
                m11499d(str, "fb_mobile_app_install");
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11498c(String str, AppEvent appEvent) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            if (!f38246d) {
                m11496a();
            }
            if (f38245c) {
                String string = null;
                try {
                    JSONObject jSONObject = appEvent.f11380a;
                    if (jSONObject != null) {
                        string = jSONObject.getString("_eventName");
                    }
                } catch (JSONException unused) {
                    Log.w(f38244b, "Failed to get event name from event.");
                }
                m11499d(str, string);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11499d(String str, String str2) {
        String str3 = f38244b;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            String strM11500e = m11500e(str, str2);
            if (strM11500e == null) {
                return;
            }
            try {
                e17 e17Var = new e17();
                ot5.m18501t();
                AdData.Builder builderM18484c = ot5.m18484c();
                String str4 = f38249g;
                if (str4 == null) {
                    fa4.m11636J("baseUri");
                    throw null;
                }
                Uri uri = Uri.parse(str4.concat("/ad"));
                uri.getClass();
                AdData adDataBuild = builderM18484c.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                adDataBuild.getClass();
                ot5.m18478A();
                TrustedBiddingData.Builder builderM18497p = ot5.m18497p();
                String str5 = f38249g;
                if (str5 == null) {
                    fa4.m11636J("baseUri");
                    throw null;
                }
                Uri uri2 = Uri.parse(str5.concat("?trusted_bidding"));
                uri2.getClass();
                TrustedBiddingData trustedBiddingDataBuild = builderM18497p.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(vz1.m23604J("")).build();
                trustedBiddingDataBuild.getClass();
                ot5.m18480C();
                CustomAudience.Builder buyer = ot5.m18490i().setName(strM11500e).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb = new StringBuilder();
                String str6 = f38249g;
                if (str6 == null) {
                    fa4.m11636J("baseUri");
                    throw null;
                }
                sb.append(str6);
                sb.append("?daily&app_id=");
                sb.append(str);
                Uri uri3 = Uri.parse(sb.toString());
                uri3.getClass();
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                String str7 = f38249g;
                if (str7 == null) {
                    fa4.m11636J("baseUri");
                    throw null;
                }
                Uri uri4 = Uri.parse(str7.concat("?bidding"));
                uri4.getClass();
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(vz1.m23604J(adDataBuild)).build();
                customAudienceBuild.getClass();
                ot5.m18481D();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = ot5.m18496o().setCustomAudience(customAudienceBuild).build();
                joinCustomAudienceRequestBuild.getClass();
                CustomAudienceManager customAudienceManager = f38247e;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), e17Var);
                }
            } catch (Error e) {
                Log.w(str3, "Failed to join Custom Audience: " + e);
                zo3 zo3Var = f38248f;
                if (zo3Var == null) {
                    fa4.m11636J("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e.toString());
                zo3Var.m25724a("gps_pa_failed", bundle);
            } catch (Exception e2) {
                Log.w(str3, "Failed to join Custom Audience: " + e2);
                zo3 zo3Var2 = f38248f;
                if (zo3Var2 == null) {
                    fa4.m11636J("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e2.toString());
                zo3Var2.m25724a("gps_pa_failed", bundle2);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m11500e(String str, String str2) {
        if (!lp1.f49971a.contains(this) && str2 != null) {
            try {
                if (!str2.equals("_removed_") && !vk9.m23380c0(str2, "gps", false)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }
}
