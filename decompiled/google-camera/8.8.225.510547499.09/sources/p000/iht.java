package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iht {

    /* JADX INFO: renamed from: a */
    public static final nbh f31001a = nbh.m17259h("com/google/android/apps/camera/ui/viewfinder/Viewfinder");

    /* JADX INFO: renamed from: b */
    public final Object f31002b;

    /* JADX INFO: renamed from: c */
    public final ggm f31003c;

    /* JADX INFO: renamed from: d */
    public final MainActivityLayout f31004d;

    /* JADX INFO: renamed from: e */
    public final kbz f31005e;

    /* JADX INFO: renamed from: f */
    public final jwn f31006f;

    /* JADX INFO: renamed from: g */
    public final imy f31007g;

    /* JADX INFO: renamed from: h */
    public ihm f31008h;

    /* JADX INFO: renamed from: i */
    public mrm f31009i;

    /* JADX INFO: renamed from: j */
    public mrm f31010j;

    /* JADX INFO: renamed from: k */
    private final FrameLayout f31011k;

    /* JADX INFO: renamed from: l */
    private final oju f31012l;

    /* JADX INFO: renamed from: m */
    private final dhv f31013m;

    /* JADX INFO: renamed from: n */
    private kba f31014n;

    public iht(ggm ggmVar, iid iidVar, kbz kbzVar, oju ojuVar, jwn jwnVar, imy imyVar, dhv dhvVar) {
        mqu mquVar = mqu.f41450a;
        this.f31009i = mquVar;
        this.f31010j = mquVar;
        this.f31011k = iidVar.f31067d;
        this.f31004d = iidVar.f31066c;
        this.f31003c = ggmVar;
        this.f31005e = kbzVar;
        this.f31012l = ojuVar;
        this.f31002b = new Object();
        this.f31006f = jwnVar;
        this.f31007g = imyVar;
        this.f31013m = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m11361a(Bitmap bitmap, int i, boolean z) {
        Matrix matrix = new Matrix();
        matrix.postRotate(-i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix.isIdentity() ? bitmap : Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m11362b(SurfaceView surfaceView, int i, int i2, imy imyVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        imyVar.m11500a(surfaceView, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public static Size m11363c(int i, int i2, kay kayVar, int i3) {
        return (kayVar.equals(kay.CLOCKWISE_0) || kayVar.equals(kay.CLOCKWISE_180)) ? new Size(i / i3, i2 / i3) : new Size(i2 / i3, i / i3);
    }

    /* JADX INFO: renamed from: h */
    private final void m11364h() {
        ihm ihmVar = this.f31008h;
        if (ihmVar != null) {
            ihmVar.close();
            this.f31008h = null;
        }
        kba kbaVar = this.f31014n;
        if (kbaVar != null) {
            kbaVar.close();
            this.f31014n = null;
        }
        this.f31004d.m4464e();
    }

    /* JADX INFO: renamed from: d */
    public final mrm m11365d() {
        return m11366e(false, 2, this.f31003c.mo9216f());
    }

    /* JADX INFO: renamed from: f */
    public final nps m11367f(ihx ihxVar, mrm mrmVar, Integer num) {
        nqf nqfVar;
        this.f31009i = mrmVar;
        this.f31005e.mo13961e("swapAndStartSurfaceViewViewfinder");
        synchronized (this.f31002b) {
            m11364h();
            etn etnVarM7794a = ((ess) this.f31012l).get();
            etnVarM7794a.f19839d = new ihk(ihxVar, this.f31010j);
            lkm.m15599z(etnVarM7794a.f19839d, ihk.class);
            Object obj = etnVarM7794a.f19836a;
            Object obj2 = etnVarM7794a.f19837b;
            Object obj3 = etnVarM7794a.f19838c;
            Object obj4 = etnVarM7794a.f19839d;
            this.f31008h = (ihm) ohh.m18486b(new gcr(((esr) obj2).f15768n, ((esz) obj).f17171p, ((esw) obj3).f16129g, ((esr) obj2).f15770p, ((esz) obj).f16764hQ, ohh.m18486b(new hqv((ihk) obj4, 14)), ((esz) obj).f16641f, ((esz) obj).f16747h, ohh.m18486b(new hqv((ihk) obj4, 13)), new iho(((esz) obj).f16640ez), 10, (int[][]) null)).get();
            this.f31004d.m4465f(this.f31011k);
            ihm ihmVar = this.f31008h;
            ihmVar.getClass();
            jvd.m13538a();
            nqfVar = ihmVar.f30976g;
        }
        if (this.f31013m.mo6184l(dib.f11315bV)) {
            this.f31014n = this.f31006f.mo3830a(new gmb(this, ihxVar, 15), jvd.f34877a);
        } else {
            MainActivityLayout mainActivityLayout = this.f31004d;
            kbc kbcVar = ihxVar.f31019a;
            mainActivityLayout.m4466g(kbcVar.f35517a, kbcVar.f35518b, num);
        }
        this.f31005e.mo13962f();
        return nqfVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m11368g() {
        synchronized (this.f31002b) {
            m11364h();
        }
    }

    /* JADX INFO: renamed from: e */
    public final mrm m11366e(final boolean z, final int i, final kay kayVar) {
        synchronized (this.f31002b) {
            ihm ihmVar = this.f31008h;
            if (ihmVar == null) {
                ((nbe) ((nbe) f31001a.m17252c()).mo17276G(4257)).mo17290o("getScreenshot(): the surfaceViewAdapter is null");
                return mqu.f41450a;
            }
            final SurfaceView surfaceView = ihmVar.f30971b;
            final Size size = new Size(surfaceView.getWidth(), surfaceView.getHeight());
            try {
                this.f31005e.mo13961e("getScreenshot");
                return (mrm) this.f31009i.mo16808b(new mrf() { // from class: ihr
                    @Override // p000.mrf
                    public final Object apply(Object obj) {
                        iht ihtVar = this.f30991a;
                        Size size2 = size;
                        kay kayVar2 = kayVar;
                        boolean z2 = z;
                        int i2 = i;
                        Size sizeM11363c = iht.m11363c(size2.getWidth(), size2.getHeight(), ihtVar.f31003c.mo9216f(), i2);
                        mrm mrmVarD = ((ipp) obj).mo11584d(sizeM11363c.getWidth(), sizeM11363c.getHeight());
                        return mrmVarD.mo16813g() ? mrm.m16829i(ihy.m11371b(iht.m11361a((Bitmap) mrmVarD.mo16809c(), kayVar2.m13893a(), z2), i2)) : mqu.f41450a;
                    }
                }).mo16810d(new msi() { // from class: ihs
                    @Override // p000.msi
                    /* JADX INFO: renamed from: a */
                    public final Object mo6051a() {
                        iht ihtVar = this.f30996a;
                        SurfaceView surfaceView2 = surfaceView;
                        kay kayVar2 = kayVar;
                        boolean z2 = z;
                        int i2 = i;
                        kay kayVarMo9216f = ihtVar.f31003c.mo9216f();
                        imy imyVar = ihtVar.f31007g;
                        if (!surfaceView2.getHolder().getSurface().isValid()) {
                            ((nbe) ((nbe) iht.f31001a.m17252c()).mo17276G((char) 4261)).mo17290o("getScreenshotFrom(): the surface is not valid");
                            return mqu.f41450a;
                        }
                        Size sizeM11363c = iht.m11363c(surfaceView2.getWidth(), surfaceView2.getHeight(), kayVarMo9216f, i2);
                        if (sizeM11363c.getWidth() <= 0 || sizeM11363c.getHeight() <= 0) {
                            ((nbe) ((nbe) iht.f31001a.m17252c()).mo17276G((char) 4260)).mo17290o("getScreenshotFrom(): the surface size is invalid");
                            return mqu.f41450a;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeM11363c.getWidth(), sizeM11363c.getHeight(), Bitmap.Config.ARGB_8888);
                        imyVar.m11500a(surfaceView2, bitmapCreateBitmap);
                        return mrm.m16829i(ihy.m11371b(iht.m11361a(bitmapCreateBitmap, kayVar2.m13893a(), z2), i2));
                    }
                });
            } finally {
                this.f31005e.mo13962f();
            }
        }
    }
}
