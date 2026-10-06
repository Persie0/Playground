package p000;

import java.util.concurrent.ScheduledExecutorService;
import p021j$.time.Clock;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f11980a;

    /* JADX INFO: renamed from: b */
    private final oju f11981b;

    /* JADX INFO: renamed from: c */
    private final oju f11982c;

    /* JADX INFO: renamed from: d */
    private final oju f11983d;

    /* JADX INFO: renamed from: e */
    private final oju f11984e;

    /* JADX INFO: renamed from: f */
    private final oju f11985f;

    /* JADX INFO: renamed from: g */
    private final oju f11986g;

    /* JADX INFO: renamed from: h */
    private final oju f11987h;

    public dlq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        this.f11980a = ojuVar;
        this.f11981b = ojuVar2;
        this.f11982c = ojuVar3;
        this.f11983d = ojuVar4;
        this.f11984e = ojuVar5;
        this.f11985f = ojuVar6;
        this.f11986g = ojuVar7;
        this.f11987h = ojuVar8;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dlp get() {
        jvd jvdVar = (jvd) this.f11981b.get();
        kbo kboVar = ((kbm) this.f11982c).get();
        kbz kbzVar = (kbz) this.f11983d.get();
        Clock clockM5876c = dbk.m5876c();
        Duration duration = ((dls) this.f11984e).get();
        ((cde) this.f11985f).m3490a().booleanValue();
        return new dlp(jvdVar, kboVar, kbzVar, clockM5876c, duration, (ScheduledExecutorService) this.f11986g.get(), (dlv) this.f11987h.get());
    }
}
