package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8279f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ChallengeDetailsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8279f> {

    /* JADX INFO: renamed from: j */
    public static final ChallengeDetailsFragment$binding$2 f22863j = new ChallengeDetailsFragment$binding$2();

    public ChallengeDetailsFragment$binding$2() {
        super(1, C8279f.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentChallengesDetailsBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8279f mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.btnJoinOrLeave;
            Button button = (Button) C0062b.m298P0(view2, R.id.btnJoinOrLeave);
            if (button != null) {
                i10 = R.id.rv_challenges;
                RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rv_challenges);
                if (recyclerView != null) {
                    i10 = R.id.swipe_container;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                    if (swipeRefreshLayout != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.viewProgress;
                            if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                                return new C8279f(button, recyclerView, swipeRefreshLayout, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
