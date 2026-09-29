package com.google.common.base;

import java.io.Serializable;
import java.util.List;
import p000.li7;

/* JADX INFO: loaded from: classes2.dex */
class Predicates$AndPredicate<T> implements li7, Serializable {

    /* JADX INFO: renamed from: a */
    public final List f13367a;

    public Predicates$AndPredicate(List list) {
        this.f13367a = list;
    }

    @Override // p000.li7
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f13367a;
            if (i >= list.size()) {
                return true;
            }
            if (!((li7) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Predicates$AndPredicate) {
            return this.f13367a.equals(((Predicates$AndPredicate) obj).f13367a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13367a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.f13367a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
