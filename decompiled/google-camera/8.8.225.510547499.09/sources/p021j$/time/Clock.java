package p021j$.time;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Clock {
    protected Clock() {
    }

    public static Clock systemUTC() {
        return C0416a.f32910b;
    }

    /* JADX INFO: renamed from: a */
    public long mo12233a() {
        return instant().toEpochMilli();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();
}
