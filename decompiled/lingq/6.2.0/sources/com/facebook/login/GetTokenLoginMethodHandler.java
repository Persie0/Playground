package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import java.util.ArrayList;
import p000.fa4;
import p000.hfb;
import p000.lp1;
import p000.s76;
import p000.sy2;
import p000.vg1;
import p000.web;
import p000.ymb;

/* JADX INFO: loaded from: classes2.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new hfb(11);

    /* JADX INFO: renamed from: c */
    public C0930d f11439c;

    /* JADX INFO: renamed from: d */
    public final String f11440d;

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        this.f11487b = loginClient;
        this.f11440d = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public final void mo5214b() {
        C0930d c0930d = this.f11439c;
        if (c0930d != null) {
            c0930d.f38679d = false;
            c0930d.f38678c = null;
            this.f11439c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String mo5197e() {
        return this.f11440d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #0 {all -> 0x0095, blocks: (B:8:0x0024, B:13:0x002d, B:25:0x0056, B:28:0x0060, B:19:0x004d, B:16:0x003d), top: B:47:0x0024, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:8:0x0024, B:13:0x002d, B:25:0x0056, B:28:0x0060, B:19:0x004d, B:16:0x003d), top: B:47:0x0024, inners: #1 }] */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final int mo5201k(LoginClient.Request request) {
        int i;
        Intent intentM21136d;
        boolean z;
        request.getClass();
        Context contextM5221e = m5240d().m5221e();
        if (contextM5221e == null) {
            contextM5221e = sy2.m21766a();
        }
        C0930d c0930d = new C0930d(contextM5221e, request.f11467d, String.valueOf(request.f11468e), request.f11460L);
        this.f11439c = c0930d;
        synchronized (c0930d) {
            try {
                if (!c0930d.f38679d) {
                    int i2 = c0930d.f38685j;
                    s76 s76Var = s76.f60467a;
                    if (lp1.f49971a.contains(s76.class)) {
                        i = 0;
                        if (i == -1) {
                            intentM21136d = s76.m21136d(c0930d.f38676a);
                            if (intentM21136d == null) {
                                z = false;
                            } else {
                                c0930d.f38679d = true;
                                c0930d.f38676a.bindService(intentM21136d, c0930d, 1);
                                z = true;
                            }
                        }
                    } else {
                        try {
                            i = s76.f60467a.m21146g(s76.f60468b, new int[]{i2}).f34342b;
                        } catch (Throwable th) {
                            lp1.m16420a(s76.class, th);
                            i = 0;
                        }
                        if (i == -1) {
                            intentM21136d = s76.m21136d(c0930d.f38676a);
                            if (intentM21136d == null) {
                                z = false;
                            } else {
                                c0930d.f38679d = true;
                                c0930d.f38676a.bindService(intentM21136d, c0930d, 1);
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z) {
            return 0;
        }
        web webVar = m5240d().f11448e;
        if (webVar != null) {
            View view = ((C0935i) webVar.f66742a).f11506A0;
            if (view == null) {
                fa4.m11636J("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        vg1 vg1Var = new vg1(11, this, request);
        C0930d c0930d2 = this.f11439c;
        if (c0930d2 != null) {
            c0930d2.f38678c = vg1Var;
        }
        return 1;
    }

    /* JADX INFO: renamed from: l */
    public final void m5215l(Bundle bundle, LoginClient.Request request) {
        LoginClient.Result result;
        AuthenticationToken authenticationToken;
        request.getClass();
        bundle.getClass();
        try {
            AccessToken accessTokenM25199a = ymb.m25199a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.f11467d);
            String str = request.f11460L;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                authenticationToken = null;
            } else {
                try {
                    authenticationToken = new AuthenticationToken(string, str);
                } catch (Exception e) {
                    throw new FacebookException(e.getMessage());
                }
            }
            result = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, accessTokenM25199a, authenticationToken, null, null);
        } catch (FacebookException e2) {
            LoginClient.Request request2 = m5240d().f11450g;
            String message = e2.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            result = new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        m5240d().m5220d(result);
    }

    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11440d = "get_token";
    }
}
