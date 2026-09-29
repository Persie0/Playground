package p000;

import com.google.android.gms.internal.clearcut.C0950c;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class l4c extends AbstractList implements lvb, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final C0950c f49057a;

    public l4c(C0950c c0950c) {
        this.f49057a = c0950c;
    }

    @Override // p000.lvb
    /* JADX INFO: renamed from: W */
    public final lvb mo5295W() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f49057a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dga dgaVar = new dga(2);
        dgaVar.f35631b = this.f49057a.iterator();
        return dgaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        cga cgaVar = new cga(2);
        cgaVar.f10032b = this.f49057a.listIterator(i);
        return cgaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49057a.size();
    }

    @Override // p000.lvb
    /* JADX INFO: renamed from: x */
    public final List mo5296x() {
        return Collections.unmodifiableList(this.f49057a.f11778b);
    }
}
