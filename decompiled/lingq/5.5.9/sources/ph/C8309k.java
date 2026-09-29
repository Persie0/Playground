package ph;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8309k implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f44940a;

    /* JADX INFO: renamed from: b */
    public final MaterialCardView f44941b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f44942c;

    /* JADX INFO: renamed from: d */
    public final SwipeRefreshLayout f44943d;

    /* JADX INFO: renamed from: e */
    public final MaterialToolbar f44944e;

    /* JADX INFO: renamed from: f */
    public final TextView f44945f;

    /* JADX INFO: renamed from: g */
    public final PlaylistPlayerView f44946g;

    public C8309k(ConstraintLayout constraintLayout, MaterialCardView materialCardView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar, TextView textView, PlaylistPlayerView playlistPlayerView) {
        this.f44940a = constraintLayout;
        this.f44941b = materialCardView;
        this.f44942c = recyclerView;
        this.f44943d = swipeRefreshLayout;
        this.f44944e = materialToolbar;
        this.f44945f = textView;
        this.f44946g = playlistPlayerView;
    }
}
