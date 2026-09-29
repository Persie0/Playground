package com.lingq.shared.network.interceptors;

import android.content.Context;
import android.os.Build;
import com.lingq.shared.domain.Login;
import java.io.IOException;
import kotlin.coroutines.EmptyCoroutineContext;
import ni.C7797e;
import no.C7828f;
import p076di.InterfaceC5180b;
import p486xh.InterfaceC10189a;
import p493xo.C10266f;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9097o;

/* JADX INFO: renamed from: com.lingq.shared.network.interceptors.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3313a implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public final Context f18006a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5180b f18007b;

    /* JADX INFO: renamed from: c */
    public final C7797e f18008c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10189a f18009d;

    public C3313a(Context context, InterfaceC5180b interfaceC5180b, C7797e c7797e, InterfaceC10189a interfaceC10189a) {
        this.f18006a = context;
        this.f18007b = interfaceC5180b;
        this.f18008c = c7797e;
        this.f18009d = interfaceC10189a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0115  */
    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws IOException {
        C10266f c10266f2;
        InterfaceC10189a interfaceC10189a;
        C9106x c9106xM19235c;
        C9101s c9101s;
        C9101s c9101sM17344b;
        InterfaceC10189a interfaceC10189a2 = this.f18009d;
        C9101s c9101s2 = c10266f.f51701e;
        try {
            Login login = (Login) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PostInterceptor$intercept$login$1(this, null));
            String str = (String) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PostInterceptor$intercept$guid$1(this, null));
            String str2 = login.f17773b;
            boolean z10 = str2 == null || str2.length() == 0;
            Context context = this.f18006a;
            interfaceC10189a = interfaceC10189a2;
            C7797e c7797e = this.f18008c;
            try {
                if (z10) {
                    c9101s = c9101s2;
                    c9101s.getClass();
                    c9101s2 = c9101s;
                    try {
                        C9101s.a aVar = new C9101s.a(c9101s2);
                        aVar.m17343a("User-Agent", "Android " + Build.VERSION.RELEASE + " v" + c7797e.m15509b() + " app: " + context.getPackageName() + " GUID: " + str);
                        aVar.m17343a("Accept", "application/json");
                        aVar.m17343a("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                        c9101sM17344b = aVar.m17344b();
                    } catch (Exception e10) {
                        e = e10;
                        c10266f2 = c10266f;
                        e.printStackTrace();
                        c9106xM19235c = c10266f2.m19235c(c9101s2);
                        if (c9106xM19235c.f47566d == 401) {
                            interfaceC10189a.mo9725R0();
                        }
                        return c9106xM19235c;
                    }
                } else {
                    try {
                        String str3 = login.f17773b;
                        c9101s2.getClass();
                        C9101s.a aVar2 = new C9101s.a(c9101s2);
                        c9101s = c9101s2;
                        aVar2.m17343a("User-Agent", "Android " + Build.VERSION.RELEASE + " v" + c7797e.m15509b() + " app: " + context.getPackageName() + " GUID: " + str);
                        aVar2.m17343a("Accept", "application/json");
                        aVar2.m17343a("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                        StringBuilder sb2 = new StringBuilder("Token ");
                        sb2.append(str3);
                        aVar2.m17343a("Authorization", sb2.toString());
                        c9101sM17344b = aVar2.m17344b();
                    } catch (Exception e11) {
                        e = e11;
                        c9101s = c9101s2;
                        c10266f2 = c10266f;
                        c9101s2 = c9101s;
                        e.printStackTrace();
                        c9106xM19235c = c10266f2.m19235c(c9101s2);
                        if (c9106xM19235c.f47566d == 401) {
                            interfaceC10189a.mo9725R0();
                        }
                        return c9106xM19235c;
                    }
                }
                C9106x c9106xM19235c2 = c10266f.m19235c(c9101sM17344b);
                if (c9106xM19235c2.f47566d == 401) {
                    interfaceC10189a.mo9725R0();
                }
                return c9106xM19235c2;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            c10266f2 = c10266f;
            interfaceC10189a = interfaceC10189a2;
        }
    }
}
