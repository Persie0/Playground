package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cxb implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f9943a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kmq f9944b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gyv f9945c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ cxc f9946d;

    public cxb(cxc cxcVar, nqf nqfVar, kmq kmqVar, gyv gyvVar) {
        this.f9946d = cxcVar;
        this.f9943a = nqfVar;
        this.f9944b = kmqVar;
        this.f9945c = gyvVar;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        ((nbe) ((nbe) ((nbe) cxc.f9947a.m17251b()).mo17283h(th)).mo17276G((char) 754)).mo17290o(HRLmc.VYCc);
        this.f9943a.mo8566a(th);
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            nqf nqfVar = this.f9943a;
            cxd cxdVar = this.f9946d.f9948b;
            kay kayVar = kay.CLOCKWISE_0;
            kmq kmqVar = this.f9944b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            cth cthVarM5704a = cxdVar.m5704a(byteArrayOutputStream.toByteArray(), kayVar, kmqVar);
            cthVarM5704a.f9431g = new kbc(bitmap.getWidth(), bitmap.getHeight());
            cthVarM5704a.m5494c(1);
            cthVarM5704a.m5493b(System.currentTimeMillis() - this.f9946d.f9949c);
            cthVarM5704a.f9434j = this.f9945c;
            nqfVar.mo14894e(cthVarM5704a.m5492a());
        } catch (Exception e) {
            this.f9943a.mo8566a(e);
        }
    }
}
