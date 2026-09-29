package p452w8;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import p528z8.C10458c;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: w8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9823d implements InterfaceC9713c<C10458c> {

    /* JADX INFO: renamed from: a */
    public static final C9823d f49997a = new C9823d();

    /* JADX INFO: renamed from: b */
    public static final C9712b f49998b = new C9712b("logSource", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final C9712b f49999c = new C9712b("logEventDropped", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(2, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        C10458c c10458c = (C10458c) obj;
        InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
        interfaceC9714d2.mo9178d(f49998b, c10458c.f52323a);
        interfaceC9714d2.mo9178d(f49999c, c10458c.f52324b);
    }
}
