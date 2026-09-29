package p452w8;

import androidx.activity.result.C0204c;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: w8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9822c implements InterfaceC9713c<LogEventDropped> {

    /* JADX INFO: renamed from: a */
    public static final C9822c f49994a = new C9822c();

    /* JADX INFO: renamed from: b */
    public static final C9712b f49995b = new C9712b("eventsDroppedCount", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final C9712b f49996c = new C9712b("reason", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(3, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
        interfaceC9714d2.mo9175a(f49995b, logEventDropped.f11778a);
        interfaceC9714d2.mo9178d(f49996c, logEventDropped.f11779b);
    }
}
