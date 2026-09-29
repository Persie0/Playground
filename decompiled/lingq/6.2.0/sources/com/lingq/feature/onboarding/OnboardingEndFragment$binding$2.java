package com.lingq.feature.onboarding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.lfa;
import p000.ve3;
import p000.vi3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OnboardingEndFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final OnboardingEndFragment$binding$2 f26913i = new OnboardingEndFragment$binding$2(1, ve3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/onboarding/databinding/FragmentOnboardingFinishBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R$id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) lfa.m16159c(view, i);
        if (appBarLayout != null) {
            i = R$id.toolbar;
            if (((MaterialToolbar) lfa.m16159c(view, i)) != null) {
                i = R$id.tv_title;
                if (((TextView) lfa.m16159c(view, i)) != null) {
                    i = R$id.viewContent;
                    if (((FrameLayout) lfa.m16159c(view, i)) != null) {
                        i = R$id.viewProgress;
                        if (((CircularProgressIndicator) lfa.m16159c(view, i)) != null) {
                            return new ve3(appBarLayout);
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
