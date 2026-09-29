package p000;

import com.facebook.appevents.codeless.internal.EventBinding$ActionType;
import com.facebook.appevents.codeless.internal.EventBinding$MappingMethod;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ocd {
    /* JADX INFO: renamed from: a */
    public static nt2 m17927a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        string2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase = string2.toUpperCase(locale);
        upperCase.getClass();
        EventBinding$MappingMethod eventBinding$MappingMethodValueOf = EventBinding$MappingMethod.valueOf(upperCase);
        String string3 = jSONObject.getString("event_type");
        string3.getClass();
        String upperCase2 = string3.toUpperCase(locale);
        upperCase2.getClass();
        EventBinding$ActionType eventBinding$ActionTypeValueOf = EventBinding$ActionType.valueOf(upperCase2);
        String string4 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            jSONObject2.getClass();
            arrayList.add(new g57(jSONObject2));
        }
        String strOptString = jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length2 = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                jSONObject3.getClass();
                arrayList2.add(new l37(jSONObject3));
            }
        }
        String strOptString2 = jSONObject.optString("component_id");
        String strOptString3 = jSONObject.optString("activity_name");
        string.getClass();
        string4.getClass();
        strOptString2.getClass();
        strOptString.getClass();
        strOptString3.getClass();
        return new nt2(string, eventBinding$MappingMethodValueOf, eventBinding$ActionTypeValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m17928b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.getClass();
                    arrayList.add(m17927a(jSONObject));
                }
            } catch (IllegalArgumentException | JSONException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m17929c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C3386nv.m17635v(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
                return;
            }
        }
    }
}
