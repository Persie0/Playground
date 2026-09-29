package com.facebook.appevents.cloudbridge;

import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.C2294a;
import dm.C5206f;
import dm.C5207g;
import dm.C5213m;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jm.C6526i;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.text.C7076b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003a2.C0009a;
import p067d8.C5078r;
import p067d8.C5086z;
import p260m8.C7499b;
import p291o7.C8004n;
import p349qo.C8656b;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2294a {

    /* JADX INFO: renamed from: a */
    public static final HashSet<Integer> f11502a = C7499b.m14921S(200, 202);

    /* JADX INFO: renamed from: b */
    public static final HashSet<Integer> f11503b = C7499b.m14921S(503, 504, 429);

    /* JADX INFO: renamed from: c */
    public static a f11504c;

    /* JADX INFO: renamed from: d */
    public static List<Map<String, Object>> f11505d;

    /* JADX INFO: renamed from: e */
    public static int f11506e;

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f11507a;

        /* JADX INFO: renamed from: b */
        public final String f11508b;

        /* JADX INFO: renamed from: c */
        public final String f11509c;

        public a(String str, String str2, String str3) {
            C5207g.m11111f(str2, "cloudBridgeURL");
            this.f11507a = str;
            this.f11508b = str2;
            this.f11509c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f11507a, aVar.f11507a) && C5207g.m11106a(this.f11508b, aVar.f11508b) && C5207g.m11106a(this.f11509c, aVar.f11509c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f11509c.hashCode() + C0166e.m758d(this.f11508b, this.f11507a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb2.append(this.f11507a);
            sb2.append(", cloudBridgeURL=");
            sb2.append(this.f11508b);
            sb2.append(", accessKey=");
            return C0009a.m22j(sb2, this.f11509c, ')');
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x0487  */
    /* JADX WARN: Code duplicated, block: B:202:0x049f  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:209:0x0512  */
    /* JADX WARN: Code duplicated, block: B:212:0x0569 A[Catch: IOException -> 0x0652, UnknownHostException -> 0x0667, TryCatch #5 {IOException -> 0x0652, blocks: (B:210:0x055e, B:212:0x0569, B:219:0x0591, B:221:0x059b, B:226:0x05ac, B:228:0x05e9, B:234:0x0605, B:241:0x060e, B:242:0x0611, B:243:0x0612, B:245:0x0626, B:246:0x0628, B:248:0x0631, B:249:0x0633, B:215:0x0577, B:216:0x057b, B:218:0x0581, B:254:0x064a, B:255:0x0651), top: B:282:0x055e }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0576  */
    /* JADX WARN: Code duplicated, block: B:215:0x0577 A[Catch: IOException -> 0x0652, UnknownHostException -> 0x0667, TryCatch #5 {IOException -> 0x0652, blocks: (B:210:0x055e, B:212:0x0569, B:219:0x0591, B:221:0x059b, B:226:0x05ac, B:228:0x05e9, B:234:0x0605, B:241:0x060e, B:242:0x0611, B:243:0x0612, B:245:0x0626, B:246:0x0628, B:248:0x0631, B:249:0x0633, B:215:0x0577, B:216:0x057b, B:218:0x0581, B:254:0x064a, B:255:0x0651), top: B:282:0x055e }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0581 A[Catch: IOException -> 0x0652, UnknownHostException -> 0x0667, LOOP:3: B:216:0x057b->B:218:0x0581, LOOP_END, TryCatch #5 {IOException -> 0x0652, blocks: (B:210:0x055e, B:212:0x0569, B:219:0x0591, B:221:0x059b, B:226:0x05ac, B:228:0x05e9, B:234:0x0605, B:241:0x060e, B:242:0x0611, B:243:0x0612, B:245:0x0626, B:246:0x0628, B:248:0x0631, B:249:0x0633, B:215:0x0577, B:216:0x057b, B:218:0x0581, B:254:0x064a, B:255:0x0651), top: B:282:0x055e }] */
    /* JADX WARN: Code duplicated, block: B:225:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:228:0x05e9 A[Catch: IOException -> 0x0652, UnknownHostException -> 0x0667, TRY_LEAVE, TryCatch #5 {IOException -> 0x0652, blocks: (B:210:0x055e, B:212:0x0569, B:219:0x0591, B:221:0x059b, B:226:0x05ac, B:228:0x05e9, B:234:0x0605, B:241:0x060e, B:242:0x0611, B:243:0x0612, B:245:0x0626, B:246:0x0628, B:248:0x0631, B:249:0x0633, B:215:0x0577, B:216:0x057b, B:218:0x0581, B:254:0x064a, B:255:0x0651), top: B:282:0x055e }] */
    /* JADX WARN: Code duplicated, block: B:231:0x05fd A[Catch: all -> 0x0609, LOOP:2: B:280:0x05f7->B:231:0x05fd, LOOP_END, TryCatch #4 {all -> 0x0609, blocks: (B:229:0x05f7, B:231:0x05fd, B:232:0x0601), top: B:280:0x05f7 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x064a A[Catch: IOException -> 0x0652, UnknownHostException -> 0x0667, TryCatch #5 {IOException -> 0x0652, blocks: (B:210:0x055e, B:212:0x0569, B:219:0x0591, B:221:0x059b, B:226:0x05ac, B:228:0x05e9, B:234:0x0605, B:241:0x060e, B:242:0x0611, B:243:0x0612, B:245:0x0626, B:246:0x0628, B:248:0x0631, B:249:0x0633, B:215:0x0577, B:216:0x057b, B:218:0x0581, B:254:0x064a, B:255:0x0651), top: B:282:0x055e }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0687  */
    /* JADX WARN: Code duplicated, block: B:291:0x0601 A[EDGE_INSN: B:291:0x0601->B:232:0x0601 BREAK  A[LOOP:2: B:280:0x05f7->B:231:0x05fd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static void m6644a(GraphRequest graphRequest) {
        String str;
        String str2;
        String str3;
        String str4;
        ?? M17251q;
        int iMax;
        List listM6646c;
        C6526i c6526i;
        final List listM13453u0;
        LinkedHashMap linkedHashMap;
        a aVar;
        String str5;
        String string;
        Map mapM14943h0;
        InterfaceC2056p<String, Integer, C9072e> interfaceC2056p;
        int i10;
        char c10;
        URLConnection uRLConnectionOpenConnection;
        HttpURLConnection httpURLConnection;
        String str6;
        Set<String> setKeySet;
        boolean z10;
        StringBuilder sb2;
        BufferedReader bufferedReader;
        String line;
        AppEventUserAndAppDataField appEventUserAndAppDataField;
        String str7;
        AppEventsConversionsAPITransformer.DataProcessingParameterName dataProcessingParameterName;
        ArrayList arrayList;
        CustomEventField customEventField;
        String str8 = "POST";
        C5207g.m11111f(graphRequest, "$request");
        String str9 = graphRequest.f11452b;
        List listM14299s3 = str9 == null ? null : C7076b.m14299s3(str9, new String[]{"/"}, 0, 6);
        String str10 = "CAPITransformerWebRequests";
        if (listM14299s3 == null || listM14299s3.size() != 2) {
            C5078r.f32986e.m10781c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            a aVar2 = f11504c;
            String str11 = "credentials";
            if (aVar2 == null) {
                C5207g.m11117l("credentials");
                throw null;
            }
            String str12 = aVar2.f11508b;
            if (aVar2 == null) {
                C5207g.m11117l("credentials");
                throw null;
            }
            String str13 = str12 + "/capi/" + aVar2.f11507a + "/events";
            JSONObject jSONObject = graphRequest.f11453c;
            if (jSONObject != null) {
                LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0(C5086z.m10823h(jSONObject));
                Object obj = graphRequest.f11455e;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                linkedHashMapM13467T0.put("custom_events", obj);
                StringBuilder sb3 = new StringBuilder();
                for (String str14 : linkedHashMapM13467T0.keySet()) {
                    sb3.append(str14);
                    sb3.append(" : ");
                    sb3.append(linkedHashMapM13467T0.get(str14));
                    sb3.append(System.getProperty("line.separator"));
                }
                C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb3);
                Map<AppEventUserAndAppDataField, AppEventsConversionsAPITransformer.C2290b> map = AppEventsConversionsAPITransformer.f11491a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayList<Map> arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Object obj2 = linkedHashMapM13467T0.get(OtherEventConstants.EVENT.getRawValue());
                AppEventType.Companion companion = AppEventType.INSTANCE;
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str15 = (String) obj2;
                companion.getClass();
                AppEventType appEventType = C5207g.m11106a(str15, "MOBILE_APP_INSTALL") ? AppEventType.MOBILE_APP_INSTALL : C5207g.m11106a(str15, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
                if (appEventType != AppEventType.OTHER) {
                    for (Map.Entry entry : linkedHashMapM13467T0.entrySet()) {
                        String str16 = (String) entry.getKey();
                        Object value = entry.getValue();
                        AppEventUserAndAppDataField.INSTANCE.getClass();
                        String str17 = str11;
                        String str18 = "rawValue";
                        C5207g.m11111f(str16, "rawValue");
                        AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArrValuesCustom = AppEventUserAndAppDataField.valuesCustom();
                        String str19 = str8;
                        int length = appEventUserAndAppDataFieldArrValuesCustom.length;
                        String str20 = str10;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                appEventUserAndAppDataField = null;
                                break;
                            }
                            AppEventUserAndAppDataField appEventUserAndAppDataField2 = appEventUserAndAppDataFieldArrValuesCustom[i11];
                            AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArr = appEventUserAndAppDataFieldArrValuesCustom;
                            if (C5207g.m11106a(appEventUserAndAppDataField2.getRawValue(), str16)) {
                                appEventUserAndAppDataField = appEventUserAndAppDataField2;
                                break;
                            } else {
                                i11++;
                                appEventUserAndAppDataFieldArrValuesCustom = appEventUserAndAppDataFieldArr;
                            }
                        }
                        if (appEventUserAndAppDataField != null) {
                            C5207g.m11111f(value, "value");
                            Map<AppEventUserAndAppDataField, AppEventsConversionsAPITransformer.C2290b> map2 = AppEventsConversionsAPITransformer.f11491a;
                            AppEventsConversionsAPITransformer.C2290b c2290b = map2.get(appEventUserAndAppDataField);
                            if (c2290b != null) {
                                int i12 = AppEventsConversionsAPITransformer.C2291c.f11499b[c2290b.f11496a.ordinal()];
                                if (i12 == 1) {
                                    str7 = str13;
                                    AppEventsConversionsAPITransformer.C2290b c2290b2 = map2.get(appEventUserAndAppDataField);
                                    ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = c2290b2 == null ? null : c2290b2.f11497b;
                                    if (conversionsAPIUserAndAppDataField != null) {
                                        linkedHashMap3.put(conversionsAPIUserAndAppDataField.getRawValue(), value);
                                    }
                                } else if (i12 != 2) {
                                    str7 = str13;
                                } else if (appEventUserAndAppDataField == AppEventUserAndAppDataField.USER_DATA) {
                                    try {
                                        C5086z c5086z = C5086z.f33015a;
                                        linkedHashMap2.putAll(C5086z.m10823h(new JSONObject((String) value)));
                                        str7 = str13;
                                    } catch (JSONException e10) {
                                        str7 = str13;
                                        C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
                                    }
                                } else {
                                    str7 = str13;
                                    AppEventsConversionsAPITransformer.C2290b c2290b3 = map2.get(appEventUserAndAppDataField);
                                    ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField2 = c2290b3 == null ? null : c2290b3.f11497b;
                                    if (conversionsAPIUserAndAppDataField2 != null) {
                                        linkedHashMap2.put(conversionsAPIUserAndAppDataField2.getRawValue(), value);
                                    }
                                }
                            } else {
                                str7 = str13;
                            }
                            linkedHashMap3 = linkedHashMap3;
                        } else {
                            str7 = str13;
                            boolean zM11106a = C5207g.m11106a(str16, ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                            boolean z11 = value instanceof String;
                            if (appEventType == AppEventType.CUSTOM && zM11106a && z11) {
                                String str21 = (String) value;
                                C5207g.m11111f(str21, "appEvents");
                                ArrayList arrayList3 = new ArrayList();
                                try {
                                    C5086z c5086z2 = C5086z.f33015a;
                                    for (String str22 : C5086z.m10822g(new JSONArray(str21))) {
                                        C5086z c5086z3 = C5086z.f33015a;
                                        arrayList3.add(C5086z.m10823h(new JSONObject(str22)));
                                    }
                                    if (arrayList3.isEmpty()) {
                                        arrayList = null;
                                    } else {
                                        arrayList = new ArrayList();
                                        Iterator it = arrayList3.iterator();
                                        while (it.hasNext()) {
                                            Map map3 = (Map) it.next();
                                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                            for (String str23 : map3.keySet()) {
                                                CustomEventField.INSTANCE.getClass();
                                                C5207g.m11111f(str23, str18);
                                                Iterator it2 = it;
                                                CustomEventField[] customEventFieldArrValuesCustom = CustomEventField.valuesCustom();
                                                String str24 = str18;
                                                int length2 = customEventFieldArrValuesCustom.length;
                                                LinkedHashMap linkedHashMap7 = linkedHashMap3;
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 >= length2) {
                                                        customEventField = null;
                                                        break;
                                                    }
                                                    CustomEventField customEventField2 = customEventFieldArrValuesCustom[i13];
                                                    CustomEventField[] customEventFieldArr = customEventFieldArrValuesCustom;
                                                    if (C5207g.m11106a(customEventField2.getRawValue(), str23)) {
                                                        customEventField = customEventField2;
                                                        break;
                                                    } else {
                                                        i13++;
                                                        customEventFieldArrValuesCustom = customEventFieldArr;
                                                    }
                                                }
                                                AppEventsConversionsAPITransformer.C2289a c2289a = AppEventsConversionsAPITransformer.f11492b.get(customEventField);
                                                if (customEventField != null && c2289a != null) {
                                                    ConversionsAPICustomEventField conversionsAPICustomEventField = c2289a.f11495b;
                                                    ConversionsAPISection conversionsAPISection = c2289a.f11494a;
                                                    if (conversionsAPISection == null) {
                                                        try {
                                                            String rawValue = conversionsAPICustomEventField.getRawValue();
                                                            if (customEventField == CustomEventField.EVENT_NAME && ((String) map3.get(str23)) != null) {
                                                                Object obj3 = map3.get(str23);
                                                                if (obj3 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                                }
                                                                String rawValue2 = (String) obj3;
                                                                Map<String, ConversionsAPIEventName> map4 = AppEventsConversionsAPITransformer.f11493c;
                                                                if (map4.containsKey(rawValue2)) {
                                                                    ConversionsAPIEventName conversionsAPIEventName = map4.get(rawValue2);
                                                                    rawValue2 = conversionsAPIEventName == null ? "" : conversionsAPIEventName.getRawValue();
                                                                }
                                                                linkedHashMap6.put(rawValue, rawValue2);
                                                            } else if (customEventField == CustomEventField.EVENT_TIME && ((Integer) map3.get(str23)) != null) {
                                                                Object obj4 = map3.get(str23);
                                                                if (obj4 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                }
                                                                Object objM6643a = AppEventsConversionsAPITransformer.m6643a(obj4, str23);
                                                                if (objM6643a == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                                }
                                                                linkedHashMap6.put(rawValue, objM6643a);
                                                            }
                                                        } catch (ClassCastException e11) {
                                                            C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", C8656b.m16894U(e11));
                                                        }
                                                    } else if (conversionsAPISection == ConversionsAPISection.CUSTOM_DATA) {
                                                        String rawValue3 = conversionsAPICustomEventField.getRawValue();
                                                        Object obj5 = map3.get(str23);
                                                        if (obj5 == null) {
                                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                        }
                                                        Object objM6643a2 = AppEventsConversionsAPITransformer.m6643a(obj5, str23);
                                                        if (objM6643a2 == null) {
                                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                                        }
                                                        linkedHashMap5.put(rawValue3, objM6643a2);
                                                    }
                                                }
                                                map3 = map3;
                                                it = it2;
                                                str18 = str24;
                                                linkedHashMap3 = linkedHashMap7;
                                            }
                                            Iterator it3 = it;
                                            String str25 = str18;
                                            LinkedHashMap linkedHashMap8 = linkedHashMap3;
                                            if (!linkedHashMap5.isEmpty()) {
                                                linkedHashMap6.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap5);
                                            }
                                            arrayList.add(linkedHashMap6);
                                            it = it3;
                                            str18 = str25;
                                            linkedHashMap3 = linkedHashMap8;
                                        }
                                        linkedHashMap3 = linkedHashMap3;
                                    }
                                } catch (JSONException e12) {
                                    C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str21, e12);
                                }
                                if (arrayList != null) {
                                    arrayList2.addAll(arrayList);
                                }
                            } else {
                                linkedHashMap3 = linkedHashMap3;
                                AppEventsConversionsAPITransformer.DataProcessingParameterName.INSTANCE.getClass();
                                AppEventsConversionsAPITransformer.DataProcessingParameterName[] dataProcessingParameterNameArrValuesCustom = AppEventsConversionsAPITransformer.DataProcessingParameterName.valuesCustom();
                                int length3 = dataProcessingParameterNameArrValuesCustom.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= length3) {
                                        dataProcessingParameterName = null;
                                        break;
                                    }
                                    dataProcessingParameterName = dataProcessingParameterNameArrValuesCustom[i14];
                                    if (C5207g.m11106a(dataProcessingParameterName.getRawValue(), str16)) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                                if (dataProcessingParameterName != null) {
                                    linkedHashMap4.put(str16, value);
                                }
                            }
                        }
                        str11 = str17;
                        str8 = str19;
                        str10 = str20;
                        str13 = str7;
                        linkedHashMap3 = linkedHashMap3;
                    }
                }
                str = str8;
                str2 = str10;
                str3 = str11;
                str4 = str13;
                LinkedHashMap linkedHashMap9 = linkedHashMap3;
                if (appEventType != AppEventType.OTHER) {
                    Object obj6 = linkedHashMapM13467T0.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue());
                    C5207g.m11111f(appEventType, "eventType");
                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                    linkedHashMap10.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
                    linkedHashMap10.put(ConversionsAPISection.USER_DATA.getRawValue(), linkedHashMap2);
                    linkedHashMap10.put(ConversionsAPISection.APP_DATA.getRawValue(), linkedHashMap9);
                    linkedHashMap10.putAll(linkedHashMap4);
                    int i15 = AppEventsConversionsAPITransformer.C2291c.f11500c[appEventType.ordinal()];
                    if (i15 != 1) {
                        if (i15 == 2 && !arrayList2.isEmpty()) {
                            M17251q = new ArrayList();
                            for (Map map5 : arrayList2) {
                                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                linkedHashMap11.putAll(linkedHashMap10);
                                linkedHashMap11.putAll(map5);
                                M17251q.add(linkedHashMap11);
                            }
                        }
                    } else if (obj6 != null) {
                        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                        linkedHashMap12.putAll(linkedHashMap10);
                        linkedHashMap12.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
                        linkedHashMap12.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), obj6);
                        M17251q = C9000b.m17251q(linkedHashMap12);
                    }
                }
                if (M17251q == 0) {
                    return;
                }
                m6646c().addAll(M17251q);
                iMax = Math.max(0, m6646c().size() - 1000);
                if (iMax > 0) {
                    List<Map<String, Object>> listM13417K = C6752c.m13417K(m6646c(), iMax);
                    C5213m.m11197b(listM13417K);
                    C5207g.m11111f(listM13417K, "<set-?>");
                    f11505d = listM13417K;
                }
                int iMin = Math.min(m6646c().size(), 10);
                listM6646c = m6646c();
                c6526i = new C6526i(0, iMin - 1);
                if (c6526i.isEmpty()) {
                    listM13453u0 = EmptyList.f38032a;
                } else {
                    Integer num = 0;
                    listM13453u0 = C6752c.m13453u0(listM6646c.subList(num.intValue(), Integer.valueOf(c6526i.f37164b).intValue() + 1));
                }
                m6646c().subList(0, iMin).clear();
                JSONArray jSONArray = new JSONArray((Collection) listM13453u0);
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("data", jSONArray);
                aVar = f11504c;
                if (aVar != null) {
                    C5207g.m11117l(str3);
                    throw null;
                }
                linkedHashMap.put("accessKey", aVar.f11509c);
                JSONObject jSONObject2 = new JSONObject(linkedHashMap);
                C5078r.a aVar3 = C5078r.f32986e;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String string2 = jSONObject2.toString(2);
                C5207g.m11110e(string2, "jsonBodyStr.toString(2)");
                Object[] objArr = {str4, graphRequest, string2};
                str5 = str2;
                aVar3.m10781c(loggingBehavior, str5, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", objArr);
                string = jSONObject2.toString();
                mapM14943h0 = C7499b.m14943h0(new Pair("Content-Type", "application/json"));
                interfaceC2056p = new InterfaceC2056p<String, Integer, C9072e>() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(String str26, Integer num2) {
                        final Integer num3 = num2;
                        C5086z c5086z4 = C5086z.f33015a;
                        final List<Map<String, Object>> list = listM13453u0;
                        try {
                            C8004n.m15873c().execute(new Runnable() { // from class: r7.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    List list2 = list;
                                    C5207g.m11111f(list2, "$processedEvents");
                                    HashSet<Integer> hashSet = C2294a.f11502a;
                                    Integer num4 = num3;
                                    if (C6752c.m13415I(hashSet, num4) || !C6752c.m13415I(C2294a.f11503b, num4)) {
                                        return;
                                    }
                                    if (C2294a.f11506e >= 5) {
                                        C2294a.m6646c().clear();
                                        C2294a.f11506e = 0;
                                    } else {
                                        C2294a.m6646c().addAll(0, list2);
                                        C2294a.f11506e++;
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                        return C9072e.f47360a;
                    }
                };
                String str26 = str4;
                C5207g.m11111f(str26, "urlStr");
                try {
                    try {
                        uRLConnectionOpenConnection = new URL(str26).openConnection();
                        if (uRLConnectionOpenConnection != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                        }
                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        str6 = str;
                        httpURLConnection.setRequestMethod(str6);
                        setKeySet = mapM14943h0.keySet();
                        if (setKeySet == null) {
                            for (String str27 : setKeySet) {
                                httpURLConnection.setRequestProperty(str27, (String) mapM14943h0.get(str27));
                            }
                        }
                        if (!httpURLConnection.getRequestMethod().equals(str6) || httpURLConnection.getRequestMethod().equals("PUT")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        httpURLConnection.setDoOutput(z10);
                        httpURLConnection.setConnectTimeout(60000);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                        bufferedWriter.write(string);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        bufferedOutputStream.close();
                        sb2 = new StringBuilder();
                        if (f11502a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                            while (true) {
                                try {
                                    line = bufferedReader.readLine();
                                    if (line != null) {
                                        break;
                                    } else {
                                        sb2.append(line);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        C5206f.m11032z0(bufferedReader, th2);
                                        throw th3;
                                    }
                                }
                            }
                            C9072e c9072e = C9072e.f47360a;
                            C5206f.m11032z0(bufferedReader, null);
                        }
                        String string3 = sb2.toString();
                        C5207g.m11110e(string3, "connResponseSB.toString()");
                        C5078r.a aVar4 = C5078r.f32986e;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
                        Object[] objArr2 = new Object[2];
                        try {
                            objArr2[0] = string3;
                            try {
                                objArr2[1] = Integer.valueOf(httpURLConnection.getResponseCode());
                                aVar4.m10781c(loggingBehavior2, str5, "\nResponse Received: \n%s\n%s", objArr2);
                                interfaceC2056p.mo1337m0(string3, Integer.valueOf(httpURLConnection.getResponseCode()));
                            } catch (UnknownHostException e13) {
                                e = e13;
                                i10 = 1;
                                c10 = 0;
                                C5078r.a aVar5 = C5078r.f32986e;
                                LoggingBehavior loggingBehavior3 = LoggingBehavior.APP_EVENTS;
                                Object[] objArr3 = new Object[i10];
                                objArr3[c10] = e.toString();
                                aVar5.m10781c(loggingBehavior3, str5, "Connection failed, retrying: \n%s", objArr3);
                                interfaceC2056p.mo1337m0(null, 503);
                                return;
                            }
                        } catch (UnknownHostException e14) {
                            e = e14;
                            c10 = 0;
                            i10 = 1;
                            C5078r.a aVar6 = C5078r.f32986e;
                            LoggingBehavior loggingBehavior4 = LoggingBehavior.APP_EVENTS;
                            Object[] objArr4 = new Object[i10];
                            objArr4[c10] = e.toString();
                            aVar6.m10781c(loggingBehavior4, str5, "Connection failed, retrying: \n%s", objArr4);
                            interfaceC2056p.mo1337m0(null, 503);
                            return;
                        }
                    } catch (IOException e15) {
                        C5078r.f32986e.m10781c(LoggingBehavior.DEVELOPER_ERRORS, str5, "Send to server failed: \n%s", e15.toString());
                        return;
                    }
                } catch (UnknownHostException e16) {
                    e = e16;
                    i10 = 1;
                }
            } else {
                str = "POST";
                str2 = "CAPITransformerWebRequests";
                str3 = "credentials";
                str4 = str13;
            }
            M17251q = 0;
            if (M17251q == 0) {
                return;
            }
            m6646c().addAll(M17251q);
            iMax = Math.max(0, m6646c().size() - 1000);
            if (iMax > 0) {
                List<Map<String, Object>> listM13417K2 = C6752c.m13417K(m6646c(), iMax);
                C5213m.m11197b(listM13417K2);
                C5207g.m11111f(listM13417K2, "<set-?>");
                f11505d = listM13417K2;
            }
            int iMin2 = Math.min(m6646c().size(), 10);
            listM6646c = m6646c();
            c6526i = new C6526i(0, iMin2 - 1);
            if (c6526i.isEmpty()) {
                listM13453u0 = EmptyList.f38032a;
            } else {
                Integer num2 = 0;
                listM13453u0 = C6752c.m13453u0(listM6646c.subList(num2.intValue(), Integer.valueOf(c6526i.f37164b).intValue() + 1));
            }
            m6646c().subList(0, iMin2).clear();
            JSONArray jSONArray2 = new JSONArray((Collection) listM13453u0);
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray2);
            aVar = f11504c;
            if (aVar != null) {
                C5207g.m11117l(str3);
                throw null;
            }
            linkedHashMap.put("accessKey", aVar.f11509c);
            JSONObject jSONObject3 = new JSONObject(linkedHashMap);
            C5078r.a aVar7 = C5078r.f32986e;
            LoggingBehavior loggingBehavior5 = LoggingBehavior.APP_EVENTS;
            String string4 = jSONObject3.toString(2);
            C5207g.m11110e(string4, "jsonBodyStr.toString(2)");
            Object[] objArr5 = {str4, graphRequest, string4};
            str5 = str2;
            aVar7.m10781c(loggingBehavior5, str5, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", objArr5);
            string = jSONObject3.toString();
            mapM14943h0 = C7499b.m14943h0(new Pair("Content-Type", "application/json"));
            interfaceC2056p = new InterfaceC2056p<String, Integer, C9072e>() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(String str28, Integer num3) {
                    final Integer num4 = num3;
                    C5086z c5086z4 = C5086z.f33015a;
                    final List list = listM13453u0;
                    try {
                        C8004n.m15873c().execute(new Runnable() { // from class: r7.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                List list2 = list;
                                C5207g.m11111f(list2, "$processedEvents");
                                HashSet<Integer> hashSet = C2294a.f11502a;
                                Integer num5 = num4;
                                if (C6752c.m13415I(hashSet, num5) || !C6752c.m13415I(C2294a.f11503b, num5)) {
                                    return;
                                }
                                if (C2294a.f11506e >= 5) {
                                    C2294a.m6646c().clear();
                                    C2294a.f11506e = 0;
                                } else {
                                    C2294a.m6646c().addAll(0, list2);
                                    C2294a.f11506e++;
                                }
                            }
                        });
                    } catch (Exception unused) {
                    }
                    return C9072e.f47360a;
                }
            };
            String str28 = str4;
            C5207g.m11111f(str28, "urlStr");
            uRLConnectionOpenConnection = new URL(str28).openConnection();
            if (uRLConnectionOpenConnection != null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            str6 = str;
            httpURLConnection.setRequestMethod(str6);
            setKeySet = mapM14943h0.keySet();
            if (setKeySet == null) {
                while (r7.hasNext()) {
                    httpURLConnection.setRequestProperty(str27, (String) mapM14943h0.get(str27));
                }
            }
            if (httpURLConnection.getRequestMethod().equals(str6)) {
                z10 = true;
            } else {
                z10 = true;
            }
            httpURLConnection.setDoOutput(z10);
            httpURLConnection.setConnectTimeout(60000);
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
            bufferedWriter2.write(string);
            bufferedWriter2.flush();
            bufferedWriter2.close();
            bufferedOutputStream2.close();
            sb2 = new StringBuilder();
            if (f11502a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        break;
                        break;
                    }
                    sb2.append(line);
                }
                C9072e c9072e2 = C9072e.f47360a;
                C5206f.m11032z0(bufferedReader, null);
            }
            String string5 = sb2.toString();
            C5207g.m11110e(string5, "connResponseSB.toString()");
            C5078r.a aVar8 = C5078r.f32986e;
            LoggingBehavior loggingBehavior6 = LoggingBehavior.APP_EVENTS;
            Object[] objArr6 = new Object[2];
            objArr6[0] = string5;
            objArr6[1] = Integer.valueOf(httpURLConnection.getResponseCode());
            aVar8.m10781c(loggingBehavior6, str5, "\nResponse Received: \n%s\n%s", objArr6);
            interfaceC2056p.mo1337m0(string5, Integer.valueOf(httpURLConnection.getResponseCode()));
        } catch (UninitializedPropertyAccessException e17) {
            C5078r.f32986e.m10781c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6645b(String str, String str2, String str3) {
        C5207g.m11111f(str2, "url");
        C5078r.f32986e.m10781c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        f11504c = new a(str, str2, str3);
        f11505d = new ArrayList();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static List m6646c() {
        List<Map<String, Object>> list = f11505d;
        if (list != null) {
            return list;
        }
        C5207g.m11117l("transformedEvents");
        throw null;
    }
}
