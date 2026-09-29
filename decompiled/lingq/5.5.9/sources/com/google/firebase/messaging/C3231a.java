package com.google.firebase.messaging;

import androidx.activity.result.C0204c;
import com.google.firebase.encoders.proto.C3216a;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.io.IOException;
import p003a2.C0009a;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3231a implements InterfaceC9713c<MessagingClientEvent> {

    /* JADX INFO: renamed from: a */
    public static final C3231a f16328a = new C3231a();

    /* JADX INFO: renamed from: b */
    public static final C9712b f16329b = new C9712b("projectNumber", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(1, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final C9712b f16330c = new C9712b("messageId", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(2, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: d */
    public static final C9712b f16331d = new C9712b("instanceId", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(3, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: e */
    public static final C9712b f16332e = new C9712b("messageType", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(4, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: f */
    public static final C9712b f16333f = new C9712b("sdkPlatform", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(5, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: g */
    public static final C9712b f16334g = new C9712b("packageName", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(6, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: h */
    public static final C9712b f16335h = new C9712b("collapseKey", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(7, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: i */
    public static final C9712b f16336i = new C9712b("priority", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(8, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: j */
    public static final C9712b f16337j = new C9712b("ttl", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(9, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: k */
    public static final C9712b f16338k = new C9712b("topic", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(10, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: l */
    public static final C9712b f16339l = new C9712b("bulkId", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(11, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: m */
    public static final C9712b f16340m = new C9712b("event", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(12, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: n */
    public static final C9712b f16341n = new C9712b("analyticsLabel", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(13, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: o */
    public static final C9712b f16342o = new C9712b("campaignId", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(14, Protobuf.IntEncoding.DEFAULT))));

    /* JADX INFO: renamed from: p */
    public static final C9712b f16343p = new C9712b("composerLabel", C0009a.m28q(C0204c.m856p(Protobuf.class, new C3216a(15, Protobuf.IntEncoding.DEFAULT))));

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
        interfaceC9714d2.mo9175a(f16329b, messagingClientEvent.f16420a);
        interfaceC9714d2.mo9178d(f16330c, messagingClientEvent.f16421b);
        interfaceC9714d2.mo9178d(f16331d, messagingClientEvent.f16422c);
        interfaceC9714d2.mo9178d(f16332e, messagingClientEvent.f16423d);
        interfaceC9714d2.mo9178d(f16333f, messagingClientEvent.f16424e);
        interfaceC9714d2.mo9178d(f16334g, messagingClientEvent.f16425f);
        interfaceC9714d2.mo9178d(f16335h, messagingClientEvent.f16426g);
        interfaceC9714d2.mo9176b(f16336i, messagingClientEvent.f16427h);
        interfaceC9714d2.mo9176b(f16337j, messagingClientEvent.f16428i);
        interfaceC9714d2.mo9178d(f16338k, messagingClientEvent.f16429j);
        interfaceC9714d2.mo9175a(f16339l, messagingClientEvent.f16430k);
        interfaceC9714d2.mo9178d(f16340m, messagingClientEvent.f16431l);
        interfaceC9714d2.mo9178d(f16341n, messagingClientEvent.f16432m);
        interfaceC9714d2.mo9175a(f16342o, messagingClientEvent.f16433n);
        interfaceC9714d2.mo9178d(f16343p, messagingClientEvent.f16434o);
    }
}
