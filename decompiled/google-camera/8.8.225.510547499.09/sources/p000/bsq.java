package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bsq implements Iterable {

    /* JADX INFO: renamed from: a */
    public final List f4346a;

    public bsq() {
        this(new ArrayList(2));
    }

    public bsq(List list) {
        this.f4346a = list;
    }

    /* JADX INFO: renamed from: b */
    public static bsp m3000b(cac cacVar) {
        return new bsp(cacVar, cba.f4943b);
    }

    /* JADX INFO: renamed from: a */
    final int m3001a() {
        return this.f4346a.size();
    }

    /* JADX INFO: renamed from: c */
    final bsq m3002c() {
        return new bsq(new ArrayList(this.f4346a));
    }

    /* JADX INFO: renamed from: d */
    final boolean m3003d(cac cacVar) {
        return this.f4346a.contains(m3000b(cacVar));
    }

    /* JADX INFO: renamed from: e */
    final boolean m3004e() {
        return this.f4346a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4346a.iterator();
    }
}
