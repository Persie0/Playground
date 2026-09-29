package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
    }

    public static final class PlaylistStuckException extends IOException {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$a */
    public interface InterfaceC2486a {
        /* JADX INFO: renamed from: a */
        void mo7311a();

        /* JADX INFO: renamed from: b */
        boolean mo7312b(Uri uri, InterfaceC2528b.c cVar, boolean z10);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$b */
    public interface InterfaceC2487b {
        void onPrimaryPlaylistRefreshed(C2490c c2490c);
    }

    /* JADX INFO: renamed from: a */
    boolean mo7299a(Uri uri);

    /* JADX INFO: renamed from: c */
    void mo7300c(InterfaceC2486a interfaceC2486a);

    /* JADX INFO: renamed from: d */
    void mo7301d(Uri uri) throws IOException;

    /* JADX INFO: renamed from: f */
    long mo7302f();

    /* JADX INFO: renamed from: g */
    boolean mo7303g();

    /* JADX INFO: renamed from: h */
    C2491d mo7304h();

    /* JADX INFO: renamed from: i */
    boolean mo7305i(Uri uri, long j10);

    /* JADX INFO: renamed from: j */
    void mo7306j(Uri uri, InterfaceC2493j.a aVar, InterfaceC2487b interfaceC2487b);

    /* JADX INFO: renamed from: k */
    void mo7307k() throws IOException;

    /* JADX INFO: renamed from: l */
    void mo7308l(Uri uri);

    /* JADX INFO: renamed from: m */
    void mo7309m(InterfaceC2486a interfaceC2486a);

    /* JADX INFO: renamed from: n */
    C2490c mo7310n(boolean z10, Uri uri);

    void stop();
}
