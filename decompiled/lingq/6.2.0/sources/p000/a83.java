package p000;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a83 extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final C3651uk f337a;

    public a83(C3651uk c3651uk) {
        this.f337a = c3651uk;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f337a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f337a.m22761a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f337a.f63999a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        e28 e28Var = (e28) this.f337a.f64001c.mo0a();
        rect.set(Math.round(e28Var.f36620a), Math.round(e28Var.f36621b), Math.round(e28Var.f36622c), Math.round(e28Var.f36623d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f337a.m22761a(menu);
    }
}
