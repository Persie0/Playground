package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kcs implements kct {

    /* JADX INFO: renamed from: a */
    final List f35601a;

    public kcs(List list) {
        this.f35601a = list;
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: a */
    public final void mo13971a() {
        Iterator it = this.f35601a.iterator();
        while (it.hasNext()) {
            ((kct) it.next()).mo13971a();
        }
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: b */
    public final void mo13972b() {
        Iterator it = this.f35601a.iterator();
        while (it.hasNext()) {
            ((kct) it.next()).mo13972b();
        }
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: c */
    public final void mo13973c(kcl kclVar) {
        Iterator it = this.f35601a.iterator();
        while (it.hasNext()) {
            ((kct) it.next()).mo13973c(kclVar);
        }
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: d */
    public final void mo13974d(kpj kpjVar) {
        Iterator it = this.f35601a.iterator();
        while (it.hasNext()) {
            ((kct) it.next()).mo13974d(kpjVar);
        }
    }
}
