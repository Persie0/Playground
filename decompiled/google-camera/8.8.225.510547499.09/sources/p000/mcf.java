package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcf {

    /* JADX INFO: renamed from: a */
    public final lzb f39935a;

    /* JADX INFO: renamed from: b */
    public final lxm f39936b;

    /* JADX INFO: renamed from: c */
    public final mau f39937c;

    public mcf(lzb lzbVar, lxm lxmVar, mau mauVar) {
        lzbVar.getClass();
        lxmVar.getClass();
        mauVar.getClass();
        this.f39935a = lzbVar;
        this.f39936b = lxmVar;
        this.f39937c = mauVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ mcf m16308a(mcf mcfVar, lzb lzbVar, lxm lxmVar, int i) {
        if ((i & 1) != 0) {
            lzbVar = mcfVar.f39935a;
        }
        mau mauVar = mcfVar.f39937c;
        lzbVar.getClass();
        lxmVar.getClass();
        return new mcf(lzbVar, lxmVar, mauVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcf)) {
            return false;
        }
        mcf mcfVar = (mcf) obj;
        return ooc.m18737c(this.f39935a, mcfVar.f39935a) && ooc.m18737c(this.f39936b, mcfVar.f39936b) && ooc.m18737c(this.f39937c, mcfVar.f39937c);
    }

    public final int hashCode() {
        return (((this.f39935a.hashCode() * 31) + this.f39936b.hashCode()) * 31) + this.f39937c.hashCode();
    }

    public final String toString() {
        return "AttachmentItem(resource=" + this.f39935a + ", attachment=" + this.f39936b + ", logStarter=" + this.f39937c + ")";
    }
}
