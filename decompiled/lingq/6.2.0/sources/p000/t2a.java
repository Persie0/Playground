package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final String f61774a;

    /* JADX INFO: renamed from: b */
    public final String f61775b;

    public t2a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f61774a = str;
        this.f61775b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2a)) {
            return false;
        }
        t2a t2aVar = (t2a) obj;
        return fa4.m11650l(this.f61774a, t2aVar.f61774a) && fa4.m11650l(this.f61775b, t2aVar.f61775b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ux5.m22980c(this.f61774a.hashCode() * 31, this.f61775b, 31);
    }

    public final String toString() {
        return ux5.m22991n("PlayTts(language=", this.f61774a, ", term=", this.f61775b, ", autoPlay=true)");
    }
}
