package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import om.InterfaceC8084a;
import p260m8.C7499b;
import p347qm.C8644a;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p385sf.C9000b;
import p420um.C9577l;
import tm.InterfaceC9340b;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6805a implements InterfaceC9340b {

    /* JADX INFO: renamed from: g */
    public static final C7648e f38440g;

    /* JADX INFO: renamed from: h */
    public static final C7645b f38441h;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8863u f38442a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<InterfaceC8863u, InterfaceC8838g> f38443b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2073e f38444c;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38438e = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(C6805a.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* JADX INFO: renamed from: d */
    public static final a f38437d = new a();

    /* JADX INFO: renamed from: f */
    public static final C7646c f38439f = C6797e.f38344j;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a */
    public static final class a {
    }

    static {
        C7647d c7647d = C6797e.a.f38379c;
        C7648e c7648eM15228g = c7647d.m15228g();
        C5207g.m11110e(c7648eM15228g, "cloneable.shortName()");
        f38440g = c7648eM15228g;
        f38441h = C7645b.m15203l(c7647d.m15229h());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6805a() {
        throw null;
    }

    public C6805a(final InterfaceC2076h interfaceC2076h, C6829c c6829c) {
        JvmBuiltInClassDescriptorFactory$1 jvmBuiltInClassDescriptorFactory$1 = new InterfaceC2052l<InterfaceC8863u, InterfaceC8084a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8084a mo528n(InterfaceC8863u interfaceC8863u) {
                InterfaceC8863u interfaceC8863u2 = interfaceC8863u;
                C5207g.m11111f(interfaceC8863u2, "module");
                List<InterfaceC8865w> listMo13626Q = interfaceC8863u2.mo11873R(C6805a.f38439f).mo13626Q();
                ArrayList arrayList = new ArrayList();
                while (true) {
                    for (Object obj : listMo13626Q) {
                        if (obj instanceof InterfaceC8084a) {
                            arrayList.add(obj);
                        }
                    }
                    return (InterfaceC8084a) C6752c.m13423Q(arrayList);
                }
            }
        };
        C5207g.m11111f(jvmBuiltInClassDescriptorFactory$1, "computeContainingDeclaration");
        this.f38442a = c6829c;
        this.f38443b = jvmBuiltInClassDescriptorFactory$1;
        this.f38444c = interfaceC2076h.mo6217b(new InterfaceC2041a<C9577l>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9577l mo807E() {
                C6805a c6805a = this.f38407b;
                InterfaceC2052l<InterfaceC8863u, InterfaceC8838g> interfaceC2052l = c6805a.f38443b;
                InterfaceC8863u interfaceC8863u = c6805a.f38442a;
                C9577l c9577l = new C9577l(interfaceC2052l.mo528n(interfaceC8863u), C6805a.f38440g, Modality.ABSTRACT, ClassKind.INTERFACE, C9000b.m17251q(interfaceC8863u.mo11877o().m13549f()), interfaceC2076h);
                c9577l.m18038V0(new C8644a(interfaceC2076h, c9577l), EmptySet.f38034a, null);
                return c9577l;
            }
        });
    }

    @Override // tm.InterfaceC9340b
    /* JADX INFO: renamed from: a */
    public final Collection<InterfaceC8830c> mo13581a(C7646c c7646c) {
        C5207g.m11111f(c7646c, "packageFqName");
        if (!C5207g.m11106a(c7646c, f38439f)) {
            return EmptySet.f38034a;
        }
        return C7499b.m14972w0((C9577l) C0062b.m366l1(this.f38444c, f38438e[0]));
    }

    @Override // tm.InterfaceC9340b
    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c mo13582b(C7645b c7645b) {
        C5207g.m11111f(c7645b, "classId");
        if (!C5207g.m11106a(c7645b, f38441h)) {
            return null;
        }
        return (C9577l) C0062b.m366l1(this.f38444c, f38438e[0]);
    }

    @Override // tm.InterfaceC9340b
    /* JADX INFO: renamed from: c */
    public final boolean mo13583c(C7646c c7646c, C7648e c7648e) {
        C5207g.m11111f(c7646c, "packageFqName");
        C5207g.m11111f(c7648e, "name");
        return C5207g.m11106a(c7648e, f38440g) && C5207g.m11106a(c7646c, f38439f);
    }
}
