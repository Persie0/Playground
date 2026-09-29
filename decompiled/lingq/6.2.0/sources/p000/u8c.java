package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u8c implements zhb {

    /* JADX INFO: renamed from: b */
    public static final u8c f63601b = new u8c(0);

    /* JADX INFO: renamed from: c */
    public static final u8c f63602c = new u8c(1);

    /* JADX INFO: renamed from: d */
    public static final u8c f63603d = new u8c(2);

    /* JADX INFO: renamed from: e */
    public static final u8c f63604e = new u8c(3);

    /* JADX INFO: renamed from: f */
    public static final u8c f63605f = new u8c(4);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63606a;

    public /* synthetic */ u8c(int i) {
        this.f63606a = i;
    }

    @Override // p000.zhb
    /* JADX INFO: renamed from: a */
    public final boolean mo22576a(int i) {
        switch (this.f63606a) {
            case 0:
                return i == 0 || i == 1 || i == 2;
            case 1:
                return qma.m20034b(i) != 0;
            case 2:
                return pdd.m19076b(i) != 0;
            case 3:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            default:
                return i == 0 || i == 1;
        }
    }
}
