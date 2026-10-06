package p000;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class aej {

    /* JADX INFO: renamed from: b */
    public AmbientMode.AmbientController f256b;

    /* JADX INFO: renamed from: a */
    public abstract View mo334a();

    /* JADX INFO: renamed from: b */
    public void mo335b(SubMenu subMenu) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo336c() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo337d() {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public View mo338e(MenuItem menuItem) {
        return mo334a();
    }

    /* JADX INFO: renamed from: f */
    public boolean mo339f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo340g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo341h(AmbientMode.AmbientController ambientController) {
        if (this.f256b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f256b = ambientController;
    }
}
