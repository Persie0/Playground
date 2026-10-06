package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvj extends lme {

    /* JADX INFO: renamed from: b */
    public final Set f39398b;

    public lvj(Set set) {
        set.getClass();
        this.f39398b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvj) && ooc.m18737c(this.f39398b, ((lvj) obj).f39398b);
    }

    public final int hashCode() {
        return this.f39398b.hashCode();
    }

    public final String toString() {
        return "AirlockFileStateFilter(values=" + this.f39398b + ")";
    }
}
