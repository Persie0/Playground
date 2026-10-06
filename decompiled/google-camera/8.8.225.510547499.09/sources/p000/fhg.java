package p000;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhg implements lfg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fhh f21974a;

    public fhg(fhh fhhVar) {
        this.f21974a = fhhVar;
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: a */
    public final void mo8414a(let letVar) {
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: b */
    public final void mo8415b(long j) {
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: c */
    public final void mo8416c(MediaCodec.BufferInfo bufferInfo) {
        this.f21974a.f21981f.incrementAndGet();
        bufferInfo.flags = 1;
        this.f21974a.m8419a(false);
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: d */
    public final void mo8417d() {
    }

    @Override // p000.lfg
    /* JADX INFO: renamed from: e */
    public final void mo8418e(int i) {
    }
}
