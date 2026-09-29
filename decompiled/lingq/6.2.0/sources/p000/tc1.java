package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle$State;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc1 extends Activity implements ub5, ci4 {

    /* JADX INFO: renamed from: a */
    public final wb5 f62130a = new wb5(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        WeakHashMap weakHashMap = dta.f36217a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        WeakHashMap weakHashMap = dta.f36217a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = s68.f60434a;
        q68.m19683b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.f62130a.m23835I(Lifecycle$State.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
