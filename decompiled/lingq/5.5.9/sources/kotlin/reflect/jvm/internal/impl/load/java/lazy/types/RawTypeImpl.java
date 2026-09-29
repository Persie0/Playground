package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.C7076b;
import p102eo.AbstractC5439d;
import p102eo.InterfaceC5438c;
import p306on.InterfaceC8093b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.InterfaceC5246n0;
import p543do.InterfaceC5263w;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class RawTypeImpl extends AbstractC5249p implements InterfaceC5263w {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        this(abstractC5265x, abstractC5265x2, false);
        C5207g.m11111f(abstractC5265x, "lowerBound");
        C5207g.m11111f(abstractC5265x2, "upperBound");
    }

    public RawTypeImpl(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2, boolean z10) {
        super(abstractC5265x, abstractC5265x2);
        if (!z10) {
            InterfaceC5438c.f33982a.m11667d(abstractC5265x, abstractC5265x2);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public static final ArrayList m13727h1(DescriptorRenderer descriptorRenderer, AbstractC5265x abstractC5265x) {
        List<InterfaceC5246n0> listMo11240V0 = abstractC5265x.mo11240V0();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11240V0, 10));
        Iterator<T> it = listMo11240V0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.mo13986v((InterfaceC5246n0) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i1 */
    public static final String m13728i1(String str, String str2) {
        if (!C7076b.m14279Y2(str, '<')) {
            return str;
        }
        return C7076b.m14305y3(str, '<') + '<' + str2 + '>' + C7076b.m14304x3(str, '>', str);
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: b1 */
    public final AbstractC5262v0 mo11217b1(boolean z10) {
        return new RawTypeImpl(this.f33340b.mo11217b1(z10), this.f33341c.mo11217b1(z10));
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: d1 */
    public final AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
        C5207g.m11111f(c5238j0, "newAttributes");
        return new RawTypeImpl(this.f33340b.mo11243d1(c5238j0), this.f33341c.mo11243d1(c5238j0));
    }

    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: e1 */
    public final AbstractC5265x mo11283e1() {
        return this.f33340b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p543do.AbstractC5249p
    /* JADX INFO: renamed from: f1 */
    public final String mo11284f1(DescriptorRenderer descriptorRenderer, InterfaceC8093b interfaceC8093b) {
        C5207g.m11111f(descriptorRenderer, "renderer");
        C5207g.m11111f(interfaceC8093b, "options");
        AbstractC5265x abstractC5265x = this.f33340b;
        String strMo13985u = descriptorRenderer.mo13985u(abstractC5265x);
        AbstractC5265x abstractC5265x2 = this.f33341c;
        String strMo13985u2 = descriptorRenderer.mo13985u(abstractC5265x2);
        if (interfaceC8093b.mo14048n()) {
            return "raw (" + strMo13985u + ".." + strMo13985u2 + ')';
        }
        if (abstractC5265x2.mo11240V0().isEmpty()) {
            return descriptorRenderer.mo13982r(strMo13985u, strMo13985u2, TypeUtilsKt.m14230g(this));
        }
        ArrayList arrayListM13727h1 = m13727h1(descriptorRenderer, abstractC5265x);
        ArrayList arrayListM13727h2 = m13727h1(descriptorRenderer, abstractC5265x2);
        String strM13430X = C6752c.m13430X(arrayListM13727h1, ", ", null, null, new InterfaceC2052l<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(String str) {
                String str2 = str;
                C5207g.m11111f(str2, "it");
                return "(raw) ".concat(str2);
            }
        }, 30);
        ArrayList<Pair> arrayListM13412A0 = C6752c.m13412A0(arrayListM13727h1, arrayListM13727h2);
        boolean z10 = true;
        if (!arrayListM13412A0.isEmpty()) {
            for (Pair pair : arrayListM13412A0) {
                String str = (String) pair.f38012a;
                String str2 = (String) pair.f38013b;
                if (!(C5207g.m11106a(str, C7076b.m14292l3("out ", str2)) || C5207g.m11106a(str2, "*"))) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            strMo13985u2 = m13728i1(strMo13985u2, strM13430X);
        }
        String strM13728i1 = m13728i1(strMo13985u, strM13430X);
        return C5207g.m11106a(strM13728i1, strMo13985u2) ? strM13728i1 : descriptorRenderer.mo13982r(strM13728i1, strMo13985u2, TypeUtilsKt.m14230g(this));
    }

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final AbstractC5249p mo11216Z0(AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        AbstractC5257t abstractC5257tMo11663o0 = abstractC5439d.mo11663o0(this.f33340b);
        C5207g.m11109d(abstractC5257tMo11663o0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC5257t abstractC5257tMo11663o1 = abstractC5439d.mo11663o0(this.f33341c);
        C5207g.m11109d(abstractC5257tMo11663o1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((AbstractC5265x) abstractC5257tMo11663o0, (AbstractC5265x) abstractC5257tMo11663o1, true);
    }

    @Override // p543do.AbstractC5249p, p543do.AbstractC5257t
    /* JADX INFO: renamed from: q */
    public final MemberScope mo11245q() {
        InterfaceC8834e interfaceC8834eMo11235q = mo11250X0().mo11235q();
        InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
        if (interfaceC8830c != null) {
            MemberScope memberScopeMo17091T0 = interfaceC8830c.mo17091T0(new RawSubstitution(null));
            C5207g.m11110e(memberScopeMo17091T0, "classDescriptor.getMemberScope(RawSubstitution())");
            return memberScopeMo17091T0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo11250X0().mo11235q()).toString());
    }
}
