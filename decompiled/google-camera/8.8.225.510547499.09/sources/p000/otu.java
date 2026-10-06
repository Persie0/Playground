package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class otu {

    /* JADX INFO: renamed from: a */
    public static final ott f46545a = new ott();

    /* JADX INFO: renamed from: b */
    public final Object f46546b;

    private /* synthetic */ otu(Object obj) {
        this.f46546b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ otu m19065a(Object obj) {
        return new otu(obj);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19066b(Object obj) {
        return !(obj instanceof ott);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof otu) && ooc.m18737c(this.f46546b, ((otu) obj).f46546b);
    }

    public final int hashCode() {
        Object obj = this.f46546b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f46546b;
        if (obj instanceof ots) {
            return ((ots) obj).toString();
        }
        return "Value(" + obj + ")";
    }
}
