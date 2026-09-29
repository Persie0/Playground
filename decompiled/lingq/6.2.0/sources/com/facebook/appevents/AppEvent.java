package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.AbstractC3194a;
import org.json.JSONException;
import org.json.JSONObject;
import p000.fa4;
import p000.iy5;
import p000.jz6;
import p000.lda;
import p000.lp1;
import p000.p84;
import p000.p88;
import p000.qj5;
import p000.r38;
import p000.rt2;
import p000.st2;
import p000.u91;
import p000.wfb;

/* JADX INFO: loaded from: classes.dex */
public final class AppEvent implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final HashSet f11379f = new HashSet();

    /* JADX INFO: renamed from: a */
    public final JSONObject f11380a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f11381b;

    /* JADX INFO: renamed from: c */
    public final boolean f11382c;

    /* JADX INFO: renamed from: d */
    public final boolean f11383d;

    /* JADX INFO: renamed from: e */
    public final String f11384e;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SerializationProxyV2 implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f11385a;

        /* JADX INFO: renamed from: b */
        public final String f11386b;

        /* JADX INFO: renamed from: c */
        public final boolean f11387c;

        /* JADX INFO: renamed from: d */
        public final boolean f11388d;

        public SerializationProxyV2(String str, String str2, boolean z, boolean z2) {
            this.f11385a = str;
            this.f11386b = str2;
            this.f11387c = z;
            this.f11388d = z2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.f11385a, this.f11386b, this.f11387c, this.f11388d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[PHI: r10
      0x00b4: PHI (r10v21 java.lang.String) = (r10v1 java.lang.String), (r10v1 java.lang.String), (r10v20 java.lang.String) binds: [B:37:0x00b2, B:57:0x00f5, B:54:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid, jz6 jz6Var) throws JSONException {
        JSONObject jSONObject;
        String str3;
        str.getClass();
        str2.getClass();
        this.f11382c = z;
        this.f11383d = z2;
        this.f11384e = str2;
        String str4 = null;
        if (jz6Var != null) {
            try {
                LinkedHashMap linkedHashMap = jz6Var.f46433a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC3194a.m15363P(linkedHashMap.size()));
                for (Object obj : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((OperationalDataEnum) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
                }
                jSONObject = new JSONObject(AbstractC3194a.m15371X(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f11381b = jSONObject;
        wfb.m23903E(str2);
        JSONObject jSONObject2 = new JSONObject();
        p88 p88Var = p88.f55757a;
        Set set = lp1.f49971a;
        if (set.contains(p88.class)) {
            str3 = null;
        } else {
            try {
                if (p88.f55758b) {
                    p88 p88Var2 = p88.f55757a;
                    boolean zContains = false;
                    if (!set.contains(p88Var2)) {
                        try {
                            zContains = p88.f55760d.contains(str2);
                        } catch (Throwable th) {
                            lp1.m16420a(p88Var2, th);
                        }
                    }
                    if (zContains) {
                        str3 = "_removed_";
                    } else {
                        str3 = str2;
                    }
                } else {
                    str3 = str2;
                }
            } catch (Throwable th2) {
                lp1.m16420a(p88.class, th2);
                str3 = null;
            }
        }
        if (fa4.m11650l(str3, str2)) {
            r38 r38Var = r38.f58558a;
            Set set2 = lp1.f49971a;
            if (set2.contains(r38.class)) {
                str2 = str4;
            } else {
                try {
                    if (r38.f58559b) {
                        r38 r38Var2 = r38.f58558a;
                        if (!set2.contains(r38Var2)) {
                            try {
                                for (String str5 : r38.f58560c.keySet()) {
                                    HashSet hashSet = (HashSet) r38.f58560c.get(str5);
                                    if (hashSet != null && hashSet.contains(str2)) {
                                        str4 = str5;
                                        break;
                                    }
                                }
                            } catch (Throwable th3) {
                                lp1.m16420a(r38Var2, th3);
                            }
                        }
                        if (str4 != null) {
                            str2 = str4;
                        }
                    }
                } catch (Throwable th4) {
                    lp1.m16420a(r38.class, th4);
                }
            }
            str3 = str2;
        }
        jSONObject2.put("_eventName", str3);
        jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject2.put("_ui", str);
        if (uuid != null) {
            jSONObject2.put("_session_id", uuid);
        }
        if (bundle != null) {
            String str6 = this.f11384e;
            HashMap map = new HashMap();
            for (String str7 : bundle.keySet()) {
                str7.getClass();
                wfb.m23903E(str7);
                Object obj2 = bundle.get(str7);
                if (!(obj2 instanceof String) && !(obj2 instanceof Number)) {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, str7}, 2)));
                }
                map.put(str7, obj2.toString());
            }
            if (!lp1.f49971a.contains(p84.class)) {
                try {
                    if (p84.f55741c && !map.isEmpty()) {
                        try {
                            List<String> listM22622n1 = u91.m22622n1(map.keySet());
                            JSONObject jSONObject3 = new JSONObject();
                            for (String str8 : listM22622n1) {
                                Object obj3 = map.get(str8);
                                if (obj3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                String str9 = (String) obj3;
                                p84 p84Var = p84.f55740b;
                                if (p84Var.m18974m(str8) || p84Var.m18974m(str9)) {
                                    map.remove(str8);
                                    if (!p84.f55742d) {
                                        str9 = "";
                                    }
                                    jSONObject3.put(str8, str9);
                                }
                            }
                            if (jSONObject3.length() != 0) {
                                String string = jSONObject3.toString();
                                string.getClass();
                                map.put("_onDeviceParams", string);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th5) {
                    lp1.m16420a(p84.class, th5);
                }
            }
            Map mapM16118d = lda.m16118d(map);
            p88 p88Var3 = p88.f55757a;
            if (!lp1.f49971a.contains(p88.class)) {
                try {
                    mapM16118d.getClass();
                    str6.getClass();
                    if (p88.f55758b) {
                        HashMap map2 = new HashMap();
                        for (String str10 : new ArrayList(mapM16118d.keySet())) {
                            String strM18975a = p88.f55757a.m18975a(str6, str10);
                            if (strM18975a != null) {
                                map2.put(str10, strM18975a);
                                mapM16118d.remove(str10);
                            }
                        }
                        if (!map2.isEmpty()) {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry entry : map2.entrySet()) {
                                    jSONObject4.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                mapM16118d.put("_restrictedParams", jSONObject4.toString());
                            } catch (JSONException unused3) {
                            }
                        }
                    }
                } catch (Throwable th6) {
                    lp1.m16420a(p88.class, th6);
                }
            }
            Map mapM16118d2 = lda.m16118d(map);
            st2 st2Var = st2.f61382a;
            if (!lp1.f49971a.contains(st2.class)) {
                try {
                    mapM16118d2.getClass();
                    str6.getClass();
                    if (st2.f61383b) {
                        ArrayList<String> arrayList = new ArrayList(mapM16118d2.keySet());
                        for (rt2 rt2Var : new ArrayList(st2.f61384c)) {
                            if (rt2Var.m20776b().equals(str6)) {
                                for (String str11 : arrayList) {
                                    if (((ArrayList) rt2Var.m20775a()).contains(str11)) {
                                        mapM16118d2.remove(str11);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th7) {
                    lp1.m16420a(st2.class, th7);
                }
            }
            for (String str12 : map.keySet()) {
                jSONObject2.put(str12, map.get(str12));
            }
        }
        if (d != null) {
            jSONObject2.put("_valueToSum", d.doubleValue());
        }
        if (this.f11383d) {
            jSONObject2.put("_inBackground", "1");
        }
        if (this.f11382c) {
            jSONObject2.put("_implicitlyLogged", "1");
        } else {
            iy5 iy5Var = qj5.f57852d;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string2 = jSONObject2.toString();
            string2.getClass();
            iy5.m14198n(loggingBehavior, "AppEvents", "Created app event '%s'", string2);
        }
        this.f11380a = jSONObject2;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f11380a.toString();
        string.getClass();
        String string2 = this.f11381b.toString();
        string2.getClass();
        return new SerializationProxyV2(string, string2, this.f11382c, this.f11383d);
    }

    public final String toString() {
        JSONObject jSONObject = this.f11380a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f11382c), jSONObject.toString()}, 3));
    }

    public AppEvent(String str, String str2, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f11380a = jSONObject;
        this.f11381b = new JSONObject(str2);
        this.f11382c = z;
        String strOptString = jSONObject.optString("_eventName");
        strOptString.getClass();
        this.f11384e = strOptString;
        this.f11383d = z2;
    }
}
