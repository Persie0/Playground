package p000;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: fp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0191fp extends AbstractC0199fx implements InterfaceC0223gu {

    /* JADX INFO: renamed from: a */
    public final C0225gw f22994a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0198fw f22995b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0192fq f22996c;

    /* JADX INFO: renamed from: f */
    private final Context f22997f;

    /* JADX INFO: renamed from: g */
    private WeakReference f22998g;

    public C0191fp(C0192fq c0192fq, Context context, InterfaceC0198fw interfaceC0198fw) {
        this.f22996c = c0192fq;
        this.f22997f = context;
        this.f22995b = interfaceC0198fw;
        C0225gw c0225gw = new C0225gw(context);
        c0225gw.m9820D();
        this.f22994a = c0225gw;
        c0225gw.f26548b = this;
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: D */
    public final void mo8237D(C0225gw c0225gw) {
        if (this.f22995b == null) {
            return;
        }
        mo8649g();
        this.f22996c.f23157e.m1050n();
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: H */
    public final boolean mo8241H(C0225gw c0225gw, MenuItem menuItem) {
        InterfaceC0198fw interfaceC0198fw = this.f22995b;
        if (interfaceC0198fw != null) {
            return interfaceC0198fw.mo7670b(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: a */
    public final Menu mo8643a() {
        return this.f22994a;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: b */
    public final MenuInflater mo8644b() {
        return new C0206gd(this.f22997f);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: c */
    public final View mo8645c() {
        WeakReference weakReference = this.f22998g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: d */
    public final CharSequence mo8646d() {
        return this.f22996c.f23157e.f948h;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: e */
    public final CharSequence mo8647e() {
        return this.f22996c.f23157e.f947g;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: g */
    public final void mo8649g() {
        if (this.f22996c.f23159g != this) {
            return;
        }
        this.f22994a.m9839s();
        try {
            this.f22995b.mo7672d(this, this.f22994a);
        } finally {
            this.f22994a.m9838r();
        }
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: h */
    public final void mo8650h(View view) {
        this.f22996c.f23157e.m1046j(view);
        this.f22998g = new WeakReference(view);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: i */
    public final void mo8651i(int i) {
        mo8652j(this.f22996c.f23153a.getResources().getString(i));
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: j */
    public final void mo8652j(CharSequence charSequence) {
        this.f22996c.f23157e.m1047k(charSequence);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: k */
    public final void mo8653k(int i) {
        mo8654l(this.f22996c.f23153a.getResources().getString(i));
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: l */
    public final void mo8654l(CharSequence charSequence) {
        this.f22996c.f23157e.m1048l(charSequence);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: m */
    public final void mo8655m(boolean z) {
        this.f23785e = z;
        this.f22996c.f23157e.m1049m(z);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: n */
    public final boolean mo8656n() {
        return this.f22996c.f23157e.f950j;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: f */
    public final void mo8648f() {
        C0192fq c0192fq = this.f22996c;
        if (c0192fq.f23159g != this) {
            return;
        }
        if (C0192fq.m8688y(c0192fq.f23164l, false)) {
            this.f22995b.mo7669a(this);
        } else {
            c0192fq.f23160h = this;
            c0192fq.f23161i = this.f22995b;
        }
        this.f22995b = null;
        this.f22996c.m8690v(false);
        ActionBarContextView actionBarContextView = this.f22996c.f23157e;
        if (actionBarContextView.f949i == null) {
            actionBarContextView.m1045i();
        }
        C0192fq c0192fq2 = this.f22996c;
        c0192fq2.f23154b.m1058k(c0192fq2.f23166n);
        this.f22996c.f23159g = null;
    }
}
