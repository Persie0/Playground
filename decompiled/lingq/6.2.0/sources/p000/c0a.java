package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class c0a implements dy5 {

    /* JADX INFO: renamed from: a */
    public final long f9293a;

    public c0a(long j) {
        this.f9293a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c0a.class == obj.getClass() && this.f9293a == ((c0a) obj).f9293a;
    }

    public final int hashCode() {
        return hnb.m13380b(this.f9293a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f9293a;
    }
}
