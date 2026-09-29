package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import androidx.activity.RunnableC0191j;
import com.facebook.GraphRequest;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONObject;
import p067d8.C5069i;
import p067d8.C5074n;
import p067d8.C5086z;
import p286o2.RunnableC7907g;
import p291o7.C8004n;
import p385sf.C9000b;
import p394t7.C9217c;
import p527z7.RunnableC10453a;

/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppSettingsManager {

    /* JADX INFO: renamed from: a */
    public static final FetchedAppSettingsManager f11550a = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: b */
    public static final String f11551b = FetchedAppSettingsManager.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    public static final List<String> f11552c = C9000b.m17252r("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f11553d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final AtomicReference<FetchAppSettingState> f11554e = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* JADX INFO: renamed from: f */
    public static final ConcurrentLinkedQueue<InterfaceC2306a> f11555f = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: g */
    public static boolean f11556g;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static FetchAppSettingState[] valuesCustom() {
            FetchAppSettingState[] fetchAppSettingStateArrValuesCustom = values();
            return (FetchAppSettingState[]) Arrays.copyOf(fetchAppSettingStateArrValuesCustom, fetchAppSettingStateArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.FetchedAppSettingsManager$a */
    public interface InterfaceC2306a {
        /* JADX INFO: renamed from: a */
        void mo6675a();

        /* JADX INFO: renamed from: b */
        void mo6676b();
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m6669a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f11552c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = GraphRequest.f11448j;
        GraphRequest graphRequestM6621g = GraphRequest.C2279c.m6621g(null, "app", null);
        graphRequestM6621g.f11459i = true;
        graphRequestM6621g.f11454d = bundle;
        JSONObject jSONObject = graphRequestM6621g.m6606c().f43589d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static final C5074n m6670b(String str) {
        return (C5074n) f11553d.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX INFO: renamed from: c */
    public static final void m6671c() {
        boolean z10;
        boolean z11;
        boolean z12;
        Context contextM15871a = C8004n.m15871a();
        String strM15872b = C8004n.m15872b();
        boolean zM10802A = C5086z.m10802A(strM15872b);
        AtomicReference<FetchAppSettingState> atomicReference = f11554e;
        FetchedAppSettingsManager fetchedAppSettingsManager = f11550a;
        if (zM10802A) {
            atomicReference.set(FetchAppSettingState.ERROR);
            fetchedAppSettingsManager.m6674e();
            return;
        }
        if (f11553d.containsKey(strM15872b)) {
            atomicReference.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.m6674e();
            return;
        }
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        while (true) {
            if (atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != fetchAppSettingState) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            FetchAppSettingState fetchAppSettingState3 = FetchAppSettingState.ERROR;
            FetchAppSettingState fetchAppSettingState4 = FetchAppSettingState.LOADING;
            while (true) {
                if (atomicReference.compareAndSet(fetchAppSettingState3, fetchAppSettingState4)) {
                    z12 = true;
                    break;
                } else if (atomicReference.get() != fetchAppSettingState3) {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                z11 = false;
            }
            if (z11) {
                C8004n.m15873c().execute(new RunnableC10453a(2, contextM15871a, C0166e.m770q(new Object[]{strM15872b}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), strM15872b));
            } else {
                fetchedAppSettingsManager.m6674e();
            }
        }
        z11 = true;
        if (z11) {
            fetchedAppSettingsManager.m6674e();
        } else {
            C8004n.m15873c().execute(new RunnableC10453a(2, contextM15871a, C0166e.m770q(new Object[]{strM15872b}, 1, "com.facebook.internal.APP_SETTINGS.%s", "java.lang.String.format(format, *args)"), strM15872b));
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX INFO: renamed from: d */
    public static C5074n m6672d(String str, JSONObject jSONObject) {
        HashMap map;
        HashMap map2;
        HashMap map3;
        String str2;
        String str3;
        String str4;
        C5069i c5069i;
        JSONArray jSONArray;
        String strOptString;
        JSONArray jSONArrayOptJSONArray;
        int length;
        String str5;
        JSONArray jSONArray2;
        C5074n.a aVar;
        int i10;
        C5207g.m11111f(str, "applicationId");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        C5069i.a aVar2 = C5069i.f32950d;
        String str6 = "name";
        if (jSONArrayOptJSONArray2 == null) {
            c5069i = null;
        } else {
            int length2 = jSONArrayOptJSONArray2.length();
            if (length2 > 0) {
                int i11 = 0;
                HashMap mapM10764c = null;
                HashMap mapM10764c2 = null;
                HashMap mapM10764c3 = null;
                String strOptString2 = null;
                String strOptString3 = null;
                String strOptString4 = null;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                        jSONArray = jSONArrayOptJSONArray2;
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        if (C7661i.m15249O2(strOptString, "other")) {
                            strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapM10764c = C5069i.a.m10764c(jSONObjectOptJSONObject);
                        } else if (C7661i.m15249O2(strOptString, "transient")) {
                            strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapM10764c2 = C5069i.a.m10764c(jSONObjectOptJSONObject);
                        } else if (C7661i.m15249O2(strOptString, "login_recoverable")) {
                            strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapM10764c3 = C5069i.a.m10764c(jSONObjectOptJSONObject);
                        }
                    }
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                    jSONArrayOptJSONArray2 = jSONArray;
                }
                map = mapM10764c;
                map2 = mapM10764c2;
                map3 = mapM10764c3;
                str3 = strOptString2;
                str4 = strOptString3;
                str2 = strOptString4;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            c5069i = new C5069i(map, map2, map3, str2, str3, str4);
        }
        if (c5069i == null) {
            c5069i = aVar2.m10765a();
        }
        C5069i c5069i2 = c5069i;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z10 = (iOptInt & 8) != 0;
        boolean z11 = (iOptInt & 16) != 0;
        boolean z12 = (iOptInt & 32) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        if (jSONArrayOptJSONArray3 != null && C5207g.m11106a(null, Boolean.TRUE)) {
            C9217c c9217c = C9217c.f47826a;
            C9217c.m17565a("OnReceiveMapping", jSONArrayOptJSONArray3.toString());
        }
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", "");
        C5207g.m11110e(strOptString5, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        SmartLoginOption.Companion companion = SmartLoginOption.INSTANCE;
        long jOptLong = jSONObject.optLong("seamless_login");
        companion.getClass();
        EnumSet enumSetM6677a = SmartLoginOption.Companion.m6677a(jOptLong);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map4 = new HashMap();
        if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data")) != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i13);
                C5207g.m11110e(jSONObjectOptJSONObject3, "dialogConfigData.optJSONObject(i)");
                String strOptString6 = jSONObjectOptJSONObject3.optString(str6);
                if (C5086z.m10802A(strOptString6)) {
                    str5 = str6;
                    jSONArray2 = jSONArrayOptJSONArray;
                    aVar = null;
                } else {
                    C5207g.m11110e(strOptString6, "dialogNameWithFeature");
                    int i15 = 0;
                    List listM14299s3 = C7076b.m14299s3(strOptString6, new String[]{"|"}, 0, 6);
                    if (listM14299s3.size() != 2) {
                        str5 = str6;
                        jSONArray2 = jSONArrayOptJSONArray;
                        aVar = null;
                    } else {
                        String str7 = (String) C6752c.m13423Q(listM14299s3);
                        String str8 = (String) C6752c.m13432Z(listM14299s3);
                        if (C5086z.m10802A(str7) || C5086z.m10802A(str8)) {
                            str5 = str6;
                            jSONArray2 = jSONArrayOptJSONArray;
                            aVar = null;
                        } else {
                            String strOptString7 = jSONObjectOptJSONObject3.optString("url");
                            if (!C5086z.m10802A(strOptString7)) {
                                Uri.parse(strOptString7);
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length3 = jSONArrayOptJSONArray4.length();
                                int[] iArr = new int[length3];
                                if (length3 > 0) {
                                    while (true) {
                                        str5 = str6;
                                        int i16 = i15 + 1;
                                        jSONArray2 = jSONArrayOptJSONArray;
                                        int iOptInt3 = jSONArrayOptJSONArray4.optInt(i15, -1);
                                        if (iOptInt3 == -1) {
                                            String strOptString8 = jSONArrayOptJSONArray4.optString(i15);
                                            if (!C5086z.m10802A(strOptString8)) {
                                                try {
                                                    C5207g.m11110e(strOptString8, "versionString");
                                                    i10 = Integer.parseInt(strOptString8);
                                                } catch (NumberFormatException e10) {
                                                    C5086z.m10806E("FacebookSDK", e10);
                                                    i10 = -1;
                                                }
                                                iOptInt3 = i10;
                                            }
                                        }
                                        iArr[i15] = iOptInt3;
                                        if (i16 >= length3) {
                                            break;
                                        }
                                        i15 = i16;
                                        str6 = str5;
                                        jSONArrayOptJSONArray = jSONArray2;
                                    }
                                } else {
                                    str5 = str6;
                                    jSONArray2 = jSONArrayOptJSONArray;
                                }
                            } else {
                                str5 = str6;
                                jSONArray2 = jSONArrayOptJSONArray;
                            }
                            aVar = new C5074n.a(str7, str8);
                        }
                    }
                }
                if (aVar != null) {
                    String str9 = aVar.f32982a;
                    Map map5 = (Map) map4.get(str9);
                    if (map5 == null) {
                        map5 = new HashMap();
                        map4.put(str9, map5);
                    }
                    map5.put(aVar.f32983b, aVar);
                }
                if (i14 >= length) {
                    break;
                }
                i13 = i14;
                str6 = str5;
                jSONArrayOptJSONArray = jSONArray2;
            }
        }
        String strOptString9 = jSONObject.optString("smart_login_bookmark_icon_url");
        C5207g.m11110e(strOptString9, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString10 = jSONObject.optString("smart_login_menu_icon_url");
        C5207g.m11110e(strOptString10, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString11 = jSONObject.optString("sdk_update_message");
        C5207g.m11110e(strOptString11, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C5074n c5074n = new C5074n(zOptBoolean, strOptString5, zOptBoolean2, iOptInt2, enumSetM6677a, map4, z10, c5069i2, strOptString9, strOptString10, z11, z12, jSONArrayOptJSONArray3, strOptString11, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        f11553d.put(str, c5074n);
        return c5074n;
    }

    /* JADX INFO: renamed from: f */
    public static final C5074n m6673f(String str, boolean z10) {
        C5207g.m11111f(str, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f11553d;
            if (concurrentHashMap.containsKey(str)) {
                return (C5074n) concurrentHashMap.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f11550a;
        fetchedAppSettingsManager.getClass();
        C5074n c5074nM6672d = m6672d(str, m6669a());
        if (C5207g.m11106a(str, C8004n.m15872b())) {
            f11554e.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.m6674e();
        }
        return c5074nM6672d;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6674e() {
        try {
            FetchAppSettingState fetchAppSettingState = f11554e.get();
            if (FetchAppSettingState.NOT_LOADED == fetchAppSettingState || FetchAppSettingState.LOADING == fetchAppSettingState) {
                return;
            }
            C5074n c5074n = (C5074n) f11553d.get(C8004n.m15872b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC2306a> concurrentLinkedQueue = f11555f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    handler.post(new RunnableC0191j(8, concurrentLinkedQueue.poll()));
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC2306a> concurrentLinkedQueue2 = f11555f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new RunnableC7907g(concurrentLinkedQueue2.poll(), 7, c5074n));
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
