package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gom implements gol {

    /* JADX INFO: renamed from: a */
    private static final nbh f25883a = nbh.m17259h(TVkaNXnfP.KPHKOmUHjCHItD);

    /* JADX INFO: renamed from: b */
    private final Set f25884b;

    public gom(Set set) {
        this.f25884b = mxk.m17134F(set);
    }

    @Override // p000.gol
    /* JADX INFO: renamed from: a */
    public final boolean mo7269a(key keyVar) {
        try {
            kfv.m14173v(keyVar);
            kpp kppVarMo7042c = keyVar.mo7042c();
            if (kppVarMo7042c == null) {
                ((nbe) ((nbe) f25883a.m17252c()).mo17276G(3126)).mo17293r("Missing metadata for frame %s.", keyVar.mo7041b());
                return false;
            }
            Iterator it = this.f25884b.iterator();
            while (it.hasNext()) {
                if (!((fwc) it.next()).mo8862a(kppVarMo7042c)) {
                    ((nbe) ((nbe) f25883a.m17252c()).mo17276G(3124)).mo17293r("Frame rejected: %s.", keyVar.mo7041b());
                    return false;
                }
            }
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((nbe) ((nbe) f25883a.m17252c()).mo17276G((char) 3125)).mo17293r("Wait for metadata for frame %s got interrupted.", keyVar.mo7041b());
            return false;
        }
    }
}
