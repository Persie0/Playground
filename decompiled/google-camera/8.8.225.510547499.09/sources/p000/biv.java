package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biv {

    /* JADX INFO: renamed from: a */
    public final List f3459a;

    /* JADX INFO: renamed from: b */
    public final double f3460b;

    /* JADX INFO: renamed from: c */
    private final char f3461c;

    /* JADX INFO: renamed from: d */
    private final String f3462d;

    /* JADX INFO: renamed from: e */
    private final String f3463e;

    public biv(List list, char c, double d, String str, String str2) {
        this.f3459a = list;
        this.f3461c = c;
        this.f3460b = d;
        this.f3462d = str;
        this.f3463e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m2513a(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return m2513a(this.f3461c, this.f3463e, this.f3462d);
    }
}
