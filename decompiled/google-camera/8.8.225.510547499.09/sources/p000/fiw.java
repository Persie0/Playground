package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fiw implements kyt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kyt f22194a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fix f22195b;

    public fiw(fix fixVar, kyt kytVar) {
        this.f22195b = fixVar;
        this.f22194a = kytVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f22194a.mo8408a(npsVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gyh, java.lang.Object] */
    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f22194a.mo8409b(byteBuffer, bufferInfo);
        ?? r2 = this.f22195b.f22196a.f1702a;
        nbh nbhVar = fgh.f21843a;
        r2.mo9889U();
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f22194a.close();
    }
}
