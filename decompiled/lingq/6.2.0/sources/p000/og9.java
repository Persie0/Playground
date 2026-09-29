package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0035b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class og9 extends AbstractC0799b6 implements fw5 {

    /* JADX INFO: renamed from: c */
    public final Context f54321c;

    /* JADX INFO: renamed from: d */
    public final ActionBarContextView f54322d;

    /* JADX INFO: renamed from: e */
    public final C3156jq f54323e;

    /* JADX INFO: renamed from: f */
    public WeakReference f54324f;

    /* JADX INFO: renamed from: g */
    public boolean f54325g;

    /* JADX INFO: renamed from: h */
    public final hw5 f54326h;

    public og9(Context context, ActionBarContextView actionBarContextView, C3156jq c3156jq) {
        this.f54321c = context;
        this.f54322d = actionBarContextView;
        this.f54323e = c3156jq;
        hw5 hw5Var = new hw5(actionBarContextView.getContext());
        hw5Var.f43048l = 1;
        this.f54326h = hw5Var;
        hw5Var.f43041e = this;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: a */
    public final void mo3327a() {
        if (this.f54325g) {
            return;
        }
        this.f54325g = true;
        this.f54323e.m14589C(this);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: b */
    public final View mo3328b() {
        WeakReference weakReference = this.f54324f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: c */
    public final hw5 mo3329c() {
        return this.f54326h;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo3330d() {
        return new un9(this.f54322d.getContext());
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: e */
    public final boolean mo12237e(hw5 hw5Var, MenuItem menuItem) {
        return ((C3329mb) this.f54323e.f45990a).m16729f(this, menuItem);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: f */
    public final CharSequence mo3331f() {
        return this.f54322d.getSubtitle();
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: g */
    public final CharSequence mo3332g() {
        return this.f54322d.getTitle();
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: h */
    public final void mo3333h() {
        this.f54323e.m14590D(this, this.f54326h);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: i */
    public final boolean mo3334i() {
        return this.f54322d.f1062N;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: j */
    public final void mo3335j(View view) {
        this.f54322d.setCustomView(view);
        this.f54324f = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: k */
    public final void mo3336k(int i) {
        mo3337l(this.f54321c.getString(i));
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: l */
    public final void mo3337l(CharSequence charSequence) {
        this.f54322d.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: m */
    public final void mo3338m(int i) {
        mo3339n(this.f54321c.getString(i));
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: n */
    public final void mo3339n(CharSequence charSequence) {
        this.f54322d.setTitle(charSequence);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: o */
    public final void mo3340o(boolean z) {
        this.f7988b = z;
        this.f54322d.setTitleOptional(z);
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: s */
    public final void mo12238s(hw5 hw5Var) {
        mo3333h();
        C0035b c0035b = this.f54322d.f1067d;
        if (c0035b != null) {
            c0035b.m714n();
        }
    }
}
