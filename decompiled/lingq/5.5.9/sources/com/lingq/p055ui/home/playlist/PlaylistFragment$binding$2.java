package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.views.CollapsibleToolbar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8379x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class PlaylistFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8379x> {

    /* JADX INFO: renamed from: j */
    public static final PlaylistFragment$binding$2 f25468j = new PlaylistFragment$binding$2();

    public PlaylistFragment$binding$2() {
        super(1, C8379x.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomePlaylistBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8379x mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.btnEdit;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnEdit);
            if (imageButton != null) {
                i10 = R.id.btnMenu;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btnMenu);
                if (imageButton2 != null) {
                    i10 = R.id.collapse_toolbar;
                    if (((CollapsibleToolbar) C0062b.m298P0(view2, R.id.collapse_toolbar)) != null) {
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_playlists);
                        i10 = R.id.ivPlaylist;
                        if (((ImageView) C0062b.m298P0(view2, R.id.ivPlaylist)) != null) {
                            i10 = R.id.playerCard;
                            MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.playerCard);
                            if (materialCardView != null) {
                                i10 = R.id.rvPlaylist;
                                RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvPlaylist);
                                if (recyclerView != null) {
                                    i10 = R.id.swipe_container;
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C0062b.m298P0(view2, R.id.swipe_container);
                                    if (swipeRefreshLayout != null) {
                                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvChangePlaylist);
                                        i10 = R.id.tvDone;
                                        TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvDone);
                                        if (textView2 != null) {
                                            i10 = R.id.tvTitle;
                                            TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvTitle);
                                            if (textView3 != null) {
                                                i10 = R.id.viewParent;
                                                if (((FrameLayout) C0062b.m298P0(view2, R.id.viewParent)) != null) {
                                                    i10 = R.id.view_player;
                                                    PlaylistPlayerView playlistPlayerView = (PlaylistPlayerView) C0062b.m298P0(view2, R.id.view_player);
                                                    if (playlistPlayerView != null) {
                                                        i10 = R.id.viewPlaylist;
                                                        if (((FrameLayout) C0062b.m298P0(view2, R.id.viewPlaylist)) != null) {
                                                            i10 = R.id.viewProgress;
                                                            if (((CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress)) != null) {
                                                                return new C8379x(view2, appBarLayout, imageButton, imageButton2, fragmentContainerView, materialCardView, recyclerView, swipeRefreshLayout, textView, textView2, textView3, playlistPlayerView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
