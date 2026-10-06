package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldt extends ldr {
    public ldt(int i, String str) {
        super(i);
        GLES20.glShaderSource(this.f37998b, str);
    }

    @Override // p000.ldr
    /* JADX INFO: renamed from: c */
    protected final void mo15202c() {
        GLES20.glDeleteShader(this.f37998b);
    }
}
