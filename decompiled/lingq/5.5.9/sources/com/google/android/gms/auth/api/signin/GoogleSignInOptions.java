package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0987y;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p046cb.C1763e;
import p046cb.C1764f;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C2542a.c, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: H */
    public static final Scope f13812H;

    /* JADX INFO: renamed from: I */
    public static final Scope f13813I;

    /* JADX INFO: renamed from: J */
    public static final Scope f13814J;

    /* JADX INFO: renamed from: K */
    public static final Scope f13815K;

    /* JADX INFO: renamed from: L */
    public static final Scope f13816L;

    /* JADX INFO: renamed from: M */
    public static final C1763e f13817M;

    /* JADX INFO: renamed from: l */
    public static final GoogleSignInOptions f13818l;

    /* JADX INFO: renamed from: a */
    public final int f13819a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<Scope> f13820b;

    /* JADX INFO: renamed from: c */
    public final Account f13821c;

    /* JADX INFO: renamed from: d */
    public final boolean f13822d;

    /* JADX INFO: renamed from: e */
    public final boolean f13823e;

    /* JADX INFO: renamed from: f */
    public final boolean f13824f;

    /* JADX INFO: renamed from: g */
    public final String f13825g;

    /* JADX INFO: renamed from: h */
    public final String f13826h;

    /* JADX INFO: renamed from: i */
    public final ArrayList<GoogleSignInOptionsExtensionParcelable> f13827i;

    /* JADX INFO: renamed from: j */
    public final String f13828j;

    /* JADX INFO: renamed from: k */
    public final Map<Integer, GoogleSignInOptionsExtensionParcelable> f13829k;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C2540a {

        /* JADX INFO: renamed from: a */
        public final HashSet f13830a;

        /* JADX INFO: renamed from: b */
        public boolean f13831b;

        /* JADX INFO: renamed from: c */
        public boolean f13832c;

        /* JADX INFO: renamed from: d */
        public final boolean f13833d;

        /* JADX INFO: renamed from: e */
        public String f13834e;

        /* JADX INFO: renamed from: f */
        public final Account f13835f;

        /* JADX INFO: renamed from: g */
        public final String f13836g;

        /* JADX INFO: renamed from: h */
        public final HashMap f13837h;

        /* JADX INFO: renamed from: i */
        public String f13838i;

        public C2540a() {
            this.f13830a = new HashSet();
            this.f13837h = new HashMap();
        }

        public C2540a(GoogleSignInOptions googleSignInOptions) {
            this.f13830a = new HashSet();
            this.f13837h = new HashMap();
            C6272i.m12915i(googleSignInOptions);
            this.f13830a = new HashSet(googleSignInOptions.f13820b);
            this.f13831b = googleSignInOptions.f13823e;
            this.f13832c = googleSignInOptions.f13824f;
            this.f13833d = googleSignInOptions.f13822d;
            this.f13834e = googleSignInOptions.f13825g;
            this.f13835f = googleSignInOptions.f13821c;
            this.f13836g = googleSignInOptions.f13826h;
            this.f13837h = GoogleSignInOptions.m7522C(googleSignInOptions.f13827i);
            this.f13838i = googleSignInOptions.f13828j;
        }

        /* JADX INFO: renamed from: a */
        public final GoogleSignInOptions m7524a() {
            Scope scope = GoogleSignInOptions.f13816L;
            HashSet hashSet = this.f13830a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.f13815K;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.f13833d && (this.f13835f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.f13814J);
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f13835f, this.f13833d, this.f13831b, this.f13832c, this.f13834e, this.f13836g, this.f13837h, this.f13838i);
        }

        /* JADX INFO: renamed from: b */
        public final void m7525b() {
            boolean z10 = true;
            this.f13831b = true;
            C6272i.m12912f("1012553130695.apps.googleusercontent.com");
            String str = this.f13834e;
            if (str != null && !str.equals("1012553130695.apps.googleusercontent.com")) {
                z10 = false;
            }
            C6272i.m12907a("two different server client ids provided", z10);
            this.f13834e = "1012553130695.apps.googleusercontent.com";
            this.f13832c = false;
        }
    }

    static {
        Scope scope = new Scope("profile", 1);
        f13812H = scope;
        f13813I = new Scope("email", 1);
        Scope scope2 = new Scope("openid", 1);
        f13814J = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite", 1);
        f13815K = scope3;
        f13816L = new Scope("https://www.googleapis.com/auth/games", 1);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f13816L)) {
            Scope scope4 = f13815K;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f13818l = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f13816L)) {
            Scope scope5 = f13815K;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C1764f();
        f13817M = new C1763e();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public GoogleSignInOptions() {
        throw null;
    }

    public GoogleSignInOptions(int i10, ArrayList<Scope> arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f13819a = i10;
        this.f13820b = arrayList;
        this.f13821c = account;
        this.f13822d = z10;
        this.f13823e = z11;
        this.f13824f = z12;
        this.f13825g = str;
        this.f13826h = str2;
        this.f13827i = new ArrayList<>(map.values());
        this.f13829k = map;
        this.f13828j = str3;
    }

    /* JADX INFO: renamed from: C */
    public static HashMap m7522C(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList == null) {
            return map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f13843b), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    /* JADX INFO: renamed from: q */
    public static GoogleSignInOptions m7523q(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10), 1));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[Catch: ClassCastException -> 0x0097, TRY_ENTER, TryCatch #0 {ClassCastException -> 0x0097, blocks: (B:7:0x000d, B:9:0x0018, B:11:0x001e, B:14:0x0027, B:16:0x0038, B:19:0x0044, B:29:0x0057, B:32:0x0060, B:39:0x0072, B:41:0x0078, B:43:0x007f, B:45:0x0087, B:35:0x0069, B:26:0x0050), top: B:51:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[Catch: ClassCastException -> 0x0097, TryCatch #0 {ClassCastException -> 0x0097, blocks: (B:7:0x000d, B:9:0x0018, B:11:0x001e, B:14:0x0027, B:16:0x0038, B:19:0x0044, B:29:0x0057, B:32:0x0060, B:39:0x0072, B:41:0x0078, B:43:0x007f, B:45:0x0087, B:35:0x0069, B:26:0x0050), top: B:51:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[Catch: ClassCastException -> 0x0097, TryCatch #0 {ClassCastException -> 0x0097, blocks: (B:7:0x000d, B:9:0x0018, B:11:0x001e, B:14:0x0027, B:16:0x0038, B:19:0x0044, B:29:0x0057, B:32:0x0060, B:39:0x0072, B:41:0x0078, B:43:0x007f, B:45:0x0087, B:35:0x0069, B:26:0x0050), top: B:51:0x000d }] */
    public final boolean equals(Object obj) {
        boolean zIsEmpty;
        String str;
        String str2 = this.f13825g;
        ArrayList<Scope> arrayList = this.f13820b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f13827i.size() <= 0) {
                ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = googleSignInOptions.f13827i;
                ArrayList<Scope> arrayList3 = googleSignInOptions.f13820b;
                if (arrayList2.size() <= 0 && arrayList.size() == new ArrayList(arrayList3).size() && arrayList.containsAll(new ArrayList(arrayList3))) {
                    Account account = this.f13821c;
                    Account account2 = googleSignInOptions.f13821c;
                    if (account == null) {
                        if (account2 == null) {
                            zIsEmpty = TextUtils.isEmpty(str2);
                            str = googleSignInOptions.f13825g;
                            if (zIsEmpty) {
                                if (TextUtils.isEmpty(str)) {
                                    if (this.f13824f == googleSignInOptions.f13824f && this.f13822d == googleSignInOptions.f13822d && this.f13823e == googleSignInOptions.f13823e && TextUtils.equals(this.f13828j, googleSignInOptions.f13828j)) {
                                        return true;
                                    }
                                }
                            } else if (!str2.equals(str)) {
                                if (this.f13824f == googleSignInOptions.f13824f) {
                                    return true;
                                }
                            }
                        }
                    } else if (account.equals(account2)) {
                        zIsEmpty = TextUtils.isEmpty(str2);
                        str = googleSignInOptions.f13825g;
                        if (zIsEmpty) {
                            if (TextUtils.isEmpty(str)) {
                                if (this.f13824f == googleSignInOptions.f13824f) {
                                    return true;
                                }
                            }
                        } else if (!str2.equals(str)) {
                            if (this.f13824f == googleSignInOptions.f13824f) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f13820b;
        int size = arrayList2.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(arrayList2.get(i10).f13872b);
        }
        Collections.sort(arrayList);
        int iHashCode2 = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f13821c;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f13825g;
        int iHashCode4 = (((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + (this.f13824f ? 1 : 0)) * 31) + (this.f13822d ? 1 : 0)) * 31) + (this.f13823e ? 1 : 0)) * 31;
        String str2 = this.f13828j;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13819a);
        C0987y.m3834p(parcel, 2, new ArrayList(this.f13820b));
        C0987y.m3831m(parcel, 3, this.f13821c, i10);
        C0987y.m3826h(parcel, 4, this.f13822d);
        C0987y.m3826h(parcel, 5, this.f13823e);
        C0987y.m3826h(parcel, 6, this.f13824f);
        C0987y.m3832n(parcel, 7, this.f13825g);
        C0987y.m3832n(parcel, 8, this.f13826h);
        C0987y.m3834p(parcel, 9, this.f13827i);
        C0987y.m3832n(parcel, 10, this.f13828j);
        C0987y.m3839u(parcel, iM3836r);
    }
}
