package p000;

import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igp {

    /* JADX INFO: renamed from: a */
    public final long f30849a;

    /* JADX INFO: renamed from: b */
    public final Object f30850b;

    /* JADX INFO: renamed from: c */
    public final Object f30851c;

    public igp(Runnable runnable, Executor executor, long j) {
        this.f30850b = runnable;
        this.f30851c = executor;
        this.f30849a = j;
    }

    public igp(Face[] faceArr, Rect rect, long j) {
        this.f30851c = faceArr;
        this.f30850b = rect;
        this.f30849a = j;
    }
}
