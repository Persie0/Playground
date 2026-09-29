package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.CallbackManagerImpl$RequestCodeOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p000.RunnableC0806bd;
import p000.gna;
import p000.lp1;
import p000.m58;

/* JADX INFO: renamed from: com.facebook.login.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0936j {

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f11511d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a */
    public final String f11512a;

    /* JADX INFO: renamed from: b */
    public final m58 f11513b;

    /* JADX INFO: renamed from: c */
    public final String f11514c;

    public C0936j(Context context, String str) {
        PackageInfo packageInfo;
        this.f11512a = str;
        this.f11513b = new m58(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f11514c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5250d(C0936j c0936j) {
        if (lp1.f49971a.contains(C0936j.class)) {
            return;
        }
        try {
            c0936j.m5253c("fb_mobile_login_complete", "");
        } catch (Throwable th) {
            lp1.m16420a(C0936j.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5251a(String str, HashMap map, LoginClient.Result.Code code, Map map2, Exception exc, String str2) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Bundle bundleM12764a = gna.m12764a(str);
            if (code != null) {
                bundleM12764a.putString("2_result", code.getLoggingValue());
            }
            if ((exc != null ? exc.getMessage() : null) != null) {
                bundleM12764a.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = map.isEmpty() ? null : new JSONObject(map);
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleM12764a.putString("6_extras", jSONObject.toString());
            }
            this.f11513b.m16645i(str2, bundleM12764a);
            if (code != LoginClient.Result.Code.SUCCESS || lp1.f49971a.contains(this)) {
                return;
            }
            try {
                f11511d.schedule(new RunnableC0806bd(25, this, gna.m12764a(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                lp1.m16420a(this, th);
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5252b(LoginClient.Request request, String str) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Bundle bundleM12764a = gna.m12764a(request.f11470g);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", request.f11464a.toString());
                jSONObject.put("request_code", CallbackManagerImpl$RequestCodeOffset.Login.toRequestCode());
                jSONObject.put("permissions", TextUtils.join(",", request.f11465b));
                jSONObject.put("default_audience", request.f11466c.toString());
                jSONObject.put("isReauthorize", request.f11471h);
                String str2 = this.f11514c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                LoginTargetApp loginTargetApp = request.f11457I;
                if (loginTargetApp != null) {
                    jSONObject.put("target_app", loginTargetApp.toString());
                }
                bundleM12764a.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f11513b.m16645i(str, bundleM12764a);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5253c(String str, String str2) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            Bundle bundleM12764a = gna.m12764a("");
            bundleM12764a.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
            bundleM12764a.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            bundleM12764a.putString("3_method", str2);
            this.f11513b.m16645i(str, bundleM12764a);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
