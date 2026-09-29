package com.google.android.exoplayer2;

import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.metadata.Metadata;
import dm.C5212l;
import java.util.Arrays;
import java.util.List;
import p219ka.C6640a;
import p219ka.C6642c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10141j;
import p505ya.C10332n;
import ua.C9508q;

/* JADX INFO: renamed from: com.google.android.exoplayer2.v */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2532v {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.v$a */
    public static final class a implements InterfaceC2409f {

        /* JADX INFO: renamed from: a */
        public final C10141j f13754a;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.v$a$a, reason: collision with other inner class name */
        public static final class C10602a {

            /* JADX INFO: renamed from: a */
            public final C10141j.a f13755a = new C10141j.a();

            /* JADX INFO: renamed from: a */
            public final void m7482a(int i10, boolean z10) {
                C10141j.a aVar = this.f13755a;
                if (z10) {
                    aVar.m19073a(i10);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            C10129a.m18992d(!false);
            new C10141j(sparseBooleanArray);
            C10134c0.m19021F(0);
        }

        public a(C10141j c10141j) {
            this.f13754a = c10141j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f13754a.equals(((a) obj).f13754a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13754a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.v$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C10141j f13756a;

        public b(C10141j c10141j) {
            this.f13756a = c10141j;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7483a(int... iArr) {
            C10141j c10141j = this.f13756a;
            c10141j.getClass();
            for (int i10 : iArr) {
                if (c10141j.f51380a.get(i10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f13756a.equals(((b) obj).f13756a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13756a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.v$c */
    public interface c {
        /* JADX INFO: renamed from: A */
        default void mo7406A(C2384d0 c2384d0) {
        }

        /* JADX INFO: renamed from: B */
        default void mo7484B(boolean z10) {
        }

        @Deprecated
        /* JADX INFO: renamed from: C */
        default void mo7485C() {
        }

        /* JADX INFO: renamed from: D */
        default void mo7486D(a aVar) {
        }

        /* JADX INFO: renamed from: E */
        default void mo7407E(int i10, boolean z10) {
        }

        /* JADX INFO: renamed from: F */
        default void mo7487F(float f3) {
        }

        /* JADX INFO: renamed from: H */
        default void mo7488H(int i10) {
        }

        /* JADX INFO: renamed from: I */
        default void mo7489I(int i10, C2466p c2466p) {
        }

        /* JADX INFO: renamed from: J */
        default void mo7408J(int i10) {
        }

        /* JADX INFO: renamed from: M */
        default void mo7490M(C2412i c2412i) {
        }

        /* JADX INFO: renamed from: O */
        default void mo7409O(int i10, d dVar, d dVar2) {
        }

        /* JADX INFO: renamed from: Q */
        default void mo7491Q(C2467q c2467q) {
        }

        /* JADX INFO: renamed from: R */
        default void mo7492R(boolean z10) {
        }

        /* JADX INFO: renamed from: T */
        default void mo7455T(b bVar) {
        }

        /* JADX INFO: renamed from: W */
        default void mo7493W(int i10, boolean z10) {
        }

        /* JADX INFO: renamed from: X */
        default void mo7494X(int i10) {
        }

        /* JADX INFO: renamed from: Y */
        default void mo7495Y(C9508q c9508q) {
        }

        /* JADX INFO: renamed from: Z */
        default void mo7496Z(C2367a c2367a) {
        }

        @Deprecated
        /* JADX INFO: renamed from: b0 */
        default void mo7497b0() {
        }

        /* JADX INFO: renamed from: c0 */
        default void mo7498c0(int i10) {
        }

        /* JADX INFO: renamed from: f */
        default void mo7499f(Metadata metadata) {
        }

        /* JADX INFO: renamed from: f0 */
        default void mo7410f0() {
        }

        /* JADX INFO: renamed from: h */
        default void mo7411h(C10332n c10332n) {
        }

        @Deprecated
        /* JADX INFO: renamed from: h0 */
        default void mo7500h0(List<C6640a> list) {
        }

        @Deprecated
        /* JADX INFO: renamed from: i0 */
        default void mo7501i0(int i10, boolean z10) {
        }

        /* JADX INFO: renamed from: j */
        default void mo7412j(C6642c c6642c) {
        }

        /* JADX INFO: renamed from: j0 */
        default void mo7502j0(ExoPlaybackException exoPlaybackException) {
        }

        /* JADX INFO: renamed from: k */
        default void mo7503k(boolean z10) {
        }

        @Deprecated
        /* JADX INFO: renamed from: l0 */
        default void mo7504l0() {
        }

        /* JADX INFO: renamed from: m0 */
        default void mo7505m0(int i10, int i11) {
        }

        /* JADX INFO: renamed from: n0 */
        default void mo7506n0(C2505u c2505u) {
        }

        /* JADX INFO: renamed from: q0 */
        default void mo7507q0(C2467q c2467q) {
        }

        /* JADX INFO: renamed from: s0 */
        default void mo7508s0(boolean z10) {
        }

        /* JADX INFO: renamed from: w */
        default void mo7509w(int i10) {
        }

        /* JADX INFO: renamed from: z */
        default void mo7510z(ExoPlaybackException exoPlaybackException) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.v$d */
    public static final class d implements InterfaceC2409f {

        /* JADX INFO: renamed from: a */
        public final Object f13757a;

        /* JADX INFO: renamed from: b */
        public final int f13758b;

        /* JADX INFO: renamed from: c */
        public final C2466p f13759c;

        /* JADX INFO: renamed from: d */
        public final Object f13760d;

        /* JADX INFO: renamed from: e */
        public final int f13761e;

        /* JADX INFO: renamed from: f */
        public final long f13762f;

        /* JADX INFO: renamed from: g */
        public final long f13763g;

        /* JADX INFO: renamed from: h */
        public final int f13764h;

        /* JADX INFO: renamed from: i */
        public final int f13765i;

        static {
            C10134c0.m19021F(0);
            C10134c0.m19021F(1);
            C10134c0.m19021F(2);
            C10134c0.m19021F(3);
            C10134c0.m19021F(4);
            C10134c0.m19021F(5);
            C10134c0.m19021F(6);
        }

        public d(Object obj, int i10, C2466p c2466p, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f13757a = obj;
            this.f13758b = i10;
            this.f13759c = c2466p;
            this.f13760d = obj2;
            this.f13761e = i11;
            this.f13762f = j10;
            this.f13763g = j11;
            this.f13764h = i12;
            this.f13765i = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                return this.f13758b == dVar.f13758b && this.f13761e == dVar.f13761e && this.f13762f == dVar.f13762f && this.f13763g == dVar.f13763g && this.f13764h == dVar.f13764h && this.f13765i == dVar.f13765i && C5212l.m11140M(this.f13757a, dVar.f13757a) && C5212l.m11140M(this.f13760d, dVar.f13760d) && C5212l.m11140M(this.f13759c, dVar.f13759c);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f13757a, Integer.valueOf(this.f13758b), this.f13759c, this.f13760d, Integer.valueOf(this.f13761e), Long.valueOf(this.f13762f), Long.valueOf(this.f13763g), Integer.valueOf(this.f13764h), Integer.valueOf(this.f13765i)});
        }
    }

    void addListener(c cVar);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    Looper getApplicationLooper();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    C6642c getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    AbstractC2382c0 getCurrentTimeline();

    C2384d0 getCurrentTracks();

    C2467q getMediaMetadata();

    boolean getPlayWhenReady();

    C2505u getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    PlaybackException getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    C9508q getTrackSelectionParameters();

    C10332n getVideoSize();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCommandAvailable(int i10);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void pause();

    void play();

    void prepare();

    void removeListener(c cVar);

    void seekBack();

    void seekForward();

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToDefaultPosition();

    void seekToNext();

    void seekToPrevious();

    void setPlaybackParameters(C2505u c2505u);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setTrackSelectionParameters(C9508q c9508q);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);
}
