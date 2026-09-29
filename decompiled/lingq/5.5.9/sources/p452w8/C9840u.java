package p452w8;

import java.util.HashMap;
import p395t8.AbstractC9221c;
import p395t8.C9219a;
import p395t8.C9220b;
import p395t8.InterfaceC9222d;
import p395t8.InterfaceC9223e;
import p395t8.InterfaceC9225g;

/* JADX INFO: renamed from: w8.u */
/* JADX INFO: loaded from: classes.dex */
public final class C9840u<T> implements InterfaceC9223e<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC9838s f50047a;

    /* JADX INFO: renamed from: b */
    public final String f50048b;

    /* JADX INFO: renamed from: c */
    public final C9220b f50049c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9222d<T, byte[]> f50050d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9841v f50051e;

    public C9840u(AbstractC9838s abstractC9838s, String str, C9220b c9220b, InterfaceC9222d<T, byte[]> interfaceC9222d, InterfaceC9841v interfaceC9841v) {
        this.f50047a = abstractC9838s;
        this.f50048b = str;
        this.f50049c = c9220b;
        this.f50050d = interfaceC9222d;
        this.f50051e = interfaceC9841v;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: a */
    public final void m18332a(C9219a c9219a, InterfaceC9225g interfaceC9225g) {
        AbstractC9838s abstractC9838s = this.f50047a;
        if (abstractC9838s == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = this.f50048b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        InterfaceC9222d<T, byte[]> interfaceC9222d = this.f50050d;
        if (interfaceC9222d == null) {
            throw new NullPointerException("Null transformer");
        }
        C9220b c9220b = this.f50049c;
        if (c9220b == null) {
            throw new NullPointerException("Null encoding");
        }
        C9828i c9828i = new C9828i(abstractC9838s, str, c9219a, interfaceC9222d, c9220b);
        C9842w c9842w = (C9842w) this.f50051e;
        c9842w.getClass();
        AbstractC9221c<?> abstractC9221c = c9828i.f50022c;
        C9829j c9829jM18331e = c9828i.f50020a.m18331e(abstractC9221c.mo17581c());
        C9827h.a aVar = new C9827h.a();
        aVar.f50019f = new HashMap();
        aVar.f50017d = Long.valueOf(c9842w.f50053a.mo11713a());
        aVar.f50018e = Long.valueOf(c9842w.f50054b.mo11713a());
        aVar.m18313d(c9828i.f50021b);
        aVar.m18312c(new C9832m(c9828i.f50024e, c9828i.f50023d.apply(abstractC9221c.mo17580b())));
        aVar.f50015b = abstractC9221c.mo17579a();
        c9842w.f50055c.mo4926a(interfaceC9225g, aVar.m18311b(), c9829jM18331e);
    }
}
