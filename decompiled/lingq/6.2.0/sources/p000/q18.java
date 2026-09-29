package p000;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class q18 implements i99 {

    /* JADX INFO: renamed from: a */
    public final w89 f57131a;

    public q18(w89 w89Var) {
        this.f57131a = w89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q18) {
            return this.f57131a.equals(((q18) obj).f57131a);
        }
        return false;
    }

    @Override // p000.i99
    /* JADX INFO: renamed from: h */
    public final Object mo11204h(Continuation continuation) {
        return this.f57131a;
    }

    public final int hashCode() {
        return this.f57131a.hashCode();
    }
}
