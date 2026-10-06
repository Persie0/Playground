package p000;

import java.util.Map;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxn extends kpt {

    /* JADX INFO: renamed from: a */
    public final Map f23804a;

    public fxn(kpw kpwVar) {
        super(kpwVar);
        this.f23804a = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: k */
    public final nps m8924k() {
        return (nps) m8925l(fxm.f23802a);
    }

    /* JADX INFO: renamed from: l */
    public final Object m8925l(fxl fxlVar) {
        if (this.f23804a.containsKey(fxlVar)) {
            return this.f23804a.get(fxlVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8926m() {
        return mo7245a() != -1;
    }

    public fxn(kpw kpwVar, nps npsVar) {
        this(kpwVar);
        if (npsVar != null) {
            this.f23804a.put(fxm.f23802a, npsVar);
        }
    }
}
