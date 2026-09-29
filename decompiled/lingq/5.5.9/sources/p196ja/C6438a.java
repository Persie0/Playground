package p196ja;

import com.google.android.exoplayer2.source.hls.playlist.C2490c;
import com.google.android.exoplayer2.source.hls.playlist.C2491d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.C2529c;

/* JADX INFO: renamed from: ja.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6438a implements InterfaceC6441d {
    @Override // p196ja.InterfaceC6441d
    /* JADX INFO: renamed from: a */
    public final C2529c.a<AbstractC6440c> mo13066a(C2491d c2491d, C2490c c2490c) {
        return new HlsPlaylistParser(c2491d, c2490c);
    }

    @Override // p196ja.InterfaceC6441d
    /* JADX INFO: renamed from: b */
    public final C2529c.a<AbstractC6440c> mo13067b() {
        return new HlsPlaylistParser(C2491d.f13269n, null);
    }
}
