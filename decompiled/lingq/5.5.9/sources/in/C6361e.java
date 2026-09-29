package in;

import dm.C5207g;
import java.util.HashMap;
import java.util.List;
import mn.C7645b;
import mn.C7648e;
import p281nm.C7802b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p373rn.AbstractC8875g;
import p373rn.C8883o;
import sm.C9076d;
import sm.InterfaceC9075c;

/* JADX INFO: renamed from: in.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6361e extends C6360d.a {

    /* JADX INFO: renamed from: b */
    public final HashMap<C7648e, AbstractC8875g<?>> f36732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C6360d f36733c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC8830c f36734d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C7645b f36735e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List<InterfaceC9075c> f36736f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC8837f0 f36737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6361e(C6360d c6360d, InterfaceC8830c interfaceC8830c, C7645b c7645b, List<InterfaceC9075c> list, InterfaceC8837f0 interfaceC8837f0) {
        super();
        this.f36733c = c6360d;
        this.f36734d = interfaceC8830c;
        this.f36735e = c7645b;
        this.f36736f = list;
        this.f36737g = interfaceC8837f0;
        this.f36732b = new HashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // in.InterfaceC6367k.a
    /* JADX INFO: renamed from: a */
    public final void mo12974a() {
        boolean zM13764r;
        HashMap<C7648e, AbstractC8875g<?>> map = this.f36732b;
        C6360d c6360d = this.f36733c;
        c6360d.getClass();
        C7645b c7645b = this.f36735e;
        C5207g.m11111f(c7645b, "annotationClassId");
        C5207g.m11111f(map, "arguments");
        if (C5207g.m11106a(c7645b, C7802b.f42881b)) {
            AbstractC8875g<?> abstractC8875g = map.get(C7648e.m15232l("value"));
            C8883o c8883o = abstractC8875g instanceof C8883o ? (C8883o) abstractC8875g : null;
            if (c8883o == null) {
                zM13764r = false;
            } else {
                T t10 = c8883o.f46772a;
                C8883o.a.b bVar = t10 instanceof C8883o.a.b ? (C8883o.a.b) t10 : null;
                if (bVar == null) {
                    zM13764r = false;
                } else {
                    zM13764r = c6360d.m13764r(bVar.f46777a.f46770a);
                }
            }
        } else {
            zM13764r = false;
        }
        if (zM13764r || c6360d.m13764r(c7645b)) {
            return;
        }
        this.f36736f.add(new C9076d(this.f36734d.mo5316v(), map, this.f36737g));
    }

    @Override // in.C6360d.a
    /* JADX INFO: renamed from: g */
    public final void mo12982g(C7648e c7648e, AbstractC8875g<?> abstractC8875g) {
        if (c7648e != null) {
            this.f36732b.put(c7648e, abstractC8875g);
        }
    }
}
