package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class mtk extends mti implements List {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ mtm f41596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtk(mtm mtmVar, Object obj, List list, mti mtiVar) {
        super(mtmVar, obj, list, mtiVar);
        this.f41596f = mtmVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m16893b();
        boolean zIsEmpty = this.f41591b.isEmpty();
        m16896d().add(i, obj);
        mtm.m16897l(this.f41596f);
        if (zIsEmpty) {
            m16892a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = m16896d().addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        mtm.m16899n(this.f41596f, this.f41591b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        m16892a();
        return true;
    }

    /* JADX INFO: renamed from: d */
    final List m16896d() {
        return (List) this.f41591b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m16893b();
        return m16896d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m16893b();
        return m16896d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m16893b();
        return m16896d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m16893b();
        return new mtj(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m16893b();
        Object objRemove = m16896d().remove(i);
        mtm.m16898m(this.f41596f);
        m16894c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m16893b();
        return m16896d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m16893b();
        mtm mtmVar = this.f41596f;
        Object obj = this.f41590a;
        List listSubList = m16896d().subList(i, i2);
        mti mtiVar = this.f41592c;
        if (mtiVar == null) {
            mtiVar = this;
        }
        return mtmVar.m16903g(obj, listSubList, mtiVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m16893b();
        return new mtj(this, i);
    }
}
