package p045c9;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C2342a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import p010a9.C0051a;
import p068d9.AbstractC5095i;
import p068d9.InterfaceC5089c;
import p068d9.InterfaceC5090d;
import p090e9.InterfaceC5385a;
import p113f9.InterfaceC5478a;
import p118fe.C5509a;
import p290o6.C7946b;
import p382s7.C8969b;
import p395t8.C9220b;
import p402u0.C9370m;
import p452w8.AbstractC9835p;
import p452w8.AbstractC9838s;
import p452w8.C9827h;
import p452w8.C9832m;
import p477x8.C10114a;
import p477x8.InterfaceC10117d;
import p477x8.InterfaceC10124k;
import p528z8.C10456a;
import ye.C10355d;

/* JADX INFO: renamed from: c9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1753g {

    /* JADX INFO: renamed from: a */
    public final Context f9630a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10117d f9631b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5090d f9632c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1757k f9633d;

    /* JADX INFO: renamed from: e */
    public final Executor f9634e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5385a f9635f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5478a f9636g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5478a f9637h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5089c f9638i;

    public C1753g(Context context, InterfaceC10117d interfaceC10117d, InterfaceC5090d interfaceC5090d, InterfaceC1757k interfaceC1757k, Executor executor, InterfaceC5385a interfaceC5385a, InterfaceC5478a interfaceC5478a, InterfaceC5478a interfaceC5478a2, InterfaceC5089c interfaceC5089c) {
        this.f9630a = context;
        this.f9631b = interfaceC10117d;
        this.f9632c = interfaceC5090d;
        this.f9633d = interfaceC1757k;
        this.f9634e = executor;
        this.f9635f = interfaceC5385a;
        this.f9636g = interfaceC5478a;
        this.f9637h = interfaceC5478a2;
        this.f9638i = interfaceC5089c;
    }

    /* JADX INFO: renamed from: a */
    public final void m5486a(final AbstractC9838s abstractC9838s, int i10) {
        C2342a c2342aMo17900b;
        InterfaceC10124k interfaceC10124kMo18979a = this.f9631b.mo18979a(abstractC9838s.mo18319b());
        new C2342a(BackendResponse.Status.OK, 0L);
        final long jMax = 0;
        while (true) {
            int i11 = 2;
            C7946b c7946b = new C7946b(this, i11, abstractC9838s);
            InterfaceC5385a interfaceC5385a = this.f9635f;
            if (!((Boolean) interfaceC5385a.mo10870q(c7946b)).booleanValue()) {
                interfaceC5385a.mo10870q(new InterfaceC5385a.a() { // from class: c9.f
                    @Override // p090e9.InterfaceC5385a.a
                    /* JADX INFO: renamed from: g */
                    public final Object mo4925g() {
                        C1753g c1753g = this.f9627a;
                        c1753g.f9632c.mo10862n1(c1753g.f9636g.mo11713a() + jMax, abstractC9838s);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) interfaceC5385a.mo10870q(new C1750d(this, 0, abstractC9838s));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i12 = 1;
            int i13 = 3;
            if (interfaceC10124kMo18979a == null) {
                C0051a.m208a(abstractC9838s, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                c2342aMo17900b = new C2342a(BackendResponse.Status.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC5095i) it.next()).mo10849a());
                }
                if (abstractC9838s.mo18320c() != null) {
                    InterfaceC5089c interfaceC5089c = this.f9638i;
                    Objects.requireNonNull(interfaceC5089c);
                    C10456a c10456a = (C10456a) interfaceC5385a.mo10870q(new C9370m(i13, interfaceC5089c));
                    C9827h.a aVar = new C9827h.a();
                    aVar.f50019f = new HashMap();
                    aVar.f50017d = Long.valueOf(this.f9636g.mo11713a());
                    aVar.f50018e = Long.valueOf(this.f9637h.mo11713a());
                    aVar.m18313d("GDT_CLIENT_METRICS");
                    C9220b c9220b = new C9220b("proto");
                    c10456a.getClass();
                    C10355d c10355d = AbstractC9835p.f50041a;
                    c10355d.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c10355d.m19368a(c10456a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar.m18312c(new C9832m(c9220b, byteArrayOutputStream.toByteArray()));
                    arrayList.add(interfaceC10124kMo18979a.mo17899a(aVar.m18311b()));
                }
                c2342aMo17900b = interfaceC10124kMo18979a.mo17900b(new C10114a(arrayList, abstractC9838s.mo18320c()));
            }
            if (c2342aMo17900b.f11776a == BackendResponse.Status.TRANSIENT_ERROR) {
                interfaceC5385a.mo10870q(new InterfaceC5385a.a() { // from class: c9.e
                    @Override // p090e9.InterfaceC5385a.a
                    /* JADX INFO: renamed from: g */
                    public final Object mo4925g() {
                        C1753g c1753g = this.f9623a;
                        InterfaceC5090d interfaceC5090d = c1753g.f9632c;
                        interfaceC5090d.mo10861m1(iterable);
                        interfaceC5090d.mo10862n1(c1753g.f9636g.mo11713a() + jMax, abstractC9838s);
                        return null;
                    }
                });
                this.f9633d.mo5484b(abstractC9838s, i10 + 1, true);
                return;
            }
            interfaceC5385a.mo10870q(new C8969b(this, i11, iterable));
            BackendResponse.Status status = BackendResponse.Status.OK;
            BackendResponse.Status status2 = c2342aMo17900b.f11776a;
            if (status2 == status) {
                jMax = Math.max(jMax, c2342aMo17900b.f11777b);
                if (abstractC9838s.mo18320c() != null) {
                    interfaceC5385a.mo10870q(new C5509a(3, this));
                }
            } else if (status2 == BackendResponse.Status.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strMo18309g = ((AbstractC5095i) it2.next()).mo10849a().mo18309g();
                    if (map.containsKey(strMo18309g)) {
                        map.put(strMo18309g, Integer.valueOf(((Integer) map.get(strMo18309g)).intValue() + 1));
                    } else {
                        map.put(strMo18309g, 1);
                    }
                }
                interfaceC5385a.mo10870q(new C1750d(this, i12, map));
            }
        }
    }
}
