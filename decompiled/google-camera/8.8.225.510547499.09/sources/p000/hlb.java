package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlb {

    /* JADX INFO: renamed from: a */
    public final boolean f28234a;

    /* JADX INFO: renamed from: b */
    public final boolean f28235b;

    public hlb() {
    }

    public hlb(boolean z, boolean z2) {
        this.f28234a = z;
        this.f28235b = z2;
    }

    /* JADX INFO: renamed from: a */
    public static hla m10435a() {
        hla hlaVar = new hla();
        hlaVar.m10434c(true);
        hlaVar.m10433b(true);
        return hlaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hlb) {
            hlb hlbVar = (hlb) obj;
            if (this.f28234a == hlbVar.f28234a && this.f28235b == hlbVar.f28235b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.f28234a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.f28235b ? 1231 : 1237);
    }

    public final String toString() {
        return "RecordOptions{logDurationFromStart=" + this.f28234a + ", logDurationFromLast=" + this.f28235b + "}";
    }
}
