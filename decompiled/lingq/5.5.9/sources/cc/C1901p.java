package cc;

import p176ib.C6272i;

/* JADX INFO: renamed from: cc.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1901p {

    /* JADX INFO: renamed from: a */
    public final String f10105a;

    /* JADX INFO: renamed from: b */
    public final String f10106b;

    /* JADX INFO: renamed from: c */
    public final long f10107c;

    /* JADX INFO: renamed from: d */
    public final long f10108d;

    /* JADX INFO: renamed from: e */
    public final long f10109e;

    /* JADX INFO: renamed from: f */
    public final long f10110f;

    /* JADX INFO: renamed from: g */
    public final long f10111g;

    /* JADX INFO: renamed from: h */
    public final Long f10112h;

    /* JADX INFO: renamed from: i */
    public final Long f10113i;

    /* JADX INFO: renamed from: j */
    public final Long f10114j;

    /* JADX INFO: renamed from: k */
    public final Boolean f10115k;

    public C1901p(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        C6272i.m12908b(j10 >= 0);
        C6272i.m12908b(j11 >= 0);
        C6272i.m12908b(j12 >= 0);
        C6272i.m12908b(j14 >= 0);
        this.f10105a = str;
        this.f10106b = str2;
        this.f10107c = j10;
        this.f10108d = j11;
        this.f10109e = j12;
        this.f10110f = j13;
        this.f10111g = j14;
        this.f10112h = l10;
        this.f10113i = l11;
        this.f10114j = l12;
        this.f10115k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final C1901p m5848a(Long l10, Long l11, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new C1901p(this.f10105a, this.f10106b, this.f10107c, this.f10108d, this.f10109e, this.f10110f, this.f10111g, this.f10112h, l10, l11, bool);
    }

    /* JADX INFO: renamed from: b */
    public final C1901p m5849b(long j10, long j11) {
        return new C1901p(this.f10105a, this.f10106b, this.f10107c, this.f10108d, this.f10109e, this.f10110f, j10, Long.valueOf(j11), this.f10113i, this.f10114j, this.f10115k);
    }
}
