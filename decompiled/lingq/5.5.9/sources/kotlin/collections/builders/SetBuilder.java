package kotlin.collections.builders;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import tl.AbstractC9317e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\t\b\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\n"}, m13365d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Ltl/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "<init>", "()V", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SetBuilder<E> extends AbstractC9317e<E> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final MapBuilder<E, ?> f38078a;

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        this.f38078a = mapBuilder;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f38078a.f38069l) {
            return new SerializedCollection(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // tl.AbstractC9317e
    /* JADX INFO: renamed from: a */
    public final int mo12619a() {
        return this.f38078a.f38065h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.f38078a.m13402a(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        this.f38078a.m13403b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f38078a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f38078a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f38078a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f38078a;
        mapBuilder.getClass();
        return new MapBuilder.C6750e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f38078a;
        mapBuilder.m13403b();
        int iM13407k = mapBuilder.m13407k(obj);
        if (iM13407k < 0) {
            iM13407k = -1;
        } else {
            mapBuilder.m13410q(iM13407k);
        }
        return iM13407k >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        this.f38078a.m13403b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        this.f38078a.m13403b();
        return super.retainAll(collection);
    }
}
