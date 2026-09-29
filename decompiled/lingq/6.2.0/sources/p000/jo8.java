package p000;

import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jo8 {

    /* JADX INFO: renamed from: b */
    public static final jo8 f45921b;

    /* JADX INFO: renamed from: a */
    public final ImmutableSet f45922a;

    static {
        vj6 vj6Var = new vj6(27);
        vj6Var.f65506b = ImmutableSet.m6307m(new Object[]{1, 5}, 2);
        f45921b = new jo8(vj6Var);
    }

    public jo8(vj6 vj6Var) {
        this.f45922a = (ImmutableSet) vj6Var.f65506b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jo8) && this.f45922a.equals(((jo8) obj).f45922a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f45922a, null, null, bool, bool, bool, bool, bool);
    }
}
