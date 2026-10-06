package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxo extends gxl {
    public gxo(gwx gwxVar, String str, cjr cjrVar, gyn gynVar) {
        super(gwxVar.mo9867a(gyw.CYCLOPS_PANO, str, cjrVar, gynVar, null, mqu.f41450a));
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: S */
    public final synchronized void mo9887S(kbc kbcVar) {
        super.mo9887S(kbcVar);
        mo9881M();
        this.f26723b.m9876H(mo9902h());
        m9935o().mo6401c(fdh.m8262b(mo9903i(), null, null));
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: r */
    public final synchronized nps mo9912r(byte[] bArr, hln hlnVar) {
        m9931H("saveAndFinish");
        if (m9933J().m2554C()) {
            m9932I(hIAHJKEnGsNbz.CVelWyspPmW);
            return mo9910p();
        }
        m9933J().m2557F(2, 3);
        hlnVar.f28269d = m9934e().m3829b();
        m9933J().m2558G(3);
        ExifInterface exifInterface = (ExifInterface) hlnVar.f28268c.mo16812f();
        if (exifInterface != null) {
            ((hjz) mo9905k()).f28081g = exifInterface;
        }
        m9929F().execute(new gxn(this, bArr, mo9900f(), 0));
        return mo9910p();
    }
}
