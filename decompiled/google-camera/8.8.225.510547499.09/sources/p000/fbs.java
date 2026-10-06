package p000;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import p021j$.util.function.BiFunction$CC;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fbs extends ActivityC0157ei {

    /* JADX INFO: renamed from: q */
    private int f21196q;

    /* JADX INFO: renamed from: x */
    public final fan f21197x = new fan();

    /* JADX INFO: renamed from: y */
    protected final exg f21198y = new exg();

    /* JADX INFO: renamed from: n */
    private final void m8106n() {
        this.f21196q--;
    }

    /* JADX INFO: renamed from: o */
    private final void m8107o() {
        int i = this.f21196q;
        this.f21196q = i + 1;
        if (i == 0) {
            this.f21197x.m8094b(new cpf(15));
        }
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0136do, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (((Boolean) this.f21197x.m8093a(new fal(0), false)).booleanValue()) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (((Boolean) this.f21197x.m8093a(new BiFunction() { // from class: fah
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                fbp fbpVar = (fbp) obj;
                Boolean bool = (Boolean) obj2;
                int i = fan.f21134e;
                if (!bool.booleanValue() && (fbpVar instanceof ezo) && ((ezo) fbpVar).m8071a()) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f21197x.m8094b(cpf.f8566r);
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f21197x.m8094b(cpf.f8563o);
        super.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f21197x.m8094b(cpf.f8565q);
        super.onActionModeStarted(actionMode);
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, android.app.Activity
    protected final void onActivityResult(final int i, final int i2, Intent intent) {
        this.f21197x.m8094b(new Consumer() { // from class: fay
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i3 = i;
                int i4 = i2;
                fbp fbpVar = (fbp) obj;
                int i5 = fba.f21187l;
                if (fbpVar instanceof fbb) {
                    ((fbb) fbpVar).mo8098b(i3, i4);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        fan fanVar = this.f21197x;
        fag fagVar = fag.f21099a;
        fanVar.m8096d(fagVar);
        fanVar.f21138d = fagVar;
        super.onAttachedToWindow();
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0907pl, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f21197x.m8094b(new dco(configuration, 14));
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return ((Boolean) this.f21197x.m8093a(new fal(3), false)).booleanValue();
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f21198y.m7989c();
        fan fanVar = this.f21197x;
        fam famVar = new fam((fba) fanVar, bundle, 2);
        fanVar.m8096d(famVar);
        fanVar.f21191h = famVar;
        super.onCreate(bundle);
        this.f21198y.m7988b();
        this.f47426g.m19328a(new fbr(this));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.f21197x.m8094b(new fax(0));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (((Boolean) this.f21197x.m8093a(new fal(5), false)).booleanValue()) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected void onDestroy() {
        this.f21198y.m7991e();
        fan fanVar = this.f21197x;
        fanVar.m8095c(fanVar.f21136b);
        fanVar.m8095c(fanVar.f21135a);
        fanVar.m8095c(fanVar.f21194k);
        fanVar.m8095c(fanVar.f21191h);
        fanVar.m8094b(fax.f21148a);
        super.onDestroy();
        this.f21198y.m7990d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        fan fanVar = this.f21197x;
        fanVar.m8095c(fanVar.f21138d);
        fanVar.m8094b(cpf.f8562n);
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.f21197x.m8094b(new cpf(20));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(final int i, final KeyEvent keyEvent) {
        if (((Boolean) this.f21197x.m8093a(new BiFunction() { // from class: faj
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i2 = i;
                KeyEvent keyEvent2 = keyEvent;
                fbp fbpVar = (fbp) obj;
                Boolean bool = (Boolean) obj2;
                int i3 = fan.f21134e;
                if (!bool.booleanValue() && (fbpVar instanceof ezv) && ((ezv) fbpVar).mo7599f(i2, keyEvent2)) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(final int i, KeyEvent keyEvent) {
        if (((Boolean) this.f21197x.m8093a(new BiFunction() { // from class: fak
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i2 = i;
                fbp fbpVar = (fbp) obj;
                Boolean bool = (Boolean) obj2;
                int i3 = fan.f21134e;
                if (!bool.booleanValue() && (fbpVar instanceof ezw) && ((ezw) fbpVar).mo7602i(i2)) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue()) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f21197x.m8094b(fax.f21149b);
        super.onLowMemory();
    }

    @Override // p000.ActivityC0907pl, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.f21197x.m8094b(new dco(intent, 13));
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (((Boolean) this.f21197x.m8093a(new fal(4), false)).booleanValue()) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    protected void onPause() {
        this.f21198y.m7993g();
        fan fanVar = this.f21197x;
        fanVar.m8095c(fanVar.f21137c);
        fanVar.m8095c(fanVar.f21193j);
        fanVar.m8094b(fax.f21151d);
        super.onPause();
        this.f21198y.m7992f();
    }

    @Override // android.app.Activity
    public final void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.f21197x.m8094b(new cpf(16));
    }

    @Override // p000.ActivityC0157ei, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        fan fanVar = this.f21197x;
        fam famVar = new fam(fanVar, bundle, 0);
        fanVar.m8096d(famVar);
        fanVar.f21135a = famVar;
        super.onPostCreate(bundle);
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected final void onPostResume() {
        fan fanVar = this.f21197x;
        fag fagVar = fag.f21100b;
        fanVar.m8096d(fagVar);
        fanVar.f21137c = fagVar;
        super.onPostResume();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (((Boolean) this.f21197x.m8093a(new fal(2), false)).booleanValue()) {
            return true;
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, android.app.Activity
    public void onRequestPermissionsResult(final int i, final String[] strArr, final int[] iArr) {
        this.f21197x.m8094b(new Consumer() { // from class: fai
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                String[] strArr2 = strArr;
                int[] iArr2 = iArr;
                fbp fbpVar = (fbp) obj;
                int i3 = fan.f21134e;
                if (fbpVar instanceof faa) {
                    ((faa) fbpVar).mo3550f(i2, strArr2, iArr2);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        fan fanVar = this.f21197x;
        fam famVar = new fam(fanVar, bundle, 1);
        fanVar.m8096d(famVar);
        fanVar.f21136b = famVar;
        super.onRestoreInstanceState(bundle);
    }

    @Override // p000.ActivityC0080bz, android.app.Activity
    protected void onResume() {
        this.f21198y.m7995i();
        fan fanVar = this.f21197x;
        fag fagVar = fag.f21104f;
        fanVar.m8096d(fagVar);
        fanVar.f21193j = fagVar;
        super.onResume();
        this.f21198y.m7994h();
    }

    @Override // p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onSaveInstanceState(final Bundle bundle) {
        fan fanVar = this.f21197x;
        faz fazVar = new faz() { // from class: faw
            @Override // p000.faz
            /* JADX INFO: renamed from: a */
            public final void mo8080a(fbp fbpVar) {
                Bundle bundle2 = bundle;
                if (fbpVar instanceof fbm) {
                    Bundle bundle3 = new Bundle();
                    ((fbm) fbpVar).mo3552h(bundle3);
                    String strM8091f = fba.m8091f(fbpVar);
                    strM8091f.getClass();
                    bundle2.putBundle(strM8091f, bundle3);
                }
            }
        };
        fanVar.m8096d(fazVar);
        fanVar.f21194k = fazVar;
        super.onSaveInstanceState(bundle);
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected void onStart() {
        this.f21198y.m7997k();
        fan fanVar = this.f21197x;
        fag fagVar = fag.f21105g;
        fanVar.m8096d(fagVar);
        fanVar.f21192i = fagVar;
        super.onStart();
        this.f21198y.m7996j();
    }

    @Override // p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected void onStop() {
        this.f21198y.m7999m();
        fan fanVar = this.f21197x;
        fanVar.m8095c(fanVar.f21192i);
        fanVar.m8094b(fax.f21150c);
        super.onStop();
        this.f21198y.m7998l();
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        this.f21197x.m8094b(cpf.f8561m);
        super.onUserInteraction();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        this.f21197x.m8094b(cpf.f8564p);
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f21197x.m8094b(new hhf(z, 1));
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        m8107o();
        super.startActivity(intent);
        m8106n();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        m8107o();
        super.startActivityForResult(intent, i);
        m8106n();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        m8107o();
        super.startActivityFromFragment(fragment, intent, i);
        m8106n();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        m8107o();
        super.startActivity(intent, bundle);
        m8106n();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        m8107o();
        super.startActivityForResult(intent, i, bundle);
        m8106n();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        m8107o();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        m8106n();
    }
}
