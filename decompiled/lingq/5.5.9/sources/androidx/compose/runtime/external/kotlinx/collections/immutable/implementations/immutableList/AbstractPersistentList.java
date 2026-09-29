package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p126g0.InterfaceC5631a;
import p126g0.InterfaceC5633c;
import tl.AbstractC9313a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends AbstractC9313a<E> implements InterfaceC5633c<E> {

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$removeAll$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m13365d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class C04811 extends Lambda implements InterfaceC2052l<E, Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collection<E> f3187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04811(Collection<? extends E> collection) {
            super(1);
            this.f3187b = collection;
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Boolean mo528n(Object obj) {
            return Boolean.valueOf(this.f3187b.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, p126g0.InterfaceC5633c
    public InterfaceC5633c<E> addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        PersistentVectorBuilder persistentVectorBuilderMo1848j = mo1848j();
        persistentVectorBuilderMo1848j.addAll(collection);
        return persistentVectorBuilderMo1848j.m1836q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> collection) {
        C5207g.m11111f(collection, "elements");
        boolean z10 = true;
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    z10 = false;
                    break;
                }
            }
        }
        return z10;
    }

    @Override // tl.AbstractC9313a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? mo1845M(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> removeAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        return mo1846T(new C04811(collection));
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final List subList(int i10, int i11) {
        return new InterfaceC5631a.a(this, i10, i11);
    }
}
