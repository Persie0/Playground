package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.view.WindowManager;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyo {

    /* JADX INFO: renamed from: b */
    private static oyo f46846b;

    /* JADX INFO: renamed from: a */
    public final int f46847a;

    public oyo() {
        this.f46847a = 2;
    }

    public oyo(int i) {
        this.f46847a = i;
    }

    public oyo(byte[] bArr) {
        this.f46847a = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
    }

    /* JADX INFO: renamed from: i */
    public static int m19193i(Context context) {
        oyo oyoVar = f46846b;
        return oyoVar != null ? oyoVar.f46847a : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* JADX INFO: renamed from: j */
    public static void m19194j(Context context) {
        if (f46846b == null) {
            f46846b = new oyo(context);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m19195k() {
        f46846b = null;
    }

    /* JADX INFO: renamed from: o */
    public static oyo m19196o(boolean z) {
        return new oyo((true != z ? 0 : 4) | 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m19197a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f46847a, 1, false, fArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m19198b(float[] fArr) {
        GLES20.glUniform4fv(this.f46847a, 1, fArr, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m19199c(Texture texture) {
        GLES20.glActiveTexture(33984);
        texture.bind();
        GLES20.glUniform1i(this.f46847a, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m19200d() {
        GLES20.glDisableVertexAttribArray(this.f46847a);
    }

    /* JADX INFO: renamed from: e */
    public final void m19201e() {
        GLES20.glEnableVertexAttribArray(this.f46847a);
    }

    /* JADX INFO: renamed from: f */
    public final void m19202f(FloatBuffer floatBuffer, int i) {
        GLES20.glVertexAttribPointer(this.f46847a, i, 5126, false, 0, (Buffer) floatBuffer);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m19205l() {
        return this.f46847a == 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m19206m() {
        return (this.f46847a & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m19207n() {
        return (this.f46847a & 4) != 0;
    }

    private oyo(Context context) {
        this.f46847a = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        ((Activity) context).isInMultiWindowMode();
    }

    /* JADX INFO: renamed from: g */
    public final PointF m19203g(PointF pointF) {
        switch (this.f46847a) {
            case 0:
                return pointF;
            case 90:
                return new PointF(pointF.y, 1.0f - pointF.x);
            case 180:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case 270:
                return new PointF(1.0f - pointF.y, pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }

    /* JADX INFO: renamed from: h */
    public final PointF m19204h(PointF pointF) {
        switch (this.f46847a) {
            case 0:
                return pointF;
            case 90:
                return new PointF(1.0f - pointF.y, pointF.x);
            case 180:
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            case 270:
                return new PointF(pointF.y, 1.0f - pointF.x);
            default:
                throw new IllegalArgumentException("Unsupported Sensor Orientation");
        }
    }
}
