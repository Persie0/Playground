package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zi9 {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f71621c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static zi9 f71622d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f71623a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f71624b;

    public zi9(Context context) {
        this.f71624b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public static zi9 m25669a(Context context) {
        lda.m16130p(context);
        ReentrantLock reentrantLock = f71621c;
        reentrantLock.lock();
        try {
            if (f71622d == null) {
                f71622d = new zi9(context.getApplicationContext());
            }
            return f71622d;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m25670f(String str, String str2) {
        return AbstractC3393o1.m17739n(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount m25671b() {
        String strM25674e;
        String strM25674e2 = m25674e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM25674e2) && (strM25674e = m25674e(m25670f("googleSignInAccount", strM25674e2))) != null) {
            try {
                return GoogleSignInAccount.m5270r(strM25674e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m25672c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        lda.m16130p(googleSignInAccount);
        lda.m16130p(googleSignInOptions);
        String str = googleSignInAccount.f11587h;
        m25673d("defaultGoogleSignInAccount", str);
        String strM25670f = m25670f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f11580a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f11581b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f11582c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f11583d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f11589j;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f11590k;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f11584e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f11585f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f11586g);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f11588i;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, yd7.f69695b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f11656b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m25673d(strM25670f, jSONObject.toString());
            String strM25670f2 = m25670f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f11604h;
            String str10 = googleSignInOptions.f11603g;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.f11598b;
                Collections.sort(arrayList, GoogleSignInOptions.f11594J);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f11656b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f11599c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f11600d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f11602f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f11601e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                m25673d(strM25670f2, jSONObject2.toString());
            } catch (JSONException e) {
                v63.m23141s(e);
            }
        } catch (JSONException e2) {
            v63.m23141s(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25673d(String str, String str2) {
        ReentrantLock reentrantLock = this.f71623a;
        reentrantLock.lock();
        try {
            this.f71624b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m25674e(String str) {
        ReentrantLock reentrantLock = this.f71623a;
        reentrantLock.lock();
        try {
            return this.f71624b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
