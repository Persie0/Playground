package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872u0 implements InterfaceC0843g0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0848i0 f5937a;

    /* JADX INFO: renamed from: b */
    public final String f5938b;

    /* JADX INFO: renamed from: c */
    public final Object[] f5939c;

    /* JADX INFO: renamed from: d */
    public final int f5940d;

    public C0872u0(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.f5937a = generatedMessageLite;
        this.f5938b = str;
        this.f5939c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5940d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f5940d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0843g0
    /* JADX INFO: renamed from: a */
    public final boolean mo3168a() {
        return (this.f5940d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0843g0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0848i0 mo3169b() {
        return this.f5937a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0843g0
    /* JADX INFO: renamed from: c */
    public final ProtoSyntax mo3170c() {
        return (this.f5940d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    public final Object[] m3443d() {
        return this.f5939c;
    }

    /* JADX INFO: renamed from: e */
    public final String m3444e() {
        return this.f5938b;
    }
}
