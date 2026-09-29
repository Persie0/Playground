package com.google.firebase.messaging;

import java.io.IOException;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: com.google.firebase.messaging.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3235c implements InterfaceC9713c<AbstractC3254q> {

    /* JADX INFO: renamed from: a */
    public static final C3235c f16361a = new C3235c();

    /* JADX INFO: renamed from: b */
    public static final C9712b f16362b = C9712b.m18217a("messagingClientEventExtension");

    @Override // ve.InterfaceC9711a
    /* JADX INFO: renamed from: a */
    public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
        interfaceC9714d.mo9178d(f16362b, ((AbstractC3254q) obj).m9289a());
    }
}
