package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crp {

    /* JADX INFO: renamed from: a */
    public static final nbh f9156a = nbh.m17259h("com/google/android/apps/camera/camcorder/audio/processor/AudioPipeStreamImpl");

    /* JADX INFO: renamed from: b */
    public final crq f9157b;

    /* JADX INFO: renamed from: c */
    public final crr f9158c;

    public crp(int i, int i2) throws IOException {
        crq crqVar = new crq(i, i2);
        this.f9157b = crqVar;
        try {
            this.f9158c = new crr(crqVar);
        } catch (IOException e) {
            throw new IOException("Failed to set up output stream pipe", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5423a() {
        synchronized (this.f9157b) {
            this.f9157b.notifyAll();
        }
    }
}
