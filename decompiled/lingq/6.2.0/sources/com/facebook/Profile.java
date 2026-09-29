package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import p000.eda;
import p000.fa4;
import p000.hfb;

/* JADX INFO: loaded from: classes.dex */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new hfb(26);

    /* JADX INFO: renamed from: a */
    public final String f11369a;

    /* JADX INFO: renamed from: b */
    public final String f11370b;

    /* JADX INFO: renamed from: c */
    public final String f11371c;

    /* JADX INFO: renamed from: d */
    public final String f11372d;

    /* JADX INFO: renamed from: e */
    public final String f11373e;

    /* JADX INFO: renamed from: f */
    public final Uri f11374f;

    /* JADX INFO: renamed from: g */
    public final Uri f11375g;

    public Profile(JSONObject jSONObject) {
        this.f11369a = jSONObject.optString("id", null);
        this.f11370b = jSONObject.optString("first_name", null);
        this.f11371c = jSONObject.optString("middle_name", null);
        this.f11372d = jSONObject.optString("last_name", null);
        this.f11373e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f11374f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f11375g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f11369a;
        return ((str5 == null && ((Profile) obj).f11369a == null) || fa4.m11650l(str5, ((Profile) obj).f11369a)) && (((str = this.f11370b) == null && ((Profile) obj).f11370b == null) || fa4.m11650l(str, ((Profile) obj).f11370b)) && ((((str2 = this.f11371c) == null && ((Profile) obj).f11371c == null) || fa4.m11650l(str2, ((Profile) obj).f11371c)) && ((((str3 = this.f11372d) == null && ((Profile) obj).f11372d == null) || fa4.m11650l(str3, ((Profile) obj).f11372d)) && ((((str4 = this.f11373e) == null && ((Profile) obj).f11373e == null) || fa4.m11650l(str4, ((Profile) obj).f11373e)) && ((((uri = this.f11374f) == null && ((Profile) obj).f11374f == null) || fa4.m11650l(uri, ((Profile) obj).f11374f)) && (((uri2 = this.f11375g) == null && ((Profile) obj).f11375g == null) || fa4.m11650l(uri2, ((Profile) obj).f11375g))))));
    }

    public final int hashCode() {
        String str = this.f11369a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f11370b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f11371c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f11372d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f11373e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f11374f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f11375g;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f11369a);
        parcel.writeString(this.f11370b);
        parcel.writeString(this.f11371c);
        parcel.writeString(this.f11372d);
        parcel.writeString(this.f11373e);
        Uri uri = this.f11374f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f11375g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        eda.m11073f(str, "id");
        this.f11369a = str;
        this.f11370b = str2;
        this.f11371c = str3;
        this.f11372d = str4;
        this.f11373e = str5;
        this.f11374f = uri;
        this.f11375g = uri2;
    }

    public Profile(Parcel parcel) {
        this.f11369a = parcel.readString();
        this.f11370b = parcel.readString();
        this.f11371c = parcel.readString();
        this.f11372d = parcel.readString();
        this.f11373e = parcel.readString();
        String string = parcel.readString();
        this.f11374f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f11375g = string2 != null ? Uri.parse(string2) : null;
    }
}
