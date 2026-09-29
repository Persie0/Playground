package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000.AbstractC3022g1;
import p000.op5;

/* JADX INFO: loaded from: classes.dex */
public final class SetBuilder<E> extends AbstractC3022g1 implements Set<E>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final SetBuilder f47676b = new SetBuilder(MapBuilder.f47659I);

    /* JADX INFO: renamed from: a */
    public final MapBuilder f47677a;

    public SetBuilder() {
        this.f47677a = new MapBuilder();
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f47677a.f47660H) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f47677a.m15391a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.f47677a.m15393c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47677a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47677a.containsKey(obj);
    }

    @Override // p000.AbstractC3022g1
    /* JADX INFO: renamed from: d */
    public final int mo12276d() {
        return this.f47677a.f47669i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47677a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.f47677a;
        mapBuilder.getClass();
        return new op5(mapBuilder, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.f47677a;
        mapBuilder.m15393c();
        int iM15397g = mapBuilder.m15397g(obj);
        if (iM15397g < 0) {
            return false;
        }
        mapBuilder.m15401k(iM15397g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f47677a.m15393c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f47677a.m15393c();
        return super.retainAll(collection);
    }

    public SetBuilder(MapBuilder mapBuilder) {
        mapBuilder.getClass();
        this.f47677a = mapBuilder;
    }

    public SetBuilder(int i) {
        this.f47677a = new MapBuilder(i);
    }
}
