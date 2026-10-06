package p000;

import java.math.BigInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awh implements Comparable {

    /* JADX INFO: renamed from: a */
    public static final awh f2580a;

    /* JADX INFO: renamed from: b */
    public final int f2581b;

    /* JADX INFO: renamed from: c */
    public final int f2582c;

    /* JADX INFO: renamed from: d */
    public final int f2583d;

    /* JADX INFO: renamed from: e */
    private final String f2584e;

    /* JADX INFO: renamed from: f */
    private final ojy f2585f = lkm.m15593t(new C0910po(this, 7));

    static {
        new awh(0, 0, 0, "");
        f2580a = new awh(0, 1, 0, "");
        new awh(1, 0, 0, "");
    }

    public awh(int i, int i2, int i3, String str) {
        this.f2581b = i;
        this.f2582c = i2;
        this.f2583d = i3;
        this.f2584e = str;
    }

    /* JADX INFO: renamed from: b */
    private final BigInteger m2074b() {
        Object objMo18586a = this.f2585f.mo18586a();
        objMo18586a.getClass();
        return (BigInteger) objMo18586a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(awh awhVar) {
        awhVar.getClass();
        return m2074b().compareTo(awhVar.m2074b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awh)) {
            return false;
        }
        awh awhVar = (awh) obj;
        return this.f2581b == awhVar.f2581b && this.f2582c == awhVar.f2582c && this.f2583d == awhVar.f2583d;
    }

    public final int hashCode() {
        return ((((this.f2581b + 527) * 31) + this.f2582c) * 31) + this.f2583d;
    }

    public final String toString() {
        String str;
        if (ook.m18800n(this.f2584e)) {
            str = "";
        } else {
            str = '-' + this.f2584e;
        }
        return this.f2581b + '.' + this.f2582c + '.' + this.f2583d + str;
    }
}
