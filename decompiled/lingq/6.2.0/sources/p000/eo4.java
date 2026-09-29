package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eo4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dh9 f37607b;

    public /* synthetic */ eo4(dh9 dh9Var, int i) {
        this.f37606a = i;
        this.f37607b = dh9Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f37606a;
        dh9 dh9Var = this.f37607b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) dh9Var.getValue()).floatValue());
            case 1:
                w35 w35Var = (w35) dh9Var.getValue();
                v35 v35Var = w35Var instanceof v35 ? (v35) w35Var : null;
                return v35Var != null ? v35Var.f64787e.f63315d : "";
            case 2:
                return Float.valueOf(((Number) dh9Var.getValue()).floatValue());
            case 3:
                return Float.valueOf(((Number) dh9Var.getValue()).floatValue());
            case 4:
                return new gq6(((gq6) dh9Var.getValue()).f41189a);
            default:
                C2970en c2970en = gv8.f41396a;
                return new gq6(((gq6) dh9Var.getValue()).f41189a);
        }
    }
}
