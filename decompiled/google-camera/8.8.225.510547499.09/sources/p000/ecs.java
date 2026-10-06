package p000;

import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostShutterAfParams;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ecs {

    /* JADX INFO: renamed from: a */
    public final PhysicalStabilityParams f13398a;

    /* JADX INFO: renamed from: b */
    public final PostShutterAfParams f13399b;

    public ecs(PhysicalStabilityParams physicalStabilityParams, PostShutterAfParams postShutterAfParams) {
        if (physicalStabilityParams == null) {
            throw new NullPointerException("Null physicalStabilityParams");
        }
        this.f13398a = physicalStabilityParams;
        if (postShutterAfParams == null) {
            throw new NullPointerException("Null postShutterAfParams");
        }
        this.f13399b = postShutterAfParams;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecs) {
            ecs ecsVar = (ecs) obj;
            if (this.f13398a.equals(ecsVar.f13398a) && this.f13399b.equals(ecsVar.f13399b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13398a.hashCode() ^ 1000003) * 1000003) ^ this.f13399b.hashCode();
    }

    public final String toString() {
        return "TuningParams{physicalStabilityParams=" + this.f13398a.toString() + ", postShutterAfParams=" + this.f13399b.toString() + "}";
    }

    public ecs() {
    }
}
