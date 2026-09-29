package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType;
import com.facebook.appevents.internal.C0926a;
import com.facebook.internal.FeatureManager$Feature;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gs */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3049gs {

    /* JADX INFO: renamed from: a */
    public static final HashMap f41253a = AbstractC3194a.m15362O(new Pair(AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new Pair(AppEventsLoggerUtility$GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: renamed from: a */
    public static final JSONObject m12857a(AppEventsLoggerUtility$GraphAPIActivityType appEventsLoggerUtility$GraphAPIActivityType, C3388nx c3388nx, String str, boolean z, Context context) throws JSONException {
        String strM3962m0;
        appEventsLoggerUtility$GraphAPIActivityType.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f41253a.get(appEventsLoggerUtility$GraphAPIActivityType));
        if (!AbstractC3609tf.f62210c) {
            Log.w("tf", "initStore should have been called before calling setUserID");
            AbstractC3609tf.m22023a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = AbstractC3609tf.f62208a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = AbstractC3609tf.f62209b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            FeatureManager$Feature featureManager$Feature = FeatureManager$Feature.ServiceUpdateCompliance;
            if (!p13.m18852b(featureManager$Feature)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            sy2 sy2Var = sy2.f61585a;
            jSONObject.put("advertiser_id_collection_enabled", ema.m11255b());
            String string = null;
            if (c3388nx != null) {
                if (p13.m18852b(featureManager$Feature) && (Build.VERSION.SDK_INT < 31 || !bna.m3943c0(context) || !c3388nx.f53350e)) {
                    jSONObject.put("anon_id", str);
                }
                if (c3388nx.f53348c != null && (!p13.m18852b(featureManager$Feature) || Build.VERSION.SDK_INT < 31 || !bna.m3943c0(context) || !c3388nx.f53350e)) {
                    jSONObject.put("attribution", c3388nx.f53348c);
                }
                if (c3388nx.m17663a() != null) {
                    jSONObject.put("advertiser_id", c3388nx.m17663a());
                    jSONObject.put("advertiser_tracking_enabled", !c3388nx.f53350e);
                }
                if (!c3388nx.f53350e) {
                    vja vjaVar = vja.f65509a;
                    if (lp1.f49971a.contains(vja.class)) {
                        strM3962m0 = null;
                    } else {
                        try {
                            if (!vja.f65511c.get()) {
                                vjaVar.m23352b();
                            }
                            HashMap map = new HashMap();
                            map.putAll(vja.f65512d);
                            map.putAll(vjaVar.m23351a());
                            strM3962m0 = bna.m3962m0(map);
                        } catch (Throwable th) {
                            lp1.m16420a(vja.class, th);
                            strM3962m0 = null;
                        }
                    }
                    if (strM3962m0.length() != 0) {
                        jSONObject.put("ud", strM3962m0);
                    }
                }
                String str3 = c3388nx.f53349d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            C0926a c0926aM18906g = C0926a.f11409b.m18906g();
            if (c0926aM18906g != null && !lp1.f49971a.contains(c0926aM18906g)) {
                try {
                    string = c0926aM18906g.m5194a().getString("campaign_ids", null);
                } catch (Throwable th2) {
                    lp1.m16420a(c0926aM18906g, th2);
                }
            }
            if (string != null) {
                jSONObject.put("campaign_ids", string);
            }
            try {
                bna.m3976t0(jSONObject, context);
            } catch (Exception e) {
                iy5 iy5Var = qj5.f57852d;
                iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
            }
            JSONObject jSONObjectM3930S = bna.m3930S();
            if (jSONObjectM3930S != null) {
                Iterator<String> itKeys = jSONObjectM3930S.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM3930S.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            AbstractC3609tf.f62208a.readLock().unlock();
            throw th3;
        }
    }
}
