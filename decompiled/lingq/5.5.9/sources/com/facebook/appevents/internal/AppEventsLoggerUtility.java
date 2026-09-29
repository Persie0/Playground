package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import dm.C5207g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5055a;
import p067d8.C5078r;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C7993c0;
import p291o7.C8004n;
import p317p7.C8195b;
import p317p7.C8206m;

/* JADX INFO: loaded from: classes.dex */
public final class AppEventsLoggerUtility {

    /* JADX INFO: renamed from: a */
    public static final HashMap f11523a = C6753d.m13461N0(new Pair(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new Pair(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static GraphAPIActivityType[] valuesCustom() {
            GraphAPIActivityType[] graphAPIActivityTypeArrValuesCustom = values();
            return (GraphAPIActivityType[]) Arrays.copyOf(graphAPIActivityTypeArrValuesCustom, graphAPIActivityTypeArrValuesCustom.length);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final JSONObject m6648a(GraphAPIActivityType graphAPIActivityType, C5055a c5055a, String str, boolean z10, Context context) throws JSONException {
        String strM10808G;
        boolean z11;
        C5207g.m11111f(graphAPIActivityType, "activityType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f11523a.get(graphAPIActivityType));
        C8195b c8195b = C8195b.f44375a;
        if (!C8195b.f44379e) {
            Log.w(C8195b.f44376b, "initStore should have been called before calling setUserID");
            C8195b.f44375a.getClass();
            C8195b.m16318a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = C8195b.f44377c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = C8195b.f44378d;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            C5086z c5086z = C5086z.f33015a;
            FeatureManager featureManager = FeatureManager.f11546a;
            FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
            if (!FeatureManager.m6666c(feature)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z10);
            C8004n c8004n = C8004n.f43550a;
            jSONObject.put("advertiser_id_collection_enabled", C7993c0.m15848a());
            if (c5055a != null) {
                boolean zM6666c = FeatureManager.m6666c(feature);
                C5086z c5086z2 = C5086z.f33015a;
                if (zM6666c) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        c5086z2.getClass();
                        if (!C5086z.m10841z(context) || !c5055a.f32906e) {
                            jSONObject.put("anon_id", str);
                        }
                    } else {
                        c5086z2.getClass();
                    }
                    jSONObject.put("anon_id", str);
                }
                if (c5055a.f32904c != null) {
                    if (FeatureManager.m6666c(feature)) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            c5086z2.getClass();
                            if (!C5086z.m10841z(context) || !c5055a.f32906e) {
                                jSONObject.put("attribution", c5055a.f32904c);
                            }
                        } else {
                            c5086z2.getClass();
                        }
                        jSONObject.put("attribution", c5055a.f32904c);
                    } else {
                        jSONObject.put("attribution", c5055a.f32904c);
                    }
                }
                if (c5055a.m10737a() != null) {
                    jSONObject.put("advertiser_id", c5055a.m10737a());
                    jSONObject.put("advertiser_tracking_enabled", !c5055a.f32906e);
                }
                if (!c5055a.f32906e) {
                    C8206m c8206m = C8206m.f44408a;
                    if (!C6205a.m12742b(C8206m.class)) {
                        try {
                            boolean z12 = C8206m.f44411d.get();
                            C8206m c8206m2 = C8206m.f44408a;
                            if (!z12) {
                                c8206m2.m16348b();
                            }
                            HashMap map = new HashMap();
                            map.putAll(C8206m.f44412e);
                            map.putAll(c8206m2.m16347a());
                            strM10808G = C5086z.m10808G(map);
                        } catch (Throwable th2) {
                            C6205a.m12741a(C8206m.class, th2);
                            strM10808G = null;
                        }
                        if (strM10808G.length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            jSONObject.put("ud", strM10808G);
                        }
                    }
                    strM10808G = null;
                    if (strM10808G.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        jSONObject.put("ud", strM10808G);
                    }
                }
                String str3 = c5055a.f32905d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            try {
                C5086z.m10813L(context, jSONObject);
            } catch (Exception e10) {
                C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
            }
            JSONObject jSONObjectM10830o = C5086z.m10830o();
            if (jSONObjectM10830o != null) {
                Iterator<String> itKeys = jSONObjectM10830o.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM10830o.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            C8195b.f44377c.readLock().unlock();
            throw th3;
        }
    }
}
