package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sm2 extends p33 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ p33 f61019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm2(p33 p33Var) {
        super(9);
        this.f61019d = p33Var;
    }

    @Override // p000.p33
    /* JADX INFO: renamed from: M */
    public final Object mo14164M(vl5 vl5Var) {
        Float f = (Float) ((m79) this.f61019d.f55514c);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
