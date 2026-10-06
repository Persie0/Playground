package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsq implements YuvClientAllocator {

    /* JADX INFO: renamed from: a */
    private YuvImage f44426a;

    /* JADX INFO: renamed from: b */
    private YuvWriteView f44427b;

    /* JADX INFO: renamed from: c */
    private boolean f44428c = false;

    public nsq() {
        lku.m15669w(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    /* JADX INFO: renamed from: a */
    public final YuvImage m17647a() {
        lku.m15614I(this.f44428c, "doneWriting() must be called before getImage.");
        return this.f44426a;
    }

    @Override // com.google.googlex.gcam.clientallocator.YuvClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        lku.m15614I(this.f44426a == null, "allocate() should be called at most once.");
        YuvImage yuvImage = new YuvImage(i, i2, nsh.m17644a(i3));
        this.f44426a = yuvImage;
        this.f44427b = ntw.m17720f(yuvImage);
        return new LongPair(0L, YuvWriteView.m5150c(this.f44427b));
    }

    @Override // com.google.googlex.gcam.clientallocator.YuvClientAllocator
    public final void doneWriting(long j) {
        lku.m15669w(j == 0);
        lku.m15614I(this.f44426a != null, xPAWq.QByhK);
        lku.m15614I(!this.f44428c, qQLA.adNbhYcp);
        this.f44428c = true;
    }
}
