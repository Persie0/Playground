package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myl extends nat {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mym f41815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myl(mym mymVar, ListIterator listIterator) {
        super(listIterator);
        this.f41815a = mymVar;
    }

    @Override // p000.nas
    /* JADX INFO: renamed from: a */
    public final Object mo17158a(Object obj) {
        return this.f41815a.f41817b.apply(obj);
    }
}
