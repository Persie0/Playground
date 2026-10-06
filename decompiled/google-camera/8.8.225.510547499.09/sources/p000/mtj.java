package p000;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtj extends mth implements ListIterator {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mtk f41595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtj(mtk mtkVar) {
        super(mtkVar);
        this.f41595d = mtkVar;
    }

    /* JADX INFO: renamed from: b */
    private final ListIterator m16895b() {
        m16891a();
        return (ListIterator) this.f41587a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f41595d.isEmpty();
        m16895b().add(obj);
        mtm.m16897l(this.f41595d.f41596f);
        if (zIsEmpty) {
            this.f41595d.m16892a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m16895b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m16895b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m16895b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m16895b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m16895b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtj(mtk mtkVar, int i) {
        super(mtkVar, mtkVar.m16896d().listIterator(i));
        this.f41595d = mtkVar;
    }
}
