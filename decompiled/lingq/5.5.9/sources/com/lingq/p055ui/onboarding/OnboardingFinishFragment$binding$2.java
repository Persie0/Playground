package com.lingq.p055ui.onboarding;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8257b1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class OnboardingFinishFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8257b1> {

    /* JADX INFO: renamed from: j */
    public static final OnboardingFinishFragment$binding$2 f29374j = new OnboardingFinishFragment$binding$2();

    public OnboardingFinishFragment$binding$2() {
        super(1, C8257b1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentOnboardingFinishBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8257b1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.toolbar;
            if (((MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar)) != null) {
                i10 = R.id.tv_title;
                if (((TextView) C0062b.m298P0(view2, R.id.tv_title)) != null) {
                    i10 = R.id.viewContent;
                    if (((FrameLayout) C0062b.m298P0(view2, R.id.viewContent)) != null) {
                        i10 = R.id.viewProgress;
                        if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                            return new C8257b1(appBarLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
