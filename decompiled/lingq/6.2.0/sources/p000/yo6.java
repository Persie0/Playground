package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yo6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70163a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70164b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f70165c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f70166d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f70167e;

    public /* synthetic */ yo6(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f70163a = i2;
        this.f70165c = obj;
        this.f70166d = obj2;
        this.f70164b = i;
        this.f70167e = obj3;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f70163a;
        Object obj = this.f70167e;
        int i2 = this.f70164b;
        Object obj2 = this.f70166d;
        Object obj3 = this.f70165c;
        switch (i) {
            case 0:
                StringBuilder sbM17742q = AbstractC3393o1.m17742q("Can not interpret the string '", (String) obj3, "' as ");
                sbM17742q.append(((wo6) ((zo6) obj2).f71848a.get(i2)).f67124b);
                sbM17742q.append(": ");
                sbM17742q.append(((xo6) obj).mo9832b());
                return sbM17742q.toString();
            default:
                ((t66) obj).setValue(Boolean.FALSE);
                ((vi3) obj3).invoke(((u19) obj2).f63252a.get(i2));
                return xfa.f68157a;
        }
    }
}
