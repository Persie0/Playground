package p000;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o5c extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final int f53874a;

    public o5c(Exception exc) {
        super(exc, null);
        this.f53874a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == o5c.class) {
            if (this == obj) {
                return true;
            }
            o5c o5cVar = (o5c) obj;
            if (this.f53874a == o5cVar.f53874a && get() == o5cVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f53874a;
    }
}
