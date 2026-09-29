package com.clevertap.android.sdk.p049db;

import org.json.JSONArray;

/* JADX INFO: renamed from: com.clevertap.android.sdk.db.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2186c {

    /* JADX INFO: renamed from: a */
    public JSONArray f11046a;

    /* JADX INFO: renamed from: b */
    public String f11047b;

    /* JADX INFO: renamed from: c */
    public DBAdapter.Table f11048c;

    /* JADX INFO: renamed from: a */
    public final Boolean m6482a() {
        JSONArray jSONArray;
        return Boolean.valueOf(this.f11047b == null || (jSONArray = this.f11046a) == null || jSONArray.length() <= 0);
    }

    public final String toString() {
        if (m6482a().booleanValue()) {
            return "tableName: " + this.f11048c + " | numItems: 0";
        }
        return "tableName: " + this.f11048c + " | lastId: " + this.f11047b + " | numItems: " + this.f11046a.length() + " | items: " + this.f11046a.toString();
    }
}
