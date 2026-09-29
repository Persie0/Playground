package p000;

import com.google.android.gms.internal.play_billing.AbstractC0998i;
import com.google.android.gms.internal.play_billing.zzia;

/* JADX INFO: loaded from: classes.dex */
public abstract class p7c implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0998i f55714a;

    /* JADX INFO: renamed from: b */
    public AbstractC0998i f55715b;

    public p7c(AbstractC0998i abstractC0998i) {
        this.f55714a = abstractC0998i;
        if (abstractC0998i.m5539h()) {
            C3386nv.m17626m("Default instance must be immutable.");
            throw null;
        }
        this.f55715b = abstractC0998i.m5542n();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0998i m18947a() {
        boolean zM5539h = this.f55715b.m5539h();
        AbstractC0998i abstractC0998i = this.f55715b;
        if (zM5539h) {
            abstractC0998i.getClass();
            vfc.f65328c.m23265a(abstractC0998i.getClass()).mo5559c(abstractC0998i);
            abstractC0998i.m5537e();
            abstractC0998i = this.f55715b;
        }
        abstractC0998i.getClass();
        if (AbstractC0998i.m5534i(abstractC0998i, true)) {
            return abstractC0998i;
        }
        throw new zzia();
    }

    /* JADX INFO: renamed from: b */
    public final void m18948b() {
        if (this.f55715b.m5539h()) {
            return;
        }
        AbstractC0998i abstractC0998iM5542n = this.f55714a.m5542n();
        vfc.f65328c.m23265a(abstractC0998iM5542n.getClass()).mo5563g(abstractC0998iM5542n, this.f55715b);
        this.f55715b = abstractC0998iM5542n;
    }

    public final Object clone() {
        p7c p7cVar = (p7c) this.f55714a.mo5511j(5);
        boolean zM5539h = this.f55715b.m5539h();
        AbstractC0998i abstractC0998i = this.f55715b;
        if (zM5539h) {
            abstractC0998i.getClass();
            vfc.f65328c.m23265a(abstractC0998i.getClass()).mo5559c(abstractC0998i);
            abstractC0998i.m5537e();
            abstractC0998i = this.f55715b;
        }
        p7cVar.f55715b = abstractC0998i;
        return p7cVar;
    }
}
