package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ef9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f37194c;

    public /* synthetic */ ef9(Object obj, float f, int i) {
        this.f37192a = i;
        this.f37193b = obj;
        this.f37194c = f;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f37192a;
        xfa xfaVar = xfa.f68157a;
        float f = this.f37194c;
        Object obj = this.f37193b;
        switch (i) {
            case 0:
                ((vi3) obj).invoke(Float.valueOf(f));
                return xfaVar;
            case 1:
                ((vi3) obj).invoke(Float.valueOf(f));
                return xfaVar;
            default:
                return Float.valueOf(((float) ((hr0) obj).f42816a) / f);
        }
    }
}
