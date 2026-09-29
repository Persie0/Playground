package p000;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qr1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f58099a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public abstract Object mo18287a(pr1 pr1Var);

    public final boolean equals(Object obj) {
        if (obj instanceof qr1) {
            return fa4.m11650l(this.f58099a, ((qr1) obj).f58099a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58099a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f58099a + ')';
    }
}
