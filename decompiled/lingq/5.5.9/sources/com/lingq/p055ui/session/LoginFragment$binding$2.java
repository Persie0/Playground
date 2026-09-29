package com.lingq.p055ui.session;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8360t0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LoginFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8360t0> {

    /* JADX INFO: renamed from: j */
    public static final LoginFragment$binding$2 f30696j = new LoginFragment$binding$2();

    public LoginFragment$binding$2() {
        super(1, C8360t0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLoginBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8360t0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.authButton;
            LoginButton loginButton = (LoginButton) C0062b.m298P0(view2, R.id.authButton);
            if (loginButton != null) {
                i10 = R.id.content;
                if (((RelativeLayout) C0062b.m298P0(view2, R.id.content)) != null) {
                    i10 = R.id.email_login_form;
                    if (((LinearLayout) C0062b.m298P0(view2, R.id.email_login_form)) != null) {
                        i10 = R.id.email_sign_in_button;
                        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.email_sign_in_button);
                        if (materialButton != null) {
                            i10 = R.id.login_form;
                            if (((RelativeLayout) C0062b.m298P0(view2, R.id.login_form)) != null) {
                                i10 = R.id.progress_layout;
                                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.progress_layout);
                                if (relativeLayout != null) {
                                    i10 = R.id.sign_in_button;
                                    if (((SignInButton) C0062b.m298P0(view2, R.id.sign_in_button)) != null) {
                                        i10 = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            i10 = R.id.tvLongPassword;
                                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvLongPassword);
                                            if (textView != null) {
                                                i10 = R.id.tvPassword;
                                                TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.tvPassword);
                                                if (textInputEditText != null) {
                                                    i10 = R.id.tvSignup;
                                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvSignup);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_terms_privacy;
                                                        TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tv_terms_privacy);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tvUsername;
                                                            TextInputEditText textInputEditText2 = (TextInputEditText) C0062b.m298P0(view2, R.id.tvUsername);
                                                            if (textInputEditText2 != null) {
                                                                i10 = R.id.viewContent;
                                                                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewContent);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.view_forgot_password;
                                                                    TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.view_forgot_password);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.viewProgress;
                                                                        if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                                                                            return new C8360t0((FrameLayout) view2, loginButton, materialButton, relativeLayout, materialToolbar, textView, textInputEditText, textView2, textView3, textInputEditText2, linearLayout, textView4);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
