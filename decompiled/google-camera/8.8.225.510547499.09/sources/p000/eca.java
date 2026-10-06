package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eca {

    /* JADX INFO: renamed from: a */
    public final String f13328a;

    /* JADX INFO: renamed from: b */
    public final nro f13329b;

    /* JADX INFO: renamed from: c */
    public final int f13330c;

    /* JADX INFO: renamed from: d */
    public final kpl f13331d;

    public eca(String str, nro nroVar, int i, kpl kplVar) {
        this.f13328a = str;
        this.f13329b = nroVar;
        this.f13330c = i;
        if (kplVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.f13331d = kplVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eca) {
            eca ecaVar = (eca) obj;
            if (this.f13328a.equals(ecaVar.f13328a) && this.f13329b.equals(ecaVar.f13329b) && this.f13330c == ecaVar.f13330c && this.f13331d.equals(ecaVar.f13331d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13328a.hashCode() ^ 1000003) * 1000003) ^ this.f13329b.hashCode()) * 1000003) ^ this.f13330c) * 1000003) ^ this.f13331d.hashCode();
    }

    public final String toString() {
        return "MetadataRecord{debugFolder=" + this.f13328a + ", frameType=" + this.f13329b.f44266d + ", frameIndex=" + this.f13330c + ", metadata=" + this.f13331d.toString() + "}";
    }

    public eca() {
    }
}
