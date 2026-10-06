package p000;

import java.util.AbstractList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mri extends AbstractList {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object[] f41469a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f41470b = "#version 300 es";

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f41471c;

    public mri(Object[] objArr, Object obj) {
        this.f41469a = objArr;
        this.f41471c = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (i) {
            case 0:
                return this.f41470b;
            case 1:
                return this.f41471c;
            default:
                return this.f41469a[i - 2];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41469a.length + 2;
    }
}
