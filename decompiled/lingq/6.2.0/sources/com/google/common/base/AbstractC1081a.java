package com.google.common.base;

import java.util.Arrays;
import p000.gj3;
import p000.li7;

/* JADX INFO: renamed from: com.google.common.base.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1081a {
    /* JADX INFO: renamed from: a */
    public static li7 m6264a() {
        return Predicates$ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    /* JADX INFO: renamed from: b */
    public static li7 m6265b(li7 li7Var, li7 li7Var2) {
        li7Var.getClass();
        return new Predicates$AndPredicate(Arrays.asList(li7Var, li7Var2));
    }

    /* JADX INFO: renamed from: c */
    public static gj3 m6266c() {
        return new Functions$ConstantFunction();
    }
}
