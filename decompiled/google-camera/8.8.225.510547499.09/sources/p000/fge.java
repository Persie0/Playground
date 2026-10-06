package p000;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fge implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fgg f21814a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fgh f21815b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ drj f21816c;

    public fge(fgh fghVar, fgg fggVar, drj drjVar, byte[] bArr, byte[] bArr2) {
        this.f21815b = fghVar;
        this.f21814a = fggVar;
        this.f21816c = drjVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        if (this.f21814a.f21834n.mo8411b().isCancelled()) {
            fgh.m8378k(this.f21814a, th, this.f21816c);
        } else {
            this.f21815b.m8383h(this.f21814a, th, this.f21816c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [hjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, java.util.List] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final void mo3811b(Object obj) {
        fgh fghVar = this.f21815b;
        fgg fggVar = this.f21814a;
        drj drjVar = this.f21816c;
        fil filVarM8463a = fggVar.f21824d.m8463a();
        long j = filVarM8463a.f22124d - filVarM8463a.f22123c;
        if (fggVar.f21835o) {
            fghVar.m8384j(fggVar, drjVar, j);
            return;
        }
        try {
            FileOutputStream fileOutputStreamMo14685e = ((gyj) drjVar.f12395a).f26832a.mo14685e();
            Object obj2 = drjVar.f12398d;
            OutputStream outputStreamM4688m = ((mrm) obj2).mo16813g() ? ((ExifInterface) ((mrm) obj2).mo16809c()).m4688m(fileOutputStreamMo14685e) : fileOutputStreamMo14685e;
            try {
                lku.m15613H(fggVar.f21828h.isDone());
                lku.m15613H(fggVar.f21838r.isDone());
                long jLongValue = ((Long) kxk.m14974T(fggVar.f21828h)).longValue() - ((Long) kxk.m14974T(fggVar.f21838r)).longValue();
                if (jLongValue < 0) {
                    ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17276G(2199)).mo17292q("Negative shutter presentation timestamp detected (%d). Resetting to 0.", jLongValue);
                    jLongValue = 0;
                }
                if (fghVar.f21859k.mo6184l(dij.f11562L)) {
                    fghVar.f21862n.m8392a(fggVar.f21823c.f26832a);
                }
                int iMo14681a = (int) fggVar.f21823c.f26832a.mo14681a();
                if (iMo14681a < 100000) {
                    ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17276G(2198)).mo17291p("Bundled video file too small (%d bytes)", iMo14681a);
                }
                try {
                    FileInputStream fileInputStreamMo14684d = fggVar.f21823c.f26832a.mo14684d();
                    try {
                        boolean zM8382e = fghVar.m8382e(fggVar.f21835o);
                        if (zM8382e) {
                            ((gyj) drjVar.f12395a).f26832a.mo14688h("MP");
                        } else {
                            ((gyj) drjVar.f12395a).f26832a.mo14688h("MV");
                        }
                        char c = true != zM8382e ? (char) 1 : (char) 2;
                        Object obj3 = drjVar.f12398d;
                        mrn mrnVarM14798d = ksh.m14798d((byte[]) drjVar.f12396b, ((mrm) obj3).mo16813g() ? (bfd) ksh.m14797c(((ExifInterface) ((mrm) obj3).mo16809c()).f7918bA).mo16812f() : null);
                        bfd bfdVar = (bfd) mrnVarM14798d.f41479a;
                        bfd bfdVar2 = (bfd) mrnVarM14798d.f41480b;
                        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController((byte[]) drjVar.f12396b);
                        kxp kxpVar = new kxp(iMo14681a, fileInputStreamMo14684d);
                        if (new AtomicBoolean(false).getAndSet(true)) {
                            throw new IllegalStateException("Executed command more than once. This is unexpected");
                        }
                        try {
                            switch (c) {
                                case 1:
                                    int i = kxpVar.f37667a;
                                    bff.f3083a.m5628e("http://ns.google.com/photos/1.0/camera/", "GCamera");
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MicroVideo", 1);
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MicroVideoVersion", 1);
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset", Integer.valueOf(i));
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MicroVideoPresentationTimestampUs", Long.valueOf(jLongValue));
                                    lqi.m15854B(ambientController, bfdVar, bfdVar2, kxpVar, outputStreamM4688m);
                                    break;
                                default:
                                    kyu kyuVarM15073a = kyv.m15073a();
                                    kyuVarM15073a.f37743b = "Primary";
                                    kyuVarM15073a.m15067c(0);
                                    kyuVarM15073a.m15066b(0);
                                    kyuVarM15073a.f37742a = "image/jpeg";
                                    kyv kyvVarM15065a = kyuVarM15073a.m15065a();
                                    kyu kyuVarM15073a2 = kyv.m15073a();
                                    kyuVarM15073a2.f37743b = "MotionPhoto";
                                    kyuVarM15073a2.f37742a = "video/mp4";
                                    kyuVarM15073a2.m15067c(0);
                                    kyuVarM15073a2.m15066b(kxpVar.f37667a);
                                    kyv[] kyvVarArr = {kyvVarM15065a, kyuVarM15073a2.m15065a()};
                                    int i2 = 0;
                                    for (int i3 = 2; i2 < i3; i3 = 2) {
                                        String strM15879x = i2 == 0 ? lqi.m15879x(kyvVarArr[0]) : lqi.m15880y(kyvVarArr[i2]);
                                        if (!strM15879x.isEmpty()) {
                                            throw new bfc("Container items have bad values: ".concat(strM15879x), 5);
                                        }
                                        i2++;
                                    }
                                    lhz lhzVar = new lhz((char[]) null);
                                    for (int i4 = 0; i4 < 2; i4++) {
                                        lhzVar.m15367h(kyvVarArr[i4]);
                                    }
                                    bff.f3083a.m5628e("http://ns.google.com/photos/1.0/camera/", "Camera");
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MotionPhoto", 1);
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MotionPhotoVersion", 1);
                                    bfdVar.mo2292c("http://ns.google.com/photos/1.0/camera/", "MotionPhotoPresentationTimestampUs", Long.valueOf(jLongValue));
                                    bff.f3083a.m5628e("http://ns.google.com/photos/1.0/container/", "Container");
                                    bge bgeVar = new bge();
                                    bgeVar.m2398q();
                                    bgeVar.m2401t();
                                    bfdVar.mo2293d("http://ns.google.com/photos/1.0/container/", "Directory", null, bgeVar);
                                    synchronized (lhzVar) {
                                        int i5 = 1;
                                        for (Iterator it = lhzVar.f38277a.iterator(); it.hasNext(); it = it) {
                                            kyv kyvVar = (kyv) it.next();
                                            String strM2259b = bdy.m2259b("Directory", i5);
                                            kyv.m15074b(bfdVar, strM2259b);
                                            String strConcat = strM2259b.concat(bdy.m2260c("http://ns.google.com/photos/1.0/container/", "Item"));
                                            bff.f3083a.m5628e("http://ns.google.com/photos/1.0/container/item/", "Item");
                                            kyv.m15074b(bfdVar, strConcat);
                                            kyv.m15078f(bfdVar, strConcat, "Mime", kyvVar.f37747a);
                                            kyv.m15078f(bfdVar, strConcat, "Semantic", kyvVar.f37748b);
                                            kyv.m15078f(bfdVar, strConcat, "Length", Integer.toString(kyvVar.f37749c));
                                            kyv.m15078f(bfdVar, strConcat, "Padding", Integer.toString(kyvVar.f37750d));
                                            i5++;
                                        }
                                        break;
                                    }
                                    lqi.m15854B(ambientController, bfdVar, bfdVar2, kxpVar, outputStreamM4688m);
                                    break;
                            }
                            fggVar.f21823c.m9976a();
                            fileInputStreamMo14684d.close();
                            outputStreamM4688m.close();
                            fileInputStreamMo14684d.close();
                            outputStreamM4688m.close();
                            drjVar.f12399e.mo10402d(((gyj) drjVar.f12395a).f26832a.mo14681a());
                            boolean z = fhc.f21954a;
                            dhv dhvVar = fghVar.f21859k;
                            dhx dhxVar = dii.f11525a;
                            dhvVar.mo6178f();
                            boolean z2 = fhc.f21954a;
                            boolean z3 = fhc.f21954a;
                            boolean z4 = fhc.f21954a;
                            boolean z5 = fhc.f21954a;
                            ((gyj) drjVar.f12395a).m9977b();
                            fghVar.f21863o.removeCallbacksAndMessages(fggVar.f21821a);
                            if (fggVar.f21831k.getAndSet(true)) {
                                fghVar.f21859k.mo6178f();
                                ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17276G(2225)).mo17293r("Took too long to finish microvideo for %s!", fggVar.f21821a);
                            } else {
                                ((hjz) drjVar.f12399e).f28086l = fgh.m8375f(fggVar, System.currentTimeMillis());
                                lku.m15613H(!fggVar.f21833m.isDone());
                                fggVar.f21833m.mo14894e(drjVar.f12397c);
                                fggVar.f21823c.m9976a();
                            }
                        } catch (bfc e) {
                            throw new IOException(wUzNh.jJHKnNFf, e);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStreamMo14684d.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th3) {
                try {
                    outputStreamM4688m.close();
                    throw th3;
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            fghVar.m8383h(fggVar, th5, drjVar);
            ((gyj) drjVar.f12395a).m9976a();
            fggVar.f21823c.m9976a();
        }
    }
}
