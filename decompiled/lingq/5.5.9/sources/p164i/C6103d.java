package p164i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6103d extends AbstractC6100a implements C0224f.a {

    /* JADX INFO: renamed from: c */
    public final Context f35858c;

    /* JADX INFO: renamed from: d */
    public final ActionBarContextView f35859d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6100a.a f35860e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f35861f;

    /* JADX INFO: renamed from: g */
    public boolean f35862g;

    /* JADX INFO: renamed from: h */
    public final C0224f f35863h;

    public C6103d(Context context, ActionBarContextView actionBarContextView, AbstractC6100a.a aVar) {
        this.f35858c = context;
        this.f35859d = actionBarContextView;
        this.f35860e = aVar;
        C0224f c0224f = new C0224f(actionBarContextView.getContext());
        c0224f.f704l = 1;
        this.f35863h = c0224f;
        c0224f.f697e = this;
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: a */
    public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
        return this.f35860e.mo11376a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0224f.a
    /* JADX INFO: renamed from: b */
    public final void mo941b(C0224f c0224f) {
        mo11422i();
        ActionMenuPresenter actionMenuPresenter = this.f35859d.f1121d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m981n();
        }
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: c */
    public final void mo11416c() {
        if (this.f35862g) {
            return;
        }
        this.f35862g = true;
        this.f35860e.mo11377b(this);
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: d */
    public final View mo11417d() {
        WeakReference<View> weakReference = this.f35861f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: e */
    public final C0224f mo11418e() {
        return this.f35863h;
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: f */
    public final MenuInflater mo11419f() {
        return new C6105f(this.f35859d.getContext());
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: g */
    public final CharSequence mo11420g() {
        return this.f35859d.getSubtitle();
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: h */
    public final CharSequence mo11421h() {
        return this.f35859d.getTitle();
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: i */
    public final void mo11422i() {
        this.f35860e.mo11378c(this, this.f35863h);
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: j */
    public final boolean mo11423j() {
        return this.f35859d.f803N;
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: k */
    public final void mo11424k(View view) {
        this.f35859d.setCustomView(view);
        this.f35861f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: l */
    public final void mo11425l(int i10) {
        mo11426m(this.f35858c.getString(i10));
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: m */
    public final void mo11426m(CharSequence charSequence) {
        this.f35859d.setSubtitle(charSequence);
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: n */
    public final void mo11427n(int i10) {
        mo11428o(this.f35858c.getString(i10));
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: o */
    public final void mo11428o(CharSequence charSequence) {
        this.f35859d.setTitle(charSequence);
    }

    @Override // p164i.AbstractC6100a
    /* JADX INFO: renamed from: p */
    public final void mo11429p(boolean z10) {
        this.f35851b = z10;
        this.f35859d.setTitleOptional(z10);
    }
}
