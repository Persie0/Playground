package p000;

import android.media.ImageWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klx implements kba {

    /* JADX INFO: renamed from: a */
    public final Object f36505a = new Object();

    /* JADX INFO: renamed from: b */
    public final ImageWriter f36506b;

    /* JADX INFO: renamed from: c */
    private final int f36507c;

    public klx(ImageWriter imageWriter) {
        this.f36506b = imageWriter;
        this.f36507c = imageWriter.getFormat();
        imageWriter.getMaxImages();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f36505a) {
            this.f36506b.close();
        }
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("format", lme.m15725k(this.f36507c));
        return mrlVarM16765d.toString();
    }
}
