package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ild {

    /* JADX INFO: renamed from: a */
    public final w5d f44282a;

    /* JADX INFO: renamed from: b */
    public final phb f44283b;

    public ild(w5d w5dVar, phb phbVar) {
        this.f44282a = w5dVar;
        if (phbVar != null) {
            this.f44283b = phbVar;
        } else {
            C3386nv.m17635v("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ild)) {
            return false;
        }
        ild ildVar = (ild) obj;
        return this.f44282a.equals(ildVar.f44282a) && this.f44283b.equals(ildVar.f44283b);
    }

    public final int hashCode() {
        return this.f44283b.hashCode() ^ ((this.f44282a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.f44282a.toString();
        int length = string.length();
        String string2 = this.f44283b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        AbstractC3393o1.m17725C(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }
}
