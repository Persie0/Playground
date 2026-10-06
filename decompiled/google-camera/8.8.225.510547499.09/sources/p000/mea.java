package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mea {

    /* JADX INFO: renamed from: a */
    public final lzb f40161a;

    /* JADX INFO: renamed from: b */
    public final List f40162b;

    /* JADX INFO: renamed from: c */
    public final mau f40163c;

    public mea(lzb lzbVar, List list, mau mauVar) {
        lzbVar.getClass();
        list.getClass();
        mauVar.getClass();
        this.f40161a = lzbVar;
        this.f40162b = list;
        this.f40163c = mauVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ mea m16334a(mea meaVar, lzb lzbVar) {
        List list = meaVar.f40162b;
        mau mauVar = meaVar.f40163c;
        lzbVar.getClass();
        return new mea(lzbVar, list, mauVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mea)) {
            return false;
        }
        mea meaVar = (mea) obj;
        return ooc.m18737c(this.f40161a, meaVar.f40161a) && ooc.m18737c(this.f40162b, meaVar.f40162b) && ooc.m18737c(this.f40163c, meaVar.f40163c);
    }

    public final int hashCode() {
        return (((this.f40161a.hashCode() * 31) + this.f40162b.hashCode()) * 31) + this.f40163c.hashCode();
    }

    public final String toString() {
        return "UploadItem(resource=" + this.f40161a + ", annotachments=" + this.f40162b + ", logStarter=" + this.f40163c + ")";
    }
}
