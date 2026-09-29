package p000;

import androidx.compose.runtime.AbstractC0279g;

/* JADX INFO: loaded from: classes.dex */
public final class l77 extends m77 implements vf1, sf1 {

    /* JADX INFO: renamed from: d */
    public static final l77 f49251d = new l77(yba.f69611e, 0);

    @Override // p000.sf1
    /* JADX INFO: renamed from: A */
    public final Object mo1058A(AbstractC0279g abstractC0279g) {
        return xwc.m24743P(this, abstractC0279g);
    }

    @Override // p000.m77
    /* JADX INFO: renamed from: a */
    public final o77 mo15966a() {
        k77 k77Var = new k77(this);
        k77Var.f46817g = this;
        return k77Var;
    }

    @Override // p000.m77
    /* JADX INFO: renamed from: b */
    public final o77 mo15967b() {
        k77 k77Var = new k77(this);
        k77Var.f46817g = this;
        return k77Var;
    }

    @Override // p000.m77, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0279g) {
            return super.containsKey((AbstractC0279g) obj);
        }
        return false;
    }

    @Override // p000.m77, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof aoa) {
            return super.containsValue((aoa) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final l77 m15968d(AbstractC0279g abstractC0279g, aoa aoaVar) {
        C3126ix c3126ixM25054u = this.f50733a.m25054u(abstractC0279g, abstractC0279g.hashCode(), 0, aoaVar);
        return c3126ixM25054u == null ? this : new l77((yba) c3126ixM25054u.f44721c, this.f50734b + c3126ixM25054u.f44720b);
    }

    @Override // p000.m77, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0279g) {
            return (aoa) super.get((AbstractC0279g) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0279g) ? obj2 : (aoa) super.getOrDefault((AbstractC0279g) obj, (aoa) obj2);
    }
}
