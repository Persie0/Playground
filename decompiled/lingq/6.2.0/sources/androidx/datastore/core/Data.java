package androidx.datastore.core;

import p000.C3386nv;

/* JADX INFO: loaded from: classes.dex */
public final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t, int i, int i2) {
        super(i2, null);
        this.value = t;
        this.hashCode = i;
    }

    public final void checkHashCode() {
        T t = this.value;
        if ((t != null ? t.hashCode() : 0) == this.hashCode) {
            return;
        }
        C3386nv.m17633t("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
