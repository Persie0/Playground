package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import dm.C5207g;
import kotlin.Metadata;
import org.json.JSONObject;
import p067d8.C5056a0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new C2283a();

    /* JADX INFO: renamed from: a */
    public final String f11468a;

    /* JADX INFO: renamed from: b */
    public final String f11469b;

    /* JADX INFO: renamed from: c */
    public final String f11470c;

    /* JADX INFO: renamed from: d */
    public final String f11471d;

    /* JADX INFO: renamed from: e */
    public final String f11472e;

    /* JADX INFO: renamed from: f */
    public final Uri f11473f;

    /* JADX INFO: renamed from: g */
    public final Uri f11474g;

    /* JADX INFO: renamed from: com.facebook.Profile$a */
    public static final class C2283a implements Parcelable.Creator<Profile> {
        @Override // android.os.Parcelable.Creator
        public final Profile createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new Profile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Profile[] newArray(int i10) {
            return new Profile[i10];
        }
    }

    public Profile(Parcel parcel) {
        this.f11468a = parcel.readString();
        this.f11469b = parcel.readString();
        this.f11470c = parcel.readString();
        this.f11471d = parcel.readString();
        this.f11472e = parcel.readString();
        String string = parcel.readString();
        Uri uri = null;
        this.f11473f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        if (string2 != null) {
            uri = Uri.parse(string2);
        }
        this.f11474g = uri;
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        C5056a0.m10746d(str, "id");
        this.f11468a = str;
        this.f11469b = str2;
        this.f11470c = str3;
        this.f11471d = str4;
        this.f11472e = str5;
        this.f11473f = uri;
        this.f11474g = uri2;
    }

    public Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f11468a = jSONObject.optString("id", null);
        this.f11469b = jSONObject.optString("first_name", null);
        this.f11470c = jSONObject.optString("middle_name", null);
        this.f11471d = jSONObject.optString("last_name", null);
        this.f11472e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f11473f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        if (strOptString2 != null) {
            uri = Uri.parse(strOptString2);
        }
        this.f11474g = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        if (dm.C5207g.m11106a(r1, ((com.facebook.Profile) r8).f11474g) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        String str;
        String str2;
        Uri uri;
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str3 = this.f11468a;
        if ((str3 == null && ((Profile) obj).f11468a == null) || C5207g.m11106a(str3, ((Profile) obj).f11468a)) {
            String str4 = this.f11469b;
            if (str4 == null && ((Profile) obj).f11469b == null) {
                str = this.f11470c;
                if (str == null) {
                }
                z10 = false;
            } else if (C5207g.m11106a(str4, ((Profile) obj).f11469b)) {
                str = this.f11470c;
                if ((str == null || ((Profile) obj).f11470c != null) && !C5207g.m11106a(str, ((Profile) obj).f11470c)) {
                    z10 = false;
                } else {
                    String str5 = this.f11471d;
                    if (str5 == null && ((Profile) obj).f11471d == null) {
                        str2 = this.f11472e;
                        if (str2 == null) {
                        }
                        z10 = false;
                    } else if (C5207g.m11106a(str5, ((Profile) obj).f11471d)) {
                        str2 = this.f11472e;
                        if (((str2 == null || ((Profile) obj).f11472e != null) && !C5207g.m11106a(str2, ((Profile) obj).f11472e)) || !(((uri = this.f11473f) == null && ((Profile) obj).f11473f == null) || C5207g.m11106a(uri, ((Profile) obj).f11473f))) {
                            z10 = false;
                        } else {
                            Uri uri2 = this.f11474g;
                            if (uri2 != null || ((Profile) obj).f11474g != null) {
                            }
                        }
                    } else {
                        z10 = false;
                    }
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public final int hashCode() {
        String str = this.f11468a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f11469b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f11470c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f11471d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f11472e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f11473f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f11474g;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeString(this.f11468a);
        parcel.writeString(this.f11469b);
        parcel.writeString(this.f11470c);
        parcel.writeString(this.f11471d);
        parcel.writeString(this.f11472e);
        String string = null;
        Uri uri = this.f11473f;
        parcel.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f11474g;
        if (uri2 != null) {
            string = uri2.toString();
        }
        parcel.writeString(string);
    }
}
