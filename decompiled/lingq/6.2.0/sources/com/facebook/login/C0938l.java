package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl$RequestCodeOffset;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import p000.bzb;
import p000.cm0;
import p000.dm0;
import p000.eda;
import p000.g9a;
import p000.gv5;
import p000.j13;
import p000.pk9;
import p000.sy2;
import p000.u91;
import p000.x74;

/* JADX INFO: renamed from: com.facebook.login.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0938l extends pk9 {

    /* JADX INFO: renamed from: A */
    public final dm0 f11515A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ C0939m f11516B;

    public C0938l(C0939m c0939m, dm0 dm0Var) {
        this.f11516B = c0939m;
        this.f11515A = dm0Var;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: f */
    public final Intent mo5255f(Context context, Object obj) {
        String strM12915y;
        Collection collection = (Collection) obj;
        collection.getClass();
        gv5 gv5Var = new gv5(collection);
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            strM12915y = bzb.m4241a(gv5Var.m12915y(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            strM12915y = gv5Var.m12915y();
        }
        CodeChallengeMethod codeChallengeMethod2 = codeChallengeMethod;
        String str = strM12915y;
        C0939m c0939m = this.f11516B;
        LoginBehavior loginBehavior = c0939m.f11520a;
        Set setM22627s1 = u91.m22627s1(gv5Var.m12875D());
        DefaultAudience defaultAudience = c0939m.f11521b;
        String str2 = c0939m.f11523d;
        String strM21767b = sy2.m21767b();
        String string = UUID.randomUUID().toString();
        string.getClass();
        LoginTargetApp loginTargetApp = c0939m.f11524e;
        String strM12874C = gv5Var.m12874C();
        String strM12915y2 = gv5Var.m12915y();
        eda.m11074g();
        String str3 = sy2.f61590f;
        String str4 = str3 == null ? "" : str3;
        eda.m11074g();
        String str5 = sy2.f61591g;
        LoginClient.Request request = new LoginClient.Request(loginBehavior, setM22627s1, defaultAudience, str2, strM21767b, string, loginTargetApp, strM12874C, strM12915y2, str, codeChallengeMethod2, str4, str5 == null ? "" : str5);
        Date date = AccessToken.f11306l;
        request.m5235i(x74.m24366w());
        request.m5234h();
        request.m5236j();
        request.m5233g();
        request.m5237k();
        C0936j c0936jM14256f = j13.f44891h.m14256f(context);
        if (c0936jM14256f != null) {
            c0936jM14256f.m5252b(request, request.m5231e() ? "foa_mobile_login_start" : "fb_mobile_login_start");
        }
        Intent intent = new Intent();
        intent.setClass(sy2.m21766a(), FacebookActivity.class);
        intent.setAction(request.m5228b().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (sy2.m21766a().getPackageManager().resolveActivity(intent, 0) != null) {
            return intent;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        C0939m.m5257a(context, LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: u */
    public final Object mo5256u(Intent intent, int i) {
        this.f11516B.m5259c(i, intent, null);
        int requestCode = CallbackManagerImpl$RequestCodeOffset.Login.toRequestCode();
        dm0 dm0Var = this.f11515A;
        if (dm0Var != null) {
            g9a.m12435l(dm0Var.f35808a.get(Integer.valueOf(requestCode)));
            synchronized (dm0.f35806b) {
                g9a.m12435l(dm0.f35807c.get(Integer.valueOf(requestCode)));
            }
        }
        return new cm0(requestCode, i, intent);
    }
}
