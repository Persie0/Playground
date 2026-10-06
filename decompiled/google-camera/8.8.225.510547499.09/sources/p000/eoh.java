package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eoh {

    /* JADX INFO: renamed from: a */
    public final gnj f14855a;

    /* JADX INFO: renamed from: b */
    public final eem f14856b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f14857c;

    /* JADX INFO: renamed from: d */
    public final eok f14858d;

    public eoh() {
    }

    public eoh(gnj gnjVar, eem eemVar, AtomicBoolean atomicBoolean, eok eokVar) {
        this.f14855a = gnjVar;
        this.f14856b = eemVar;
        this.f14857c = atomicBoolean;
        this.f14858d = eokVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eoh) {
            eoh eohVar = (eoh) obj;
            if (this.f14855a.equals(eohVar.f14855a) && this.f14856b.equals(eohVar.f14856b) && this.f14857c.equals(eohVar.f14857c) && this.f14858d.equals(eohVar.f14858d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14855a.hashCode() ^ 1000003) * 1000003) ^ this.f14856b.hashCode()) * 1000003) ^ this.f14857c.hashCode()) * 1000003) ^ this.f14858d.hashCode();
    }

    public final String toString() {
        return "AstrolapseInflightShot{hdrPlusParallelInflightShot=" + this.f14855a.toString() + ", gcamShot=" + this.f14856b.toString() + ", processingInitiated=" + this.f14857c.toString() + ", astrolapseSession=" + this.f14858d.toString() + "}";
    }
}
