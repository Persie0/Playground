package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum dja {
    ENG,
    FISHFOOD,
    DOGFOOD,
    RELEASE;

    /* JADX INFO: renamed from: a */
    public final boolean m6199a(dja djaVar) {
        return ordinal() > djaVar.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6200b(dja djaVar) {
        return ordinal() <= djaVar.ordinal();
    }
}
