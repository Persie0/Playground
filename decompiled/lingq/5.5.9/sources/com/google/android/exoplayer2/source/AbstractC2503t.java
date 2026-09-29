package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import p454wa.InterfaceC9894s;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2503t extends AbstractC2475c<Void> {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2492i f13469d;

    public AbstractC2503t(InterfaceC2492i interfaceC2492i) {
        this.f13469d = interfaceC2492i;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c
    /* JADX INFO: renamed from: a */
    public final InterfaceC2492i.b mo7246a(Void r10, InterfaceC2492i.b bVar) {
        return mo7279f(bVar);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c
    /* JADX INFO: renamed from: b */
    public final long mo7263b(long j10, Object obj) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c
    /* JADX INFO: renamed from: c */
    public final int mo7264c(int i10, Object obj) {
        return i10;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c
    /* JADX INFO: renamed from: d */
    public final void mo7247d(Void r10, InterfaceC2492i interfaceC2492i, AbstractC2382c0 abstractC2382c0) {
        mo7244g(abstractC2382c0);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC2492i.b mo7279f(InterfaceC2492i.b bVar) {
        return bVar;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo7244g(AbstractC2382c0 abstractC2382c0);

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final AbstractC2382c0 getInitialTimeline() {
        return this.f13469d.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final C2466p getMediaItem() {
        return this.f13469d.getMediaItem();
    }

    /* JADX INFO: renamed from: h */
    public void mo7280h() {
        m7265e(null, this.f13469d);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final boolean isSingleWindow() {
        return this.f13469d.isSingleWindow();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.AbstractC2471a
    public final void prepareSourceInternal(InterfaceC9894s interfaceC9894s) {
        super.prepareSourceInternal(interfaceC9894s);
        mo7280h();
    }
}
