package com.iterable.iterableapi;

import org.json.JSONException;
import org.json.JSONObject;
import p000.eh0;
import p000.pb4;
import p000.ub4;
import p000.vb4;

/* JADX INFO: renamed from: com.iterable.iterableapi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1205a {

    /* JADX INFO: renamed from: a */
    public final String f13979a;

    /* JADX INFO: renamed from: b */
    public final String f13980b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f13981c;

    /* JADX INFO: renamed from: d */
    public final String f13982d;

    /* JADX INFO: renamed from: e */
    public final String f13983e;

    /* JADX INFO: renamed from: f */
    public IterableApiRequest$ProcessorType f13984f = IterableApiRequest$ProcessorType.ONLINE;

    /* JADX INFO: renamed from: g */
    public final ub4 f13985g;

    /* JADX INFO: renamed from: h */
    public final vb4 f13986h;

    /* JADX INFO: renamed from: i */
    public final pb4 f13987i;

    public C1205a(String str, String str2, JSONObject jSONObject, String str3, String str4, vb4 vb4Var, pb4 pb4Var) {
        this.f13979a = str;
        this.f13980b = str2;
        this.f13981c = jSONObject;
        this.f13982d = str3;
        this.f13983e = str4;
        this.f13986h = vb4Var;
        this.f13987i = pb4Var;
    }

    /* JADX INFO: renamed from: a */
    public static C1205a m6894a(String str, JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("apiKey");
            String string2 = jSONObject.getString("resourcePath");
            String string3 = jSONObject.getString("requestType");
            if (str == null) {
                str = jSONObject.has("authToken") ? jSONObject.getString("authToken") : "";
            }
            return new C1205a(string, string2, jSONObject.getJSONObject("data"), string3, str, null, null);
        } catch (JSONException unused) {
            eh0.m11135p("IterableApiRequest", "Failed to create Iterable request from JSON");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m6895b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiKey", this.f13979a);
        jSONObject.put("resourcePath", this.f13980b);
        jSONObject.put("authToken", this.f13983e);
        jSONObject.put("requestType", this.f13982d);
        jSONObject.put("data", this.f13981c);
        return jSONObject;
    }

    public C1205a(String str, String str2, JSONObject jSONObject, String str3, String str4, ub4 ub4Var) {
        this.f13979a = str;
        this.f13980b = str2;
        this.f13981c = jSONObject;
        this.f13982d = str3;
        this.f13983e = str4;
        this.f13985g = ub4Var;
    }
}
