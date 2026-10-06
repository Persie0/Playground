package p000;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: fy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0200fy extends AbstractC0199fx implements InterfaceC0223gu {

    /* JADX INFO: renamed from: a */
    public final C0225gw f23851a;

    /* JADX INFO: renamed from: b */
    private final Context f23852b;

    /* JADX INFO: renamed from: c */
    private final ActionBarContextView f23853c;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0198fw f23854f;

    /* JADX INFO: renamed from: g */
    private WeakReference f23855g;

    /* JADX INFO: renamed from: h */
    private boolean f23856h;

    public C0200fy(Context context, ActionBarContextView actionBarContextView, InterfaceC0198fw interfaceC0198fw) {
        this.f23852b = context;
        this.f23853c = actionBarContextView;
        this.f23854f = interfaceC0198fw;
        C0225gw c0225gw = new C0225gw(actionBarContextView.getContext());
        c0225gw.m9820D();
        this.f23851a = c0225gw;
        c0225gw.f26548b = this;
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: D */
    public final void mo8237D(C0225gw c0225gw) {
        mo8649g();
        this.f23853c.m1050n();
    }

    @Override // p000.InterfaceC0223gu
    /* JADX INFO: renamed from: H */
    public final boolean mo8241H(C0225gw c0225gw, MenuItem menuItem) {
        return this.f23854f.mo7670b(this, menuItem);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: a */
    public final Menu mo8643a() {
        return this.f23851a;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: b */
    public final MenuInflater mo8644b() {
        return new C0206gd(this.f23853c.getContext());
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: c */
    public final View mo8645c() {
        WeakReference weakReference = this.f23855g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: d */
    public final CharSequence mo8646d() {
        return this.f23853c.f948h;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: e */
    public final CharSequence mo8647e() {
        return this.f23853c.f947g;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: f */
    public final void mo8648f() {
        if (this.f23856h) {
            return;
        }
        this.f23856h = true;
        this.f23854f.mo7669a(this);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: g */
    public final void mo8649g() {
        this.f23854f.mo7672d(this, this.f23851a);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: h */
    public final void mo8650h(View view) {
        this.f23853c.m1046j(view);
        this.f23855g = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: i */
    public final void mo8651i(int i) {
        mo8652j(this.f23852b.getString(i));
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: j */
    public final void mo8652j(CharSequence charSequence) {
        this.f23853c.m1047k(charSequence);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: k */
    public final void mo8653k(int i) {
        mo8654l(this.f23852b.getString(i));
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: l */
    public final void mo8654l(CharSequence charSequence) {
        this.f23853c.m1048l(charSequence);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: m */
    public final void mo8655m(boolean z) {
        this.f23785e = z;
        this.f23853c.m1049m(z);
    }

    @Override // p000.AbstractC0199fx
    /* JADX INFO: renamed from: n */
    public final boolean mo8656n() {
        return this.f23853c.f950j;
    }
}
