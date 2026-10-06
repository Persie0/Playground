package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqg implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f2127a;

    /* JADX INFO: renamed from: b */
    public final String f2128b;

    /* JADX INFO: renamed from: c */
    public final String f2129c;

    /* JADX INFO: renamed from: d */
    private final int f2130d;

    public aqg(int i, int i2, String str, String str2) {
        this.f2127a = i;
        this.f2130d = i2;
        this.f2128b = str;
        this.f2129c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aqg aqgVar = (aqg) obj;
        aqgVar.getClass();
        int i = this.f2127a - aqgVar.f2127a;
        return i == 0 ? this.f2130d - aqgVar.f2130d : i;
    }
}
