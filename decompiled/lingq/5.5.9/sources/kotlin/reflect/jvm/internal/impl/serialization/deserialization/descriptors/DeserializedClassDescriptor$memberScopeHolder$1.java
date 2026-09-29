package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import p102eo.AbstractC5439d;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements InterfaceC2052l<AbstractC5439d, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final DeserializedClassDescriptor.DeserializedClassMemberScope mo528n(AbstractC5439d abstractC5439d) {
        AbstractC5439d abstractC5439d2 = abstractC5439d;
        C5207g.m11111f(abstractC5439d2, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.f38112b, abstractC5439d2);
    }
}
