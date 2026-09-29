package p452w8;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import p528z8.C10456a;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: w8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9820a implements InterfaceC9713c<C10456a> {

    /* JADX INFO: renamed from: a */
    public static final C9820a f49987a = new C9820a();

    /* JADX INFO: renamed from: b */
    public static final C9712b f49988b = new C9712b("window", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final C9712b f49989c = new C9712b("logSourceMetrics", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(2, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: d */
    public static final C9712b f49990d = new C9712b("globalMetrics", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(3, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: e */
    public static final C9712b f49991e = new C9712b("appNamespace", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(4, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        C10456a c10456a = (C10456a) obj;
        InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
        interfaceC9714d2.mo9178d(f49988b, c10456a.f52313a);
        interfaceC9714d2.mo9178d(f49989c, c10456a.f52314b);
        interfaceC9714d2.mo9178d(f49990d, c10456a.f52315c);
        interfaceC9714d2.mo9178d(f49991e, c10456a.f52316d);
    }
}
