package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kno implements kpw {

    /* JADX INFO: renamed from: b */
    private static final mwx f36628b = mwx.m17122q(1, 1, 2, 1, 35, 35, 37, 37);

    /* JADX INFO: renamed from: a */
    public final long f36629a;

    /* JADX INFO: renamed from: c */
    private final HardwareBuffer f36630c;

    /* JADX INFO: renamed from: d */
    private final HardwarePixels f36631d;

    /* JADX INFO: renamed from: e */
    private volatile Rect f36632e;

    public kno(HardwareBuffer hardwareBuffer, long j) {
        HardwarePixels hardwarePixels;
        hardwareBuffer.getClass();
        this.f36630c = hardwareBuffer;
        if (HardwareBuffers.lockingIsSupported()) {
            lku.m15614I(HardwareBuffers.lockingIsSupported(), "Locking is not supported on this build!");
            hardwarePixels = new HardwarePixels(hardwareBuffer);
        } else {
            hardwarePixels = null;
        }
        this.f36631d = hardwarePixels;
        this.f36629a = j;
        this.f36632e = new Rect(0, 0, hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: a */
    public final int mo7245a() {
        return ((Integer) f36628b.getOrDefault(Integer.valueOf(this.f36630c.getFormat()), 34)).intValue();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: b */
    public final int mo7246b() {
        return this.f36630c.getHeight();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: c */
    public final int mo7247c() {
        return this.f36630c.getWidth();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        HardwarePixels hardwarePixels = this.f36631d;
        if (hardwarePixels != null) {
            hardwarePixels.close();
        }
        synchronized (this.f36630c) {
            this.f36630c.close();
        }
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: d */
    public final long mo7248d() {
        return this.f36629a;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: e */
    public final Rect mo7249e() {
        return new Rect(this.f36632e);
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: f */
    public final HardwareBuffer mo7250f() {
        synchronized (this.f36630c) {
            if (this.f36630c.isClosed()) {
                return null;
            }
            return HardwareBuffers.fork(this.f36630c);
        }
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: g */
    public final List mo7251g() {
        HardwarePixels hardwarePixels = this.f36631d;
        if (hardwarePixels == null) {
            int i = mws.f41739d;
            return mzr.f41857a;
        }
        int iNativePlaneCount = HardwarePixels.nativePlaneCount(hardwarePixels.f7926b);
        if (iNativePlaneCount < 0) {
            throw new UnsupportedOperationException("This Android version does not support image plane access!");
        }
        ArrayList arrayList = new ArrayList(iNativePlaneCount);
        for (int i2 = 0; i2 < iNativePlaneCount; i2++) {
            arrayList.add(new knp(hardwarePixels, i2, hardwarePixels.f7925a.getHeight()));
        }
        return arrayList;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: h */
    public final void mo7252h(Rect rect) {
        this.f36632e = new Rect(rect);
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
}
