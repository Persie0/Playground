package p080e;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0306d1;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: e.u */
/* JADX INFO: loaded from: classes.dex */
public final class C5289u extends AbstractC5269a {

    /* JADX INFO: renamed from: a */
    public final C0306d1 f33504a;

    /* JADX INFO: renamed from: b */
    public final Window.Callback f33505b;

    /* JADX INFO: renamed from: c */
    public final e f33506c;

    /* JADX INFO: renamed from: d */
    public boolean f33507d;

    /* JADX INFO: renamed from: e */
    public boolean f33508e;

    /* JADX INFO: renamed from: f */
    public boolean f33509f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<AbstractC5269a.b> f33510g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public final a f33511h = new a();

    /* JADX INFO: renamed from: e.u$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            C5289u c5289u = C5289u.this;
            Window.Callback callback = c5289u.f33505b;
            Menu menuM11410q = c5289u.m11410q();
            C0224f c0224f = menuM11410q instanceof C0224f ? (C0224f) menuM11410q : null;
            if (c0224f != null) {
                c0224f.m939w();
            }
            try {
                menuM11410q.clear();
                if (!callback.onCreatePanelMenu(0, menuM11410q) || !callback.onPreparePanel(0, null, menuM11410q)) {
                    menuM11410q.clear();
                }
                if (c0224f != null) {
                }
            } finally {
                if (c0224f != null) {
                    c0224f.m938v();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e.u$b */
    public class b implements Toolbar.InterfaceC0293h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0293h
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return C5289u.this.f33505b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: e.u$c */
    public final class c implements InterfaceC0228j.a {

        /* JADX INFO: renamed from: a */
        public boolean f33514a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: c */
        public final void mo942c(C0224f c0224f, boolean z10) {
            if (this.f33514a) {
                return;
            }
            this.f33514a = true;
            C5289u c5289u = C5289u.this;
            c5289u.f33504a.mo1142i();
            c5289u.f33505b.onPanelClosed(108, c0224f);
            this.f33514a = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0228j.a
        /* JADX INFO: renamed from: d */
        public final boolean mo943d(C0224f c0224f) {
            C5289u.this.f33505b.onMenuOpened(108, c0224f);
            return true;
        }
    }

    /* JADX INFO: renamed from: e.u$d */
    public final class d implements C0224f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: a */
        public final boolean mo940a(C0224f c0224f, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0224f.a
        /* JADX INFO: renamed from: b */
        public final void mo941b(C0224f c0224f) {
            C5289u c5289u = C5289u.this;
            boolean zMo1134a = c5289u.f33504a.mo1134a();
            Window.Callback callback = c5289u.f33505b;
            if (zMo1134a) {
                callback.onPanelClosed(108, c0224f);
            } else {
                if (callback.onPreparePanel(0, null, c0224f)) {
                    callback.onMenuOpened(108, c0224f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e.u$e */
    public class e implements LayoutInflaterFactory2C5275g.b {
        public e() {
        }
    }

    public C5289u(MaterialToolbar materialToolbar, CharSequence charSequence, LayoutInflaterFactory2C5275g.g gVar) {
        b bVar = new b();
        materialToolbar.getClass();
        C0306d1 c0306d1 = new C0306d1(materialToolbar, false);
        this.f33504a = c0306d1;
        gVar.getClass();
        this.f33505b = gVar;
        c0306d1.f1159l = gVar;
        materialToolbar.setOnMenuItemClickListener(bVar);
        c0306d1.setWindowTitle(charSequence);
        this.f33506c = new e();
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: a */
    public final boolean mo11309a() {
        return this.f33504a.mo1140g();
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: b */
    public final boolean mo11310b() {
        C0306d1 c0306d1 = this.f33504a;
        if (!c0306d1.mo1144k()) {
            return false;
        }
        c0306d1.collapseActionView();
        return true;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: c */
    public final void mo11311c(boolean z10) {
        if (z10 == this.f33509f) {
            return;
        }
        this.f33509f = z10;
        ArrayList<AbstractC5269a.b> arrayList = this.f33510g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).m11325a();
        }
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: d */
    public final int mo11312d() {
        return this.f33504a.f1149b;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: e */
    public final Context mo11313e() {
        return this.f33504a.mo1138e();
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: f */
    public final boolean mo11314f() {
        C0306d1 c0306d1 = this.f33504a;
        Toolbar toolbar = c0306d1.f1148a;
        a aVar = this.f33511h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = c0306d1.f1148a;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18676m(toolbar2, aVar);
        return true;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: g */
    public final void mo11315g() {
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: h */
    public final void mo11316h() {
        this.f33504a.f1148a.removeCallbacks(this.f33511h);
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: i */
    public final boolean mo11317i(int i10, KeyEvent keyEvent) {
        Menu menuM11410q = m11410q();
        if (menuM11410q == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        menuM11410q.setQwertyMode(z10);
        return menuM11410q.performShortcut(i10, keyEvent, 0);
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: j */
    public final boolean mo11318j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo11319k();
        }
        return true;
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: k */
    public final boolean mo11319k() {
        return this.f33504a.mo1141h();
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: l */
    public final void mo11320l(boolean z10) {
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: m */
    public final void mo11321m(boolean z10) {
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: n */
    public final void mo11322n(String str) {
        this.f33504a.setTitle(str);
    }

    @Override // p080e.AbstractC5269a
    /* JADX INFO: renamed from: o */
    public final void mo11323o(CharSequence charSequence) {
        this.f33504a.setWindowTitle(charSequence);
    }

    /* JADX INFO: renamed from: q */
    public final Menu m11410q() {
        boolean z10 = this.f33508e;
        C0306d1 c0306d1 = this.f33504a;
        if (!z10) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = c0306d1.f1148a;
            toolbar.f1097l0 = cVar;
            toolbar.f1098m0 = dVar;
            ActionMenuView actionMenuView = toolbar.f1074a;
            if (actionMenuView != null) {
                actionMenuView.f871P = cVar;
                actionMenuView.f872Q = dVar;
            }
            this.f33508e = true;
        }
        return c0306d1.f1148a.getMenu();
    }
}
