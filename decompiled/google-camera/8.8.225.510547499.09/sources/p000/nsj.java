package p000;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsj extends YuvWriteView {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ YuvImage f44402a;

    /* JADX INFO: renamed from: d */
    private final YuvImage f44403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsj(YuvWriteView yuvWriteView, YuvImage yuvImage) {
        super(GcamModuleJNI.new_YuvWriteView__SWIG_1(YuvWriteView.m5150c(yuvWriteView), yuvWriteView));
        this.f44402a = yuvImage;
        this.f44403d = yuvImage;
    }
}
