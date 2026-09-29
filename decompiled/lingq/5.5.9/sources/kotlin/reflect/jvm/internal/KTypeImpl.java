package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import dm.C5206f;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import km.C6730m;
import km.InterfaceC6720c;
import km.InterfaceC6727j;
import km.InterfaceC6728k;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p247lm.C7396i;
import p247lm.C7398k;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.C5258t0;
import p543do.InterfaceC5246n0;
import sl.InterfaceC9070c;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class KTypeImpl implements InterfaceC6728k {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38271d = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a */
    public final AbstractC5257t f38272a;

    /* JADX INFO: renamed from: b */
    public final C7396i.a<Type> f38273b;

    /* JADX INFO: renamed from: c */
    public final C7396i.a f38274c;

    public KTypeImpl(AbstractC5257t abstractC5257t, final InterfaceC2041a<? extends Type> interfaceC2041a) {
        C5207g.m11111f(abstractC5257t, "type");
        this.f38272a = abstractC5257t;
        C7396i.a<Type> aVarM14785c = null;
        C7396i.a<Type> aVar = interfaceC2041a instanceof C7396i.a ? (C7396i.a) interfaceC2041a : null;
        if (aVar != null) {
            aVarM14785c = aVar;
        } else if (interfaceC2041a != null) {
            aVarM14785c = C7396i.m14785c(interfaceC2041a);
        }
        this.f38273b = aVarM14785c;
        this.f38274c = C7396i.m14785c(new InterfaceC2041a<InterfaceC6720c>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$classifier$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC6720c mo807E() {
                KTypeImpl kTypeImpl = this.f38282b;
                return kTypeImpl.m13515a(kTypeImpl.f38272a);
            }
        });
        C7396i.m14785c(new InterfaceC2041a<List<? extends C6730m>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$a */
            public /* synthetic */ class C6781a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f38280a;

                static {
                    int[] iArr = new int[Variance.values().length];
                    iArr[Variance.INVARIANT.ordinal()] = 1;
                    iArr[Variance.IN_VARIANCE.ordinal()] = 2;
                    iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
                    f38280a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends C6730m> mo807E() {
                C6730m c6730m;
                final KTypeImpl kTypeImpl = this.f38275b;
                List<InterfaceC5246n0> listMo11240V0 = kTypeImpl.f38272a.mo11240V0();
                if (listMo11240V0.isEmpty()) {
                    return EmptyList.f38032a;
                }
                final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final List<? extends Type> mo807E() {
                        C7396i.a<Type> aVar2 = kTypeImpl.f38273b;
                        Type typeMo807E = aVar2 != null ? aVar2.mo807E() : null;
                        C5207g.m11108c(typeMo807E);
                        return ReflectClassUtilKt.m13650c(typeMo807E);
                    }
                });
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11240V0, 10));
                final int i10 = 0;
                for (Object obj : listMo11240V0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) obj;
                    if (interfaceC5246n0.mo11239f()) {
                        c6730m = C6730m.f37941c;
                    } else {
                        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
                        C5207g.m11110e(abstractC5257tMo11236c, "typeProjection.type");
                        KTypeImpl kTypeImpl2 = new KTypeImpl(abstractC5257tMo11236c, interfaceC2041a != null ? new InterfaceC2041a<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$1$type$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Type mo807E() {
                                KTypeImpl kTypeImpl3 = kTypeImpl;
                                C7396i.a<Type> aVar2 = kTypeImpl3.f38273b;
                                Type typeMo807E = aVar2 != null ? aVar2.mo807E() : null;
                                if (typeMo807E instanceof Class) {
                                    Class cls = (Class) typeMo807E;
                                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                                    C5207g.m11110e(componentType, "{\n                      …                        }");
                                    return componentType;
                                }
                                boolean z10 = typeMo807E instanceof GenericArrayType;
                                int i12 = i10;
                                if (z10) {
                                    if (i12 == 0) {
                                        Type genericComponentType = ((GenericArrayType) typeMo807E).getGenericComponentType();
                                        C5207g.m11110e(genericComponentType, "{\n                      …                        }");
                                        return genericComponentType;
                                    }
                                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl3);
                                }
                                if (!(typeMo807E instanceof ParameterizedType)) {
                                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl3);
                                }
                                Type type = interfaceC9070cM13373b.getValue().get(i12);
                                if (type instanceof WildcardType) {
                                    WildcardType wildcardType = (WildcardType) type;
                                    Type[] lowerBounds = wildcardType.getLowerBounds();
                                    C5207g.m11110e(lowerBounds, "argument.lowerBounds");
                                    Type type2 = (Type) C6744b.m13380l0(lowerBounds);
                                    if (type2 == null) {
                                        Type[] upperBounds = wildcardType.getUpperBounds();
                                        C5207g.m11110e(upperBounds, "argument.upperBounds");
                                        type = (Type) C6744b.m13379k0(upperBounds);
                                    } else {
                                        type = type2;
                                    }
                                }
                                C5207g.m11110e(type, "{\n                      …                        }");
                                return type;
                            }
                        } : null);
                        int i12 = C6781a.f38280a[interfaceC5246n0.mo11237d().ordinal()];
                        if (i12 == 1) {
                            c6730m = new C6730m(KVariance.INVARIANT, kTypeImpl2);
                        } else if (i12 == 2) {
                            c6730m = new C6730m(KVariance.IN, kTypeImpl2);
                        } else {
                            if (i12 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c6730m = new C6730m(KVariance.OUT, kTypeImpl2);
                        }
                    }
                    arrayList.add(c6730m);
                    i10 = i11;
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC6720c m13515a(AbstractC5257t abstractC5257t) {
        AbstractC5257t abstractC5257tMo11236c;
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (!(interfaceC8834eMo11235q instanceof InterfaceC8830c)) {
            if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
                return new KTypeParameterImpl(null, (InterfaceC8847k0) interfaceC8834eMo11235q);
            }
            if (interfaceC8834eMo11235q instanceof InterfaceC8845j0) {
                throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class<?> clsM14797h = C7398k.m14797h((InterfaceC8830c) interfaceC8834eMo11235q);
        if (clsM14797h == null) {
            return null;
        }
        if (!clsM14797h.isArray()) {
            if (C5258t0.m11296g(abstractC5257t)) {
                return new KClassImpl(clsM14797h);
            }
            Class<? extends Object> cls = ReflectClassUtilKt.f38581b.get(clsM14797h);
            if (cls != null) {
                clsM14797h = cls;
            }
            return new KClassImpl(clsM14797h);
        }
        InterfaceC5246n0 interfaceC5246n0 = (InterfaceC5246n0) C6752c.m13445m0(abstractC5257t.mo11240V0());
        if (interfaceC5246n0 == null || (abstractC5257tMo11236c = interfaceC5246n0.mo11236c()) == null) {
            return new KClassImpl(clsM14797h);
        }
        InterfaceC6720c interfaceC6720cM13515a = m13515a(abstractC5257tMo11236c);
        if (interfaceC6720cM13515a != null) {
            return new KClassImpl(Array.newInstance((Class<?>) C5206f.m10998T0(C5206f.m11001W0(interfaceC6720cM13515a)), 0).getClass());
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KTypeImpl) {
            if (C5207g.m11106a(this.f38272a, ((KTypeImpl) obj).f38272a)) {
                return true;
            }
        }
        return false;
    }

    @Override // km.InterfaceC6728k
    /* JADX INFO: renamed from: g */
    public final InterfaceC6720c mo13340g() {
        InterfaceC6727j<Object> interfaceC6727j = f38271d[0];
        return (InterfaceC6720c) this.f38274c.mo807E();
    }

    public final int hashCode() {
        return this.f38272a.hashCode();
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f38289a;
        return ReflectionObjectRenderer.m13520d(this.f38272a);
    }
}
