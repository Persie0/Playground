package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class e79 implements s47 {

    /* JADX INFO: renamed from: a */
    public final ht6 f36816a;

    /* JADX INFO: renamed from: b */
    public final String f36817b;

    public e79(ht6 ht6Var, String str) {
        this.f36816a = ht6Var;
        this.f36817b = str;
    }

    @Override // p000.s47
    /* JADX INFO: renamed from: a */
    public final Object mo10912a(nm1 nm1Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i >= charSequence.length()) {
            return Integer.valueOf(i);
        }
        final char cCharAt = charSequence.charAt(i);
        ht6 ht6Var = this.f36816a;
        if (cCharAt == '-') {
            ht6Var.invoke(nm1Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt != '+') {
            return new m47(i, new ui3() { // from class: d79
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return "Expected " + this.f35091a.f36817b + " but got " + cCharAt;
                }
            });
        }
        ht6Var.invoke(nm1Var, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.f36817b;
    }
}
