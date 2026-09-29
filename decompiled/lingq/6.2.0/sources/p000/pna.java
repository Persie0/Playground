package p000;

import androidx.window.core.VerificationMode;

/* JADX INFO: loaded from: classes2.dex */
public final class pna extends c4d {

    /* JADX INFO: renamed from: a */
    public final Object f56534a;

    /* JADX INFO: renamed from: b */
    public final VerificationMode f56535b;

    /* JADX INFO: renamed from: c */
    public final q41 f56536c;

    public pna(Object obj, VerificationMode verificationMode, q41 q41Var) {
        obj.getClass();
        verificationMode.getClass();
        this.f56534a = obj;
        this.f56535b = verificationMode;
        this.f56536c = q41Var;
    }

    @Override // p000.c4d
    /* JADX INFO: renamed from: a */
    public final Object mo4311a() {
        return this.f56534a;
    }

    @Override // p000.c4d
    /* JADX INFO: renamed from: c */
    public final c4d mo4312c(String str, vi3 vi3Var) {
        Object obj = this.f56534a;
        return ((Boolean) vi3Var.invoke(obj)).booleanValue() ? this : new lz2(obj, str, this.f56536c, this.f56535b);
    }
}
