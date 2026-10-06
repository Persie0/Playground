package p000;

import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lzb implements lvu {

    /* JADX INFO: renamed from: a */
    public final String f39591a;

    /* JADX INFO: renamed from: b */
    public final String f39592b;

    /* JADX INFO: renamed from: c */
    public final List f39593c;

    /* JADX INFO: renamed from: d */
    public final nzw f39594d;

    /* JADX INFO: renamed from: e */
    public final nxd f39595e;

    /* JADX INFO: renamed from: f */
    public final long f39596f;

    /* JADX INFO: renamed from: g */
    public final String f39597g;

    /* JADX INFO: renamed from: h */
    public final String f39598h;

    /* JADX INFO: renamed from: i */
    public final nxd f39599i;

    /* JADX INFO: renamed from: j */
    public final nxd f39600j;

    /* JADX INFO: renamed from: k */
    public final nxd f39601k;

    /* JADX INFO: renamed from: l */
    public final nuw f39602l;

    /* JADX INFO: renamed from: m */
    public final boolean f39603m;

    /* JADX INFO: renamed from: n */
    public final List f39604n;

    /* JADX INFO: renamed from: o */
    public final String f39605o;

    /* JADX INFO: renamed from: p */
    public final String f39606p;

    /* JADX INFO: renamed from: q */
    public final ocm f39607q;

    /* JADX INFO: renamed from: r */
    public final ocl f39608r;

    /* JADX INFO: renamed from: s */
    public final nut f39609s;

    /* JADX INFO: renamed from: t */
    public final lxv f39610t;

    /* JADX INFO: renamed from: u */
    public final long f39611u;

    /* JADX INFO: renamed from: v */
    public final ojy f39612v;

    /* JADX INFO: renamed from: w */
    public final lvn f39613w;

    public lzb() {
        this(null, null, null, null, null, 0L, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0L, 4194303);
    }

    public lzb(String str, String str2, List list, nzw nzwVar, nxd nxdVar, long j, String str3, String str4, lvn lvnVar, nxd nxdVar2, nxd nxdVar3, nxd nxdVar4, nuw nuwVar, boolean z, List list2, String str5, String str6, ocm ocmVar, ocl oclVar, nut nutVar, lxv lxvVar, long j2) {
        list.getClass();
        list2.getClass();
        this.f39591a = str;
        this.f39592b = str2;
        this.f39593c = list;
        this.f39594d = nzwVar;
        this.f39595e = nxdVar;
        this.f39596f = j;
        this.f39597g = str3;
        this.f39598h = str4;
        this.f39613w = lvnVar;
        this.f39599i = nxdVar2;
        this.f39600j = nxdVar3;
        this.f39601k = nxdVar4;
        this.f39602l = nuwVar;
        this.f39603m = z;
        this.f39604n = list2;
        this.f39605o = str5;
        this.f39606p = str6;
        this.f39607q = ocmVar;
        this.f39608r = oclVar;
        this.f39609s = nutVar;
        this.f39610t = lxvVar;
        this.f39611u = j2;
        this.f39612v = lkm.m15593t(new C0910po(this, 17));
        lkm.m15593t(new C0910po(this, 18));
    }

    @Override // p000.lvu
    /* JADX INFO: renamed from: a */
    public final void mo16095a() {
    }

    @Override // p000.lvu
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo16096b() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzb)) {
            return false;
        }
        lzb lzbVar = (lzb) obj;
        return ooc.m18737c(this.f39591a, lzbVar.f39591a) && ooc.m18737c(this.f39592b, lzbVar.f39592b) && ooc.m18737c(this.f39593c, lzbVar.f39593c) && ooc.m18737c(this.f39594d, lzbVar.f39594d) && ooc.m18737c(this.f39595e, lzbVar.f39595e) && this.f39596f == lzbVar.f39596f && ooc.m18737c(this.f39597g, lzbVar.f39597g) && ooc.m18737c(this.f39598h, lzbVar.f39598h) && ooc.m18737c(this.f39613w, lzbVar.f39613w) && ooc.m18737c(this.f39599i, lzbVar.f39599i) && ooc.m18737c(this.f39600j, lzbVar.f39600j) && ooc.m18737c(this.f39601k, lzbVar.f39601k) && ooc.m18737c(this.f39602l, lzbVar.f39602l) && this.f39603m == lzbVar.f39603m && ooc.m18737c(this.f39604n, lzbVar.f39604n) && ooc.m18737c(this.f39605o, lzbVar.f39605o) && ooc.m18737c(this.f39606p, lzbVar.f39606p) && ooc.m18737c(this.f39607q, lzbVar.f39607q) && ooc.m18737c(this.f39608r, lzbVar.f39608r) && ooc.m18737c(this.f39609s, lzbVar.f39609s) && ooc.m18737c(this.f39610t, lzbVar.f39610t) && this.f39611u == lzbVar.f39611u;
    }

    public final int hashCode() {
        int iM18134L;
        int iM18134L2;
        int iM18134L3;
        int iM18134L4;
        int iM18134L5;
        int iM18134L6;
        int iM18134L7;
        int iM18134L8;
        String str = this.f39591a;
        int iM18134L9 = 0;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f39592b;
        int iHashCode2 = (((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f39593c.hashCode();
        nzw nzwVar = this.f39594d;
        if (nzwVar == null) {
            iM18134L = 0;
        } else if (nzwVar.m18142ac()) {
            iM18134L = nzwVar.m18134L();
        } else {
            int iM18134L10 = nzwVar.f44820aG;
            if (iM18134L10 == 0) {
                iM18134L10 = nzwVar.m18134L();
                nzwVar.f44820aG = iM18134L10;
            }
            iM18134L = iM18134L10;
        }
        int i = ((iHashCode2 * 31) + iM18134L) * 31;
        nxd nxdVar = this.f39595e;
        if (nxdVar == null) {
            iM18134L2 = 0;
        } else if (nxdVar.m18142ac()) {
            iM18134L2 = nxdVar.m18134L();
        } else {
            int iM18134L11 = nxdVar.f44820aG;
            if (iM18134L11 == 0) {
                iM18134L11 = nxdVar.m18134L();
                nxdVar.f44820aG = iM18134L11;
            }
            iM18134L2 = iM18134L11;
        }
        int iM16223a = (((i + iM18134L2) * 31) + lzd.m16223a(this.f39596f)) * 31;
        String str3 = this.f39597g;
        int iHashCode3 = (iM16223a + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f39598h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        lvn lvnVar = this.f39613w;
        int iHashCode5 = (iHashCode4 + (lvnVar == null ? 0 : lvnVar.hashCode())) * 31;
        nxd nxdVar2 = this.f39599i;
        if (nxdVar2 == null) {
            iM18134L3 = 0;
        } else if (nxdVar2.m18142ac()) {
            iM18134L3 = nxdVar2.m18134L();
        } else {
            int iM18134L12 = nxdVar2.f44820aG;
            if (iM18134L12 == 0) {
                iM18134L12 = nxdVar2.m18134L();
                nxdVar2.f44820aG = iM18134L12;
            }
            iM18134L3 = iM18134L12;
        }
        int i2 = (iHashCode5 + iM18134L3) * 31;
        nxd nxdVar3 = this.f39600j;
        if (nxdVar3 == null) {
            iM18134L4 = 0;
        } else if (nxdVar3.m18142ac()) {
            iM18134L4 = nxdVar3.m18134L();
        } else {
            int iM18134L13 = nxdVar3.f44820aG;
            if (iM18134L13 == 0) {
                iM18134L13 = nxdVar3.m18134L();
                nxdVar3.f44820aG = iM18134L13;
            }
            iM18134L4 = iM18134L13;
        }
        int i3 = (i2 + iM18134L4) * 31;
        nxd nxdVar4 = this.f39601k;
        if (nxdVar4 == null) {
            iM18134L5 = 0;
        } else if (nxdVar4.m18142ac()) {
            iM18134L5 = nxdVar4.m18134L();
        } else {
            int iM18134L14 = nxdVar4.f44820aG;
            if (iM18134L14 == 0) {
                iM18134L14 = nxdVar4.m18134L();
                nxdVar4.f44820aG = iM18134L14;
            }
            iM18134L5 = iM18134L14;
        }
        int i4 = (i3 + iM18134L5) * 31;
        nuw nuwVar = this.f39602l;
        if (nuwVar == null) {
            iM18134L6 = 0;
        } else if (nuwVar.m18142ac()) {
            iM18134L6 = nuwVar.m18134L();
        } else {
            int iM18134L15 = nuwVar.f44820aG;
            if (iM18134L15 == 0) {
                iM18134L15 = nuwVar.m18134L();
                nuwVar.f44820aG = iM18134L15;
            }
            iM18134L6 = iM18134L15;
        }
        int iHashCode6 = (((((i4 + iM18134L6) * 31) + (this.f39603m ? 1 : 0)) * 31) + this.f39604n.hashCode()) * 31;
        String str5 = this.f39605o;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f39606p;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ocm ocmVar = this.f39607q;
        if (ocmVar == null) {
            iM18134L7 = 0;
        } else if (ocmVar.m18142ac()) {
            iM18134L7 = ocmVar.m18134L();
        } else {
            int iM18134L16 = ocmVar.f44820aG;
            if (iM18134L16 == 0) {
                iM18134L16 = ocmVar.m18134L();
                ocmVar.f44820aG = iM18134L16;
            }
            iM18134L7 = iM18134L16;
        }
        int i5 = (iHashCode8 + iM18134L7) * 31;
        ocl oclVar = this.f39608r;
        if (oclVar == null) {
            iM18134L8 = 0;
        } else if (oclVar.m18142ac()) {
            iM18134L8 = oclVar.m18134L();
        } else {
            int iM18134L17 = oclVar.f44820aG;
            if (iM18134L17 == 0) {
                iM18134L17 = oclVar.m18134L();
                oclVar.f44820aG = iM18134L17;
            }
            iM18134L8 = iM18134L17;
        }
        int i6 = (i5 + iM18134L8) * 31;
        nut nutVar = this.f39609s;
        if (nutVar != null) {
            if (nutVar.m18142ac()) {
                iM18134L9 = nutVar.m18134L();
            } else {
                iM18134L9 = nutVar.f44820aG;
                if (iM18134L9 == 0) {
                    iM18134L9 = nutVar.m18134L();
                    nutVar.f44820aG = iM18134L9;
                }
            }
        }
        return ((((i6 + iM18134L9) * 31) + this.f39610t.hashCode()) * 31) + lzd.m16223a(this.f39611u);
    }

    public final String toString() {
        return "ResourceEntity(title=" + this.f39591a + ", experienceId=" + this.f39592b + ", queryableTags=" + this.f39593c + ", queryableEpochTimestamp=" + this.f39594d + ", queryableDuration=" + this.f39595e + ", approximateTotalSize=" + this.f39596f + ", namespaceId=" + this.f39597g + ", partitionId=" + this.f39598h + ", f250ResourceId=" + this.f39613w + ", f250AutoUploadDelay=" + this.f39599i + ", airlockExpiration=" + this.f39600j + ", f250Expiration=" + this.f39601k + ", wipeout=" + this.f39602l + ", deleteAirlockFilesOnceUploaded=" + this.f39603m + ", nonSignedInDataOwners=" + this.f39604n + rmwTRjObXLGH.vlXbZGrXOa + this.f39605o + ", uploadTransferHandle=" + this.f39606p + ", relations=" + this.f39607q + ", provenance=" + this.f39608r + ", indexTokens=" + this.f39609s + ", status=" + this.f39610t + ", onDeviceId=" + this.f39611u + ")";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ lzb m16222c(lzb lzbVar, lvn lvnVar, String str, lxv lxvVar, int i) {
        String str2 = (i & 1) != 0 ? lzbVar.f39591a : null;
        String str3 = (i & 2) != 0 ? lzbVar.f39592b : null;
        List list = (i & 4) != 0 ? lzbVar.f39593c : null;
        nzw nzwVar = (i & 8) != 0 ? lzbVar.f39594d : null;
        nxd nxdVar = (i & 16) != 0 ? lzbVar.f39595e : null;
        long j = (i & 32) != 0 ? lzbVar.f39596f : 0L;
        String str4 = (i & 64) != 0 ? lzbVar.f39597g : null;
        String str5 = (i & 128) != 0 ? lzbVar.f39598h : null;
        lvn lvnVar2 = (i & 256) != 0 ? lzbVar.f39613w : lvnVar;
        nxd nxdVar2 = (i & 512) != 0 ? lzbVar.f39599i : null;
        nxd nxdVar3 = (i & 1024) != 0 ? lzbVar.f39600j : null;
        nxd nxdVar4 = (i & 2048) != 0 ? lzbVar.f39601k : null;
        nuw nuwVar = (i & 4096) != 0 ? lzbVar.f39602l : null;
        boolean z = (i & 8192) != 0 ? lzbVar.f39603m : false;
        List list2 = (i & 16384) != 0 ? lzbVar.f39604n : null;
        String str6 = (32768 & i) != 0 ? lzbVar.f39605o : null;
        String str7 = (65536 & i) != 0 ? lzbVar.f39606p : str;
        ocm ocmVar = (131072 & i) != 0 ? lzbVar.f39607q : null;
        ocl oclVar = (262144 & i) != 0 ? lzbVar.f39608r : null;
        nut nutVar = (524288 & i) != 0 ? lzbVar.f39609s : null;
        lxv lxvVar2 = (i & 1048576) != 0 ? lzbVar.f39610t : lxvVar;
        long j2 = lzbVar.f39611u;
        list.getClass();
        list2.getClass();
        lxvVar2.getClass();
        return new lzb(str2, str3, list, nzwVar, nxdVar, j, str4, str5, lvnVar2, nxdVar2, nxdVar3, nxdVar4, nuwVar, z, list2, str6, str7, ocmVar, oclVar, nutVar, lxvVar2, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ lzb(String str, String str2, List list, nzw nzwVar, nxd nxdVar, long j, String str3, String str4, lvn lvnVar, nxd nxdVar2, nxd nxdVar3, nxd nxdVar4, nuw nuwVar, boolean z, List list2, String str5, String str6, ocm ocmVar, ocl oclVar, nut nutVar, lxv lxvVar, long j2, int i) {
        if ((i & 4) != 0) {
            throw null;
        }
        nzw nzwVar2 = (i & 8) != 0 ? null : nzwVar;
        nxd nxdVar5 = (i & 16) != 0 ? null : nxdVar;
        long j3 = (i & 32) != 0 ? 0L : j;
        String str7 = (i & 64) != 0 ? null : str3;
        String str8 = (i & 128) != 0 ? null : str4;
        lvn lvnVar2 = (i & 256) != 0 ? null : lvnVar;
        nxd nxdVar6 = (i & 512) != 0 ? null : nxdVar2;
        nxd nxdVar7 = (i & 1024) != 0 ? null : nxdVar3;
        nxd nxdVar8 = (i & 2048) != 0 ? null : nxdVar4;
        nuw nuwVar2 = (i & 4096) != 0 ? null : nuwVar;
        boolean z2 = ((i & 8192) == 0) & z;
        if ((i & 16384) != 0) {
            throw null;
        }
        String str9 = (32768 & i) != 0 ? null : str5;
        String str10 = (65536 & i) != 0 ? null : str6;
        ocm ocmVar2 = (131072 & i) != 0 ? null : ocmVar;
        ocl oclVar2 = (262144 & i) != 0 ? null : oclVar;
        nut nutVar2 = (524288 & i) != 0 ? null : nutVar;
        lxv lxvVar2 = (1048576 & i) != 0 ? new lxv(null, null, null, null, null, 0.0d, 63) : lxvVar;
        int i2 = i & 1;
        this(1 != i2 ? str : null, (i & 2) != 0 ? null : str2, list, nzwVar2, nxdVar5, j3, str7, str8, lvnVar2, nxdVar6, nxdVar7, nxdVar8, nuwVar2, z2, list2, str9, str10, ocmVar2, oclVar2, nutVar2, lxvVar2, (i & 2097152) != 0 ? 0L : j2);
    }
}
