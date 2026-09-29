package com.lingq.p055ui.onboarding;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8390z0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class OnboardingFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8390z0> {

    /* JADX INFO: renamed from: j */
    public static final OnboardingFragment$binding$2 f29406j = new OnboardingFragment$binding$2();

    public OnboardingFragment$binding$2() {
        super(1, C8390z0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentOnboardingBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8390z0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnLogin;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnLogin);
        if (materialButton != null) {
            i10 = R.id.btnSignup;
            MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(view2, R.id.btnSignup);
            if (materialButton2 != null) {
                i10 = R.id.iv_start_title;
                if (((ImageView) C0062b.m298P0(view2, R.id.iv_start_title)) != null) {
                    i10 = R.id.tvDesc;
                    if (((TextView) C0062b.m298P0(view2, R.id.tvDesc)) != null) {
                        return new C8390z0(materialButton, materialButton2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
