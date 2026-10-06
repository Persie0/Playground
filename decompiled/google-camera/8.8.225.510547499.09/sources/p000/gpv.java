package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpv {

    /* JADX INFO: renamed from: a */
    public final mrm f26028a;

    /* JADX INFO: renamed from: b */
    public final mrm f26029b;

    /* JADX INFO: renamed from: c */
    public final mrm f26030c;

    public gpv() {
    }

    public gpv(mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        this.f26028a = mrmVar;
        this.f26029b = mrmVar2;
        this.f26030c = mrmVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpv) {
            gpv gpvVar = (gpv) obj;
            if (this.f26028a.equals(gpvVar.f26028a) && this.f26029b.equals(gpvVar.f26029b) && this.f26030c.equals(gpvVar.f26030c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f26028a.hashCode() ^ 1000003) * 1000003) ^ this.f26029b.hashCode()) * 1000003) ^ this.f26030c.hashCode();
    }

    public final String toString() {
        return "PortraitJpegMetadata{main=" + String.valueOf(this.f26028a) + ", extended=" + String.valueOf(this.f26029b) + ", dynamicDepthResult=" + String.valueOf(this.f26030c) + "}";
    }
}
