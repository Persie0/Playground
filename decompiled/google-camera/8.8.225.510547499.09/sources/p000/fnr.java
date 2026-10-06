package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnr implements bnr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22801a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22802b;

    public fnr(exk exkVar, int i) {
        this.f22802b = i;
        this.f22801a = exkVar;
    }

    public fnr(foc focVar, int i) {
        this.f22802b = i;
        this.f22801a = focVar;
    }

    @Override // p000.bnr
    /* JADX INFO: renamed from: a */
    public final void mo2777a() {
        switch (this.f22802b) {
            case 0:
                foc focVar = (foc) this.f22801a;
                exm exmVar = focVar.f22887r;
                if (exmVar != null) {
                    focVar.f22880k = true;
                    exmVar.f20777s = true;
                    exmVar.f20760b.f20791D = false;
                    Thread.State state = focVar.f22877h.getState();
                    if (state == Thread.State.NEW) {
                        ((foc) this.f22801a).f22877h.start();
                    } else {
                        ((nbe) ((nbe) foc.f22821b.m17252c()).mo17276G((char) 2383)).mo17293r("aligner has already been started! State=%s", state);
                    }
                    foc focVar2 = (foc) this.f22801a;
                    focVar2.m8619w();
                    focVar2.f22883n.m4467h();
                    try {
                        Object obj = this.f22801a;
                        ((foc) obj).f22828G = ((foc) obj).f22887r.m8004b() <= 0.0f;
                        foc focVar3 = (foc) this.f22801a;
                        Handler handler = focVar3.f22829H;
                        if (handler != null) {
                            handler.obtainMessage(1).sendToTarget();
                            focVar3.f22829H.obtainMessage(2, focVar3.f22892w, focVar3.f22893x).sendToTarget();
                            foc focVar4 = (foc) this.f22801a;
                            focVar4.f22887r.f20778t = focVar4.f22830I;
                        }
                        ((foc) this.f22801a).m8615F(true);
                        ((foc) this.f22801a).f22875f.setSideButtonsClickable(true);
                    } catch (IllegalStateException e) {
                        return;
                    }
                    break;
                }
                break;
            default:
                ((exk) this.f22801a).f20739a.f20777s = true;
                break;
        }
    }
}
