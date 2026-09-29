package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0035b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y4b extends AbstractC0799b6 implements fw5 {

    /* JADX INFO: renamed from: c */
    public final Context f69291c;

    /* JADX INFO: renamed from: d */
    public final hw5 f69292d;

    /* JADX INFO: renamed from: e */
    public C3156jq f69293e;

    /* JADX INFO: renamed from: f */
    public WeakReference f69294f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ z4b f69295g;

    public y4b(z4b z4bVar, Context context, C3156jq c3156jq) {
        this.f69295g = z4bVar;
        this.f69291c = context;
        this.f69293e = c3156jq;
        hw5 hw5Var = new hw5(context);
        hw5Var.f43048l = 1;
        this.f69292d = hw5Var;
        hw5Var.f43041e = this;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: a */
    public final void mo3327a() {
        z4b z4bVar = this.f69295g;
        if (z4bVar.f70913i != this) {
            return;
        }
        if (z4bVar.f70920p) {
            z4bVar.f70914j = this;
            z4bVar.f70915k = this.f69293e;
        } else {
            this.f69293e.m14589C(this);
        }
        this.f69293e = null;
        z4bVar.m25458a(false);
        ActionBarContextView actionBarContextView = z4bVar.f70910f;
        if (actionBarContextView.f1074k == null) {
            actionBarContextView.m655e();
        }
        z4bVar.f70907c.setHideOnContentScrollEnabled(z4bVar.f70925u);
        z4bVar.f70913i = null;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: b */
    public final View mo3328b() {
        WeakReference weakReference = this.f69294f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: c */
    public final hw5 mo3329c() {
        return this.f69292d;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo3330d() {
        return new un9(this.f69291c);
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: e */
    public final boolean mo12237e(hw5 hw5Var, MenuItem menuItem) {
        C3156jq c3156jq = this.f69293e;
        if (c3156jq != null) {
            return ((C3329mb) c3156jq.f45990a).m16729f(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: f */
    public final CharSequence mo3331f() {
        return this.f69295g.f70910f.getSubtitle();
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: g */
    public final CharSequence mo3332g() {
        return this.f69295g.f70910f.getTitle();
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: h */
    public final void mo3333h() {
        if (this.f69295g.f70913i != this) {
            return;
        }
        hw5 hw5Var = this.f69292d;
        hw5Var.m13540w();
        try {
            this.f69293e.m14590D(this, hw5Var);
        } finally {
            hw5Var.m13539v();
        }
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: i */
    public final boolean mo3334i() {
        return this.f69295g.f70910f.f1062N;
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: j */
    public final void mo3335j(View view) {
        this.f69295g.f70910f.setCustomView(view);
        this.f69294f = new WeakReference(view);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: k */
    public final void mo3336k(int i) {
        mo3337l(this.f69295g.f70905a.getResources().getString(i));
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: l */
    public final void mo3337l(CharSequence charSequence) {
        this.f69295g.f70910f.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: m */
    public final void mo3338m(int i) {
        mo3339n(this.f69295g.f70905a.getResources().getString(i));
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: n */
    public final void mo3339n(CharSequence charSequence) {
        this.f69295g.f70910f.setTitle(charSequence);
    }

    @Override // p000.AbstractC0799b6
    /* JADX INFO: renamed from: o */
    public final void mo3340o(boolean z) {
        this.f7988b = z;
        this.f69295g.f70910f.setTitleOptional(z);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24938p() {
        hw5 hw5Var = this.f69292d;
        hw5Var.m13540w();
        try {
            return ((C3329mb) this.f69293e.f45990a).m16730g(this, hw5Var);
        } finally {
            hw5Var.m13539v();
        }
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: s */
    public final void mo12238s(hw5 hw5Var) {
        if (this.f69293e == null) {
            return;
        }
        mo3333h();
        C0035b c0035b = this.f69295g.f70910f.f1067d;
        if (c0035b != null) {
            c0035b.m714n();
        }
    }
}
