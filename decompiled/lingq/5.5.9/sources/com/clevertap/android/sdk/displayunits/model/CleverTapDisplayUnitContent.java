package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.C2181a;
import org.json.JSONObject;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapDisplayUnitContent implements Parcelable {
    public static final Parcelable.Creator<CleverTapDisplayUnitContent> CREATOR = new C2188a();

    /* JADX INFO: renamed from: a */
    public final String f11056a;

    /* JADX INFO: renamed from: b */
    public final String f11057b;

    /* JADX INFO: renamed from: c */
    public final String f11058c;

    /* JADX INFO: renamed from: d */
    public final String f11059d;

    /* JADX INFO: renamed from: e */
    public final String f11060e;

    /* JADX INFO: renamed from: f */
    public final String f11061f;

    /* JADX INFO: renamed from: g */
    public final String f11062g;

    /* JADX INFO: renamed from: h */
    public final String f11063h;

    /* JADX INFO: renamed from: i */
    public final String f11064i;

    /* JADX INFO: renamed from: j */
    public final String f11065j;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent$a */
    public class C2188a implements Parcelable.Creator<CleverTapDisplayUnitContent> {
        @Override // android.os.Parcelable.Creator
        public final CleverTapDisplayUnitContent createFromParcel(Parcel parcel) {
            return new CleverTapDisplayUnitContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CleverTapDisplayUnitContent[] newArray(int i10) {
            return new CleverTapDisplayUnitContent[i10];
        }
    }

    public CleverTapDisplayUnitContent(Parcel parcel) {
        this.f11064i = parcel.readString();
        this.f11065j = parcel.readString();
        this.f11061f = parcel.readString();
        this.f11062g = parcel.readString();
        this.f11059d = parcel.readString();
        this.f11060e = parcel.readString();
        this.f11057b = parcel.readString();
        this.f11063h = parcel.readString();
        this.f11056a = parcel.readString();
        this.f11058c = parcel.readString();
    }

    public CleverTapDisplayUnitContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f11064i = str;
        this.f11065j = str2;
        this.f11061f = str3;
        this.f11062g = str4;
        this.f11059d = str5;
        this.f11060e = str6;
        this.f11057b = str7;
        this.f11063h = str8;
        this.f11056a = str9;
        this.f11058c = str10;
    }

    /* JADX INFO: renamed from: a */
    public static CleverTapDisplayUnitContent m6484a(JSONObject jSONObject) {
        String str;
        String string;
        String str2;
        String string2;
        String string3;
        String str3;
        String str4;
        String string4;
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            String string5 = "";
            if (jSONObject2 != null) {
                String string6 = jSONObject2.has("text") ? jSONObject2.getString("text") : "";
                string = jSONObject2.has("color") ? jSONObject2.getString("color") : "";
                str = string6;
            } else {
                str = "";
                string = str;
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                String string7 = jSONObject3.has("text") ? jSONObject3.getString("text") : "";
                string2 = jSONObject3.has("color") ? jSONObject3.getString("color") : "";
                str2 = string7;
            } else {
                str2 = "";
                string2 = str2;
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            if (jSONObject4 != null) {
                string3 = jSONObject4.has("url") ? jSONObject4.getString("url") : "";
            } else {
                string3 = "";
            }
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                String string8 = jSONObject5.has("url") ? jSONObject5.getString("url") : "";
                String string9 = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : "";
                string4 = jSONObject5.has("poster") ? jSONObject5.getString("poster") : "";
                str4 = string9;
                str3 = string8;
            } else {
                str3 = "";
                str4 = str3;
                string4 = str4;
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                JSONObject jSONObject7 = jSONObject6.has("url") ? jSONObject6.getJSONObject("url") : null;
                if (jSONObject7 != null) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null && jSONObject8.has("text")) {
                        string5 = jSONObject8.getString("text");
                    }
                }
            }
            return new CleverTapDisplayUnitContent(str, string, str2, string2, string3, str3, str4, string4, string5, null);
        } catch (Exception e10) {
            C2181a.m6450b("DisplayUnit : ", "Unable to init CleverTapDisplayUnitContent with JSON - " + e10.getLocalizedMessage());
            return new CleverTapDisplayUnitContent("", "", "", "", "", "", "", "", "", "Error Creating DisplayUnit Content from JSON : " + e10.getLocalizedMessage());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ title:");
        sb2.append(this.f11064i);
        sb2.append(", titleColor:");
        sb2.append(this.f11065j);
        sb2.append(" message:");
        sb2.append(this.f11061f);
        sb2.append(", messageColor:");
        sb2.append(this.f11062g);
        sb2.append(", media:");
        sb2.append(this.f11060e);
        sb2.append(", contentType:");
        sb2.append(this.f11057b);
        sb2.append(", posterUrl:");
        sb2.append(this.f11063h);
        sb2.append(", actionUrl:");
        sb2.append(this.f11056a);
        sb2.append(", icon:");
        sb2.append(this.f11059d);
        sb2.append(", error:");
        return C0009a.m23l(sb2, this.f11058c, " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11064i);
        parcel.writeString(this.f11065j);
        parcel.writeString(this.f11061f);
        parcel.writeString(this.f11062g);
        parcel.writeString(this.f11059d);
        parcel.writeString(this.f11060e);
        parcel.writeString(this.f11057b);
        parcel.writeString(this.f11063h);
        parcel.writeString(this.f11056a);
        parcel.writeString(this.f11058c);
    }
}
