package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.InterfaceC3691vn;
import p000.l70;
import p000.y3a;
import p000.yd7;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements InterfaceC3691vn, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: H */
    public static final Scope f11592H;

    /* JADX INFO: renamed from: I */
    public static final Scope f11593I;

    /* JADX INFO: renamed from: J */
    public static final yd7 f11594J;

    /* JADX INFO: renamed from: k */
    public static final GoogleSignInOptions f11595k;

    /* JADX INFO: renamed from: l */
    public static final Scope f11596l;

    /* JADX INFO: renamed from: a */
    public final int f11597a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11598b;

    /* JADX INFO: renamed from: c */
    public final Account f11599c;

    /* JADX INFO: renamed from: d */
    public final boolean f11600d;

    /* JADX INFO: renamed from: e */
    public final boolean f11601e;

    /* JADX INFO: renamed from: f */
    public final boolean f11602f;

    /* JADX INFO: renamed from: g */
    public final String f11603g;

    /* JADX INFO: renamed from: h */
    public final String f11604h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f11605i;

    /* JADX INFO: renamed from: j */
    public final String f11606j;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f11596l = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f11592H = scope3;
        f11593I = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f11593I)) {
            Scope scope4 = f11592H;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f11595k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f11593I)) {
            Scope scope5 = f11592H;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new y3a(13);
        f11594J = new yd7(15);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.f11597a = i;
        this.f11598b = arrayList;
        this.f11599c = account;
        this.f11600d = z;
        this.f11601e = z2;
        this.f11602f = z3;
        this.f11603g = str;
        this.f11604h = str2;
        this.f11605i = new ArrayList(map.values());
        this.f11606j = str3;
    }

    /* JADX INFO: renamed from: J */
    public static HashMap m5271J(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f11611b), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: r */
    public static GoogleSignInOptions m5272r(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public final boolean equals(Object obj) {
        String str = this.f11603g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f11598b;
            String str2 = googleSignInOptions.f11603g;
            if (this.f11605i.isEmpty() && googleSignInOptions.f11605i.isEmpty()) {
                ArrayList arrayList2 = this.f11598b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.f11599c;
                    Account account2 = googleSignInOptions.f11599c;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f11602f == googleSignInOptions.f11602f && this.f11600d == googleSignInOptions.f11600d && this.f11601e == googleSignInOptions.f11601e && TextUtils.equals(this.f11606j, googleSignInOptions.f11606j);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11598b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).f11656b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f11599c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f11603g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f11602f ? 1 : 0)) * 31) + (this.f11600d ? 1 : 0)) * 31) + (this.f11601e ? 1 : 0)) * 31;
        String str2 = this.f11606j;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11597a);
        l70.m15934Y(parcel, 2, new ArrayList(this.f11598b));
        l70.m15929T(parcel, 3, this.f11599c, i);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11600d ? 1 : 0);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11601e ? 1 : 0);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeInt(this.f11602f ? 1 : 0);
        l70.m15930U(parcel, 7, this.f11603g);
        l70.m15930U(parcel, 8, this.f11604h);
        l70.m15934Y(parcel, 9, this.f11605i);
        l70.m15930U(parcel, 10, this.f11606j);
        l70.m15939b0(parcel, iM15937a0);
    }
}
