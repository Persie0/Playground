package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zob {

    /* JADX INFO: renamed from: a */
    public final String f71912a;

    /* JADX INFO: renamed from: b */
    public final String f71913b;

    /* JADX INFO: renamed from: c */
    public final long f71914c;

    /* JADX INFO: renamed from: d */
    public final long f71915d;

    /* JADX INFO: renamed from: e */
    public final long f71916e;

    /* JADX INFO: renamed from: f */
    public final long f71917f;

    /* JADX INFO: renamed from: g */
    public final long f71918g;

    /* JADX INFO: renamed from: h */
    public final Long f71919h;

    /* JADX INFO: renamed from: i */
    public final Long f71920i;

    /* JADX INFO: renamed from: j */
    public final Long f71921j;

    /* JADX INFO: renamed from: k */
    public final Boolean f71922k;

    public zob(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        lda.m16127m(str);
        lda.m16127m(str2);
        lda.m16125k(j >= 0);
        lda.m16125k(j2 >= 0);
        lda.m16125k(j3 >= 0);
        lda.m16125k(j5 >= 0);
        this.f71912a = str;
        this.f71913b = str2;
        this.f71914c = j;
        this.f71915d = j2;
        this.f71916e = j3;
        this.f71917f = j4;
        this.f71918g = j5;
        this.f71919h = l;
        this.f71920i = l2;
        this.f71921j = l3;
        this.f71922k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final zob m25733a(long j) {
        return new zob(this.f71912a, this.f71913b, this.f71914c, this.f71915d, this.f71916e, j, this.f71918g, this.f71919h, this.f71920i, this.f71921j, this.f71922k);
    }

    /* JADX INFO: renamed from: b */
    public final zob m25734b(Long l, Long l2, Boolean bool) {
        return new zob(this.f71912a, this.f71913b, this.f71914c, this.f71915d, this.f71916e, this.f71917f, this.f71918g, this.f71919h, l, l2, bool);
    }
}
