package p021j$.time;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.a */
/* JADX INFO: loaded from: classes3.dex */
final class C0416a extends Clock implements Serializable {

    /* JADX INFO: renamed from: b */
    static final C0416a f32910b;

    /* JADX INFO: renamed from: a */
    private final ZoneId f32911a;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        f32910b = new C0416a(C0468p.f33024f);
    }

    C0416a(C0468p c0468p) {
        this.f32911a = c0468p;
    }

    @Override // p021j$.time.Clock
    /* JADX INFO: renamed from: a */
    public final long mo12233a() {
        return System.currentTimeMillis();
    }

    @Override // p021j$.time.Clock
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0416a)) {
            return false;
        }
        return this.f32911a.equals(((C0416a) obj).f32911a);
    }

    @Override // p021j$.time.Clock
    public final int hashCode() {
        return this.f32911a.hashCode() + 1;
    }

    @Override // p021j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock[" + String.valueOf(this.f32911a) + "]";
    }
}
