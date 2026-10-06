package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class egm {

    /* JADX INFO: renamed from: a */
    public static final egm f13973a = m7309a(egl.NONE, egn.NOT_REQUESTED);

    /* JADX INFO: renamed from: b */
    public final egl f13974b;

    /* JADX INFO: renamed from: c */
    public final egn f13975c;

    public egm(egl eglVar, egn egnVar) {
        if (eglVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.f13974b = eglVar;
        if (egnVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f13975c = egnVar;
    }

    /* JADX INFO: renamed from: a */
    public static egm m7309a(egl eglVar, egn egnVar) {
        return new egm(eglVar, egnVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egm) {
            egm egmVar = (egm) obj;
            if (this.f13974b.equals(egmVar.f13974b) && this.f13975c.equals(egmVar.f13975c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13974b.hashCode() ^ 1000003) * 1000003) ^ this.f13975c.hashCode();
    }

    public final String toString() {
        return "FusionState{mode=" + this.f13974b.toString() + ", status=" + this.f13975c.toString() + "}";
    }

    public egm() {
    }
}
