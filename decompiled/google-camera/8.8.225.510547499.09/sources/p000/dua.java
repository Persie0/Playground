package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dua implements dtf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f12575a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12576b;

    public dua(duc ducVar, int i) {
        this.f12576b = i;
        this.f12575a = ducVar;
    }

    public dua(due dueVar, int i) {
        this.f12576b = i;
        this.f12575a = dueVar;
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo6719c(kmd kmdVar) {
        int i = this.f12576b;
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: a */
    public final void mo6718a() {
        switch (this.f12576b) {
            case 0:
                Iterator it = ((duc) this.f12575a).f12578a.iterator();
                while (it.hasNext()) {
                    ((dtf) it.next()).mo6718a();
                }
                break;
        }
    }

    @Override // p000.dtf
    /* JADX INFO: renamed from: d */
    public final void mo6720d(kmd kmdVar, cem cemVar) {
        switch (this.f12576b) {
            case 0:
                Iterator it = ((duc) this.f12575a).f12578a.iterator();
                while (it.hasNext()) {
                    ((dtf) it.next()).mo6720d(kmdVar, cemVar);
                }
                break;
            default:
                ((due) this.f12575a).m6753a(kmdVar, cemVar);
                break;
        }
    }
}
