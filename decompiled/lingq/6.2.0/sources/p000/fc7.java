package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fc7 {

    /* JADX INFO: renamed from: a */
    public final boolean f38849a;

    /* JADX INFO: renamed from: b */
    public final int f38850b;

    /* JADX INFO: renamed from: c */
    public final long f38851c;

    public fc7(int i, long j, boolean z) {
        this.f38849a = z;
        this.f38850b = i;
        this.f38851c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc7)) {
            return false;
        }
        fc7 fc7Var = (fc7) obj;
        return this.f38849a == fc7Var.f38849a && this.f38850b == fc7Var.f38850b && this.f38851c == fc7Var.f38851c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38851c) + wq1.m24106b(this.f38850b, Boolean.hashCode(this.f38849a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerServiceState(playWhenReady=");
        sb.append(this.f38849a);
        sb.append(", playbackState=");
        sb.append(this.f38850b);
        sb.append(", currentPosition=");
        return wq1.m24113i(this.f38851c, ")", sb);
    }
}
