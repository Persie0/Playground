package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p000.on9;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$MemoizingSupplier<T> implements on9, Serializable {

    /* JADX INFO: renamed from: a */
    public transient Object f13369a = new Object();

    /* JADX INFO: renamed from: b */
    public final on9 f13370b;

    /* JADX INFO: renamed from: c */
    public volatile transient boolean f13371c;

    /* JADX INFO: renamed from: d */
    public transient Object f13372d;

    public Suppliers$MemoizingSupplier(on9 on9Var) {
        on9Var.getClass();
        this.f13370b = on9Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f13369a = new Object();
    }

    @Override // p000.on9
    public final Object get() {
        if (!this.f13371c) {
            synchronized (this.f13369a) {
                try {
                    if (!this.f13371c) {
                        Object obj = this.f13370b.get();
                        this.f13372d = obj;
                        this.f13371c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f13372d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f13371c) {
            obj = "<supplier that returned " + this.f13372d + ">";
        } else {
            obj = this.f13370b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
