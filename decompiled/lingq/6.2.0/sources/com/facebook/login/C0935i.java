package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Date;
import p000.C3028g7;
import p000.C3440oy;
import p000.InterfaceC2991f7;
import p000.ad3;
import p000.fa4;
import p000.id3;
import p000.sy2;
import p000.web;
import p000.x74;

/* JADX INFO: renamed from: com.facebook.login.i */
/* JADX INFO: loaded from: classes2.dex */
public class C0935i extends AbstractComponentCallbacksC0635c {

    /* JADX INFO: renamed from: A0 */
    public View f11506A0;

    /* JADX INFO: renamed from: w0 */
    public String f11507w0;

    /* JADX INFO: renamed from: x0 */
    public LoginClient.Request f11508x0;

    /* JADX INFO: renamed from: y0 */
    public LoginClient f11509y0;

    /* JADX INFO: renamed from: z0 */
    public ad3 f11510z0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(com.facebook.common.R$layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.R$id.com_facebook_login_fragment_progress_bar);
        viewFindViewById.getClass();
        this.f11506A0 = viewFindViewById;
        m5249c0().f11448e = new web(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: B */
    public final void mo2075B() {
        LoginMethodHandler loginMethodHandlerM5222f = m5249c0().m5222f();
        if (loginMethodHandlerM5222f != null) {
            loginMethodHandlerM5222f.mo5214b();
        }
        this.f5688b0 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: G */
    public final void mo2080G() {
        this.f5688b0 = true;
        View view = this.f5692d0;
        View viewFindViewById = view != null ? view.findViewById(com.facebook.common.R$id.com_facebook_login_fragment_progress_bar) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        if (this.f11507w0 == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            id3 id3VarM2105g = m2105g();
            if (id3VarM2105g != null) {
                id3VarM2105g.finish();
                return;
            }
            return;
        }
        LoginClient loginClientM5249c0 = m5249c0();
        LoginClient.Request request = this.f11508x0;
        LoginClient.Request request2 = loginClientM5249c0.f11450g;
        if ((request2 == null || loginClientM5249c0.f11445b < 0) && request != null) {
            LoginTargetApp loginTargetApp = request.f11457I;
            if (request2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = AccessToken.f11306l;
            if (!x74.m24366w() || loginClientM5249c0.m5218b()) {
                loginClientM5249c0.f11450g = request;
                ArrayList arrayList = new ArrayList();
                LoginBehavior loginBehavior = request.f11464a;
                LoginTargetApp loginTargetApp2 = LoginTargetApp.INSTAGRAM;
                if (loginTargetApp != loginTargetApp2) {
                    if (loginBehavior.allowsGetTokenAuth()) {
                        arrayList.add(new GetTokenLoginMethodHandler(loginClientM5249c0));
                    }
                    if (!sy2.f61600p && loginBehavior.allowsKatanaAuth()) {
                        arrayList.add(new KatanaProxyLoginMethodHandler(loginClientM5249c0));
                    }
                } else if (!sy2.f61600p && loginBehavior.allowsInstagramAppAuth()) {
                    arrayList.add(new InstagramAppLoginMethodHandler(loginClientM5249c0));
                }
                if (loginBehavior.allowsCustomTabAuth()) {
                    arrayList.add(new CustomTabLoginMethodHandler(loginClientM5249c0));
                }
                if (loginBehavior.allowsWebViewAuth()) {
                    arrayList.add(new WebViewLoginMethodHandler(loginClientM5249c0));
                }
                if (loginTargetApp != loginTargetApp2 && loginBehavior.allowsDeviceAuth()) {
                    arrayList.add(new DeviceAuthMethodHandler(loginClientM5249c0));
                }
                loginClientM5249c0.f11444a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
                loginClientM5249c0.m5226j();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        bundle.putParcelable("loginClient", m5249c0());
    }

    /* JADX INFO: renamed from: c0 */
    public final LoginClient m5249c0() {
        LoginClient loginClient = this.f11509y0;
        if (loginClient != null) {
            return loginClient;
        }
        fa4.m11636J("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: w */
    public final void mo2121w(int i, int i2, Intent intent) {
        super.mo2121w(i, i2, intent);
        m5249c0().m5225i(i, i2, intent);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        Bundle bundleExtra;
        super.mo2124z(bundle);
        LoginClient loginClient = bundle != null ? (LoginClient) bundle.getParcelable("loginClient") : null;
        if (loginClient == null) {
            loginClient = new LoginClient();
            loginClient.f11445b = -1;
            if (loginClient.f11446c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f11446c = this;
        } else {
            if (loginClient.f11446c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f11446c = this;
        }
        this.f11509y0 = loginClient;
        m5249c0().f11447d = new C3440oy(this, 24);
        id3 id3VarM2105g = m2105g();
        if (id3VarM2105g == null) {
            return;
        }
        ComponentName callingActivity = id3VarM2105g.getCallingActivity();
        if (callingActivity != null) {
            this.f11507w0 = callingActivity.getPackageName();
        }
        Intent intent = id3VarM2105g.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f11508x0 = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        C3028g7 c3028g7 = new C3028g7(1);
        final LoginFragment$getLoginMethodHandlerCallback$1 loginFragment$getLoginMethodHandlerCallback$1 = new LoginFragment$getLoginMethodHandlerCallback$1(this, id3VarM2105g);
        this.f11510z0 = (ad3) m2088P(new InterfaceC2991f7() { // from class: com.facebook.login.h
            @Override // p000.InterfaceC2991f7
            /* JADX INFO: renamed from: c */
            public final void mo2125c(Object obj) {
                ((LoginFragment$getLoginMethodHandlerCallback$1) loginFragment$getLoginMethodHandlerCallback$1).invoke((ActivityResult) obj);
            }
        }, c3028g7);
    }
}
