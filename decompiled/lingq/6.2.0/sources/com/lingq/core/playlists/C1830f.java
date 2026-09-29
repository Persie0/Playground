package com.lingq.core.playlists;

import com.lingq.core.domain.model.playlist.Playlist;
import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.wta;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.playlists.f */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1830f implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wta f22288b;

    public /* synthetic */ C1830f(wta wtaVar, int i) {
        this.f22287a = i;
        this.f22288b = wtaVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f22287a;
        xfa xfaVar = xfa.f68157a;
        wta wtaVar = this.f22288b;
        switch (i) {
            case 0:
                C1832h c1832h = (C1832h) wtaVar;
                String str = (String) obj;
                str.getClass();
                wfb.m23926u(lda.m16103C(c1832h), c1832h.f22301k, null, new PlaylistsSelectorViewModel$createPlaylist$1(str, c1832h, null), 2);
                break;
            case 1:
                C1832h c1832h2 = (C1832h) wtaVar;
                Playlist playlist = (Playlist) obj;
                playlist.getClass();
                wfb.m23926u(lda.m16103C(c1832h2), c1832h2.f22301k, null, new PlaylistsSelectorViewModel$deletePlaylist$1(c1832h2, playlist, null), 2);
                break;
            case 2:
                C1832h c1832h3 = (C1832h) wtaVar;
                Playlist playlist2 = (Playlist) obj;
                playlist2.getClass();
                wfb.m23926u(lda.m16103C(c1832h3), c1832h3.f22301k, null, new PlaylistsSelectorViewModel$deletePlaylist$1(c1832h3, playlist2, null), 2);
                break;
            case 3:
                C1832h c1832h4 = (C1832h) wtaVar;
                String str2 = (String) obj;
                str2.getClass();
                wfb.m23926u(lda.m16103C(c1832h4), c1832h4.f22301k, null, new PlaylistsSelectorViewModel$createPlaylist$1(str2, c1832h4, null), 2);
                break;
            default:
                C1833i c1833i = (C1833i) wtaVar;
                Playlist playlist3 = (Playlist) obj;
                playlist3.getClass();
                wfb.m23926u(lda.m16103C(c1833i), c1833i.f22316n, null, new PlaylistsSheetViewModel$deletePlaylist$1(c1833i, playlist3, null), 2);
                break;
        }
        return xfaVar;
    }
}
