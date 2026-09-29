package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class cm6 implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final cm6 f10272b = new cm6(0);

    /* JADX INFO: renamed from: c */
    public static final cm6 f10273c = new cm6(1);

    /* JADX INFO: renamed from: d */
    public static final cm6 f10274d = new cm6(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10275a;

    public /* synthetic */ cm6(int i) {
        this.f10275a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        switch (this.f10275a) {
            case 0:
                return Boolean.valueOf(((nn3) obj) instanceof C0836c6);
            case 1:
                return Boolean.valueOf(((nn3) obj) instanceof o70);
            default:
                return Boolean.valueOf(((nn3) obj) instanceof C0836c6);
        }
    }
}
