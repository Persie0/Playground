package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import cm.InterfaceC2041a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import p372rm.InterfaceC8838g;
import p541zn.AbstractC10554r;
import p541zn.C10544h;
import sm.InterfaceC9075c;

/* JADX INFO: loaded from: classes2.dex */
final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements InterfaceC2041a<List<? extends InterfaceC9075c>> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MemberDeserializer f39708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC6997h f39709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AnnotatedCallableKind f39710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f39708b = memberDeserializer;
        this.f39709c = interfaceC6997h;
        this.f39710d = annotatedCallableKind;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final List<? extends InterfaceC9075c> mo807E() {
        MemberDeserializer memberDeserializer = this.f39708b;
        AbstractC10554r abstractC10554rM14124a = memberDeserializer.m14124a((InterfaceC8838g) memberDeserializer.f39700a.f46001c);
        List<InterfaceC9075c> listMo13761j = abstractC10554rM14124a != null ? ((C10544h) memberDeserializer.f39700a.f45999a).f52583e.mo13761j(abstractC10554rM14124a, this.f39709c, this.f39710d) : null;
        return listMo13761j == null ? EmptyList.f38032a : listMo13761j;
    }
}
