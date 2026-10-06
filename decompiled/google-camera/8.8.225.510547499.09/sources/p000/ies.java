package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ies implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener, ien {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f30554a;

    /* JADX INFO: renamed from: b */
    private final TextureView f30555b;

    /* JADX INFO: renamed from: c */
    private final WindowManager f30556c;

    /* JADX INFO: renamed from: d */
    private final TextureView.SurfaceTextureListener f30557d;

    /* JADX INFO: renamed from: e */
    private final ArrayList f30558e;

    /* JADX INFO: renamed from: f */
    private final hzu f30559f;

    /* JADX INFO: renamed from: g */
    private int f30560g;

    /* JADX INFO: renamed from: h */
    private int f30561h;

    /* JADX INFO: renamed from: i */
    private boolean f30562i;

    /* JADX INFO: renamed from: j */
    private final RectF f30563j;

    /* JADX INFO: renamed from: k */
    private int f30564k;

    /* JADX INFO: renamed from: l */
    private Surface f30565l;

    /* JADX INFO: renamed from: m */
    private SurfaceTexture f30566m;

    public ies(ConstraintLayout constraintLayout, hzu hzuVar, WindowManager windowManager, TextureView.SurfaceTextureListener surfaceTextureListener) {
        new ArrayList();
        this.f30558e = new ArrayList();
        this.f30560g = 0;
        this.f30561h = 0;
        this.f30563j = new RectF();
        this.f30564k = -1;
        this.f30565l = null;
        this.f30566m = null;
        this.f30554a = constraintLayout;
        constraintLayout.addOnLayoutChangeListener(this);
        TextureView textureView = new TextureView(constraintLayout.getContext());
        jvh.m13572t(textureView);
        this.f30555b = textureView;
        textureView.setId(View.generateViewId());
        textureView.setSurfaceTextureListener(this);
        this.f30556c = windowManager;
        this.f30559f = hzuVar;
        this.f30557d = surfaceTextureListener;
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: a */
    public final int mo11150a() {
        return this.f30555b.getHeight();
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: b */
    public final int mo11151b() {
        return this.f30555b.getWidth();
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: c */
    public final mrm mo11152c(imy imyVar) {
        RectF rectF;
        int i;
        TextureView textureView = this.f30555b;
        if (textureView == null) {
            rectF = new RectF();
        } else {
            Matrix matrix = new Matrix();
            RectF rectF2 = new RectF(0.0f, 0.0f, this.f30560g, this.f30561h);
            this.f30555b.getTransform(matrix).mapRect(rectF2);
            rectF = rectF2;
        }
        int iMin = (int) Math.min(rectF.width(), rectF.height());
        int iMax = (int) Math.max(rectF.height(), rectF.width());
        int i2 = iMin / 2;
        if (i2 <= 0 || (i = iMax / 2) <= 0) {
            return mqu.f41450a;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Surface surface = new Surface(textureView.getSurfaceTexture());
        synchronized (imyVar) {
            PixelCopy.request(surface, bitmapCreateBitmap, imyVar, imyVar.f31568a);
            imyVar.m11501b();
        }
        return mrm.m16829i(ihy.m11371b(bitmapCreateBitmap, 2));
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: d */
    public final nps mo11153d() {
        this.f30554a.addView(this.f30555b, 0);
        return kxk.m14965K(null);
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: e */
    public final nps mo11154e() {
        lku.m15614I(true, "Last Create Synchronization has not finished yet.");
        this.f30554a.removeView(this.f30555b);
        return kxk.m14965K(null);
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: f */
    public final void mo11155f() {
        this.f30555b.setTransform(new Matrix());
        this.f30563j.set(0.0f, 0.0f, this.f30560g, this.f30561h);
        this.f30555b.post(new idd(new ArrayList(this.f30558e), 4));
        if (this.f30560g <= 0 || this.f30561h <= 0) {
            return;
        }
        this.f30559f.m10961b().m4467h();
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: g */
    public final void mo11156g() {
        this.f30555b.requestLayout();
    }

    @Override // p000.ien
    /* JADX INFO: renamed from: h */
    public final void mo11157h(View.OnLayoutChangeListener onLayoutChangeListener) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f30555b.getParent() == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        boolean zM10962c = this.f30559f.m10962c();
        int iM9211c = ggi.m9211c(this.f30556c);
        if (this.f30560g == i9 && this.f30561h == i10 && this.f30564k == iM9211c && this.f30562i == zM10962c) {
            return;
        }
        this.f30560g = i9;
        this.f30561h = i10;
        this.f30564k = iM9211c;
        this.f30562i = zM10962c;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f30565l = new Surface(surfaceTexture);
        this.f30566m = surfaceTexture;
        this.f30557d.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f30557d.onSurfaceTextureDestroyed(surfaceTexture);
        Surface surface = this.f30565l;
        if (surface == null) {
            return false;
        }
        surface.release();
        this.f30565l = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f30557d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((ciq) this.f30557d).f5854t = surfaceTexture;
    }
}
