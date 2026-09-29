package pm;

import co.InterfaceC2076h;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import p372rm.InterfaceC8830c;
import p385sf.C9000b;

/* JADX INFO: renamed from: pm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8408c extends GivenFunctionsMemberScope {

    /* JADX INFO: renamed from: pm.c$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45538a;

        static {
            int[] iArr = new int[FunctionClassKind.values().length];
            iArr[FunctionClassKind.Function.ordinal()] = 1;
            iArr[FunctionClassKind.SuspendFunction.ordinal()] = 2;
            f45538a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8408c(InterfaceC2076h interfaceC2076h, C8407b c8407b) {
        super(interfaceC2076h, c8407b);
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(c8407b, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    /* JADX INFO: renamed from: h */
    public final List<InterfaceC6822c> mo14116h() {
        InterfaceC8830c interfaceC8830c = this.f39661b;
        C5207g.m11109d(interfaceC8830c, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        C8407b c8407b = (C8407b) interfaceC8830c;
        int i10 = a.f45538a[c8407b.f45531g.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? EmptyList.f38032a : C9000b.m17251q(C8409d.a.m16430a(c8407b, true));
        }
        return C9000b.m17251q(C8409d.a.m16430a(c8407b, false));
    }
}
