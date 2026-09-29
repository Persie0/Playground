package p000;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jy0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46379a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f46380b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f46381c;

    public /* synthetic */ jy0(jv0 jv0Var, int i, String str) {
        this.f46380b = jv0Var;
        this.f46381c = str;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f46379a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f46381c;
        jv0 jv0Var = this.f46380b;
        switch (i) {
            case 0:
                jv0Var.mo8877d(str);
                break;
            default:
                jv0Var.mo8895v(new Regex("[\\u2190-\\u21FF]|[\\u2300-\\u23FF]|[\\u2600-\\u26FF]|[\\u2700-\\u27BF]|[\\u3000-\\u303F]|[\\uD83C\\uDC00-\\uD83C\\uDFFF]|[\\uD83D\\uDC00-\\uD83D\\uDFFF]|[\\uD83E\\uDD00-\\uD83E\\uDFFF]").m15428g(str, ""));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ jy0(jv0 jv0Var, String str) {
        this.f46380b = jv0Var;
        this.f46381c = str;
    }
}
