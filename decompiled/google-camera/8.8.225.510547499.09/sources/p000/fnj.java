package p000;

import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnj {

    /* JADX INFO: renamed from: a */
    public final Optional f22787a;

    public fnj() {
    }

    public fnj(Optional optional) {
        this.f22787a = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fnj) {
            return this.f22787a.equals(((fnj) obj).f22787a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22787a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ActiveCameraExperimentalKeys{leadCameraIdKey=" + String.valueOf(this.f22787a) + "}";
    }
}
