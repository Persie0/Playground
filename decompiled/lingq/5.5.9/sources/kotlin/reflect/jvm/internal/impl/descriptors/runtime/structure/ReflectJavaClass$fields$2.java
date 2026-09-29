package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.Field;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import p491xm.C10240o;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReference implements InterfaceC2052l<Field, C10240o> {

    /* JADX INFO: renamed from: j */
    public static final ReflectJavaClass$fields$2 f38589j = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
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
        return C5209i.m11118a(C10240o.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C10240o mo528n(Field field) {
        Field field2 = field;
        C5207g.m11111f(field2, "p0");
        return new C10240o(field2);
    }
}
