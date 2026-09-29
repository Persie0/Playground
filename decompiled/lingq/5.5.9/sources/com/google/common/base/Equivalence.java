package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final Equals f15978a = new Equals();

        private Object readResolve() {
            return f15978a;
        }

        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: a */
        public final boolean mo9013a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: b */
        public final int mo9014b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final Identity f15979a = new Identity();

        private Object readResolve() {
            return f15979a;
        }

        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: a */
        public final boolean mo9013a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: b */
        public final int mo9014b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Equivalence<Object> m9011c() {
        return Equals.f15978a;
    }

    /* JADX INFO: renamed from: e */
    public static Equivalence<Object> m9012e() {
        return Identity.f15979a;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo9013a(T t10, T t11);

    /* JADX INFO: renamed from: b */
    public abstract int mo9014b(T t10);

    /* JADX INFO: renamed from: d */
    public final boolean m9015d(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return mo9013a(t10, t11);
    }
}
