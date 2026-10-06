package p000;

import android.graphics.SurfaceTexture;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lur implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public static final String f39251a = lur.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public final Texture f39252b;

    /* JADX INFO: renamed from: c */
    public final SurfaceTexture f39253c;

    /* JADX INFO: renamed from: d */
    public final Semaphore f39254d = new Semaphore(0);

    public lur(int i, int i2) {
        Texture texture = new Texture(i, i2, 36197);
        this.f39252b = texture;
        SurfaceTexture surfaceTexture = new SurfaceTexture(texture.getName());
        this.f39253c = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f39254d.release();
    }
}
