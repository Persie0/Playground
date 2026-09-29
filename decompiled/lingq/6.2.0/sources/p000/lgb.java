package p000;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lgb extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final int f49647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mgb f49648b;

    public lgb(mgb mgbVar, int i) {
        this.f49648b = mgbVar;
        this.f49647a = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f49648b.f51309a, m16182d(), m16183f(), obj, this.f49647a == -1 ? mgb.f51308f : ngb.f52716b) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m16182d() {
        int i = this.f49647a;
        if (i == -1) {
            return 0;
        }
        return this.f49648b.f51310b[i];
    }

    /* JADX INFO: renamed from: f */
    public final int m16183f() {
        return this.f49648b.f51310b[this.f49647a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new kgb(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return m16183f() - m16182d();
    }
}
