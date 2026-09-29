package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.h66;
import p000.o66;
import p000.pm8;

/* JADX INFO: renamed from: androidx.compose.ui.focus.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0299a {

    /* JADX INFO: renamed from: a */
    public final C0301c f3901a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f3902b;

    /* JADX INFO: renamed from: c */
    public final o66 f3903c;

    /* JADX INFO: renamed from: d */
    public final o66 f3904d;

    /* JADX INFO: renamed from: e */
    public boolean f3905e;

    public C0299a(C0301c c0301c, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f3901a = c0301c;
        this.f3902b = viewTreeObserverOnGlobalLayoutListenerC0391c;
        o66 o66Var = pm8.f56484a;
        this.f3903c = new o66();
        this.f3904d = new o66();
    }

    /* JADX INFO: renamed from: a */
    public final void m1354a() {
        if (this.f3905e) {
            return;
        }
        FocusInvalidationManager$scheduleInvalidation$1 focusInvalidationManager$scheduleInvalidation$1 = new FocusInvalidationManager$scheduleInvalidation$1(0, this, C0299a.class, "invalidateNodes", "invalidateNodes()V", 0);
        h66 h66Var = this.f3902b.f4653J0;
        if (h66Var.m718c(focusInvalidationManager$scheduleInvalidation$1) < 0) {
            h66Var.m13090g(focusInvalidationManager$scheduleInvalidation$1);
        }
        this.f3905e = true;
    }
}
