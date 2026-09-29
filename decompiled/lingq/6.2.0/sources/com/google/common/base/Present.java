package com.google.common.base;

import p000.on9;

/* JADX INFO: loaded from: classes2.dex */
final class Present<T> extends Optional<T> {

    /* JADX INFO: renamed from: a */
    public final Object f13368a;

    public Present(Object obj) {
        this.f13368a = obj;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: b */
    public final Object mo6258b() {
        return this.f13368a;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: c */
    public final boolean mo6259c() {
        return true;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: e */
    public final Object mo6260e(on9 on9Var) {
        throw null;
    }

    @Override // com.google.common.base.Optional
    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.f13368a.equals(((Present) obj).f13368a);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: f */
    public final Object mo6261f() {
        return this.f13368a;
    }

    @Override // com.google.common.base.Optional
    public final int hashCode() {
        return this.f13368a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f13368a + ")";
    }
}
