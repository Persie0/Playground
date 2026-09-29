package kotlin;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.cs4;
import p000.e65;
import p000.gr7;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class SafePublicationLazyImpl<T> implements cs4, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f47627c = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public volatile ui3 f47628a;

    /* JADX INFO: renamed from: b */
    public volatile Object f47629b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p000.cs4
    public final Object getValue() {
        Object obj = this.f47629b;
        if (obj != gr7.f41241f) {
            return obj;
        }
        ui3 ui3Var = this.f47628a;
        if (ui3Var != null) {
            Object objMo0a = ui3Var.mo0a();
            if (e65.m10865A(f47627c, this, objMo0a)) {
                this.f47628a = null;
                return objMo0a;
            }
        }
        return this.f47629b;
    }

    @Override // p000.cs4
    public final boolean isInitialized() {
        return this.f47629b != gr7.f41241f;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
