package com.google.firebase.analytics.connector.internal;

import ae.C0065e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C2870v1;
import com.google.firebase.components.ComponentRegistrar;
import dm.C5212l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p047ce.C2001c;
import p047ce.InterfaceC1999a;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.InterfaceC5512d;
import p176ib.C6272i;
import p200jf.C6474f;
import p533ze.C10479a;
import p533ze.InterfaceC10480b;
import p533ze.InterfaceC10482d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC1999a lambda$getComponents$0(InterfaceC5512d interfaceC5512d) {
        C0065e c0065e = (C0065e) interfaceC5512d.mo11748a(C0065e.class);
        Context context = (Context) interfaceC5512d.mo11748a(Context.class);
        InterfaceC10482d interfaceC10482d = (InterfaceC10482d) interfaceC5512d.mo11748a(InterfaceC10482d.class);
        C6272i.m12915i(c0065e);
        C6272i.m12915i(context);
        C6272i.m12915i(interfaceC10482d);
        C6272i.m12915i(context.getApplicationContext());
        if (C2001c.f10440c == null) {
            synchronized (C2001c.class) {
                if (C2001c.f10440c == null) {
                    Bundle bundle = new Bundle(1);
                    c0065e.m437a();
                    if ("[DEFAULT]".equals(c0065e.f172b)) {
                        interfaceC10482d.mo11763b(new Executor() { // from class: ce.d
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC10480b() { // from class: ce.e
                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            @Override // p533ze.InterfaceC10480b
                            /* JADX INFO: renamed from: a */
                            public final void mo5936a(C10479a c10479a) {
                                c10479a.getClass();
                                throw null;
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", c0065e.m440g());
                    }
                    C2001c.f10440c = new C2001c(C2870v1.m8298c(context, bundle).f14469d);
                }
            }
        }
        return C2001c.f10440c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C5511c<?>> getComponents() {
        C5511c.a aVarM11743a = C5511c.m11743a(InterfaceC1999a.class);
        aVarM11743a.m11745a(C5521m.m11761a(C0065e.class));
        aVarM11743a.m11745a(C5521m.m11761a(Context.class));
        aVarM11743a.m11745a(C5521m.m11761a(InterfaceC10482d.class));
        aVarM11743a.f34162f = C5212l.f33287f;
        aVarM11743a.m11747c(2);
        return Arrays.asList(aVarM11743a.m11746b(), C6474f.m13081a("fire-analytics", "21.2.1"));
    }
}
