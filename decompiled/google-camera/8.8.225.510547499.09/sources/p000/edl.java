package p000;

import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class edl {

    /* JADX INFO: renamed from: a */
    public final RawWriteView f13495a;

    /* JADX INFO: renamed from: b */
    public final FrameMetadata f13496b;

    /* JADX INFO: renamed from: c */
    public final SpatialGainMap f13497c;

    /* JADX INFO: renamed from: d */
    public final AeShotParams f13498d;

    /* JADX INFO: renamed from: e */
    public final float f13499e;

    public edl() {
    }

    public edl(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, AeShotParams aeShotParams, float f) {
        this.f13495a = rawWriteView;
        this.f13496b = frameMetadata;
        this.f13497c = spatialGainMap;
        this.f13498d = aeShotParams;
        this.f13499e = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edl) {
            edl edlVar = (edl) obj;
            if (this.f13495a.equals(edlVar.f13495a) && this.f13496b.equals(edlVar.f13496b) && this.f13497c.equals(edlVar.f13497c) && this.f13498d.equals(edlVar.f13498d) && Float.floatToIntBits(this.f13499e) == Float.floatToIntBits(edlVar.f13499e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f13495a.hashCode() ^ 1000003) * 1000003) ^ this.f13496b.hashCode()) * 1000003) ^ this.f13497c.hashCode()) * 1000003) ^ this.f13498d.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f13499e);
    }

    public final String toString() {
        return "HdrPlusViewfinderFrame{rawWriteView=" + this.f13495a.toString() + ", metadata=" + this.f13496b.toString() + ", spatialGainMap=" + this.f13497c.toString() + ", aeShotParams=" + this.f13498d.toString() + ", viewfinderTet=" + this.f13499e + "}";
    }
}
