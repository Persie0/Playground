package p000;

import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import androidx.collection.AbstractC0042e;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.tooltips.TooltipContainer;
import com.lingq.p020ui.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v48 {

    /* JADX INFO: renamed from: a */
    public ArrayList f64844a;

    /* JADX INFO: renamed from: b */
    public Object f64845b;

    /* JADX INFO: renamed from: c */
    public Object f64846c;

    /* JADX INFO: renamed from: d */
    public final Object f64847d;

    /* JADX INFO: renamed from: e */
    public Object f64848e;

    /* JADX INFO: renamed from: f */
    public final Object f64849f;

    /* JADX INFO: renamed from: g */
    public final Object f64850g;

    /* JADX INFO: renamed from: h */
    public Object f64851h;

    /* JADX INFO: renamed from: i */
    public Object f64852i;

    /* JADX INFO: renamed from: j */
    public Object f64853j;

    /* JADX INFO: renamed from: k */
    public Object f64854k;

    public v48(MainActivity mainActivity, C3509qs c3509qs, View view, TooltipContainer tooltipContainer, ro5 ro5Var, ro5 ro5Var2, ro5 ro5Var3) {
        this.f64845b = mainActivity;
        this.f64846c = view;
        this.f64847d = tooltipContainer;
        this.f64848e = ro5Var;
        this.f64849f = ro5Var2;
        this.f64850g = ro5Var3;
        this.f64851h = new HashMap();
        this.f64844a = new ArrayList();
        this.f64852i = new HashMap();
        tooltipContainer.setOnTouchListener(new View.OnTouchListener() { // from class: n5a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                v48 v48Var = this.f52381a;
                for (b6a b6aVar : v48Var.f64844a) {
                    if (!b6aVar.m3377g() && x > b6aVar.m3376f().left && x < b6aVar.m3376f().right && y > b6aVar.m3376f().top && y < b6aVar.m3376f().bottom) {
                        MainActivity mainActivity2 = ((ro5) v48Var.f64848e).f59652a;
                        int i = MainActivity.f33994m0;
                        mainActivity2.m9802q().mo8742L(b6aVar.m3373c().m24947b());
                        b6aVar.m3371a().mo0a();
                        return false;
                    }
                }
                return false;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m23097h(xj3 xj3Var, x66 x66Var) {
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            x48 x48Var = ((xj3) objArr[i2]).f68286a;
            if (x48Var instanceof j67) {
                x66 x66Var2 = ((j67) x48Var).f45120b;
                if (x66Var2.m24313k(xj3Var) || m23097h(xj3Var, x66Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m23098a() {
        this.f64845b = null;
        this.f64846c = null;
        x66 x66Var = (x66) this.f64847d;
        x66Var.m24310h();
        ((o66) this.f64851h).m17812e();
        this.f64848e = x66Var;
        ((x66) this.f64849f).m24310h();
        ((x66) this.f64850g).m24310h();
        this.f64852i = null;
        this.f64853j = null;
        this.f64844a = null;
    }

    /* JADX INFO: renamed from: b */
    public void m23099b() {
        TooltipContainer tooltipContainer = (TooltipContainer) this.f64847d;
        for (TooltipStep tooltipStep : TooltipStep.values()) {
            m23100c(tooltipStep);
        }
        if (tooltipContainer.getWindowToken() != null || tooltipContainer.isAttachedToWindow()) {
            tooltipContainer.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m23100c(TooltipStep tooltipStep) {
        HashMap map = (HashMap) this.f64852i;
        TooltipContainer tooltipContainer = (TooltipContainer) this.f64847d;
        tooltipStep.getClass();
        HashMap map2 = (HashMap) this.f64851h;
        d7a d7aVar = (d7a) map2.get(tooltipStep);
        if (d7aVar != null) {
            map2.put(tooltipStep, null);
            d7aVar.clearAnimation();
            d7aVar.setAlpha(0.0f);
            tooltipContainer.removeView((t6a) this.f64853j);
            tooltipContainer.removeView(d7aVar);
        }
        u91.m22606X0(new kv4(tooltipStep, 29), this.f64844a);
        z5a z5aVar = (z5a) map.get(tooltipStep);
        if (z5aVar != null) {
            z5aVar.mo164a();
            map.put(tooltipStep, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m23101d() {
        Set set = (Set) this.f64845b;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                x48 x48Var = (x48) it.next();
                it.remove();
                x48Var.mo1245d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a8 */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m23102e() {
        x66 x66Var = (x66) this.f64847d;
        x66 x66Var2 = (x66) this.f64849f;
        Set set = (Set) this.f64845b;
        if (set == null) {
            return;
        }
        this.f64854k = null;
        int i = 5;
        if (x66Var2.f67832c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                o66 o66Var = (o66) this.f64852i;
                int i2 = x66Var2.f67832c;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = x66Var2.f67830a[i2];
                    try {
                        if (obj instanceof xj3) {
                            x48 x48Var = ((xj3) obj).f68286a;
                            set.remove(x48Var);
                            x48Var.mo1246f();
                        }
                        if (obj instanceof oe1) {
                            if (o66Var == null || !o66Var.m723a(obj)) {
                                ((oe1) obj).mo1497b();
                            } else {
                                ((oe1) obj).mo1496a();
                            }
                        }
                    } catch (Throwable th) {
                        nf1 nf1Var = (nf1) this.f64846c;
                        if (nf1Var != null) {
                            bna.m3988z0(th, new C3006fm(i, nf1Var, obj));
                        }
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (x66Var.f67832c != 0) {
            Trace.beginSection("Compose:onRemembered");
            Set set2 = (Set) this.f64845b;
            if (set2 != null) {
                Object[] objArr = x66Var.f67830a;
                int i3 = x66Var.f67832c;
                for (int i4 = 0; i4 < i3; i4++) {
                    xj3 xj3Var = (xj3) objArr[i4];
                    x48 x48Var2 = xj3Var.f68286a;
                    set2.remove(x48Var2);
                    try {
                        x48Var2.mo1247g();
                    } catch (Throwable th3) {
                        nf1 nf1Var2 = (nf1) this.f64846c;
                        if (nf1Var2 != null) {
                            bna.m3988z0(th3, new C3006fm(i, nf1Var2, xj3Var));
                        }
                        throw th3;
                    }
                }
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m23103f() {
        x66 x66Var = (x66) this.f64850g;
        if (x66Var.f67832c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = x66Var.f67830a;
                int i = x66Var.f67832c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ui3) objArr[i2]).mo0a();
                }
                x66Var.m24310h();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m23104g(xj3 xj3Var) {
        x66 x66Var = (x66) this.f64847d;
        if (!((o66) this.f64851h).m723a(xj3Var)) {
            AbstractC0042e abstractC0042e = (AbstractC0042e) this.f64854k;
            if (abstractC0042e == null || !abstractC0042e.m723a(xj3Var)) {
                ((x66) this.f64849f).m24305c(xj3Var);
                return;
            }
            return;
        }
        ((o66) this.f64851h).m17819l(xj3Var);
        if (!((x66) this.f64848e).m24313k(xj3Var) && !x66Var.m24313k(xj3Var)) {
            m23097h(xj3Var, x66Var);
        }
        Set set = (Set) this.f64845b;
        if (set == null) {
            return;
        }
        set.add(xj3Var.f68286a);
    }

    /* JADX INFO: renamed from: i */
    public void m23105i(Set set, nf1 nf1Var) {
        m23098a();
        this.f64845b = set;
        this.f64846c = nf1Var;
    }

    public v48() {
        x66 x66Var = new x66(new xj3[16]);
        this.f64847d = x66Var;
        o66 o66Var = pm8.f56484a;
        this.f64851h = new o66();
        this.f64848e = x66Var;
        this.f64849f = new x66(new Object[16]);
        this.f64850g = new x66(new ui3[16]);
    }
}
