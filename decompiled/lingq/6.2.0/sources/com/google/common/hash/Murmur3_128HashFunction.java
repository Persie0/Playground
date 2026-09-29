package com.google.common.hash;

import java.io.Serializable;
import p000.wyc;

/* JADX INFO: loaded from: classes2.dex */
final class Murmur3_128HashFunction extends wyc implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final wyc f13485a = new Murmur3_128HashFunction();

    static {
        int i = AbstractC1108b.f13487a;
    }

    @Override // p000.wyc
    /* JADX INFO: renamed from: b */
    public final C1109c mo6355b() {
        return new C1109c();
    }

    public final boolean equals(Object obj) {
        return obj instanceof Murmur3_128HashFunction;
    }

    public final int hashCode() {
        return Murmur3_128HashFunction.class.hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
