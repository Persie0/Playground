package p000;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;

/* JADX INFO: renamed from: fk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0186fk extends AbstractC0146dy {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0758jy f22353a;

    /* JADX INFO: renamed from: b */
    public final Window.Callback f22354b;

    /* JADX INFO: renamed from: c */
    boolean f22355c;

    /* JADX INFO: renamed from: d */
    public final AmbientMode.AmbientController f22356d;

    /* JADX INFO: renamed from: e */
    private boolean f22357e;

    /* JADX INFO: renamed from: f */
    private boolean f22358f;

    /* JADX INFO: renamed from: g */
    private final ArrayList f22359g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final Runnable f22360h = new RunnableC0059be(this, 10);

    /* JADX INFO: renamed from: i */
    private final AmbientMode.AmbientController f22361i;

    public C0186fk(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
        this.f22361i = ambientController;
        C0860ns c0860ns = new C0860ns(toolbar, false);
        this.f22353a = c0860ns;
        abf.m90c(callback);
        this.f22354b = callback;
        c0860ns.f44336d = callback;
        toolbar.f1207C = ambientController;
        c0860ns.mo13686n(charSequence);
        this.f22356d = new AmbientMode.AmbientController(this);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: a */
    public final int mo6894a() {
        return ((C0860ns) this.f22353a).f44334b;
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: b */
    public final Context mo6895b() {
        return this.f22353a.mo13674b();
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: d */
    public final void mo6897d(boolean z) {
        if (z == this.f22358f) {
            return;
        }
        this.f22358f = z;
        int size = this.f22359g.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0145dx) this.f22359g.get(i)).m6842a();
        }
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: e */
    public final void mo6898e() {
        ((C0860ns) this.f22353a).f44333a.removeCallbacks(this.f22360h);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: f */
    public final void mo6899f(boolean z) {
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: g */
    public final void mo6900g(boolean z) {
        m8503w(4, 4);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: h */
    public final void mo6901h(boolean z) {
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: i */
    public final void mo6902i(CharSequence charSequence) {
        this.f22353a.mo13683k(charSequence);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: j */
    public final void mo6903j(CharSequence charSequence) {
        this.f22353a.mo13686n(charSequence);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: k */
    public final boolean mo6904k() {
        return this.f22353a.mo13689q();
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: l */
    public final boolean mo6905l() {
        if (!this.f22353a.mo13688p()) {
            return false;
        }
        this.f22353a.mo13675c();
        return true;
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: m */
    public final boolean mo6906m() {
        ((C0860ns) this.f22353a).f44333a.removeCallbacks(this.f22360h);
        afb.m428i(((C0860ns) this.f22353a).f44333a, this.f22360h);
        return true;
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: n */
    public final boolean mo6907n(int i, KeyEvent keyEvent) {
        Menu menuM8502v = m8502v();
        if (menuM8502v == null) {
            return false;
        }
        menuM8502v.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM8502v.performShortcut(i, keyEvent, 0);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: o */
    public final boolean mo6908o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo6909p();
        }
        return true;
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: p */
    public final boolean mo6909p() {
        return this.f22353a.mo13692t();
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: q */
    public final void mo6910q() {
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: r */
    public final void mo6911r() {
        m8503w(2, 2);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: s */
    public final void mo6912s() {
        m8503w(8, 8);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: t */
    public final void mo6913t() {
        this.f22353a.mo13680h(null);
    }

    @Override // p000.AbstractC0146dy
    /* JADX INFO: renamed from: u */
    public final void mo6914u() {
        InterfaceC0758jy interfaceC0758jy = this.f22353a;
        interfaceC0758jy.mo13683k(interfaceC0758jy.mo13674b().getText(C0100R.string.pref_camera_settings_category));
    }

    /* JADX INFO: renamed from: v */
    public final Menu m8502v() {
        if (!this.f22357e) {
            InterfaceC0758jy interfaceC0758jy = this.f22353a;
            C0185fj c0185fj = new C0185fj(this);
            C0263ig c0263ig = new C0263ig(this, 1);
            Toolbar toolbar = ((C0860ns) interfaceC0758jy).f44333a;
            toolbar.f1248y = c0185fj;
            toolbar.f1249z = c0263ig;
            ActionMenuView actionMenuView = toolbar.f1224a;
            if (actionMenuView != null) {
                actionMenuView.m1076i(c0185fj, c0263ig);
            }
            this.f22357e = true;
        }
        return ((C0860ns) this.f22353a).f44333a.m1339g();
    }

    /* JADX INFO: renamed from: w */
    public final void m8503w(int i, int i2) {
        InterfaceC0758jy interfaceC0758jy = this.f22353a;
        interfaceC0758jy.mo13679g((i & i2) | (((C0860ns) interfaceC0758jy).f44334b & (i2 ^ (-1))));
    }
}
