package p021j$.nio.file;

import java.nio.file.CopyOption;

/* JADX INFO: renamed from: j$.nio.file.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0388d implements CopyOption {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0389e f32874a;

    private /* synthetic */ C0388d(InterfaceC0389e interfaceC0389e) {
        this.f32874a = interfaceC0389e;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ CopyOption m12189a(InterfaceC0389e interfaceC0389e) {
        if (interfaceC0389e == null) {
            return null;
        }
        if (interfaceC0389e instanceof C0387c) {
            return ((C0387c) interfaceC0389e).f32873a;
        }
        if (interfaceC0389e instanceof LinkOption) {
            return AbstractC0335a.m12105d((LinkOption) interfaceC0389e);
        }
        return interfaceC0389e instanceof EnumC0314C ? AbstractC0335a.m12106e((EnumC0314C) interfaceC0389e) : new C0388d(interfaceC0389e);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0389e interfaceC0389e = this.f32874a;
        if (obj instanceof C0388d) {
            obj = ((C0388d) obj).f32874a;
        }
        return interfaceC0389e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32874a.hashCode();
    }
}
