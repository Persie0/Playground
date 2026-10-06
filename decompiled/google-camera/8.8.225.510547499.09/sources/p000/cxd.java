package p000;

import android.location.Location;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cxd {

    /* JADX INFO: renamed from: a */
    private static final nbh f9957a = nbh.m17259h("com/google/android/apps/camera/camcorder/snapshot/SnapshotUtils");

    /* JADX INFO: renamed from: b */
    private final fca f9958b;

    /* JADX INFO: renamed from: c */
    private final jfs f9959c;

    /* JADX INFO: renamed from: d */
    private final djm f9960d;

    /* JADX INFO: renamed from: e */
    private final cvy f9961e;

    public cxd(djm djmVar, fca fcaVar, jfs jfsVar, cvy cvyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f9960d = djmVar;
        this.f9958b = fcaVar;
        this.f9959c = jfsVar;
        this.f9961e = cvyVar;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final cth m5704a(byte[] bArr, kay kayVar, kmq kmqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.m4691r(bArr);
        } catch (IOException e) {
            ((nbe) ((nbe) f9957a.m17251b()).mo17276G((char) 758)).mo17290o(qQLA.uzBFhJxrA);
        }
        Integer numMo4681b = exifInterface.mo4681b(ExifInterface.f7848ai);
        int iIntValue = numMo4681b != null ? numMo4681b.intValue() : 0;
        Integer numMo4681b2 = exifInterface.mo4681b(ExifInterface.f7849aj);
        int iIntValue2 = numMo4681b2 != null ? numMo4681b2.intValue() : 0;
        if (exifInterface.m4686k(ExifInterface.f7866b) == null || exifInterface.m4686k(ExifInterface.f7813a) == null) {
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7813a, Integer.valueOf(iIntValue)));
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7866b, Integer.valueOf(iIntValue2)));
        }
        if (exifInterface.m4686k(ExifInterface.f7901j) == null) {
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7901j, Short.valueOf(kei.m14033b(kayVar).f35732i)));
        }
        kep kepVar = new kep(exifInterface);
        kepVar.m14071g(jCurrentTimeMillis);
        mrm mrmVarMo8117c = mqu.f41450a;
        if (((Boolean) this.f9960d.f11789c.mo10031c(gzy.f27043b)).booleanValue()) {
            mrmVarMo8117c = this.f9958b.mo8117c();
            if (mrmVarMo8117c.mo16813g()) {
                kepVar.m14068d((Location) mrmVarMo8117c.mo16809c());
            }
        }
        kepVar.m14072h(kmqVar, exifInterface.mo4680a(ExifInterface.f7812Z), exifInterface.mo4680a(ExifInterface.f7793G));
        this.f9959c.m13108n(exifInterface);
        cvy cvyVar = this.f9961e;
        Object obj = cvyVar.f9845b;
        Object obj2 = cvyVar.f9846c;
        gyn gynVarM14707i = ((kqj) obj).m14707i(System.currentTimeMillis());
        gyj gyjVarM9981a = gynVarM14707i.m9981a("jpg");
        try {
            long jM15017j = kxk.m15017j(bArr, exifInterface, gyjVarM9981a.f26832a);
            lku.m15618M(jM15017j > 0, "Expected to write a positive number of bytes to %s, instead wrote %s from byteArray of size %s", gyjVarM9981a.f26832a, Long.valueOf(jM15017j), Integer.valueOf(bArr.length));
            kay kayVarM14032a = kei.m14032a(kei.m14034c(exifInterface));
            cth cthVar = new cth(null);
            cthVar.f9426b = new File("");
            cthVar.f9425a = exifInterface;
            cthVar.f9427c = gyjVarM9981a;
            cthVar.f9428d = gynVarM14707i;
            cthVar.f9429e = mrmVarMo8117c;
            krd krdVar = krd.JPEG;
            if (krdVar == null) {
                throw new NullPointerException("Null mimeType");
            }
            cthVar.f9430f = krdVar;
            cthVar.f9431g = new kbc(iIntValue, iIntValue2);
            cthVar.f9432h = kayVarM14032a.f35503e;
            byte b = cthVar.f9435k;
            cthVar.f9433i = jCurrentTimeMillis;
            cthVar.f9435k = (byte) (b | 3);
            return cthVar;
        } catch (IOException e2) {
            ((nbe) ((nbe) ((nbe) f9957a.m17251b()).mo17283h(e2)).mo17276G((char) 757)).mo17290o("Failed to create file: ");
            throw e2;
        }
    }
}
