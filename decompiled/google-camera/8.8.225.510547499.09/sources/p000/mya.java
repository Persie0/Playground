package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mya extends nas {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mrf f41794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mya(Iterator it, mrf mrfVar) {
        super(it);
        this.f41794a = mrfVar;
    }

    @Override // p000.nas
    /* JADX INFO: renamed from: a */
    public final Object mo17158a(Object obj) {
        return this.f41794a.apply(obj);
    }
}
