package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyh implements fzt {

    /* JADX INFO: renamed from: a */
    public final gqj f23901a;

    /* JADX INFO: renamed from: b */
    public final kqc f23902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fyi f23903c;

    public fyh(fyi fyiVar, gyh gyhVar) {
        this.f23903c = fyiVar;
        grj grjVar = new grj(gyhVar);
        this.f23901a = grjVar;
        ((gxl) gyhVar).f26723b.m9899e().m9649a(grjVar);
        gyn gynVarMo9901g = gyhVar.mo9901g();
        krm krmVar = krm.PICTURES;
        dhv dhvVar = fyiVar.f23905b;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
        this.f23902b = gynVarMo9901g.m9983c().mo14695f(1, krmVar, "Raw", pIeXJQLZLfgIN.VBxir);
        fyiVar.f23905b.mo6177e();
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        throw new RuntimeException("Should not call RawModeImageSaver.addFullSizeImage()");
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
    }
}
