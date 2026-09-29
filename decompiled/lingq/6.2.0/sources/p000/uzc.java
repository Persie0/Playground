package p000;

import com.google.android.gms.internal.vision.C1035t;
import com.google.android.gms.internal.vision.zzht;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class uzc extends AbstractList implements yqc, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final C1035t f64633a;

    public uzc(C1035t c1035t) {
        this.f64633a = c1035t;
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: R */
    public final void mo5747R(zzht zzhtVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: b */
    public final yqc mo5749b() {
        return this;
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: e */
    public final List mo5750e() {
        return Collections.unmodifiableList(this.f64633a.f12243b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f64633a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dga dgaVar = new dga(3);
        dgaVar.f35631b = this.f64633a.iterator();
        return dgaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        cga cgaVar = new cga(3);
        cgaVar.f10032b = this.f64633a.listIterator(i);
        return cgaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64633a.size();
    }

    @Override // p000.yqc
    /* JADX INFO: renamed from: z */
    public final Object mo5751z(int i) {
        return this.f64633a.f12243b.get(i);
    }
}
