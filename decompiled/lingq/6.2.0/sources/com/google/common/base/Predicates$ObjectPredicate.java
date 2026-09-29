package com.google.common.base;

import p000.li7;

/* JADX INFO: loaded from: classes2.dex */
enum Predicates$ObjectPredicate implements li7 {
    ALWAYS_TRUE { // from class: com.google.common.base.Predicates$ObjectPredicate.1
        @Override // com.google.common.base.Predicates$ObjectPredicate, p000.li7
        public boolean apply(Object obj) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Predicates.alwaysTrue()";
        }
    },
    ALWAYS_FALSE { // from class: com.google.common.base.Predicates$ObjectPredicate.2
        @Override // com.google.common.base.Predicates$ObjectPredicate, p000.li7
        public boolean apply(Object obj) {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Predicates.alwaysFalse()";
        }
    },
    IS_NULL { // from class: com.google.common.base.Predicates$ObjectPredicate.3
        @Override // com.google.common.base.Predicates$ObjectPredicate, p000.li7
        public boolean apply(Object obj) {
            return obj == null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Predicates.isNull()";
        }
    },
    NOT_NULL { // from class: com.google.common.base.Predicates$ObjectPredicate.4
        @Override // com.google.common.base.Predicates$ObjectPredicate, p000.li7
        public boolean apply(Object obj) {
            return obj != null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Predicates.notNull()";
        }
    };

    @Override // p000.li7
    public abstract /* synthetic */ boolean apply(Object obj);

    public <T> li7 withNarrowedType() {
        return this;
    }
}
