package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class okq extends AbstractList implements List {
    protected okq() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo18594a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo18595b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo18595b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo18594a();
    }
}
