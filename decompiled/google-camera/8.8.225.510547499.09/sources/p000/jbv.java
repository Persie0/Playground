package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbv {

    /* JADX INFO: renamed from: c */
    private static final Lock f33676c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    private static jbv f33677d;

    /* JADX INFO: renamed from: a */
    public final Lock f33678a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f33679b;

    public jbv(Context context) {
        this.f33679b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: c */
    public static jbv m12850c(Context context) {
        jib.m13205j(context);
        f33676c.lock();
        try {
            if (f33677d == null) {
                f33677d = new jbv(context.getApplicationContext());
            }
            return f33677d;
        } finally {
            f33676c.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    public final GoogleSignInAccount m12851a() {
        String strM12853d;
        String str = gBCSQzBeB.bwQkg;
        String strM12853d2 = m12853d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM12853d2) && (strM12853d = m12853d(m12854e("googleSignInAccount", strM12853d2))) != null) {
            try {
                if (TextUtils.isEmpty(strM12853d)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(strM12853d);
                String strOptString = jSONObject.optString("photoUrl");
                Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                long j = Long.parseLong(jSONObject.getString("expirationTime"));
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String strOptString2 = jSONObject.optString("id");
                String strOptString3 = jSONObject.has(str) ? jSONObject.optString(str) : null;
                String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                Long lValueOf = Long.valueOf(j);
                String string = jSONObject.getString("obfuscatedIdentifier");
                long jLongValue = lValueOf.longValue();
                jib.m13203h(string);
                GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString6, strOptString7);
                googleSignInAccount.f7563g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                return googleSignInAccount;
            } catch (JSONException e) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final GoogleSignInOptions m12852b() {
        String strM12853d;
        String strM12853d2 = m12853d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM12853d2) || (strM12853d = m12853d(m12854e("googleSignInOptions", strM12853d2))) == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(strM12853d)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM12853d);
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("scopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new Scope(jSONArray.getString(i)));
            }
            String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
            return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m12853d(String str) {
        this.f33678a.lock();
        try {
            return this.f33679b.getString(str, null);
        } finally {
            this.f33678a.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m12854e(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: f */
    protected final void m12855f(String str, String str2) {
        this.f33678a.lock();
        try {
            this.f33679b.edit().putString(str, str2).apply();
        } finally {
            this.f33678a.unlock();
        }
    }
}
