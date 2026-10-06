package p021j$.time.format;

import java.util.ArrayList;

/* JADX INFO: renamed from: j$.time.format.f */
/* JADX INFO: loaded from: classes3.dex */
final class C0438f implements InterfaceC0439g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0439g[] f32937a;

    /* JADX INFO: renamed from: b */
    private final boolean f32938b;

    C0438f(ArrayList arrayList, boolean z) {
        this((InterfaceC0439g[]) arrayList.toArray(new InterfaceC0439g[arrayList.size()]), z);
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f32938b;
        if (z) {
            c0455w.m12315g();
        }
        try {
            for (InterfaceC0439g interfaceC0439g : this.f32937a) {
                if (!interfaceC0439g.mo12277a(c0455w, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                c0455w.m12309a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0438f m12278b() {
        return !this.f32938b ? this : new C0438f(this.f32937a, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0439g[] interfaceC0439gArr = this.f32937a;
        if (interfaceC0439gArr != null) {
            boolean z = this.f32938b;
            sb.append(z ? "[" : "(");
            for (InterfaceC0439g interfaceC0439g : interfaceC0439gArr) {
                sb.append(interfaceC0439g);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    C0438f(InterfaceC0439g[] interfaceC0439gArr, boolean z) {
        this.f32937a = interfaceC0439gArr;
        this.f32938b = z;
    }
}
