package p000;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nef extends AbstractSet {

    /* JADX INFO: renamed from: a */
    final int f42093a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ neg f42094b;

    public nef(neg negVar, int i) {
        this.f42094b = negVar;
        this.f42093a = i;
    }

    /* JADX INFO: renamed from: a */
    final int m17407a() {
        return this.f42094b.f42097c[this.f42093a + 1];
    }

    /* JADX INFO: renamed from: b */
    final int m17408b() {
        int i = this.f42093a;
        if (i == -1) {
            return 0;
        }
        return this.f42094b.f42097c[i];
    }

    /* JADX INFO: renamed from: c */
    final Object m17409c(int i) {
        return this.f42094b.f42096b[m17408b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f42094b.f42096b, m17408b(), m17407a(), obj, this.f42093a == -1 ? neg.f42095a : nei.f42106a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new nee(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return m17407a() - m17408b();
    }
}
