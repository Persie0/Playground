package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.util.Collection;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import mn.C7648e;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReference implements InterfaceC2052l<C7648e, Collection<? extends InterfaceC6824e>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(LazyJavaClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Collection<? extends InterfaceC6824e> mo528n(C7648e c7648e) {
        C7648e c7648e2 = c7648e;
        C5207g.m11111f(c7648e2, "p0");
        return LazyJavaClassMemberScope.m13697v((LazyJavaClassMemberScope) this.f38112b, c7648e2);
    }
}
