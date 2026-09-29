package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s30 extends iq1 {

    /* JADX INFO: renamed from: a */
    public final String f60222a;

    /* JADX INFO: renamed from: b */
    public final int f60223b;

    /* JADX INFO: renamed from: c */
    public final List f60224c;

    public s30(int i, String str, List list) {
        this.f60222a = str;
        this.f60223b = i;
        this.f60224c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iq1) {
            s30 s30Var = (s30) ((iq1) obj);
            if (this.f60222a.equals(s30Var.f60222a) && this.f60223b == s30Var.f60223b && this.f60224c.equals(s30Var.f60224c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f60224c.hashCode() ^ ((((this.f60222a.hashCode() ^ 1000003) * 1000003) ^ this.f60223b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.f60222a);
        sb.append(", importance=");
        sb.append(this.f60223b);
        sb.append(", frames=");
        return hn1.m13356f(sb, this.f60224c, "}");
    }
}
