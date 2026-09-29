package p095eh;

/* JADX INFO: renamed from: eh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5404a implements InterfaceC5405b {

    /* JADX INFO: renamed from: a */
    public final String f33820a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5407d[] f33821b;

    public C5404a() {
        this.f33820a = "";
        this.f33821b = new InterfaceC5407d[0];
    }

    public C5404a(String str, InterfaceC5407d[] interfaceC5407dArr) {
        this.f33820a = str;
        this.f33821b = interfaceC5407dArr;
    }

    @Override // p095eh.InterfaceC5405b
    /* JADX INFO: renamed from: a */
    public final String mo11564a() {
        return this.f33820a;
    }

    @Override // p095eh.InterfaceC5405b
    /* JADX INFO: renamed from: b */
    public final InterfaceC5407d mo11565b(int i10) {
        InterfaceC5407d interfaceC5407d;
        InterfaceC5407d[] interfaceC5407dArr = this.f33821b;
        int length = interfaceC5407dArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            interfaceC5407d = interfaceC5407dArr[length];
        } while (i10 < interfaceC5407d.mo11566a());
        return interfaceC5407d;
    }
}
