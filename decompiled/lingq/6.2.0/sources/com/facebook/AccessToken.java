package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC3707w2;
import p000.C3670v2;
import p000.eda;
import p000.fa4;
import p000.sy2;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public final class AccessToken implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Date f11307a;

    /* JADX INFO: renamed from: b */
    public final Set f11308b;

    /* JADX INFO: renamed from: c */
    public final Set f11309c;

    /* JADX INFO: renamed from: d */
    public final Set f11310d;

    /* JADX INFO: renamed from: e */
    public final String f11311e;

    /* JADX INFO: renamed from: f */
    public final AccessTokenSource f11312f;

    /* JADX INFO: renamed from: g */
    public final Date f11313g;

    /* JADX INFO: renamed from: h */
    public final String f11314h;

    /* JADX INFO: renamed from: i */
    public final String f11315i;

    /* JADX INFO: renamed from: j */
    public final Date f11316j;

    /* JADX INFO: renamed from: k */
    public final String f11317k;

    /* JADX INFO: renamed from: l */
    public static final Date f11306l = new Date(Long.MAX_VALUE);

    /* JADX INFO: renamed from: H */
    public static final Date f11304H = new Date();

    /* JADX INFO: renamed from: I */
    public static final AccessTokenSource f11305I = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<AccessToken> CREATOR = new C3670v2(0);

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        ux5.m22974A(str, str2, str3);
        eda.m11071d(str, "accessToken");
        eda.m11071d(str2, "applicationId");
        eda.m11071d(str3, "userId");
        Date date4 = f11306l;
        this.f11307a = date == null ? date4 : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        setUnmodifiableSet.getClass();
        this.f11308b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        setUnmodifiableSet2.getClass();
        this.f11309c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        setUnmodifiableSet3.getClass();
        this.f11310d = setUnmodifiableSet3;
        this.f11311e = str;
        accessTokenSource = accessTokenSource == null ? f11305I : accessTokenSource;
        if (str4 != null && str4.equals("instagram")) {
            int i = AbstractC3707w2.f66236a[accessTokenSource.ordinal()];
            if (i == 1) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
            } else if (i == 2) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i == 3) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f11312f = accessTokenSource;
        this.f11313g = date2 == null ? f11304H : date2;
        this.f11314h = str2;
        this.f11315i = str3;
        this.f11316j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f11317k = str4 == null ? "facebook" : str4;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m5178a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f11311e);
        jSONObject.put("expires_at", this.f11307a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f11308b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f11309c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f11310d));
        jSONObject.put("last_refresh", this.f11313g.getTime());
        jSONObject.put("source", this.f11312f.name());
        jSONObject.put("application_id", this.f11314h);
        jSONObject.put("user_id", this.f11315i);
        jSONObject.put("data_access_expiration_time", this.f11316j.getTime());
        String str = this.f11317k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zM11650l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (fa4.m11650l(this.f11307a, accessToken.f11307a) && fa4.m11650l(this.f11308b, accessToken.f11308b) && fa4.m11650l(this.f11309c, accessToken.f11309c) && fa4.m11650l(this.f11310d, accessToken.f11310d) && fa4.m11650l(this.f11311e, accessToken.f11311e) && this.f11312f == accessToken.f11312f && fa4.m11650l(this.f11313g, accessToken.f11313g) && fa4.m11650l(this.f11314h, accessToken.f11314h) && fa4.m11650l(this.f11315i, accessToken.f11315i) && fa4.m11650l(this.f11316j, accessToken.f11316j)) {
            String str = accessToken.f11317k;
            String str2 = this.f11317k;
            if (str2 == null) {
                zM11650l = str == null;
            } else {
                zM11650l = fa4.m11650l(str2, str);
            }
            if (zM11650l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11316j.hashCode() + ux5.m22980c(ux5.m22980c((this.f11313g.hashCode() + ((this.f11312f.hashCode() + ux5.m22980c((this.f11310d.hashCode() + ((this.f11309c.hashCode() + ((this.f11308b.hashCode() + ((this.f11307a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, this.f11311e, 31)) * 31)) * 31, this.f11314h, 31), this.f11315i, 31)) * 31;
        String str = this.f11317k;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        sy2.m21773h(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        sb.append(TextUtils.join(", ", this.f11308b));
        sb.append("]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11307a.getTime());
        parcel.writeStringList(new ArrayList(this.f11308b));
        parcel.writeStringList(new ArrayList(this.f11309c));
        parcel.writeStringList(new ArrayList(this.f11310d));
        parcel.writeString(this.f11311e);
        parcel.writeString(this.f11312f.name());
        parcel.writeLong(this.f11313g.getTime());
        parcel.writeString(this.f11314h);
        parcel.writeString(this.f11315i);
        parcel.writeLong(this.f11316j.getTime());
        parcel.writeString(this.f11317k);
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        this.f11307a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet.getClass();
        this.f11308b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet2.getClass();
        this.f11309c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        setUnmodifiableSet3.getClass();
        this.f11310d = setUnmodifiableSet3;
        String string = parcel.readString();
        eda.m11073f(string, "token");
        this.f11311e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
        } else {
            accessTokenSourceValueOf = f11305I;
        }
        this.f11312f = accessTokenSourceValueOf;
        this.f11313g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        eda.m11073f(string3, "applicationId");
        this.f11314h = string3;
        String string4 = parcel.readString();
        eda.m11073f(string4, "userId");
        this.f11315i = string4;
        this.f11316j = new Date(parcel.readLong());
        this.f11317k = parcel.readString();
    }
}
