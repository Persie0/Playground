package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class hab {

    /* JADX INFO: renamed from: a */
    public final gzw f27085a;

    /* JADX INFO: renamed from: b */
    public final jww f27086b;

    public hab(gzw gzwVar, jww jwwVar) {
        if (gzwVar == null) {
            throw new NullPointerException("Null settingsKey");
        }
        this.f27085a = gzwVar;
        this.f27086b = jwwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hab) {
            hab habVar = (hab) obj;
            if (this.f27085a.equals(habVar.f27085a) && this.f27086b.equals(habVar.f27086b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27085a.hashCode() ^ 1000003) * 1000003) ^ this.f27086b.hashCode();
    }

    public final String toString() {
        return "KeyAndProperty{settingsKey=" + this.f27085a.toString() + ", property=" + this.f27086b.toString() + "}";
    }

    public hab() {
    }
}
