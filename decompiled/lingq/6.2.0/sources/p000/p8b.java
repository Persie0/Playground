package p000;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo$State;

/* JADX INFO: loaded from: classes2.dex */
public final class p8b {

    /* JADX INFO: renamed from: a */
    public final String f55772a;

    /* JADX INFO: renamed from: b */
    public WorkInfo$State f55773b;

    /* JADX INFO: renamed from: c */
    public final String f55774c;

    /* JADX INFO: renamed from: d */
    public final String f55775d;

    /* JADX INFO: renamed from: e */
    public sz1 f55776e;

    /* JADX INFO: renamed from: f */
    public final sz1 f55777f;

    /* JADX INFO: renamed from: g */
    public long f55778g;

    /* JADX INFO: renamed from: h */
    public long f55779h;

    /* JADX INFO: renamed from: i */
    public long f55780i;

    /* JADX INFO: renamed from: j */
    public ak1 f55781j;

    /* JADX INFO: renamed from: k */
    public final int f55782k;

    /* JADX INFO: renamed from: l */
    public BackoffPolicy f55783l;

    /* JADX INFO: renamed from: m */
    public long f55784m;

    /* JADX INFO: renamed from: n */
    public long f55785n;

    /* JADX INFO: renamed from: o */
    public final long f55786o;

    /* JADX INFO: renamed from: p */
    public final long f55787p;

    /* JADX INFO: renamed from: q */
    public boolean f55788q;

    /* JADX INFO: renamed from: r */
    public OutOfQuotaPolicy f55789r;

    /* JADX INFO: renamed from: s */
    public final int f55790s;

    /* JADX INFO: renamed from: t */
    public final int f55791t;

    /* JADX INFO: renamed from: u */
    public long f55792u;

    /* JADX INFO: renamed from: v */
    public int f55793v;

    /* JADX INFO: renamed from: w */
    public final int f55794w;

    /* JADX INFO: renamed from: x */
    public String f55795x;

    /* JADX INFO: renamed from: y */
    public final Boolean f55796y;

    /* JADX INFO: renamed from: z */
    public static final String f55771z = oj5.m18041h("WorkSpec");

    /* JADX INFO: renamed from: A */
    public static final fg2 f55770A = new fg2(24);

    public /* synthetic */ p8b(String str, WorkInfo$State workInfo$State, String str2, String str3, sz1 sz1Var, sz1 sz1Var2, long j, long j2, long j3, ak1 ak1Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? WorkInfo$State.ENQUEUED : workInfo$State, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? sz1.f61645b : sz1Var, (i5 & 32) != 0 ? sz1.f61645b : sz1Var2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? ak1.f751j : ak1Var, (i5 & 1024) != 0 ? 0 : i, (i5 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX INFO: renamed from: b */
    public static p8b m18978b(p8b p8bVar, String str, WorkInfo$State workInfo$State, sz1 sz1Var, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str2 = (i5 & 1) != 0 ? p8bVar.f55772a : str;
        WorkInfo$State workInfo$State2 = (i5 & 2) != 0 ? p8bVar.f55773b : workInfo$State;
        String str3 = (i5 & 4) != 0 ? p8bVar.f55774c : "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        String str4 = p8bVar.f55775d;
        sz1 sz1Var2 = (i5 & 16) != 0 ? p8bVar.f55776e : sz1Var;
        sz1 sz1Var3 = p8bVar.f55777f;
        long j3 = p8bVar.f55778g;
        long j4 = p8bVar.f55779h;
        long j5 = p8bVar.f55780i;
        ak1 ak1Var = p8bVar.f55781j;
        int i6 = (i5 & 1024) != 0 ? p8bVar.f55782k : i;
        BackoffPolicy backoffPolicy = p8bVar.f55783l;
        long j6 = p8bVar.f55784m;
        long j7 = (i5 & 8192) != 0 ? p8bVar.f55785n : j;
        long j8 = p8bVar.f55786o;
        long j9 = p8bVar.f55787p;
        boolean z = p8bVar.f55788q;
        OutOfQuotaPolicy outOfQuotaPolicy = p8bVar.f55789r;
        int i7 = (i5 & 262144) != 0 ? p8bVar.f55790s : i2;
        int i8 = (i5 & 524288) != 0 ? p8bVar.f55791t : i3;
        long j10 = (i5 & 1048576) != 0 ? p8bVar.f55792u : j2;
        int i9 = (i5 & 2097152) != 0 ? p8bVar.f55793v : i4;
        int i10 = p8bVar.f55794w;
        String str5 = p8bVar.f55795x;
        Boolean bool = p8bVar.f55796y;
        p8bVar.getClass();
        str2.getClass();
        workInfo$State2.getClass();
        str3.getClass();
        str4.getClass();
        sz1Var2.getClass();
        sz1Var3.getClass();
        ak1Var.getClass();
        backoffPolicy.getClass();
        outOfQuotaPolicy.getClass();
        return new p8b(str2, workInfo$State2, str3, str4, sz1Var2, sz1Var3, j3, j4, j5, ak1Var, i6, backoffPolicy, j6, j7, j8, j9, z, outOfQuotaPolicy, i7, i8, j10, i9, i10, str5, bool);
    }

    /* JADX INFO: renamed from: a */
    public final long m18979a() {
        return ybd.m25058a(this.f55773b == WorkInfo$State.ENQUEUED && this.f55782k > 0, this.f55782k, this.f55783l, this.f55784m, this.f55785n, this.f55790s, m18988k(), this.f55778g, this.f55780i, this.f55779h, this.f55792u);
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m18980c() {
        return this.f55796y;
    }

    /* JADX INFO: renamed from: d */
    public final int m18981d() {
        return this.f55791t;
    }

    /* JADX INFO: renamed from: e */
    public final long m18982e() {
        return this.f55792u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8b)) {
            return false;
        }
        p8b p8bVar = (p8b) obj;
        return fa4.m11650l(this.f55772a, p8bVar.f55772a) && this.f55773b == p8bVar.f55773b && fa4.m11650l(this.f55774c, p8bVar.f55774c) && fa4.m11650l(this.f55775d, p8bVar.f55775d) && fa4.m11650l(this.f55776e, p8bVar.f55776e) && fa4.m11650l(this.f55777f, p8bVar.f55777f) && this.f55778g == p8bVar.f55778g && this.f55779h == p8bVar.f55779h && this.f55780i == p8bVar.f55780i && fa4.m11650l(this.f55781j, p8bVar.f55781j) && this.f55782k == p8bVar.f55782k && this.f55783l == p8bVar.f55783l && this.f55784m == p8bVar.f55784m && this.f55785n == p8bVar.f55785n && this.f55786o == p8bVar.f55786o && this.f55787p == p8bVar.f55787p && this.f55788q == p8bVar.f55788q && this.f55789r == p8bVar.f55789r && this.f55790s == p8bVar.f55790s && this.f55791t == p8bVar.f55791t && this.f55792u == p8bVar.f55792u && this.f55793v == p8bVar.f55793v && this.f55794w == p8bVar.f55794w && fa4.m11650l(this.f55795x, p8bVar.f55795x) && fa4.m11650l(this.f55796y, p8bVar.f55796y);
    }

    /* JADX INFO: renamed from: f */
    public final int m18983f() {
        return this.f55793v;
    }

    /* JADX INFO: renamed from: g */
    public final int m18984g() {
        return this.f55790s;
    }

    /* JADX INFO: renamed from: h */
    public final int m18985h() {
        return this.f55794w;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f55794w, wq1.m24106b(this.f55793v, ux5.m22981d(this.f55792u, wq1.m24106b(this.f55791t, wq1.m24106b(this.f55790s, (this.f55789r.hashCode() + g9a.m12428e(ux5.m22981d(this.f55787p, ux5.m22981d(this.f55786o, ux5.m22981d(this.f55785n, ux5.m22981d(this.f55784m, (this.f55783l.hashCode() + wq1.m24106b(this.f55782k, (this.f55781j.hashCode() + ux5.m22981d(this.f55780i, ux5.m22981d(this.f55779h, ux5.m22981d(this.f55778g, (this.f55777f.hashCode() + ((this.f55776e.hashCode() + ux5.m22980c(ux5.m22980c((this.f55773b.hashCode() + (this.f55772a.hashCode() * 31)) * 31, this.f55774c, 31), this.f55775d, 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31, this.f55788q)) * 31, 31), 31), 31), 31), 31);
        String str = this.f55795x;
        int iHashCode = (iM24106b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f55796y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m18986i() {
        return this.f55795x;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18987j() {
        return !fa4.m11650l(ak1.f751j, this.f55781j);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m18988k() {
        return this.f55779h != 0;
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("{WorkSpec: "), this.f55772a, '}');
    }

    public p8b(String str, WorkInfo$State workInfo$State, String str2, String str3, sz1 sz1Var, sz1 sz1Var2, long j, long j2, long j3, ak1 ak1Var, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        workInfo$State.getClass();
        str2.getClass();
        str3.getClass();
        sz1Var.getClass();
        sz1Var2.getClass();
        ak1Var.getClass();
        backoffPolicy.getClass();
        outOfQuotaPolicy.getClass();
        this.f55772a = str;
        this.f55773b = workInfo$State;
        this.f55774c = str2;
        this.f55775d = str3;
        this.f55776e = sz1Var;
        this.f55777f = sz1Var2;
        this.f55778g = j;
        this.f55779h = j2;
        this.f55780i = j3;
        this.f55781j = ak1Var;
        this.f55782k = i;
        this.f55783l = backoffPolicy;
        this.f55784m = j4;
        this.f55785n = j5;
        this.f55786o = j6;
        this.f55787p = j7;
        this.f55788q = z;
        this.f55789r = outOfQuotaPolicy;
        this.f55790s = i2;
        this.f55791t = i3;
        this.f55792u = j8;
        this.f55793v = i4;
        this.f55794w = i5;
        this.f55795x = str4;
        this.f55796y = bool;
    }
}
