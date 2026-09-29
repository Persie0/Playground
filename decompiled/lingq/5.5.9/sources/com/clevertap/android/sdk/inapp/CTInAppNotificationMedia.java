package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0204c;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CTInAppNotificationMedia implements Parcelable {
    public static final Parcelable.Creator<CTInAppNotificationMedia> CREATOR = new C2199a();

    /* JADX INFO: renamed from: a */
    public int f11134a;

    /* JADX INFO: renamed from: b */
    public String f11135b;

    /* JADX INFO: renamed from: c */
    public String f11136c;

    /* JADX INFO: renamed from: d */
    public String f11137d;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppNotificationMedia$a */
    public class C2199a implements Parcelable.Creator<CTInAppNotificationMedia> {
        @Override // android.os.Parcelable.Creator
        public final CTInAppNotificationMedia createFromParcel(Parcel parcel) {
            return new CTInAppNotificationMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CTInAppNotificationMedia[] newArray(int i10) {
            return new CTInAppNotificationMedia[i10];
        }
    }

    public CTInAppNotificationMedia() {
    }

    public CTInAppNotificationMedia(Parcel parcel) {
        this.f11137d = parcel.readString();
        this.f11136c = parcel.readString();
        this.f11135b = parcel.readString();
        this.f11134a = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public final CTInAppNotificationMedia m6497a(JSONObject jSONObject, int i10) {
        this.f11134a = i10;
        try {
            this.f11136c = jSONObject.has("content_type") ? jSONObject.getString("content_type") : "";
            String string = jSONObject.has("url") ? jSONObject.getString("url") : "";
            if (!string.isEmpty()) {
                if (this.f11136c.startsWith("image")) {
                    this.f11137d = string;
                    if (jSONObject.has("key")) {
                        this.f11135b = UUID.randomUUID().toString() + jSONObject.getString("key");
                    } else {
                        this.f11135b = UUID.randomUUID().toString();
                    }
                } else {
                    this.f11137d = string;
                }
            }
        } catch (JSONException e10) {
            C0204c.m863w(e10, new StringBuilder("Error parsing Media JSONObject - "));
        }
        if (this.f11136c.isEmpty()) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6498b() {
        String str = this.f11136c;
        return (str == null || this.f11137d == null || !str.startsWith("audio")) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6499c() {
        String str = this.f11136c;
        return (str == null || this.f11137d == null || !str.equals("image/gif")) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6500d() {
        String str = this.f11136c;
        return (str == null || this.f11137d == null || !str.startsWith("image") || str.equals("image/gif")) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6501e() {
        String str = this.f11136c;
        return (str == null || this.f11137d == null || !str.startsWith("video")) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11137d);
        parcel.writeString(this.f11136c);
        parcel.writeString(this.f11135b);
        parcel.writeInt(this.f11134a);
    }
}
