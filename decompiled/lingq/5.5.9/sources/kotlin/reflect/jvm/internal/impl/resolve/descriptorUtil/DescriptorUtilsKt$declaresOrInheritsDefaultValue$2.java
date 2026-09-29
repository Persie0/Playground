package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import p372rm.InterfaceC8853n0;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements InterfaceC2052l<InterfaceC8853n0, Boolean> {

    /* JADX INFO: renamed from: j */
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 f39658j = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(InterfaceC8853n0.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "declaresDefaultValue()Z";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Boolean mo528n(InterfaceC8853n0 interfaceC8853n0) {
        InterfaceC8853n0 interfaceC8853n1 = interfaceC8853n0;
        C5207g.m11111f(interfaceC8853n1, "p0");
        return Boolean.valueOf(interfaceC8853n1.mo13643B0());
    }
}
