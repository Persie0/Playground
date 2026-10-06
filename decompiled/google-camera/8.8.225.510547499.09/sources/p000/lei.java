package p000;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lei implements kzf {

    /* JADX INFO: renamed from: a */
    public final HardwareBuffer f38029a;

    /* JADX INFO: renamed from: b */
    public final ldx f38030b;

    /* JADX INFO: renamed from: c */
    private final EGLImage f38031c;

    public lei(ldx ldxVar, EGLImage eGLImage, HardwareBuffer hardwareBuffer, byte[] bArr, byte[] bArr2) {
        this.f38030b = ldxVar;
        this.f38031c = eGLImage;
        this.f38029a = hardwareBuffer;
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38030b.close();
        this.f38031c.close();
        this.f38029a.close();
    }
}
