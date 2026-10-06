package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.Image;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kls implements kpw, kpd {

    /* JADX INFO: renamed from: a */
    public final int f36491a;

    /* JADX INFO: renamed from: b */
    public final int f36492b;

    /* JADX INFO: renamed from: c */
    public final int f36493c;

    /* JADX INFO: renamed from: d */
    private final Object f36494d = new Object();

    /* JADX INFO: renamed from: e */
    private final Image f36495e;

    /* JADX INFO: renamed from: f */
    private final long f36496f;

    /* JADX INFO: renamed from: g */
    private volatile mws f36497g;

    /* JADX INFO: renamed from: h */
    private Rect f36498h;

    public kls(Image image) {
        this.f36495e = image;
        this.f36491a = image.getFormat();
        this.f36492b = image.getWidth();
        this.f36493c = image.getHeight();
        this.f36496f = image.getTimestamp();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: a */
    public final int mo7245a() {
        return this.f36491a;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: b */
    public final int mo7246b() {
        return this.f36493c;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: c */
    public final int mo7247c() {
        return this.f36492b;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f36494d) {
            this.f36495e.close();
        }
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: d */
    public final long mo7248d() {
        return this.f36496f;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: e */
    public final Rect mo7249e() {
        Rect cropRect;
        synchronized (this.f36494d) {
            try {
                try {
                    cropRect = this.f36495e.getCropRect();
                    this.f36498h = cropRect;
                } catch (IllegalStateException e) {
                    return this.f36498h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cropRect;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kpw)) {
            return false;
        }
        kpw kpwVar = (kpw) obj;
        return kpwVar.mo7245a() == this.f36491a && kpwVar.mo7247c() == this.f36492b && kpwVar.mo7246b() == this.f36493c && kpwVar.mo7248d() == this.f36496f;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: f */
    public final HardwareBuffer mo7250f() {
        HardwareBuffer hardwareBuffer;
        try {
            synchronized (this.f36494d) {
                hardwareBuffer = this.f36495e.getHardwareBuffer();
            }
            return hardwareBuffer;
        } catch (IllegalStateException | NoSuchMethodError e) {
            return null;
        }
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: g */
    public final List mo7251g() {
        return m14505k();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: h */
    public final void mo7252h(Rect rect) {
        synchronized (this.f36494d) {
            this.f36498h = rect;
            try {
                this.f36495e.setCropRect(rect);
            } catch (IllegalStateException e) {
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36491a), Integer.valueOf(this.f36492b), Integer.valueOf(this.f36493c), Long.valueOf(this.f36496f)});
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean mo7253i() {
        return false;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        khb khbVar;
        synchronized (this.f36494d) {
            khbVar = new khb(this.f36495e);
        }
        return khbVar;
    }

    /* JADX INFO: renamed from: k */
    public final mws m14505k() {
        mws mwsVarM17081f = this.f36497g;
        if (mwsVarM17081f == null) {
            synchronized (this.f36494d) {
                mwsVarM17081f = this.f36497g;
                if (mwsVarM17081f == null) {
                    Image.Plane[] planes = this.f36495e.getPlanes();
                    if (planes == null) {
                        int i = mws.f41739d;
                        mwsVarM17081f = mzr.f41857a;
                    } else {
                        mwn mwnVar = new mwn();
                        for (Image.Plane plane : planes) {
                            mwnVar.m17082g(new klr(plane, 0));
                        }
                        mwsVarM17081f = mwnVar.m17081f();
                    }
                    this.f36497g = mwsVarM17081f;
                }
            }
        }
        return mwsVarM17081f;
    }

    public final String toString() {
        return "Image-" + lme.m15725k(this.f36491a) + gBCSQzBeB.rGuK + this.f36492b + "-" + this.f36496f;
    }
}
