package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5056a0;
import p067d8.C5086z;
import p291o7.C7995e;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "b", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AccessToken implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Date f11371a;

    /* JADX INFO: renamed from: b */
    public final Set<String> f11372b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f11373c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f11374d;

    /* JADX INFO: renamed from: e */
    public final String f11375e;

    /* JADX INFO: renamed from: f */
    public final AccessTokenSource f11376f;

    /* JADX INFO: renamed from: g */
    public final Date f11377g;

    /* JADX INFO: renamed from: h */
    public final String f11378h;

    /* JADX INFO: renamed from: i */
    public final String f11379i;

    /* JADX INFO: renamed from: j */
    public final Date f11380j;

    /* JADX INFO: renamed from: k */
    public final String f11381k;

    /* JADX INFO: renamed from: l */
    public static final Date f11370l = new Date(Long.MAX_VALUE);

    /* JADX INFO: renamed from: H */
    public static final Date f11368H = new Date();

    /* JADX INFO: renamed from: I */
    public static final AccessTokenSource f11369I = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<AccessToken> CREATOR = new C2261a();

    /* JADX INFO: renamed from: com.facebook.AccessToken$a */
    public static final class C2261a implements Parcelable.Creator<AccessToken> {
        @Override // android.os.Parcelable.Creator
        public final AccessToken createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new AccessToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AccessToken[] newArray(int i10) {
            return new AccessToken[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$b */
    public static final class C2262b {
        /* JADX INFO: renamed from: a */
        public static AccessToken m6594a(JSONObject jSONObject) throws JSONException {
            if (jSONObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string2 = jSONObject.getString("source");
            C5207g.m11110e(string2, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
            String string3 = jSONObject.getString("application_id");
            String string4 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            C5207g.m11110e(string, "token");
            C5207g.m11110e(string3, "applicationId");
            C5207g.m11110e(string4, "userId");
            C5086z c5086z = C5086z.f33015a;
            C5207g.m11110e(jSONArray, "permissionsArray");
            ArrayList arrayListM10804C = C5086z.m10804C(jSONArray);
            C5207g.m11110e(jSONArray2, "declinedPermissionsArray");
            return new AccessToken(string, string3, string4, arrayListM10804C, C5086z.m10804C(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : C5086z.m10804C(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        /* JADX INFO: renamed from: b */
        public static AccessToken m6595b() {
            return C7995e.f43517f.m15863a().f43521c;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m6596c() {
            AccessToken accessToken = C7995e.f43517f.m15863a().f43521c;
            return (accessToken == null || new Date().after(accessToken.f11371a)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$c */
    public /* synthetic */ class C2263c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11382a;

        static {
            int[] iArr = new int[AccessTokenSource.valuesCustom().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            f11382a = iArr;
        }
    }

    public AccessToken(Parcel parcel) {
        C5207g.m11111f(parcel, "parcel");
        this.f11371a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C5207g.m11110e(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f11372b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C5207g.m11110e(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f11373c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C5207g.m11110e(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f11374d = setUnmodifiableSet3;
        String string = parcel.readString();
        C5056a0.m10746d(string, "token");
        this.f11375e = string;
        String string2 = parcel.readString();
        this.f11376f = string2 != null ? AccessTokenSource.valueOf(string2) : f11369I;
        this.f11377g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        C5056a0.m10746d(string3, "applicationId");
        this.f11378h = string3;
        String string4 = parcel.readString();
        C5056a0.m10746d(string4, "userId");
        this.f11379i = string4;
        this.f11380j = new Date(parcel.readLong());
        this.f11381k = parcel.readString();
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, "facebook");
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        C5207g.m11111f(str, "accessToken");
        C5207g.m11111f(str2, "applicationId");
        C5207g.m11111f(str3, "userId");
        C5056a0.m10744b(str, "accessToken");
        C5056a0.m10744b(str2, "applicationId");
        C5056a0.m10744b(str3, "userId");
        Date date4 = f11370l;
        this.f11371a = date == null ? date4 : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        C5207g.m11110e(setUnmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f11372b = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        C5207g.m11110e(setUnmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f11373c = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        C5207g.m11110e(setUnmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f11374d = setUnmodifiableSet3;
        this.f11375e = str;
        accessTokenSource = accessTokenSource == null ? f11369I : accessTokenSource;
        if (str4 != null && str4.equals("instagram")) {
            int i10 = C2263c.f11382a[accessTokenSource.ordinal()];
            if (i10 == 1) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
            } else if (i10 == 2) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i10 == 3) {
                accessTokenSource = AccessTokenSource.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f11376f = accessTokenSource;
        this.f11377g = date2 == null ? f11368H : date2;
        this.f11378h = str2;
        this.f11379i = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = date4;
        }
        this.f11380j = date3;
        this.f11381k = str4 == null ? "facebook" : str4;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6593a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f11375e);
        jSONObject.put("expires_at", this.f11371a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f11372b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f11373c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f11374d));
        jSONObject.put("last_refresh", this.f11377g.getTime());
        jSONObject.put("source", this.f11376f.name());
        jSONObject.put("application_id", this.f11378h);
        jSONObject.put("user_id", this.f11379i);
        jSONObject.put("data_access_expiration_time", this.f11380j.getTime());
        String str = this.f11381k;
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
        boolean zM11106a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (C5207g.m11106a(this.f11371a, accessToken.f11371a) && C5207g.m11106a(this.f11372b, accessToken.f11372b) && C5207g.m11106a(this.f11373c, accessToken.f11373c) && C5207g.m11106a(this.f11374d, accessToken.f11374d) && C5207g.m11106a(this.f11375e, accessToken.f11375e) && this.f11376f == accessToken.f11376f && C5207g.m11106a(this.f11377g, accessToken.f11377g) && C5207g.m11106a(this.f11378h, accessToken.f11378h) && C5207g.m11106a(this.f11379i, accessToken.f11379i) && C5207g.m11106a(this.f11380j, accessToken.f11380j)) {
            String str = this.f11381k;
            String str2 = accessToken.f11381k;
            if (str == null) {
                zM11106a = str2 == null;
            } else {
                zM11106a = C5207g.m11106a(str, str2);
            }
            if (zM11106a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11380j.hashCode() + C0166e.m758d(this.f11379i, C0166e.m758d(this.f11378h, (this.f11377g.hashCode() + ((this.f11376f.hashCode() + C0166e.m758d(this.f11375e, (this.f11374d.hashCode() + ((this.f11373c.hashCode() + ((this.f11372b.hashCode() + ((this.f11371a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.f11381k;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:");
        C8004n c8004n = C8004n.f43550a;
        sb2.append(C8004n.m15879i(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.f11375e : "ACCESS_TOKEN_REMOVED");
        sb2.append(" permissions:[");
        sb2.append(TextUtils.join(", ", this.f11372b));
        sb2.append("]}");
        String string = sb2.toString();
        C5207g.m11110e(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeLong(this.f11371a.getTime());
        parcel.writeStringList(new ArrayList(this.f11372b));
        parcel.writeStringList(new ArrayList(this.f11373c));
        parcel.writeStringList(new ArrayList(this.f11374d));
        parcel.writeString(this.f11375e);
        parcel.writeString(this.f11376f.name());
        parcel.writeLong(this.f11377g.getTime());
        parcel.writeString(this.f11378h);
        parcel.writeString(this.f11379i);
        parcel.writeLong(this.f11380j.getTime());
        parcel.writeString(this.f11381k);
    }
}
