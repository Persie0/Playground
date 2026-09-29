package p452w8;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import p528z8.C10460e;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: w8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9826g implements InterfaceC9713c<C10460e> {

    /* JADX INFO: renamed from: a */
    public static final C9826g f50005a = new C9826g();

    /* JADX INFO: renamed from: b */
    public static final C9712b f50006b = new C9712b("startMs", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final C9712b f50007c = new C9712b("endMs", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(2, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        C10460e c10460e = (C10460e) obj;
        InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
        interfaceC9714d2.mo9175a(f50006b, c10460e.f52327a);
        interfaceC9714d2.mo9175a(f50007c, c10460e.f52328b);
    }
}
