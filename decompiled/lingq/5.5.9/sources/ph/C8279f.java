package ph;

import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8279f implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final Button f44748a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f44749b;

    /* JADX INFO: renamed from: c */
    public final SwipeRefreshLayout f44750c;

    /* JADX INFO: renamed from: d */
    public final MaterialToolbar f44751d;

    public C8279f(Button button, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar) {
        this.f44748a = button;
        this.f44749b = recyclerView;
        this.f44750c = swipeRefreshLayout;
        this.f44751d = materialToolbar;
    }
}
