package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltw {

    /* JADX INFO: renamed from: a */
    public final nyw f39202a;

    /* JADX INFO: renamed from: b */
    public final nxf f39203b;

    public ltw(nyw nywVar, nxf nxfVar) {
        if (nywVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.f39202a = nywVar;
        if (nxfVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.f39203b = nxfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ltw) {
            ltw ltwVar = (ltw) obj;
            if (this.f39202a.equals(ltwVar.f39202a) && this.f39203b.equals(ltwVar.f39203b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39202a.hashCode() ^ 1000003) * 1000003) ^ this.f39203b.hashCode();
    }

    public final String toString() {
        return "ProtoSerializer{defaultValue=" + this.f39202a.toString() + ", extensionRegistryLite=" + this.f39203b.toString() + "}";
    }

    public ltw() {
    }
}
