package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8273e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ChallengesFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8273e> {

    /* JADX INFO: renamed from: j */
    public static final ChallengesFragment$binding$2 f23055j = new ChallengesFragment$binding$2();

    public ChallengesFragment$binding$2() {
        super(1, C8273e.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentChallengesBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8273e mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(view2, R.id.pastShimmerLayout);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.pastSwipeContainer);
            i10 = R.id.rv_challenges;
            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rv_challenges);
            if (recyclerView != null) {
                RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(view2, R.id.rvPastChallenges);
                i10 = R.id.shimmerLayout;
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(view2, R.id.shimmerLayout);
                if (shimmerFrameLayout2 != null) {
                    i10 = R.id.swipe_container;
                    SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                    if (swipeRefreshLayout2 != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                        if (materialToolbar != null) {
                            return new C8273e(shimmerFrameLayout, swipeRefreshLayout, recyclerView, recyclerView2, shimmerFrameLayout2, swipeRefreshLayout2, materialToolbar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
