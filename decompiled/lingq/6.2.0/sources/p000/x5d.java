package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x5d {

    /* JADX INFO: renamed from: a */
    public final z3d f67805a;

    /* JADX INFO: renamed from: b */
    public final xp7 f67806b;

    public x5d(z3d z3dVar, xp7 xp7Var) {
        this.f67805a = z3dVar;
        this.f67806b = xp7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x5d) {
            x5d x5dVar = (x5d) obj;
            z3d z3dVar = x5dVar.f67805a;
            z3d z3dVar2 = this.f67805a;
            if (z3dVar2 != null ? z3dVar2 == z3dVar : z3dVar == null) {
                return this.f67806b == x5dVar.f67806b;
            }
        }
        return false;
    }

    public final int hashCode() {
        z3d z3dVar = this.f67805a;
        return this.f67806b.hashCode() ^ (((z3dVar == null ? 0 : z3dVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f67805a);
        String string = this.f67806b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        AbstractC3393o1.m17725C(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
