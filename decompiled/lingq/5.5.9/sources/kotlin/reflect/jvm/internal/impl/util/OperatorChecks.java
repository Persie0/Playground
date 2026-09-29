package kotlin.reflect.jvm.internal.impl.util;

import android.support.v4.media.AbstractC0140a;
import cm.InterfaceC2052l;
import dm.C5207g;
import io.AbstractC6382i;
import io.AbstractC6388o;
import io.C6381h;
import io.C6384k;
import io.C6387n;
import io.InterfaceC6378e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.Regex;
import mn.C7645b;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8853n0;
import p385sf.C9000b;
import p492xn.C10256e;
import p492xn.InterfaceC10257f;
import p543do.AbstractC5257t;

/* JADX INFO: loaded from: classes2.dex */
public final class OperatorChecks extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public static final OperatorChecks f39923a = new OperatorChecks();

    /* JADX INFO: renamed from: b */
    public static final List<C7068a> f39924b;

    static {
        C7648e c7648e = C6387n.f36802i;
        AbstractC6382i.b bVar = AbstractC6382i.b.f36787b;
        InterfaceC6378e[] interfaceC6378eArr = {bVar, new AbstractC6388o.a(1)};
        C7648e c7648e2 = C6387n.f36803j;
        InterfaceC6378e[] interfaceC6378eArr2 = {bVar, new AbstractC6388o.a(2)};
        C7648e c7648e3 = C6387n.f36794a;
        C6384k c6384k = C6384k.f36789a;
        C6381h c6381h = C6381h.f36784a;
        InterfaceC6378e[] interfaceC6378eArr3 = {bVar, c6384k, new AbstractC6388o.a(2), c6381h};
        C7648e c7648e4 = C6387n.f36795b;
        InterfaceC6378e[] interfaceC6378eArr4 = {bVar, c6384k, new AbstractC6388o.a(3), c6381h};
        C7648e c7648e5 = C6387n.f36796c;
        InterfaceC6378e[] interfaceC6378eArr5 = {bVar, c6384k, new AbstractC6388o.b(), c6381h};
        C7648e c7648e6 = C6387n.f36800g;
        InterfaceC6378e[] interfaceC6378eArr6 = {bVar};
        C7648e c7648e7 = C6387n.f36799f;
        AbstractC6388o.d dVar = AbstractC6388o.d.f36819b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f39930c;
        InterfaceC6378e[] interfaceC6378eArr7 = {bVar, dVar, c6384k, returnsBoolean};
        C7648e c7648e8 = C6387n.f36801h;
        AbstractC6388o.c cVar = AbstractC6388o.c.f36818b;
        InterfaceC6378e[] interfaceC6378eArr8 = {bVar, cVar};
        C7648e c7648e9 = C6387n.f36804k;
        InterfaceC6378e[] interfaceC6378eArr9 = {bVar, cVar};
        C7648e c7648e10 = C6387n.f36805l;
        InterfaceC6378e[] interfaceC6378eArr10 = {bVar, cVar, returnsBoolean};
        C7648e c7648e11 = C6387n.f36809p;
        InterfaceC6378e[] interfaceC6378eArr11 = {bVar, dVar, c6384k};
        C7648e c7648e12 = C6387n.f36797d;
        InterfaceC6378e[] interfaceC6378eArr12 = {AbstractC6382i.a.f36786b};
        C7648e c7648e13 = C6387n.f36798e;
        InterfaceC6378e[] interfaceC6378eArr13 = {bVar, ReturnsCheck.ReturnsInt.f39932c, dVar, c6384k};
        Set<C7648e> set = C6387n.f36812s;
        InterfaceC6378e[] interfaceC6378eArr14 = {bVar, dVar, c6384k};
        Set<C7648e> set2 = C6387n.f36811r;
        InterfaceC6378e[] interfaceC6378eArr15 = {bVar, cVar};
        List listM17252r = C9000b.m17252r(C6387n.f36807n, C6387n.f36808o);
        InterfaceC6378e[] interfaceC6378eArr16 = {bVar};
        Set<C7648e> set3 = C6387n.f36813t;
        InterfaceC6378e[] interfaceC6378eArr17 = {bVar, ReturnsCheck.ReturnsUnit.f39934c, dVar, c6384k};
        Regex regex = C6387n.f36806m;
        InterfaceC6378e[] interfaceC6378eArr18 = {bVar, cVar};
        Checks$3 checks$3 = new InterfaceC2052l() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks$3
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Object obj) {
                C5207g.m11111f((InterfaceC6822c) obj, "$this$null");
                return null;
            }
        };
        C5207g.m11111f(regex, "regex");
        C5207g.m11111f(checks$3, "additionalChecks");
        f39924b = C9000b.m17252r(new C7068a(c7648e, interfaceC6378eArr), new C7068a(c7648e2, interfaceC6378eArr2, new InterfaceC2052l<InterfaceC6822c, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final String mo528n(InterfaceC6822c interfaceC6822c) {
                InterfaceC6822c interfaceC6822c2 = interfaceC6822c;
                C5207g.m11111f(interfaceC6822c2, "$this$$receiver");
                List<InterfaceC8853n0> listMo11889i = interfaceC6822c2.mo11889i();
                C5207g.m11110e(listMo11889i, "valueParameters");
                InterfaceC8853n0 interfaceC8853n0 = (InterfaceC8853n0) C6752c.m13433a0(listMo11889i);
                boolean z10 = false;
                if (interfaceC8853n0 != null) {
                    if (!DescriptorUtilsKt.m14104a(interfaceC8853n0) && interfaceC8853n0.mo13647r0() == null) {
                        z10 = true;
                    }
                }
                OperatorChecks operatorChecks = OperatorChecks.f39923a;
                if (z10) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            }
        }), new C7068a(c7648e3, interfaceC6378eArr3), new C7068a(c7648e4, interfaceC6378eArr4), new C7068a(c7648e5, interfaceC6378eArr5), new C7068a(c7648e6, interfaceC6378eArr6), new C7068a(c7648e7, interfaceC6378eArr7), new C7068a(c7648e8, interfaceC6378eArr8), new C7068a(c7648e9, interfaceC6378eArr9), new C7068a(c7648e10, interfaceC6378eArr10), new C7068a(c7648e11, interfaceC6378eArr11), new C7068a(c7648e12, interfaceC6378eArr12, new InterfaceC2052l<InterfaceC6822c, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2
            /* JADX WARN: Code duplicated, block: B:20:0x007c  */
            /* JADX WARN: Code duplicated, block: B:7:0x0030  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final String mo528n(InterfaceC6822c interfaceC6822c) {
                boolean z10;
                boolean z11;
                boolean z12;
                InterfaceC6822c interfaceC6822c2 = interfaceC6822c;
                C5207g.m11111f(interfaceC6822c2, "$this$$receiver");
                OperatorChecks operatorChecks = OperatorChecks.f39923a;
                InterfaceC8838g interfaceC8838gMo11876g = interfaceC6822c2.mo11876g();
                C5207g.m11110e(interfaceC8838gMo11876g, "containingDeclaration");
                boolean z13 = true;
                if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                    C7648e c7648e14 = AbstractC6795c.f38322e;
                    if (AbstractC6795c.m13542c((InterfaceC8830c) interfaceC8838gMo11876g, C6797e.a.f38375a)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Collection<? extends CallableMemberDescriptor> collectionMo11893p = interfaceC6822c2.mo11893p();
                    C5207g.m11110e(collectionMo11893p, "overriddenDescriptors");
                    if (!collectionMo11893p.isEmpty()) {
                        Iterator<T> it = collectionMo11893p.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                                break;
                            }
                            InterfaceC8838g interfaceC8838gMo11876g2 = ((InterfaceC6822c) it.next()).mo11876g();
                            C5207g.m11110e(interfaceC8838gMo11876g2, "it.containingDeclaration");
                            if (interfaceC8838gMo11876g2 instanceof InterfaceC8830c) {
                                C7648e c7648e15 = AbstractC6795c.f38322e;
                                if (AbstractC6795c.m13542c((InterfaceC8830c) interfaceC8838gMo11876g2, C6797e.a.f38375a)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                    if (!z11) {
                        z13 = false;
                    }
                }
                if (z13) {
                    return null;
                }
                return "must override ''equals()'' in Any";
            }
        }), new C7068a(c7648e13, interfaceC6378eArr13), new C7068a(set, interfaceC6378eArr14), new C7068a(set2, interfaceC6378eArr15), new C7068a(listM17252r, interfaceC6378eArr16, new InterfaceC2052l<InterfaceC6822c, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
            /* JADX WARN: Code duplicated, block: B:30:0x0089  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final String mo528n(InterfaceC6822c interfaceC6822c) {
                boolean zM14234k;
                boolean zM14234k2;
                C7645b c7645bM14109f;
                AbstractC5257t abstractC5257tMo11900y;
                InterfaceC6822c interfaceC6822c2 = interfaceC6822c;
                C5207g.m11111f(interfaceC6822c2, "$this$$receiver");
                InterfaceC8835e0 interfaceC8835e0Mo11892m0 = interfaceC6822c2.mo11892m0();
                if (interfaceC8835e0Mo11892m0 == null) {
                    interfaceC8835e0Mo11892m0 = interfaceC6822c2.mo11896s0();
                }
                OperatorChecks operatorChecks = OperatorChecks.f39923a;
                boolean z10 = false;
                if (interfaceC8835e0Mo11892m0 != null) {
                    AbstractC5257t abstractC5257tMo11900y2 = interfaceC6822c2.mo11900y();
                    if (abstractC5257tMo11900y2 != null) {
                        AbstractC5257t abstractC5257tMo11884c = interfaceC8835e0Mo11892m0.mo11884c();
                        C5207g.m11110e(abstractC5257tMo11884c, "receiver.type");
                        zM14234k = TypeUtilsKt.m14234k(abstractC5257tMo11900y2, abstractC5257tMo11884c);
                    } else {
                        zM14234k = false;
                    }
                    if (zM14234k) {
                        z10 = true;
                    } else {
                        operatorChecks.getClass();
                        InterfaceC10257f value = interfaceC8835e0Mo11892m0.getValue();
                        C5207g.m11110e(value, "receiver.value");
                        if (value instanceof C10256e) {
                            InterfaceC8830c interfaceC8830c = ((C10256e) value).f51690a;
                            if (interfaceC8830c.mo11882T() && (c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8830c)) != null) {
                                InterfaceC8834e interfaceC8834eM13585b = FindClassInModuleKt.m13585b(DescriptorUtilsKt.m14113j(interfaceC8830c), c7645bM14109f);
                                if (!(interfaceC8834eM13585b instanceof InterfaceC8845j0)) {
                                    interfaceC8834eM13585b = null;
                                }
                                InterfaceC8845j0 interfaceC8845j0 = (InterfaceC8845j0) interfaceC8834eM13585b;
                                if (interfaceC8845j0 == null || (abstractC5257tMo11900y = interfaceC6822c2.mo11900y()) == null) {
                                    zM14234k2 = false;
                                } else {
                                    zM14234k2 = TypeUtilsKt.m14234k(abstractC5257tMo11900y, interfaceC8845j0.mo5313d0());
                                }
                            } else {
                                zM14234k2 = false;
                            }
                        } else {
                            zM14234k2 = false;
                        }
                        if (zM14234k2) {
                            z10 = true;
                        }
                    }
                }
                return z10 ? null : "receiver must be a supertype of the return type";
            }
        }), new C7068a(set3, interfaceC6378eArr17), new C7068a(null, regex, null, checks$3, (InterfaceC6378e[]) Arrays.copyOf(interfaceC6378eArr18, 2)));
    }
}
