package com.google.common.collect;

import java.io.Serializable;
import p000.atb;
import p000.gj3;

/* JADX INFO: loaded from: classes.dex */
final class ByFunctionOrdering<F, T> extends AbstractC1104t implements Serializable {

    /* JADX INFO: renamed from: a */
    public final gj3 f13383a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1104t f13384b;

    public ByFunctionOrdering(gj3 gj3Var, AbstractC1104t abstractC1104t) {
        gj3Var.getClass();
        this.f13383a = gj3Var;
        this.f13384b = abstractC1104t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        gj3 gj3Var = this.f13383a;
        return this.f13384b.compare(gj3Var.apply(obj), gj3Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.f13383a.equals(byFunctionOrdering.f13383a) && this.f13384b.equals(byFunctionOrdering.f13384b);
    }

    public final int hashCode() {
        return atb.m3038b(this.f13383a, this.f13384b);
    }

    public final String toString() {
        return this.f13384b + ".onResultOf(" + this.f13383a + ")";
    }
}
