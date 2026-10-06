package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fur implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23605a;

    /* JADX INFO: renamed from: b */
    private final oju f23606b;

    public fur(oju ojuVar, oju ojuVar2) {
        this.f23605a = ojuVar;
        this.f23606b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static fur m8814a(oju ojuVar, oju ojuVar2) {
        return new fur(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jvs get() {
        return new jvs((ScheduledExecutorService) this.f23605a.get(), ((cmv) this.f23606b).m3973a().intValue(), TimeUnit.SECONDS);
    }
}
