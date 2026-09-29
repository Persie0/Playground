package com.google.common.collect;

import java.util.Iterator;
import p000.bga;
import p000.tgd;

/* JADX INFO: loaded from: classes.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: d */
    public final transient Object f13443d;

    public SingletonImmutableSet(Object obj) {
        obj.getClass();
        this.f13443d = obj;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13443d.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final ImmutableList mo6273d() {
        return ImmutableList.m6291y(this.f13443d);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: f */
    public final int mo6274f(Object[] objArr, int i) {
        objArr[i] = this.f13443d;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13443d.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return tgd.m22033c(this.f13443d);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final boolean mo6278j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: k */
    public final bga iterator() {
        return tgd.m22033c(this.f13443d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f13443d.toString() + ']';
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
