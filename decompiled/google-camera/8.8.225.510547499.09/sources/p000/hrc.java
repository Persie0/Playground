package p000;

import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrc implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f29248a;

    /* JADX INFO: renamed from: b */
    public float[] f29249b;

    /* JADX INFO: renamed from: c */
    public hrb f29250c;

    /* JADX INFO: renamed from: d */
    private final jpd f29251d;

    public hrc(jpd jpdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29251d = jpdVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        System.currentTimeMillis();
        hrb hrbVar = this.f29250c;
        ByteBuffer byteBuffer = this.f29248a;
        float[] fArr = this.f29249b;
        byteBuffer.position(0);
        GLES30.glTexImage2D(3553, 0, 6407, hrbVar.f29240c, hrbVar.f29239b, 0, 6407, 5121, byteBuffer);
        hrbVar.f29238a.put(fArr);
        hrbVar.f29238a.position(0);
        GLES30.glVertexAttribPointer(hrbVar.f29241d, 4, 5126, false, 16, (Buffer) hrbVar.f29238a);
        GLES30.glEnableVertexAttribArray(hrbVar.f29241d);
        hrbVar.f29242e.position(0);
        GLES30.glDrawElements(4, hrbVar.f29242e.capacity(), 5123, hrbVar.f29242e);
        System.currentTimeMillis();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f29250c = new hrb(this.f29251d, i, i2, null, null, null);
        gl10.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
