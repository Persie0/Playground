package com.google.common.base;

import p000.on9;
import p000.uxc;

/* JADX INFO: loaded from: classes.dex */
final class Absent<T> extends Optional<T> {

    /* JADX INFO: renamed from: a */
    public static final Absent f13366a = new Absent();

    private Object readResolve() {
        return f13366a;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: b */
    public final Object mo6258b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: c */
    public final boolean mo6259c() {
        return false;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: e */
    public final Object mo6260e(on9 on9Var) {
        return ((uxc) on9Var).get();
    }

    @Override // com.google.common.base.Optional
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: f */
    public final Object mo6261f() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
