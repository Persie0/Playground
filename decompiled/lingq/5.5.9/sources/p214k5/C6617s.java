package p214k5;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p003a2.C0009a;
import p026b5.AbstractC1314g;
import p026b5.C1309b;

/* JADX INFO: renamed from: k5.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6617s {

    /* JADX INFO: renamed from: u */
    public static final String f37523u;

    /* JADX INFO: renamed from: a */
    public final String f37524a;

    /* JADX INFO: renamed from: b */
    public WorkInfo$State f37525b;

    /* JADX INFO: renamed from: c */
    public final String f37526c;

    /* JADX INFO: renamed from: d */
    public String f37527d;

    /* JADX INFO: renamed from: e */
    public C1244b f37528e;

    /* JADX INFO: renamed from: f */
    public final C1244b f37529f;

    /* JADX INFO: renamed from: g */
    public final long f37530g;

    /* JADX INFO: renamed from: h */
    public final long f37531h;

    /* JADX INFO: renamed from: i */
    public final long f37532i;

    /* JADX INFO: renamed from: j */
    public C1309b f37533j;

    /* JADX INFO: renamed from: k */
    public final int f37534k;

    /* JADX INFO: renamed from: l */
    public BackoffPolicy f37535l;

    /* JADX INFO: renamed from: m */
    public long f37536m;

    /* JADX INFO: renamed from: n */
    public long f37537n;

    /* JADX INFO: renamed from: o */
    public final long f37538o;

    /* JADX INFO: renamed from: p */
    public final long f37539p;

    /* JADX INFO: renamed from: q */
    public boolean f37540q;

    /* JADX INFO: renamed from: r */
    public final OutOfQuotaPolicy f37541r;

    /* JADX INFO: renamed from: s */
    public final int f37542s;

    /* JADX INFO: renamed from: t */
    public final int f37543t;

    /* JADX INFO: renamed from: k5.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f37544a;

        /* JADX INFO: renamed from: b */
        public final WorkInfo$State f37545b;

        public a(WorkInfo$State workInfo$State, String str) {
            C5207g.m11111f(str, "id");
            C5207g.m11111f(workInfo$State, "state");
            this.f37544a = str;
            this.f37545b = workInfo$State;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f37544a, aVar.f37544a) && this.f37545b == aVar.f37545b;
        }

        public final int hashCode() {
            return this.f37545b.hashCode() + (this.f37544a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f37544a + ", state=" + this.f37545b + ')';
        }
    }

    static {
        String strM4868f = AbstractC1314g.m4868f("WorkSpec");
        C5207g.m11110e(strM4868f, "tagWithPrefix(\"WorkSpec\")");
        f37523u = strM4868f;
    }

    public C6617s(String str, WorkInfo$State workInfo$State, String str2, String str3, C1244b c1244b, C1244b c1244b2, long j10, long j11, long j12, C1309b c1309b, int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12) {
        C5207g.m11111f(str, "id");
        C5207g.m11111f(workInfo$State, "state");
        C5207g.m11111f(str2, "workerClassName");
        C5207g.m11111f(c1244b, "input");
        C5207g.m11111f(c1244b2, "output");
        C5207g.m11111f(c1309b, "constraints");
        C5207g.m11111f(backoffPolicy, "backoffPolicy");
        C5207g.m11111f(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f37524a = str;
        this.f37525b = workInfo$State;
        this.f37526c = str2;
        this.f37527d = str3;
        this.f37528e = c1244b;
        this.f37529f = c1244b2;
        this.f37530g = j10;
        this.f37531h = j11;
        this.f37532i = j12;
        this.f37533j = c1309b;
        this.f37534k = i10;
        this.f37535l = backoffPolicy;
        this.f37536m = j13;
        this.f37537n = j14;
        this.f37538o = j15;
        this.f37539p = j16;
        this.f37540q = z10;
        this.f37541r = outOfQuotaPolicy;
        this.f37542s = i11;
        this.f37543t = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6617s(String str, WorkInfo$State workInfo$State, String str2, String str3, C1244b c1244b, C1244b c1244b2, long j10, long j11, long j12, C1309b c1309b, int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, int i13) {
        C1244b c1244b3;
        C1244b c1244b4;
        WorkInfo$State workInfo$State2 = (i12 & 2) != 0 ? WorkInfo$State.ENQUEUED : workInfo$State;
        String str4 = (i12 & 8) != 0 ? null : str3;
        if ((i12 & 16) != 0) {
            C1244b c1244b5 = C1244b.f7823c;
            C5207g.m11110e(c1244b5, "EMPTY");
            c1244b3 = c1244b5;
        } else {
            c1244b3 = c1244b;
        }
        if ((i12 & 32) != 0) {
            C1244b c1244b6 = C1244b.f7823c;
            C5207g.m11110e(c1244b6, "EMPTY");
            c1244b4 = c1244b6;
        } else {
            c1244b4 = c1244b2;
        }
        this(str, workInfo$State2, str2, str4, c1244b3, c1244b4, (i12 & 64) != 0 ? 0L : j10, (i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0L : j11, (i12 & 256) != 0 ? 0L : j12, (i12 & 512) != 0 ? C1309b.f8045i : c1309b, (i12 & 1024) != 0 ? 0 : i10, (i12 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i12 & 4096) != 0 ? 30000L : j13, (i12 & 8192) != 0 ? 0L : j14, (i12 & 16384) != 0 ? 0L : j15, (32768 & i12) != 0 ? -1L : j16, (65536 & i12) != 0 ? false : z10, (131072 & i12) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (i12 & 262144) != 0 ? 0 : i11, 0);
    }

    /* JADX INFO: renamed from: a */
    public final long m13220a() {
        WorkInfo$State workInfo$State = this.f37525b;
        WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
        boolean z10 = true;
        int i10 = this.f37534k;
        if (workInfo$State == workInfo$State2 && i10 > 0) {
            long jScalb = this.f37535l == BackoffPolicy.LINEAR ? this.f37536m * ((long) i10) : (long) Math.scalb(this.f37536m, i10 - 1);
            long j10 = this.f37537n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        boolean zM13222c = m13222c();
        long j11 = this.f37530g;
        long j12 = 0;
        if (!zM13222c) {
            long jCurrentTimeMillis = this.f37537n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return j11 + jCurrentTimeMillis;
        }
        long j13 = this.f37537n;
        int i11 = this.f37542s;
        if (i11 == 0) {
            j13 += j11;
        }
        long j14 = this.f37532i;
        long j15 = this.f37531h;
        if (j14 == j15) {
            z10 = false;
        }
        if (z10) {
            j12 = i11 == 0 ? ((long) (-1)) * j14 : 0L;
            j13 += j15;
        } else if (i11 != 0) {
            j12 = j15;
        }
        return j13 + j12;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13221b() {
        return !C5207g.m11106a(C1309b.f8045i, this.f37533j);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13222c() {
        return this.f37531h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6617s)) {
            return false;
        }
        C6617s c6617s = (C6617s) obj;
        return C5207g.m11106a(this.f37524a, c6617s.f37524a) && this.f37525b == c6617s.f37525b && C5207g.m11106a(this.f37526c, c6617s.f37526c) && C5207g.m11106a(this.f37527d, c6617s.f37527d) && C5207g.m11106a(this.f37528e, c6617s.f37528e) && C5207g.m11106a(this.f37529f, c6617s.f37529f) && this.f37530g == c6617s.f37530g && this.f37531h == c6617s.f37531h && this.f37532i == c6617s.f37532i && C5207g.m11106a(this.f37533j, c6617s.f37533j) && this.f37534k == c6617s.f37534k && this.f37535l == c6617s.f37535l && this.f37536m == c6617s.f37536m && this.f37537n == c6617s.f37537n && this.f37538o == c6617s.f37538o && this.f37539p == c6617s.f37539p && this.f37540q == c6617s.f37540q && this.f37541r == c6617s.f37541r && this.f37542s == c6617s.f37542s && this.f37543t == c6617s.f37543t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37526c, (this.f37525b.hashCode() + (this.f37524a.hashCode() * 31)) * 31, 31);
        String str = this.f37527d;
        int iM847f = C0204c.m847f(this.f37539p, C0204c.m847f(this.f37538o, C0204c.m847f(this.f37537n, C0204c.m847f(this.f37536m, (this.f37535l.hashCode() + C0009a.m16d(this.f37534k, (this.f37533j.hashCode() + C0204c.m847f(this.f37532i, C0204c.m847f(this.f37531h, C0204c.m847f(this.f37530g, (this.f37529f.hashCode() + ((this.f37528e.hashCode() + ((iM758d + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31);
        boolean z10 = this.f37540q;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f37543t) + C0009a.m16d(this.f37542s, (this.f37541r.hashCode() + ((iM847f + r10) * 31)) * 31, 31);
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("{WorkSpec: "), this.f37524a, '}');
    }
}
