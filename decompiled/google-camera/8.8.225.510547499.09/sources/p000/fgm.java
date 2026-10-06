package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgm implements fgv {

    /* JADX INFO: renamed from: a */
    private static final nbh f21918a = nbh.m17259h("com/google/android/apps/camera/microvideo/NoOpMicrovideoSession");

    /* JADX INFO: renamed from: b */
    private final gyu f21919b;

    public fgm(gyu gyuVar) {
        this.f21919b = gyuVar;
    }

    @Override // p000.fgv
    /* JADX INFO: renamed from: a */
    public final nps mo8370a(hln hlnVar, gyj gyjVar, mrm mrmVar, long j, hjy hjyVar) {
        return kxk.m14964J(new RuntimeException("No in-flight session found for ".concat(String.valueOf(String.valueOf(this.f21919b)))));
    }

    @Override // p000.fgv
    /* JADX INFO: renamed from: b */
    public final nps mo8371b(hln hlnVar, InputStream inputStream, gyj gyjVar, mrm mrmVar, long j, String str, hjy hjyVar) {
        try {
            hjyVar.mo10402d(kxk.m15018k(inputStream, (ExifInterface) mrmVar.mo16812f(), gyjVar.f26832a));
            gyjVar.m9977b();
            return kxk.m14965K(hlnVar);
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) f21918a.m17251b()).mo17283h(e)).mo17276G((char) 2231)).mo17290o("Error while saving jpeg in finishMicrovideo");
            gyjVar.m9976a();
            return kxk.m14964J(e);
        }
    }

    @Override // p000.fgv
    /* JADX INFO: renamed from: c */
    public final void mo8372c() {
    }
}
