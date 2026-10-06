package p000;

import java.util.Set;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxi {

    /* JADX INFO: renamed from: a */
    public final Set f23797a;

    public fxi(Set set) {
        this.f23797a = mxk.m17134F(set);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof fxi) && Objects.equals(this.f23797a, ((fxi) obj).f23797a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f23797a);
    }
}
