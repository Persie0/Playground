package ph;

import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.views.CollapsibleToolbar;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.v */
/* JADX INFO: loaded from: classes.dex */
public final class C8369v implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f45336a;

    /* JADX INFO: renamed from: b */
    public final AppBarLayout f45337b;

    /* JADX INFO: renamed from: c */
    public final ImageButton f45338c;

    /* JADX INFO: renamed from: d */
    public final ImageButton f45339d;

    /* JADX INFO: renamed from: e */
    public final CollapsibleToolbar f45340e;

    /* JADX INFO: renamed from: f */
    public final ImageView f45341f;

    /* JADX INFO: renamed from: g */
    public final RecyclerView f45342g;

    /* JADX INFO: renamed from: h */
    public final SwipeRefreshLayout f45343h;

    /* JADX INFO: renamed from: i */
    public final TextView f45344i;

    /* JADX INFO: renamed from: j */
    public final TextView f45345j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f45346k;

    /* JADX INFO: renamed from: l */
    public final CircularProgressIndicator f45347l;

    public C8369v(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ImageButton imageButton, ImageButton imageButton2, CollapsibleToolbar collapsibleToolbar, ImageView imageView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.f45336a = coordinatorLayout;
        this.f45337b = appBarLayout;
        this.f45338c = imageButton;
        this.f45339d = imageButton2;
        this.f45340e = collapsibleToolbar;
        this.f45341f = imageView;
        this.f45342g = recyclerView;
        this.f45343h = swipeRefreshLayout;
        this.f45344i = textView;
        this.f45345j = textView2;
        this.f45346k = frameLayout;
        this.f45347l = circularProgressIndicator;
    }
}
