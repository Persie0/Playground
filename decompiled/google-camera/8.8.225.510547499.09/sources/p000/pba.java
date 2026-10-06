package p000;

import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pba extends oko implements RandomAccess {

    /* JADX INFO: renamed from: c */
    public static final lku f47307c = new lku();

    /* JADX INFO: renamed from: a */
    public final pax[] f47308a;

    /* JADX INFO: renamed from: b */
    public final int[] f47309b;

    public pba(pax[] paxVarArr, int[] iArr) {
        this.f47308a = paxVarArr;
        this.f47309b = iArr;
    }

    @Override // p000.okj
    /* JADX INFO: renamed from: a */
    public final int mo18591a() {
        return this.f47308a.length;
    }

    @Override // p000.okj, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof pax) {
            return super.contains((pax) obj);
        }
        return false;
    }

    @Override // p000.oko, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f47308a[i];
    }

    @Override // p000.oko, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof pax) {
            return super.indexOf((pax) obj);
        }
        return -1;
    }

    @Override // p000.oko, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof pax) {
            return super.lastIndexOf((pax) obj);
        }
        return -1;
    }
}
