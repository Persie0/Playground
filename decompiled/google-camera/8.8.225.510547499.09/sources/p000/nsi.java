package p000;

import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsi extends YuvReadView {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f44400c;

    /* JADX INFO: renamed from: d */
    private final Object f44401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsi(YuvReadView yuvReadView, YuvWriteView yuvWriteView) {
        super(yuvReadView);
        this.f44400c = yuvWriteView;
        this.f44401d = yuvWriteView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsi(YuvReadView yuvReadView, YuvImage yuvImage) {
        super(yuvReadView);
        this.f44400c = yuvImage;
        this.f44401d = yuvImage;
    }
}
