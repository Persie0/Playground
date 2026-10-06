package p000;

import android.net.Uri;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class dkb implements chq {

    /* JADX INFO: renamed from: b */
    public final long f11856b;

    /* JADX INFO: renamed from: c */
    public final gyu f11857c;

    /* JADX INFO: renamed from: d */
    public final mws f11858d;

    /* JADX INFO: renamed from: e */
    public final String f11859e;

    /* JADX INFO: renamed from: f */
    public final String f11860f;

    /* JADX INFO: renamed from: g */
    public final Instant f11861g;

    /* JADX INFO: renamed from: h */
    public final Instant f11862h;

    /* JADX INFO: renamed from: i */
    public final Uri f11863i;

    /* JADX INFO: renamed from: j */
    public final boolean f11864j;

    /* JADX INFO: renamed from: k */
    public final kbc f11865k;

    /* JADX INFO: renamed from: l */
    public final int f11866l;

    public dkb() {
    }

    public dkb(long j, gyu gyuVar, mws mwsVar, String str, String str2, Instant instant, Instant instant2, Uri uri, boolean z, kbc kbcVar, int i) {
        this.f11856b = j;
        this.f11857c = gyuVar;
        if (mwsVar == null) {
            throw new NullPointerException("Null allContentIds");
        }
        this.f11858d = mwsVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f11859e = str;
        if (str2 == null) {
            throw new NullPointerException("Null mimeType");
        }
        this.f11860f = str2;
        if (instant == null) {
            throw new NullPointerException("Null creationInstant");
        }
        this.f11861g = instant;
        if (instant2 == null) {
            throw new NullPointerException("Null lastModifiedInstant");
        }
        this.f11862h = instant2;
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f11863i = uri;
        this.f11864j = z;
        if (kbcVar == null) {
            throw new NullPointerException("Null dimensions");
        }
        this.f11865k = kbcVar;
        this.f11866l = i;
    }

    /* JADX INFO: renamed from: k */
    public static dka m6285k() {
        dka dkaVar = new dka();
        dkaVar.m6281f("");
        dkaVar.m6283h("");
        dkaVar.f11845b = f5755a;
        dkaVar.m6282g(0);
        return dkaVar;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: a */
    public final int mo3741a() {
        return this.f11866l;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: b */
    public final long mo3742b() {
        return this.f11856b;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: c */
    public final Uri mo3743c() {
        return this.f11863i;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: d */
    public final gyu mo3744d() {
        return this.f11857c;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: e */
    public final kbc mo3745e() {
        return this.f11865k;
    }

    public final boolean equals(Object obj) {
        gyu gyuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkb) {
            dkb dkbVar = (dkb) obj;
            if (this.f11856b == dkbVar.f11856b && ((gyuVar = this.f11857c) != null ? gyuVar.equals(dkbVar.f11857c) : dkbVar.f11857c == null) && mkv.m16505M(this.f11858d, dkbVar.f11858d) && this.f11859e.equals(dkbVar.f11859e) && this.f11860f.equals(dkbVar.f11860f) && this.f11861g.equals(dkbVar.f11861g) && this.f11862h.equals(dkbVar.f11862h) && this.f11863i.equals(dkbVar.f11863i) && this.f11864j == dkbVar.f11864j && this.f11865k.equals(dkbVar.f11865k) && this.f11866l == dkbVar.f11866l) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: f */
    public final mws mo3746f() {
        return this.f11858d;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: g */
    public final Instant mo3747g() {
        return this.f11861g;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: h */
    public final Instant mo3748h() {
        return this.f11862h;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: i */
    public final String mo3749i() {
        return this.f11860f;
    }

    @Override // p000.chq
    /* JADX INFO: renamed from: j */
    public final boolean mo3750j() {
        return this.f11864j;
    }

    public final String toString() {
        return "MediaStoreData{contentId=" + this.f11856b + ", shotId=" + String.valueOf(this.f11857c) + ", allContentIds=" + this.f11858d.toString() + ", title=" + this.f11859e + ", mimeType=" + this.f11860f + ", creationInstant=" + this.f11861g.toString() + ", lastModifiedInstant=" + this.f11862h.toString() + ", uri=" + this.f11863i.toString() + ", inProgress=" + this.f11864j + ", dimensions=" + this.f11865k.toString() + ", orientation=" + this.f11866l + "}";
    }

    public final int hashCode() {
        long j = this.f11856b;
        long j2 = j ^ (j >>> 32);
        gyu gyuVar = this.f11857c;
        return ((((((((((((((((this.f11858d.hashCode() ^ ((((((int) j2) ^ 1000003) * 1000003) ^ (gyuVar == null ? 0 : gyuVar.hashCode())) * 1000003)) * 1000003) ^ this.f11859e.hashCode()) * 1000003) ^ this.f11860f.hashCode()) * 1000003) ^ this.f11861g.hashCode()) * 1000003) ^ this.f11862h.hashCode()) * 1000003) ^ this.f11863i.hashCode()) * 1000003) ^ (true != this.f11864j ? 1237 : 1231)) * 1000003) ^ this.f11865k.hashCode()) * 1000003) ^ this.f11866l;
    }
}
