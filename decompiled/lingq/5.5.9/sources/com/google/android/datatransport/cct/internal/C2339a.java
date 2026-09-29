package com.google.android.datatransport.cct.internal;

import java.io.IOException;
import p432v8.AbstractC9668a;
import p432v8.AbstractC9674g;
import p432v8.AbstractC9675h;
import p432v8.AbstractC9676i;
import p432v8.C9669b;
import p432v8.C9670c;
import p432v8.C9671d;
import p432v8.C9672e;
import p458we.InterfaceC9912a;
import p483xe.C10182e;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2339a {

    /* JADX INFO: renamed from: a */
    public static final C2339a f11733a = new C2339a();

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$a */
    public static final class a implements InterfaceC9713c<AbstractC9668a> {

        /* JADX INFO: renamed from: a */
        public static final a f11734a = new a();

        /* JADX INFO: renamed from: b */
        public static final C9712b f11735b = C9712b.m18217a("sdkVersion");

        /* JADX INFO: renamed from: c */
        public static final C9712b f11736c = C9712b.m18217a("model");

        /* JADX INFO: renamed from: d */
        public static final C9712b f11737d = C9712b.m18217a("hardware");

        /* JADX INFO: renamed from: e */
        public static final C9712b f11738e = C9712b.m18217a("device");

        /* JADX INFO: renamed from: f */
        public static final C9712b f11739f = C9712b.m18217a("product");

        /* JADX INFO: renamed from: g */
        public static final C9712b f11740g = C9712b.m18217a("osBuild");

        /* JADX INFO: renamed from: h */
        public static final C9712b f11741h = C9712b.m18217a("manufacturer");

        /* JADX INFO: renamed from: i */
        public static final C9712b f11742i = C9712b.m18217a("fingerprint");

        /* JADX INFO: renamed from: j */
        public static final C9712b f11743j = C9712b.m18217a("locale");

        /* JADX INFO: renamed from: k */
        public static final C9712b f11744k = C9712b.m18217a("country");

        /* JADX INFO: renamed from: l */
        public static final C9712b f11745l = C9712b.m18217a("mccMnc");

        /* JADX INFO: renamed from: m */
        public static final C9712b f11746m = C9712b.m18217a("applicationBuild");

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
            AbstractC9668a abstractC9668a = (AbstractC9668a) obj;
            InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
            interfaceC9714d2.mo9178d(f11735b, abstractC9668a.mo18167l());
            interfaceC9714d2.mo9178d(f11736c, abstractC9668a.mo18164i());
            interfaceC9714d2.mo9178d(f11737d, abstractC9668a.mo18160e());
            interfaceC9714d2.mo9178d(f11738e, abstractC9668a.mo18158c());
            interfaceC9714d2.mo9178d(f11739f, abstractC9668a.mo18166k());
            interfaceC9714d2.mo9178d(f11740g, abstractC9668a.mo18165j());
            interfaceC9714d2.mo9178d(f11741h, abstractC9668a.mo18162g());
            interfaceC9714d2.mo9178d(f11742i, abstractC9668a.mo18159d());
            interfaceC9714d2.mo9178d(f11743j, abstractC9668a.mo18161f());
            interfaceC9714d2.mo9178d(f11744k, abstractC9668a.mo18157b());
            interfaceC9714d2.mo9178d(f11745l, abstractC9668a.mo18163h());
            interfaceC9714d2.mo9178d(f11746m, abstractC9668a.mo18156a());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$b */
    public static final class b implements InterfaceC9713c<AbstractC9674g> {

        /* JADX INFO: renamed from: a */
        public static final b f11747a = new b();

        /* JADX INFO: renamed from: b */
        public static final C9712b f11748b = C9712b.m18217a("logRequest");

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
            interfaceC9714d.mo9178d(f11748b, ((AbstractC9674g) obj).mo18168a());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$c */
    public static final class c implements InterfaceC9713c<ClientInfo> {

        /* JADX INFO: renamed from: a */
        public static final c f11749a = new c();

        /* JADX INFO: renamed from: b */
        public static final C9712b f11750b = C9712b.m18217a("clientType");

        /* JADX INFO: renamed from: c */
        public static final C9712b f11751c = C9712b.m18217a("androidClientInfo");

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
            interfaceC9714d2.mo9178d(f11750b, clientInfo.mo6753b());
            interfaceC9714d2.mo9178d(f11751c, clientInfo.mo6752a());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$d */
    public static final class d implements InterfaceC9713c<AbstractC9675h> {

        /* JADX INFO: renamed from: a */
        public static final d f11752a = new d();

        /* JADX INFO: renamed from: b */
        public static final C9712b f11753b = C9712b.m18217a("eventTimeMs");

        /* JADX INFO: renamed from: c */
        public static final C9712b f11754c = C9712b.m18217a("eventCode");

        /* JADX INFO: renamed from: d */
        public static final C9712b f11755d = C9712b.m18217a("eventUptimeMs");

        /* JADX INFO: renamed from: e */
        public static final C9712b f11756e = C9712b.m18217a("sourceExtension");

        /* JADX INFO: renamed from: f */
        public static final C9712b f11757f = C9712b.m18217a("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: g */
        public static final C9712b f11758g = C9712b.m18217a("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: h */
        public static final C9712b f11759h = C9712b.m18217a("networkConnectionInfo");

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
            AbstractC9675h abstractC9675h = (AbstractC9675h) obj;
            InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
            interfaceC9714d2.mo9175a(f11753b, abstractC9675h.mo18170b());
            interfaceC9714d2.mo9178d(f11754c, abstractC9675h.mo18169a());
            interfaceC9714d2.mo9175a(f11755d, abstractC9675h.mo18171c());
            interfaceC9714d2.mo9178d(f11756e, abstractC9675h.mo18173e());
            interfaceC9714d2.mo9178d(f11757f, abstractC9675h.mo18174f());
            interfaceC9714d2.mo9175a(f11758g, abstractC9675h.mo18175g());
            interfaceC9714d2.mo9178d(f11759h, abstractC9675h.mo18172d());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$e */
    public static final class e implements InterfaceC9713c<AbstractC9676i> {

        /* JADX INFO: renamed from: a */
        public static final e f11760a = new e();

        /* JADX INFO: renamed from: b */
        public static final C9712b f11761b = C9712b.m18217a("requestTimeMs");

        /* JADX INFO: renamed from: c */
        public static final C9712b f11762c = C9712b.m18217a("requestUptimeMs");

        /* JADX INFO: renamed from: d */
        public static final C9712b f11763d = C9712b.m18217a("clientInfo");

        /* JADX INFO: renamed from: e */
        public static final C9712b f11764e = C9712b.m18217a("logSource");

        /* JADX INFO: renamed from: f */
        public static final C9712b f11765f = C9712b.m18217a("logSourceName");

        /* JADX INFO: renamed from: g */
        public static final C9712b f11766g = C9712b.m18217a("logEvent");

        /* JADX INFO: renamed from: h */
        public static final C9712b f11767h = C9712b.m18217a("qosTier");

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
            AbstractC9676i abstractC9676i = (AbstractC9676i) obj;
            InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
            interfaceC9714d2.mo9175a(f11761b, abstractC9676i.mo18181f());
            interfaceC9714d2.mo9175a(f11762c, abstractC9676i.mo18182g());
            interfaceC9714d2.mo9178d(f11763d, abstractC9676i.mo18176a());
            interfaceC9714d2.mo9178d(f11764e, abstractC9676i.mo18178c());
            interfaceC9714d2.mo9178d(f11765f, abstractC9676i.mo18179d());
            interfaceC9714d2.mo9178d(f11766g, abstractC9676i.mo18177b());
            interfaceC9714d2.mo9178d(f11767h, abstractC9676i.mo18180e());
        }
    }

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$f */
    public static final class f implements InterfaceC9713c<NetworkConnectionInfo> {

        /* JADX INFO: renamed from: a */
        public static final f f11768a = new f();

        /* JADX INFO: renamed from: b */
        public static final C9712b f11769b = C9712b.m18217a("networkType");

        /* JADX INFO: renamed from: c */
        public static final C9712b f11770c = C9712b.m18217a("mobileSubtype");

        @Override // ve.InterfaceC9711a
        /* JADX INFO: renamed from: a */
        public final void mo6757a(Object obj, InterfaceC9714d interfaceC9714d) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            InterfaceC9714d interfaceC9714d2 = interfaceC9714d;
            interfaceC9714d2.mo9178d(f11769b, networkConnectionInfo.mo6755b());
            interfaceC9714d2.mo9178d(f11770c, networkConnectionInfo.mo6754a());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6756a(InterfaceC9912a<?> interfaceC9912a) {
        b bVar = b.f11747a;
        C10182e c10182e = (C10182e) interfaceC9912a;
        c10182e.m19193a(AbstractC9674g.class, bVar);
        c10182e.m19193a(C9670c.class, bVar);
        e eVar = e.f11760a;
        c10182e.m19193a(AbstractC9676i.class, eVar);
        c10182e.m19193a(C9672e.class, eVar);
        c cVar = c.f11749a;
        c10182e.m19193a(ClientInfo.class, cVar);
        c10182e.m19193a(C2340b.class, cVar);
        a aVar = a.f11734a;
        c10182e.m19193a(AbstractC9668a.class, aVar);
        c10182e.m19193a(C9669b.class, aVar);
        d dVar = d.f11752a;
        c10182e.m19193a(AbstractC9675h.class, dVar);
        c10182e.m19193a(C9671d.class, dVar);
        f fVar = f.f11768a;
        c10182e.m19193a(NetworkConnectionInfo.class, fVar);
        c10182e.m19193a(C2341c.class, fVar);
    }
}
