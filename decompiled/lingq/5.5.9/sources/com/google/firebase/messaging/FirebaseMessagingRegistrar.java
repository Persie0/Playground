package com.google.firebase.messaging;

import ae.C0065e;
import androidx.annotation.Keep;
import bf.InterfaceC1379a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import ge.C5787k;
import java.util.Arrays;
import java.util.List;
import p073df.InterfaceC5162d;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.InterfaceC5512d;
import p200jf.C6474f;
import p200jf.InterfaceC6475g;
import p395t8.InterfaceC9224f;
import p533ze.InterfaceC10482d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC5512d interfaceC5512d) {
        return new FirebaseMessaging((C0065e) interfaceC5512d.mo11748a(C0065e.class), (InterfaceC1379a) interfaceC5512d.mo11748a(InterfaceC1379a.class), interfaceC5512d.mo11750c(InterfaceC6475g.class), interfaceC5512d.mo11750c(HeartBeatInfo.class), (InterfaceC5162d) interfaceC5512d.mo11748a(InterfaceC5162d.class), (InterfaceC9224f) interfaceC5512d.mo11748a(InterfaceC9224f.class), (InterfaceC10482d) interfaceC5512d.mo11748a(InterfaceC10482d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5511c<?>> getComponents() {
        C5511c.a aVarM11743a = C5511c.m11743a(FirebaseMessaging.class);
        aVarM11743a.f34157a = LIBRARY_NAME;
        aVarM11743a.m11745a(C5521m.m11761a(C0065e.class));
        aVarM11743a.m11745a(new C5521m(0, 0, InterfaceC1379a.class));
        aVarM11743a.m11745a(new C5521m(0, 1, InterfaceC6475g.class));
        aVarM11743a.m11745a(new C5521m(0, 1, HeartBeatInfo.class));
        aVarM11743a.m11745a(new C5521m(0, 0, InterfaceC9224f.class));
        aVarM11743a.m11745a(C5521m.m11761a(InterfaceC5162d.class));
        aVarM11743a.m11745a(C5521m.m11761a(InterfaceC10482d.class));
        aVarM11743a.f34162f = new C5787k(1);
        aVarM11743a.m11747c(1);
        return Arrays.asList(aVarM11743a.m11746b(), C6474f.m13081a(LIBRARY_NAME, "23.1.2"));
    }
}
