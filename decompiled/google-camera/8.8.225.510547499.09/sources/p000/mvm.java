package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mvm extends mvl implements List {
    protected mvm() {
    }

    public void add(int i, Object obj) {
        mo3818c().add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return mo3818c().addAll(i, collection);
    }

    @Override // p000.mvl
    /* JADX INFO: renamed from: b */
    protected /* bridge */ /* synthetic */ Collection mo3817b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected abstract List mo3818c();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || mo3818c().equals(obj);
    }

    public Object get(int i) {
        return mo3818c().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return mo3818c().hashCode();
    }

    public int indexOf(Object obj) {
        return mo3818c().indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return mo3818c().lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return mo3818c().listIterator();
    }

    public Object remove(int i) {
        return mo3818c().remove(i);
    }

    public Object set(int i, Object obj) {
        return mo3818c().set(i, obj);
    }

    public List subList(int i, int i2) {
        return mo3818c().subList(i, i2);
    }

    public ListIterator listIterator(int i) {
        return mo3818c().listIterator(i);
    }
}
