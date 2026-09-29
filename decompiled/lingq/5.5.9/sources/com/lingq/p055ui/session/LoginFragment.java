package com.lingq.p055ui.session;

import ae.C0062b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.p055ui.session.LoginFragment;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C7076b;
import mo.C7661i;
import ni.C7796d;
import ni.C7797e;
import no.C7828f;
import p003a2.C0009a;
import p015ak.AbstractC0104a;
import p040c4.C1676a;
import p046cb.C1759a;
import p046cb.C1760b;
import p070db.C5133m;
import p118fe.C5509a;
import p136gc.C5761q;
import p204jj.C6496q;
import p225kk.C6704a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p274n8.C7728m;
import p274n8.C7729n;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.C7776c;
import p286o2.C7906f;
import p291o7.InterfaceC8000j;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8360t0;
import sj.C9050i;
import sl.C9072e;
import sl.InterfaceC9070c;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/session/LoginFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LoginFragment extends AbstractC0104a {

    /* JADX INFO: renamed from: J0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f30685J0 = {C0204c.m857q(LoginFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLoginBinding;")};

    /* JADX INFO: renamed from: A0 */
    public C1759a f30686A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f30687B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f30688C0;

    /* JADX INFO: renamed from: D0 */
    public CallbackManagerImpl f30689D0;

    /* JADX INFO: renamed from: E0 */
    public String f30690E0;

    /* JADX INFO: renamed from: F0 */
    public String f30691F0;

    /* JADX INFO: renamed from: G0 */
    public C7797e f30692G0;

    /* JADX INFO: renamed from: H0 */
    public C7796d f30693H0;

    /* JADX INFO: renamed from: I0 */
    public C6704a f30694I0;

    /* JADX INFO: renamed from: com.lingq.ui.session.LoginFragment$a */
    public static final class C4732a implements InterfaceC8000j<C7729n> {
        public C4732a() {
        }

        @Override // p291o7.InterfaceC8000j
        /* JADX INFO: renamed from: a */
        public final void mo10337a() {
        }

        @Override // p291o7.InterfaceC8000j
        /* JADX INFO: renamed from: b */
        public final void mo10338b(FacebookException facebookException) {
            Toast.makeText(LoginFragment.this.m3578a0(), facebookException.getMessage(), 0).show();
        }

        @Override // p291o7.InterfaceC8000j
        /* JADX INFO: renamed from: c */
        public final void mo10339c(C7729n c7729n) {
            Date date = AccessToken.f11370l;
            AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
            String str = accessTokenM6595b != null ? accessTokenM6595b.f11375e : null;
            LoginFragment loginFragment = LoginFragment.this;
            loginFragment.f30690E0 = str;
            loginFragment.m10334n0(2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.session.LoginFragment$special$$inlined$viewModels$default$1] */
    public LoginFragment() {
        super(R.layout.fragment_login);
        this.f30687B0 = C4924a.m10477o0(this, LoginFragment$binding$2.f30696j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.session.LoginFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.session.LoginFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f30688C0 = C8573r0.m16711Z(this, C5209i.m11118a(AuthenticationViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.session.LoginFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.session.LoginFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.session.LoginFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: D */
    public final void mo3559D(int i10, int i11, Intent intent) throws Throwable {
        C5761q c5761qM8539c;
        GoogleSignInAccount googleSignInAccount;
        CallbackManagerImpl callbackManagerImpl;
        if (i10 != 9001 && (callbackManagerImpl = this.f30689D0) != null) {
            callbackManagerImpl.mo6662a(i10, i11, intent);
        }
        super.mo3559D(i10, i11, intent);
        if (i10 == 9001) {
            C1760b c1760bM10912b = C5133m.m10912b(intent);
            Status status = c1760bM10912b.f9660a;
            if (!status.m7534q() || (googleSignInAccount = c1760bM10912b.f9661b) == null) {
                ApiException apiExceptionM316V0 = C0062b.m316V0(status);
                C5761q c5761q = new C5761q();
                c5761q.m12122p(apiExceptionM316V0);
                c5761qM8539c = c5761q;
            } else {
                c5761qM8539c = Tasks.m8539c(googleSignInAccount);
            }
            try {
                Object objMo12108j = c5761qM8539c.mo12108j(ApiException.class);
                C5207g.m11108c(objMo12108j);
                this.f30691F0 = ((GoogleSignInAccount) objMo12108j).f13806g;
                m10334n0(3);
            } catch (ApiException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(21, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        final int i10 = 1;
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 300L;
        m3585f0(c8228i);
        final int i11 = 0;
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 300L;
        m3589h0(c8228i2);
        C7796d c7796d = this.f30693H0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "onboarding_login");
        C6704a c6704a = this.f30694I0;
        if (c6704a == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        String string = c6704a.f37891b.getString("deeplinkURL", "");
        String str = string != null ? string : "";
        C6704a c6704a2 = this.f30694I0;
        if (c6704a2 == null) {
            C5207g.m11117l("appSettings");
            throw null;
        }
        c6704a2.f37891b.edit().clear().commit();
        if (!C7661i.m15250P2(str)) {
            C6704a c6704a3 = this.f30694I0;
            if (c6704a3 == null) {
                C5207g.m11117l("appSettings");
                throw null;
            }
            c6704a3.m13308j(str);
        }
        this.f30689D0 = new CallbackManagerImpl();
        C8360t0 c8360t0M10335o0 = m10335o0();
        MaterialToolbar materialToolbar = c8360t0M10335o0.f45275e;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        materialToolbar.setNavigationIcon(C7472a.c.m14849b(contextM3578a0, R.drawable.ic_arrow_back));
        List<Integer> list = C6716m.f37937a;
        int iM13333r = C6716m.m13333r(R.attr.primaryTextColor, m3578a0());
        MaterialToolbar materialToolbar2 = c8360t0M10335o0.f45275e;
        materialToolbar2.setNavigationIconTint(iM13333r);
        materialToolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ak.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LoginFragment f272b;

            {
                this.f272b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                LoginFragment loginFragment = this.f272b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        C8573r0.m16725g0(loginFragment).m3995p();
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        loginFragment.m10334n0(1);
                        break;
                }
            }
        });
        Drawable drawableM14849b = C7472a.c.m14849b(m3578a0(), R.drawable.com_facebook_button_icon);
        if (drawableM14849b != null) {
            drawableM14849b.setBounds(0, 0, (int) (drawableM14849b.getIntrinsicWidth() * 1.45f), (int) (drawableM14849b.getIntrinsicHeight() * 1.45f));
            m10335o0().f45272b.setCompoundDrawables(drawableM14849b, null, null, null);
            m10335o0().f45272b.setCompoundDrawablePadding(m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_textpadding));
            m10335o0().f45272b.setPadding(m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_lr), m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_top), 0, m3599s().getDimensionPixelSize(R.dimen.fb_margin_override_bottom));
        }
        LoginButton loginButton = c8360t0M10335o0.f45272b;
        loginButton.setPermissions("email");
        loginButton.setFragment(this);
        CallbackManagerImpl callbackManagerImpl = this.f30689D0;
        if (callbackManagerImpl != null) {
            loginButton.m6737j(callbackManagerImpl, new C4732a());
        }
        ((SignInButton) view.findViewById(R.id.sign_in_button)).setOnClickListener(new View.OnClickListener(this) { // from class: ak.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LoginFragment f274b;

            {
                this.f274b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Exception {
                Intent intentM10911a;
                int i12 = i11;
                LoginFragment loginFragment = this.f274b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        C1759a c1759a = loginFragment.f30686A0;
                        if (c1759a != null) {
                            int iM5488c = c1759a.m5488c();
                            int i13 = iM5488c - 1;
                            if (iM5488c == 0) {
                                throw null;
                            }
                            O o10 = c1759a.f13890d;
                            Context context = c1759a.f13887a;
                            if (i13 == 2) {
                                C5133m.f33116a.m13287a("getFallbackSignInIntent()", new Object[0]);
                                intentM10911a = C5133m.m10911a(context, (GoogleSignInOptions) o10);
                                intentM10911a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                            } else if (i13 != 3) {
                                C5133m.f33116a.m13287a("getNoImplementationSignInIntent()", new Object[0]);
                                intentM10911a = C5133m.m10911a(context, (GoogleSignInOptions) o10);
                                intentM10911a.setAction("com.google.android.gms.auth.NO_IMPL");
                            } else {
                                intentM10911a = C5133m.m10911a(context, (GoogleSignInOptions) o10);
                            }
                            loginFragment.startActivityForResult(intentM10911a, 9001);
                            return;
                        }
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        C7797e c7797e = loginFragment.f30692G0;
                        if (c7797e == null) {
                            C5207g.m11117l("utils");
                            throw null;
                        }
                        if (c7797e.m15514g()) {
                            String str2 = C9050i.f47331a;
                            NavController navControllerM16725g0 = C8573r0.m16725g0(loginFragment);
                            Bundle bundle2 = new Bundle();
                            NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                            if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToOnboardingLanguage) != null) {
                                navControllerM16725g0.m3992m(R.id.actionToOnboardingLanguage, bundle2, null);
                                return;
                            }
                        } else {
                            String str3 = C9050i.f47331a;
                            C7797e c7797e2 = loginFragment.f30692G0;
                            if (c7797e2 == null) {
                                C5207g.m11117l("utils");
                                throw null;
                            }
                            C9050i.f47331a = c7797e2.m15510c("language_code");
                            NavController navControllerM16725g1 = C8573r0.m16725g0(loginFragment);
                            Bundle bundle3 = new Bundle();
                            NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                            if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToOnboardingLevel) != null) {
                                navControllerM16725g1.m3992m(R.id.actionToOnboardingLevel, bundle3, null);
                            }
                        }
                        return;
                }
            }
        });
        GoogleSignInOptions.C2540a c2540a = new GoogleSignInOptions.C2540a(GoogleSignInOptions.f13818l);
        HashSet hashSet = c2540a.f13830a;
        hashSet.add(GoogleSignInOptions.f13813I);
        hashSet.add(GoogleSignInOptions.f13812H);
        hashSet.add(GoogleSignInOptions.f13814J);
        c2540a.m7525b();
        C1759a c1759a = new C1759a(m3576Y(), c2540a.m7524a());
        this.f30686A0 = c1759a;
        c1759a.m5487b();
        C7728m.f42275j.m15321a().m15317e();
        c8360t0M10335o0.f45282l.setOnClickListener(new ViewOnClickListenerC7718c(29, this));
        Typeface typefaceM15674a = C7906f.m15674a(R.font.font_rubik, m3578a0());
        TextInputEditText textInputEditText = c8360t0M10335o0.f45277g;
        textInputEditText.setInputType(129);
        textInputEditText.setTypeface(typefaceM15674a, 1);
        textInputEditText.setOnEditorActionListener(new C6496q(1, this));
        c8360t0M10335o0.f45273c.setOnClickListener(new View.OnClickListener(this) { // from class: ak.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LoginFragment f272b;

            {
                this.f272b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                LoginFragment loginFragment = this.f272b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        C8573r0.m16725g0(loginFragment).m3995p();
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        loginFragment.m10334n0(1);
                        break;
                }
            }
        });
        TextView textView = c8360t0M10335o0.f45279i;
        textView.setTransformationMethod(null);
        textView.setMovementMethod(C7776c.f42711a);
        Context contextM3578a1 = m3578a0();
        String strM3600t = m3600t(R.string.welcome_by_using_lingq);
        C5207g.m11110e(strM3600t, "getString(R.string.welcome_by_using_lingq)");
        textView.setText(C6716m.m13332q(contextM3578a1, strM3600t), TextView.BufferType.SPANNABLE);
        TextView textView2 = c8360t0M10335o0.f45276f;
        C5207g.m11110e(textView2, "tvLongPassword");
        String strM3600t2 = m3600t(R.string.login_long_password);
        C5207g.m11110e(strM3600t2, "getString(R.string.login_long_password)");
        String strM3600t3 = m3600t(R.string.login_sign_in_with_email);
        C5207g.m11110e(strM3600t3, "getString(R.string.login_sign_in_with_email)");
        C4924a.m10453c0(textView2, strM3600t2, strM3600t3, R.attr.blueWordBorderColor, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.session.LoginFragment$onViewCreated$4$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                C4924a.m10447Z(C8573r0.m16725g0(this.f30697b), new C1676a(R.id.actionToEmailLogin));
                return C9072e.f47360a;
            }
        }, 8);
        String strM21i = C0009a.m21i(m3600t(R.string.welcome_first_visit), " ", m3600t(R.string.welcome_sign_up_button));
        TextView textView3 = c8360t0M10335o0.f45278h;
        textView3.setText(strM21i);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: ak.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LoginFragment f274b;

            {
                this.f274b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Exception {
                Intent intentM10911a;
                int i12 = i10;
                LoginFragment loginFragment = this.f274b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        C1759a c1759a2 = loginFragment.f30686A0;
                        if (c1759a2 != null) {
                            int iM5488c = c1759a2.m5488c();
                            int i13 = iM5488c - 1;
                            if (iM5488c == 0) {
                                throw null;
                            }
                            O o10 = c1759a2.f13890d;
                            Context context = c1759a2.f13887a;
                            if (i13 == 2) {
                                C5133m.f33116a.m13287a("getFallbackSignInIntent()", new Object[0]);
                                intentM10911a = C5133m.m10911a(context, (GoogleSignInOptions) o10);
                                intentM10911a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                            } else if (i13 != 3) {
                                C5133m.f33116a.m13287a("getNoImplementationSignInIntent()", new Object[0]);
                                intentM10911a = C5133m.m10911a(context, (GoogleSignInOptions) o10);
                                intentM10911a.setAction("com.google.android.gms.auth.NO_IMPL");
                            } else {
                                intentM10911a = C5133m.m10911a(context, (GoogleSignInOptions) o10);
                            }
                            loginFragment.startActivityForResult(intentM10911a, 9001);
                            return;
                        }
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = LoginFragment.f30685J0;
                        C5207g.m11111f(loginFragment, "this$0");
                        C7797e c7797e = loginFragment.f30692G0;
                        if (c7797e == null) {
                            C5207g.m11117l("utils");
                            throw null;
                        }
                        if (c7797e.m15514g()) {
                            String str2 = C9050i.f47331a;
                            NavController navControllerM16725g0 = C8573r0.m16725g0(loginFragment);
                            Bundle bundle2 = new Bundle();
                            NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                            if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToOnboardingLanguage) != null) {
                                navControllerM16725g0.m3992m(R.id.actionToOnboardingLanguage, bundle2, null);
                                return;
                            }
                        } else {
                            String str3 = C9050i.f47331a;
                            C7797e c7797e2 = loginFragment.f30692G0;
                            if (c7797e2 == null) {
                                C5207g.m11117l("utils");
                                throw null;
                            }
                            C9050i.f47331a = c7797e2.m15510c("language_code");
                            NavController navControllerM16725g1 = C8573r0.m16725g0(loginFragment);
                            Bundle bundle3 = new Bundle();
                            NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                            if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToOnboardingLevel) != null) {
                                navControllerM16725g1.m3992m(R.id.actionToOnboardingLevel, bundle3, null);
                            }
                        }
                        return;
                }
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4738x4a851177(this, Lifecycle.State.STARTED, null, this, c8360t0M10335o0), 3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n0 */
    public final void m10334n0(int i10) {
        boolean z10;
        C7797e c7797e = this.f30692G0;
        if (c7797e == null) {
            C5207g.m11117l("utils");
            throw null;
        }
        if (!c7797e.m15512e()) {
            C9249b c9249b = new C9249b(m3578a0());
            c9249b.setTitle(m3600t(R.string.welcome_error_logging_in));
            c9249b.f599a.f579f = "Not connected to the internet. Please make sure you are connected and try again.";
            c9249b.m876a();
            return;
        }
        C7796d c7796d = this.f30693H0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15507d("existing_user", "yes");
        boolean z11 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                AuthenticationViewModel authenticationViewModelM10336p0 = m10336p0();
                C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10336p0), null, null, new AuthenticationViewModel$loginGoogle$1(authenticationViewModelM10336p0, this.f30691F0, null), 3);
                return;
            }
            String str = this.f30690E0;
            if (str != null) {
                AuthenticationViewModel authenticationViewModelM10336p1 = m10336p0();
                C7828f.m15570d(C8573r0.m16767w0(authenticationViewModelM10336p1), null, null, new AuthenticationViewModel$loginFacebook$1(authenticationViewModelM10336p1, str, null), 3);
                return;
            }
            return;
        }
        C8360t0 c8360t0M10335o0 = m10335o0();
        c8360t0M10335o0.f45280j.setError(null);
        TextInputEditText textInputEditText = c8360t0M10335o0.f45277g;
        textInputEditText.setError(null);
        TextInputEditText textInputEditText2 = c8360t0M10335o0.f45280j;
        String string = C7076b.m14277B3(String.valueOf(textInputEditText2.getText())).toString();
        String string2 = C7076b.m14277B3(String.valueOf(textInputEditText.getText())).toString();
        if (TextUtils.isEmpty(string2)) {
            textInputEditText.setError(m3600t(R.string.auth_enter_password_warning));
            z10 = true;
        } else {
            textInputEditText = null;
            z10 = false;
        }
        if (C7661i.m15250P2(string)) {
            textInputEditText2.setError(m3600t(R.string.auth_enter_username_email_warning));
        } else {
            textInputEditText2 = textInputEditText;
            z11 = z10;
        }
        if (z11) {
            C5207g.m11108c(textInputEditText2);
            textInputEditText2.requestFocus();
            return;
        }
        View currentFocus = m3576Y().getCurrentFocus();
        Object systemService = m3576Y().getSystemService("input_method");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        m10336p0().m10330o2(string, string2);
    }

    /* JADX INFO: renamed from: o0 */
    public final C8360t0 m10335o0() {
        return (C8360t0) this.f30687B0.m10489a(this, f30685J0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final AuthenticationViewModel m10336p0() {
        return (AuthenticationViewModel) this.f30688C0.getValue();
    }
}
