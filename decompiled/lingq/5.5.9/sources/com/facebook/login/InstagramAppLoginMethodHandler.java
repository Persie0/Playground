package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.internal.CallbackManagerImpl;
import dm.C5207g;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5070j;
import p067d8.C5079s;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new C2318a();

    /* JADX INFO: renamed from: d */
    public final String f11598d;

    /* JADX INFO: renamed from: e */
    public final AccessTokenSource f11599e;

    /* JADX INFO: renamed from: com.facebook.login.InstagramAppLoginMethodHandler$a */
    public static final class C2318a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new InstagramAppLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InstagramAppLoginMethodHandler[] newArray(int i10) {
            return new InstagramAppLoginMethodHandler[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
        this.f11598d = "instagram_login";
        this.f11599e = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11598d = "instagram_login";
        this.f11599e = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF11598d() {
        return this.f11598d;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: q */
    public final int mo6685q(LoginClient.Request request) {
        Object obj;
        Intent intentM10791c;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        C5207g.m11110e(string, "e2e.toString()");
        C5079s c5079s = C5079s.f32992a;
        Context contextM6706e = m6717d().m6706e();
        if (contextM6706e == null) {
            contextM6706e = C8004n.m15871a();
        }
        String str = request.f11622d;
        Set<String> set = request.f11620b;
        boolean zM6712a = request.m6712a();
        DefaultAudience defaultAudience = request.f11621c;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String strM6716c = m6716c(request.f11623e);
        String str2 = request.f11626h;
        String str3 = request.f11628j;
        boolean z10 = request.f11629k;
        boolean z11 = request.f11613H;
        boolean z12 = request.f11614I;
        if (C6205a.m12742b(C5079s.class)) {
            intentM10791c = null;
        } else {
            try {
                C5207g.m11111f(str, "applicationId");
                C5207g.m11111f(set, "permissions");
                C5207g.m11111f(defaultAudience2, "defaultAudience");
                C5207g.m11111f(str2, "authType");
                try {
                    intentM10791c = C5079s.f32992a.m10791c(new C5079s.b(), str, set, string, zM6712a, defaultAudience2, strM6716c, str2, false, str3, z10, LoginTargetApp.INSTAGRAM, z11, z12, "");
                    if (C6205a.m12742b(C5079s.class) || intentM10791c == null) {
                        intentM10791c = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveActivity = contextM6706e.getPackageManager().resolveActivity(intentM10791c, 0);
                            if (resolveInfoResolveActivity != null) {
                                HashSet<String> hashSet = C5070j.f32956a;
                                String str4 = resolveInfoResolveActivity.activityInfo.packageName;
                                C5207g.m11110e(str4, "resolveInfo.activityInfo.packageName");
                                if (!C5070j.m10766a(contextM6706e, str4)) {
                                }
                            }
                        } catch (Throwable th2) {
                            obj = C5079s.class;
                            try {
                                C6205a.m12741a(obj, th2);
                            } catch (Throwable th3) {
                                th = th3;
                                C6205a.m12741a(obj, th);
                            }
                        }
                        intentM10791c = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = C5079s.class;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = C5079s.class;
            }
        }
        m6715a(string, "e2e");
        CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        return m6723A(intentM10791c) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* JADX INFO: renamed from: w */
    public final AccessTokenSource mo6701w() {
        return this.f11599e;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        super.writeToParcel(parcel, i10);
    }
}
