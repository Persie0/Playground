package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lxm {

    /* JADX INFO: renamed from: a */
    public final long f39511a;

    /* JADX INFO: renamed from: b */
    public final lvl f39512b;

    /* JADX INFO: renamed from: c */
    public final lvk f39513c;

    /* JADX INFO: renamed from: d */
    public final String f39514d;

    /* JADX INFO: renamed from: e */
    public final ocl f39515e;

    /* JADX INFO: renamed from: f */
    public final long f39516f;

    /* JADX INFO: renamed from: g */
    public final String f39517g;

    /* JADX INFO: renamed from: h */
    public final String f39518h;

    /* JADX INFO: renamed from: i */
    public final String f39519i;

    /* JADX INFO: renamed from: j */
    public final lxv f39520j;

    /* JADX INFO: renamed from: k */
    public final long f39521k;

    public lxm() {
        lvl lvlVar = lvl.ANNOTATION;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxm)) {
            return false;
        }
        lxm lxmVar = (lxm) obj;
        return this.f39511a == lxmVar.f39511a && this.f39512b == lxmVar.f39512b && ooc.m18737c(this.f39513c, lxmVar.f39513c) && ooc.m18737c(this.f39514d, lxmVar.f39514d) && ooc.m18737c(this.f39515e, lxmVar.f39515e) && this.f39516f == lxmVar.f39516f && ooc.m18737c(this.f39517g, lxmVar.f39517g) && ooc.m18737c(this.f39518h, lxmVar.f39518h) && ooc.m18737c(this.f39519i, lxmVar.f39519i) && ooc.m18737c(this.f39520j, lxmVar.f39520j) && this.f39521k == lxmVar.f39521k;
    }

    public final int hashCode() {
        int iM18134L;
        int iM15861f = (lqi.m15861f(this.f39511a) * 31) + this.f39512b.hashCode();
        lvk lvkVar = this.f39513c;
        int iHashCode = ((iM15861f * 31) + (lvkVar == null ? 0 : lvkVar.hashCode())) * 31;
        String str = this.f39514d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ocl oclVar = this.f39515e;
        if (oclVar == null) {
            iM18134L = 0;
        } else if (oclVar.m18142ac()) {
            iM18134L = oclVar.m18134L();
        } else {
            int iM18134L2 = oclVar.f44820aG;
            if (iM18134L2 == 0) {
                iM18134L2 = oclVar.m18134L();
                oclVar.f44820aG = iM18134L2;
            }
            iM18134L = iM18134L2;
        }
        int iM15861f2 = (((iHashCode2 + iM18134L) * 31) + lqi.m15861f(this.f39516f)) * 31;
        String str2 = this.f39517g;
        int iHashCode3 = (iM15861f2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39518h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39519i;
        return ((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f39520j.hashCode()) * 31) + lqi.m15861f(this.f39521k);
    }

    public final String toString() {
        return "AnnotachmentEntity(resourceOnDeviceId=" + this.f39511a + ", annotachmentType=" + this.f39512b + ", id=" + this.f39513c + ", contentType=" + this.f39514d + ", provenance=" + this.f39515e + ", onDeviceSize=" + this.f39516f + ", uploadTransferHandle=" + this.f39517g + ", blobstoreId=" + this.f39518h + ", contentHash=" + this.f39519i + ", status=" + this.f39520j + ", onDeviceId=" + this.f39521k + ")";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ lxm m16117a(lxm lxmVar, String str, String str2, lxv lxvVar, int i) {
        long j = (i & 1) != 0 ? lxmVar.f39511a : 0L;
        lvl lvlVar = (i & 2) != 0 ? lxmVar.f39512b : null;
        lvk lvkVar = (i & 4) != 0 ? lxmVar.f39513c : null;
        String str3 = (i & 8) != 0 ? lxmVar.f39514d : null;
        ocl oclVar = (i & 16) != 0 ? lxmVar.f39515e : null;
        long j2 = (i & 32) != 0 ? lxmVar.f39516f : 0L;
        String str4 = (i & 64) != 0 ? lxmVar.f39517g : str;
        String str5 = (i & 128) != 0 ? lxmVar.f39518h : str2;
        String str6 = (i & 256) != 0 ? lxmVar.f39519i : null;
        lxv lxvVar2 = (i & 512) != 0 ? lxmVar.f39520j : lxvVar;
        long j3 = lxmVar.f39521k;
        lvlVar.getClass();
        lxvVar2.getClass();
        return new lxm(j, lvlVar, lvkVar, str3, oclVar, j2, str4, str5, str6, lxvVar2, j3);
    }

    public lxm(long j, lvl lvlVar, lvk lvkVar, String str, ocl oclVar, long j2, String str2, String str3, String str4, lxv lxvVar, long j3) {
        lvlVar.getClass();
        this.f39511a = j;
        this.f39512b = lvlVar;
        this.f39513c = lvkVar;
        this.f39514d = str;
        this.f39515e = oclVar;
        this.f39516f = j2;
        this.f39517g = str2;
        this.f39518h = str3;
        this.f39519i = str4;
        this.f39520j = lxvVar;
        this.f39521k = j3;
    }
}
