package p472x3;

import android.content.Context;
import android.support.v4.media.session.C0166e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: x3.b */
/* JADX INFO: loaded from: classes.dex */
public class C10074b<D> {

    /* JADX INFO: renamed from: a */
    public int f51122a;

    /* JADX INFO: renamed from: b */
    public a<D> f51123b;

    /* JADX INFO: renamed from: c */
    public boolean f51124c = false;

    /* JADX INFO: renamed from: d */
    public boolean f51125d = false;

    /* JADX INFO: renamed from: e */
    public boolean f51126e = true;

    /* JADX INFO: renamed from: f */
    public boolean f51127f = false;

    /* JADX INFO: renamed from: x3.b$a */
    public interface a<D> {
    }

    public C10074b(Context context) {
        context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m18918b() {
        AbstractC10073a abstractC10073a = (AbstractC10073a) this;
        if (abstractC10073a.f51118h != null) {
            if (!abstractC10073a.f51124c) {
                abstractC10073a.f51127f = true;
            }
            if (abstractC10073a.f51119i != null) {
                abstractC10073a.f51118h.getClass();
                abstractC10073a.f51118h = null;
                return;
            }
            abstractC10073a.f51118h.getClass();
            AbstractC10073a<D>.a aVar = abstractC10073a.f51118h;
            aVar.f6708d.set(true);
            if (aVar.f6706b.cancel(false)) {
                abstractC10073a.f51119i = abstractC10073a.f51118h;
            }
            abstractC10073a.f51118h = null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        C8573r0.m16671F(this, sb2);
        sb2.append(" id=");
        return C0166e.m768o(sb2, this.f51122a, "}");
    }
}
