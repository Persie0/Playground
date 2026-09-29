package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public abstract class tk3 implements sx5, Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC1134i f62439a;

    /* JADX INFO: renamed from: b */
    public AbstractC1134i f62440b;

    public tk3(AbstractC1134i abstractC1134i) {
        this.f62439a = abstractC1134i;
        if (abstractC1134i.m6547m()) {
            C3386nv.m17626m("Default instance must be immutable.");
            throw null;
        }
        this.f62440b = abstractC1134i.m6550p();
    }

    /* JADX INFO: renamed from: e */
    public static void m22170e(Object obj, Object obj2) {
        eo7 eo7Var = eo7.f37616c;
        eo7Var.getClass();
        eo7Var.m11280a(obj.getClass()).mergeFrom(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1134i m22171a() {
        AbstractC1134i abstractC1134iM22172b = m22172b();
        abstractC1134iM22172b.getClass();
        if (AbstractC1134i.m6541l(abstractC1134iM22172b, true)) {
            return abstractC1134iM22172b;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1134i m22172b() {
        boolean zM6547m = this.f62440b.m6547m();
        AbstractC1134i abstractC1134i = this.f62440b;
        if (!zM6547m) {
            return abstractC1134i;
        }
        abstractC1134i.getClass();
        eo7 eo7Var = eo7.f37616c;
        eo7Var.getClass();
        eo7Var.m11280a(abstractC1134i.getClass()).makeImmutable(abstractC1134i);
        abstractC1134i.m6548n();
        return this.f62440b;
    }

    /* JADX INFO: renamed from: c */
    public final tk3 m22173c() {
        tk3 tk3VarMo6431c = this.f62439a.mo6431c();
        tk3VarMo6431c.f62440b = m22172b();
        return tk3VarMo6431c;
    }

    /* JADX INFO: renamed from: d */
    public final void m22174d() {
        if (this.f62440b.m6547m()) {
            return;
        }
        AbstractC1134i abstractC1134iM6550p = this.f62439a.m6550p();
        m22170e(abstractC1134iM6550p, this.f62440b);
        this.f62440b = abstractC1134iM6550p;
    }
}
