package kotlin.reflect.jvm.internal.impl.renderer;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.util.LinkedHashSet;
import java.util.Set;
import km.InterfaceC6727j;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import mn.C7646c;
import p306on.C8094c;
import p306on.C8095d;
import p306on.InterfaceC8092a;
import p306on.InterfaceC8093b;
import p372rm.InterfaceC8853n0;
import p543do.AbstractC5257t;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererOptionsImpl implements InterfaceC8093b {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f39573W = {C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C5209i.m11119b(new MutablePropertyReference1Impl(C5209i.m11118a(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* JADX INFO: renamed from: A */
    public final C8094c f39574A;

    /* JADX INFO: renamed from: B */
    public final C8094c f39575B;

    /* JADX INFO: renamed from: C */
    public final C8094c f39576C;

    /* JADX INFO: renamed from: D */
    public final C8094c f39577D;

    /* JADX INFO: renamed from: E */
    public final C8094c f39578E;

    /* JADX INFO: renamed from: F */
    public final C8094c f39579F;

    /* JADX INFO: renamed from: G */
    public final C8094c f39580G;

    /* JADX INFO: renamed from: H */
    public final C8094c f39581H;

    /* JADX INFO: renamed from: I */
    public final C8094c f39582I;

    /* JADX INFO: renamed from: J */
    public final C8094c f39583J;

    /* JADX INFO: renamed from: K */
    public final C8094c f39584K;

    /* JADX INFO: renamed from: L */
    public final C8094c f39585L;

    /* JADX INFO: renamed from: M */
    public final C8094c f39586M;

    /* JADX INFO: renamed from: N */
    public final C8094c f39587N;

    /* JADX INFO: renamed from: O */
    public final C8094c f39588O;

    /* JADX INFO: renamed from: P */
    public final C8094c f39589P;

    /* JADX INFO: renamed from: Q */
    public final C8094c f39590Q;

    /* JADX INFO: renamed from: R */
    public final C8094c f39591R;

    /* JADX INFO: renamed from: S */
    public final C8094c f39592S;

    /* JADX INFO: renamed from: T */
    public final C8094c f39593T;

    /* JADX INFO: renamed from: U */
    public final C8094c f39594U;

    /* JADX INFO: renamed from: V */
    public final C8094c f39595V;

    /* JADX INFO: renamed from: a */
    public boolean f39596a;

    /* JADX INFO: renamed from: b */
    public final C8094c f39597b = new C8094c(InterfaceC8092a.c.f43916a, this);

    /* JADX INFO: renamed from: c */
    public final C8094c f39598c;

    /* JADX INFO: renamed from: d */
    public final C8094c f39599d;

    /* JADX INFO: renamed from: e */
    public final C8094c f39600e;

    /* JADX INFO: renamed from: f */
    public final C8094c f39601f;

    /* JADX INFO: renamed from: g */
    public final C8094c f39602g;

    /* JADX INFO: renamed from: h */
    public final C8094c f39603h;

    /* JADX INFO: renamed from: i */
    public final C8094c f39604i;

    /* JADX INFO: renamed from: j */
    public final C8094c f39605j;

    /* JADX INFO: renamed from: k */
    public final C8094c f39606k;

    /* JADX INFO: renamed from: l */
    public final C8094c f39607l;

    /* JADX INFO: renamed from: m */
    public final C8094c f39608m;

    /* JADX INFO: renamed from: n */
    public final C8094c f39609n;

    /* JADX INFO: renamed from: o */
    public final C8094c f39610o;

    /* JADX INFO: renamed from: p */
    public final C8094c f39611p;

    /* JADX INFO: renamed from: q */
    public final C8094c f39612q;

    /* JADX INFO: renamed from: r */
    public final C8094c f39613r;

    /* JADX INFO: renamed from: s */
    public final C8094c f39614s;

    /* JADX INFO: renamed from: t */
    public final C8094c f39615t;

    /* JADX INFO: renamed from: u */
    public final C8094c f39616u;

    /* JADX INFO: renamed from: v */
    public final C8094c f39617v;

    /* JADX INFO: renamed from: w */
    public final C8094c f39618w;

    /* JADX INFO: renamed from: x */
    public final C8094c f39619x;

    /* JADX INFO: renamed from: y */
    public final C8094c f39620y;

    /* JADX INFO: renamed from: z */
    public final C8094c f39621z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f39598c = new C8094c(bool, this);
        this.f39599d = new C8094c(bool, this);
        this.f39600e = new C8094c(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.f39601f = new C8094c(bool2, this);
        this.f39602g = new C8094c(bool2, this);
        this.f39603h = new C8094c(bool2, this);
        this.f39604i = new C8094c(bool2, this);
        this.f39605j = new C8094c(bool2, this);
        this.f39606k = new C8094c(bool, this);
        this.f39607l = new C8094c(bool2, this);
        this.f39608m = new C8094c(bool2, this);
        this.f39609n = new C8094c(bool2, this);
        this.f39610o = new C8094c(bool, this);
        this.f39611p = new C8094c(bool, this);
        this.f39612q = new C8094c(bool2, this);
        this.f39613r = new C8094c(bool2, this);
        this.f39614s = new C8094c(bool2, this);
        this.f39615t = new C8094c(bool2, this);
        this.f39616u = new C8094c(bool2, this);
        this.f39617v = new C8094c(bool2, this);
        this.f39618w = new C8094c(bool2, this);
        this.f39619x = new C8094c(new InterfaceC2052l<AbstractC5257t, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$typeNormalizer$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5257t mo528n(AbstractC5257t abstractC5257t) {
                AbstractC5257t abstractC5257t2 = abstractC5257t;
                C5207g.m11111f(abstractC5257t2, "it");
                return abstractC5257t2;
            }
        }, this);
        this.f39620y = new C8094c(new InterfaceC2052l<InterfaceC8853n0, String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final String mo528n(InterfaceC8853n0 interfaceC8853n0) {
                C5207g.m11111f(interfaceC8853n0, "it");
                return "...";
            }
        }, this);
        this.f39621z = new C8094c(bool, this);
        this.f39574A = new C8094c(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.f39575B = new C8094c(DescriptorRenderer.InterfaceC7002b.a.f39559a, this);
        this.f39576C = new C8094c(RenderingFormat.PLAIN, this);
        this.f39577D = new C8094c(ParameterNameRenderingPolicy.ALL, this);
        this.f39578E = new C8094c(bool2, this);
        this.f39579F = new C8094c(bool2, this);
        this.f39580G = new C8094c(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.f39581H = new C8094c(bool2, this);
        this.f39582I = new C8094c(bool2, this);
        this.f39583J = new C8094c(EmptySet.f38034a, this);
        this.f39584K = new C8094c(C8095d.f43918a, this);
        this.f39585L = new C8094c(null, this);
        this.f39586M = new C8094c(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.f39587N = new C8094c(bool2, this);
        this.f39588O = new C8094c(bool, this);
        this.f39589P = new C8094c(bool, this);
        this.f39590Q = new C8094c(bool2, this);
        this.f39591R = new C8094c(bool, this);
        this.f39592S = new C8094c(bool, this);
        this.f39593T = new C8094c(bool2, this);
        this.f39594U = new C8094c(bool2, this);
        this.f39595V = new C8094c(bool, this);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: a */
    public final void mo14023a() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[29];
        this.f39578E.m12229c(Boolean.TRUE, interfaceC6727j);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: b */
    public final void mo14025b() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[6];
        this.f39603h.m12229c(Boolean.TRUE, interfaceC6727j);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: c */
    public final void mo14027c() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[30];
        this.f39579F.m12229c(Boolean.TRUE, interfaceC6727j);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: d */
    public final void mo14028d(Set<? extends DescriptorRendererModifier> set) {
        C5207g.m11111f(set, "<set-?>");
        this.f39600e.m12229c(set, f39573W[3]);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: e */
    public final void mo14030e(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        C5207g.m11111f(parameterNameRenderingPolicy, "<set-?>");
        this.f39577D.m12229c(parameterNameRenderingPolicy, f39573W[28]);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: f */
    public final boolean mo14032f() {
        return ((Boolean) this.f39608m.m12228b(this, f39573W[11])).booleanValue();
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: g */
    public final void mo14034g(LinkedHashSet linkedHashSet) {
        this.f39584K.m12229c(linkedHashSet, f39573W[35]);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: h */
    public final void mo14036h() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[20];
        this.f39617v.m12229c(Boolean.TRUE, interfaceC6727j);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: i */
    public final void mo14038i(RenderingFormat renderingFormat) {
        C5207g.m11111f(renderingFormat, "<set-?>");
        this.f39576C.m12229c(renderingFormat, f39573W[27]);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: j */
    public final void mo14040j(InterfaceC8092a interfaceC8092a) {
        this.f39597b.m12229c(interfaceC8092a, f39573W[0]);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: k */
    public final void mo14042k() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[4];
        this.f39601f.m12229c(Boolean.TRUE, interfaceC6727j);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: l */
    public final void mo14044l() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[1];
        this.f39598c.m12229c(Boolean.FALSE, interfaceC6727j);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: m */
    public final Set<C7646c> mo14046m() {
        return (Set) this.f39584K.m12228b(this, f39573W[35]);
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: n */
    public final boolean mo14048n() {
        return ((Boolean) this.f39603h.m12228b(this, f39573W[6])).booleanValue();
    }

    @Override // p306on.InterfaceC8093b
    /* JADX INFO: renamed from: o */
    public final void mo14049o() {
        InterfaceC6727j<Object> interfaceC6727j = f39573W[21];
        this.f39618w.m12229c(Boolean.TRUE, interfaceC6727j);
    }

    /* JADX INFO: renamed from: p */
    public final AnnotationArgumentsRenderingPolicy m14067p() {
        return (AnnotationArgumentsRenderingPolicy) this.f39586M.m12228b(this, f39573W[37]);
    }
}
