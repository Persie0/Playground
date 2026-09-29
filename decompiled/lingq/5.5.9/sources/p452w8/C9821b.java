package p452w8;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import p528z8.C10457b;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: w8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9821b implements InterfaceC9713c<C10457b> {

    /* JADX INFO: renamed from: a */
    public static final C9821b f49992a = new C9821b();

    /* JADX INFO: renamed from: b */
    public static final C9712b f49993b = new C9712b("storageMetrics", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        interfaceC9714d.mo9178d(f49993b, ((C10457b) obj).f52321a);
    }
}
