package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lca implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        GLES20.glFlush();
    }

    public final String toString() {
        return "glFlush";
    }
}
