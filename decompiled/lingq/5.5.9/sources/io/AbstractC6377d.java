package io;

import dm.C5207g;

/* JADX INFO: renamed from: io.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6377d<K, T> extends AbstractC6374a<K, T> {

    /* JADX INFO: renamed from: a */
    public AbstractC6375b<T> f36779a;

    public AbstractC6377d() {
        C6380g c6380g = C6380g.f36783a;
        C5207g.m11109d(c6380g, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this.f36779a = c6380g;
    }

    @Override // io.AbstractC6374a
    /* JADX INFO: renamed from: a */
    public final AbstractC6375b<T> mo13005a() {
        return this.f36779a;
    }
}
