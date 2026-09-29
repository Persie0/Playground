package p347qm;

import ao.C1269a;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C6805a;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC7023a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p102eo.C5443h;
import p385sf.C9000b;
import p465wm.C9974d;
import p541zn.C10538b;
import p541zn.C10544h;
import p541zn.C10546j;
import p541zn.InterfaceC10548l;
import p541zn.InterfaceC10549m;
import pm.C8406a;
import vn.C9764b;

/* JADX INFO: renamed from: qm.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8649f extends AbstractC7023a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8649f(LockBasedStorageManager lockBasedStorageManager, C9974d c9974d, C6829c c6829c, NotFoundClasses notFoundClasses, JvmBuiltInsCustomizer jvmBuiltInsCustomizer, JvmBuiltInsCustomizer jvmBuiltInsCustomizer2, C5443h c5443h, C9764b c9764b) {
        super(lockBasedStorageManager, c9974d, c6829c);
        C5207g.m11111f(jvmBuiltInsCustomizer, "additionalClassPartsProvider");
        C5207g.m11111f(jvmBuiltInsCustomizer2, "platformDependentDeclarationFilter");
        C5207g.m11111f(c5443h, "kotlinTypeChecker");
        C10546j c10546j = new C10546j(this);
        C1269a c1269a = C1269a.f7952m;
        this.f39746d = new C10544h(lockBasedStorageManager, c6829c, c10546j, new C10538b(c6829c, notFoundClasses, c1269a), this, InterfaceC10548l.f52601b, InterfaceC10549m.a.f52602a, C9000b.m17252r(new C8406a(lockBasedStorageManager, c6829c), new C6805a(lockBasedStorageManager, c6829c)), notFoundClasses, jvmBuiltInsCustomizer, jvmBuiltInsCustomizer2, c1269a.f52221a, c5443h, c9764b, null, 786432);
    }
}
