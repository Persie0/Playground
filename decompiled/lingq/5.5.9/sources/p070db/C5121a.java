package p070db;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p176ib.C6272i;

/* JADX INFO: renamed from: db.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5121a {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f33104c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static C5121a f33105d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f33106a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f33107b;

    public C5121a(Context context) {
        this.f33107b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C5121a m10901a(Context context) {
        C6272i.m12915i(context);
        ReentrantLock reentrantLock = f33104c;
        reentrantLock.lock();
        try {
            if (f33105d == null) {
                f33105d = new C5121a(context.getApplicationContext());
            }
            C5121a c5121a = f33105d;
            reentrantLock.unlock();
            return c5121a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m10902g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount m10903b() {
        String strM10906e = m10906e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM10906e)) {
            String strM10906e2 = m10906e(m10902g("googleSignInAccount", strM10906e));
            if (strM10906e2 != null) {
                try {
                    return GoogleSignInAccount.m7520C(strM10906e2);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final GoogleSignInOptions m10904c() {
        String strM10906e;
        String strM10906e2 = m10906e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM10906e2) || (strM10906e = m10906e(m10902g("googleSignInOptions", strM10906e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m7523q(strM10906e);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m10905d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C6272i.m12915i(googleSignInOptions);
        String str = googleSignInAccount.f13808i;
        m10907f("defaultGoogleSignInAccount", str);
        String strM10902g = m10902g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f13801b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f13802c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f13803d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f13804e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f13810k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f13811l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f13805f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f13806g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f13807h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.f13809j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: cb.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f13872b.compareTo(((Scope) obj2).f13872b);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f13872b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m10907f(strM10902g, jSONObject.toString());
            String strM10902g2 = m10902g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f13826h;
            String str10 = googleSignInOptions.f13825g;
            ArrayList<Scope> arrayList = googleSignInOptions.f13820b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.f13817M);
                Iterator<Scope> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().f13872b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f13821c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f13822d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f13824f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f13823e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                m10907f(strM10902g2, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m10906e(String str) {
        ReentrantLock reentrantLock = this.f33106a;
        reentrantLock.lock();
        try {
            String string = this.f33107b.getString(str, null);
            reentrantLock.unlock();
            return string;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10907f(String str, String str2) {
        ReentrantLock reentrantLock = this.f33106a;
        reentrantLock.lock();
        try {
            this.f33107b.edit().putString(str, str2).apply();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
