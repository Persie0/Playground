package p000;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ay0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7658a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f7659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jw0 f7660c;

    public /* synthetic */ ay0(jv0 jv0Var, int i, jw0 jw0Var) {
        this.f7659b = jv0Var;
        this.f7660c = jw0Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7658a;
        xfa xfaVar = xfa.f68157a;
        jw0 jw0Var = this.f7660c;
        jv0 jv0Var = this.f7659b;
        switch (i) {
            case 0:
                String str = jw0Var.f46240a.f18923d;
                str.getClass();
                jv0Var.mo8895v(new Regex("[\\u2190-\\u21FF]|[\\u2300-\\u23FF]|[\\u2600-\\u26FF]|[\\u2700-\\u27BF]|[\\u3000-\\u303F]|[\\uD83C\\uDC00-\\uD83C\\uDFFF]|[\\uD83D\\uDC00-\\uD83D\\uDFFF]|[\\uD83E\\uDD00-\\uD83E\\uDFFF]").m15428g(str, ""));
                break;
            default:
                jv0Var.mo8877d(jw0Var.f46240a.f18923d);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ay0(jv0 jv0Var, jw0 jw0Var) {
        this.f7659b = jv0Var;
        this.f7660c = jw0Var;
    }
}
