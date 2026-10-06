package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cut implements hnu {

    /* JADX INFO: renamed from: a */
    public hnz f9681a;

    /* JADX INFO: renamed from: b */
    public hnv f9682b;

    /* JADX INFO: renamed from: c */
    public final hnv f9683c;

    /* JADX INFO: renamed from: d */
    public final Runnable f9684d;

    /* JADX INFO: renamed from: e */
    public final Runnable f9685e;

    /* JADX INFO: renamed from: f */
    public final Executor f9686f;

    /* JADX INFO: renamed from: g */
    public final String f9687g;

    /* JADX INFO: renamed from: h */
    public final cus f9688h;

    public cut() {
        hnv hnvVar = hnv.COLD;
        throw null;
    }

    public cut(hnv hnvVar, Runnable runnable, Runnable runnable2, Executor executor, String str, cus cusVar) {
        this.f9682b = hnv.UNKNOWN;
        this.f9683c = hnvVar;
        this.f9684d = runnable;
        this.f9685e = runnable2;
        this.f9686f = executor;
        this.f9687g = str;
        this.f9688h = cusVar;
    }

    /* JADX INFO: renamed from: a */
    public static egi m5543a() {
        return new egi();
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final void mo5538by(hnv hnvVar) {
        this.f9681a.mo5538by(hnvVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cut) {
            cut cutVar = (cut) obj;
            if (this.f9683c.equals(cutVar.f9683c) && this.f9684d.equals(cutVar.f9684d) && this.f9685e.equals(cutVar.f9685e) && this.f9686f.equals(cutVar.f9686f) && this.f9687g.equals(cutVar.f9687g)) {
                cus cusVar = this.f9688h;
                cus cusVar2 = cutVar.f9688h;
                if (cusVar != null ? cusVar.equals(cusVar2) : cusVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f9683c.hashCode() ^ 1000003) * 1000003) ^ this.f9684d.hashCode()) * 1000003) ^ this.f9685e.hashCode()) * 1000003) ^ this.f9686f.hashCode()) * 1000003) ^ this.f9687g.hashCode();
        cus cusVar = this.f9688h;
        return (iHashCode * 1000003) ^ (cusVar == null ? 0 : cusVar.hashCode());
    }

    public final String toString() {
        return "VideoTwoStateTemperatureListener{threshold=" + String.valueOf(this.f9683c) + ", onEnable=" + String.valueOf(this.f9684d) + ", onDisable=" + String.valueOf(this.f9685e) + ", executor=" + String.valueOf(this.f9686f) + ", featureName=" + this.f9687g + ", dynamicThresholdDecider=" + String.valueOf(this.f9688h) + "}";
    }
}
