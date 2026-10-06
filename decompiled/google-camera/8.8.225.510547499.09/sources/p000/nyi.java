package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyi extends nwf implements RandomAccess, nyj {

    /* JADX INFO: renamed from: b */
    private static final nyi f45020b;

    /* JADX INFO: renamed from: c */
    private final List f45021c;

    static {
        nyi nyiVar = new nyi(10);
        f45020b = nyiVar;
        nyiVar.mo17769b();
    }

    public nyi() {
        this(10);
    }

    /* JADX INFO: renamed from: j */
    private static String m18173j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof nwr ? ((nwr) obj).m17807y() : nxz.m18155d((byte[]) obj);
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m17771cA();
        this.f45021c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m17771cA();
        if (collection instanceof nyj) {
            collection = ((nyj) collection).mo18177h();
        }
        boolean zAddAll = this.f45021c.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m17771cA();
        this.f45021c.clear();
        this.modCount++;
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: d */
    public final nyj mo18174d() {
        return this.f44821a ? new oab(this) : this;
    }

    @Override // p000.nxy
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ nxy mo17775e(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f45021c);
        return new nyi(arrayList);
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: f */
    public final Object mo18175f(int i) {
        return this.f45021c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.f45021c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof nwr) {
            nwr nwrVar = (nwr) obj;
            String strM17807y = nwrVar.m17807y();
            if (nwrVar.mo17795p()) {
                this.f45021c.set(i, strM17807y);
            }
            return strM17807y;
        }
        byte[] bArr = (byte[]) obj;
        String strM18155d = nxz.m18155d(bArr);
        lij lijVar = oai.f45130a;
        if (lij.m15412U(bArr, 0, bArr.length)) {
            this.f45021c.set(i, strM18155d);
        }
        return strM18155d;
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: h */
    public final List mo18177h() {
        return Collections.unmodifiableList(this.f45021c);
    }

    @Override // p000.nyj
    /* JADX INFO: renamed from: i */
    public final void mo18178i(nwr nwrVar) {
        m17771cA();
        this.f45021c.add(nwrVar);
        this.modCount++;
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m17771cA();
        Object objRemove = this.f45021c.remove(i);
        this.modCount++;
        return m18173j(objRemove);
    }

    @Override // p000.nwf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m17771cA();
        return m18173j(this.f45021c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45021c.size();
    }

    public nyi(int i) {
        this(new ArrayList(i));
    }

    private nyi(ArrayList arrayList) {
        this.f45021c = arrayList;
    }

    @Override // p000.nwf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
