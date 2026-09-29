package p543do;

import cm.InterfaceC2052l;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import mn.C7646c;

/* JADX INFO: renamed from: do.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5256s0 implements InterfaceC2052l<C7646c, Boolean> {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Boolean mo528n(C7646c c7646c) {
        C7646c c7646c2 = c7646c;
        if (c7646c2 != null) {
            return Boolean.valueOf(!c7646c2.equals(C6797e.a.f38402y));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
