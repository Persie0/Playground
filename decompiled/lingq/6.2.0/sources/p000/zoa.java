package p000;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.animation.core.RepeatMode;
import com.google.android.gms.measurement.internal.C1043b;

/* JADX INFO: loaded from: classes.dex */
public final class zoa implements voa {

    /* JADX INFO: renamed from: a */
    public long f71908a;

    /* JADX INFO: renamed from: b */
    public long f71909b;

    /* JADX INFO: renamed from: c */
    public final Object f71910c;

    /* JADX INFO: renamed from: d */
    public final Object f71911d;

    public zoa(s6d s6dVar) {
        this.f71911d = s6dVar;
        kjc kjcVar = (kjc) s6dVar.f60774a;
        this.f71910c = new dsc(this, kjcVar, 1);
        kjcVar.f47443k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f71908a = jElapsedRealtime;
        this.f71909b = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: a */
    public long m25730a(long j) {
        long j2 = this.f71909b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f71908a;
        long j5 = j3 / j4;
        return (((RepeatMode) this.f71911d) == RepeatMode.Restart || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: b */
    public boolean mo17607b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC3081hn m25731c(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        long j2 = this.f71909b;
        long j3 = j + j2;
        long j4 = this.f71908a;
        return j3 > j4 ? ((xoa) this.f71910c).mo4033i(j4 - j2, abstractC3081hn, abstractC3081hn3, abstractC3081hn2) : abstractC3081hn2;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: d */
    public long mo9842d(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: e */
    public boolean m25732e(long j, boolean z, boolean z2) {
        s6d s6dVar = (s6d) this.f71911d;
        s6dVar.mo12359D();
        s6dVar.m13744E();
        kjc kjcVar = (kjc) s6dVar.f60774a;
        boolean zM15282f = kjcVar.m15282f();
        xcc xccVar = kjcVar.f47438f;
        if (zM15282f) {
            qfc qfcVar = kjcVar.f47437e;
            kjc.m15278j(qfcVar);
            qg9 qg9Var = qfcVar.f57715K;
            kjcVar.f47443k.getClass();
            qg9Var.m19953h(System.currentTimeMillis());
        }
        long j2 = j - this.f71908a;
        if (!z && j2 < 1000) {
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17924b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f71909b;
            this.f71909b = j;
        }
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17924b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !kjcVar.f47436d.m4873S();
        j0d j0dVar = kjcVar.f47444l;
        kjc.m15279k(j0dVar);
        rad.m20514y0(j0dVar.m14237H(z3), bundle, true);
        if (!z2) {
            C1043b c1043b = kjcVar.f47414H;
            kjc.m15279k(c1043b);
            c1043b.m5854K("auto", "_e", bundle);
        }
        this.f71908a = j;
        dsc dscVar = (dsc) this.f71910c;
        dscVar.m25216c();
        dscVar.m25215b(((Long) z8c.f71194p0.m21901a(null)).longValue());
        return true;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((xoa) this.f71910c).mo4033i(m25730a(j), abstractC3081hn, abstractC3081hn2, m25731c(j, abstractC3081hn, abstractC3081hn3, abstractC3081hn2));
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((xoa) this.f71910c).mo4036r(m25730a(j), abstractC3081hn, abstractC3081hn2, m25731c(j, abstractC3081hn, abstractC3081hn3, abstractC3081hn2));
    }

    public zoa(xoa xoaVar, RepeatMode repeatMode, long j) {
        this.f71910c = xoaVar;
        this.f71911d = repeatMode;
        this.f71908a = ((long) (xoaVar.mo4035q() + xoaVar.mo4034o())) * 1000000;
        this.f71909b = j * 1000000;
    }
}
