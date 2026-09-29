package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.p544savedstate.C1189a;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.C1052r;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import androidx.view.ViewTreeLifecycleOwner;
import dm.C5207g;
import p270n4.C7705b;
import p270n4.InterfaceC7706c;
import p338qd.C8573r0;

/* JADX INFO: renamed from: androidx.activity.k */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0192k extends Dialog implements InterfaceC1051q, InterfaceC0209s, InterfaceC7706c {

    /* JADX INFO: renamed from: a */
    public C1052r f491a;

    /* JADX INFO: renamed from: b */
    public final C7705b f492b;

    /* JADX INFO: renamed from: c */
    public final OnBackPressedDispatcher f493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0192k(Context context, int i10) {
        super(context, i10);
        C5207g.m11111f(context, "context");
        this.f492b = new C7705b(this);
        this.f493c = new OnBackPressedDispatcher(new RunnableC0191j(0, this));
    }

    /* JADX INFO: renamed from: a */
    public static void m820a(DialogC0192k dialogC0192k) {
        C5207g.m11111f(dialogC0192k, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        C1052r c1052r = this.f491a;
        if (c1052r == null) {
            c1052r = new C1052r(this);
            this.f491a = c1052r;
        }
        return c1052r;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C5207g.m11111f(view, "view");
        m821c();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.InterfaceC0209s
    /* JADX INFO: renamed from: b */
    public final OnBackPressedDispatcher mo788b() {
        return this.f493c;
    }

    /* JADX INFO: renamed from: c */
    public final void m821c() {
        Window window = getWindow();
        C5207g.m11108c(window);
        View decorView = window.getDecorView();
        C5207g.m11110e(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.m3912b(decorView, this);
        Window window2 = getWindow();
        C5207g.m11108c(window2);
        View decorView2 = window2.getDecorView();
        C5207g.m11110e(decorView2, "window!!.decorView");
        C8573r0.m16712Z0(decorView2, this);
        Window window3 = getWindow();
        C5207g.m11108c(window3);
        View decorView3 = window3.getDecorView();
        C5207g.m11110e(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.m4583b(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f493c.m805b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C5207g.m11110e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f493c;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f464e = onBackInvokedDispatcher;
            onBackPressedDispatcher.m806c();
        }
        this.f492b.m15299b(bundle);
        C1052r c1052r = this.f491a;
        if (c1052r == null) {
            c1052r = new C1052r(this);
            this.f491a = c1052r;
        }
        c1052r.m3955f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C5207g.m11110e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f492b.m15300c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C1052r c1052r = this.f491a;
        if (c1052r == null) {
            c1052r = new C1052r(this);
            this.f491a = c1052r;
        }
        c1052r.m3955f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1052r c1052r = this.f491a;
        if (c1052r == null) {
            c1052r = new C1052r(this);
            this.f491a = c1052r;
        }
        c1052r.m3955f(Lifecycle.Event.ON_DESTROY);
        this.f491a = null;
        super.onStop();
    }

    @Override // p270n4.InterfaceC7706c
    /* JADX INFO: renamed from: q */
    public final C1189a mo797q() {
        return this.f492b.f42232b;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m821c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C5207g.m11111f(view, "view");
        m821c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C5207g.m11111f(view, "view");
        m821c();
        super.setContentView(view, layoutParams);
    }
}
