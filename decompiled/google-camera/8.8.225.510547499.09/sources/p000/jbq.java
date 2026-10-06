package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbq {

    /* JADX INFO: renamed from: d */
    private static jbq f33670d = null;

    /* JADX INFO: renamed from: a */
    final jbv f33671a;

    /* JADX INFO: renamed from: b */
    GoogleSignInAccount f33672b;

    /* JADX INFO: renamed from: c */
    GoogleSignInOptions f33673c;

    private jbq(Context context) {
        jbv jbvVarM12850c = jbv.m12850c(context);
        this.f33671a = jbvVarM12850c;
        this.f33672b = jbvVarM12850c.m12851a();
        this.f33673c = jbvVarM12850c.m12852b();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized jbq m12843c(Context context) {
        return m12844f(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: f */
    private static synchronized jbq m12844f(Context context) {
        jbq jbqVar;
        jbqVar = f33670d;
        if (jbqVar == null) {
            jbqVar = new jbq(context);
            f33670d = jbqVar;
        }
        return jbqVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized GoogleSignInAccount m12845a() {
        return this.f33672b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized GoogleSignInOptions m12846b() {
        return this.f33673c;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m12847d() {
        jbv jbvVar = this.f33671a;
        jbvVar.f33678a.lock();
        try {
            jbvVar.f33679b.edit().clear().apply();
            jbvVar.f33678a.unlock();
            this.f33672b = null;
            this.f33673c = null;
        } catch (Throwable th) {
            jbvVar.f33678a.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m12848e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        jbv jbvVar = this.f33671a;
        jib.m13205j(googleSignInOptions);
        jbvVar.m12855f("defaultGoogleSignInAccount", googleSignInAccount.f7565i);
        jib.m13205j(googleSignInOptions);
        String str = googleSignInAccount.f7565i;
        String strM12854e = jbvVar.m12854e("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f7558b;
            if (str2 != null) {
                jSONObject.put(gBCSQzBeB.gYMQ, str2);
            }
            String str3 = googleSignInAccount.f7559c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f7560d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f7561e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f7567k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f7568l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f7562f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f7563g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f7564h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f7565i);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f7566j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, amx.f750n);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f7600b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            jbvVar.m12855f(strM12854e, jSONObject.toString());
            String strM12854e2 = jbvVar.m12854e(VCYBIzY.YVvG, str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.f7578i, GoogleSignInOptions.f7576g);
                Iterator it = googleSignInOptions.f7578i.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f7600b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f7579j;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f7580k);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f7582m);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f7581l);
                if (!TextUtils.isEmpty(googleSignInOptions.f7583n)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.f7583n);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.f7584o)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.f7584o);
                }
                jbvVar.m12855f(strM12854e2, jSONObject2.toString());
                this.f33672b = googleSignInAccount;
                this.f33673c = googleSignInOptions;
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
