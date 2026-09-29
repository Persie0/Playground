package androidx.activity.compose;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C3211a;
import p000.do7;
import p000.oi7;
import p000.pg9;
import p000.u60;
import p000.un1;
import p000.v60;
import p000.w60;
import p000.wfb;
import p000.x60;
import p000.zi3;

/* JADX INFO: renamed from: androidx.activity.compose.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0033a extends x60 {

    /* JADX INFO: renamed from: c */
    public final un1 f1002c;

    /* JADX INFO: renamed from: d */
    public zi3 f1003d;

    /* JADX INFO: renamed from: e */
    public C3211a f1004e;

    /* JADX INFO: renamed from: f */
    public pg9 f1005f;

    /* JADX INFO: renamed from: g */
    public boolean f1006g;

    public C0033a(un1 un1Var, oi7 oi7Var) {
        super(oi7Var);
        this.f1002c = un1Var;
        this.f1003d = new ComposePredictiveBackHandler$currentOnBack$1(2, null);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: e */
    public final void mo631e() {
        C3211a c3211a = this.f1004e;
        if (c3211a != null) {
            c3211a.m15471j(new CancellationException("onBack cancelled"), true);
        }
        pg9 pg9Var = this.f1005f;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        this.f1004e = null;
        this.f1005f = null;
        this.f1006g = false;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: f */
    public final void mo632f() {
        if (this.f1004e != null && !this.f1006g) {
            mo631e();
        }
        if (this.f1004e == null) {
            this.f1006g = false;
            this.f1004e = do7.m10525a(-2, 4, BufferOverflow.SUSPEND);
            this.f1005f = wfb.m23926u(this.f1002c, null, null, new ComposePredictiveBackHandler$launchNewGesture$1(this, null), 3);
        }
        C3211a c3211a = this.f1004e;
        if (c3211a != null) {
            c3211a.mo15331i(null);
        }
        this.f1006g = false;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: g */
    public final void mo633g(u60 u60Var) {
        C3211a c3211a = this.f1004e;
        if (c3211a != null) {
            c3211a.mo4677k(u60Var);
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: h */
    public final void mo634h() {
        mo631e();
        if (super.m24292d()) {
            this.f1006g = true;
            this.f1004e = do7.m10525a(-2, 4, BufferOverflow.SUSPEND);
            this.f1005f = wfb.m23926u(this.f1002c, null, null, new ComposePredictiveBackHandler$launchNewGesture$1(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m635m(boolean z) {
        pg9 pg9Var;
        if (!z && super.m24292d() && (pg9Var = this.f1005f) != null && !pg9Var.mo4538b()) {
            mo631e();
        }
        ((w60) this.f67808a).m15659f(z);
        ((v60) this.f67809b).m3785f(z);
    }
}
