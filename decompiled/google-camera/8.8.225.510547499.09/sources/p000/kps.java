package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kps {

    /* JADX INFO: renamed from: a */
    public final int f36810a;

    /* JADX INFO: renamed from: b */
    public final List f36811b;

    /* JADX INFO: renamed from: c */
    public final Executor f36812c;

    /* JADX INFO: renamed from: d */
    public final kph f36813d;

    /* JADX INFO: renamed from: e */
    public final kpk f36814e;

    public kps() {
    }

    public kps(int i, List list, Executor executor, kph kphVar, kpk kpkVar) {
        this.f36810a = i;
        this.f36811b = list;
        this.f36812c = executor;
        this.f36813d = kphVar;
        this.f36814e = kpkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kps) {
            kps kpsVar = (kps) obj;
            if (this.f36810a == kpsVar.f36810a && this.f36811b.equals(kpsVar.f36811b) && this.f36812c.equals(kpsVar.f36812c) && this.f36813d.equals(kpsVar.f36813d) && this.f36814e.equals(kpsVar.f36814e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f36810a ^ 1000003) * 1000003) ^ this.f36811b.hashCode()) * 1000003) ^ this.f36812c.hashCode()) * 1000003) ^ this.f36813d.hashCode()) * 1000003) ^ this.f36814e.hashCode();
    }

    public final String toString() {
        return "SessionConfigurationProxy{sessionType=" + this.f36810a + ", outputConfigurations=" + String.valueOf(this.f36811b) + ", executor=" + String.valueOf(this.f36812c) + ", stateCallback=" + String.valueOf(this.f36813d) + ", sessionParameters=" + String.valueOf(this.f36814e) + "}";
    }
}
