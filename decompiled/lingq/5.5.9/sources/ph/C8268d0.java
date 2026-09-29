package ph;

import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8268d0 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f44661a;

    /* JADX INFO: renamed from: b */
    public final SwipeRefreshLayout f44662b;

    /* JADX INFO: renamed from: c */
    public final MaterialToolbar f44663c;

    public C8268d0(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar) {
        this.f44661a = recyclerView;
        this.f44662b = swipeRefreshLayout;
        this.f44663c = materialToolbar;
    }
}
