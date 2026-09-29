package ph;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8379x implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final View f45448a;

    /* JADX INFO: renamed from: b */
    public final AppBarLayout f45449b;

    /* JADX INFO: renamed from: c */
    public final ImageButton f45450c;

    /* JADX INFO: renamed from: d */
    public final ImageButton f45451d;

    /* JADX INFO: renamed from: e */
    public final FragmentContainerView f45452e;

    /* JADX INFO: renamed from: f */
    public final MaterialCardView f45453f;

    /* JADX INFO: renamed from: g */
    public final RecyclerView f45454g;

    /* JADX INFO: renamed from: h */
    public final SwipeRefreshLayout f45455h;

    /* JADX INFO: renamed from: i */
    public final TextView f45456i;

    /* JADX INFO: renamed from: j */
    public final TextView f45457j;

    /* JADX INFO: renamed from: k */
    public final TextView f45458k;

    /* JADX INFO: renamed from: l */
    public final PlaylistPlayerView f45459l;

    public C8379x(View view, AppBarLayout appBarLayout, ImageButton imageButton, ImageButton imageButton2, FragmentContainerView fragmentContainerView, MaterialCardView materialCardView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, PlaylistPlayerView playlistPlayerView) {
        this.f45448a = view;
        this.f45449b = appBarLayout;
        this.f45450c = imageButton;
        this.f45451d = imageButton2;
        this.f45452e = fragmentContainerView;
        this.f45453f = materialCardView;
        this.f45454g = recyclerView;
        this.f45455h = swipeRefreshLayout;
        this.f45456i = textView;
        this.f45457j = textView2;
        this.f45458k = textView3;
        this.f45459l = playlistPlayerView;
    }
}
