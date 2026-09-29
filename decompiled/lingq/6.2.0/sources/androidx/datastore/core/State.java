package androidx.datastore.core;

import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public abstract class State<T> {
    private final int version;

    private State(int i) {
        this.version = i;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ State(int i, y52 y52Var) {
        this(i);
    }
}
