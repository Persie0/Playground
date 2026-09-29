package p471x2;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.SubMenuC0231m;

/* JADX INFO: renamed from: x2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10028b {

    /* JADX INFO: renamed from: a */
    public a f50992a;

    /* JADX INFO: renamed from: x2.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo13017a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo13021b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract View mo13018c();

    /* JADX INFO: renamed from: d */
    public View mo13022d(MenuItem menuItem) {
        return mo13018c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo13019e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo13020f(SubMenuC0231m subMenuC0231m) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo13023g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo13024h(C0226h.a aVar) {
        if (this.f50992a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f50992a = aVar;
    }
}
