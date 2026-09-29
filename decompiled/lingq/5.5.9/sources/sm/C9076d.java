package sm;

import fo.C5602h;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p373rn.AbstractC8875g;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: sm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9076d implements InterfaceC9075c {

    /* JADX INFO: renamed from: a */
    public final AbstractC5257t f47362a;

    /* JADX INFO: renamed from: b */
    public final Map<C7648e, AbstractC8875g<?>> f47363b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8837f0 f47364c;

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public C9076d(AbstractC5265x abstractC5265x, Map map, InterfaceC8837f0 interfaceC8837f0) {
        if (abstractC5265x == null) {
            m17279b(0);
            throw null;
        }
        if (map == null) {
            m17279b(1);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m17279b(2);
            throw null;
        }
        this.f47362a = abstractC5265x;
        this.f47363b = map;
        this.f47364c = interfaceC8837f0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m17279b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public final Map<C7648e, AbstractC8875g<?>> mo12513a() {
        Map<C7648e, AbstractC8875g<?>> map = this.f47363b;
        if (map != null) {
            return map;
        }
        m17279b(4);
        throw null;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo12514c() {
        AbstractC5257t abstractC5257t = this.f47362a;
        if (abstractC5257t != null) {
            return abstractC5257t;
        }
        m17279b(3);
        throw null;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: e */
    public final C7646c mo12515e() {
        InterfaceC8830c interfaceC8830cM14107d = DescriptorUtilsKt.m14107d(this);
        if (interfaceC8830cM14107d == null) {
            return null;
        }
        if (C5602h.m11915f(interfaceC8830cM14107d)) {
            interfaceC8830cM14107d = null;
        }
        if (interfaceC8830cM14107d != null) {
            return DescriptorUtilsKt.m14106c(interfaceC8830cM14107d);
        }
        return null;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo12516j() {
        InterfaceC8837f0 interfaceC8837f0 = this.f47364c;
        if (interfaceC8837f0 != null) {
            return interfaceC8837f0;
        }
        m17279b(5);
        throw null;
    }

    public final String toString() {
        return DescriptorRenderer.f39546a.mo13981p(this, null);
    }
}
