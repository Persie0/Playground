package p000;

import android.view.autofill.AutofillValue;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final class sv8 {

    /* JADX INFO: renamed from: a */
    public final C0357g f61494a;

    /* JADX INFO: renamed from: b */
    public final rr2 f61495b;

    /* JADX INFO: renamed from: c */
    public final d84 f61496c;

    /* JADX INFO: renamed from: d */
    public final h66 f61497d = new h66(2);

    public sv8(C0357g c0357g, rr2 rr2Var, t56 t56Var) {
        this.f61494a = c0357g;
        this.f61495b = rr2Var;
        this.f61496c = t56Var;
    }

    /* JADX INFO: renamed from: a */
    public final C0423c m21750a() {
        return new C0423c(this.f61495b, false, this.f61494a, new kv8());
    }

    /* JADX INFO: renamed from: b */
    public final void m21751b(C0357g c0357g, kv8 kv8Var) {
        C3419on c3419on;
        C3419on c3419on2;
        h66 h66Var = this.f61497d;
        Object[] objArr = h66Var.f1293a;
        int i = h66Var.f1294b;
        for (int i2 = 0; i2 < i; i2++) {
            C3408og c3408og = (C3408og) objArr[i2];
            c3408og.getClass();
            kv8 kv8VarM1613z = c0357g.m1613z();
            int i3 = c0357g.f4336b;
            fs6 fs6Var = c3408og.f54290a;
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = c3408og.f54292c;
            C3335mh c3335mh = kv8Var != null ? (C3335mh) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5012s) : null;
            C3335mh c3335mh2 = kv8VarM1613z != null ? (C3335mh) AbstractC0422b.m1838a(kv8VarM1613z, AbstractC0424d.f5012s) : null;
            C3335mh c3335mh3 = e41.f36677b;
            if (!fa4.m11650l(c3335mh2, c3335mh3)) {
                if (fa4.m11650l(c3335mh, c3335mh3) && !fa4.m11650l(c3335mh2, c3335mh3)) {
                    fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, true);
                }
                String str = (kv8Var == null || (c3419on2 = (C3419on) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4982F)) == null) ? null : c3419on2.f54604b;
                String str2 = (kv8VarM1613z == null || (c3419on = (C3419on) AbstractC0422b.m1838a(kv8VarM1613z, AbstractC0424d.f4982F)) == null) ? null : c3419on.f54604b;
                if (str != str2) {
                    if (str == null) {
                        fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, true);
                    } else if (str2 == null) {
                        fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, false);
                    } else if (fa4.m11650l(c3335mh2, e41.f36678c)) {
                        fs6Var.m12115v().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, AutofillValue.forText(l70.m15921L(str2)));
                    }
                }
                ToggleableState toggleableState = kv8Var != null ? (ToggleableState) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4987K) : null;
                ToggleableState toggleableState2 = kv8VarM1613z != null ? (ToggleableState) AbstractC0422b.m1838a(kv8VarM1613z, AbstractC0424d.f4987K) : null;
                if (toggleableState != toggleableState2) {
                    if (toggleableState == null) {
                        fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, true);
                    } else if (toggleableState2 == null) {
                        fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, false);
                    } else if (fa4.m11650l(c3335mh2, e41.f36679d)) {
                        int i4 = AbstractC3371ng.f52693a[toggleableState2.ordinal()];
                        Boolean bool = i4 != 1 ? i4 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            fs6Var.m12115v().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                C0848ci c0848ci = kv8Var != null ? (C0848ci) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5013t) : null;
                C0848ci c0848ci2 = kv8VarM1613z != null ? (C0848ci) AbstractC0422b.m1838a(kv8VarM1613z, AbstractC0424d.f5013t) : null;
                if (!fa4.m11650l(c0848ci, c0848ci2)) {
                    if (c0848ci == null) {
                        fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, true);
                    } else if (c0848ci2 == null) {
                        fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, false);
                    } else {
                        fs6Var.m12115v().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, c0848ci2.f10108a);
                    }
                }
            } else if (!fa4.m11650l(c3335mh, c3335mh3)) {
                fs6Var.m12089D(viewTreeObserverOnGlobalLayoutListenerC0391c, i3, false);
            }
            boolean z = kv8Var != null && kv8Var.f48471a.m17250b(AbstractC0424d.f5011r);
            boolean z2 = kv8VarM1613z != null && kv8VarM1613z.f48471a.m17250b(AbstractC0424d.f5011r);
            if (z != z2) {
                u56 u56Var = c3408og.f54297h;
                if (z2) {
                    u56Var.m22474a(i3);
                } else {
                    u56Var.m22480g(i3);
                }
            }
        }
    }
}
