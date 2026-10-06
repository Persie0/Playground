package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayReadViewU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eev implements kpw {

    /* JADX INFO: renamed from: a */
    public final long f13753a;

    /* JADX INFO: renamed from: b */
    public final List f13754b;

    /* JADX INFO: renamed from: c */
    public final YuvReadView f13755c;

    public eev(YuvImage yuvImage, long j) {
        this(ntw.m17718d(yuvImage), j);
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: a */
    public final int mo7245a() {
        return 35;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: b */
    public final int mo7246b() {
        YuvReadView yuvReadView = this.f13755c;
        return GcamModuleJNI.YuvReadView_height(yuvReadView.f8391a, yuvReadView);
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: c */
    public final int mo7247c() {
        YuvReadView yuvReadView = this.f13755c;
        return GcamModuleJNI.YuvReadView_width(yuvReadView.f8391a, yuvReadView);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: d */
    public final long mo7248d() {
        return this.f13753a;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: e */
    public final Rect mo7249e() {
        return new Rect(0, 0, mo7247c(), mo7246b());
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: f */
    public final HardwareBuffer mo7250f() {
        return null;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: g */
    public final List mo7251g() {
        return this.f13754b;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: h */
    public final void mo7252h(Rect rect) {
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean mo7253i() {
        return false;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        return khb.m14234x();
    }

    public eev(YuvReadView yuvReadView, long j) {
        ByteBuffer byteBufferM4903b;
        ByteBuffer byteBufferM4903b2;
        boolean z = yuvReadView.m5148a() == nsh.f44394b || yuvReadView.m5148a() == nsh.f44395c;
        lku.m15670x(z, "Format of yuvReadView can only be NV12 or NV21!");
        GrayReadViewU8 grayReadViewU8 = new GrayReadViewU8(GcamModuleJNI.YuvReadView_luma(yuvReadView.f8391a, yuvReadView));
        InterleavedReadViewU8 interleavedReadViewU8 = new InterleavedReadViewU8(GcamModuleJNI.YuvReadView_chroma(yuvReadView.f8391a, yuvReadView));
        int iM4986a = grayReadViewU8.m4986a() * (GcamModuleJNI.GrayReadViewU8_width(grayReadViewU8.f8279a, grayReadViewU8) - 1);
        int iM4987b = grayReadViewU8.m4987b() * (GcamModuleJNI.GrayReadViewU8_height(grayReadViewU8.f8279a, grayReadViewU8) - 1);
        int iM5014e = interleavedReadViewU8.m5014e() * (interleavedReadViewU8.m5013d() - 1);
        int iM5015f = interleavedReadViewU8.m5015f() * (interleavedReadViewU8.m5012c() - 1);
        int iM5010a = interleavedReadViewU8.m5010a() * (interleavedReadViewU8.m5011b() - 1);
        long jGrayReadViewU8_data = GcamModuleJNI.GrayReadViewU8_data(grayReadViewU8.f8279a, grayReadViewU8);
        ByteBuffer byteBufferM4903b3 = BufferUtils.m4903b(nsd.m17642a(jGrayReadViewU8_data == 0 ? null : new nsd(jGrayReadViewU8_data)), (int) (((long) iM4986a) + 1 + ((long) iM4987b)));
        int i = (int) (((long) iM5014e) + 1 + ((long) iM5015f) + ((long) iM5010a));
        if (yuvReadView.m5148a() == nsh.f44394b) {
            byteBufferM4903b = BufferUtils.m4903b(nsd.m17642a(interleavedReadViewU8.m5016g()), i);
            byteBufferM4903b2 = BufferUtils.m4903b(nsd.m17642a(interleavedReadViewU8.m5016g()) + ((long) interleavedReadViewU8.m5010a()), i);
        } else {
            ByteBuffer byteBufferM4903b4 = BufferUtils.m4903b(nsd.m17642a(interleavedReadViewU8.m5016g()), i);
            byteBufferM4903b = BufferUtils.m4903b(nsd.m17642a(interleavedReadViewU8.m5016g()) + ((long) interleavedReadViewU8.m5010a()), i);
            byteBufferM4903b2 = byteBufferM4903b4;
        }
        this.f13753a = j;
        this.f13755c = yuvReadView;
        this.f13754b = Arrays.asList(new klr(byteBufferM4903b3, grayReadViewU8.m4987b(), grayReadViewU8.m4986a(), 1), new klr(byteBufferM4903b, interleavedReadViewU8.m5015f(), interleavedReadViewU8.m5014e(), 1), new klr(byteBufferM4903b2, interleavedReadViewU8.m5015f(), interleavedReadViewU8.m5014e(), 1));
    }

    public eev(YuvWriteView yuvWriteView, long j) {
        this(ntw.m17719e(yuvWriteView), j);
    }
}
