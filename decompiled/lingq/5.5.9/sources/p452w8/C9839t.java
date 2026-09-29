package p452w8;

import java.util.Set;
import p395t8.C9220b;
import p395t8.InterfaceC9222d;
import p395t8.InterfaceC9224f;

/* JADX INFO: renamed from: w8.t */
/* JADX INFO: loaded from: classes.dex */
public final class C9839t implements InterfaceC9224f {

    /* JADX INFO: renamed from: a */
    public final Set<C9220b> f50044a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9838s f50045b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9841v f50046c;

    public C9839t(Set set, C9829j c9829j, InterfaceC9841v interfaceC9841v) {
        this.f50044a = set;
        this.f50045b = c9829j;
        this.f50046c = interfaceC9841v;
    }

    @Override // p395t8.InterfaceC9224f
    /* JADX INFO: renamed from: a */
    public final C9840u mo17582a(String str, C9220b c9220b, InterfaceC9222d interfaceC9222d) {
        Set<C9220b> set = this.f50044a;
        if (set.contains(c9220b)) {
            return new C9840u(this.f50045b, str, c9220b, interfaceC9222d, this.f50046c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c9220b, set));
    }
}
