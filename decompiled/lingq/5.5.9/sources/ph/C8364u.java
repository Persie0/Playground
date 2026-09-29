package ph;

import ae.C0062b;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.u */
/* JADX INFO: loaded from: classes.dex */
public final class C8364u implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f45300a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f45301b;

    /* JADX INFO: renamed from: c */
    public final SwipeRefreshLayout f45302c;

    /* JADX INFO: renamed from: d */
    public final MaterialToolbar f45303d;

    public C8364u(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar) {
        this.f45300a = coordinatorLayout;
        this.f45301b = recyclerView;
        this.f45302c = swipeRefreshLayout;
        this.f45303d = materialToolbar;
    }

    /* JADX INFO: renamed from: a */
    public static C8364u m16415a(View view) {
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view, R.id.appbar)) != null) {
            i10 = R.id.rvCollections;
            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view, R.id.rvCollections);
            if (recyclerView != null) {
                i10 = R.id.swipe_container;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view, R.id.swipe_container);
                if (swipeRefreshLayout != null) {
                    i10 = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        return new C8364u((CoordinatorLayout) view, recyclerView, swipeRefreshLayout, materialToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
