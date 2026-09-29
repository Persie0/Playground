package p247lm;

import dm.C5207g;
import kotlin.reflect.jvm.internal.C6785b;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty2Impl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8868z;
import sl.C9072e;

/* JADX INFO: renamed from: lm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7388a implements InterfaceC8842i<KCallableImpl<?>, C9072e> {

    /* JADX INFO: renamed from: a */
    public final KDeclarationContainerImpl f41190a;

    public C7388a(KDeclarationContainerImpl kDeclarationContainerImpl) {
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        this.f41190a = kDeclarationContainerImpl;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: a */
    public final KCallableImpl<?> mo14052a(InterfaceC8833d0 interfaceC8833d0, C9072e c9072e) {
        return mo14062k(interfaceC8833d0, c9072e);
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14053b(InterfaceC8830c interfaceC8830c, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14054c(InterfaceC8863u interfaceC8863u, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14055d(InterfaceC8847k0 interfaceC8847k0, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14056e(InterfaceC8865w interfaceC8865w, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14057f(InterfaceC8835e0 interfaceC8835e0, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: g */
    public final KCallableImpl<?> mo14058g(InterfaceC8831c0 interfaceC8831c0, C9072e c9072e) {
        return mo14062k(interfaceC8831c0, c9072e);
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14059h(InterfaceC8845j0 interfaceC8845j0, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14060i(InterfaceC8868z interfaceC8868z, C9072e c9072e) {
        return null;
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: j */
    public final KCallableImpl<?> mo14061j(InterfaceC8829b0 interfaceC8829b0, C9072e c9072e) {
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        C5207g.m11111f(c9072e, "data");
        int i10 = (interfaceC8829b0.mo11892m0() != null ? 1 : 0) + (interfaceC8829b0.mo11896s0() != null ? 1 : 0);
        boolean zMo11894q0 = interfaceC8829b0.mo11894q0();
        KDeclarationContainerImpl kDeclarationContainerImpl = this.f41190a;
        if (zMo11894q0) {
            if (i10 == 0) {
                return new KMutableProperty0Impl(kDeclarationContainerImpl, interfaceC8829b0);
            }
            if (i10 == 1) {
                return new KMutableProperty1Impl(kDeclarationContainerImpl, interfaceC8829b0);
            }
            if (i10 == 2) {
                return new C6785b(kDeclarationContainerImpl, interfaceC8829b0);
            }
        } else {
            if (i10 == 0) {
                return new KProperty0Impl(kDeclarationContainerImpl, interfaceC8829b0);
            }
            if (i10 == 1) {
                return new KProperty1Impl(kDeclarationContainerImpl, interfaceC8829b0);
            }
            if (i10 == 2) {
                return new KProperty2Impl(kDeclarationContainerImpl, interfaceC8829b0);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + interfaceC8829b0);
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: k */
    public final KCallableImpl<?> mo14062k(InterfaceC6822c interfaceC6822c, C9072e c9072e) {
        C5207g.m11111f(interfaceC6822c, "descriptor");
        C5207g.m11111f(c9072e, "data");
        return new KFunctionImpl(this.f41190a, interfaceC6822c);
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: l */
    public KCallableImpl<?> mo14063l(InterfaceC6821b interfaceC6821b, C9072e c9072e) {
        return mo14062k(interfaceC6821b, c9072e);
    }

    @Override // p372rm.InterfaceC8842i
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo14064m(InterfaceC8853n0 interfaceC8853n0, C9072e c9072e) {
        return null;
    }
}
