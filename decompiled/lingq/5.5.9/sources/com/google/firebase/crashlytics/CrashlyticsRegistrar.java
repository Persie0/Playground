package com.google.firebase.crashlytics;

import ae.C0065e;
import com.google.firebase.components.ComponentRegistrar;
import ie.InterfaceC6320a;
import java.util.Arrays;
import java.util.List;
import p047ce.InterfaceC1999a;
import p073df.InterfaceC5162d;
import p118fe.C5509a;
import p118fe.C5511c;
import p118fe.C5521m;
import p155he.C6041e;
import p200jf.C6474f;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C5511c<?>> getComponents() {
        C5511c.a aVarM11743a = C5511c.m11743a(C6041e.class);
        aVarM11743a.f34157a = "fire-cls";
        aVarM11743a.m11745a(C5521m.m11761a(C0065e.class));
        aVarM11743a.m11745a(C5521m.m11761a(InterfaceC5162d.class));
        aVarM11743a.m11745a(new C5521m(0, 2, InterfaceC6320a.class));
        aVarM11743a.m11745a(new C5521m(0, 2, InterfaceC1999a.class));
        aVarM11743a.f34162f = new C5509a(1, this);
        aVarM11743a.m11747c(2);
        return Arrays.asList(aVarM11743a.m11746b(), C6474f.m13081a("fire-cls", "18.3.6"));
    }
}
