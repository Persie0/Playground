package ph;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8370v0 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f45348a;

    /* JADX INFO: renamed from: b */
    public final ShimmerFrameLayout f45349b;

    /* JADX INFO: renamed from: c */
    public final SwipeRefreshLayout f45350c;

    /* JADX INFO: renamed from: d */
    public final MaterialToolbar f45351d;

    /* JADX INFO: renamed from: e */
    public final TextView f45352e;

    public C8370v0(RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar, TextView textView) {
        this.f45348a = recyclerView;
        this.f45349b = shimmerFrameLayout;
        this.f45350c = swipeRefreshLayout;
        this.f45351d = materialToolbar;
        this.f45352e = textView;
    }
}
