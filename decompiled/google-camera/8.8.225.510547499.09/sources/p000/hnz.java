package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnz implements hnu {

    /* JADX INFO: renamed from: a */
    public int f28554a = 1;

    /* JADX INFO: renamed from: b */
    public final hnv f28555b;

    /* JADX INFO: renamed from: c */
    public final Runnable f28556c;

    /* JADX INFO: renamed from: d */
    public final Runnable f28557d;

    /* JADX INFO: renamed from: e */
    public final Executor f28558e;

    /* JADX INFO: renamed from: f */
    public final String f28559f;

    public hnz() {
    }

    public hnz(hnv hnvVar, Runnable runnable, Runnable runnable2, Executor executor, String str) {
        this.f28555b = hnvVar;
        this.f28556c = runnable;
        this.f28557d = runnable2;
        this.f28558e = executor;
        this.f28559f = str;
    }

    /* JADX INFO: renamed from: a */
    public static hny m10529a() {
        return new hny();
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final void mo5538by(hnv hnvVar) {
        if (hnvVar != hnv.UNKNOWN) {
            int i = true != hnvVar.m10520a(this.f28555b) ? 3 : 2;
            int i2 = this.f28554a;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == i) {
                return;
            }
            if (i == 2) {
                this.f28558e.execute(new hmm(this, 10));
            } else {
                this.f28558e.execute(new hmm(this, 11));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hnz) {
            hnz hnzVar = (hnz) obj;
            if (this.f28555b.equals(hnzVar.f28555b) && this.f28556c.equals(hnzVar.f28556c) && this.f28557d.equals(hnzVar.f28557d) && this.f28558e.equals(hnzVar.f28558e) && this.f28559f.equals(hnzVar.f28559f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f28555b.hashCode() ^ 1000003) * 1000003) ^ this.f28556c.hashCode()) * 1000003) ^ this.f28557d.hashCode()) * 1000003) ^ this.f28558e.hashCode()) * 1000003) ^ this.f28559f.hashCode();
    }

    public final String toString() {
        return "TwoStateTemperatureListener{threshold=" + String.valueOf(this.f28555b) + ", onEnable=" + String.valueOf(this.f28556c) + ", onDisable=" + String.valueOf(this.f28557d) + ", executor=" + String.valueOf(this.f28558e) + ", featureName=" + this.f28559f + "}";
    }
}
