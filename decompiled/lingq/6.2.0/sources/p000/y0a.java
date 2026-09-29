package p000;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y0a {

    /* JADX INFO: renamed from: o */
    public static final Object f69062o = new Object();

    /* JADX INFO: renamed from: p */
    public static final pu5 f69063p;

    /* JADX INFO: renamed from: a */
    public Object f69064a = f69062o;

    /* JADX INFO: renamed from: b */
    public pu5 f69065b = f69063p;

    /* JADX INFO: renamed from: c */
    public long f69066c;

    /* JADX INFO: renamed from: d */
    public long f69067d;

    /* JADX INFO: renamed from: e */
    public long f69068e;

    /* JADX INFO: renamed from: f */
    public boolean f69069f;

    /* JADX INFO: renamed from: g */
    public boolean f69070g;

    /* JADX INFO: renamed from: h */
    public lu5 f69071h;

    /* JADX INFO: renamed from: i */
    public boolean f69072i;

    /* JADX INFO: renamed from: j */
    public long f69073j;

    /* JADX INFO: renamed from: k */
    public long f69074k;

    /* JADX INFO: renamed from: l */
    public int f69075l;

    /* JADX INFO: renamed from: m */
    public int f69076m;

    /* JADX INFO: renamed from: n */
    public long f69077n;

    static {
        e41 e41Var = new e41(13);
        ImmutableList.m6289v();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        nu5 nu5Var = nu5.f53257a;
        Uri uri = Uri.EMPTY;
        f69063p = new pu5("androidx.media3.common.Timeline", new ku5(e41Var), uri != null ? new mu5(uri, immutableListM6289v) : null, new lu5(), tu5.f62885B, nu5Var);
        AbstractC3393o1.m17746u(1, 2, 3, 4, 5);
        AbstractC3393o1.m17746u(6, 7, 8, 9, 10);
        uma.m22828w(11);
        uma.m22828w(12);
        uma.m22828w(13);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24824a() {
        return this.f69071h != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m24825b(pu5 pu5Var, boolean z, boolean z2, lu5 lu5Var, long j, long j2) {
        this.f69064a = f69062o;
        this.f69065b = pu5Var != null ? pu5Var : f69063p;
        if (pu5Var != null) {
            mu5 mu5Var = pu5Var.f56811b;
        }
        this.f69066c = -9223372036854775807L;
        this.f69067d = -9223372036854775807L;
        this.f69068e = -9223372036854775807L;
        this.f69069f = z;
        this.f69070g = z2;
        this.f69071h = lu5Var;
        this.f69073j = j;
        this.f69074k = j2;
        this.f69075l = 0;
        this.f69076m = 0;
        this.f69077n = 0L;
        this.f69072i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y0a.class.equals(obj.getClass())) {
            return false;
        }
        y0a y0aVar = (y0a) obj;
        return Objects.equals(this.f69064a, y0aVar.f69064a) && Objects.equals(this.f69065b, y0aVar.f69065b) && Objects.equals(this.f69071h, y0aVar.f69071h) && this.f69066c == y0aVar.f69066c && this.f69067d == y0aVar.f69067d && this.f69068e == y0aVar.f69068e && this.f69069f == y0aVar.f69069f && this.f69070g == y0aVar.f69070g && this.f69072i == y0aVar.f69072i && this.f69073j == y0aVar.f69073j && this.f69074k == y0aVar.f69074k && this.f69075l == y0aVar.f69075l && this.f69076m == y0aVar.f69076m && this.f69077n == y0aVar.f69077n;
    }

    public final int hashCode() {
        int iHashCode = (this.f69065b.hashCode() + ((this.f69064a.hashCode() + 217) * 31)) * 961;
        lu5 lu5Var = this.f69071h;
        int iHashCode2 = lu5Var == null ? 0 : lu5Var.hashCode();
        long j = this.f69066c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f69067d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f69068e;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f69069f ? 1 : 0)) * 31) + (this.f69070g ? 1 : 0)) * 31) + (this.f69072i ? 1 : 0)) * 31;
        long j4 = this.f69073j;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f69074k;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f69075l) * 31) + this.f69076m) * 31;
        long j6 = this.f69077n;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
