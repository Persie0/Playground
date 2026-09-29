package p000;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k97 {

    /* JADX INFO: renamed from: u */
    public static final jv5 f46892u = new jv5(new Object());

    /* JADX INFO: renamed from: a */
    public final z0a f46893a;

    /* JADX INFO: renamed from: b */
    public final jv5 f46894b;

    /* JADX INFO: renamed from: c */
    public final long f46895c;

    /* JADX INFO: renamed from: d */
    public final long f46896d;

    /* JADX INFO: renamed from: e */
    public final int f46897e;

    /* JADX INFO: renamed from: f */
    public final ExoPlaybackException f46898f;

    /* JADX INFO: renamed from: g */
    public final boolean f46899g;

    /* JADX INFO: renamed from: h */
    public final k8a f46900h;

    /* JADX INFO: renamed from: i */
    public final u8a f46901i;

    /* JADX INFO: renamed from: j */
    public final List f46902j;

    /* JADX INFO: renamed from: k */
    public final jv5 f46903k;

    /* JADX INFO: renamed from: l */
    public final boolean f46904l;

    /* JADX INFO: renamed from: m */
    public final int f46905m;

    /* JADX INFO: renamed from: n */
    public final int f46906n;

    /* JADX INFO: renamed from: o */
    public final n97 f46907o;

    /* JADX INFO: renamed from: p */
    public final boolean f46908p;

    /* JADX INFO: renamed from: q */
    public volatile long f46909q;

    /* JADX INFO: renamed from: r */
    public volatile long f46910r;

    /* JADX INFO: renamed from: s */
    public volatile long f46911s;

    /* JADX INFO: renamed from: t */
    public volatile long f46912t;

    public k97(z0a z0aVar, jv5 jv5Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, k8a k8aVar, u8a u8aVar, List list, jv5 jv5Var2, boolean z2, int i2, int i3, n97 n97Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.f46893a = z0aVar;
        this.f46894b = jv5Var;
        this.f46895c = j;
        this.f46896d = j2;
        this.f46897e = i;
        this.f46898f = exoPlaybackException;
        this.f46899g = z;
        this.f46900h = k8aVar;
        this.f46901i = u8aVar;
        this.f46902j = list;
        this.f46903k = jv5Var2;
        this.f46904l = z2;
        this.f46905m = i2;
        this.f46906n = i3;
        this.f46907o = n97Var;
        this.f46909q = j3;
        this.f46910r = j4;
        this.f46911s = j5;
        this.f46912t = j6;
        this.f46908p = z3;
    }

    /* JADX INFO: renamed from: j */
    public static k97 m15013j(u8a u8aVar) {
        w0a w0aVar = z0a.f70734a;
        k8a k8aVar = k8a.f46867d;
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        n97 n97Var = n97.f52509d;
        jv5 jv5Var = f46892u;
        return new k97(w0aVar, jv5Var, -9223372036854775807L, 0L, 1, null, false, k8aVar, u8aVar, immutableListM6289v, jv5Var, false, 1, 0, n97Var, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: a */
    public final k97 m15014a(boolean z) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, this.f46897e, this.f46898f, z, this.f46900h, this.f46901i, this.f46902j, this.f46903k, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: b */
    public final k97 m15015b(jv5 jv5Var) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, this.f46897e, this.f46898f, this.f46899g, this.f46900h, this.f46901i, this.f46902j, jv5Var, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: c */
    public final k97 m15016c(jv5 jv5Var, long j, long j2, long j3, long j4, k8a k8aVar, u8a u8aVar, List list) {
        return new k97(this.f46893a, jv5Var, j2, j3, this.f46897e, this.f46898f, this.f46899g, k8aVar, u8aVar, list, this.f46903k, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, j4, j, SystemClock.elapsedRealtime(), this.f46908p);
    }

    /* JADX INFO: renamed from: d */
    public final k97 m15017d(int i, int i2, boolean z) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, this.f46897e, this.f46898f, this.f46899g, this.f46900h, this.f46901i, this.f46902j, this.f46903k, z, i, i2, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: e */
    public final k97 m15018e(ExoPlaybackException exoPlaybackException) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, this.f46897e, exoPlaybackException, this.f46899g, this.f46900h, this.f46901i, this.f46902j, this.f46903k, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: f */
    public final k97 m15019f(n97 n97Var) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, this.f46897e, this.f46898f, this.f46899g, this.f46900h, this.f46901i, this.f46902j, this.f46903k, this.f46904l, this.f46905m, this.f46906n, n97Var, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: g */
    public final k97 m15020g(int i) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, i, this.f46898f, this.f46899g, this.f46900h, this.f46901i, this.f46902j, this.f46903k, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: h */
    public final k97 m15021h(boolean z) {
        return new k97(this.f46893a, this.f46894b, this.f46895c, this.f46896d, this.f46897e, this.f46898f, this.f46899g, this.f46900h, this.f46901i, this.f46902j, this.f46903k, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, z);
    }

    /* JADX INFO: renamed from: i */
    public final k97 m15022i(z0a z0aVar) {
        return new k97(z0aVar, this.f46894b, this.f46895c, this.f46896d, this.f46897e, this.f46898f, this.f46899g, this.f46900h, this.f46901i, this.f46902j, this.f46903k, this.f46904l, this.f46905m, this.f46906n, this.f46907o, this.f46909q, this.f46910r, this.f46911s, this.f46912t, this.f46908p);
    }

    /* JADX INFO: renamed from: k */
    public final long m15023k() {
        long j;
        long j2;
        if (!m15024l()) {
            return this.f46911s;
        }
        do {
            j = this.f46912t;
            j2 = this.f46911s;
        } while (j != this.f46912t);
        return uma.m22797B(uma.m22805J(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f46907o.f52510a)));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m15024l() {
        return this.f46897e == 3 && this.f46904l && this.f46906n == 0;
    }
}
