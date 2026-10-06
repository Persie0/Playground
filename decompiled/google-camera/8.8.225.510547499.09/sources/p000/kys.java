package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kys implements kyt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f37740a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lfk f37741b;

    public kys(nqf nqfVar, lfk lfkVar) {
        this.f37740a = nqfVar;
        this.f37741b = lfkVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f37740a.mo16665f(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f37741b.mo8409b(byteBuffer, bufferInfo);
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f37741b.close();
    }
}
