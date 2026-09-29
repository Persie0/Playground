package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.C0423c;
import kotlin.jvm.internal.Lambda;
import p000.C0797b4;
import p000.mn8;
import p000.rv8;
import p000.ui3;
import p000.vn8;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 */
/* JADX INFO: loaded from: classes.dex */
final class C0371xa0354dde extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vn8 f4498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0393e f4499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371xa0354dde(vn8 vn8Var, ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e) {
        super(0);
        this.f4498b = vn8Var;
        this.f4499c = viewOnAttachStateChangeListenerC0393e;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        C0423c c0423c;
        C0357g c0357g;
        vn8 vn8Var = this.f4498b;
        mn8 mn8VarM23439a = vn8Var.m23439a();
        mn8 mn8VarM23443e = vn8Var.m23443e();
        Float fM23440b = vn8Var.m23440b();
        Float fM23441c = vn8Var.m23441c();
        float fFloatValue = (mn8VarM23439a == null || fM23440b == null) ? 0.0f : ((Number) mn8VarM23439a.f51588a.mo0a()).floatValue() - fM23440b.floatValue();
        float fFloatValue2 = (mn8VarM23443e == null || fM23441c == null) ? 0.0f : ((Number) mn8VarM23443e.f51588a.mo0a()).floatValue() - fM23441c.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int iM23442d = vn8Var.m23442d();
            ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4499c;
            int iM1770A = viewOnAttachStateChangeListenerC0393e.m1770A(iM23442d);
            rv8 rv8Var = (rv8) viewOnAttachStateChangeListenerC0393e.m1792s().m10152b(viewOnAttachStateChangeListenerC0393e.f4758k);
            if (rv8Var != null) {
                try {
                    C0797b4 c0797b4 = viewOnAttachStateChangeListenerC0393e.f4724H;
                    if (c0797b4 != null) {
                        c0797b4.m3278i(viewOnAttachStateChangeListenerC0393e.m1784k(rv8Var));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            rv8 rv8Var2 = (rv8) viewOnAttachStateChangeListenerC0393e.m1792s().m10152b(viewOnAttachStateChangeListenerC0393e.f4759l);
            if (rv8Var2 != null) {
                try {
                    C0797b4 c0797b5 = viewOnAttachStateChangeListenerC0393e.f4725I;
                    if (c0797b5 != null) {
                        c0797b5.m3278i(viewOnAttachStateChangeListenerC0393e.m1784k(rv8Var2));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            viewOnAttachStateChangeListenerC0393e.f4746d.invalidate();
            rv8 rv8Var3 = (rv8) viewOnAttachStateChangeListenerC0393e.m1792s().m10152b(iM1770A);
            if (rv8Var3 != null && (c0423c = rv8Var3.f59881a) != null && (c0357g = c0423c.f4973c) != null) {
                if (mn8VarM23439a != null) {
                    viewOnAttachStateChangeListenerC0393e.f4727K.m21850i(iM1770A, mn8VarM23439a);
                }
                if (mn8VarM23443e != null) {
                    viewOnAttachStateChangeListenerC0393e.f4728L.m21850i(iM1770A, mn8VarM23443e);
                }
                viewOnAttachStateChangeListenerC0393e.m1795w(c0357g);
            }
        }
        if (mn8VarM23439a != null) {
            vn8Var.m23445g((Float) mn8VarM23439a.f51588a.mo0a());
        }
        if (mn8VarM23443e != null) {
            vn8Var.m23446h((Float) mn8VarM23443e.f51588a.mo0a());
        }
        return xfa.f68157a;
    }
}
