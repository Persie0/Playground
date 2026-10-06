package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mwn extends mwi {
    public mwn() {
        super(4);
    }

    @Override // p000.mwi
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo17072d(Object obj) {
        super.m17071c(obj);
    }

    /* JADX INFO: renamed from: f */
    public final mws m17081f() {
        this.f41726c = true;
        return mws.m17093h(this.f41724a, this.f41725b);
    }

    /* JADX INFO: renamed from: g */
    public final void m17082g(Object obj) {
        super.m17071c(obj);
    }

    /* JADX INFO: renamed from: h */
    public final void m17083h(Iterable iterable) {
        super.m17073e(iterable);
    }

    /* JADX INFO: renamed from: i */
    public final void m17084i(Iterator it) {
        while (it.hasNext()) {
            super.m17071c(it.next());
        }
    }

    public mwn(int i) {
        super(i);
    }
}
