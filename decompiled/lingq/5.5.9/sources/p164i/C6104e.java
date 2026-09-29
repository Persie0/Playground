package p164i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0224f;
import java.util.ArrayList;
import p185j.MenuC6395e;
import p185j.MenuItemC6393c;
import p326q.C8452h;
import p353r2.InterfaceMenuItemC8725b;

/* JADX INFO: renamed from: i.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6104e extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f35864a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6100a f35865b;

    /* JADX INFO: renamed from: i.e$a */
    public static class a implements AbstractC6100a.a {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f35866a;

        /* JADX INFO: renamed from: b */
        public final Context f35867b;

        /* JADX INFO: renamed from: c */
        public final ArrayList<C6104e> f35868c = new ArrayList<>();

        /* JADX INFO: renamed from: d */
        public final C8452h<Menu, Menu> f35869d = new C8452h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f35867b = context;
            this.f35866a = callback;
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: a */
        public final boolean mo11376a(AbstractC6100a abstractC6100a, MenuItem menuItem) {
            return this.f35866a.onActionItemClicked(m12602e(abstractC6100a), new MenuItemC6393c(this.f35867b, (InterfaceMenuItemC8725b) menuItem));
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: b */
        public final void mo11377b(AbstractC6100a abstractC6100a) {
            this.f35866a.onDestroyActionMode(m12602e(abstractC6100a));
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: c */
        public final boolean mo11378c(AbstractC6100a abstractC6100a, C0224f c0224f) {
            C6104e c6104eM12602e = m12602e(abstractC6100a);
            C8452h<Menu, Menu> c8452h = this.f35869d;
            Menu orDefault = c8452h.getOrDefault(c0224f, null);
            if (orDefault == null) {
                orDefault = new MenuC6395e(this.f35867b, c0224f);
                c8452h.put(c0224f, orDefault);
            }
            return this.f35866a.onPrepareActionMode(c6104eM12602e, orDefault);
        }

        @Override // p164i.AbstractC6100a.a
        /* JADX INFO: renamed from: d */
        public final boolean mo11379d(AbstractC6100a abstractC6100a, C0224f c0224f) {
            C6104e c6104eM12602e = m12602e(abstractC6100a);
            C8452h<Menu, Menu> c8452h = this.f35869d;
            Menu orDefault = c8452h.getOrDefault(c0224f, null);
            if (orDefault == null) {
                orDefault = new MenuC6395e(this.f35867b, c0224f);
                c8452h.put(c0224f, orDefault);
            }
            return this.f35866a.onCreateActionMode(c6104eM12602e, orDefault);
        }

        /* JADX INFO: renamed from: e */
        public final C6104e m12602e(AbstractC6100a abstractC6100a) {
            ArrayList<C6104e> arrayList = this.f35868c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C6104e c6104e = arrayList.get(i10);
                if (c6104e != null && c6104e.f35865b == abstractC6100a) {
                    return c6104e;
                }
            }
            C6104e c6104e2 = new C6104e(this.f35867b, abstractC6100a);
            arrayList.add(c6104e2);
            return c6104e2;
        }
    }

    public C6104e(Context context, AbstractC6100a abstractC6100a) {
        this.f35864a = context;
        this.f35865b = abstractC6100a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f35865b.mo11416c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f35865b.mo11417d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC6395e(this.f35864a, this.f35865b.mo11418e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f35865b.mo11419f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f35865b.mo11420g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f35865b.f35850a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f35865b.mo11421h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f35865b.f35851b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f35865b.mo11422i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f35865b.mo11423j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f35865b.mo11424k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f35865b.mo11425l(i10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f35865b.mo11426m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f35865b.f35850a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f35865b.mo11427n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f35865b.mo11428o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f35865b.mo11429p(z10);
    }
}
