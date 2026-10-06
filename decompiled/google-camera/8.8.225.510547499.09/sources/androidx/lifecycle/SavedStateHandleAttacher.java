package androidx.lifecycle;

import p000.akq;
import p000.akt;
import p000.akv;
import p000.alm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements akt {

    /* JADX INFO: renamed from: a */
    private final alm f1523a;

    public SavedStateHandleAttacher(alm almVar) {
        this.f1523a = almVar;
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        if (akqVar == akq.ON_CREATE) {
            akvVar.getLifecycle().m881c(this);
            this.f1523a.m915b();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Next event must be ON_CREATE, it was ");
            sb.append(akqVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(akqVar.toString()));
        }
    }
}
