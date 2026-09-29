package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0204c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxMessageContent implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessageContent> CREATOR = new C2245a();

    /* JADX INFO: renamed from: a */
    public String f11288a;

    /* JADX INFO: renamed from: b */
    public String f11289b;

    /* JADX INFO: renamed from: c */
    public Boolean f11290c;

    /* JADX INFO: renamed from: d */
    public Boolean f11291d;

    /* JADX INFO: renamed from: e */
    public String f11292e;

    /* JADX INFO: renamed from: f */
    public JSONArray f11293f;

    /* JADX INFO: renamed from: g */
    public String f11294g;

    /* JADX INFO: renamed from: h */
    public String f11295h;

    /* JADX INFO: renamed from: i */
    public String f11296i;

    /* JADX INFO: renamed from: j */
    public String f11297j;

    /* JADX INFO: renamed from: k */
    public String f11298k;

    /* JADX INFO: renamed from: l */
    public String f11299l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxMessageContent$a */
    public class C2245a implements Parcelable.Creator<CTInboxMessageContent> {
        @Override // android.os.Parcelable.Creator
        public final CTInboxMessageContent createFromParcel(Parcel parcel) {
            return new CTInboxMessageContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CTInboxMessageContent[] newArray(int i10) {
            return new CTInboxMessageContent[i10];
        }
    }

    public CTInboxMessageContent() {
    }

    public CTInboxMessageContent(Parcel parcel) {
        this.f11298k = parcel.readString();
        this.f11299l = parcel.readString();
        this.f11295h = parcel.readString();
        this.f11296i = parcel.readString();
        this.f11294g = parcel.readString();
        boolean z10 = true;
        this.f11291d = Boolean.valueOf(parcel.readByte() != 0);
        if (parcel.readByte() == 0) {
            z10 = false;
        }
        this.f11290c = Boolean.valueOf(z10);
        this.f11288a = parcel.readString();
        this.f11292e = parcel.readString();
        try {
            this.f11293f = parcel.readByte() == 0 ? null : new JSONArray(parcel.readString());
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to init CTInboxMessageContent with Parcel - "));
        }
        this.f11289b = parcel.readString();
        this.f11297j = parcel.readString();
    }

    /* JADX INFO: renamed from: a */
    public static String m6544a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("bg") ? jSONObject.getString("bg") : "";
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to get Link Text Color with JSON - "));
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6545b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("color") ? jSONObject.getString("color") : "";
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to get Link Text Color with JSON - "));
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m6546c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("text") ? jSONObject.getString("text") : "";
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to get Link Text with JSON - "));
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m6547d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.has("url") ? jSONObject.getJSONObject("url") : null;
            if (jSONObject2 == null) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.has("android") ? jSONObject2.getJSONObject("android") : null;
            return (jSONObject3 == null || !jSONObject3.has("text")) ? "" : jSONObject3.getString("text");
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to get Link URL with JSON - "));
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m6548e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("type") ? jSONObject.getString("type") : "";
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to get Link Type with JSON - "));
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m6549h(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.has("title") ? jSONObject.getJSONObject("title") : null;
            String string = "";
            if (jSONObject2 != null) {
                if (jSONObject2.has("text")) {
                    string = jSONObject2.getString("text");
                }
                this.f11298k = string;
                this.f11299l = jSONObject2.has("color") ? jSONObject2.getString("color") : string;
            } else {
                string = "";
            }
            JSONObject jSONObject3 = jSONObject.has("message") ? jSONObject.getJSONObject("message") : null;
            if (jSONObject3 != null) {
                this.f11295h = jSONObject3.has("text") ? jSONObject3.getString("text") : string;
                this.f11296i = jSONObject3.has("color") ? jSONObject3.getString("color") : string;
            }
            JSONObject jSONObject4 = jSONObject.has("icon") ? jSONObject.getJSONObject("icon") : null;
            if (jSONObject4 != null) {
                this.f11292e = jSONObject4.has("url") ? jSONObject4.getString("url") : string;
            }
            JSONObject jSONObject5 = jSONObject.has("media") ? jSONObject.getJSONObject("media") : null;
            if (jSONObject5 != null) {
                this.f11294g = jSONObject5.has("url") ? jSONObject5.getString("url") : string;
                this.f11289b = jSONObject5.has("content_type") ? jSONObject5.getString("content_type") : string;
                this.f11297j = jSONObject5.has("poster") ? jSONObject5.getString("poster") : string;
            }
            JSONObject jSONObject6 = jSONObject.has("action") ? jSONObject.getJSONObject("action") : null;
            if (jSONObject6 != null) {
                boolean z10 = true;
                this.f11291d = Boolean.valueOf(jSONObject6.has("hasUrl") && jSONObject6.getBoolean("hasUrl"));
                if (!jSONObject6.has("hasLinks") || !jSONObject6.getBoolean("hasLinks")) {
                    z10 = false;
                }
                this.f11290c = Boolean.valueOf(z10);
                JSONObject jSONObject7 = jSONObject6.has("url") ? jSONObject6.getJSONObject("url") : null;
                if (jSONObject7 != null && this.f11291d.booleanValue()) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null) {
                        this.f11288a = jSONObject8.has("text") ? jSONObject8.getString("text") : string;
                    }
                }
                if (jSONObject7 == null || !this.f11290c.booleanValue()) {
                    return;
                }
                this.f11293f = jSONObject6.has("links") ? jSONObject6.getJSONArray("links") : null;
            }
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to init CTInboxMessageContent with JSON - "));
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6550j() {
        String str = this.f11289b;
        return (str == null || this.f11294g == null || !str.startsWith("audio")) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6551k() {
        String str = this.f11289b;
        return (str == null || this.f11294g == null || !str.equals("image/gif")) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6552l() {
        String str = this.f11289b;
        return (str == null || this.f11294g == null || !str.startsWith("image") || str.equals("image/gif")) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6553n() {
        String str = this.f11289b;
        return (str == null || this.f11294g == null || !str.startsWith("video")) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11298k);
        parcel.writeString(this.f11299l);
        parcel.writeString(this.f11295h);
        parcel.writeString(this.f11296i);
        parcel.writeString(this.f11294g);
        parcel.writeByte(this.f11291d.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11290c.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f11288a);
        parcel.writeString(this.f11292e);
        if (this.f11293f == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f11293f.toString());
        }
        parcel.writeString(this.f11289b);
        parcel.writeString(this.f11297j);
    }
}
