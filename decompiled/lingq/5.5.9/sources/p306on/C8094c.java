package p306on;

import dm.C5207g;
import gm.AbstractC5819a;
import km.InterfaceC6727j;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;

/* JADX INFO: renamed from: on.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8094c extends AbstractC5819a<Object> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DescriptorRendererOptionsImpl f43917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8094c(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.f43917b = descriptorRendererOptionsImpl;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // gm.AbstractC5819a
    /* JADX INFO: renamed from: a */
    public final void mo12227a(InterfaceC6727j interfaceC6727j) {
        C5207g.m11111f(interfaceC6727j, "property");
        if (this.f43917b.f39596a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
