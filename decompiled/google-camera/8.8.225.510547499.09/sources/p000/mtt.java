package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mtt implements mzl {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzl) {
            return mo17126a().equals(((mzl) obj).mo17126a());
        }
        return false;
    }

    public final int hashCode() {
        return mo17126a().hashCode();
    }

    public final String toString() {
        return mo17126a().toString();
    }
}
