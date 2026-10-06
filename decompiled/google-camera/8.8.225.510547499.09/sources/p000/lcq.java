package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lcq implements kzf {

    /* JADX INFO: renamed from: a */
    private final int f37936a;

    public lcq(int i) {
        this.f37936a = i;
        GLES20.glEnableVertexAttribArray(i);
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        GLES20.glDisableVertexAttribArray(this.f37936a);
    }
}
