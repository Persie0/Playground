package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class qn9 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f57990a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0799b6 f57991b;

    public qn9(Context context, AbstractC0799b6 abstractC0799b6) {
        this.f57990a = context;
        this.f57991b = abstractC0799b6;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f57991b.mo3327a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f57991b.mo3328b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new jx5(this.f57990a, this.f57991b.mo3329c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f57991b.mo3330d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f57991b.mo3331f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f57991b.f7987a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f57991b.mo3332g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f57991b.f7988b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f57991b.mo3333h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f57991b.mo3334i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f57991b.mo3335j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f57991b.mo3337l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f57991b.f7987a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f57991b.mo3339n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f57991b.mo3340o(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f57991b.mo3336k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f57991b.mo3338m(i);
    }
}
