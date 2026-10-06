package p000;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntv {

    /* JADX INFO: renamed from: a */
    public final RawWriteView f44590a;

    /* JADX INFO: renamed from: b */
    public final FrameMetadata f44591b;

    /* JADX INFO: renamed from: c */
    public final SpatialGainMap f44592c;

    /* JADX INFO: renamed from: d */
    public final Runnable f44593d;

    public ntv(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, Runnable runnable) {
        this.f44590a = rawWriteView;
        this.f44591b = frameMetadata;
        this.f44592c = spatialGainMap;
        if (runnable == null) {
            throw new NullPointerException("Null closeCallback");
        }
        this.f44593d = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static ntv m17691a(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, Runnable runnable) {
        return new ntv(rawWriteView, frameMetadata, spatialGainMap, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntv) {
            ntv ntvVar = (ntv) obj;
            if (this.f44590a.equals(ntvVar.f44590a) && this.f44591b.equals(ntvVar.f44591b) && this.f44592c.equals(ntvVar.f44592c) && this.f44593d.equals(ntvVar.f44593d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f44590a.hashCode() ^ 1000003) * 1000003) ^ this.f44591b.hashCode()) * 1000003) ^ this.f44592c.hashCode()) * 1000003) ^ this.f44593d.hashCode();
    }

    public final String toString() {
        return "HdrPlusFrame{rawWriteView=" + this.f44590a.toString() + ", frameMetadata=" + this.f44591b.toString() + ", spatialGainMap=" + this.f44592c.toString() + ", closeCallback=" + this.f44593d.toString() + "}";
    }

    public ntv() {
    }
}
