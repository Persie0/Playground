package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import cm.InterfaceC2041a;
import cn.C2064a;
import cn.InterfaceC2068e;
import dm.C5207g;
import gn.InterfaceC5845y;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p266n.C7669f;
import p372rm.InterfaceC8832d;
import sl.InterfaceC9070c;
import sm.InterfaceC9077e;
import zm.C10532q;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextKt {
    /* JADX INFO: renamed from: a */
    public static C7669f m13681a(final C7669f c7669f, final InterfaceC8832d interfaceC8832d, InterfaceC5845y interfaceC5845y, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC5845y = null;
        }
        C5207g.m11111f(c7669f, "<this>");
        C5207g.m11111f(interfaceC8832d, "containingDeclaration");
        return new C7669f((C2064a) c7669f.f42146a, interfaceC5845y != null ? new LazyJavaTypeParameterResolver(c7669f, interfaceC8832d, interfaceC5845y, 0) : (InterfaceC2068e) c7669f.f42147b, C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<C10532q>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C10532q mo807E() {
                InterfaceC9077e interfaceC9077eMo11289w = interfaceC8832d.mo11289w();
                C7669f c7669f2 = c7669f;
                C5207g.m11111f(c7669f2, "<this>");
                C5207g.m11111f(interfaceC9077eMo11289w, "additionalAnnotations");
                return ((C2064a) c7669f2.f42146a).f10511q.m13664b((C10532q) ((InterfaceC9070c) c7669f2.f42149d).getValue(), interfaceC9077eMo11289w);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static final C7669f m13682b(final C7669f c7669f, final InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(c7669f, "<this>");
        C5207g.m11111f(interfaceC9077e, "additionalAnnotations");
        return interfaceC9077e.isEmpty() ? c7669f : new C7669f((C2064a) c7669f.f42146a, (InterfaceC2068e) c7669f.f42147b, C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<C10532q>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C10532q mo807E() {
                C7669f c7669f2 = c7669f;
                C5207g.m11111f(c7669f2, "<this>");
                InterfaceC9077e interfaceC9077e2 = interfaceC9077e;
                C5207g.m11111f(interfaceC9077e2, "additionalAnnotations");
                return ((C2064a) c7669f2.f42146a).f10511q.m13664b((C10532q) ((InterfaceC9070c) c7669f2.f42149d).getValue(), interfaceC9077e2);
            }
        }));
    }
}
