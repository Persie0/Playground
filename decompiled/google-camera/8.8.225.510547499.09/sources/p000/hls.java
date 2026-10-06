package p000;

import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hls implements nom {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hlv f28277a;

    public hls(hlv hlvVar) {
        this.f28277a = hlvVar;
    }

    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ nps mo3942a(Object obj) {
        try {
            bkn bknVarM2898h = ((bpv) obj).m2898h(this.f28277a.f28283c);
            if (bknVarM2898h == null) {
                return kxk.m14965K(null);
            }
            FileInputStream fileInputStream = new FileInputStream(bknVarM2898h.m2585f());
            try {
                hlr hlrVar = new hlr(BitmapFactory.decodeStream(fileInputStream), kay.m13889b((fileInputStream.read() & 255) | ((fileInputStream.read() & 255) << 8)));
                synchronized (this.f28277a.f28286f) {
                    this.f28277a.f28285e = hlrVar;
                }
                nps npsVarM14965K = kxk.m14965K(hlrVar);
                fileInputStream.close();
                return npsVarM14965K;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            return kxk.m14964J(e2);
        }
    }
}
