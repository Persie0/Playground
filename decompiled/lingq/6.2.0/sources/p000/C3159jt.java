package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: renamed from: jt */
/* JADX INFO: loaded from: classes.dex */
public final class C3159jt implements mk3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46090a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f46091b = new Object();

    /* JADX INFO: renamed from: c */
    public volatile lk3 f46092c;

    /* JADX INFO: renamed from: d */
    public final Object f46093d;

    public C3159jt(or3 or3Var) {
        this.f46093d = or3Var;
    }

    /* JADX INFO: renamed from: c */
    public static final Context m14640c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* JADX INFO: renamed from: a */
    public fy1 m14641a() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) this.f46093d;
        hd3 hd3Var = abstractComponentCallbacksC0635c.f5675Q;
        if ((hd3Var == null ? null : hd3Var.f42213O) == null) {
            C3386nv.m17635v("Hilt Fragments must be attached before creating the component.");
            return null;
        }
        thb.m22048g((hd3Var == null ? null : hd3Var.f42213O) instanceof nk3, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", (hd3Var == null ? null : hd3Var.f42213O).getClass());
        hd3 hd3Var2 = abstractComponentCallbacksC0635c.f5675Q;
        cy1 cy1Var = (cy1) ((pd3) ci8.m4741z(hd3Var2 != null ? hd3Var2.f42213O : null, pd3.class));
        return new fy1(cy1Var.f34704a, cy1Var.f34706c, abstractComponentCallbacksC0635c);
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        switch (this.f46090a) {
            case 0:
                if (((ky1) this.f46092c) == null) {
                    synchronized (this.f46091b) {
                        try {
                            if (((ky1) this.f46092c) == null) {
                                this.f46092c = new ky1(new C3002fi((Context) ((or3) this.f46093d).f54782a, (short) 0));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return (ky1) this.f46092c;
            default:
                if (((fy1) this.f46092c) == null) {
                    synchronized (this.f46091b) {
                        try {
                            if (((fy1) this.f46092c) == null) {
                                this.f46092c = m14641a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return (fy1) this.f46092c;
        }
    }

    public C3159jt(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f46093d = abstractComponentCallbacksC0635c;
    }
}
