package p452w8;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import p528z8.C10459d;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: w8.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9825f implements InterfaceC9713c<C10459d> {

    /* JADX INFO: renamed from: a */
    public static final C9825f f50002a = new C9825f();

    /* JADX INFO: renamed from: b */
    public static final C9712b f50003b = new C9712b("currentCacheSizeBytes", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final C9712b f50004c = new C9712b("maxCacheSizeBytes", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(2, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        C10459d c10459d = (C10459d) obj;
        InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
        interfaceC9714d2.mo9175a(f50003b, c10459d.f52325a);
        interfaceC9714d2.mo9175a(f50004c, c10459d.f52326b);
    }
}
