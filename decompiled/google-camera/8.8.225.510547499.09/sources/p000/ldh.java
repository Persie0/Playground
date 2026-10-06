package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldh extends ldr {

    /* JADX INFO: renamed from: a */
    public final int f37980a;

    public ldh(int i, int i2) {
        super(i);
        this.f37980a = i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m15201b() {
        GLES20.glBindBuffer(this.f37980a, this.f37998b);
    }

    @Override // p000.ldr
    /* JADX INFO: renamed from: c */
    protected final void mo15202c() {
        GLES20.glDeleteBuffers(1, new int[]{this.f37998b}, 0);
    }

    public final String toString() {
        return "GLRawBuffer{handle=" + this.f37998b + ", target=" + this.f37980a + "}";
    }
}
