package com.google.common.base;

import java.io.Serializable;
import p000.atb;
import p000.on9;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$SupplierOfInstance<T> implements on9, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f13373a;

    public Suppliers$SupplierOfInstance(Object obj) {
        this.f13373a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return atb.m3037a(this.f13373a, ((Suppliers$SupplierOfInstance) obj).f13373a);
        }
        return false;
    }

    @Override // p000.on9
    public final Object get() {
        return this.f13373a;
    }

    public final int hashCode() {
        return atb.m3038b(this.f13373a);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f13373a + ")";
    }
}
