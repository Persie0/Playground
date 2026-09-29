package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ae.C0062b;
import dm.C5207g;
import jo.C6530b;
import kotlin.jvm.internal.Ref$ObjectRef;
import p347qm.C8650g;
import p372rm.InterfaceC8830c;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6806b extends C6530b.a<InterfaceC8830c, JvmBuiltInsCustomizer.JDKMemberStatus> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f38445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> f38446b;

    public C6806b(String str, Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> ref$ObjectRef) {
        this.f38445a = str;
        this.f38446b = ref$ObjectRef;
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: a */
    public final Object mo11208a() {
        JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = this.f38446b.f38127a;
        return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: c */
    public final boolean mo11209c(Object obj) {
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) obj;
        C5207g.m11111f(interfaceC8830c, "javaClassDescriptor");
        String strM344e2 = C0062b.m344e2(interfaceC8830c, this.f38445a);
        boolean zContains = C8650g.f46220b.contains(strM344e2);
        Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> ref$ObjectRef = this.f38446b;
        if (zContains) {
            ref$ObjectRef.f38127a = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
        } else if (C8650g.f46221c.contains(strM344e2)) {
            ref$ObjectRef.f38127a = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
        } else if (C8650g.f46219a.contains(strM344e2)) {
            ref$ObjectRef.f38127a = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
        }
        return ref$ObjectRef.f38127a == null;
    }
}
