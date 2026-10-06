package p000;

import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmg {

    /* JADX INFO: renamed from: a */
    public final String f36540a;

    /* JADX INFO: renamed from: b */
    public final int f36541b;

    /* JADX INFO: renamed from: c */
    private final Integer f36542c;

    private kmg(Integer num, String str) {
        this.f36542c = num;
        this.f36540a = str;
        this.f36541b = Objects.hash(str, 0);
    }

    /* JADX INFO: renamed from: b */
    public static kmg m14575b(String str) {
        Integer numValueOf;
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            numValueOf = null;
        }
        return new kmg(numValueOf, str);
    }

    /* JADX INFO: renamed from: a */
    public final int m14576a() {
        Integer num = this.f36542c;
        if (num != null) {
            return num.intValue();
        }
        throw new UnsupportedOperationException("Attempted to access a camera id that is not supported on legacy camera API's: ".concat(String.valueOf(this.f36540a)));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14577c() {
        return this.f36542c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f36540a.equals(((kmg) obj).f36540a);
    }

    public final int hashCode() {
        return this.f36541b;
    }

    public final String toString() {
        return this.f36540a;
    }
}
