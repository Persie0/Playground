package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class msl implements Serializable, msi {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final Object f41551a;

    public msl(Object obj) {
        this.f41551a = obj;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        return this.f41551a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof msl) {
            return mpw.m16768g(this.f41551a, ((msl) obj).f41551a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41551a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f41551a + ")";
    }
}
