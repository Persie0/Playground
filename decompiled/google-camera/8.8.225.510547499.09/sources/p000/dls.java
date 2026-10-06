package p000;

import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dls implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f11990a;

    public dls(oju ojuVar) {
        this.f11990a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Duration get() {
        Duration durationOfSeconds = Duration.ofSeconds(((Integer) ((dhv) this.f11990a.get()).mo6173a(dib.f11376r).orElse(30)).intValue());
        durationOfSeconds.getClass();
        return durationOfSeconds;
    }
}
