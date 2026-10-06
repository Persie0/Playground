package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mrg implements Serializable, mrf {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    private final mrf f41465a;

    /* JADX INFO: renamed from: b */
    private final mrf f41466b;

    public mrg(mrf mrfVar, mrf mrfVar2) {
        this.f41465a = mrfVar;
        mrfVar2.getClass();
        this.f41466b = mrfVar2;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        return this.f41465a.apply(this.f41466b.apply(obj));
    }

    @Override // p000.mrf
    public final boolean equals(Object obj) {
        if (obj instanceof mrg) {
            mrg mrgVar = (mrg) obj;
            if (this.f41466b.equals(mrgVar.f41466b) && this.f41465a.equals(mrgVar.f41465a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41466b.hashCode() ^ this.f41465a.hashCode();
    }

    public final String toString() {
        return this.f41465a + "(" + this.f41466b + ")";
    }
}
