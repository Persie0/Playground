package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q04 {

    /* JADX INFO: renamed from: a */
    public final p04 f57069a;

    /* JADX INFO: renamed from: b */
    public final int f57070b;

    public q04(p04 p04Var, int i) {
        this.f57069a = p04Var;
        this.f57070b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q04)) {
            return false;
        }
        q04 q04Var = (q04) obj;
        return this.f57069a.equals(q04Var.f57069a) && this.f57070b == q04Var.f57070b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57070b) + (this.f57069a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f57069a);
        sb.append(", configFlags=");
        return wq1.m24122r(sb, this.f57070b, ')');
    }
}
