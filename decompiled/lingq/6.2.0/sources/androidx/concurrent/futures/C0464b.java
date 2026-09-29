package androidx.concurrent.futures;

import p000.fm0;
import p000.gm0;
import p000.r78;

/* JADX INFO: renamed from: androidx.concurrent.futures.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0464b {

    /* JADX INFO: renamed from: a */
    public Object f5328a;

    /* JADX INFO: renamed from: b */
    public gm0 f5329b;

    /* JADX INFO: renamed from: c */
    public r78 f5330c;

    /* JADX INFO: renamed from: d */
    public boolean f5331d;

    /* JADX INFO: renamed from: a */
    public final void m1908a(Object obj) {
        this.f5331d = true;
        gm0 gm0Var = this.f5329b;
        if (gm0Var == null || !gm0Var.f40990b.m22389k(obj)) {
            return;
        }
        this.f5328a = null;
        this.f5329b = null;
        this.f5330c = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1909b(Throwable th) {
        this.f5331d = true;
        gm0 gm0Var = this.f5329b;
        if (gm0Var == null || !gm0Var.f40990b.mo20435l(th)) {
            return;
        }
        this.f5328a = null;
        this.f5329b = null;
        this.f5330c = null;
    }

    public final void finalize() {
        r78 r78Var;
        gm0 gm0Var = this.f5329b;
        if (gm0Var != null) {
            fm0 fm0Var = gm0Var.f40990b;
            if (!fm0Var.isDone()) {
                fm0Var.mo20435l(new CallbackToFutureAdapter$FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5328a));
            }
        }
        if (this.f5331d || (r78Var = this.f5330c) == null) {
            return;
        }
        r78Var.m22389k(null);
    }
}
