package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ora extends qra {

    /* JADX INFO: renamed from: a */
    public final j2c f54799a;

    public ora(j2c j2cVar) {
        this.f54799a = j2cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ora) && this.f54799a.equals(((ora) obj).f54799a);
    }

    public final int hashCode() {
        return this.f54799a.hashCode();
    }

    public final String toString() {
        return "VideoPlayerAction(action=" + this.f54799a + ")";
    }
}
