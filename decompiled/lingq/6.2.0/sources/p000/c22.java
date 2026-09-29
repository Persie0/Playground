package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c22 implements s94 {

    /* JADX INFO: renamed from: a */
    public final t94 f9348a;

    public c22(t94 t94Var) {
        this.f9348a = t94Var;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f9348a.f62010a.estimateParsedLength();
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        return this.f9348a.f62010a.parseInto(b22Var, charSequence.toString(), i);
    }
}
