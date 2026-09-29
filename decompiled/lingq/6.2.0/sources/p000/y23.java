package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState;
import com.facebook.internal.SmartLoginOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y23 {

    /* JADX INFO: renamed from: a */
    public static final y23 f69121a = new y23();

    /* JADX INFO: renamed from: b */
    public static final List f69122b = vz1.m23605K("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", ux5.m22992o(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f69123c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f69124d = new AtomicReference(FetchedAppSettingsManager$FetchAppSettingState.NOT_LOADED);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentLinkedQueue f69125e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f */
    public static volatile boolean f69126f;

    /* JADX INFO: renamed from: a */
    public static JSONObject m24853a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f69122b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = mp3.f51688j;
        mp3 mp3VarM21068p = s46.m21068p(null, "app", null);
        mp3VarM21068p.f51699i = true;
        mp3VarM21068p.f51694d = bundle;
        JSONObject jSONObject = mp3VarM21068p.m16982c().f56630d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static final w23 m24854b(String str) {
        return (w23) f69123c.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static final HashMap m24855c() {
        JSONObject jSONObject;
        String string = sy2.m21766a().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{sy2.m21767b()}, 1)), null);
        if (!bna.m3945d0(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    sy2 sy2Var = sy2.f61585a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return m24860h(jSONObject);
                }
            } else {
                C3386nv.m17633t("Required value was null.");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m24856d() {
        Context contextM21766a = sy2.m21766a();
        String strM21767b = sy2.m21767b();
        boolean zM3945d0 = bna.m3945d0(strM21767b);
        y23 y23Var = f69121a;
        AtomicReference atomicReference = f69124d;
        if (zM3945d0) {
            atomicReference.set(FetchedAppSettingsManager$FetchAppSettingState.ERROR);
            y23Var.m24863j();
            return;
        }
        if (f69123c.containsKey(strM21767b)) {
            atomicReference.set(FetchedAppSettingsManager$FetchAppSettingState.SUCCESS);
            y23Var.m24863j();
            return;
        }
        FetchedAppSettingsManager$FetchAppSettingState fetchedAppSettingsManager$FetchAppSettingState = FetchedAppSettingsManager$FetchAppSettingState.NOT_LOADED;
        FetchedAppSettingsManager$FetchAppSettingState fetchedAppSettingsManager$FetchAppSettingState2 = FetchedAppSettingsManager$FetchAppSettingState.LOADING;
        while (!atomicReference.compareAndSet(fetchedAppSettingsManager$FetchAppSettingState, fetchedAppSettingsManager$FetchAppSettingState2)) {
            if (atomicReference.get() != fetchedAppSettingsManager$FetchAppSettingState) {
                FetchedAppSettingsManager$FetchAppSettingState fetchedAppSettingsManager$FetchAppSettingState3 = FetchedAppSettingsManager$FetchAppSettingState.ERROR;
                FetchedAppSettingsManager$FetchAppSettingState fetchedAppSettingsManager$FetchAppSettingState4 = FetchedAppSettingsManager$FetchAppSettingState.LOADING;
                while (!atomicReference.compareAndSet(fetchedAppSettingsManager$FetchAppSettingState3, fetchedAppSettingsManager$FetchAppSettingState4)) {
                    if (atomicReference.get() != fetchedAppSettingsManager$FetchAppSettingState3) {
                        y23Var.m24863j();
                        return;
                    }
                }
                break;
            }
        }
        sy2.m21768c().execute(new u23(contextM21766a, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM21767b}, 1)), strM21767b));
    }

    /* JADX INFO: renamed from: e */
    public static w23 m24857e(String str, JSONObject jSONObject) {
        qy2 qy2Var;
        String strOptString;
        Long lValueOf;
        JSONArray jSONArrayOptJSONArray;
        Map map;
        str.getClass();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        if (jSONArrayOptJSONArray2 == null) {
            qy2Var = null;
        } else {
            int length = jSONArrayOptJSONArray2.length();
            HashMap mapM18965l = null;
            HashMap mapM18965l2 = null;
            HashMap mapM18965l3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (strOptString.equalsIgnoreCase("other")) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM18965l = p84.m18965l(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("transient")) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM18965l2 = p84.m18965l(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM18965l3 = p84.m18965l(jSONObjectOptJSONObject);
                    }
                }
            }
            qy2Var = new qy2(mapM18965l, mapM18965l2, mapM18965l3, strOptString2, strOptString3, strOptString4);
        }
        if (qy2Var == null) {
            qy2Var = qy2.f58369d.m18972i();
        }
        qy2 qy2Var2 = qy2Var;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("app_events_config");
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", "");
        strOptString5.getClass();
        jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        qb9 qb9Var = SmartLoginOption.Companion;
        long jOptLong = jSONObject.optLong("seamless_login");
        qb9Var.getClass();
        EnumSet enumSetM19848a = qb9.m19848a(jOptLong);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map2 = new HashMap();
        if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("data")) != null) {
            int length2 = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                jSONObjectOptJSONObject4.getClass();
                mp2 mp2VarM12505a = gdd.m12505a(jSONObjectOptJSONObject4);
                if (mp2VarM12505a != null) {
                    String strM16977a = mp2VarM12505a.m16977a();
                    Map map3 = (Map) map2.get(strM16977a);
                    if (map3 == null) {
                        map = new HashMap();
                        map2.put(strM16977a, map);
                    } else {
                        map = map3;
                    }
                    map.put(mp2VarM12505a.m16978b(), mp2VarM12505a);
                }
            }
        }
        String strOptString6 = jSONObject.optString("smart_login_bookmark_icon_url");
        strOptString6.getClass();
        String strOptString7 = jSONObject.optString("smart_login_menu_icon_url");
        strOptString7.getClass();
        String strOptString8 = jSONObject.optString("sdk_update_message");
        strOptString8.getClass();
        String strOptString9 = jSONObject.optString("aam_rules");
        String strOptString10 = jSONObject.optString("suggested_events_setting");
        String strOptString11 = jSONObject.optString("restrictive_data_filter_params");
        JSONArray jSONArrayM24861i = m24861i("standard_params", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayM24861i2 = m24861i("maca_rules", jSONObject.optJSONObject("protected_mode_rules"));
        m24860h(jSONObject);
        JSONArray jSONArrayM24861i3 = m24861i("blocklist_events", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayM24861i4 = m24861i("redacted_events", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayM24861i5 = m24861i("sensitive_params", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayM24861i6 = m24861i("standard_params_schema", jSONObject.optJSONObject("protected_mode_rules"));
        JSONArray jSONArrayM24861i7 = m24861i("standard_params_blocked", jSONObject.optJSONObject("protected_mode_rules"));
        ArrayList arrayListM24858f = m24858f("fb_currency", jSONObjectOptJSONObject2);
        ArrayList arrayListM24858f2 = m24858f("_valueToSum", jSONObjectOptJSONObject2);
        ArrayList arrayListM24859g = m24859g(jSONObjectOptJSONObject2, false);
        ArrayList arrayListM24859g2 = m24859g(jSONObjectOptJSONObject2, true);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_events_config");
        if (jSONObjectOptJSONObject5 != null) {
            try {
                lValueOf = Long.valueOf(jSONObjectOptJSONObject5.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        w23 w23Var = new w23(zOptBoolean, strOptString5, iOptInt2, enumSetM19848a, map2, z, qy2Var2, strOptString6, strOptString7, z2, z3, jSONArrayOptJSONArray3, strOptString8, strOptString9, strOptString10, strOptString11, jSONArrayM24861i, jSONArrayM24861i2, jSONArrayM24861i3, jSONArrayM24861i4, jSONArrayM24861i5, jSONArrayM24861i6, jSONArrayM24861i7, arrayListM24858f, arrayListM24858f2, arrayListM24859g, arrayListM24859g2, lValueOf);
        f69123c.put(str, w23Var);
        return w23Var;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m24858f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (fa4.m11650l(jSONObject2.getString("key"), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                        if (fa4.m11650l(jSONObject3.getString("key"), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m24859g(JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("key");
            if ((!fa4.m11650l(string, "prod_keys") || !z) && (!fa4.m11650l(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString("key");
                    if (!fa4.m11650l(string2, "_valueToSum") && !fa4.m11650l(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i3).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static HashMap m24860h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                sy2 sy2Var = sy2.f61585a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                sy2 sy2Var2 = sy2.f61585a;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static JSONArray m24861i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final w23 m24862k(String str, boolean z) {
        str.getClass();
        if (!z) {
            ConcurrentHashMap concurrentHashMap = f69123c;
            if (concurrentHashMap.containsKey(str)) {
                return (w23) concurrentHashMap.get(str);
            }
        }
        w23 w23VarM24857e = m24857e(str, m24853a());
        if (str.equals(sy2.m21767b())) {
            f69124d.set(FetchedAppSettingsManager$FetchAppSettingState.SUCCESS);
            f69121a.m24863j();
        }
        return w23VarM24857e;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m24863j() {
        FetchedAppSettingsManager$FetchAppSettingState fetchedAppSettingsManager$FetchAppSettingState = (FetchedAppSettingsManager$FetchAppSettingState) f69124d.get();
        if (FetchedAppSettingsManager$FetchAppSettingState.NOT_LOADED != fetchedAppSettingsManager$FetchAppSettingState && FetchedAppSettingsManager$FetchAppSettingState.LOADING != fetchedAppSettingsManager$FetchAppSettingState) {
            w23 w23Var = (w23) f69123c.get(sy2.m21767b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchedAppSettingsManager$FetchAppSettingState.ERROR == fetchedAppSettingsManager$FetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f69125e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new x23((C3086hs) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f69125e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new x23((C3086hs) concurrentLinkedQueue2.poll(), w23Var));
                    }
                }
            }
        }
    }
}
