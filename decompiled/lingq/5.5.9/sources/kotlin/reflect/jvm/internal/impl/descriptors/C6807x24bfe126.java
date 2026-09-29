package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import mn.C7645b;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C6807x24bfe126 extends FunctionReference implements InterfaceC2052l<C7645b, C7645b> {

    /* JADX INFO: renamed from: j */
    public static final C6807x24bfe126 f38447j = new C6807x24bfe126();

    public C6807x24bfe126() {
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
