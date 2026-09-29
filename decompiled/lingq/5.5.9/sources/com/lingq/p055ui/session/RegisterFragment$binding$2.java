package com.lingq.p055ui.session;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
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
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8287g1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class RegisterFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8287g1> {

    /* JADX INFO: renamed from: j */
    public static final RegisterFragment$binding$2 f30746j = new RegisterFragment$binding$2();

    public RegisterFragment$binding$2() {
        super(1, C8287g1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentRegisterBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8287g1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.authButton;
            LoginButton loginButton = (LoginButton) C0062b.m298P0(view2, R.id.authButton);
            if (loginButton != null) {
                i10 = R.id.btn_register;
                MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btn_register);
                if (materialButton != null) {
                    i10 = R.id.content;
                    if (((RelativeLayout) C0062b.m298P0(view2, R.id.content)) != null) {
                        i10 = R.id.email_login_form;
                        if (((LinearLayout) C0062b.m298P0(view2, R.id.email_login_form)) != null) {
                            i10 = R.id.login_form;
                            if (((RelativeLayout) C0062b.m298P0(view2, R.id.login_form)) != null) {
                                i10 = R.id.progress_layout;
                                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.progress_layout);
                                if (relativeLayout != null) {
                                    i10 = R.id.scroll_view;
                                    ScrollView scrollView = (ScrollView) C0062b.m298P0(view2, R.id.scroll_view);
                                    if (scrollView != null) {
                                        i10 = R.id.sign_in_button;
                                        SignInButton signInButton = (SignInButton) C0062b.m298P0(view2, R.id.sign_in_button);
                                        if (signInButton != null) {
                                            i10 = R.id.toolbar;
                                            MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                                            if (materialToolbar != null) {
                                                i10 = R.id.tvCoupon;
                                                TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.tvCoupon);
                                                if (textInputEditText != null) {
                                                    i10 = R.id.tvEmail;
                                                    TextInputEditText textInputEditText2 = (TextInputEditText) C0062b.m298P0(view2, R.id.tvEmail);
                                                    if (textInputEditText2 != null) {
                                                        i10 = R.id.tvLogin;
                                                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvLogin);
                                                        if (textView != null) {
                                                            i10 = R.id.tvName;
                                                            TextInputEditText textInputEditText3 = (TextInputEditText) C0062b.m298P0(view2, R.id.tvName);
                                                            if (textInputEditText3 != null) {
                                                                i10 = R.id.tvPassword;
                                                                TextInputEditText textInputEditText4 = (TextInputEditText) C0062b.m298P0(view2, R.id.tvPassword);
                                                                if (textInputEditText4 != null) {
                                                                    i10 = R.id.tv_terms_privacy;
                                                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tv_terms_privacy);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tv_terms_privacy_scroll;
                                                                        TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tv_terms_privacy_scroll);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tvUsername;
                                                                            TextInputEditText textInputEditText5 = (TextInputEditText) C0062b.m298P0(view2, R.id.tvUsername);
                                                                            if (textInputEditText5 != null) {
                                                                                i10 = R.id.viewContent;
                                                                                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.viewContent);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.view_coupon;
                                                                                    TextInputLayout textInputLayout = (TextInputLayout) C0062b.m298P0(view2, R.id.view_coupon);
                                                                                    if (textInputLayout != null) {
                                                                                        i10 = R.id.viewProgress;
                                                                                        if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                                                                                            return new C8287g1(loginButton, materialButton, relativeLayout, scrollView, signInButton, materialToolbar, textInputEditText, textInputEditText2, textView, textInputEditText3, textInputEditText4, textView2, textView3, textInputEditText5, linearLayout, textInputLayout);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
