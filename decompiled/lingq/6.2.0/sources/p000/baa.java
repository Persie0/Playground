package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class baa implements dh9 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ faa f8239H;

    /* JADX INFO: renamed from: a */
    public final jda f8240a;

    /* JADX INFO: renamed from: b */
    public final t66 f8241b;

    /* JADX INFO: renamed from: c */
    public final t66 f8242c;

    /* JADX INFO: renamed from: d */
    public final t66 f8243d;

    /* JADX INFO: renamed from: e */
    public final t66 f8244e;

    /* JADX INFO: renamed from: f */
    public final qc9 f8245f;

    /* JADX INFO: renamed from: g */
    public boolean f8246g;

    /* JADX INFO: renamed from: h */
    public final t66 f8247h;

    /* JADX INFO: renamed from: i */
    public AbstractC3081hn f8248i;

    /* JADX INFO: renamed from: j */
    public final uc9 f8249j;

    /* JADX INFO: renamed from: k */
    public boolean f8250k;

    /* JADX INFO: renamed from: l */
    public final bg9 f8251l;

    public baa(faa faaVar, Object obj, AbstractC3081hn abstractC3081hn, jda jdaVar) {
        this.f8239H = faaVar;
        this.f8240a = jdaVar;
        t66 t66VarM1260j = AbstractC0278f.m1260j(obj);
        this.f8241b = t66VarM1260j;
        Object objInvoke = null;
        this.f8242c = AbstractC0278f.m1260j(ss5.m21698Y(0.0f, 0.0f, null, 7));
        this.f8243d = AbstractC0278f.m1260j(new or9(m3534d(), jdaVar, obj, ((xc9) t66VarM1260j).getValue(), abstractC3081hn));
        this.f8244e = AbstractC0278f.m1260j(Boolean.TRUE);
        this.f8245f = AbstractC0278f.m1256f(-1.0f);
        this.f8247h = AbstractC0278f.m1260j(obj);
        this.f8248i = abstractC3081hn;
        this.f8249j = AbstractC0278f.m1258h(m3533c().mo10818c());
        Float f = (Float) jwa.f46325a.get(jdaVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC3081hn abstractC3081hn2 = (AbstractC3081hn) jdaVar.f45442a.invoke(obj);
            int iMo10484b = abstractC3081hn2.mo10484b();
            for (int i = 0; i < iMo10484b; i++) {
                abstractC3081hn2.mo10487e(i, fFloatValue);
            }
            objInvoke = this.f8240a.f45443b.invoke(abstractC3081hn2);
        }
        this.f8251l = ss5.m21698Y(0.0f, 0.0f, objInvoke, 3);
    }

    /* JADX INFO: renamed from: c */
    public final or9 m3533c() {
        return (or9) ((xc9) this.f8243d).getValue();
    }

    /* JADX INFO: renamed from: d */
    public final l43 m3534d() {
        return (l43) ((xc9) this.f8242c).getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m3535e() {
        if (this.f8245f.m19861h() == -1.0f) {
            this.f8250k = true;
            boolean zM11650l = fa4.m11650l(m3533c().f54792c, m3533c().f54793d);
            t66 t66Var = this.f8247h;
            if (zM11650l) {
                ((xc9) t66Var).setValue(m3533c().f54792c);
            } else {
                ((xc9) t66Var).setValue(m3533c().mo10821g(0L));
                this.f8248i = m3533c().mo10820e(0L);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3536f(Object obj, boolean z) {
        xc9 xc9Var = (xc9) this.f8241b;
        boolean zM11650l = fa4.m11650l(null, xc9Var.getValue());
        uc9 uc9Var = this.f8249j;
        t66 t66Var = this.f8243d;
        if (zM11650l) {
            ((xc9) t66Var).setValue(new or9(this.f8251l, this.f8240a, obj, obj, this.f8248i.mo10485c()));
            this.f8246g = true;
            uc9Var.m22674i(m3533c().mo10818c());
            return;
        }
        l43 l43VarM3534d = (!z || this.f8250k || (m3534d() instanceof bg9)) ? m3534d() : this.f8251l;
        faa faaVar = this.f8239H;
        long jM11671e = faaVar.m11671e();
        t66 t66Var2 = faaVar.f38742h;
        long jMax = 0;
        ((xc9) t66Var).setValue(new or9(jM11671e <= 0 ? l43VarM3534d : new vg9(l43VarM3534d, faaVar.m11671e()), this.f8240a, obj, xc9Var.getValue(), this.f8248i));
        uc9Var.m22674i(m3533c().mo10818c());
        this.f8246g = false;
        ((xc9) t66Var2).setValue(Boolean.TRUE);
        if (faaVar.m11673g()) {
            SnapshotStateList snapshotStateList = faaVar.f38743i;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                baa baaVar = (baa) snapshotStateList.get(i);
                jMax = Math.max(jMax, baaVar.f8249j.m22673h());
                baaVar.m3535e();
            }
            ((xc9) t66Var2).setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3537g(Object obj, Object obj2, l43 l43Var) {
        ((xc9) this.f8241b).setValue(obj2);
        ((xc9) this.f8242c).setValue(l43Var);
        if (fa4.m11650l(m3533c().f54793d, obj) && fa4.m11650l(m3533c().f54792c, obj2)) {
            return;
        }
        m3536f(obj, false);
    }

    @Override // p000.dh9
    public final Object getValue() {
        return ((xc9) this.f8247h).getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m3538h(Object obj, l43 l43Var) {
        if (this.f8246g && fa4.m11650l(obj, null)) {
            return;
        }
        t66 t66Var = this.f8241b;
        boolean zM11650l = fa4.m11650l(((xc9) t66Var).getValue(), obj);
        qc9 qc9Var = this.f8245f;
        if (zM11650l && qc9Var.m19861h() == -1.0f) {
            return;
        }
        ((xc9) t66Var).setValue(obj);
        ((xc9) this.f8242c).setValue(l43Var);
        float fM19861h = qc9Var.m19861h();
        t66 t66Var2 = this.f8247h;
        Object value = fM19861h == -3.0f ? obj : ((xc9) t66Var2).getValue();
        t66 t66Var3 = this.f8244e;
        m3536f(value, !((Boolean) ((xc9) t66Var3).getValue()).booleanValue());
        ((xc9) t66Var3).setValue(Boolean.valueOf(qc9Var.m19861h() == -3.0f));
        if (qc9Var.m19861h() >= 0.0f) {
            ((xc9) t66Var2).setValue(m3533c().mo10821g((long) (qc9Var.m19861h() * m3533c().mo10818c())));
        } else if (qc9Var.m19861h() == -3.0f) {
            ((xc9) t66Var2).setValue(obj);
        }
        this.f8246g = false;
        qc9Var.m19862i(-1.0f);
    }

    public final String toString() {
        return "current value: " + ((xc9) this.f8247h).getValue() + ", target: " + ((xc9) this.f8241b).getValue() + ", spec: " + m3534d();
    }
}
