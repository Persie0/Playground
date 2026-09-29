package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.internal.CallbackManagerImpl$RequestCodeOffset;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.hfb;
import p000.lp1;
import p000.q76;
import p000.s76;
import p000.sy2;
import p000.ty2;

/* JADX INFO: loaded from: classes2.dex */
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new hfb(13);

    /* JADX INFO: renamed from: d */
    public final String f11441d;

    /* JADX INFO: renamed from: e */
    public final AccessTokenSource f11442e;

    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11441d = "instagram_login";
        this.f11442e = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String mo5197e() {
        return this.f11441d;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final int mo5201k(LoginClient.Request request) {
        Object obj;
        request.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            sy2 sy2Var = sy2.f61585a;
        }
        String string = jSONObject.toString();
        string.getClass();
        Context contextM5221e = m5240d().m5221e();
        if (contextM5221e == null) {
            contextM5221e = sy2.m21766a();
        }
        String str = request.f11467d;
        Set set = request.f11465b;
        boolean zM5230d = request.m5230d();
        DefaultAudience defaultAudience = request.f11466c;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String strM5239c = m5239c(request.f11470g);
        String str2 = request.f11473j;
        String str3 = request.f11475l;
        boolean z = request.f11456H;
        boolean z2 = request.f11458J;
        boolean z3 = request.f11459K;
        s76 s76Var = s76.f60467a;
        Set set2 = lp1.f49971a;
        Intent intent = null;
        if (!set2.contains(s76.class)) {
            try {
                str.getClass();
                set.getClass();
                defaultAudience2.getClass();
                str2.getClass();
                try {
                    obj = s76.class;
                    try {
                        Intent intentM21144c = s76.f60467a.m21144c(new q76(), str, set, string, zM5230d, defaultAudience2, strM5239c, str2, false, str3, z, LoginTargetApp.INSTAGRAM, z2, z3, "", null, null);
                        if (!set2.contains(obj) && intentM21144c != null) {
                            try {
                                ResolveInfo resolveInfoResolveActivity = contextM5221e.getPackageManager().resolveActivity(intentM21144c, 0);
                                if (resolveInfoResolveActivity != null) {
                                    String str4 = resolveInfoResolveActivity.activityInfo.packageName;
                                    str4.getClass();
                                    if (ty2.m22350a(contextM5221e, str4)) {
                                        intent = intentM21144c;
                                    }
                                }
                            } catch (Throwable th) {
                                lp1.m16420a(obj, th);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lp1.m16420a(obj, th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = s76.class;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = s76.class;
            }
        }
        Intent intent2 = intent;
        m5238a("e2e", string);
        CallbackManagerImpl$RequestCodeOffset.Login.toRequestCode();
        return m5246p(intent2) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* JADX INFO: renamed from: m */
    public final AccessTokenSource mo5216m() {
        return this.f11442e;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
    }

    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11441d = "instagram_login";
        this.f11442e = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }
}
