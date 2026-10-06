package p021j$.time.format;

/* JADX INFO: renamed from: j$.time.format.e */
/* JADX INFO: loaded from: classes3.dex */
final class C0437e implements InterfaceC0439g {

    /* JADX INFO: renamed from: a */
    private final char f32936a;

    C0437e(char c) {
        this.f32936a = c;
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        sb.append(this.f32936a);
        return true;
    }

    public final String toString() {
        char c = this.f32936a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
