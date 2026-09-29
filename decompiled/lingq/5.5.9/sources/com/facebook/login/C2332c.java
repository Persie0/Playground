package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0202a;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0964m;
import androidx.fragment.app.Fragment;
import cm.InterfaceC2052l;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.C2332c;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import p035c.C1644d;
import p291o7.C8004n;
import p402u0.C9371n;
import sl.C9072e;

/* JADX INFO: renamed from: com.facebook.login.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/login/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class C2332c extends Fragment {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ int f11663A0 = 0;

    /* JADX INFO: renamed from: v0 */
    public String f11664v0;

    /* JADX INFO: renamed from: w0 */
    public LoginClient.Request f11665w0;

    /* JADX INFO: renamed from: x0 */
    public LoginClient f11666x0;

    /* JADX INFO: renamed from: y0 */
    public C0964m f11667y0;

    /* JADX INFO: renamed from: z0 */
    public View f11668z0;

    /* JADX INFO: renamed from: com.facebook.login.c$a */
    public static final class a implements LoginClient.InterfaceC2322a {
        public a() {
        }

        @Override // com.facebook.login.LoginClient.InterfaceC2322a
        /* JADX INFO: renamed from: a */
        public final void mo6713a() {
            View view = C2332c.this.f11668z0;
            if (view != null) {
                view.setVisibility(0);
            } else {
                C5207g.m11117l("progressBar");
                throw null;
            }
        }

        @Override // com.facebook.login.LoginClient.InterfaceC2322a
        /* JADX INFO: renamed from: b */
        public final void mo6714b() {
            View view = C2332c.this.f11668z0;
            if (view != null) {
                view.setVisibility(8);
            } else {
                C5207g.m11117l("progressBar");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: D */
    public final void mo3559D(int i10, int i11, Intent intent) {
        super.mo3559D(i10, i11, intent);
        m6731m0().m6710l(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        Bundle bundleExtra;
        super.mo3560H(bundle);
        LoginClient loginClient = bundle == null ? null : (LoginClient) bundle.getParcelable("loginClient");
        if (loginClient == null) {
            loginClient = new LoginClient(this);
        } else {
            if (loginClient.f11603c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f11603c = this;
        }
        this.f11666x0 = loginClient;
        m6731m0().f11604d = new C9371n(4, this);
        final ActivityC0979t activityC0979tM3582e = m3582e();
        if (activityC0979tM3582e == null) {
            return;
        }
        ComponentName callingActivity = activityC0979tM3582e.getCallingActivity();
        if (callingActivity != null) {
            this.f11664v0 = callingActivity.getPackageName();
        }
        Intent intent = activityC0979tM3582e.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f11665w0 = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        C1644d c1644d = new C1644d();
        final InterfaceC2052l<ActivityResult, C9072e> interfaceC2052l = new InterfaceC2052l<ActivityResult, C9072e>() { // from class: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(ActivityResult activityResult) {
                ActivityResult activityResult2 = activityResult;
                C5207g.m11111f(activityResult2, "result");
                int i10 = activityResult2.f505a;
                if (i10 == -1) {
                    this.f11639b.m6731m0().m6710l(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), i10, activityResult2.f506b);
                } else {
                    activityC0979tM3582e.finish();
                }
                return C9072e.f47360a;
            }
        };
        this.f11667y0 = m3575X(new InterfaceC0202a() { // from class: n8.i
            @Override // androidx.activity.result.InterfaceC0202a
            /* JADX INFO: renamed from: a */
            public final void mo843a(Object obj) {
                int i10 = C2332c.f11663A0;
                InterfaceC2052l interfaceC2052l2 = interfaceC2052l;
                C5207g.m11111f(interfaceC2052l2, "$tmp0");
                interfaceC2052l2.mo528n((ActivityResult) obj);
            }
        }, c1644d);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        C5207g.m11110e(viewFindViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f11668z0 = viewFindViewById;
        m6731m0().f11605e = new a();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: J */
    public final void mo3562J() {
        LoginMethodHandler loginMethodHandlerM6707h = m6731m0().m6707h();
        if (loginMethodHandlerM6707h != null) {
            loginMethodHandlerM6707h.mo6699b();
        }
        this.f6090a0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        View view = this.f6094c0;
        View viewFindViewById = view == null ? null : view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        Object[] array;
        this.f6090a0 = true;
        if (this.f11664v0 == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            ActivityC0979t activityC0979tM3582e = m3582e();
            if (activityC0979tM3582e == null) {
                return;
            }
            activityC0979tM3582e.finish();
            return;
        }
        LoginClient loginClientM6731m0 = m6731m0();
        LoginClient.Request request = this.f11665w0;
        LoginClient.Request request2 = loginClientM6731m0.f11607g;
        if (!(request2 != null && loginClientM6731m0.f11602b >= 0) && request != null) {
            if (request2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = AccessToken.f11370l;
            if (!AccessToken.C2262b.m6596c() || loginClientM6731m0.m6703b()) {
                loginClientM6731m0.f11607g = request;
                ArrayList arrayList = new ArrayList();
                LoginTargetApp loginTargetApp = LoginTargetApp.INSTAGRAM;
                LoginTargetApp loginTargetApp2 = request.f11630l;
                boolean z10 = loginTargetApp2 == loginTargetApp;
                LoginBehavior loginBehavior = request.f11619a;
                if (z10) {
                    if (!C8004n.f43566q && loginBehavior.allowsInstagramAppAuth()) {
                        arrayList.add(new InstagramAppLoginMethodHandler(loginClientM6731m0));
                    }
                    if (loginBehavior.allowsCustomTabAuth()) {
                        arrayList.add(new CustomTabLoginMethodHandler(loginClientM6731m0));
                    }
                    if (loginBehavior.allowsWebViewAuth()) {
                        arrayList.add(new WebViewLoginMethodHandler(loginClientM6731m0));
                    }
                    if (!(loginTargetApp2 == loginTargetApp) && loginBehavior.allowsDeviceAuth()) {
                        arrayList.add(new DeviceAuthMethodHandler(loginClientM6731m0));
                    }
                    array = arrayList.toArray(new LoginMethodHandler[0]);
                    if (array != null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    loginClientM6731m0.f11601a = (LoginMethodHandler[]) array;
                    loginClientM6731m0.m6711n();
                }
                if (loginBehavior.allowsGetTokenAuth()) {
                    arrayList.add(new GetTokenLoginMethodHandler(loginClientM6731m0));
                }
                if (!C8004n.f43566q && loginBehavior.allowsKatanaAuth()) {
                    arrayList.add(new KatanaProxyLoginMethodHandler(loginClientM6731m0));
                }
                if (loginBehavior.allowsCustomTabAuth()) {
                    arrayList.add(new CustomTabLoginMethodHandler(loginClientM6731m0));
                }
                if (loginBehavior.allowsWebViewAuth()) {
                    arrayList.add(new WebViewLoginMethodHandler(loginClientM6731m0));
                }
                if (!(loginTargetApp2 == loginTargetApp)) {
                    arrayList.add(new DeviceAuthMethodHandler(loginClientM6731m0));
                }
                array = arrayList.toArray(new LoginMethodHandler[0]);
                if (array != null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                loginClientM6731m0.f11601a = (LoginMethodHandler[]) array;
                loginClientM6731m0.m6711n();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        bundle.putParcelable("loginClient", m6731m0());
    }

    /* JADX INFO: renamed from: m0 */
    public final LoginClient m6731m0() {
        LoginClient loginClient = this.f11666x0;
        if (loginClient != null) {
            return loginClient;
        }
        C5207g.m11117l("loginClient");
        throw null;
    }
}
