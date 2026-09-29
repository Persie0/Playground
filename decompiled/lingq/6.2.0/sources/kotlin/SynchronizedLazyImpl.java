package kotlin;

import java.io.Serializable;
import p000.cs4;
import p000.gr7;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class SynchronizedLazyImpl<T> implements cs4, Serializable {

    /* JADX INFO: renamed from: a */
    public ui3 f47630a;

    /* JADX INFO: renamed from: b */
    public volatile Object f47631b;

    /* JADX INFO: renamed from: c */
    public final Object f47632c;

    public SynchronizedLazyImpl(ui3 ui3Var) {
        ui3Var.getClass();
        this.f47630a = ui3Var;
        this.f47631b = gr7.f41241f;
        this.f47632c = this;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // p000.cs4
    public final Object getValue() {
        Object objMo0a;
        Object obj = this.f47631b;
        gr7 gr7Var = gr7.f41241f;
        if (obj != gr7Var) {
            return obj;
        }
        synchronized (this.f47632c) {
            objMo0a = this.f47631b;
            if (objMo0a == gr7Var) {
                ui3 ui3Var = this.f47630a;
                ui3Var.getClass();
                objMo0a = ui3Var.mo0a();
                this.f47631b = objMo0a;
                this.f47630a = null;
            }
        }
        return objMo0a;
    }

    @Override // p000.cs4
    public final boolean isInitialized() {
        return this.f47631b != gr7.f41241f;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
