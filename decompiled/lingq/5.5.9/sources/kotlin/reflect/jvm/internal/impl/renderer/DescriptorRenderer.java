package kotlin.reflect.jvm.internal.impl.renderer;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import mn.C7647d;
import mn.C7648e;
import p306on.InterfaceC8092a;
import p306on.InterfaceC8093b;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;
import p543do.InterfaceC5246n0;
import sl.C9072e;
import sm.InterfaceC9075c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorRenderer {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRendererImpl f39546a;

    /* JADX INFO: renamed from: b */
    public static final DescriptorRendererImpl f39547b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a */
    public static final class C7001a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f39558a;

            static {
                int[] iArr = new int[ClassKind.values().length];
                iArr[ClassKind.CLASS.ordinal()] = 1;
                iArr[ClassKind.INTERFACE.ordinal()] = 2;
                iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                iArr[ClassKind.OBJECT.ordinal()] = 4;
                iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                f39558a = iArr;
            }
        }

        /* JADX INFO: renamed from: a */
        public static DescriptorRendererImpl m13987a(InterfaceC2052l interfaceC2052l) {
            C5207g.m11111f(interfaceC2052l, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            interfaceC2052l.mo528n(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.f39596a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b */
    public interface InterfaceC7002b {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b$a */
        public static final class a implements InterfaceC7002b {

            /* JADX INFO: renamed from: a */
            public static final a f39559a = new a();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.InterfaceC7002b
            /* JADX INFO: renamed from: a */
            public final void mo13988a(StringBuilder sb2) {
                C5207g.m11111f(sb2, "builder");
                sb2.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.InterfaceC7002b
            /* JADX INFO: renamed from: b */
            public final void mo13989b(InterfaceC8853n0 interfaceC8853n0, int i10, int i11, StringBuilder sb2) {
                C5207g.m11111f(sb2, "builder");
                if (i10 != i11 - 1) {
                    sb2.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.InterfaceC7002b
            /* JADX INFO: renamed from: c */
            public final void mo13990c(InterfaceC8853n0 interfaceC8853n0, StringBuilder sb2) {
                C5207g.m11111f(interfaceC8853n0, "parameter");
                C5207g.m11111f(sb2, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.InterfaceC7002b
            /* JADX INFO: renamed from: d */
            public final void mo13991d(StringBuilder sb2) {
                C5207g.m11111f(sb2, "builder");
                sb2.append(")");
            }
        }

        /* JADX INFO: renamed from: a */
        void mo13988a(StringBuilder sb2);

        /* JADX INFO: renamed from: b */
        void mo13989b(InterfaceC8853n0 interfaceC8853n0, int i10, int i11, StringBuilder sb2);

        /* JADX INFO: renamed from: c */
        void mo13990c(InterfaceC8853n0 interfaceC8853n0, StringBuilder sb2);

        /* JADX INFO: renamed from: d */
        void mo13991d(StringBuilder sb2);
    }

    static {
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14044l();
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14044l();
                interfaceC8093b2.mo14028d(EmptySet.f38034a);
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14044l();
                interfaceC8093b2.mo14028d(EmptySet.f38034a);
                interfaceC8093b2.mo14049o();
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14028d(EmptySet.f38034a);
                interfaceC8093b2.mo14040j(InterfaceC8092a.b.f43915a);
                interfaceC8093b2.mo14030e(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14044l();
                interfaceC8093b2.mo14028d(EmptySet.f38034a);
                interfaceC8093b2.mo14040j(InterfaceC8092a.b.f43915a);
                interfaceC8093b2.mo14036h();
                interfaceC8093b2.mo14030e(ParameterNameRenderingPolicy.NONE);
                interfaceC8093b2.mo14023a();
                interfaceC8093b2.mo14027c();
                interfaceC8093b2.mo14049o();
                interfaceC8093b2.mo14042k();
                return C9072e.f47360a;
            }
        });
        f39546a = C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14028d(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14028d(DescriptorRendererModifier.ALL);
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14040j(InterfaceC8092a.b.f43915a);
                interfaceC8093b2.mo14030e(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
                return C9072e.f47360a;
            }
        });
        f39547b = C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$DEBUG_TEXT$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14025b();
                interfaceC8093b2.mo14040j(InterfaceC8092a.a.f43914a);
                interfaceC8093b2.mo14028d(DescriptorRendererModifier.ALL);
                return C9072e.f47360a;
            }
        });
        C7001a.m13987a(new InterfaceC2052l<InterfaceC8093b, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$HTML$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8093b interfaceC8093b) {
                InterfaceC8093b interfaceC8093b2 = interfaceC8093b;
                C5207g.m11111f(interfaceC8093b2, "$this$withOptions");
                interfaceC8093b2.mo14038i(RenderingFormat.HTML);
                interfaceC8093b2.mo14028d(DescriptorRendererModifier.ALL);
                return C9072e.f47360a;
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public abstract String mo13981p(InterfaceC9075c interfaceC9075c, AnnotationUseSiteTarget annotationUseSiteTarget);

    /* JADX INFO: renamed from: r */
    public abstract String mo13982r(String str, String str2, AbstractC6795c abstractC6795c);

    /* JADX INFO: renamed from: s */
    public abstract String mo13983s(C7647d c7647d);

    /* JADX INFO: renamed from: t */
    public abstract String mo13984t(C7648e c7648e, boolean z10);

    /* JADX INFO: renamed from: u */
    public abstract String mo13985u(AbstractC5257t abstractC5257t);

    /* JADX INFO: renamed from: v */
    public abstract String mo13986v(InterfaceC5246n0 interfaceC5246n0);
}
