package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fiz implements fgz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dhv f22198a;

    public fiz(dhv dhvVar) {
        this.f22198a = dhvVar;
    }

    @Override // p000.fgz
    /* JADX INFO: renamed from: a */
    public final kyq mo8405a(FileOutputStream fileOutputStream, int i, nps npsVar, Executor executor) {
        try {
            dhv dhvVar = this.f22198a;
            dhx dhxVar = dii.f11525a;
            dhvVar.mo6175c();
            amv amvVarM246c = acw.m246c(fileOutputStream, acx.m250d(1));
            amvVarM246c.m977e(i);
            kyc kycVar = new kyc(fileOutputStream, amvVarM246c, executor);
            npsVar.mo2282d(new kds(kycVar, npsVar, 15), kycVar.f37714e);
            return kycVar;
        } catch (IOException e) {
            throw new kye(e);
        }
    }
}
