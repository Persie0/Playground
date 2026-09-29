package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p000.cs4;
import p000.gr7;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
public final class UnsafeLazyImpl<T> implements cs4, Serializable {

    /* JADX INFO: renamed from: a */
    public ui3 f47636a;

    /* JADX INFO: renamed from: b */
    public Object f47637b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p000.cs4
    public final Object getValue() {
        if (this.f47637b == gr7.f41241f) {
            ui3 ui3Var = this.f47636a;
            ui3Var.getClass();
            this.f47637b = ui3Var.mo0a();
            this.f47636a = null;
        }
        return this.f47637b;
    }

    @Override // p000.cs4
    public final boolean isInitialized() {
        return this.f47637b != gr7.f41241f;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
