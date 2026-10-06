package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bby {

    /* JADX INFO: renamed from: a */
    public final String f2931a;

    /* JADX INFO: renamed from: b */
    public final Long f2932b;

    public bby(String str, Long l) {
        this.f2931a = str;
        this.f2932b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bby)) {
            return false;
        }
        bby bbyVar = (bby) obj;
        return ooc.m18737c(this.f2931a, bbyVar.f2931a) && ooc.m18737c(this.f2932b, bbyVar.f2932b);
    }

    public final int hashCode() {
        return (this.f2931a.hashCode() * 31) + this.f2932b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.f2931a + ", value=" + this.f2932b + ')';
    }
}
