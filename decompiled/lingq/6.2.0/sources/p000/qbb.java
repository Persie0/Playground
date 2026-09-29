package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qbb {

    /* JADX INFO: renamed from: a */
    public final pbb f57547a;

    /* JADX INFO: renamed from: b */
    public final ui3 f57548b;

    public qbb(pbb pbbVar, ui3 ui3Var) {
        ui3Var.getClass();
        this.f57547a = pbbVar;
        this.f57548b = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbb)) {
            return false;
        }
        qbb qbbVar = (qbb) obj;
        return fa4.m11650l(this.f57547a, qbbVar.f57547a) && fa4.m11650l(this.f57548b, qbbVar.f57548b);
    }

    public final int hashCode() {
        pbb pbbVar = this.f57547a;
        return this.f57548b.hashCode() + ((pbbVar == null ? 0 : pbbVar.hashCode()) * 31);
    }

    public final String toString() {
        return "YoutubePlayerControl(action=" + this.f57547a + ", onConsumed=" + this.f57548b + ")";
    }
}
