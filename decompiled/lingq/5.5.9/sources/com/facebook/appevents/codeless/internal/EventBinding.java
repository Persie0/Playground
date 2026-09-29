package com.facebook.appevents.codeless.internal;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p394t7.C9215a;

/* JADX INFO: loaded from: classes.dex */
public final class EventBinding {

    /* JADX INFO: renamed from: a */
    public final String f11510a;

    /* JADX INFO: renamed from: b */
    public final List<PathComponent> f11511b;

    /* JADX INFO: renamed from: c */
    public final List<C9215a> f11512c;

    /* JADX INFO: renamed from: d */
    public final String f11513d;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] actionTypeArrValuesCustom = values();
            return (ActionType[]) Arrays.copyOf(actionTypeArrValuesCustom, actionTypeArrValuesCustom.length);
        }
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MappingMethod[] valuesCustom() {
            MappingMethod[] mappingMethodArrValuesCustom = values();
            return (MappingMethod[]) Arrays.copyOf(mappingMethodArrValuesCustom, mappingMethodArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.internal.EventBinding$a */
    public static final class C2295a {
        /* JADX INFO: renamed from: a */
        public static EventBinding m6647a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            C5207g.m11110e(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C5207g.m11110e(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            C5207g.m11110e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C5207g.m11110e(string3, "mapping.getString(\"event_type\")");
            String upperCase2 = string3.toUpperCase(locale);
            C5207g.m11110e(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType actionTypeValueOf = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    C5207g.m11110e(jSONObject2, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String strOptString = jSONObject.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i10);
                    C5207g.m11110e(jSONObject3, "jsonParameter");
                    arrayList2.add(new C9215a(jSONObject3));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String strOptString2 = jSONObject.optString("component_id");
            String strOptString3 = jSONObject.optString("activity_name");
            C5207g.m11110e(string, "eventName");
            C5207g.m11110e(string4, "appVersion");
            C5207g.m11110e(strOptString2, "componentId");
            C5207g.m11110e(strOptString, "pathType");
            C5207g.m11110e(strOptString3, "activityName");
            return new EventBinding(string, mappingMethodValueOf, actionTypeValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
        }
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        C5207g.m11111f(mappingMethod, "method");
        C5207g.m11111f(actionType, "type");
        this.f11510a = str;
        this.f11511b = arrayList;
        this.f11512c = arrayList2;
        this.f11513d = str5;
    }
}
