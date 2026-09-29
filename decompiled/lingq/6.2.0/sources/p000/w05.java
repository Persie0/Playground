package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class w05 {

    /* JADX INFO: renamed from: a */
    public final boolean f66170a;

    /* JADX INFO: renamed from: b */
    public final boolean f66171b;

    public w05(boolean z, boolean z2) {
        this.f66170a = z;
        this.f66171b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w05)) {
            return false;
        }
        w05 w05Var = (w05) obj;
        return this.f66170a == w05Var.f66170a && this.f66171b == w05Var.f66171b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66171b) + (Boolean.hashCode(this.f66170a) * 31);
    }

    public final String toString() {
        return "LessonDownloadState(isLessonDownloaded=" + this.f66170a + ", isAudioDownloaded=" + this.f66171b + ")";
    }
}
