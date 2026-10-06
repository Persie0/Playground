package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evw implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ chw f20484a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20485b;

    public evw(euf eufVar, int i) {
        this.f20485b = i;
        this.f20484a = eufVar;
    }

    public evw(ewa ewaVar, int i) {
        this.f20485b = i;
        this.f20484a = ewaVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.f20485b) {
            case 0:
                ewa ewaVar = (ewa) this.f20484a;
                if (ewaVar.f20561s.mo6184l(dib.f11357ck)) {
                    ewaVar.f20549g.execute(new bnp(ewaVar, ((gzp) ewaVar.f20567y.mo3831be()).equals(gzp.OFF) && ewaVar.f20502E.m10885h(), 11));
                }
                break;
            default:
                euf eufVar = (euf) this.f20484a;
                if (eufVar.f19968ac.mo6184l(dib.f11357ck)) {
                    eufVar.f19998e.execute(new bnp(eufVar, ((gzp) eufVar.f19927N.mo3831be()).equals(gzp.OFF) && eufVar.f19920G.m10885h(), 8));
                }
                break;
        }
    }
}
