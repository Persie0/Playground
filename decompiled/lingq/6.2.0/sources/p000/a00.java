package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a00 {

    /* JADX INFO: renamed from: a */
    public final float f4a;

    /* JADX INFO: renamed from: b */
    public final Object f5b;

    /* JADX INFO: renamed from: c */
    public Object f6c;

    /* JADX INFO: renamed from: d */
    public Object f7d;

    /* JADX INFO: renamed from: e */
    public Object f8e;

    public a00(Context context) {
        this.f5b = context.getApplicationContext();
        this.f7d = o52.f53858s;
        this.f4a = 8.0f;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC3081hn m1a(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2) {
        if (((AbstractC3081hn) this.f7d) == null) {
            this.f7d = abstractC3081hn.mo10485c();
        }
        AbstractC3081hn abstractC3081hn3 = (AbstractC3081hn) this.f7d;
        if (abstractC3081hn3 == null) {
            fa4.m11636J("velocityVector");
            throw null;
        }
        int iMo10484b = abstractC3081hn3.mo10484b();
        int i = 0;
        while (true) {
            AbstractC3081hn abstractC3081hn4 = (AbstractC3081hn) this.f7d;
            if (i >= iMo10484b) {
                if (abstractC3081hn4 != null) {
                    return abstractC3081hn4;
                }
                fa4.m11636J("velocityVector");
                throw null;
            }
            if (abstractC3081hn4 == null) {
                fa4.m11636J("velocityVector");
                throw null;
            }
            h73 h73Var = (h73) this.f5b;
            abstractC3081hn.getClass();
            abstractC3081hn4.mo10487e(i, h73Var.mo13110h(abstractC3081hn2.mo10483a(i), j));
            i++;
        }
    }

    public a00(h73 h73Var) {
        this.f5b = h73Var;
        this.f4a = h73Var.mo13109g();
    }
}
