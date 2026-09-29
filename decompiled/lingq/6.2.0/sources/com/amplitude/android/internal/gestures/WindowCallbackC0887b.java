package com.amplitude.android.internal.gestures;

import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.kva;
import p000.nj0;
import p000.pj5;
import p000.ui3;
import p000.zi3;

/* JADX INFO: renamed from: com.amplitude.android.internal.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public class WindowCallbackC0887b implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f10843a;

    /* JADX INFO: renamed from: b */
    public final String f10844b;

    /* JADX INFO: renamed from: c */
    public final List f10845c;

    /* JADX INFO: renamed from: d */
    public final pj5 f10846d;

    /* JADX INFO: renamed from: e */
    public final nj0 f10847e;

    /* JADX INFO: renamed from: f */
    public final GestureDetector f10848f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f10849g;

    /* JADX INFO: renamed from: h */
    public kva f10850h;

    public WindowCallbackC0887b(Window.Callback callback, View view, String str, zi3 zi3Var, List list, pj5 pj5Var, ui3 ui3Var) {
        nj0 nj0Var = new nj0(8);
        GestureDetectorOnGestureListenerC0886a gestureDetectorOnGestureListenerC0886a = new GestureDetectorOnGestureListenerC0886a(view, str, zi3Var, pj5Var, list, ui3Var);
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), gestureDetectorOnGestureListenerC0886a);
        view.getClass();
        list.getClass();
        pj5Var.getClass();
        this.f10843a = callback;
        this.f10844b = str;
        this.f10845c = list;
        this.f10846d = pj5Var;
        this.f10847e = nj0Var;
        this.f10848f = gestureDetector;
        this.f10849g = new WeakReference(view);
        gestureDetectorOnGestureListenerC0886a.f10841f = new AutocaptureWindowCallback$2(this);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10843a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f10843a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f10843a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f10843a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f10847e.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.getClass();
            try {
                try {
                    this.f10848f.onTouchEvent(motionEventObtain);
                } catch (Exception e) {
                    this.f10846d.mo16255a("Error handling touch event: " + e);
                }
            } finally {
                motionEventObtain.recycle();
            }
        }
        return this.f10843a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10843a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f10843a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f10843a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f10843a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f10843a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        return this.f10843a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f10843a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f10843a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        return this.f10843a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        menu.getClass();
        return this.f10843a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        this.f10843a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        return this.f10843a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f10843a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10843a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f10843a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f10843a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f10843a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f10843a.onWindowStartingActionMode(callback, i);
    }
}
