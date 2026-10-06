package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: renamed from: do */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0136do extends Activity implements akv, aen {

    /* JADX INFO: renamed from: a */
    private final aks f12146a;

    public ActivityC0136do() {
        new C1117xf();
        this.f12146a = new aks(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = afq.f274a;
        }
        return abg.m102k(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = afq.f274a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // p000.aen
    /* JADX INFO: renamed from: g */
    public final boolean mo354g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p000.akv
    public aks getLifecycle() {
        return this.f12146a;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        alh.m909b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        aks aksVar = this.f12146a;
        akr akrVar = akr.CREATED;
        akrVar.getClass();
        aks.m873e(DNTdN.NJBCAkKFx);
        aksVar.m882d(akrVar);
        super.onSaveInstanceState(bundle);
    }
}
