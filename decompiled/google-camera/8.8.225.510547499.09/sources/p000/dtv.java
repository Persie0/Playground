package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dtv implements dte {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12567a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12568b;

    public /* synthetic */ dtv(duc ducVar, int i) {
        this.f12568b = i;
        this.f12567a = ducVar;
    }

    public /* synthetic */ dtv(duf dufVar, int i) {
        this.f12568b = i;
        this.f12567a = dufVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [duf, java.lang.Object] */
    @Override // p000.dte
    /* JADX INFO: renamed from: b */
    public final void mo4009b(key keyVar, kgg kggVar) {
        switch (this.f12568b) {
            case 0:
                Iterator it = ((duc) this.f12567a).f12579b.iterator();
                while (it.hasNext()) {
                    ((dte) it.next()).mo4009b(keyVar, kggVar);
                }
                break;
            default:
                keyVar.mo7050k(new dtz(keyVar, this.f12567a));
                break;
        }
    }
}
