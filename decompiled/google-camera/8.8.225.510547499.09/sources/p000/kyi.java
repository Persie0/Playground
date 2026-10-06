package p000;

import java.io.FileInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyi {

    /* JADX INFO: renamed from: a */
    public final FileInputStream f37724a;

    /* JADX INFO: renamed from: b */
    public final long f37725b;

    /* JADX INFO: renamed from: c */
    final long f37726c;

    /* JADX INFO: renamed from: d */
    public long f37727d;

    /* JADX INFO: renamed from: e */
    long f37728e;

    public kyi(FileInputStream fileInputStream, long j, long j2) {
        lku.m15609D(j <= j2, "start at %s later than end at %s", j, j2);
        this.f37724a = fileInputStream;
        this.f37725b = j;
        this.f37726c = j2;
        this.f37727d = 0L;
        this.f37728e = j2 - j;
    }

    /* JADX INFO: renamed from: a */
    public final long m15056a() {
        return this.f37728e - this.f37727d;
    }

    /* JADX INFO: renamed from: b */
    public final kyi m15057b() {
        kyi kyiVar = new kyi(this.f37724a, this.f37725b, this.f37726c);
        kyiVar.m15060e(this.f37727d);
        kyiVar.m15059d(this.f37728e);
        return kyiVar;
    }

    /* JADX INFO: renamed from: c */
    public final kyi m15058c() {
        FileInputStream fileInputStream = this.f37724a;
        long j = this.f37725b;
        return new kyi(fileInputStream, this.f37727d + j, this.f37728e + j);
    }

    /* JADX INFO: renamed from: d */
    public final void m15059d(long j) {
        long j2 = this.f37727d;
        lku.m15609D(j >= j2, "New limit %s smaller than position ", j, j2);
        long j3 = this.f37725b + j;
        long j4 = this.f37726c;
        lku.m15609D(j3 <= j4, "New limit %s points farther than end position %s", j, j4);
        this.f37728e = j;
    }

    /* JADX INFO: renamed from: e */
    public final void m15060e(long j) {
        long j2 = this.f37728e;
        lku.m15609D(j <= j2, "New position %s larger than limit %s", j, j2);
        this.f37727d = j;
    }
}
