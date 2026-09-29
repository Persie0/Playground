package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vs4 implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final vs4 f65852b = new vs4(0);

    /* JADX INFO: renamed from: c */
    public static final vs4 f65853c = new vs4(1);

    /* JADX INFO: renamed from: d */
    public static final vs4 f65854d = new vs4(2);

    /* JADX INFO: renamed from: e */
    public static final vs4 f65855e = new vs4(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65856a;

    public /* synthetic */ vs4(int i) {
        this.f65856a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        switch (this.f65856a) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                ((Number) obj).intValue();
                return null;
            default:
                if (fa4.m11650l(obj, Boolean.FALSE)) {
                    return new aa1(aa1.f412k);
                }
                obj.getClass();
                return new aa1(d32.m10035e(((Integer) obj).intValue()));
        }
    }
}
