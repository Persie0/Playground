package p021j$.time.format;

import p021j$.time.ZoneId;
import p021j$.time.temporal.InterfaceC0486o;

/* JADX INFO: renamed from: j$.time.format.s */
/* JADX INFO: loaded from: classes3.dex */
class C0451s implements InterfaceC0439g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0486o f32969a;

    /* JADX INFO: renamed from: b */
    private final String f32970b;

    C0451s(InterfaceC0486o interfaceC0486o, String str) {
        this.f32969a = interfaceC0486o;
        this.f32970b = str;
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) c0455w.m12314f(this.f32969a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.mo12260q());
        return true;
    }

    public final String toString() {
        return this.f32970b;
    }
}
