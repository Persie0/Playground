package p021j$.time.format;

import p021j$.time.C0417b;

/* JADX INFO: renamed from: j$.time.format.n */
/* JADX INFO: loaded from: classes3.dex */
final class C0446n implements InterfaceC0439g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0439g f32956a;

    /* JADX INFO: renamed from: b */
    private final int f32957b;

    /* JADX INFO: renamed from: c */
    private final char f32958c;

    C0446n(InterfaceC0439g interfaceC0439g, int i, char c) {
        this.f32956a = interfaceC0439g;
        this.f32957b = i;
        this.f32958c = c;
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        int length = sb.length();
        if (!this.f32956a.mo12277a(c0455w, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.f32957b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.f32958c);
            }
            return true;
        }
        throw new C0417b("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.f32956a);
        char c = this.f32958c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + strValueOf + "," + this.f32957b + str;
    }
}
