package p000;

import androidx.compose.foundation.gestures.C0097e;

/* JADX INFO: renamed from: bg */
/* JADX INFO: loaded from: classes.dex */
public final class C0809bg {

    /* JADX INFO: renamed from: a */
    public Object f8484a;

    /* JADX INFO: renamed from: b */
    public Object f8485b;

    /* JADX INFO: renamed from: c */
    public float f8486c = Float.NaN;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0097e f8487d;

    public C0809bg(C0097e c0097e) {
        this.f8487d = c0097e;
    }

    /* JADX INFO: renamed from: a */
    public final void m3692a(float f, float f2) {
        C0097e c0097e = this.f8487d;
        qc9 qc9Var = c0097e.f2241j;
        float fM19861h = qc9Var.m19861h();
        qc9Var.m19862i(f);
        c0097e.f2242k.m19862i(f2);
        if (Float.isNaN(fM19861h)) {
            return;
        }
        boolean z = f >= fM19861h;
        a62 a62VarM849c = c0097e.m849c();
        xc9 xc9Var = (xc9) c0097e.f2238g;
        if (qc9Var.m19861h() == a62VarM849c.m133f(xc9Var.getValue())) {
            Object objM129b = c0097e.m849c().m129b(qc9Var.m19861h() + (z ? 1.0f : -1.0f), z);
            if (objM129b == null) {
                objM129b = xc9Var.getValue();
            }
            if (z) {
                this.f8484a = xc9Var.getValue();
                this.f8485b = objM129b;
            } else {
                this.f8484a = objM129b;
                this.f8485b = xc9Var.getValue();
            }
        } else {
            Object objM129b2 = c0097e.m849c().m129b(qc9Var.m19861h(), false);
            if (objM129b2 == null) {
                objM129b2 = xc9Var.getValue();
            }
            Object objM129b3 = c0097e.m849c().m129b(qc9Var.m19861h(), true);
            if (objM129b3 == null) {
                objM129b3 = xc9Var.getValue();
            }
            this.f8484a = objM129b2;
            this.f8485b = objM129b3;
        }
        a62 a62VarM849c2 = c0097e.m849c();
        Object obj = this.f8484a;
        obj.getClass();
        float fM133f = a62VarM849c2.m133f(obj);
        a62 a62VarM849c3 = c0097e.m849c();
        Object obj2 = this.f8485b;
        obj2.getClass();
        this.f8486c = Math.abs(fM133f - a62VarM849c3.m133f(obj2));
        if (Math.abs(qc9Var.m19861h() - c0097e.m849c().m133f(xc9Var.getValue())) >= this.f8486c / 2.0f) {
            Object value = z ? this.f8485b : this.f8484a;
            if (value == null) {
                value = xc9Var.getValue();
            }
            if (((Boolean) c0097e.f2232a.invoke(value)).booleanValue()) {
                c0097e.m853g(value);
            }
        }
    }
}
