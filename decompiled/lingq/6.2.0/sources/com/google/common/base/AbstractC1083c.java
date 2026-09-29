package com.google.common.base;

import java.io.Serializable;
import p000.on9;
import p000.pn9;

/* JADX INFO: renamed from: com.google.common.base.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1083c {
    /* JADX INFO: renamed from: a */
    public static on9 m6269a(on9 on9Var) {
        if ((on9Var instanceof pn9) || (on9Var instanceof Suppliers$MemoizingSupplier)) {
            return on9Var;
        }
        return on9Var instanceof Serializable ? new Suppliers$MemoizingSupplier(on9Var) : new pn9(on9Var);
    }

    /* JADX INFO: renamed from: b */
    public static on9 m6270b(Object obj) {
        return new Suppliers$SupplierOfInstance(obj);
    }
}
