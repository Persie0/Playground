package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.drm.C2397a;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC2471a;
import com.google.android.exoplayer2.source.InterfaceC2480h;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import com.google.android.exoplayer2.source.hls.playlist.C2488a;
import com.google.android.exoplayer2.source.hls.playlist.C2490c;
import com.google.android.exoplayer2.source.hls.playlist.C2491d;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.common.collect.ImmutableList;
import ga.C5733p;
import ga.InterfaceC5720c;
import ge.C5789m;
import java.io.IOException;
import java.util.List;
import p150h9.C5941x;
import p175ia.C6239c;
import p175ia.C6240d;
import p175ia.C6244h;
import p175ia.C6247k;
import p175ia.C6249m;
import p175ia.InterfaceC6242f;
import p175ia.InterfaceC6243g;
import p196ja.C6438a;
import p196ja.C6439b;
import p196ja.InterfaceC6441d;
import p239l9.InterfaceC7287b;
import p392t5.C9203i;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC2471a implements HlsPlaylistTracker.InterfaceC2487b {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final InterfaceC5720c compositeSequenceableLoaderFactory;
    private final InterfaceC6242f dataSourceFactory;
    private final InterfaceC2399c drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final InterfaceC6243g extractorFactory;
    private C2466p.e liveConfiguration;
    private final InterfaceC2528b loadErrorHandlingPolicy;
    private final C2466p.f localConfiguration;
    private final C2466p mediaItem;
    private InterfaceC9894s mediaTransferListener;
    private final int metadataType;
    private final HlsPlaylistTracker playlistTracker;
    private final boolean useSessionKeys;

    public static final class Factory implements InterfaceC2492i.a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6242f f13123a;

        /* JADX INFO: renamed from: f */
        public InterfaceC7287b f13128f = new C2397a();

        /* JADX INFO: renamed from: c */
        public final C6438a f13125c = new C6438a();

        /* JADX INFO: renamed from: d */
        public final C5789m f13126d = C2488a.f13200J;

        /* JADX INFO: renamed from: b */
        public final C6240d f13124b = InterfaceC6243g.f36273a;

        /* JADX INFO: renamed from: g */
        public InterfaceC2528b f13129g = new C2527a();

        /* JADX INFO: renamed from: e */
        public final C9203i f13127e = new C9203i(4);

        /* JADX INFO: renamed from: i */
        public final int f13131i = 1;

        /* JADX INFO: renamed from: j */
        public final long f13132j = -9223372036854775807L;

        /* JADX INFO: renamed from: h */
        public final boolean f13130h = true;

        public Factory(InterfaceC9882g.a aVar) {
            this.f13123a = new C6239c(aVar);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC2492i.a mo7270b(InterfaceC7287b interfaceC7287b) {
            if (interfaceC7287b == null) {
                throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13128f = interfaceC7287b;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC2492i.a mo7271c(InterfaceC2528b interfaceC2528b) {
            if (interfaceC2528b == null) {
                throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13129g = interfaceC2528b;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource mo7269a(C2466p c2466p) {
            c2466p.f12772b.getClass();
            List<StreamKey> list = c2466p.f12772b.f12843d;
            boolean zIsEmpty = list.isEmpty();
            C6438a c6438a = this.f13125c;
            InterfaceC6441d c6439b = c6438a;
            if (!zIsEmpty) {
                c6439b = new C6439b(c6438a, list);
            }
            InterfaceC6242f interfaceC6242f = this.f13123a;
            C6240d c6240d = this.f13124b;
            C9203i c9203i = this.f13127e;
            InterfaceC2399c interfaceC2399cMo6960a = this.f13128f.mo6960a(c2466p);
            InterfaceC2528b interfaceC2528b = this.f13129g;
            this.f13126d.getClass();
            return new HlsMediaSource(c2466p, interfaceC6242f, c6240d, c9203i, interfaceC2399cMo6960a, interfaceC2528b, new C2488a(this.f13123a, interfaceC2528b, c6439b), this.f13132j, this.f13130h, this.f13131i, false);
        }
    }

    static {
        C5941x.m12374a("goog.exo.hls");
    }

    private HlsMediaSource(C2466p c2466p, InterfaceC6242f interfaceC6242f, InterfaceC6243g interfaceC6243g, InterfaceC5720c interfaceC5720c, InterfaceC2399c interfaceC2399c, InterfaceC2528b interfaceC2528b, HlsPlaylistTracker hlsPlaylistTracker, long j10, boolean z10, int i10, boolean z11) {
        C2466p.g gVar = c2466p.f12772b;
        gVar.getClass();
        this.localConfiguration = gVar;
        this.mediaItem = c2466p;
        this.liveConfiguration = c2466p.f12773c;
        this.dataSourceFactory = interfaceC6242f;
        this.extractorFactory = interfaceC6243g;
        this.compositeSequenceableLoaderFactory = interfaceC5720c;
        this.drmSessionManager = interfaceC2399c;
        this.loadErrorHandlingPolicy = interfaceC2528b;
        this.playlistTracker = hlsPlaylistTracker;
        this.elapsedRealTimeOffsetMs = j10;
        this.allowChunklessPreparation = z10;
        this.metadataType = i10;
        this.useSessionKeys = z11;
    }

    private C5733p createTimelineForLive(C2490c c2490c, long j10, long j11, C6244h c6244h) {
        long jMo7302f = c2490c.f13231h - this.playlistTracker.mo7302f();
        long j12 = c2490c.f13244u;
        boolean z10 = c2490c.f13238o;
        long j13 = z10 ? jMo7302f + j12 : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(c2490c);
        long j14 = this.liveConfiguration.f12830a;
        updateLiveConfiguration(c2490c, C10134c0.m19042i(j14 != -9223372036854775807L ? C10134c0.m19026K(j14) : getTargetLiveOffsetUs(c2490c, liveEdgeOffsetUs), liveEdgeOffsetUs, j12 + liveEdgeOffsetUs));
        return new C5733p(j10, j11, j13, c2490c.f13244u, jMo7302f, getLiveWindowDefaultStartPositionUs(c2490c, liveEdgeOffsetUs), true, !z10, c2490c.f13227d == 2 && c2490c.f13229f, c6244h, this.mediaItem, this.liveConfiguration);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    private C5733p createTimelineForOnDemand(C2490c c2490c, long j10, long j11, C6244h c6244h) {
        long j12;
        if (c2490c.f13228e != -9223372036854775807L) {
            ImmutableList immutableList = c2490c.f13241r;
            if (immutableList.isEmpty()) {
                j12 = 0;
            } else {
                boolean z10 = c2490c.f13230g;
                j12 = c2490c.f13228e;
                if (!z10 && j12 != c2490c.f13244u) {
                    j12 = findClosestPrecedingSegment(immutableList, j12).f13257e;
                }
            }
        } else {
            j12 = 0;
        }
        long j13 = c2490c.f13244u;
        return new C5733p(j10, j11, j13, j13, 0L, j12, true, false, true, c6244h, this.mediaItem, null);
    }

    private static C2490c.a findClosestPrecedingIndependentPart(List<C2490c.a> list, long j10) {
        C2490c.a aVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C2490c.a aVar2 = list.get(i10);
            long j11 = aVar2.f13257e;
            if (j11 > j10 || !aVar2.f13247l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private static C2490c.c findClosestPrecedingSegment(List<C2490c.c> list, long j10) {
        return list.get(C10134c0.m19037d(list, Long.valueOf(j10), true));
    }

    private long getLiveEdgeOffsetUs(C2490c c2490c) {
        if (!c2490c.f13239p) {
            return 0L;
        }
        long j10 = this.elapsedRealTimeOffsetMs;
        int i10 = C10134c0.f51354a;
        return C10134c0.m19026K(j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - (c2490c.f13231h + c2490c.f13244u);
    }

    private long getLiveWindowDefaultStartPositionUs(C2490c c2490c, long j10) {
        long jM19026K = c2490c.f13228e;
        if (jM19026K == -9223372036854775807L) {
            jM19026K = (c2490c.f13244u + j10) - C10134c0.m19026K(this.liveConfiguration.f12830a);
        }
        if (c2490c.f13230g) {
            return jM19026K;
        }
        C2490c.a aVarFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(c2490c.f13242s, jM19026K);
        if (aVarFindClosestPrecedingIndependentPart != null) {
            return aVarFindClosestPrecedingIndependentPart.f13257e;
        }
        ImmutableList immutableList = c2490c.f13241r;
        if (immutableList.isEmpty()) {
            return 0L;
        }
        C2490c.c cVarFindClosestPrecedingSegment = findClosestPrecedingSegment(immutableList, jM19026K);
        C2490c.a aVarFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(cVarFindClosestPrecedingSegment.f13251H, jM19026K);
        return aVarFindClosestPrecedingIndependentPart2 != null ? aVarFindClosestPrecedingIndependentPart2.f13257e : cVarFindClosestPrecedingSegment.f13257e;
    }

    private static long getTargetLiveOffsetUs(C2490c c2490c, long j10) {
        long j11;
        C2490c.e eVar = c2490c.f13245v;
        long j12 = c2490c.f13228e;
        if (j12 != -9223372036854775807L) {
            j11 = c2490c.f13244u - j12;
        } else {
            long j13 = eVar.f13267d;
            if (j13 == -9223372036854775807L || c2490c.f13237n == -9223372036854775807L) {
                long j14 = eVar.f13266c;
                j11 = j14 != -9223372036854775807L ? j14 : c2490c.f13236m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    private void updateLiveConfiguration(C2490c c2490c, long j10) {
        boolean z10;
        C2466p.e eVar = this.mediaItem.f12773c;
        if (eVar.f12833d == -3.4028235E38f && eVar.f12834e == -3.4028235E38f) {
            C2490c.e eVar2 = c2490c.f13245v;
            if (eVar2.f13266c == -9223372036854775807L && eVar2.f13267d == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.liveConfiguration = new C2466p.e(C10134c0.m19033R(j10), -9223372036854775807L, -9223372036854775807L, z10 ? 1.0f : this.liveConfiguration.f12833d, z10 ? 1.0f : this.liveConfiguration.f12834e);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public InterfaceC2480h createPeriod(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        InterfaceC2493j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        return new C6247k(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.drmSessionManager, createDrmEventDispatcher(bVar), this.loadErrorHandlingPolicy, aVarCreateEventDispatcher, interfaceC9877b, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId());
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public /* bridge */ /* synthetic */ AbstractC2382c0 getInitialTimeline() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public C2466p getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.mo7307k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC2487b
    public void onPrimaryPlaylistRefreshed(C2490c c2490c) {
        long jM19033R = c2490c.f13239p ? C10134c0.m19033R(c2490c.f13231h) : -9223372036854775807L;
        int i10 = c2490c.f13227d;
        long j10 = (i10 == 2 || i10 == 1) ? jM19033R : -9223372036854775807L;
        C2491d c2491dMo7304h = this.playlistTracker.mo7304h();
        c2491dMo7304h.getClass();
        C6244h c6244h = new C6244h(c2491dMo7304h);
        refreshSourceInfo(this.playlistTracker.mo7303g() ? createTimelineForLive(c2490c, j10, jM19033R, c6244h) : createTimelineForOnDemand(c2490c, j10, jM19033R, c6244h));
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public void prepareSourceInternal(InterfaceC9894s interfaceC9894s) {
        this.mediaTransferListener = interfaceC9894s;
        this.drmSessionManager.prepare();
        InterfaceC2399c interfaceC2399c = this.drmSessionManager;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        interfaceC2399c.mo6948b(looperMyLooper, getPlayerId());
        this.playlistTracker.mo7306j(this.localConfiguration.f12840a, createEventDispatcher(null), this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public void releasePeriod(InterfaceC2480h interfaceC2480h) {
        C6247k c6247k = (C6247k) interfaceC2480h;
        c6247k.f36315b.mo7300c(c6247k);
        for (C6249m c6249m : c6247k.f36310P) {
            if (c6249m.f36348Y) {
                for (C6249m.c cVar : c6249m.f36340Q) {
                    cVar.m7391i();
                    DrmSession drmSession = cVar.f13415h;
                    if (drmSession != null) {
                        drmSession.mo6938h(cVar.f13412e);
                        cVar.f13415h = null;
                        cVar.f13414g = null;
                    }
                }
            }
            c6249m.f36368j.m7468c(c6249m);
            c6249m.f36336M.removeCallbacksAndMessages(null);
            c6249m.f36355c0 = true;
            c6249m.f36337N.clear();
        }
        c6247k.f36307M = null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public void releaseSourceInternal() {
        this.playlistTracker.stop();
        this.drmSessionManager.release();
    }
}
