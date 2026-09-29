package com.google.common.base;

import java.io.Serializable;
import p000.atb;
import p000.gj3;

/* JADX INFO: loaded from: classes2.dex */
class Functions$ConstantFunction<E> implements gj3, Serializable {
    @Override // p000.gj3
    public final Object apply(Object obj) {
        return null;
    }

    @Override // p000.gj3
    public final boolean equals(Object obj) {
        if (obj instanceof Functions$ConstantFunction) {
            return atb.m3037a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}
