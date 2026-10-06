package p000;

import androidx.wear.ambient.AmbientMode;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hif implements hiv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hig f27895a;

    public hif(hig higVar) {
        this.f27895a = higVar;
    }

    @Override // p000.hiv
    /* JADX INFO: renamed from: a */
    public final void mo10337a(byte[] bArr) {
        int length;
        hig higVar = this.f27895a;
        if (higVar.f27901f == null || (length = bArr.length) == 0) {
            return;
        }
        khb khbVar = new khb(lej.m15248a(ByteBuffer.wrap(bArr), length, higVar.f27897b.m5443a(length)));
        AmbientMode.AmbientController ambientController = higVar.f27901f;
        Object obj = ambientController.f1697a;
        if (khbVar.m14236a() != 0) {
            cru cruVar = (cru) obj;
            if (cruVar.f9180c.isShutdown()) {
                ((nbe) ((nbe) cru.f9175a.m17252c()).mo17276G((char) 554)).mo17290o("Output executor is shutdown.");
            }
            cru.m5431d(new cgl(cruVar, khbVar, 15, null), cruVar.f9180c);
        }
        cru.m5431d(new cgl(ambientController, khbVar, 16, null, null), ((cru) ambientController.f1697a).f9179b);
    }

    @Override // p000.hiv
    /* JADX INFO: renamed from: b */
    public final void mo10338b() {
        AmbientMode.AmbientController ambientController = this.f27895a.f27901f;
        if (ambientController != null) {
            nbh nbhVar = cru.f9175a;
            ((cru) ambientController.f1697a).f9182e.mo14894e(true);
        }
    }

    @Override // p000.hiv
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo10339c(int i) {
    }
}
