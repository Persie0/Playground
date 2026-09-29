package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Metadata;
import p067d8.C5079s;
import p173i8.C6205a;
import p274n8.C7721f;
import p290o6.C7946b;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C2317a();

    /* JADX INFO: renamed from: c */
    public C7721f f11596c;

    /* JADX INFO: renamed from: d */
    public final String f11597d;

    /* JADX INFO: renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    public static final class C2317a implements Parcelable.Creator<GetTokenLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GetTokenLoginMethodHandler[] newArray(int i10) {
            return new GetTokenLoginMethodHandler[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "source");
        this.f11597d = "get_token";
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11597d = "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: b */
    public final void mo6699b() {
        C7721f c7721f = this.f11596c;
        if (c7721f == null) {
            return;
        }
        c7721f.f33003d = false;
        c7721f.f33002c = null;
        this.f11596c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String getF11647f() {
        return this.f11597d;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:7:0x001a, B:13:0x0025, B:27:0x0053, B:30:0x0060, B:20:0x0047, B:17:0x0036), top: B:53:0x001a, inners: #0 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: q */
    public final int mo6685q(LoginClient.Request request) {
        int i10;
        int i11;
        Intent intentM10784d;
        boolean z10;
        Context contextM6706e = m6717d().m6706e();
        if (contextM6706e == null) {
            contextM6706e = C8004n.m15871a();
        }
        C7721f c7721f = new C7721f(contextM6706e, request);
        this.f11596c = c7721f;
        synchronized (c7721f) {
            try {
                i10 = 1;
                if (!c7721f.f33003d) {
                    C5079s c5079s = C5079s.f32992a;
                    int i12 = c7721f.f33008i;
                    if (!C6205a.m12742b(C5079s.class)) {
                        try {
                            i11 = C5079s.f32992a.m10793g(C5079s.f32994c, new int[]{i12}).f32998a;
                        } catch (Throwable th2) {
                            C6205a.m12741a(C5079s.class, th2);
                            i11 = 0;
                        }
                        if (i11 == -1) {
                            C5079s c5079s2 = C5079s.f32992a;
                            intentM10784d = C5079s.m10784d(c7721f.f33000a);
                            if (intentM10784d == null) {
                                z10 = false;
                            } else {
                                c7721f.f33003d = true;
                                c7721f.f33000a.bindService(intentM10784d, c7721f, 1);
                                z10 = true;
                            }
                        }
                    }
                    i11 = 0;
                    if (i11 == -1) {
                        C5079s c5079s3 = C5079s.f32992a;
                        intentM10784d = C5079s.m10784d(c7721f.f33000a);
                        if (intentM10784d == null) {
                            z10 = false;
                        } else {
                            c7721f.f33003d = true;
                            c7721f.f33000a.bindService(intentM10784d, c7721f, 1);
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (C5207g.m11106a(Boolean.valueOf(z10), Boolean.FALSE)) {
            return 0;
        }
        LoginClient.InterfaceC2322a interfaceC2322a = m6717d().f11605e;
        if (interfaceC2322a != null) {
            interfaceC2322a.mo6713a();
        }
        C7946b c7946b = new C7946b(this, i10, request);
        C7721f c7721f2 = this.f11596c;
        if (c7721f2 != null) {
            c7721f2.f33002c = c7946b;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final void m6700r(Bundle bundle, LoginClient.Request request) {
        LoginClient.Result result;
        AuthenticationToken authenticationToken;
        C5207g.m11111f(request, "request");
        C5207g.m11111f(bundle, "result");
        try {
            AccessToken accessTokenM6720a = LoginMethodHandler.C2325a.m6720a(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.f11622d);
            String str = request.f11615J;
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                boolean z10 = true;
                if ((string.length() == 0) || str == null) {
                    authenticationToken = null;
                } else {
                    if (str.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        authenticationToken = null;
                    } else {
                        try {
                            authenticationToken = new AuthenticationToken(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage());
                        }
                    }
                }
            } else {
                authenticationToken = null;
            }
            result = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, accessTokenM6720a, authenticationToken, null, null);
        } catch (FacebookException e11) {
            LoginClient.Request request2 = m6717d().f11607g;
            String message = e11.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            result = new LoginClient.Result(request2, LoginClient.Result.Code.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        m6717d().m6705d(result);
    }
}
