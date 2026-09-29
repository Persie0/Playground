package androidx.lifecycle;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.C3248a;
import p000.cd4;
import p000.rb5;
import p000.sm0;
import p000.ub5;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0709c implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lifecycle$Event f6339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f6340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un1 f6341c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lifecycle$Event f6342d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sm0 f6343e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3248a f6344f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zi3 f6345g;

    public C0709c(Lifecycle$Event lifecycle$Event, Ref$ObjectRef ref$ObjectRef, un1 un1Var, Lifecycle$Event lifecycle$Event2, sm0 sm0Var, C3248a c3248a, zi3 zi3Var) {
        this.f6339a = lifecycle$Event;
        this.f6340b = ref$ObjectRef;
        this.f6341c = un1Var;
        this.f6342d = lifecycle$Event2;
        this.f6343e = sm0Var;
        this.f6344f = c3248a;
        this.f6345g = zi3Var;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        Lifecycle$Event lifecycle$Event2 = this.f6339a;
        Ref$ObjectRef ref$ObjectRef = this.f6340b;
        if (lifecycle$Event == lifecycle$Event2) {
            ref$ObjectRef.f47718a = wfb.m23926u(this.f6341c, null, null, new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.f6344f, this.f6345g, null), 3);
            return;
        }
        if (lifecycle$Event == this.f6342d) {
            cd4 cd4Var = (cd4) ref$ObjectRef.f47718a;
            if (cd4Var != null) {
                cd4Var.mo4537a(null);
            }
            ref$ObjectRef.f47718a = null;
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.f6343e.resumeWith(xfa.f68157a);
        }
    }
}
