package p000;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxm implements gyh {

    /* JADX INFO: renamed from: b */
    private static final nbh f26724b = nbh.m17259h("com/google/android/apps/camera/session/ImageIntentSession");

    /* JADX INFO: renamed from: a */
    public final gyu f26725a = gyu.m10002a();

    /* JADX INFO: renamed from: c */
    private final hjy f26726c;

    /* JADX INFO: renamed from: d */
    private final String f26727d;

    /* JADX INFO: renamed from: e */
    private final long f26728e;

    /* JADX INFO: renamed from: f */
    private final cjr f26729f;

    /* JADX INFO: renamed from: g */
    private kpp f26730g;

    /* JADX INFO: renamed from: h */
    private final nqf f26731h;

    public gxm(String str, long j, cjr cjrVar, hjy hjyVar, nqf nqfVar) {
        this.f26727d = str;
        this.f26728e = j;
        this.f26729f = cjrVar;
        this.f26726c = hjyVar;
        lku.m15614I(!nqfVar.isDone(), "SettableFuture for image data is already set before the session started");
        this.f26731h = nqfVar;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: A */
    public final void mo9869A() {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: B */
    public final void mo9870B(ihb ihbVar, Throwable th) {
        ((nbe) ((nbe) ((nbe) f26724b.m17252c()).mo17283h(th)).mo17276G((char) 3339)).mo17290o("Error in Intent session.");
        this.f26731h.mo8566a(th);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: C */
    public final void mo9871C(boolean z) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: D */
    public final void mo9872D() {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: E */
    public final void mo9873E() {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: M */
    public final void mo9881M() {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: N */
    public final void mo9882N(kpp kppVar, boolean z) {
        this.f26730g = kppVar;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: O */
    public final void mo9883O(boolean z) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Q */
    public final synchronized void mo9885Q(ihb ihbVar) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: S */
    public final synchronized void mo9887S(kbc kbcVar) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void mo9888T(long j) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void mo9889U() {
        jeu.m12987k(this);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: V */
    public final void mo9890V(Integer num) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: X */
    public final void mo9892X(Bitmap bitmap, int i) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Y */
    public final void mo9893Y(Bitmap bitmap) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo9894Z(Bitmap bitmap, int i) {
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: a */
    public final synchronized kbb mo9651a() {
        return kbb.f35513b;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: ab */
    public final void mo9896ab(int i) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: ac */
    public final void mo9897ac(cwd cwdVar) {
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: b */
    public final synchronized void mo9652b(kbb kbbVar) {
    }

    @Override // p000.gqr
    /* JADX INFO: renamed from: c */
    public final void mo9653c(gqt gqtVar) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: d */
    public final long mo9898d() {
        return this.f26728e;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: f */
    public final gyj mo9900f() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: g */
    public final gyn mo9901g() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: h */
    public final gyu mo9902h() {
        return this.f26725a;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: i */
    public final gyw mo9903i() {
        return gyw.IMAGE_INTENT;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: j */
    public final gyx mo9904j() {
        return gyx.MEDIA_STORE;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: k */
    public final hjy mo9905k() {
        return this.f26726c;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: l */
    public final kpp mo9906l() {
        return this.f26730g;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: m */
    public final mrm mo9907m() {
        return mqu.f41450a;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: n */
    public final mrm mo9908n() {
        return mqu.f41450a;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: p */
    public final nps mo9910p() {
        return nod.m17553i(this.f26731h, new etx(this, 18), not.INSTANCE);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: q */
    public final nps mo9911q() {
        throw new IllegalStateException("Image Intent session doesn't have a MediaStoreRecord.");
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: r */
    public final nps mo9912r(byte[] bArr, hln hlnVar) throws IllegalAccessException, InvocationTargetException {
        try {
            ExifInterface exifInterface = (ExifInterface) hlnVar.f28268c.mo16812f();
            if (exifInterface != null) {
                mrm mrmVarM3829b = this.f26729f.m3829b();
                if (mrmVarM3829b.mo16813g()) {
                    kep kepVar = new kep(exifInterface);
                    kepVar.m14068d((Location) mrmVarM3829b.mo16809c());
                    exifInterface = kepVar.f35783a;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bArr == null) {
                    throw new IllegalArgumentException("Argument is null");
                }
                ngc ngcVar = new ngc(byteArrayOutputStream);
                try {
                    OutputStream outputStreamM4688m = exifInterface.m4688m(ngcVar);
                    try {
                        outputStreamM4688m.write(bArr, 0, bArr.length);
                        outputStreamM4688m.close();
                        ngcVar.flush();
                        ngcVar.close();
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            outputStreamM4688m.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        ngcVar.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            }
            this.f26731h.mo14894e(bArr);
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) f26724b.m17251b()).mo17283h(e)).mo17276G((char) 3338)).mo17290o("Could not read image bytes.");
            this.f26731h.mo8566a(e);
        }
        return kxk.m14965K(this.f26725a);
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: s */
    public final String mo9913s() {
        return this.f26727d;
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: u */
    public final void mo9915u(gys gysVar) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: w */
    public final void mo9917w(Throwable th) {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: y */
    public final void mo9919y() {
    }

    @Override // p000.gyh
    /* JADX INFO: renamed from: z */
    public final void mo9920z() {
    }
}
