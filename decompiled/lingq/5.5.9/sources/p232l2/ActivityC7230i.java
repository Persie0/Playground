package p232l2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.view.C1052r;
import androidx.view.FragmentC1022b0;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import dm.C5207g;
import p326q.C8452h;
import p471x2.C10038g;

/* JADX INFO: renamed from: l2.i */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC7230i extends Activity implements InterfaceC1051q, C10038g.a {

    /* JADX INFO: renamed from: a */
    public final C1052r f40624a;

    public ActivityC7230i() {
        new C8452h();
        this.f40624a = new C1052r(this);
    }

    /* JADX INFO: renamed from: G */
    public C1052r mo786G() {
        return this.f40624a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C10038g.m18802a(decorView, keyEvent)) {
            return C10038g.m18803b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C10038g.m18802a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = FragmentC1022b0.f6606b;
        FragmentC1022b0.b.m3923b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C1052r c1052r = this.f40624a;
        c1052r.getClass();
        C5207g.m11111f(state, "state");
        c1052r.m3954e("markState");
        c1052r.m3957h(state);
        super.onSaveInstanceState(bundle);
    }

    @Override // p471x2.C10038g.a
    /* JADX INFO: renamed from: v */
    public final boolean mo11393v(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
