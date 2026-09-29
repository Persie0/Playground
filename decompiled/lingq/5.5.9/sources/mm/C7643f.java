package mm;

import dm.C5207g;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: mm.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7643f implements InterfaceC7639b {

    /* JADX INFO: renamed from: a */
    public static final C7643f f42068a = new C7643f();

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: a */
    public final List<Type> mo13522a() {
        return EmptyList.f38032a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: b */
    public final Object mo13523b(Object[] objArr) {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: y */
    public final Type mo13524y() {
        Class cls = Void.TYPE;
        C5207g.m11110e(cls, "TYPE");
        return cls;
    }
}
