package p000;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.C3247b;

/* JADX INFO: loaded from: classes.dex */
public final class fu8 {

    /* JADX INFO: renamed from: a */
    public final Object f39706a;

    /* JADX INFO: renamed from: b */
    public final aj3 f39707b;

    /* JADX INFO: renamed from: c */
    public final aj3 f39708c;

    /* JADX INFO: renamed from: d */
    public final Object f39709d;

    /* JADX INFO: renamed from: e */
    public final SuspendLambda f39710e;

    /* JADX INFO: renamed from: f */
    public final aj3 f39711f;

    /* JADX INFO: renamed from: g */
    public Object f39712g;

    /* JADX INFO: renamed from: h */
    public int f39713h = -1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3247b f39714i;

    public fu8(C3247b c3247b, Object obj, aj3 aj3Var, aj3 aj3Var2, C0842cc c0842cc, SuspendLambda suspendLambda, aj3 aj3Var3) {
        this.f39714i = c3247b;
        this.f39706a = obj;
        this.f39707b = aj3Var;
        this.f39708c = aj3Var2;
        this.f39709d = c0842cc;
        this.f39710e = suspendLambda;
        this.f39711f = aj3Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m12200a() {
        Object obj = this.f39712g;
        if (obj instanceof au8) {
            ((au8) obj).mo3063m(this.f39713h, this.f39714i.f48170a);
            return;
        }
        ci2 ci2Var = obj instanceof ci2 ? (ci2) obj : null;
        if (ci2Var != null) {
            ci2Var.mo125a();
        }
    }
}
