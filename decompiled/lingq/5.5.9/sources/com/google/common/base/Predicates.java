package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import p482xd.InterfaceC10173e;

/* JADX INFO: loaded from: classes.dex */
public final class Predicates {

    public static class AndPredicate<T> implements InterfaceC10173e<T>, Serializable {

        /* JADX INFO: renamed from: a */
        public final List<? extends InterfaceC10173e<? super T>> f15980a;

        public AndPredicate() {
            throw null;
        }

        public AndPredicate(List list) {
            this.f15980a = list;
        }

        @Override // p482xd.InterfaceC10173e
        public final boolean apply(T t10) {
            int i10 = 0;
            while (true) {
                List<? extends InterfaceC10173e<? super T>> list = this.f15980a;
                if (i10 >= list.size()) {
                    return true;
                }
                if (!list.get(i10).apply(t10)) {
                    return false;
                }
                i10++;
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f15980a.equals(((AndPredicate) obj).f15980a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15980a.hashCode() + 306654252;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Predicates.and(");
            boolean z10 = true;
            for (T t10 : this.f15980a) {
                if (!z10) {
                    sb2.append(',');
                }
                sb2.append(t10);
                z10 = false;
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC10173e<T> m9016a(InterfaceC10173e<? super T> interfaceC10173e, InterfaceC10173e<? super T> interfaceC10173e2) {
        interfaceC10173e.getClass();
        return new AndPredicate(Arrays.asList(interfaceC10173e, interfaceC10173e2));
    }
}
