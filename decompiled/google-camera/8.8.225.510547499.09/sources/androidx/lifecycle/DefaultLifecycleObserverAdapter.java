package androidx.lifecycle;

import p000.akl;
import p000.akq;
import p000.akt;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements akt {

    /* JADX INFO: renamed from: a */
    private final akl f1515a;

    /* JADX INFO: renamed from: b */
    private final akt f1516b;

    public DefaultLifecycleObserverAdapter(akl aklVar, akt aktVar) {
        this.f1515a = aklVar;
        this.f1516b = aktVar;
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        switch (akqVar) {
            case ON_CREATE:
                this.f1515a.onCreate(akvVar);
                break;
            case ON_START:
                this.f1515a.onStart(akvVar);
                break;
            case ON_RESUME:
                this.f1515a.onResume(akvVar);
                break;
            case ON_PAUSE:
                this.f1515a.onPause(akvVar);
                break;
            case ON_STOP:
                this.f1515a.onStop(akvVar);
                break;
            case ON_DESTROY:
                this.f1515a.onDestroy(akvVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        akt aktVar = this.f1516b;
        if (aktVar != null) {
            aktVar.mo883a(akvVar, akqVar);
        }
    }
}
