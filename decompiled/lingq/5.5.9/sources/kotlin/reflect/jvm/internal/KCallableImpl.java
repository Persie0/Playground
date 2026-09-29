package kotlin.reflect.jvm.internal;

import bn.InterfaceC1617a;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import km.InterfaceC6718a;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.reflect.KParameter;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import mm.InterfaceC7639b;
import p247lm.C7390c;
import p247lm.C7396i;
import p247lm.C7398k;
import p247lm.InterfaceC7394g;
import p372rm.InterfaceC8827a0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p464wl.InterfaceC9968c;
import p543do.AbstractC5257t;
import tl.C9325m;
import tl.C9326n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KCallableImpl<R> implements InterfaceC6718a<R>, InterfaceC7394g {

    /* JADX INFO: renamed from: a */
    public final C7396i.a<ArrayList<KParameter>> f38142a;

    public KCallableImpl() {
        C7396i.m14785c(new InterfaceC2041a<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCallableImpl<R> f38143b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38143b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends Annotation> mo807E() {
                return C7398k.m14791b(this.f38143b.mo13488e());
            }
        });
        this.f38142a = C7396i.m14785c(new InterfaceC2041a<ArrayList<KParameter>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCallableImpl<R> f38144b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38144b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final ArrayList<KParameter> mo807E() {
                int i10;
                KCallableImpl<R> kCallableImpl = this.f38144b;
                final CallableMemberDescriptor callableMemberDescriptorMo13488e = kCallableImpl.mo13488e();
                ArrayList<KParameter> arrayList = new ArrayList<>();
                final int i11 = 0;
                if (kCallableImpl.mo13490g()) {
                    i10 = 0;
                } else {
                    final InterfaceC8835e0 interfaceC8835e0M14794e = C7398k.m14794e(callableMemberDescriptorMo13488e);
                    if (interfaceC8835e0M14794e != null) {
                        arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.INSTANCE, new InterfaceC2041a<InterfaceC8827a0>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final InterfaceC8827a0 mo807E() {
                                return interfaceC8835e0M14794e;
                            }
                        }));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    final InterfaceC8835e0 interfaceC8835e0Mo11896s0 = callableMemberDescriptorMo13488e.mo11896s0();
                    if (interfaceC8835e0Mo11896s0 != null) {
                        arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.EXTENSION_RECEIVER, new InterfaceC2041a<InterfaceC8827a0>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final InterfaceC8827a0 mo807E() {
                                return interfaceC8835e0Mo11896s0;
                            }
                        }));
                        i10++;
                    }
                }
                int size = callableMemberDescriptorMo13488e.mo11889i().size();
                while (i11 < size) {
                    arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.VALUE, new InterfaceC2041a<InterfaceC8827a0>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final InterfaceC8827a0 mo807E() {
                            InterfaceC8853n0 interfaceC8853n0 = callableMemberDescriptorMo13488e.mo11889i().get(i11);
                            C5207g.m11110e(interfaceC8853n0, "descriptor.valueParameters[i]");
                            return interfaceC8853n0;
                        }
                    }));
                    i11++;
                    i10++;
                }
                if (kCallableImpl.m13489f() && (callableMemberDescriptorMo13488e instanceof InterfaceC1617a) && arrayList.size() > 1) {
                    C9326n.m17682B(arrayList, new C7390c());
                }
                arrayList.trimToSize();
                return arrayList;
            }
        });
        C7396i.m14785c(new InterfaceC2041a<KTypeImpl>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCallableImpl<R> f38149b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38149b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final KTypeImpl mo807E() {
                final KCallableImpl<R> kCallableImpl = this.f38149b;
                AbstractC5257t abstractC5257tMo11900y = kCallableImpl.mo13488e().mo11900y();
                C5207g.m11108c(abstractC5257tMo11900y);
                return new KTypeImpl(abstractC5257tMo11900y, new InterfaceC2041a<Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Type mo807E() {
                        boolean z10;
                        Type[] lowerBounds;
                        KCallableImpl<Object> kCallableImpl2 = kCallableImpl;
                        CallableMemberDescriptor callableMemberDescriptorMo13488e = kCallableImpl2.mo13488e();
                        Type typeMo13524y = null;
                        InterfaceC6822c interfaceC6822c = callableMemberDescriptorMo13488e instanceof InterfaceC6822c ? (InterfaceC6822c) callableMemberDescriptorMo13488e : null;
                        if (interfaceC6822c != null) {
                            z10 = true;
                            if (!interfaceC6822c.mo5294F0()) {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            Object objM13433a0 = C6752c.m13433a0(kCallableImpl2.mo13486c().mo13522a());
                            ParameterizedType parameterizedType = objM13433a0 instanceof ParameterizedType ? (ParameterizedType) objM13433a0 : null;
                            if (C5207g.m11106a(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC9968c.class)) {
                                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                C5207g.m11110e(actualTypeArguments, "continuationType.actualTypeArguments");
                                Object objM13388t0 = C6744b.m13388t0(actualTypeArguments);
                                WildcardType wildcardType = objM13388t0 instanceof WildcardType ? (WildcardType) objM13388t0 : null;
                                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                                    typeMo13524y = (Type) C6744b.m13379k0(lowerBounds);
                                }
                            }
                        }
                        if (typeMo13524y == null) {
                            typeMo13524y = kCallableImpl2.mo13486c().mo13524y();
                        }
                        return typeMo13524y;
                    }
                });
            }
        });
        C7396i.m14785c(new InterfaceC2041a<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KCallableImpl<R> f38151b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38151b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends KTypeParameterImpl> mo807E() {
                KCallableImpl<R> kCallableImpl = this.f38151b;
                List<InterfaceC8847k0> listMo11895r = kCallableImpl.mo13488e().mo11895r();
                C5207g.m11110e(listMo11895r, "descriptor.typeParameters");
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11895r, 10));
                for (InterfaceC8847k0 interfaceC8847k0 : listMo11895r) {
                    C5207g.m11110e(interfaceC8847k0, "descriptor");
                    arrayList.add(new KTypeParameterImpl(kCallableImpl, interfaceC8847k0));
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // km.InterfaceC6718a
    /* JADX INFO: renamed from: b */
    public final R mo13337b(Object... objArr) throws IllegalCallableAccessException {
        try {
            return (R) mo13486c().mo13523b(objArr);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC7639b<?> mo13486c();

    /* JADX INFO: renamed from: d */
    public abstract KDeclarationContainerImpl mo13487d();

    /* JADX INFO: renamed from: e */
    public abstract CallableMemberDescriptor mo13488e();

    /* JADX INFO: renamed from: f */
    public final boolean m13489f() {
        return C5207g.m11106a(mo13336a(), "<init>") && mo13487d().mo10973b().isAnnotation();
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo13490g();
}
