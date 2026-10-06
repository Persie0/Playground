package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhw implements kyt {

    /* JADX INFO: renamed from: a */
    public final int f22078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fhx f22079b;

    /* JADX INFO: renamed from: c */
    private final kyt f22080c;

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f22081d = new AtomicInteger(0);

    public fhw(fhx fhxVar, kyt kytVar, int i) {
        this.f22079b = fhxVar;
        this.f22080c = kytVar;
        this.f22078a = i;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        kxk.m14975U(npsVar, new djq(this, 4), not.INSTANCE);
        this.f22080c.mo8408a(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f22080c.mo8409b(byteBuffer, bufferInfo);
        if (this.f22081d.incrementAndGet() % 10 == 1) {
            dhv dhvVar = this.f22079b.f22084c;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6178f();
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f22081d.get();
        this.f22080c.close();
    }
}
