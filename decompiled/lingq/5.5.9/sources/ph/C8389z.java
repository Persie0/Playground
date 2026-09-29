package ph;

import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.views.PagesIndicator;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8389z implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f45488a;

    /* JADX INFO: renamed from: b */
    public final ImageButton f45489b;

    /* JADX INFO: renamed from: c */
    public final ImageButton f45490c;

    /* JADX INFO: renamed from: d */
    public final MaterialButton f45491d;

    /* JADX INFO: renamed from: e */
    public final PagesIndicator f45492e;

    /* JADX INFO: renamed from: f */
    public final RecyclerView f45493f;

    /* JADX INFO: renamed from: g */
    public final SwipeRefreshLayout f45494g;

    /* JADX INFO: renamed from: h */
    public final CircularProgressIndicator f45495h;

    public C8389z(CoordinatorLayout coordinatorLayout, ImageButton imageButton, ImageButton imageButton2, MaterialButton materialButton, PagesIndicator pagesIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, CircularProgressIndicator circularProgressIndicator) {
        this.f45488a = coordinatorLayout;
        this.f45489b = imageButton;
        this.f45490c = imageButton2;
        this.f45491d = materialButton;
        this.f45492e = pagesIndicator;
        this.f45493f = recyclerView;
        this.f45494g = swipeRefreshLayout;
        this.f45495h = circularProgressIndicator;
    }
}
