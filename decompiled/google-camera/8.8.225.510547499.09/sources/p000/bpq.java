package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class bpq implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final bzq f4096a = cao.f4920a;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpq clone() {
        try {
            return (bpq) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof bpq) {
            return cbi.m3389j(this.f4096a, ((bpq) obj).f4096a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4096a.hashCode();
    }
}
