package zm;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC6840a;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p373rn.AbstractC8875g;
import p373rn.C8870b;
import p373rn.C8877i;
import p385sf.C9000b;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9327o;

/* JADX INFO: renamed from: zm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10517b extends AbstractC6840a<InterfaceC9075c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10517b(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        C5207g.m11111f(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    /* JADX INFO: renamed from: l */
    public static List m19494l(AbstractC8875g abstractC8875g) {
        List arrayList;
        if (abstractC8875g instanceof C8870b) {
            Iterable iterable = (Iterable) ((C8870b) abstractC8875g).f46772a;
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C9327o.m17684D(m19494l((AbstractC8875g) it.next()), arrayList);
            }
        } else {
            if (abstractC8875g instanceof C8877i) {
                return C9000b.m17251q(((C8877i) abstractC8875g).f46774c.m15236g());
            }
            arrayList = EmptyList.f38032a;
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC6840a
    /* JADX INFO: renamed from: a */
    public final ArrayList mo13663a(Object obj, boolean z10) {
        InterfaceC9075c interfaceC9075c = (InterfaceC9075c) obj;
        C5207g.m11111f(interfaceC9075c, "<this>");
        Map<C7648e, AbstractC8875g<?>> mapMo12513a = interfaceC9075c.mo12513a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C7648e, AbstractC8875g<?>> entry : mapMo12513a.entrySet()) {
            C9327o.m17684D((!z10 || C5207g.m11106a(entry.getKey(), C10534s.f52535b)) ? m19494l(entry.getValue()) : EmptyList.f38032a, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC6840a
    /* JADX INFO: renamed from: e */
    public final C7646c mo13667e(InterfaceC9075c interfaceC9075c) {
        InterfaceC9075c interfaceC9075c2 = interfaceC9075c;
        C5207g.m11111f(interfaceC9075c2, "<this>");
        return interfaceC9075c2.mo12515e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC6840a
    /* JADX INFO: renamed from: f */
    public final InterfaceC8830c mo13668f(Object obj) {
        InterfaceC9075c interfaceC9075c = (InterfaceC9075c) obj;
        C5207g.m11111f(interfaceC9075c, "<this>");
        InterfaceC8830c interfaceC8830cM14107d = DescriptorUtilsKt.m14107d(interfaceC9075c);
        C5207g.m11108c(interfaceC8830cM14107d);
        return interfaceC8830cM14107d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractC6840a
    /* JADX INFO: renamed from: g */
    public final Iterable<InterfaceC9075c> mo13669g(InterfaceC9075c interfaceC9075c) {
        InterfaceC9077e interfaceC9077eMo11289w;
        InterfaceC9075c interfaceC9075c2 = interfaceC9075c;
        C5207g.m11111f(interfaceC9075c2, "<this>");
        InterfaceC8830c interfaceC8830cM14107d = DescriptorUtilsKt.m14107d(interfaceC9075c2);
        return (interfaceC8830cM14107d == null || (interfaceC9077eMo11289w = interfaceC8830cM14107d.mo11289w()) == null) ? EmptyList.f38032a : interfaceC9077eMo11289w;
    }
}
