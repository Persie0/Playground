package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kyb implements kyt {

    /* JADX INFO: renamed from: a */
    public final int f37707a;

    /* JADX INFO: renamed from: b */
    public mrm f37708b = mqu.f41450a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kyc f37709c;

    public kyb(kyc kycVar, int i) {
        this.f37709c = kycVar;
        this.f37707a = i;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        npsVar.mo2282d(new kds(this, npsVar, 17), this.f37709c.f37714e);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f37709c.f37714e.execute(new kha(this, byteBuffer, bufferInfo, 6));
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f37709c.f37714e.execute(new kxw(this, 6));
    }
}
