package com.clevertap.android.sdk.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0204c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxMessage implements Parcelable {
    public static final Parcelable.Creator<CTInboxMessage> CREATOR = new C2244a();

    /* JADX INFO: renamed from: H */
    public final String f11271H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f11272I;

    /* JADX INFO: renamed from: J */
    public final String f11273J;

    /* JADX INFO: renamed from: K */
    public final CTInboxMessageType f11274K;

    /* JADX INFO: renamed from: L */
    public final JSONObject f11275L;

    /* JADX INFO: renamed from: a */
    public final String f11276a;

    /* JADX INFO: renamed from: b */
    public final String f11277b;

    /* JADX INFO: renamed from: c */
    public final String f11278c;

    /* JADX INFO: renamed from: d */
    public final String f11279d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f11280e;

    /* JADX INFO: renamed from: f */
    public final JSONObject f11281f;

    /* JADX INFO: renamed from: g */
    public final long f11282g;

    /* JADX INFO: renamed from: h */
    public final long f11283h;

    /* JADX INFO: renamed from: i */
    public final String f11284i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<CTInboxMessageContent> f11285j;

    /* JADX INFO: renamed from: k */
    public boolean f11286k;

    /* JADX INFO: renamed from: l */
    public final String f11287l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxMessage$a */
    public class C2244a implements Parcelable.Creator<CTInboxMessage> {
        @Override // android.os.Parcelable.Creator
        public final CTInboxMessage createFromParcel(Parcel parcel) {
            return new CTInboxMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CTInboxMessage[] newArray(int i10) {
            return new CTInboxMessage[i10];
        }
    }

    public CTInboxMessage(Parcel parcel) {
        this.f11285j = new ArrayList<>();
        this.f11272I = new ArrayList();
        try {
            this.f11273J = parcel.readString();
            this.f11278c = parcel.readString();
            this.f11284i = parcel.readString();
            this.f11276a = parcel.readString();
            this.f11282g = parcel.readLong();
            this.f11283h = parcel.readLong();
            this.f11287l = parcel.readString();
            JSONObject jSONObject = null;
            this.f11281f = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.f11280e = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.f11286k = parcel.readByte() != 0;
            this.f11274K = (CTInboxMessageType) parcel.readValue(CTInboxMessageType.class.getClassLoader());
            if (parcel.readByte() == 1) {
                ArrayList arrayList = new ArrayList();
                this.f11272I = arrayList;
                parcel.readList(arrayList, String.class.getClassLoader());
            } else {
                this.f11272I = null;
            }
            this.f11277b = parcel.readString();
            if (parcel.readByte() == 1) {
                ArrayList<CTInboxMessageContent> arrayList2 = new ArrayList<>();
                this.f11285j = arrayList2;
                parcel.readList(arrayList2, CTInboxMessageContent.class.getClassLoader());
            } else {
                this.f11285j = null;
            }
            this.f11271H = parcel.readString();
            this.f11279d = parcel.readString();
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.f11275L = jSONObject;
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to parse CTInboxMessage from parcel - "));
        }
    }

    public CTInboxMessage(JSONObject jSONObject) {
        this.f11285j = new ArrayList<>();
        this.f11272I = new ArrayList();
        this.f11281f = jSONObject;
        try {
            this.f11287l = jSONObject.has("id") ? jSONObject.getString("id") : "0";
            this.f11279d = jSONObject.has("wzrk_id") ? jSONObject.getString("wzrk_id") : "0_0";
            this.f11282g = jSONObject.has("date") ? jSONObject.getLong("date") : System.currentTimeMillis() / 1000;
            this.f11283h = jSONObject.has("wzrk_ttl") ? jSONObject.getLong("wzrk_ttl") : System.currentTimeMillis() + 86400000;
            this.f11286k = jSONObject.has("isRead") && jSONObject.getBoolean("isRead");
            JSONObject jSONObject2 = null;
            JSONArray jSONArray = jSONObject.has("tags") ? jSONObject.getJSONArray("tags") : null;
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.f11272I.add(jSONArray.getString(i10));
                }
            }
            JSONObject jSONObject3 = jSONObject.has("msg") ? jSONObject.getJSONObject("msg") : null;
            if (jSONObject3 != null) {
                String str = "";
                this.f11274K = jSONObject3.has("type") ? CTInboxMessageType.fromString(jSONObject3.getString("type")) : CTInboxMessageType.fromString(str);
                this.f11277b = jSONObject3.has("bg") ? jSONObject3.getString("bg") : str;
                JSONArray jSONArray2 = jSONObject3.has("content") ? jSONObject3.getJSONArray("content") : null;
                if (jSONArray2 != null) {
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        CTInboxMessageContent cTInboxMessageContent = new CTInboxMessageContent();
                        cTInboxMessageContent.m6549h(jSONArray2.getJSONObject(i11));
                        this.f11285j.add(cTInboxMessageContent);
                    }
                }
                this.f11271H = jSONObject3.has("orientation") ? jSONObject3.getString("orientation") : "";
            }
            this.f11275L = jSONObject.has("wzrkParams") ? jSONObject.getJSONObject("wzrkParams") : jSONObject2;
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Unable to init CTInboxMessage with JSON - "));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11273J);
        parcel.writeString(this.f11278c);
        parcel.writeString(this.f11284i);
        parcel.writeString(this.f11276a);
        parcel.writeLong(this.f11282g);
        parcel.writeLong(this.f11283h);
        parcel.writeString(this.f11287l);
        JSONObject jSONObject = this.f11281f;
        if (jSONObject == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f11280e;
        if (jSONObject2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject2.toString());
        }
        parcel.writeByte(this.f11286k ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.f11274K);
        ArrayList arrayList = this.f11272I;
        if (arrayList == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(arrayList);
        }
        parcel.writeString(this.f11277b);
        ArrayList<CTInboxMessageContent> arrayList2 = this.f11285j;
        if (arrayList2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(arrayList2);
        }
        parcel.writeString(this.f11271H);
        parcel.writeString(this.f11279d);
        JSONObject jSONObject3 = this.f11275L;
        if (jSONObject3 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeString(jSONObject3.toString());
        }
    }
}
