package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkk {

    /* JADX INFO: renamed from: a */
    public int f28169a;

    /* JADX INFO: renamed from: b */
    private final int f28170b;

    /* JADX INFO: renamed from: c */
    private final boolean f28171c;

    public hkk(int i, boolean z) {
        this.f28170b = i;
        this.f28171c = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10424a() {
        return !this.f28171c && this.f28170b == 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m10425b() {
        switch (this.f28169a) {
            case 0:
                return 4;
            case 1:
                return m10424a() ? 1 : 2;
            default:
                return 3;
        }
    }
}
