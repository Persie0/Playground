package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fik implements kyt {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f22118a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kyt f22119b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fim f22120c;

    public fik(fim fimVar, nqf nqfVar, kyt kytVar) {
        this.f22120c = fimVar;
        this.f22118a = nqfVar;
        this.f22119b = kytVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f22118a.mo16665f(npsVar);
        this.f22119b.mo8408a(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f22119b.mo8409b(byteBuffer, bufferInfo);
        if (!this.f22118a.isDone()) {
            ((nbe) ((nbe) fim.f22125a.m17252c()).mo17276G((char) 2322)).mo17290o("Configured format not yet available for packet; stats might be inaccurate");
            return;
        }
        if (this.f22118a.isCancelled()) {
            return;
        }
        try {
            MediaFormat mediaFormat = (MediaFormat) kxk.m14973S(this.f22118a);
            flu.m8559b();
            if (lqi.m15853A(mediaFormat.getString("mime"))) {
                synchronized (this.f22120c.f22126b) {
                    fil filVar = this.f22120c.f22126b;
                    if (filVar.f22122b == 0) {
                        filVar.f22123c = Long.MAX_VALUE;
                    }
                    if ((bufferInfo.flags & 1) != 0) {
                        this.f22120c.f22126b.f22121a++;
                    }
                    fil filVar2 = this.f22120c.f22126b;
                    filVar2.f22122b++;
                    filVar2.f22123c = Math.min(bufferInfo.presentationTimeUs, this.f22120c.f22126b.f22123c);
                    this.f22120c.f22126b.f22124d = Math.max(bufferInfo.presentationTimeUs, this.f22120c.f22126b.f22124d);
                }
            }
        } catch (ExecutionException e) {
            throw new AssertionError("... we just checked for isDone.", e);
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f22119b.close();
    }
}
