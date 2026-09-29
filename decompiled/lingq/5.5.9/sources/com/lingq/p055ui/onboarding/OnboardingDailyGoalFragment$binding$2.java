package com.lingq.p055ui.onboarding;

import ae.C0062b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8251a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class OnboardingDailyGoalFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8251a1> {

    /* JADX INFO: renamed from: j */
    public static final OnboardingDailyGoalFragment$binding$2 f29363j = new OnboardingDailyGoalFragment$binding$2();

    public OnboardingDailyGoalFragment$binding$2() {
        super(1, C8251a1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentOnboardingDailyGoalBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8251a1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.rv_content;
            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rv_content);
            if (recyclerView != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                if (materialToolbar != null) {
                    i10 = R.id.tv_title;
                    if (((TextView) C0062b.m298P0(view2, R.id.tv_title)) != null) {
                        i10 = R.id.tv_title_desc;
                        if (((TextView) C0062b.m298P0(view2, R.id.tv_title_desc)) != null) {
                            i10 = R.id.viewContent;
                            if (((LinearLayout) C0062b.m298P0(view2, R.id.viewContent)) != null) {
                                return new C8251a1(appBarLayout, recyclerView, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
