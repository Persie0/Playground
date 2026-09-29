package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import java.lang.reflect.Member;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements InterfaceC2052l<Member, Boolean> {

    /* JADX INFO: renamed from: j */
    public static final ReflectJavaClass$fields$1 f38588j = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.m11118a(Member.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "isSynthetic()Z";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Boolean mo528n(Member member) {
        Member member2 = member;
        C5207g.m11111f(member2, "p0");
        return Boolean.valueOf(member2.isSynthetic());
    }
}
