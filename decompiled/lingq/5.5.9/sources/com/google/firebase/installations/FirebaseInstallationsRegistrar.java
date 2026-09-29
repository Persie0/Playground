package com.google.firebase.installations;

import ae.C0065e;
import af.InterfaceC0070c;
import af.InterfaceC0071d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.SequentialExecutor;
import ee.InterfaceC5398a;
import ee.InterfaceC5399b;
import ge.C5789m;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p073df.InterfaceC5162d;
import p118fe.C5509a;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.C5527s;
import p118fe.InterfaceC5512d;
import p200jf.C6474f;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC5162d lambda$getComponents$0(InterfaceC5512d interfaceC5512d) {
        return new C3219a((C0065e) interfaceC5512d.mo11748a(C0065e.class), interfaceC5512d.mo11750c(InterfaceC0071d.class), (ExecutorService) interfaceC5512d.mo11749b(new C5527s(InterfaceC5398a.class, ExecutorService.class)), new SequentialExecutor((Executor) interfaceC5512d.mo11749b(new C5527s(InterfaceC5399b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5511c<?>> getComponents() {
        C5511c.a aVarM11743a = C5511c.m11743a(InterfaceC5162d.class);
        aVarM11743a.f34157a = LIBRARY_NAME;
        aVarM11743a.m11745a(C5521m.m11761a(C0065e.class));
        aVarM11743a.m11745a(new C5521m(0, 1, InterfaceC0071d.class));
        aVarM11743a.m11745a(new C5521m((C5527s<?>) new C5527s(InterfaceC5398a.class, ExecutorService.class), 1, 0));
        aVarM11743a.m11745a(new C5521m((C5527s<?>) new C5527s(InterfaceC5399b.class, Executor.class), 1, 0));
        aVarM11743a.f34162f = new C5789m(1);
        C8573r0 c8573r0 = new C8573r0();
        C5511c.a aVarM11743a2 = C5511c.m11743a(InterfaceC0070c.class);
        aVarM11743a2.f34161e = 1;
        aVarM11743a2.f34162f = new C5509a(0, c8573r0);
        return Arrays.asList(aVarM11743a.m11746b(), aVarM11743a2.m11746b(), C6474f.m13081a(LIBRARY_NAME, "17.1.3"));
    }
}
