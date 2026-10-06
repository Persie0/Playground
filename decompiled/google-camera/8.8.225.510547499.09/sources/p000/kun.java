package p000;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kun {

    /* JADX INFO: renamed from: a */
    private final Deque f37236a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    private double f37237b;

    /* JADX INFO: renamed from: c */
    private double f37238c;

    /* JADX INFO: renamed from: d */
    private double f37239d;

    /* JADX INFO: renamed from: e */
    private double f37240e;

    /* JADX INFO: renamed from: f */
    private kum f37241f;

    /* JADX INFO: renamed from: g */
    private kum f37242g;

    /* JADX INFO: renamed from: a */
    final synchronized void m14897a(double d) {
        kum kumVar = this.f37241f;
        if (kumVar != null && d > this.f37239d) {
            kumVar.mo14895a(d);
        }
        Double d2 = (Double) this.f37236a.peekLast();
        if (d2 != null) {
            double dAbs = Math.abs(d - d2.doubleValue()) / d2.doubleValue();
            kum kumVar2 = this.f37242g;
            if (kumVar2 != null && dAbs > this.f37240e) {
                kumVar2.mo14895a(dAbs);
            }
        }
        if (this.f37236a.size() > 120) {
            double dDoubleValue = ((Double) this.f37236a.remove()).doubleValue();
            this.f37237b -= dDoubleValue;
            this.f37238c -= dDoubleValue * dDoubleValue;
        }
        this.f37237b += d;
        this.f37238c += d * d;
        this.f37236a.add(Double.valueOf(d));
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m14898b(double d, kum kumVar) {
        this.f37239d = d;
        this.f37241f = kumVar;
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m14899c(kum kumVar) {
        this.f37240e = 0.25d;
        this.f37242g = kumVar;
    }
}
