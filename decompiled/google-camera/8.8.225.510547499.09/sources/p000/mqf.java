package p000;

import java.util.ArrayList;
import p021j$.time.Duration;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqf {

    /* JADX INFO: renamed from: a */
    private final Duration f41362a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f41363b = new ArrayList(1000);

    /* JADX INFO: renamed from: c */
    private int f41364c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f41365d = true;

    public mqf(Duration duration) {
        this.f41362a = duration;
        for (int i = 0; i < 1000; i++) {
            this.f41363b.add(Instant.EPOCH);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized double m16804a() {
        if (this.f41365d && this.f41364c == 0) {
            return 0.0d;
        }
        nnf nnfVar = nnf.INSTANCE;
        Instant instantNow = Instant.now();
        Duration duration = Duration.ZERO;
        int i = this.f41364c;
        int i2 = true != this.f41365d ? i : 999;
        int i3 = 0;
        do {
            Instant instant = (Instant) this.f41363b.get(i);
            Duration durationBetween = Duration.between(instant, instantNow);
            if (durationBetween.compareTo(this.f41362a) > 0) {
                break;
            }
            if (instant.isAfter(Instant.EPOCH)) {
                if (duration.compareTo(durationBetween) < 0) {
                    duration = durationBetween;
                }
                i3++;
            }
            i = i <= 0 ? 999 : i - 1;
        } while (i != i2);
        double d = i3;
        long millis = duration.toMillis();
        Double.isNaN(d);
        double d2 = millis;
        Double.isNaN(d2);
        return (d * 1000.0d) / d2;
    }

    /* JADX INFO: renamed from: b */
    public final void m16805b() {
        nnf nnfVar = nnf.INSTANCE;
        m16806c(Instant.now());
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16806c(Instant instant) {
        int i = this.f41364c + 1;
        this.f41364c = i;
        if (i >= 1000) {
            i = 0;
            this.f41364c = 0;
            this.f41365d = false;
        }
        this.f41363b.set(i, instant);
    }
}
