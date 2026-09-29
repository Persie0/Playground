package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CTInAppNotificationButton implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotificationButton> CREATOR = new C2198a();

    /* JADX INFO: renamed from: a */
    public String f11123a;

    /* JADX INFO: renamed from: b */
    public String f11124b;

    /* JADX INFO: renamed from: c */
    public String f11125c;

    /* JADX INFO: renamed from: d */
    public String f11126d;

    /* JADX INFO: renamed from: e */
    public String f11127e;

    /* JADX INFO: renamed from: f */
    public JSONObject f11128f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, String> f11129g;

    /* JADX INFO: renamed from: h */
    public String f11130h;

    /* JADX INFO: renamed from: i */
    public String f11131i;

    /* JADX INFO: renamed from: j */
    public String f11132j;

    /* JADX INFO: renamed from: k */
    public boolean f11133k;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotificationButton$a */
    public class C2198a implements Parcelable.Creator<CTInAppNotificationButton> {
        @Override // android.os.Parcelable.Creator
        public final CTInAppNotificationButton createFromParcel(Parcel parcel) {
            return new CTInAppNotificationButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CTInAppNotificationButton[] newArray(int i10) {
            return new CTInAppNotificationButton[i10];
        }
    }

    public CTInAppNotificationButton() {
    }

    public CTInAppNotificationButton(Parcel parcel) {
        this.f11130h = parcel.readString();
        this.f11131i = parcel.readString();
        this.f11124b = parcel.readString();
        this.f11123a = parcel.readString();
        this.f11125c = parcel.readString();
        this.f11126d = parcel.readString();
        this.f11132j = parcel.readString();
        this.f11133k = parcel.readByte() != 0;
        try {
            this.f11128f = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.f11127e = parcel.readString();
        this.f11129g = parcel.readHashMap(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m6496a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Iterator<String> itKeys;
        try {
            this.f11128f = jSONObject;
            String str = "";
            this.f11130h = jSONObject.has("text") ? jSONObject.getString("text") : str;
            this.f11131i = jSONObject.has("color") ? jSONObject.getString("color") : "#0000FF";
            this.f11124b = jSONObject.has("bg") ? jSONObject.getString("bg") : "#FFFFFF";
            this.f11125c = jSONObject.has("border") ? jSONObject.getString("border") : "#FFFFFF";
            this.f11126d = jSONObject.has("radius") ? jSONObject.getString("radius") : str;
            JSONObject jSONObject3 = jSONObject.has("actions") ? jSONObject.getJSONObject("actions") : null;
            boolean z10 = false;
            if (jSONObject3 != null) {
                String string = jSONObject3.has("android") ? jSONObject3.getString("android") : str;
                if (!string.isEmpty()) {
                    this.f11123a = string;
                }
                this.f11132j = jSONObject3.has("type") ? jSONObject3.getString("type") : "";
                this.f11133k = jSONObject3.has("fbSettings") ? jSONObject3.getBoolean("fbSettings") : false;
            }
            if (jSONObject3 != null && jSONObject3.has("type") && "kv".equalsIgnoreCase(jSONObject3.getString("type")) && jSONObject3.has("kv")) {
                z10 = true;
            }
            if (!z10 || (jSONObject2 = jSONObject3.getJSONObject("kv")) == null || (itKeys = jSONObject2.keys()) == null) {
                return;
            }
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string2 = jSONObject2.getString(next);
                if (!TextUtils.isEmpty(next)) {
                    if (this.f11129g == null) {
                        this.f11129g = new HashMap<>();
                    }
                    this.f11129g.put(next, string2);
                }
            }
        } catch (JSONException unused) {
            this.f11127e = "Invalid JSON";
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11130h);
        parcel.writeString(this.f11131i);
        parcel.writeString(this.f11124b);
        parcel.writeString(this.f11123a);
        parcel.writeString(this.f11125c);
        parcel.writeString(this.f11126d);
        parcel.writeString(this.f11132j);
        parcel.writeByte(this.f11133k ? (byte) 1 : (byte) 0);
        if (this.f11128f == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f11128f.toString());
        }
        parcel.writeString(this.f11127e);
        parcel.writeMap(this.f11129g);
    }
}
