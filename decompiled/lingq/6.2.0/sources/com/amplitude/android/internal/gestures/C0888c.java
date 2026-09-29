package com.amplitude.android.internal.gestures;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.amplitude.android.C0881c;
import com.amplitude.android.internal.locators.AbstractC0890a;
import curtains.AbstractC2899b;
import curtains.internal.WindowCallbackC2901b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.C3329mb;
import p000.cs4;
import p000.d7b;
import p000.l70;
import p000.ll6;
import p000.mi3;
import p000.pj5;
import p000.r4b;
import p000.tbd;
import p000.ui3;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.amplitude.android.internal.gestures.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0888c {

    /* JADX INFO: renamed from: a */
    public final zi3 f10851a;

    /* JADX INFO: renamed from: b */
    public final C0881c f10852b;

    /* JADX INFO: renamed from: c */
    public final ui3 f10853c;

    /* JADX INFO: renamed from: d */
    public final pj5 f10854d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f10855e;

    /* JADX INFO: renamed from: f */
    public boolean f10856f;

    /* JADX INFO: renamed from: g */
    public final Handler f10857g;

    /* JADX INFO: renamed from: h */
    public final r4b f10858h;

    public C0888c(zi3 zi3Var, C0881c c0881c, ui3 ui3Var, pj5 pj5Var) {
        pj5Var.getClass();
        this.f10851a = zi3Var;
        this.f10852b = c0881c;
        this.f10853c = ui3Var;
        this.f10854d = pj5Var;
        this.f10855e = new LinkedHashMap();
        this.f10857g = new Handler(Looper.getMainLooper());
        this.f10858h = new r4b(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m5074a(View view) throws IllegalAccessException {
        final Window windowM9900a = AbstractC2899b.m9900a(view);
        if (windowM9900a != null) {
            vi3 vi3Var = new vi3() { // from class: com.amplitude.android.internal.gestures.WindowCallbackManager$onRootViewAdded$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    Activity activity;
                    String strM15958u;
                    View view2 = (View) obj;
                    view2.getClass();
                    C0888c c0888c = this.f10834b;
                    ui3 ui3Var = c0888c.f10853c;
                    LinkedHashMap linkedHashMap = c0888c.f10855e;
                    pj5 pj5Var = c0888c.f10854d;
                    if (c0888c.f10856f) {
                        Window window = windowM9900a;
                        if (!linkedHashMap.containsKey(window)) {
                            Context context = window.getContext();
                            context.getClass();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                    break;
                                }
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                                context.getClass();
                            }
                            if (activity == null || (strM15958u = l70.m15958u(activity)) == null) {
                                pj5Var.mo16256b("Unable to get Activity from window context, skipping window");
                            } else {
                                Window.Callback callback = window.getCallback();
                                if (callback == null) {
                                    callback = new ll6();
                                }
                                linkedHashMap.put(window, window.getCallback());
                                C0881c c0881c = c0888c.f10852b;
                                zi3 zi3Var = c0888c.f10851a;
                                window.setCallback(c0881c != null ? new mi3(callback, view2, strM15958u, zi3Var, (List) ((vi3) AbstractC0890a.f10864a.getValue()).invoke(pj5Var), c0888c.f10854d, ui3Var, c0888c.f10852b) : new WindowCallbackC0887b(callback, view2, strM15958u, zi3Var, (List) ((vi3) AbstractC0890a.f10864a.getValue()).invoke(pj5Var), c0888c.f10854d, ui3Var));
                                pj5Var.mo16256b("Wrapped window callback for ".concat(strM15958u));
                            }
                        }
                    } else {
                        pj5Var.mo16256b("WindowCallbackManager stopped, skipping window wrap");
                    }
                    return xfa.f68157a;
                }
            };
            View viewPeekDecorView = windowM9900a.peekDecorView();
            if (viewPeekDecorView != null) {
                vi3Var.invoke(viewPeekDecorView);
                return;
            }
            cs4 cs4Var = WindowCallbackC2901b.f34575d;
            C3329mb c3329mbM21944b = tbd.m21944b(windowM9900a);
            ((CopyOnWriteArrayList) c3329mbM21944b.f50862d).add(new d7b(c3329mbM21944b, windowM9900a, vi3Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5075b(Window window) {
        LinkedHashMap linkedHashMap = this.f10855e;
        if (linkedHashMap.containsKey(window)) {
            Window.Callback callback = (Window.Callback) linkedHashMap.remove(window);
            if (window.getCallback() instanceof WindowCallbackC0887b) {
                if (callback instanceof ll6) {
                    callback = null;
                }
                window.setCallback(callback);
                this.f10854d.mo16256b("Unwrapped window callback");
            }
        }
    }
}
