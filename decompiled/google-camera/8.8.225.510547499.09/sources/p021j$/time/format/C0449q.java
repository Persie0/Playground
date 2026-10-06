package p021j$.time.format;

import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0425g;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.InterfaceC0483l;

/* JADX INFO: renamed from: j$.time.format.q */
/* JADX INFO: loaded from: classes3.dex */
final class C0449q implements InterfaceC0439g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0483l f32963a;

    /* JADX INFO: renamed from: b */
    private final EnumC0432C f32964b;

    /* JADX INFO: renamed from: c */
    private final C0457y f32965c;

    /* JADX INFO: renamed from: d */
    private volatile C0444l f32966d;

    C0449q(InterfaceC0483l interfaceC0483l, EnumC0432C enumC0432C, C0457y c0457y) {
        this.f32963a = interfaceC0483l;
        this.f32964b = enumC0432C;
        this.f32965c = c0457y;
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        Long lM12313e = c0455w.m12313e(this.f32963a);
        if (lM12313e == null) {
            return false;
        }
        InterfaceC0425g interfaceC0425g = (InterfaceC0425g) c0455w.m12312d().mo12253m(AbstractC0485n.m12439a());
        String strMo12276e = (interfaceC0425g == null || interfaceC0425g == C0426h.f32915a) ? this.f32965c.mo12276e(this.f32963a, lM12313e.longValue(), this.f32964b, c0455w.m12311c()) : this.f32965c.mo12275d(interfaceC0425g, this.f32963a, lM12313e.longValue(), this.f32964b, c0455w.m12311c());
        if (strMo12276e != null) {
            sb.append(strMo12276e);
            return true;
        }
        if (this.f32966d == null) {
            this.f32966d = new C0444l(this.f32963a, 1, 19, EnumC0431B.NORMAL);
        }
        return this.f32966d.mo12277a(c0455w, sb);
    }

    public final String toString() {
        EnumC0432C enumC0432C = EnumC0432C.FULL;
        InterfaceC0483l interfaceC0483l = this.f32963a;
        EnumC0432C enumC0432C2 = this.f32964b;
        if (enumC0432C2 == enumC0432C) {
            return "Text(" + String.valueOf(interfaceC0483l) + ")";
        }
        return "Text(" + String.valueOf(interfaceC0483l) + "," + String.valueOf(enumC0432C2) + ")";
    }
}
