package kotlin.reflect.jvm.internal.impl.types.checker;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import p139go.InterfaceC5852f;
import p543do.AbstractC5262v0;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements InterfaceC2052l<InterfaceC5852f, AbstractC5262v0> {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(KotlinTypePreparator.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final AbstractC5262v0 mo528n(InterfaceC5852f interfaceC5852f) {
        InterfaceC5852f interfaceC5852f2 = interfaceC5852f;
        C5207g.m11111f(interfaceC5852f2, "p0");
        return ((KotlinTypePreparator) this.f38112b).mo590a0(interfaceC5852f2);
    }
}
