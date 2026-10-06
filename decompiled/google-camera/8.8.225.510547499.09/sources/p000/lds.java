package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lds extends ldr {
    public lds(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m15210b(String str) {
        return GLES20.glGetUniformLocation(this.f37998b, str);
    }

    @Override // p000.ldr
    /* JADX INFO: renamed from: c */
    protected final void mo15202c() {
        GLES20.glDeleteProgram(this.f37998b);
    }
}
