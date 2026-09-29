package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8384y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class PlaylistsFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8384y> {

    /* JADX INFO: renamed from: j */
    public static final PlaylistsFragment$binding$2 f25863j = new PlaylistsFragment$binding$2();

    public PlaylistsFragment$binding$2() {
        super(1, C8384y.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentHomePlaylistsBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8384y mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.rvPlaylists;
        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvPlaylists);
        if (recyclerView != null) {
            i10 = R.id.tvNoFolders;
            if (((TextView) C0062b.m298P0(view2, R.id.tvNoFolders)) != null) {
                i10 = R.id.tvTitle;
                if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                    i10 = R.id.viewProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                    if (circularProgressIndicator != null) {
                        return new C8384y(recyclerView, circularProgressIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
