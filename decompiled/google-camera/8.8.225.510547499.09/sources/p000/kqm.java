package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqm {

    /* JADX INFO: renamed from: a */
    public final kqh f36885a;

    /* JADX INFO: renamed from: b */
    public final long f36886b;

    /* JADX INFO: renamed from: c */
    public final String f36887c;

    /* JADX INFO: renamed from: d */
    public final kqe f36888d;

    /* JADX INFO: renamed from: e */
    public final mxk f36889e;

    /* JADX INFO: renamed from: f */
    public final mxk f36890f;

    /* JADX INFO: renamed from: g */
    public final mxk f36891g;

    /* JADX INFO: renamed from: h */
    public final mws f36892h;

    /* JADX INFO: renamed from: i */
    public final krj f36893i;

    /* JADX INFO: renamed from: j */
    public final int f36894j;

    /* JADX INFO: renamed from: k */
    private final long f36895k;

    public kqm() {
    }

    public kqm(kqh kqhVar, long j, long j2, String str, kqe kqeVar, mxk mxkVar, mxk mxkVar2, mxk mxkVar3, int i, mws mwsVar, krj krjVar) {
        this.f36885a = kqhVar;
        this.f36895k = j;
        this.f36886b = j2;
        this.f36887c = str;
        this.f36888d = kqeVar;
        this.f36889e = mxkVar;
        this.f36890f = mxkVar2;
        this.f36891g = mxkVar3;
        this.f36894j = i;
        this.f36892h = mwsVar;
        this.f36893i = krjVar;
    }

    public final boolean equals(Object obj) {
        kqe kqeVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kqm)) {
            return false;
        }
        kqm kqmVar = (kqm) obj;
        if (this.f36885a.equals(kqmVar.f36885a) && this.f36895k == kqmVar.f36895k && this.f36886b == kqmVar.f36886b && this.f36887c.equals(kqmVar.f36887c) && ((kqeVar = this.f36888d) != null ? kqeVar.equals(kqmVar.f36888d) : kqmVar.f36888d == null) && this.f36889e.equals(kqmVar.f36889e) && this.f36890f.equals(kqmVar.f36890f) && this.f36891g.equals(kqmVar.f36891g)) {
            int i = this.f36894j;
            int i2 = kqmVar.f36894j;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && mkv.m16505M(this.f36892h, kqmVar.f36892h) && this.f36893i.equals(kqmVar.f36893i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f36885a.hashCode() ^ 1000003;
        long j = this.f36895k;
        long j2 = this.f36886b;
        int iHashCode2 = (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f36887c.hashCode();
        kqe kqeVar = this.f36888d;
        int iHashCode3 = ((((((((iHashCode2 * 1000003) ^ (kqeVar == null ? 0 : kqeVar.hashCode())) * 1000003) ^ this.f36889e.hashCode()) * 1000003) ^ this.f36890f.hashCode()) * 1000003) ^ this.f36891g.hashCode()) * 1000003;
        int i = this.f36894j;
        if (i != 0) {
            return ((((iHashCode3 ^ i) * 1000003) ^ this.f36892h.hashCode()) * 1000003) ^ this.f36893i.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.f36885a);
        long j = this.f36895k;
        long j2 = this.f36886b;
        String str2 = this.f36887c;
        String strValueOf2 = String.valueOf(this.f36888d);
        String strValueOf3 = String.valueOf(this.f36889e);
        String strValueOf4 = String.valueOf(this.f36890f);
        String strValueOf5 = String.valueOf(this.f36891g);
        switch (this.f36894j) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = hIAHJKEnGsNbz.lrADS;
                break;
            case 3:
                str = "ABANDON";
                break;
            default:
                str = "null";
                break;
        }
        return "MediaGroupInfo{mediaGroupId=" + strValueOf + ", timestampNs=" + j + ", utcTimestampMs=" + j2 + ", tag=" + str2 + ", primary=" + strValueOf2 + ", mediaFiles=" + strValueOf3 + ", privateMediaFiles=" + strValueOf4 + ", cachedFiles=" + strValueOf5 + ", publishIntent=" + str + ", listeners=" + String.valueOf(this.f36892h) + ", contentResolverApi=" + String.valueOf(this.f36893i) + "}";
    }
}
