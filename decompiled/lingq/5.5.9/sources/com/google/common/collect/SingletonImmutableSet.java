package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: d */
    public final transient E f16142d;

    public SingletonImmutableSet(E e10) {
        e10.getClass();
        this.f16142d = e10;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: C */
    public final AbstractC3187f0<E> iterator() {
        return new C3195n(this.f16142d);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: a */
    public final ImmutableList<E> mo9049a() {
        return ImmutableList.m9064b0(this.f16142d);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16142d.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f16142d.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: l */
    public final int mo9050l(int i10, Object[] objArr) {
        objArr[i10] = this.f16142d;
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f16142d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: y */
    public final boolean mo9054y() {
        return false;
    }
}
