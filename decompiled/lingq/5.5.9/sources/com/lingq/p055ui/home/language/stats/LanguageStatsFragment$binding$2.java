package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8268d0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LanguageStatsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8268d0> {

    /* JADX INFO: renamed from: j */
    public static final LanguageStatsFragment$binding$2 f24246j = new LanguageStatsFragment$binding$2();

    public LanguageStatsFragment$binding$2() {
        super(1, C8268d0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLanguageStatsBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8268d0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.rvStats;
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvStats);
        if (recyclerView != null) {
            i10 = R.id.swipe_container;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
            if (swipeRefreshLayout != null) {
                i10 = R.id.toolbar;
                MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                if (materialToolbar != null) {
                    return new C8268d0(recyclerView, swipeRefreshLayout, materialToolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
