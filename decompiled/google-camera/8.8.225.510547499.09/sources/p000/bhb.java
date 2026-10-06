package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhb {

    /* JADX INFO: renamed from: a */
    public final Object f3263a;

    /* JADX INFO: renamed from: b */
    public final Throwable f3264b;

    public bhb(Object obj) {
        this.f3263a = obj;
        this.f3264b = null;
    }

    public bhb(Throwable th) {
        this.f3264b = th;
        this.f3263a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhb)) {
            return false;
        }
        bhb bhbVar = (bhb) obj;
        Object obj2 = this.f3263a;
        if (obj2 != null && obj2.equals(bhbVar.f3263a)) {
            return true;
        }
        Throwable th = this.f3264b;
        if (th == null || bhbVar.f3264b == null) {
            return false;
        }
        return th.toString().equals(this.f3264b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3263a, this.f3264b});
    }
}
