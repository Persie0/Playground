package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.Constructor;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import p491xm.C10237l;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements InterfaceC2052l<Constructor<?>, C10237l> {

    /* JADX INFO: renamed from: j */
    public static final ReflectJavaClass$constructors$2 f38587j = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(C10237l.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C10237l mo528n(Constructor<?> constructor) {
        Constructor<?> constructor2 = constructor;
        C5207g.m11111f(constructor2, "p0");
        return new C10237l(constructor2);
    }
}
