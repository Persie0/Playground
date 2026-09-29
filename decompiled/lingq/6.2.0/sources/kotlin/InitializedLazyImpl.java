package kotlin;

import java.io.Serializable;
import p000.cs4;

/* JADX INFO: loaded from: classes2.dex */
public final class InitializedLazyImpl<T> implements cs4, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f47622a;

    public InitializedLazyImpl(Object obj) {
        this.f47622a = obj;
    }

    @Override // p000.cs4
    public final Object getValue() {
        return this.f47622a;
    }

    @Override // p000.cs4
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f47622a);
    }
}
