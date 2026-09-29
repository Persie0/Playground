package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineExceptionHandler;
import p000.C3006fm;
import p000.bna;
import p000.eh0;
import p000.in1;
import p000.jn1;
import p000.kn1;
import p000.nf1;
import p000.pg9;
import p000.rcd;
import p000.s46;
import p000.vl1;
import p000.vz1;
import p000.wfb;
import p000.x48;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0273b implements x48, CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final kn1 f3723a;

    /* JADX INFO: renamed from: b */
    public final zi3 f3724b;

    /* JADX INFO: renamed from: c */
    public final vl1 f3725c;

    /* JADX INFO: renamed from: d */
    public pg9 f3726d;

    public C0273b(kn1 kn1Var, zi3 zi3Var) {
        this.f3723a = kn1Var;
        this.f3724b = zi3Var;
        this.f3725c = vz1.m23619a(kn1Var.plus(this));
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: d */
    public final void mo1245d() {
        pg9 pg9Var = this.f3726d;
        if (pg9Var != null) {
            pg9Var.mo15330B(new LeftCompositionCancellationException());
        }
        this.f3726d = null;
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: f */
    public final void mo1246f() {
        pg9 pg9Var = this.f3726d;
        if (pg9Var != null) {
            pg9Var.mo15330B(new LeftCompositionCancellationException());
        }
        this.f3726d = null;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.x48
    /* JADX INFO: renamed from: g */
    public final void mo1247g() {
        pg9 pg9Var = this.f3726d;
        if (pg9Var != null) {
            pg9Var.mo4537a(rcd.m20580a("Old job was still running!", null));
        }
        this.f3726d = wfb.m23926u(this.f3725c, null, null, this.f3724b, 3);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.in1
    public final jn1 getKey() {
        return s46.f60287b;
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* JADX INFO: renamed from: p */
    public final void mo1248p(kn1 kn1Var, Throwable th) throws Throwable {
        nf1 nf1Var = (nf1) kn1Var.get(nf1.f52669b);
        if (nf1Var != null) {
            bna.m3988z0(th, new C3006fm(5, nf1Var, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f3723a.get(s46.f60287b);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.mo1248p(kn1Var, th);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
