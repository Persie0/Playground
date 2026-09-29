package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p000.jq7;

/* JADX INFO: loaded from: classes.dex */
public final class Random$Default extends jq7 implements Serializable {

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final Serialized f47719a = new Serialized();

        private final Object readResolve() {
            return jq7.f46010a;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return Serialized.f47719a;
    }

    @Override // p000.jq7
    /* JADX INFO: renamed from: a */
    public final int mo14244a(int i) {
        return jq7.f46011b.mo14244a(i);
    }

    @Override // p000.jq7
    /* JADX INFO: renamed from: b */
    public final int mo14245b() {
        return jq7.f46011b.mo14245b();
    }

    @Override // p000.jq7
    /* JADX INFO: renamed from: c */
    public final int mo14353c(int i, int i2) {
        throw null;
    }
}
