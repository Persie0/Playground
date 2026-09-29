package hn;

import fo.C5602h;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p373rn.AbstractC8875g;
import p543do.AbstractC5257t;
import sm.InterfaceC9075c;

/* JADX INFO: renamed from: hn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6081a implements InterfaceC9075c {

    /* JADX INFO: renamed from: a */
    public static final C6081a f35817a = new C6081a();

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public final Map<C7648e, AbstractC8875g<?>> mo12513a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo12514c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: e */
    public final C7646c mo12515e() {
        InterfaceC8830c interfaceC8830cM14107d = DescriptorUtilsKt.m14107d(this);
        C7646c c7646cM14106c = null;
        if (interfaceC8830cM14107d != null) {
            if (C5602h.m11915f(interfaceC8830cM14107d)) {
                interfaceC8830cM14107d = null;
            }
            if (interfaceC8830cM14107d != null) {
                c7646cM14106c = DescriptorUtilsKt.m14106c(interfaceC8830cM14107d);
            }
        }
        return c7646cM14106c;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo12516j() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
