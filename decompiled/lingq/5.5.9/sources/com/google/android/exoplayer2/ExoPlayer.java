package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.common.collect.ImmutableList;
import ga.C5736s;
import ga.InterfaceC5732o;
import java.util.List;
import p150h9.C5913g;
import p150h9.C5915h;
import p150h9.C5930o0;
import p150h9.InterfaceC5928n0;
import p150h9.InterfaceC5942y;
import p174i9.InterfaceC6206a;
import p174i9.InterfaceC6208b;
import p195j9.C6434k;
import p218k9.C6635e;
import p219ka.C6642c;
import p454wa.C9887l;
import p454wa.InterfaceC9878c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10153v;
import p479xa.C10155x;
import p479xa.InterfaceC10133c;
import p482xd.InterfaceC10171c;
import p482xd.InterfaceC10177i;
import p505ya.C10332n;
import p505ya.InterfaceC10327i;
import ua.AbstractC9510s;
import ua.C9506o;
import ua.C9508q;
import za.InterfaceC10465a;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends InterfaceC2532v {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$a */
    @Deprecated
    public interface InterfaceC2346a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$b */
    public interface InterfaceC2347b {
        /* JADX INFO: renamed from: z */
        default void mo6768z() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$c */
    public static final class C2348c {

        /* JADX INFO: renamed from: a */
        public final Context f11797a;

        /* JADX INFO: renamed from: b */
        public final C10155x f11798b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC10177i<InterfaceC5928n0> f11799c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC10177i<InterfaceC2492i.a> f11800d;

        /* JADX INFO: renamed from: e */
        public InterfaceC10177i<AbstractC9510s> f11801e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC10177i<InterfaceC5942y> f11802f;

        /* JADX INFO: renamed from: g */
        public final InterfaceC10177i<InterfaceC9878c> f11803g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC10171c<InterfaceC10133c, InterfaceC6206a> f11804h;

        /* JADX INFO: renamed from: i */
        public final Looper f11805i;

        /* JADX INFO: renamed from: j */
        public final C2367a f11806j;

        /* JADX INFO: renamed from: k */
        public final int f11807k;

        /* JADX INFO: renamed from: l */
        public final boolean f11808l;

        /* JADX INFO: renamed from: m */
        public final C5930o0 f11809m;

        /* JADX INFO: renamed from: n */
        public final long f11810n;

        /* JADX INFO: renamed from: o */
        public final long f11811o;

        /* JADX INFO: renamed from: p */
        public final C2410g f11812p;

        /* JADX INFO: renamed from: q */
        public final long f11813q;

        /* JADX INFO: renamed from: r */
        public final long f11814r;

        /* JADX INFO: renamed from: s */
        public final boolean f11815s;

        /* JADX INFO: renamed from: t */
        public boolean f11816t;

        public C2348c(final Context context) {
            final int i10 = 0;
            InterfaceC10177i<InterfaceC5928n0> interfaceC10177i = new InterfaceC10177i() { // from class: h9.f
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // p482xd.InterfaceC10177i
                public final Object get() {
                    C9887l c9887l;
                    switch (i10) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            return new C5907d(context);
                        default:
                            Context context2 = context;
                            ImmutableList<Long> immutableList = C9887l.f50453n;
                            synchronized (C9887l.class) {
                                try {
                                    if (C9887l.f50459t == null) {
                                        C9887l.f50459t = new C9887l.a(context2).m18389a();
                                    }
                                    c9887l = C9887l.f50459t;
                                } finally {
                                }
                            }
                            return c9887l;
                    }
                }
            };
            C5913g c5913g = new C5913g(i10, context);
            C5915h c5915h = new C5915h(i10, context);
            InterfaceC10177i<InterfaceC5942y> interfaceC10177i2 = new InterfaceC10177i() { // from class: h9.i
                @Override // p482xd.InterfaceC10177i
                public final Object get() {
                    return new C5905c();
                }
            };
            final int i11 = 1;
            InterfaceC10177i<InterfaceC9878c> interfaceC10177i3 = new InterfaceC10177i() { // from class: h9.f
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // p482xd.InterfaceC10177i
                public final Object get() {
                    C9887l c9887l;
                    switch (i11) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            return new C5907d(context);
                        default:
                            Context context2 = context;
                            ImmutableList<Long> immutableList = C9887l.f50453n;
                            synchronized (C9887l.class) {
                                try {
                                    if (C9887l.f50459t == null) {
                                        C9887l.f50459t = new C9887l.a(context2).m18389a();
                                    }
                                    c9887l = C9887l.f50459t;
                                } finally {
                                }
                            }
                            return c9887l;
                    }
                }
            };
            C0166e c0166e = new C0166e();
            context.getClass();
            this.f11797a = context;
            this.f11799c = interfaceC10177i;
            this.f11800d = c5913g;
            this.f11801e = c5915h;
            this.f11802f = interfaceC10177i2;
            this.f11803g = interfaceC10177i3;
            this.f11804h = c0166e;
            int i12 = C10134c0.f51354a;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            this.f11805i = looperMyLooper;
            this.f11806j = C2367a.f11937g;
            this.f11807k = 1;
            this.f11808l = true;
            this.f11809m = C5930o0.f35349c;
            this.f11810n = 5000L;
            this.f11811o = 15000L;
            this.f11812p = new C2410g(C10134c0.m19026K(20L), C10134c0.m19026K(500L), 0.999f);
            this.f11798b = InterfaceC10133c.f51353a;
            this.f11813q = 500L;
            this.f11814r = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
            this.f11815s = true;
        }

        /* JADX INFO: renamed from: a */
        public final C2413j m6769a() {
            C10129a.m18992d(!this.f11816t);
            this.f11816t = true;
            return new C2413j(this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$d */
    @Deprecated
    public interface InterfaceC2349d {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$e */
    @Deprecated
    public interface InterfaceC2350e {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$f */
    @Deprecated
    public interface InterfaceC2351f {
    }

    void addAnalyticsListener(InterfaceC6208b interfaceC6208b);

    void addAudioOffloadListener(InterfaceC2347b interfaceC2347b);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void addListener(InterfaceC2532v.c cVar);

    /* synthetic */ void addMediaItem(int i10, C2466p c2466p);

    /* synthetic */ void addMediaItem(C2466p c2466p);

    /* synthetic */ void addMediaItems(int i10, List list);

    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i10, InterfaceC2492i interfaceC2492i);

    void addMediaSource(InterfaceC2492i interfaceC2492i);

    void addMediaSources(int i10, List<InterfaceC2492i> list);

    void addMediaSources(List<InterfaceC2492i> list);

    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(InterfaceC10465a interfaceC10465a);

    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(InterfaceC10327i interfaceC10327i);

    /* synthetic */ void clearVideoSurface();

    /* synthetic */ void clearVideoSurface(Surface surface);

    /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void clearVideoTextureView(TextureView textureView);

    C2534w createMessage(C2534w.b bVar);

    /* synthetic */ void decreaseDeviceVolume();

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z10);

    InterfaceC6206a getAnalyticsCollector();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ Looper getApplicationLooper();

    /* synthetic */ C2367a getAudioAttributes();

    @Deprecated
    InterfaceC2346a getAudioComponent();

    C6635e getAudioDecoderCounters();

    C2416m getAudioFormat();

    int getAudioSessionId();

    /* synthetic */ InterfaceC2532v.a getAvailableCommands();

    /* synthetic */ int getBufferedPercentage();

    /* synthetic */ long getBufferedPosition();

    InterfaceC10133c getClock();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getContentBufferedPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getContentDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getContentPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ C6642c getCurrentCues();

    /* synthetic */ long getCurrentLiveOffset();

    /* synthetic */ Object getCurrentManifest();

    /* synthetic */ C2466p getCurrentMediaItem();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getCurrentPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ AbstractC2382c0 getCurrentTimeline();

    @Deprecated
    C5736s getCurrentTrackGroups();

    @Deprecated
    C9506o getCurrentTrackSelections();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ C2384d0 getCurrentTracks();

    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Deprecated
    InterfaceC2349d getDeviceComponent();

    /* synthetic */ C2412i getDeviceInfo();

    /* synthetic */ int getDeviceVolume();

    /* synthetic */ long getDuration();

    /* synthetic */ long getMaxSeekToPreviousPosition();

    /* synthetic */ C2466p getMediaItemAt(int i10);

    /* synthetic */ int getMediaItemCount();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ C2467q getMediaMetadata();

    /* synthetic */ int getNextMediaItemIndex();

    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ C2505u getPlaybackParameters();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getPlaybackState();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    ExoPlaybackException getPlayerError();

    /* synthetic */ C2467q getPlaylistMetadata();

    /* synthetic */ int getPreviousMediaItemIndex();

    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    InterfaceC2536y getRenderer(int i10);

    int getRendererCount();

    int getRendererType(int i10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ int getRepeatMode();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getSeekBackIncrement();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getSeekForwardIncrement();

    C5930o0 getSeekParameters();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    /* synthetic */ C10153v getSurfaceSize();

    @Deprecated
    InterfaceC2350e getTextComponent();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ long getTotalBufferedDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ C9508q getTrackSelectionParameters();

    AbstractC9510s getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    InterfaceC2351f getVideoComponent();

    C6635e getVideoDecoderCounters();

    C2416m getVideoFormat();

    int getVideoScalingMode();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ C10332n getVideoSize();

    /* synthetic */ float getVolume();

    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean hasNextMediaItem();

    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Deprecated
    /* synthetic */ boolean hasPrevious();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean hasPreviousMediaItem();

    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    /* synthetic */ void increaseDeviceVolume();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean isCommandAvailable(int i10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    /* synthetic */ boolean isDeviceMuted();

    /* synthetic */ boolean isLoading();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean isPlaying();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ boolean isPlayingAd();

    boolean isTunnelingEnabled();

    /* synthetic */ void moveMediaItem(int i10, int i11);

    /* synthetic */ void moveMediaItems(int i10, int i11, int i12);

    @Deprecated
    /* synthetic */ void next();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void pause();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void play();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(InterfaceC2492i interfaceC2492i);

    @Deprecated
    void prepare(InterfaceC2492i interfaceC2492i, boolean z10, boolean z11);

    @Deprecated
    /* synthetic */ void previous();

    /* synthetic */ void release();

    void removeAnalyticsListener(InterfaceC6208b interfaceC6208b);

    void removeAudioOffloadListener(InterfaceC2347b interfaceC2347b);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void removeListener(InterfaceC2532v.c cVar);

    /* synthetic */ void removeMediaItem(int i10);

    /* synthetic */ void removeMediaItems(int i10, int i11);

    @Deprecated
    void retry();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekBack();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekForward();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekTo(int i10, long j10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekTo(long j10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekToDefaultPosition();

    /* synthetic */ void seekToDefaultPosition(int i10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekToNext();

    /* synthetic */ void seekToNextMediaItem();

    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void seekToPrevious();

    /* synthetic */ void seekToPreviousMediaItem();

    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    void setAudioAttributes(C2367a c2367a, boolean z10);

    void setAudioSessionId(int i10);

    void setAuxEffectInfo(C6434k c6434k);

    void setCameraMotionListener(InterfaceC10465a interfaceC10465a);

    /* synthetic */ void setDeviceMuted(boolean z10);

    /* synthetic */ void setDeviceVolume(int i10);

    void setForegroundMode(boolean z10);

    void setHandleAudioBecomingNoisy(boolean z10);

    @Deprecated
    void setHandleWakeLock(boolean z10);

    /* synthetic */ void setMediaItem(C2466p c2466p);

    /* synthetic */ void setMediaItem(C2466p c2466p, long j10);

    /* synthetic */ void setMediaItem(C2466p c2466p, boolean z10);

    /* synthetic */ void setMediaItems(List list);

    /* synthetic */ void setMediaItems(List list, int i10, long j10);

    /* synthetic */ void setMediaItems(List list, boolean z10);

    void setMediaSource(InterfaceC2492i interfaceC2492i);

    void setMediaSource(InterfaceC2492i interfaceC2492i, long j10);

    void setMediaSource(InterfaceC2492i interfaceC2492i, boolean z10);

    void setMediaSources(List<InterfaceC2492i> list);

    void setMediaSources(List<InterfaceC2492i> list, int i10, long j10);

    void setMediaSources(List<InterfaceC2492i> list, boolean z10);

    void setPauseAtEndOfMediaItems(boolean z10);

    /* synthetic */ void setPlayWhenReady(boolean z10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void setPlaybackParameters(C2505u c2505u);

    /* synthetic */ void setPlaybackSpeed(float f3);

    /* synthetic */ void setPlaylistMetadata(C2467q c2467q);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void setRepeatMode(int i10);

    void setSeekParameters(C5930o0 c5930o0);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void setShuffleModeEnabled(boolean z10);

    void setShuffleOrder(InterfaceC5732o interfaceC5732o);

    void setSkipSilenceEnabled(boolean z10);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void setTrackSelectionParameters(C9508q c9508q);

    void setVideoChangeFrameRateStrategy(int i10);

    void setVideoFrameMetadataListener(InterfaceC10327i interfaceC10327i);

    void setVideoScalingMode(int i10);

    /* synthetic */ void setVideoSurface(Surface surface);

    /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    /* synthetic */ void setVideoTextureView(TextureView textureView);

    /* synthetic */ void setVolume(float f3);

    void setWakeMode(int i10);

    /* synthetic */ void stop();

    @Deprecated
    /* synthetic */ void stop(boolean z10);
}
