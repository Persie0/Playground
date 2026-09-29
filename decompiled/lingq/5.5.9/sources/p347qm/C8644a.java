package p347qm;

import co.InterfaceC2076h;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import mn.C7648e;
import p372rm.C8850m;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p385sf.C9000b;
import p420um.C9570h0;
import p420um.C9577l;

/* JADX INFO: renamed from: qm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8644a extends GivenFunctionsMemberScope {

    /* JADX INFO: renamed from: e */
    public static final C7648e f46199e = C7648e.m15232l("clone");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8644a(InterfaceC2076h interfaceC2076h, C9577l c9577l) {
        super(interfaceC2076h, c9577l);
        C5207g.m11111f(interfaceC2076h, "storageManager");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    /* JADX INFO: renamed from: h */
    public final List<InterfaceC6822c> mo14116h() {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        C7648e c7648e = f46199e;
        InterfaceC8830c interfaceC8830c = this.f39661b;
        C9570h0 c9570h0M18022f1 = C9570h0.m18022f1(interfaceC8830c, c7648e, kind, aVar);
        InterfaceC8835e0 interfaceC8835e0Mo17092U0 = interfaceC8830c.mo17092U0();
        EmptyList emptyList = EmptyList.f38032a;
        c9570h0M18022f1.mo13636Y0(null, interfaceC8835e0Mo17092U0, emptyList, emptyList, emptyList, DescriptorUtilsKt.m14108e(interfaceC8830c).m13549f(), Modality.OPEN, C8850m.f46736c);
        return C9000b.m17251q(c9570h0M18022f1);
    }
}
