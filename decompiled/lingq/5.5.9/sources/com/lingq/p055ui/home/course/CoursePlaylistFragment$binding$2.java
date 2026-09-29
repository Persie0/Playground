package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8309k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class CoursePlaylistFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8309k> {

    /* JADX INFO: renamed from: j */
    public static final CoursePlaylistFragment$binding$2 f23770j = new CoursePlaylistFragment$binding$2();

    public CoursePlaylistFragment$binding$2() {
        super(1, C8309k.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentCoursePlaylistBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8309k mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        if (((AppBarLayout) C0062b.m298P0(view2, R.id.appbar)) != null) {
            i10 = R.id.playerCard;
            MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.playerCard);
            if (materialCardView != null) {
                i10 = R.id.rvCourseLessons;
                RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvCourseLessons);
                if (recyclerView != null) {
                    i10 = R.id.swipe_container;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                    if (swipeRefreshLayout != null) {
                        i10 = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) C0062b.m298P0(view2, R.id.toolbar);
                        if (materialToolbar != null) {
                            i10 = R.id.tvNoTracks;
                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvNoTracks);
                            if (textView != null) {
                                i10 = R.id.view_player;
                                PlaylistPlayerView playlistPlayerView = (PlaylistPlayerView) C0062b.m298P0(view2, R.id.view_player);
                                if (playlistPlayerView != null) {
                                    return new C8309k((ConstraintLayout) view2, materialCardView, recyclerView, swipeRefreshLayout, materialToolbar, textView, playlistPlayerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
