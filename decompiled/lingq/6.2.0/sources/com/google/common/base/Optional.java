package com.google.common.base;

import java.io.Serializable;
import p000.on9;

/* JADX INFO: loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    /* JADX INFO: renamed from: a */
    public static Optional m6262a() {
        return Absent.f13366a;
    }

    /* JADX INFO: renamed from: d */
    public static Optional m6263d(Object obj) {
        obj.getClass();
        return new Present(obj);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo6258b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo6259c();

    /* JADX INFO: renamed from: e */
    public abstract Object mo6260e(on9 on9Var);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract Object mo6261f();

    public abstract int hashCode();
}
