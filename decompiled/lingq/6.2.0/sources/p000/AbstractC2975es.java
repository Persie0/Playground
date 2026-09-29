package p000;

import com.facebook.LoggingBehavior;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
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
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.AbstractC3194a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0822bs;
import p000.AbstractC2895cs;
import p000.AbstractC2975es;
import p000.AbstractC3584sr;
import p000.C2938ds;
import p000.C3621tr;
import p000.C3806yr;
import p000.C3843zr;
import p000.RunnableC0806bd;
import p000.bna;
import p000.fa4;
import p000.i84;
import p000.iy5;
import p000.lda;
import p000.mp3;
import p000.qj5;
import p000.sy2;
import p000.tg4;
import p000.u91;
import p000.vg4;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: es */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2975es {

    /* JADX INFO: renamed from: a */
    public static final HashSet f37762a = AbstractC3489q9.m19788r(200, 202);

    /* JADX INFO: renamed from: b */
    public static final HashSet f37763b = AbstractC3489q9.m19788r(503, 504, 429);

    /* JADX INFO: renamed from: c */
    public static C2938ds f37764c;

    /* JADX INFO: renamed from: d */
    public static List f37765d;

    /* JADX INFO: renamed from: e */
    public static int f37766e;

    /* JADX INFO: renamed from: a */
    public static final void m11324a(String str, String str2, String str3) {
        f37764c = new C2938ds(str, str2, str3);
        f37765d = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static List m11325b() {
        List list = f37765d;
        if (list != null) {
            return list;
        }
        fa4.m11636J("transformedEvents");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m11326c(final mp3 mp3Var) {
        try {
            sy2.m21768c().execute(new Runnable() { // from class: com.facebook.appevents.cloudbridge.a
                /* JADX WARN: Code duplicated, block: B:178:0x0430  */
                /* JADX WARN: Code duplicated, block: B:180:0x044c  */
                /* JADX WARN: Code duplicated, block: B:194:0x04b9  */
                /* JADX WARN: Code duplicated, block: B:197:0x04fc A[Catch: IOException -> 0x0518, UnknownHostException -> 0x051d, TryCatch #12 {UnknownHostException -> 0x051d, IOException -> 0x0518, blocks: (B:195:0x04dd, B:197:0x04fc, B:198:0x0502, B:200:0x0508, B:205:0x0522, B:207:0x052c, B:211:0x053a, B:213:0x0577, B:220:0x0592, B:224:0x0598, B:225:0x059b, B:226:0x059c, B:222:0x0596, B:214:0x0585, B:216:0x058b), top: B:266:0x04dd, inners: #6, #11 }] */
                /* JADX WARN: Code duplicated, block: B:200:0x0508 A[Catch: IOException -> 0x0518, UnknownHostException -> 0x051d, LOOP:2: B:198:0x0502->B:200:0x0508, LOOP_END, TryCatch #12 {UnknownHostException -> 0x051d, IOException -> 0x0518, blocks: (B:195:0x04dd, B:197:0x04fc, B:198:0x0502, B:200:0x0508, B:205:0x0522, B:207:0x052c, B:211:0x053a, B:213:0x0577, B:220:0x0592, B:224:0x0598, B:225:0x059b, B:226:0x059c, B:222:0x0596, B:214:0x0585, B:216:0x058b), top: B:266:0x04dd, inners: #6, #11 }] */
                /* JADX WARN: Code duplicated, block: B:213:0x0577 A[Catch: IOException -> 0x0518, UnknownHostException -> 0x051d, TRY_LEAVE, TryCatch #12 {UnknownHostException -> 0x051d, IOException -> 0x0518, blocks: (B:195:0x04dd, B:197:0x04fc, B:198:0x0502, B:200:0x0508, B:205:0x0522, B:207:0x052c, B:211:0x053a, B:213:0x0577, B:220:0x0592, B:224:0x0598, B:225:0x059b, B:226:0x059c, B:222:0x0596, B:214:0x0585, B:216:0x058b), top: B:266:0x04dd, inners: #6, #11 }] */
                /* JADX WARN: Code duplicated, block: B:216:0x058b A[Catch: all -> 0x058f, TRY_LEAVE, TryCatch #11 {all -> 0x058f, blocks: (B:214:0x0585, B:216:0x058b), top: B:264:0x0585, outer: #12 }] */
                /* JADX WARN: Code duplicated, block: B:236:0x05f6  */
                /* JADX WARN: Code duplicated, block: B:272:0x0592 A[EDGE_INSN: B:272:0x0592->B:220:0x0592 BREAK  A[LOOP:3: B:264:0x0585->B:273:?], SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v120, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v8 */
                /* JADX WARN: Type inference failed for: r0v9 */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v2 */
                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str;
                    String str2;
                    String str3;
                    Throwable th;
                    ?? M23604J;
                    int iMax;
                    boolean z;
                    final List listM22612d1;
                    LinkedHashMap linkedHashMap;
                    C2938ds c2938ds;
                    Map mapM15364Q;
                    String str4;
                    HttpURLConnection httpURLConnection;
                    String str5;
                    Set<String> setKeySet;
                    StringBuilder sb;
                    BufferedReader bufferedReader;
                    String line;
                    List listM22584B0;
                    AppEventUserAndAppDataField appEventUserAndAppDataField;
                    String str6;
                    Iterator it;
                    String str7;
                    String str8;
                    AppEventsConversionsAPITransformer$DataProcessingParameterName appEventsConversionsAPITransformer$DataProcessingParameterName;
                    ArrayList arrayList;
                    CustomEventField customEventField;
                    String str9;
                    ConversionsAPIEventName conversionsAPIEventName;
                    ConversionsAPISection conversionsAPISection;
                    ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField;
                    String rawValue;
                    ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField2;
                    String rawValue2;
                    String str10 = "POST";
                    HashSet hashSet = AbstractC2975es.f37762a;
                    mp3 mp3Var2 = mp3Var;
                    String str11 = mp3Var2.f51692b;
                    List listM23365A0 = str11 != null ? vk9.m23365A0(str11, new String[]{"/"}, 0, 6) : null;
                    String str12 = "CAPITransformerWebRequests";
                    if (listM23365A0 != null) {
                        ?? r6 = 2;
                        if (listM23365A0.size() == 2) {
                            try {
                                C2938ds c2938ds2 = AbstractC2975es.f37764c;
                                String str13 = "credentials";
                                try {
                                    if (c2938ds2 == null) {
                                        fa4.m11636J("credentials");
                                        throw null;
                                    }
                                    String str14 = c2938ds2.f36147b;
                                    if (c2938ds2 == null) {
                                        fa4.m11636J("credentials");
                                        throw null;
                                    }
                                    String str15 = str14 + "/capi/" + c2938ds2.f36146a + "/events";
                                    JSONObject jSONObject = mp3Var2.f51693c;
                                    if (jSONObject != null) {
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bna.m3917F(jSONObject));
                                        String str16 = mp3Var2.f51695e;
                                        str16.getClass();
                                        linkedHashMap2.put("custom_events", str16);
                                        StringBuilder sb2 = new StringBuilder();
                                        for (String str17 : linkedHashMap2.keySet()) {
                                            sb2.append(str17);
                                            sb2.append(" : ");
                                            sb2.append(linkedHashMap2.get(str17));
                                            sb2.append(System.getProperty("line.separator"));
                                        }
                                        iy5 iy5Var = qj5.f57852d;
                                        iy5.m14198n(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
                                        Map map = AbstractC2895cs.f34437a;
                                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                        ArrayList<Map> arrayList2 = new ArrayList();
                                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                        Object obj = linkedHashMap2.get(OtherEventConstants.EVENT.getRawValue());
                                        C3621tr c3621tr = AppEventType.Companion;
                                        obj.getClass();
                                        String str18 = (String) obj;
                                        c3621tr.getClass();
                                        AppEventType appEventType = str18.equals("MOBILE_APP_INSTALL") ? AppEventType.MOBILE_APP_INSTALL : str18.equals("CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
                                        if (appEventType != AppEventType.OTHER) {
                                            Iterator it2 = linkedHashMap2.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it2.next();
                                                String str19 = (String) entry.getKey();
                                                Object value = entry.getValue();
                                                AppEventUserAndAppDataField.Companion.getClass();
                                                str19.getClass();
                                                AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArrValues = AppEventUserAndAppDataField.values();
                                                int length = appEventUserAndAppDataFieldArrValues.length;
                                                int i = 0;
                                                while (true) {
                                                    if (i >= length) {
                                                        appEventUserAndAppDataField = null;
                                                        break;
                                                    }
                                                    AppEventUserAndAppDataField appEventUserAndAppDataField2 = appEventUserAndAppDataFieldArrValues[i];
                                                    AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArr = appEventUserAndAppDataFieldArrValues;
                                                    if (fa4.m11650l(appEventUserAndAppDataField2.getRawValue(), str19)) {
                                                        appEventUserAndAppDataField = appEventUserAndAppDataField2;
                                                        break;
                                                    } else {
                                                        i++;
                                                        appEventUserAndAppDataFieldArrValues = appEventUserAndAppDataFieldArr;
                                                    }
                                                }
                                                if (appEventUserAndAppDataField != null) {
                                                    value.getClass();
                                                    Map map2 = AbstractC2895cs.f34437a;
                                                    str6 = str13;
                                                    C3843zr c3843zr = (C3843zr) map2.get(appEventUserAndAppDataField);
                                                    if (c3843zr == null || (conversionsAPISection = c3843zr.f71990a) == null) {
                                                        it = it2;
                                                    } else {
                                                        int i2 = AbstractC0822bs.f8908b[conversionsAPISection.ordinal()];
                                                        it = it2;
                                                        if (i2 == 1) {
                                                            C3843zr c3843zr2 = (C3843zr) map2.get(appEventUserAndAppDataField);
                                                            if (c3843zr2 != null && (conversionsAPIUserAndAppDataField = c3843zr2.f71991b) != null && (rawValue = conversionsAPIUserAndAppDataField.getRawValue()) != null) {
                                                                linkedHashMap4.put(rawValue, value);
                                                            }
                                                        } else if (i2 == 2) {
                                                            if (appEventUserAndAppDataField == AppEventUserAndAppDataField.USER_DATA) {
                                                                try {
                                                                    linkedHashMap3.putAll(bna.m3917F(new JSONObject((String) value)));
                                                                } catch (JSONException e) {
                                                                    iy5 iy5Var2 = qj5.f57852d;
                                                                    iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e);
                                                                }
                                                            } else {
                                                                C3843zr c3843zr3 = (C3843zr) map2.get(appEventUserAndAppDataField);
                                                                if (c3843zr3 != null && (conversionsAPIUserAndAppDataField2 = c3843zr3.f71991b) != null && (rawValue2 = conversionsAPIUserAndAppDataField2.getRawValue()) != null) {
                                                                    linkedHashMap3.put(rawValue2, value);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    str7 = str10;
                                                    str8 = str12;
                                                } else {
                                                    str6 = str13;
                                                    it = it2;
                                                    boolean zEquals = str19.equals(ConversionsAPISection.CUSTOM_EVENTS.getRawValue());
                                                    boolean z2 = value instanceof String;
                                                    if (appEventType == AppEventType.CUSTOM && zEquals && z2) {
                                                        String str20 = (String) value;
                                                        ArrayList arrayList3 = new ArrayList();
                                                        try {
                                                            Iterator it3 = bna.m3916E(new JSONArray(str20)).iterator();
                                                            while (it3.hasNext()) {
                                                                arrayList3.add(bna.m3917F(new JSONObject((String) it3.next())));
                                                            }
                                                            if (arrayList3.isEmpty()) {
                                                                arrayList = null;
                                                            } else {
                                                                arrayList = new ArrayList();
                                                                Iterator it4 = arrayList3.iterator();
                                                                while (it4.hasNext()) {
                                                                    Map map3 = (Map) it4.next();
                                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                                    for (String str21 : map3.keySet()) {
                                                                        CustomEventField.Companion.getClass();
                                                                        str21.getClass();
                                                                        Iterator it5 = it4;
                                                                        CustomEventField[] customEventFieldArrValues = CustomEventField.values();
                                                                        String str22 = str12;
                                                                        int length2 = customEventFieldArrValues.length;
                                                                        int i3 = 0;
                                                                        while (true) {
                                                                            if (i3 >= length2) {
                                                                                customEventField = null;
                                                                                break;
                                                                            }
                                                                            CustomEventField customEventField2 = customEventFieldArrValues[i3];
                                                                            int i4 = i3;
                                                                            if (fa4.m11650l(customEventField2.getRawValue(), str21)) {
                                                                                customEventField = customEventField2;
                                                                                break;
                                                                            }
                                                                            i3 = i4 + 1;
                                                                        }
                                                                        C3806yr c3806yr = (C3806yr) AbstractC2895cs.f34438b.get(customEventField);
                                                                        if (customEventField == null || c3806yr == null) {
                                                                            str9 = str10;
                                                                        } else {
                                                                            str9 = str10;
                                                                            ConversionsAPICustomEventField conversionsAPICustomEventField = c3806yr.f70307b;
                                                                            ConversionsAPISection conversionsAPISection2 = c3806yr.f70306a;
                                                                            if (conversionsAPISection2 == null) {
                                                                                try {
                                                                                    String rawValue3 = conversionsAPICustomEventField.getRawValue();
                                                                                    if (customEventField == CustomEventField.EVENT_NAME && ((String) map3.get(str21)) != null) {
                                                                                        Object obj2 = map3.get(str21);
                                                                                        obj2.getClass();
                                                                                        String rawValue4 = (String) obj2;
                                                                                        Map map4 = AbstractC2895cs.f34439c;
                                                                                        if (map4.containsKey(rawValue4) && ((conversionsAPIEventName = (ConversionsAPIEventName) map4.get(rawValue4)) == null || (rawValue4 = conversionsAPIEventName.getRawValue()) == null)) {
                                                                                            rawValue4 = "";
                                                                                        }
                                                                                        linkedHashMap7.put(rawValue3, rawValue4);
                                                                                    } else if (customEventField == CustomEventField.EVENT_TIME && ((Integer) map3.get(str21)) != null) {
                                                                                        Object obj3 = map3.get(str21);
                                                                                        obj3.getClass();
                                                                                        Object objM9868a = AbstractC2895cs.m9868a(obj3, str21);
                                                                                        objM9868a.getClass();
                                                                                        linkedHashMap7.put(rawValue3, objM9868a);
                                                                                    }
                                                                                } catch (ClassCastException e2) {
                                                                                    iy5 iy5Var3 = qj5.f57852d;
                                                                                    iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", lda.m16112L(e2));
                                                                                }
                                                                            } else if (conversionsAPISection2 == ConversionsAPISection.CUSTOM_DATA) {
                                                                                String rawValue5 = conversionsAPICustomEventField.getRawValue();
                                                                                Object obj4 = map3.get(str21);
                                                                                obj4.getClass();
                                                                                Object objM9868a2 = AbstractC2895cs.m9868a(obj4, str21);
                                                                                objM9868a2.getClass();
                                                                                linkedHashMap6.put(rawValue5, objM9868a2);
                                                                            }
                                                                        }
                                                                        it4 = it5;
                                                                        str12 = str22;
                                                                        str10 = str9;
                                                                    }
                                                                    String str23 = str10;
                                                                    Iterator it6 = it4;
                                                                    String str24 = str12;
                                                                    if (!linkedHashMap6.isEmpty()) {
                                                                        linkedHashMap7.put(ConversionsAPISection.CUSTOM_DATA.getRawValue(), linkedHashMap6);
                                                                    }
                                                                    arrayList.add(linkedHashMap7);
                                                                    it4 = it6;
                                                                    str12 = str24;
                                                                    str10 = str23;
                                                                }
                                                            }
                                                            str7 = str10;
                                                            str8 = str12;
                                                        } catch (JSONException e3) {
                                                            str7 = str10;
                                                            str8 = str12;
                                                            iy5 iy5Var4 = qj5.f57852d;
                                                            iy5.m14198n(LoggingBehavior.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str20, e3);
                                                            arrayList = null;
                                                        }
                                                        if (arrayList != null) {
                                                            arrayList2.addAll(arrayList);
                                                        }
                                                    } else {
                                                        str7 = str10;
                                                        str8 = str12;
                                                        AppEventsConversionsAPITransformer$DataProcessingParameterName.Companion.getClass();
                                                        AppEventsConversionsAPITransformer$DataProcessingParameterName[] appEventsConversionsAPITransformer$DataProcessingParameterNameArrValues = AppEventsConversionsAPITransformer$DataProcessingParameterName.values();
                                                        int length3 = appEventsConversionsAPITransformer$DataProcessingParameterNameArrValues.length;
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 >= length3) {
                                                                appEventsConversionsAPITransformer$DataProcessingParameterName = null;
                                                                break;
                                                            }
                                                            appEventsConversionsAPITransformer$DataProcessingParameterName = appEventsConversionsAPITransformer$DataProcessingParameterNameArrValues[i5];
                                                            if (fa4.m11650l(appEventsConversionsAPITransformer$DataProcessingParameterName.getRawValue(), str19)) {
                                                                break;
                                                            } else {
                                                                i5++;
                                                            }
                                                        }
                                                        if (appEventsConversionsAPITransformer$DataProcessingParameterName != null) {
                                                            linkedHashMap5.put(str19, value);
                                                        }
                                                    }
                                                }
                                                it2 = it;
                                                str13 = str6;
                                                str12 = str8;
                                                str10 = str7;
                                            }
                                        }
                                        str = str10;
                                        str2 = str12;
                                        str3 = str13;
                                        th = null;
                                        if (appEventType != AppEventType.OTHER) {
                                            Object obj5 = linkedHashMap2.get(OtherEventConstants.INSTALL_EVENT_TIME.getRawValue());
                                            appEventType.getClass();
                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                            linkedHashMap8.put(OtherEventConstants.ACTION_SOURCE.getRawValue(), OtherEventConstants.APP.getRawValue());
                                            linkedHashMap8.put(ConversionsAPISection.USER_DATA.getRawValue(), linkedHashMap3);
                                            linkedHashMap8.put(ConversionsAPISection.APP_DATA.getRawValue(), linkedHashMap4);
                                            linkedHashMap8.putAll(linkedHashMap5);
                                            int i6 = AbstractC0822bs.f8909c[appEventType.ordinal()];
                                            if (i6 != 1) {
                                                if (i6 == 2 && !arrayList2.isEmpty()) {
                                                    M23604J = new ArrayList();
                                                    for (Map map5 : arrayList2) {
                                                        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                                        linkedHashMap9.putAll(linkedHashMap8);
                                                        linkedHashMap9.putAll(map5);
                                                        M23604J.add(linkedHashMap9);
                                                    }
                                                }
                                            } else if (obj5 != null) {
                                                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                                linkedHashMap10.putAll(linkedHashMap8);
                                                linkedHashMap10.put(ConversionsAPICustomEventField.EVENT_NAME.getRawValue(), OtherEventConstants.MOBILE_APP_INSTALL.getRawValue());
                                                linkedHashMap10.put(ConversionsAPICustomEventField.EVENT_TIME.getRawValue(), obj5);
                                                M23604J = vz1.m23604J(linkedHashMap10);
                                            }
                                        }
                                        if (M23604J == 0) {
                                            return;
                                        }
                                        AbstractC2975es.m11325b().addAll((Collection) M23604J);
                                        iMax = Math.max(0, AbstractC2975es.m11325b().size() - 1000);
                                        if (iMax > 0) {
                                            listM22584B0 = u91.m22584B0(AbstractC2975es.m11325b(), iMax);
                                            if (!(listM22584B0 instanceof tg4) && !(listM22584B0 instanceof vg4)) {
                                                lda.m16113M(listM22584B0, "kotlin.collections.MutableList");
                                                throw th;
                                            }
                                            try {
                                                AbstractC2975es.f37765d = listM22584B0;
                                            } catch (ClassCastException e4) {
                                                fa4.m11634H(e4, lda.class.getName());
                                                throw e4;
                                            }
                                        }
                                        int iMin = Math.min(AbstractC2975es.m11325b().size(), 10);
                                        z = true;
                                        listM22612d1 = u91.m22612d1(AbstractC2975es.m11325b(), new i84(0, iMin - 1, 1));
                                        AbstractC2975es.m11325b().subList(0, iMin).clear();
                                        JSONArray jSONArray = new JSONArray((Collection) listM22612d1);
                                        linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("data", jSONArray);
                                        c2938ds = AbstractC2975es.f37764c;
                                        if (c2938ds != null) {
                                            Throwable th2 = th;
                                            fa4.m11636J(str3);
                                            throw th2;
                                        }
                                        linkedHashMap.put("accessKey", c2938ds.f36148c);
                                        String string = new JSONObject(linkedHashMap).toString();
                                        mapM15364Q = AbstractC3194a.m15364Q(new Pair("Content-Type", "application/json"));
                                        zi3 zi3Var = new zi3() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // p000.zi3
                                            public final Object invoke(Object obj6, Object obj7) {
                                                try {
                                                    sy2.m21768c().execute(new RunnableC0806bd(4, (Integer) obj7, listM22612d1));
                                                } catch (Exception unused) {
                                                }
                                                return xfa.f68157a;
                                            }
                                        };
                                        try {
                                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str15).openConnection());
                                            uRLConnection.getClass();
                                            httpURLConnection = (HttpURLConnection) uRLConnection;
                                            str5 = str;
                                            httpURLConnection.setRequestMethod(str5);
                                            setKeySet = mapM15364Q.keySet();
                                            if (setKeySet != null) {
                                                for (String str25 : setKeySet) {
                                                    httpURLConnection.setRequestProperty(str25, (String) mapM15364Q.get(str25));
                                                }
                                            }
                                            if (!httpURLConnection.getRequestMethod().equals(str5) && !httpURLConnection.getRequestMethod().equals("PUT")) {
                                                z = false;
                                            }
                                            httpURLConnection.setDoOutput(z);
                                            httpURLConnection.setConnectTimeout(60000);
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                                            bufferedWriter.write(string);
                                            bufferedWriter.flush();
                                            bufferedWriter.close();
                                            bufferedOutputStream.close();
                                            sb = new StringBuilder();
                                            if (AbstractC2975es.f37762a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                                while (true) {
                                                    try {
                                                        line = bufferedReader.readLine();
                                                        if (line != null) {
                                                            break;
                                                        } else {
                                                            sb.append(line);
                                                        }
                                                    } catch (Throwable th3) {
                                                        try {
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            AbstractC3584sr.m21646y(bufferedReader, th3);
                                                            throw th4;
                                                        }
                                                    }
                                                }
                                                bufferedReader.close();
                                            }
                                            String string2 = sb.toString();
                                            iy5 iy5Var5 = qj5.f57852d;
                                            str4 = str2;
                                            try {
                                                iy5.m14198n(LoggingBehavior.APP_EVENTS, str4, "\nResponse Received: \n%s\n%s", string2, Integer.valueOf(httpURLConnection.getResponseCode()));
                                                zi3Var.invoke(string2, Integer.valueOf(httpURLConnection.getResponseCode()));
                                                return;
                                            } catch (UnknownHostException e5) {
                                                e = e5;
                                            } catch (IOException e6) {
                                                e = e6;
                                                iy5 iy5Var6 = qj5.f57852d;
                                                iy5.m14198n(LoggingBehavior.DEVELOPER_ERRORS, str4, "Send to server failed: \n%s", e.toString());
                                                return;
                                            }
                                        } catch (UnknownHostException e7) {
                                            e = e7;
                                            str4 = str2;
                                        } catch (IOException e8) {
                                            e = e8;
                                            str4 = str2;
                                            iy5 iy5Var7 = qj5.f57852d;
                                            iy5.m14198n(LoggingBehavior.DEVELOPER_ERRORS, str4, "Send to server failed: \n%s", e.toString());
                                            return;
                                        }
                                    } else {
                                        str = "POST";
                                        str2 = "CAPITransformerWebRequests";
                                        str3 = "credentials";
                                        th = null;
                                    }
                                    M23604J = th;
                                    if (M23604J == 0) {
                                        return;
                                    }
                                    AbstractC2975es.m11325b().addAll((Collection) M23604J);
                                    iMax = Math.max(0, AbstractC2975es.m11325b().size() - 1000);
                                    if (iMax > 0) {
                                        listM22584B0 = u91.m22584B0(AbstractC2975es.m11325b(), iMax);
                                        if (!(listM22584B0 instanceof tg4)) {
                                        }
                                        AbstractC2975es.f37765d = listM22584B0;
                                    }
                                    int iMin2 = Math.min(AbstractC2975es.m11325b().size(), 10);
                                    z = true;
                                    listM22612d1 = u91.m22612d1(AbstractC2975es.m11325b(), new i84(0, iMin2 - 1, 1));
                                    AbstractC2975es.m11325b().subList(0, iMin2).clear();
                                    JSONArray jSONArray2 = new JSONArray((Collection) listM22612d1);
                                    linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("data", jSONArray2);
                                    c2938ds = AbstractC2975es.f37764c;
                                    if (c2938ds != null) {
                                        Throwable th5 = th;
                                        fa4.m11636J(str3);
                                        throw th5;
                                    }
                                    linkedHashMap.put("accessKey", c2938ds.f36148c);
                                    String string3 = new JSONObject(linkedHashMap).toString();
                                    mapM15364Q = AbstractC3194a.m15364Q(new Pair("Content-Type", "application/json"));
                                    zi3 zi3Var2 = new zi3() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // p000.zi3
                                        public final Object invoke(Object obj6, Object obj7) {
                                            try {
                                                sy2.m21768c().execute(new RunnableC0806bd(4, (Integer) obj7, listM22612d1));
                                            } catch (Exception unused) {
                                            }
                                            return xfa.f68157a;
                                        }
                                    };
                                    URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str15).openConnection());
                                    uRLConnection2.getClass();
                                    httpURLConnection = (HttpURLConnection) uRLConnection2;
                                    str5 = str;
                                    httpURLConnection.setRequestMethod(str5);
                                    setKeySet = mapM15364Q.keySet();
                                    if (setKeySet != null) {
                                        while (r7.hasNext()) {
                                            httpURLConnection.setRequestProperty(str25, (String) mapM15364Q.get(str25));
                                        }
                                    }
                                    if (!httpURLConnection.getRequestMethod().equals(str5)) {
                                        z = false;
                                    }
                                    httpURLConnection.setDoOutput(z);
                                    httpURLConnection.setConnectTimeout(60000);
                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                                    bufferedWriter2.write(string3);
                                    bufferedWriter2.flush();
                                    bufferedWriter2.close();
                                    bufferedOutputStream2.close();
                                    sb = new StringBuilder();
                                    if (AbstractC2975es.f37762a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                        while (true) {
                                            line = bufferedReader.readLine();
                                            if (line != null) {
                                                break;
                                                break;
                                            }
                                            sb.append(line);
                                            e = e7;
                                            str4 = str2;
                                            iy5 iy5Var8 = qj5.f57852d;
                                            iy5.m14198n(LoggingBehavior.APP_EVENTS, str4, "Connection failed, retrying: \n%s", e.toString());
                                            zi3Var2.invoke(th, 503);
                                            return;
                                        }
                                        bufferedReader.close();
                                    }
                                    String string4 = sb.toString();
                                    iy5 iy5Var9 = qj5.f57852d;
                                    str4 = str2;
                                    iy5.m14198n(LoggingBehavior.APP_EVENTS, str4, "\nResponse Received: \n%s\n%s", string4, Integer.valueOf(httpURLConnection.getResponseCode()));
                                    zi3Var2.invoke(string4, Integer.valueOf(httpURLConnection.getResponseCode()));
                                    return;
                                } catch (UninitializedPropertyAccessException e9) {
                                    e = e9;
                                }
                            } catch (UninitializedPropertyAccessException e10) {
                                e = e10;
                                r6 = "CAPITransformerWebRequests";
                            }
                            iy5 iy5Var10 = qj5.f57852d;
                            iy5.m14198n(LoggingBehavior.DEVELOPER_ERRORS, r6, "\n Credentials not initialized Error when logging: \n%s", e);
                            return;
                        }
                    }
                    iy5 iy5Var11 = qj5.f57852d;
                    iy5.m14198n(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", mp3Var2);
                }
            });
        } catch (Exception unused) {
        }
    }
}
