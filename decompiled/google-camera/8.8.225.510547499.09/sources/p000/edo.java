package p000;

import com.google.googlex.gcam.InterleavedImageU8;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class edo {

    /* JADX INFO: renamed from: a */
    public final eev f13510a;

    /* JADX INFO: renamed from: b */
    public final InterleavedImageU8 f13511b;

    public edo() {
    }

    public edo(eev eevVar, InterleavedImageU8 interleavedImageU8) {
        this.f13510a = eevVar;
        this.f13511b = interleavedImageU8;
    }

    /* JADX INFO: renamed from: a */
    final kbc m7177a() {
        eev eevVar = this.f13510a;
        if (eevVar != null) {
            return new kbc(eevVar.mo7247c(), eevVar.mo7246b());
        }
        InterleavedImageU8 interleavedImageU8 = this.f13511b;
        return interleavedImageU8 != null ? new kbc(interleavedImageU8.m5004c(), interleavedImageU8.m5003b()) : new kbc(0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof edo)) {
            return false;
        }
        edo edoVar = (edo) obj;
        eev eevVar = this.f13510a;
        if (eevVar != null ? eevVar.equals(edoVar.f13510a) : edoVar.f13510a == null) {
            InterleavedImageU8 interleavedImageU8 = this.f13511b;
            InterleavedImageU8 interleavedImageU9 = edoVar.f13511b;
            if (interleavedImageU8 != null ? interleavedImageU8.equals(interleavedImageU9) : interleavedImageU9 == null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Pixels{yuv=" + String.valueOf(this.f13510a) + ", rgb=" + String.valueOf(this.f13511b) + "}";
    }

    public final int hashCode() {
        eev eevVar = this.f13510a;
        int iHashCode = eevVar == null ? 0 : eevVar.hashCode();
        InterleavedImageU8 interleavedImageU8 = this.f13511b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (interleavedImageU8 != null ? interleavedImageU8.hashCode() : 0);
    }
}
