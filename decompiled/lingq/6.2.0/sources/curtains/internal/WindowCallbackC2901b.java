package curtains.internal;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3329mb;
import p000.cs4;
import p000.d7b;
import p000.hh2;
import p000.jh2;
import p000.vi3;
import p000.wq1;

/* JADX INFO: renamed from: curtains.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public final class WindowCallbackC2901b implements Window.Callback {

    /* JADX INFO: renamed from: d */
    public static final cs4 f34575d;

    /* JADX INFO: renamed from: e */
    public static final WeakHashMap f34576e;

    /* JADX INFO: renamed from: f */
    public static final Object f34577f;

    /* JADX INFO: renamed from: a */
    public final Window.Callback f34578a;

    /* JADX INFO: renamed from: b */
    public final C3329mb f34579b = new C3329mb(17);

    /* JADX INFO: renamed from: c */
    public final Window.Callback f34580c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        f34575d = AbstractC3192a.m15357b(lazyThreadSafetyMode, WindowCallbackWrapper$Companion$jetpackWrapperClass$2.f34569b);
        AbstractC3192a.m15357b(lazyThreadSafetyMode, WindowCallbackWrapper$Companion$jetpackWrappedField$2.f34568b);
        f34576e = new WeakHashMap();
        f34577f = new Object();
    }

    public WindowCallbackC2901b(Window.Callback callback) {
        this.f34578a = callback;
        this.f34580c = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f34578a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f34580c;
        if (keyEvent == null) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34579b.f50861c).iterator();
        it.getClass();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        return (callback.dispatchKeyEvent(keyEvent) ? hh2.f42360b : jh2.f45541a) instanceof hh2;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f34578a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f34578a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f34580c;
        if (motionEvent == null) {
            return callback.dispatchTouchEvent(motionEvent);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f34579b.f50860b).iterator();
        it.getClass();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        return (callback.dispatchTouchEvent(motionEvent) ? hh2.f42360b : jh2.f45541a) instanceof hh2;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f34578a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f34578a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f34578a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f34578a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        for (d7b d7bVar : (CopyOnWriteArrayList) this.f34579b.f50862d) {
            ((CopyOnWriteArrayList) d7bVar.f35094a.f50862d).remove(d7bVar);
            vi3 vi3Var = d7bVar.f35096c;
            View viewPeekDecorView = d7bVar.f35095b.peekDecorView();
            viewPeekDecorView.getClass();
            vi3Var.invoke(viewPeekDecorView);
        }
        this.f34580c.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f34578a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f34578a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f34578a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f34578a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return this.f34578a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        this.f34578a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.f34578a.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f34578a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        this.f34578a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f34578a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f34578a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.f34579b.f50863e).iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        this.f34580c.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f34578a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f34578a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f34578a.onWindowStartingActionMode(callback, i);
    }
}
