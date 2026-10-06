package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akq {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final akp Companion = new akp();

    /* JADX INFO: renamed from: a */
    public final akr m871a() {
        switch (this) {
            case ON_CREATE:
            case ON_STOP:
                return akr.CREATED;
            case ON_START:
            case ON_PAUSE:
                return akr.f595d;
            case ON_RESUME:
                return akr.RESUMED;
            case ON_DESTROY:
                return akr.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(toString().concat(" has no target state"));
        }
    }
}
