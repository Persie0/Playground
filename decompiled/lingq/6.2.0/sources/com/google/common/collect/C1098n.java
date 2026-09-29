package com.google.common.collect;

import java.util.Objects;
import p000.b14;

/* JADX INFO: renamed from: com.google.common.collect.n */
/* JADX INFO: loaded from: classes.dex */
public class C1098n extends b14 {
    @Override // p000.b14
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1098n mo3156a(Object obj) {
        obj.getClass();
        m3157b(obj);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public ImmutableSet mo6343h() {
        int i = this.f7759b;
        if (i == 0) {
            int i2 = ImmutableSet.f13401c;
            return RegularImmutableSet.f13433j;
        }
        Object[] objArr = this.f7758a;
        if (i != 1) {
            ImmutableSet immutableSetM6307m = ImmutableSet.m6307m(objArr, i);
            this.f7759b = immutableSetM6307m.size();
            this.f7760c = true;
            return immutableSetM6307m;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = ImmutableSet.f13401c;
        return new SingletonImmutableSet(obj);
    }
}
