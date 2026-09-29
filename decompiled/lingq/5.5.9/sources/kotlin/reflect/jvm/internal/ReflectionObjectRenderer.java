package kotlin.reflect.jvm.internal;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.io.IOException;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import mn.C7648e;
import p247lm.C7398k;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionObjectRenderer {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRendererImpl f38289a = DescriptorRenderer.f39546a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$a */
    public /* synthetic */ class C6783a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38290a;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            f38290a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13517a(StringBuilder sb2, InterfaceC6816a interfaceC6816a) {
        InterfaceC8835e0 interfaceC8835e0M14794e = C7398k.m14794e(interfaceC6816a);
        InterfaceC8835e0 interfaceC8835e0Mo11896s0 = interfaceC6816a.mo11896s0();
        if (interfaceC8835e0M14794e != null) {
            AbstractC5257t abstractC5257tMo11884c = interfaceC8835e0M14794e.mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c, "receiver.type");
            sb2.append(m13520d(abstractC5257tMo11884c));
            sb2.append(".");
        }
        boolean z10 = (interfaceC8835e0M14794e == null || interfaceC8835e0Mo11896s0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        if (interfaceC8835e0Mo11896s0 != null) {
            AbstractC5257t abstractC5257tMo11884c2 = interfaceC8835e0Mo11896s0.mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c2, "receiver.type");
            sb2.append(m13520d(abstractC5257tMo11884c2));
            sb2.append(".");
        }
        if (z10) {
            sb2.append(")");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m13518b(InterfaceC6822c interfaceC6822c) throws IOException {
        C5207g.m11111f(interfaceC6822c, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        m13517a(sb2, interfaceC6822c);
        C7648e c7648eMo11874a = interfaceC6822c.mo11874a();
        C5207g.m11110e(c7648eMo11874a, "descriptor.name");
        sb2.append(f38289a.mo13984t(c7648eMo11874a, true));
        List<InterfaceC8853n0> listMo11889i = interfaceC6822c.mo11889i();
        C5207g.m11110e(listMo11889i, "descriptor.valueParameters");
        C6752c.m13429W(listMo11889i, sb2, ", ", "(", ")", new InterfaceC2052l<InterfaceC8853n0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderFunction$1$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(InterfaceC8853n0 interfaceC8853n0) {
                DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f38289a;
                AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0.mo11884c();
                C5207g.m11110e(abstractC5257tMo11884c, "it.type");
                return ReflectionObjectRenderer.m13520d(abstractC5257tMo11884c);
            }
        }, 48);
        sb2.append(": ");
        AbstractC5257t abstractC5257tMo11900y = interfaceC6822c.mo11900y();
        C5207g.m11108c(abstractC5257tMo11900y);
        sb2.append(m13520d(abstractC5257tMo11900y));
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static String m13519c(InterfaceC8829b0 interfaceC8829b0) {
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(interfaceC8829b0.mo11894q0() ? "var " : "val ");
        m13517a(sb2, interfaceC8829b0);
        C7648e c7648eMo11874a = interfaceC8829b0.mo11874a();
        C5207g.m11110e(c7648eMo11874a, "descriptor.name");
        sb2.append(f38289a.mo13984t(c7648eMo11874a, true));
        sb2.append(": ");
        AbstractC5257t abstractC5257tMo11884c = interfaceC8829b0.mo11884c();
        C5207g.m11110e(abstractC5257tMo11884c, "descriptor.type");
        sb2.append(m13520d(abstractC5257tMo11884c));
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static String m13520d(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "type");
        return f38289a.mo13985u(abstractC5257t);
    }
}
