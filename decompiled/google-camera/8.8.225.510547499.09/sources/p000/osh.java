package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osh {

    /* JADX INFO: renamed from: a */
    public static final oxz f46490a = new oxz("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    public static final oxz f46491b = new oxz("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    public static final oxz f46492c = new oxz("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    public static final oxz f46493d = new oxz("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    public static final oxz f46494e = new oxz("SEALED");

    /* JADX INFO: renamed from: f */
    public static final ori f46495f = new ori(true);

    /* JADX INFO: renamed from: a */
    public static final Object m19016a(Object obj) {
        return obj instanceof oru ? new orv((oru) obj) : obj;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m19017b(Object obj) {
        orv orvVar = obj instanceof orv ? (orv) obj : null;
        return orvVar != null ? orvVar.f46469a : obj;
    }
}
