package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p199jd.ViewOnClickListenerC6464i;
import p274n8.ViewOnClickListenerC7718c;
import ph.C8362t2;
import ph.C8372v2;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistsAdapter extends AbstractC1170u<AbstractC3951c, AbstractC3949a> {

    /* JADX INFO: renamed from: e */
    public final boolean f25853e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3950b f25854f;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistsAdapter$PlaylistsItemType;", "", "(Ljava/lang/String;I)V", "Playlist", "AddPlaylist", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum PlaylistsItemType {
        Playlist,
        AddPlaylist
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$a */
    public static abstract class AbstractC3949a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$a$a */
        public static final class a extends AbstractC3949a {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8372v2 c8372v2) {
                RelativeLayout relativeLayoutM16417a = c8372v2.m16417a();
                C5207g.m11110e(relativeLayoutM16417a, "binding.root");
                super(relativeLayoutM16417a);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$a$b */
        public static final class b extends AbstractC3949a {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f25855u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8362t2 c8362t2) {
                RelativeLayout relativeLayoutM16413b = c8362t2.m16413b();
                C5207g.m11110e(relativeLayoutM16413b, "binding.root");
                super(relativeLayoutM16413b);
                this.f25855u = c8362t2;
            }
        }

        public AbstractC3949a(RelativeLayout relativeLayout) {
            super(relativeLayout);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$b */
    public interface InterfaceC3950b {
        /* JADX INFO: renamed from: a */
        void mo10000a(UserPlaylist userPlaylist);

        /* JADX INFO: renamed from: b */
        void mo10001b();

        /* JADX INFO: renamed from: c */
        void mo10002c(View view, UserPlaylist userPlaylist);
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$c */
    public static abstract class AbstractC3951c {

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$c$a */
        public static final class a extends AbstractC3951c {

            /* JADX INFO: renamed from: a */
            public static final a f25856a = new a();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$c$b */
        public static final class b extends AbstractC3951c {

            /* JADX INFO: renamed from: a */
            public final UserPlaylist f25857a;

            public b(UserPlaylist userPlaylist) {
                C5207g.m11111f(userPlaylist, "playlist");
                this.f25857a = userPlaylist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C5207g.m11106a(this.f25857a, ((b) obj).f25857a);
            }

            public final int hashCode() {
                return this.f25857a.hashCode();
            }

            public final String toString() {
                return "Content(playlist=" + this.f25857a + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsAdapter$d */
    public static final class C3952d extends C1162m.e<AbstractC3951c> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3951c abstractC3951c, AbstractC3951c abstractC3951c2) {
            AbstractC3951c abstractC3951c3 = abstractC3951c;
            AbstractC3951c abstractC3951c4 = abstractC3951c2;
            if (!(abstractC3951c3 instanceof AbstractC3951c.b) || !(abstractC3951c4 instanceof AbstractC3951c.b)) {
                if ((abstractC3951c3 instanceof AbstractC3951c.a) && (abstractC3951c4 instanceof AbstractC3951c.a)) {
                    return true;
                }
                return false;
            }
            UserPlaylist userPlaylist = ((AbstractC3951c.b) abstractC3951c3).f25857a;
            int i10 = userPlaylist.f22080d;
            UserPlaylist userPlaylist2 = ((AbstractC3951c.b) abstractC3951c4).f25857a;
            if (i10 == userPlaylist2.f22080d && C5207g.m11106a(userPlaylist.f22079c, userPlaylist2.f22079c) && userPlaylist.f22081e == userPlaylist2.f22081e && userPlaylist.f22082f == userPlaylist2.f22082f) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC3951c abstractC3951c, AbstractC3951c abstractC3951c2) {
            AbstractC3951c abstractC3951c3 = abstractC3951c;
            AbstractC3951c abstractC3951c4 = abstractC3951c2;
            return !((abstractC3951c3 instanceof AbstractC3951c.b) && (abstractC3951c4 instanceof AbstractC3951c.b)) ? !((abstractC3951c3 instanceof AbstractC3951c.a) && (abstractC3951c4 instanceof AbstractC3951c.a)) : ((AbstractC3951c.b) abstractC3951c3).f25857a.f22080d != ((AbstractC3951c.b) abstractC3951c4).f25857a.f22080d;
        }
    }

    public PlaylistsAdapter(boolean z10, PlaylistsFragment$onViewCreated$3$2 playlistsFragment$onViewCreated$3$2) {
        super(new C3952d());
        this.f25853e = z10;
        this.f25854f = playlistsFragment$onViewCreated$3$2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3951c abstractC3951cM4528p = m4528p(i10);
        if (abstractC3951cM4528p instanceof AbstractC3951c.b) {
            return PlaylistsItemType.Playlist.ordinal();
        }
        if (abstractC3951cM4528p instanceof AbstractC3951c.a) {
            return PlaylistsItemType.AddPlaylist.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        AbstractC3949a abstractC3949a = (AbstractC3949a) abstractC1109b0;
        boolean z10 = abstractC3949a instanceof AbstractC3949a.b;
        View view = abstractC3949a.f7054a;
        if (!z10) {
            if (abstractC3949a instanceof AbstractC3949a.a) {
                view.setOnClickListener(new ViewOnClickListenerC7718c(19, this));
            }
            return;
        }
        AbstractC3951c abstractC3951cM4528p = m4528p(i10);
        C5207g.m11109d(abstractC3951cM4528p, "null cannot be cast to non-null type com.lingq.ui.home.playlist.PlaylistsAdapter.PlaylistItem.Content");
        AbstractC3951c.b bVar = (AbstractC3951c.b) abstractC3951cM4528p;
        UserPlaylist userPlaylist = bVar.f25857a;
        C5207g.m11111f(userPlaylist, "playlist");
        C8362t2 c8362t2 = ((AbstractC3949a.b) abstractC3949a).f25855u;
        ((TextView) c8362t2.f45287d).setText(userPlaylist.f22079c);
        ImageView imageView = (ImageView) c8362t2.f45286c;
        C5207g.m11110e(imageView, "ivMenu");
        if (imageView.getVisibility() != 8) {
            if (userPlaylist.f22081e || this.f25853e) {
                imageView.setVisibility(8);
            }
        }
        view.setOnClickListener(new ViewOnClickListenerC9734i(this, 3, bVar));
        imageView.setOnClickListener(new ViewOnClickListenerC6464i(this, 13, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 aVar;
        C5207g.m11111f(recyclerView, "parent");
        int iOrdinal = PlaylistsItemType.Playlist.ordinal();
        int i11 = R.id.tvPlaylistTitle;
        if (i10 == iOrdinal) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_playlists, recyclerView, false);
            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivMenu);
            if (imageView != null) {
                TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvPlaylistTitle);
                if (textView != null) {
                    aVar = new AbstractC3949a.b(new C8362t2((RelativeLayout) viewM849h, imageView, textView, 4));
                }
            } else {
                i11 = R.id.ivMenu;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 != PlaylistsItemType.AddPlaylist.ordinal()) {
            throw new IllegalStateException();
        }
        View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_playlists_add, recyclerView, false);
        ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivGo);
        if (imageView2 != null) {
            TextView textView2 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvPlaylistTitle);
            if (textView2 != null) {
                aVar = new AbstractC3949a.a(new C8372v2((RelativeLayout) viewM849h2, imageView2, textView2, 2));
            }
        } else {
            i11 = R.id.ivGo;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i11)));
        return aVar;
    }
}
