package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import mn.C7645b;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C7020x1c22db09 extends FunctionReference implements InterfaceC2052l<C7645b, C7645b> {

    /* JADX INFO: renamed from: j */
    public static final C7020x1c22db09 f39740j = new C7020x1c22db09();

    public C7020x1c22db09() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(C7645b.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C7645b mo528n(C7645b c7645b) {
        C7645b c7645b2 = c7645b;
        C5207g.m11111f(c7645b2, "p0");
        return c7645b2.m15207g();
    }
}
