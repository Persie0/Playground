package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjb extends mvm implements List, kba {

    /* JADX INFO: renamed from: a */
    private final ArrayList f5914a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private boolean f5915b;

    @Override // p000.mvl, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f5914a;
    }

    @Override // p000.mvm, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        lku.m15613H(!this.f5915b);
        this.f5914a.add(i, (kba) obj);
    }

    @Override // p000.mvm, java.util.List
    public final boolean addAll(int i, Collection collection) {
        lku.m15613H(!this.f5915b);
        return this.f5914a.addAll(i, collection);
    }

    @Override // p000.mvm, p000.mvl
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Collection mo3817b() {
        return this.f5914a;
    }

    @Override // p000.mvm
    /* JADX INFO: renamed from: c */
    protected final List mo3818c() {
        return this.f5914a;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f5915b) {
            return;
        }
        this.f5915b = true;
        ArrayList arrayList = this.f5914a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kba) arrayList.get(i)).close();
        }
        this.f5914a.clear();
    }

    @Override // p000.mvm, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        lku.m15613H(!this.f5915b);
        return (kba) this.f5914a.get(i);
    }

    @Override // p000.mvm, java.util.List
    public final int indexOf(Object obj) {
        lku.m15613H(!this.f5915b);
        return this.f5914a.indexOf(obj);
    }

    @Override // p000.mvm, java.util.List
    public final int lastIndexOf(Object obj) {
        lku.m15613H(!this.f5915b);
        return this.f5914a.lastIndexOf(obj);
    }

    @Override // p000.mvm, java.util.List
    public final ListIterator listIterator() {
        lku.m15613H(!this.f5915b);
        return this.f5914a.listIterator();
    }

    @Override // p000.mvm, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        lku.m15613H(!this.f5915b);
        return (kba) this.f5914a.remove(i);
    }

    @Override // p000.mvm, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        lku.m15613H(!this.f5915b);
        return (kba) this.f5914a.set(i, (kba) obj);
    }

    @Override // p000.mvm, java.util.List
    public final List subList(int i, int i2) {
        lku.m15613H(!this.f5915b);
        return this.f5914a.subList(i, i2);
    }

    @Override // p000.mvm, java.util.List
    public final ListIterator listIterator(int i) {
        lku.m15613H(!this.f5915b);
        return this.f5914a.listIterator(i);
    }
}
