package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: renamed from: ga */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0203ga extends ActionMode {

    /* JADX INFO: renamed from: a */
    final Context f24011a;

    /* JADX INFO: renamed from: b */
    final AbstractC0199fx f24012b;

    public C0203ga(Context context, AbstractC0199fx abstractC0199fx) {
        this.f24011a = context;
        this.f24012b = abstractC0199fx;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f24012b.mo8648f();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f24012b.mo8645c();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [adc, android.view.Menu] */
    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0242hm(this.f24011a, this.f24012b.mo8643a());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f24012b.mo8644b();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f24012b.mo8646d();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f24012b.f23784d;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f24012b.mo8647e();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f24012b.f23785e;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f24012b.mo8649g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f24012b.mo8656n();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f24012b.mo8650h(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f24012b.mo8651i(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f24012b.f23784d = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f24012b.mo8653k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f24012b.mo8655m(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f24012b.mo8652j(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f24012b.mo8654l(charSequence);
    }
}
