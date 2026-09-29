package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vk3 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC0675i f65531a;

    /* JADX INFO: renamed from: b */
    public AbstractC0675i f65532b;

    public vk3(AbstractC0675i abstractC0675i) {
        this.f65531a = abstractC0675i;
        if (abstractC0675i.m2384h()) {
            C3386nv.m17626m("Default instance must be immutable.");
            throw null;
        }
        this.f65532b = abstractC0675i.m2386j();
    }

    /* JADX INFO: renamed from: d */
    public static void m23358d(Object obj, Object obj2) {
        ho7 ho7Var = ho7.f42713c;
        ho7Var.getClass();
        ho7Var.m13412a(obj.getClass()).mergeFrom(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0675i m23359a() {
        AbstractC0675i abstractC0675iM23360b = m23360b();
        abstractC0675iM23360b.getClass();
        if (AbstractC0675i.m2380g(abstractC0675iM23360b, true)) {
            return abstractC0675iM23360b;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0675i m23360b() {
        boolean zM2384h = this.f65532b.m2384h();
        AbstractC0675i abstractC0675i = this.f65532b;
        if (!zM2384h) {
            return abstractC0675i;
        }
        abstractC0675i.getClass();
        ho7 ho7Var = ho7.f42713c;
        ho7Var.getClass();
        ho7Var.m13412a(abstractC0675i.getClass()).makeImmutable(abstractC0675i);
        abstractC0675i.m2385i();
        return this.f65532b;
    }

    /* JADX INFO: renamed from: c */
    public final void m23361c() {
        if (this.f65532b.m2384h()) {
            return;
        }
        AbstractC0675i abstractC0675iM2386j = this.f65531a.m2386j();
        m23358d(abstractC0675iM2386j, this.f65532b);
        this.f65532b = abstractC0675iM2386j;
    }

    public final Object clone() {
        AbstractC0675i abstractC0675i = this.f65531a;
        abstractC0675i.getClass();
        vk3 vk3Var = (vk3) abstractC0675i.mo2383d(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
        vk3Var.f65532b = m23360b();
        return vk3Var;
    }
}
