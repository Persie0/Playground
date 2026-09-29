package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
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
import ph.C8370v0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class NotificationsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8370v0> {

    /* JADX INFO: renamed from: j */
    public static final NotificationsFragment$binding$2 f25293j = new NotificationsFragment$binding$2();

    public NotificationsFragment$binding$2() {
        super(1, C8370v0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentNotificationsBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8370v0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.rvNotifications;
            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvNotifications);
            if (recyclerView != null) {
                i10 = R.id.shimmerLayout;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(view2, R.id.shimmerLayout);
                if (shimmerFrameLayout != null) {
                    i10 = R.id.swipe_container;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                    if (swipeRefreshLayout != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.tvNoNotifications;
                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvNoNotifications);
                            if (textView != null) {
                                return new C8370v0(recyclerView, shimmerFrameLayout, swipeRefreshLayout, materialToolbar, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
