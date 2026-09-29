package com.google.firebase.messaging;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import p003a2.C0009a;
import p178if.C6325a;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: com.google.firebase.messaging.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3233b implements InterfaceC9713c<C6325a> {

    /* JADX INFO: renamed from: a */
    public static final C3233b f16349a = new C3233b();

    /* JADX INFO: renamed from: b */
    public static final C9712b f16350b = new C9712b("messagingClientEvent", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        interfaceC9714d.mo9178d(f16350b, ((C6325a) obj).f36554a);
    }
}
