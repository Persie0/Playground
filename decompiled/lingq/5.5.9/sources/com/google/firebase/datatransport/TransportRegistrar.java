package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ge.C5788l;
import java.util.Arrays;
import java.util.List;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.InterfaceC5512d;
import p200jf.C6474f;
import p395t8.InterfaceC9224f;
import p410u8.C9476a;
import p452w8.C9842w;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC9224f lambda$getComponents$0(InterfaceC5512d interfaceC5512d) {
        C9842w.m18334b((Context) interfaceC5512d.mo11748a(Context.class));
        return C9842w.m18333a().m18335c(C9476a.f48587e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5511c<?>> getComponents() {
        C5511c.a aVarM11743a = C5511c.m11743a(InterfaceC9224f.class);
        aVarM11743a.f34157a = LIBRARY_NAME;
        aVarM11743a.m11745a(C5521m.m11761a(Context.class));
        aVarM11743a.f34162f = new C5788l(1);
        return Arrays.asList(aVarM11743a.m11746b(), C6474f.m13081a(LIBRARY_NAME, "18.1.7"));
    }
}
