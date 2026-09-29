package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.drm.C2397a;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import ga.AbstractC5724g;
import ga.C5718a;
import ga.C5733p;
import p118fe.C5509a;
import p239l9.InterfaceC7287b;
import p261m9.InterfaceC7511l;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2497n extends AbstractC2471a implements C2496m.b {

    /* JADX INFO: renamed from: a */
    public final C2466p f13373a;

    /* JADX INFO: renamed from: b */
    public final C2466p.g f13374b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9882g.a f13375c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2495l.a f13376d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2399c f13377e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2528b f13378f;

    /* JADX INFO: renamed from: g */
    public final int f13379g;

    /* JADX INFO: renamed from: h */
    public boolean f13380h;

    /* JADX INFO: renamed from: i */
    public long f13381i;

    /* JADX INFO: renamed from: j */
    public boolean f13382j;

    /* JADX INFO: renamed from: k */
    public boolean f13383k;

    /* JADX INFO: renamed from: l */
    public InterfaceC9894s f13384l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$a */
    public class a extends AbstractC5724g {
        public a(C5733p c5733p) {
            super(c5733p);
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: f */
        public final AbstractC2382c0.b mo6777f(int i10, AbstractC2382c0.b bVar, boolean z10) {
            super.mo6777f(i10, bVar, z10);
            bVar.f12068f = true;
            return bVar;
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: n */
        public final AbstractC2382c0.c mo6781n(int i10, AbstractC2382c0.c cVar, long j10) {
            super.mo6781n(i10, cVar, j10);
            cVar.f12102l = true;
            return cVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n$b */
    public static final class b implements InterfaceC2492i.a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9882g.a f13385a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2495l.a f13386b;

        /* JADX INFO: renamed from: c */
        public InterfaceC7287b f13387c;

        /* JADX INFO: renamed from: d */
        public InterfaceC2528b f13388d;

        /* JADX INFO: renamed from: e */
        public final int f13389e;

        public b(InterfaceC9882g.a aVar, InterfaceC7511l interfaceC7511l) {
            C5509a c5509a = new C5509a(6, interfaceC7511l);
            C2397a c2397a = new C2397a();
            C2527a c2527a = new C2527a();
            this.f13385a = aVar;
            this.f13386b = c5509a;
            this.f13387c = c2397a;
            this.f13388d = c2527a;
            this.f13389e = 1048576;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC2492i mo7269a(C2466p c2466p) {
            c2466p.f12772b.getClass();
            Object obj = c2466p.f12772b.f12846g;
            return new C2497n(c2466p, this.f13385a, this.f13386b, this.f13387c.mo6960a(c2466p), this.f13388d, this.f13389e);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
        /* JADX INFO: renamed from: b */
        public final InterfaceC2492i.a mo7270b(InterfaceC7287b interfaceC7287b) {
            if (interfaceC7287b == null) {
                throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13387c = interfaceC7287b;
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
        /* JADX INFO: renamed from: c */
        public final InterfaceC2492i.a mo7271c(InterfaceC2528b interfaceC2528b) {
            if (interfaceC2528b == null) {
                throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13388d = interfaceC2528b;
            return this;
        }
    }

    public C2497n(C2466p c2466p, InterfaceC9882g.a aVar, InterfaceC2495l.a aVar2, InterfaceC2399c interfaceC2399c, InterfaceC2528b interfaceC2528b, int i10) {
        C2466p.g gVar = c2466p.f12772b;
        gVar.getClass();
        this.f13374b = gVar;
        this.f13373a = c2466p;
        this.f13375c = aVar;
        this.f13376d = aVar2;
        this.f13377e = interfaceC2399c;
        this.f13378f = interfaceC2528b;
        this.f13379g = i10;
        this.f13380h = true;
        this.f13381i = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m7377a() {
        C5733p c5733p = new C5733p(this.f13381i, this.f13382j, this.f13383k, this.f13373a);
        AbstractC2382c0 aVar = c5733p;
        if (this.f13380h) {
            aVar = new a(c5733p);
        }
        refreshSourceInfo(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m7378b(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f13381i;
        }
        if (!this.f13380h && this.f13381i == j10 && this.f13382j == z10 && this.f13383k == z11) {
            return;
        }
        this.f13381i = j10;
        this.f13382j = z10;
        this.f13383k = z11;
        this.f13380h = false;
        m7377a();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final InterfaceC2480h createPeriod(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        InterfaceC9882g interfaceC9882gMo14771a = this.f13375c.mo14771a();
        InterfaceC9894s interfaceC9894s = this.f13384l;
        if (interfaceC9894s != null) {
            interfaceC9882gMo14771a.mo7274g(interfaceC9894s);
        }
        C2466p.g gVar = this.f13374b;
        Uri uri = gVar.f12840a;
        getPlayerId();
        return new C2496m(uri, interfaceC9882gMo14771a, new C5718a((InterfaceC7511l) ((C5509a) this.f13376d).f34148b), this.f13377e, createDrmEventDispatcher(bVar), this.f13378f, createEventDispatcher(bVar), this, interfaceC9877b, gVar.f12844e, this.f13379g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final C2466p getMediaItem() {
        return this.f13373a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public final void prepareSourceInternal(InterfaceC9894s interfaceC9894s) {
        this.f13384l = interfaceC9894s;
        InterfaceC2399c interfaceC2399c = this.f13377e;
        interfaceC2399c.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        interfaceC2399c.mo6948b(looperMyLooper, getPlayerId());
        m7377a();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void releasePeriod(InterfaceC2480h interfaceC2480h) {
        C2496m c2496m = (C2496m) interfaceC2480h;
        if (c2496m.f13322Q) {
            for (C2499p c2499p : c2496m.f13319N) {
                c2499p.m7391i();
                DrmSession drmSession = c2499p.f13415h;
                if (drmSession != null) {
                    drmSession.mo6938h(c2499p.f13412e);
                    c2499p.f13415h = null;
                    c2499p.f13414g = null;
                }
            }
        }
        c2496m.f13349k.m7468c(c2496m);
        c2496m.f13316K.removeCallbacksAndMessages(null);
        c2496m.f13317L = null;
        c2496m.f13345g0 = true;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public final void releaseSourceInternal() {
        this.f13377e.release();
    }
}
