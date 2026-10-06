package p000;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klu implements kpz {

    /* JADX INFO: renamed from: a */
    private final Object f36500a = new Object();

    /* JADX INFO: renamed from: b */
    private final ImageReader f36501b;

    public klu(ImageReader imageReader) {
        this.f36501b = imageReader;
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: a */
    public final int mo14506a() {
        int height;
        synchronized (this.f36500a) {
            height = this.f36501b.getHeight();
        }
        return height;
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: b */
    public final int mo14507b() {
        int imageFormat;
        synchronized (this.f36500a) {
            imageFormat = this.f36501b.getImageFormat();
        }
        return imageFormat;
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: c */
    public final int mo14508c() {
        int maxImages;
        synchronized (this.f36500a) {
            maxImages = this.f36501b.getMaxImages();
        }
        return maxImages;
    }

    @Override // p000.kpz, p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f36500a) {
            this.f36501b.close();
        }
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: d */
    public final int mo14509d() {
        int width;
        synchronized (this.f36500a) {
            width = this.f36501b.getWidth();
        }
        return width;
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: e */
    public final Surface mo14510e() {
        Surface surface;
        synchronized (this.f36500a) {
            surface = this.f36501b.getSurface();
        }
        return surface;
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: f */
    public final kpw mo14511f() {
        synchronized (this.f36500a) {
            Image imageAcquireLatestImage = this.f36501b.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new kls(imageAcquireLatestImage);
        }
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: g */
    public final kpw mo14512g() {
        synchronized (this.f36500a) {
            Image imageAcquireNextImage = this.f36501b.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new kls(imageAcquireNextImage);
        }
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: h */
    public final void mo14513h() {
        synchronized (this.f36500a) {
            this.f36501b.discardFreeBuffers();
        }
    }

    @Override // p000.kpz
    /* JADX INFO: renamed from: i */
    public final void mo14514i(final kpy kpyVar, Handler handler) {
        synchronized (this.f36500a) {
            this.f36501b.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: klt
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    kpyVar.mo8395ca();
                }
            }, handler);
        }
    }

    public final String toString() {
        mrl mrlVarM16765d;
        synchronized (this.f36500a) {
            mrlVarM16765d = mpw.m16765d(this.f36501b);
        }
        mrlVarM16765d.m16826e("width", mo14509d());
        mrlVarM16765d.m16826e("height", mo14506a());
        mrlVarM16765d.m16823b("format", lme.m15725k(mo14507b()));
        mrlVarM16765d.m16826e("max images", mo14508c());
        return mrlVarM16765d.toString();
    }
}
