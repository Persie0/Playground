package p306on;

import dm.C5207g;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import mn.C7647d;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8865w;
import pn.C8413d;
import tl.C9337y;

/* JADX INFO: renamed from: on.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8092a {

    /* JADX INFO: renamed from: on.a$a */
    public static final class a implements InterfaceC8092a {

        /* JADX INFO: renamed from: a */
        public static final a f43914a = new a();

        @Override // p306on.InterfaceC8092a
        /* JADX INFO: renamed from: a */
        public final String mo16006a(InterfaceC8834e interfaceC8834e, DescriptorRenderer descriptorRenderer) {
            C5207g.m11111f(descriptorRenderer, "renderer");
            if (interfaceC8834e instanceof InterfaceC8847k0) {
                C7648e c7648eMo11874a = ((InterfaceC8847k0) interfaceC8834e).mo11874a();
                C5207g.m11110e(c7648eMo11874a, "classifier.name");
                return descriptorRenderer.mo13984t(c7648eMo11874a, false);
            }
            C7647d c7647dM16448g = C8413d.m16448g(interfaceC8834e);
            C5207g.m11110e(c7647dM16448g, "getFqName(classifier)");
            return descriptorRenderer.mo13983s(c7647dM16448g);
        }
    }

    /* JADX INFO: renamed from: on.a$b */
    public static final class b implements InterfaceC8092a {

        /* JADX INFO: renamed from: a */
        public static final b f43915a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [rm.e] */
        /* JADX WARN: Type inference failed for: r4v1, types: [rm.g] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // p306on.InterfaceC8092a
        /* JADX INFO: renamed from: a */
        public final String mo16006a(InterfaceC8834e interfaceC8834e, DescriptorRenderer descriptorRenderer) {
            C5207g.m11111f(descriptorRenderer, "renderer");
            if (interfaceC8834e instanceof InterfaceC8847k0) {
                C7648e c7648eMo11874a = ((InterfaceC8847k0) interfaceC8834e).mo11874a();
                C5207g.m11110e(c7648eMo11874a, "classifier.name");
                return descriptorRenderer.mo13984t(c7648eMo11874a, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC8834e.mo11874a());
                interfaceC8834e = interfaceC8834e.mo11876g();
            } while (interfaceC8834e instanceof InterfaceC8830c);
            return C7499b.m14962r0(new C9337y(arrayList));
        }
    }

    /* JADX INFO: renamed from: on.a$c */
    public static final class c implements InterfaceC8092a {

        /* JADX INFO: renamed from: a */
        public static final c f43916a = new c();

        /* JADX INFO: renamed from: b */
        public static String m16007b(InterfaceC8834e interfaceC8834e) {
            String strM14962r0;
            C7648e c7648eMo11874a = interfaceC8834e.mo11874a();
            C5207g.m11110e(c7648eMo11874a, "descriptor.name");
            String strM14960q0 = C7499b.m14960q0(c7648eMo11874a);
            if (interfaceC8834e instanceof InterfaceC8847k0) {
                return strM14960q0;
            }
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC8834e.mo11876g();
            C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
            if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                strM14962r0 = m16007b((InterfaceC8834e) interfaceC8838gMo11876g);
            } else if (interfaceC8838gMo11876g instanceof InterfaceC8865w) {
                C7647d c7647dM15221i = ((InterfaceC8865w) interfaceC8838gMo11876g).mo17120e().m15221i();
                C5207g.m11110e(c7647dM15221i, "descriptor.fqName.toUnsafe()");
                strM14962r0 = C7499b.m14962r0(c7647dM15221i.m15227f());
            } else {
                strM14962r0 = null;
            }
            if (strM14962r0 != null && !C5207g.m11106a(strM14962r0, "")) {
                strM14960q0 = strM14962r0 + '.' + strM14960q0;
            }
            return strM14960q0;
        }

        @Override // p306on.InterfaceC8092a
        /* JADX INFO: renamed from: a */
        public final String mo16006a(InterfaceC8834e interfaceC8834e, DescriptorRenderer descriptorRenderer) {
            C5207g.m11111f(descriptorRenderer, "renderer");
            return m16007b(interfaceC8834e);
        }
    }

    /* JADX INFO: renamed from: a */
    String mo16006a(InterfaceC8834e interfaceC8834e, DescriptorRenderer descriptorRenderer);
}
