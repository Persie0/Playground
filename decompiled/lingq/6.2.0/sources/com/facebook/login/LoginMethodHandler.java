package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.HttpMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3012fs;
import p000.bna;
import p000.ema;
import p000.fa4;
import p000.g9a;
import p000.mp3;
import p000.pp3;
import p000.s46;
import p000.sy2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: a */
    public HashMap f11486a;

    /* JADX INFO: renamed from: b */
    public LoginClient f11487b;

    public LoginMethodHandler(Parcel parcel) {
        HashMap map;
        int i = parcel.readInt();
        if (i < 0) {
            map = null;
        } else {
            map = new HashMap();
            for (int i2 = 0; i2 < i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
        }
        this.f11486a = map != null ? new LinkedHashMap(map) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m5238a(String str, String str2) {
        if (this.f11486a == null) {
            this.f11486a = new HashMap();
        }
        HashMap map = this.f11486a;
        if (map != null) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo5214b() {
    }

    /* JADX INFO: renamed from: c */
    public final String m5239c(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo5197e());
            mo5200j(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final LoginClient m5240d() {
        LoginClient loginClient = this.f11487b;
        if (loginClient != null) {
            return loginClient;
        }
        fa4.m11636J("loginClient");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo5197e();

    /* JADX INFO: renamed from: f */
    public String mo5198f() {
        return "fb" + sy2.m21767b() + "://authorize/";
    }

    /* JADX INFO: renamed from: g */
    public final void m5241g(String str) {
        String strM21767b;
        LoginClient.Request request = m5240d().f11450g;
        if (request == null || (strM21767b = request.f11467d) == null) {
            strM21767b = sy2.m21767b();
        }
        C3012fs c3012fs = new C3012fs(m5240d().m5221e(), strM21767b);
        Bundle bundleM12429f = g9a.m12429f("fb_web_login_e2e", str);
        bundleM12429f.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleM12429f.putString("app_id", strM21767b);
        sy2 sy2Var = sy2.f61585a;
        if (ema.m11256c()) {
            c3012fs.m12040g("fb_dialogs_web_login_dialog_complete", bundleM12429f);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean mo5199h(int i, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m5242i(Bundle bundle, LoginClient.Request request) {
        String string = bundle.getString("code");
        if (bna.m3945d0(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        String strMo5198f = mo5198f();
        String str = request.f11461M;
        if (str == null) {
            str = "";
        }
        strMo5198f.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", string);
        bundle2.putString("client_id", sy2.m21767b());
        bundle2.putString("redirect_uri", strMo5198f);
        bundle2.putString("code_verifier", str);
        String str2 = mp3.f51688j;
        mp3 mp3VarM21068p = s46.m21068p(null, "oauth/access_token", null);
        mp3VarM21068p.m16989k(HttpMethod.GET);
        mp3VarM21068p.f51694d = bundle2;
        pp3 pp3VarM16982c = mp3VarM21068p.m16982c();
        FacebookRequestError facebookRequestError = pp3VarM16982c.f56629c;
        if (facebookRequestError != null) {
            throw new FacebookServiceException(facebookRequestError, facebookRequestError.m5184a());
        }
        try {
            JSONObject jSONObject = pp3VarM16982c.f56628b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || bna.m3945d0(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e) {
            throw new FacebookException("Fail to process code exchange response: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo5200j(JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo5201k(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        HashMap map = this.f11486a;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
