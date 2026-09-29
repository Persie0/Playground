package com.google.android.exoplayer2.source;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.source.C2476d;
import com.google.android.exoplayer2.source.C2497n;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p150h9.C5915h;
import p239l9.InterfaceC7287b;
import p261m9.C7505f;
import p261m9.InterfaceC7511l;
import p454wa.C9888m;
import p454wa.C9889n;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p482xd.InterfaceC10177i;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2476d implements InterfaceC2492i.a {

    /* JADX INFO: renamed from: a */
    public final a f13083a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9882g.a f13084b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2528b f13085c;

    /* JADX INFO: renamed from: d */
    public final long f13086d;

    /* JADX INFO: renamed from: e */
    public final long f13087e;

    /* JADX INFO: renamed from: f */
    public final long f13088f;

    /* JADX INFO: renamed from: g */
    public final float f13089g;

    /* JADX INFO: renamed from: h */
    public final float f13090h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7511l f13091a;

        /* JADX INFO: renamed from: b */
        public final HashMap f13092b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final HashSet f13093c = new HashSet();

        /* JADX INFO: renamed from: d */
        public final HashMap f13094d = new HashMap();

        /* JADX INFO: renamed from: e */
        public InterfaceC9882g.a f13095e;

        /* JADX INFO: renamed from: f */
        public InterfaceC7287b f13096f;

        /* JADX INFO: renamed from: g */
        public InterfaceC2528b f13097g;

        public a(C7505f c7505f) {
            this.f13091a = c7505f;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0097  */
        /* JADX INFO: renamed from: a */
        public final InterfaceC10177i<InterfaceC2492i.a> m7272a(int i10) {
            InterfaceC10177i<InterfaceC2492i.a> c5915h;
            InterfaceC10177i<InterfaceC2492i.a> interfaceC10177i;
            HashMap map = this.f13092b;
            if (map.containsKey(Integer.valueOf(i10))) {
                return (InterfaceC10177i) map.get(Integer.valueOf(i10));
            }
            final InterfaceC9882g.a aVar = this.f13095e;
            aVar.getClass();
            try {
                if (i10 != 0) {
                    final int i11 = 1;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            final Class clsAsSubclass = HlsMediaSource.Factory.class.asSubclass(InterfaceC2492i.a.class);
                            interfaceC10177i = new InterfaceC10177i() { // from class: ga.f
                                @Override // p482xd.InterfaceC10177i
                                public final Object get() {
                                    return C2476d.m7268d(clsAsSubclass, aVar);
                                }
                            };
                        } else if (i10 != 3) {
                            c5915h = i10 != 4 ? null : new InterfaceC10177i() { // from class: ga.d
                                @Override // p482xd.InterfaceC10177i
                                public final Object get() {
                                    int i12 = i11;
                                    InterfaceC9882g.a aVar2 = aVar;
                                    Object obj = this;
                                    switch (i12) {
                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                            return C2476d.m7268d((Class) obj, aVar2);
                                        default:
                                            return new C2497n.b(aVar2, ((C2476d.a) obj).f13091a);
                                    }
                                }
                            };
                        } else {
                            c5915h = new C5915h(1, Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC2492i.a.class));
                        }
                        map.put(Integer.valueOf(i10), c5915h);
                        if (c5915h != null) {
                            this.f13093c.add(Integer.valueOf(i10));
                        }
                        return c5915h;
                    }
                    final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC2492i.a.class);
                    interfaceC10177i = new InterfaceC10177i() { // from class: ga.e
                        @Override // p482xd.InterfaceC10177i
                        public final Object get() {
                            return C2476d.m7268d(clsAsSubclass2, aVar);
                        }
                    };
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(InterfaceC2492i.a.class);
                    final int i12 = 0;
                    interfaceC10177i = new InterfaceC10177i() { // from class: ga.d
                        @Override // p482xd.InterfaceC10177i
                        public final Object get() {
                            int i13 = i12;
                            InterfaceC9882g.a aVar2 = aVar;
                            Object obj = genericDeclarationAsSubclass;
                            switch (i13) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    return C2476d.m7268d((Class) obj, aVar2);
                                default:
                                    return new C2497n.b(aVar2, ((C2476d.a) obj).f13091a);
                            }
                        }
                    };
                }
                c5915h = interfaceC10177i;
            } catch (ClassNotFoundException unused) {
            }
            map.put(Integer.valueOf(i10), c5915h);
            if (c5915h != null) {
                this.f13093c.add(Integer.valueOf(i10));
            }
            return c5915h;
        }
    }

    public C2476d(Context context, C7505f c7505f) {
        C9888m.a aVar = new C9888m.a(context, new C9889n.a());
        this.f13084b = aVar;
        a aVar2 = new a(c7505f);
        this.f13083a = aVar2;
        if (aVar != aVar2.f13095e) {
            aVar2.f13095e = aVar;
            aVar2.f13092b.clear();
            aVar2.f13094d.clear();
        }
        this.f13086d = -9223372036854775807L;
        this.f13087e = -9223372036854775807L;
        this.f13088f = -9223372036854775807L;
        this.f13089g = -3.4028235E38f;
        this.f13090h = -3.4028235E38f;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2492i.a m7268d(Class cls, InterfaceC9882g.a aVar) {
        try {
            return (InterfaceC2492i.a) cls.getConstructor(InterfaceC9882g.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
    /* JADX INFO: renamed from: a */
    public final InterfaceC2492i mo7269a(C2466p c2466p) {
        C2466p c2466pM7213a = c2466p;
        c2466pM7213a.f12772b.getClass();
        C2466p.g gVar = c2466pM7213a.f12772b;
        String scheme = gVar.f12840a.getScheme();
        InterfaceC2492i.a aVar = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int iM19019D = C10134c0.m19019D(gVar.f12840a, gVar.f12841b);
        a aVar2 = this.f13083a;
        HashMap map = aVar2.f13094d;
        InterfaceC2492i.a aVar3 = (InterfaceC2492i.a) map.get(Integer.valueOf(iM19019D));
        if (aVar3 != null) {
            aVar = aVar3;
        } else {
            InterfaceC10177i<InterfaceC2492i.a> interfaceC10177iM7272a = aVar2.m7272a(iM19019D);
            if (interfaceC10177iM7272a != null) {
                aVar = interfaceC10177iM7272a.get();
                InterfaceC7287b interfaceC7287b = aVar2.f13096f;
                if (interfaceC7287b != null) {
                    aVar.mo7270b(interfaceC7287b);
                }
                InterfaceC2528b interfaceC2528b = aVar2.f13097g;
                if (interfaceC2528b != null) {
                    aVar.mo7271c(interfaceC2528b);
                }
                map.put(Integer.valueOf(iM19019D), aVar);
            }
        }
        C10129a.m18994f(aVar, "No suitable media source factory found for content type: " + iM19019D);
        C2466p.e eVar = c2466pM7213a.f12773c;
        eVar.getClass();
        C2466p.e eVar2 = new C2466p.e(eVar.f12830a == -9223372036854775807L ? this.f13086d : eVar.f12830a, eVar.f12831b == -9223372036854775807L ? this.f13087e : eVar.f12831b, eVar.f12832c == -9223372036854775807L ? this.f13088f : eVar.f12832c, eVar.f12833d == -3.4028235E38f ? this.f13089g : eVar.f12833d, eVar.f12834e == -3.4028235E38f ? this.f13090h : eVar.f12834e);
        if (!eVar2.equals(eVar)) {
            C2466p.a aVar4 = new C2466p.a(c2466pM7213a);
            aVar4.f12787k = new C2466p.e.a(eVar2);
            c2466pM7213a = aVar4.m7213a();
        }
        InterfaceC2492i interfaceC2492iMo7269a = aVar.mo7269a(c2466pM7213a);
        ImmutableList<C2466p.j> immutableList = c2466pM7213a.f12772b.f12845f;
        if (!immutableList.isEmpty()) {
            InterfaceC2492i[] interfaceC2492iArr = new InterfaceC2492i[immutableList.size() + 1];
            int i10 = 0;
            interfaceC2492iArr[0] = interfaceC2492iMo7269a;
            while (i10 < immutableList.size()) {
                InterfaceC9882g.a aVar5 = this.f13084b;
                aVar5.getClass();
                InterfaceC2528b c2527a = new C2527a();
                InterfaceC2528b interfaceC2528b2 = this.f13085c;
                if (interfaceC2528b2 != null) {
                    c2527a = interfaceC2528b2;
                }
                int i11 = i10 + 1;
                interfaceC2492iArr[i11] = new C2502s(immutableList.get(i10), aVar5, c2527a);
                i10 = i11;
            }
            interfaceC2492iMo7269a = new MergingMediaSource(interfaceC2492iArr);
        }
        InterfaceC2492i clippingMediaSource = interfaceC2492iMo7269a;
        C2466p.c cVar = c2466pM7213a.f12775e;
        long j10 = cVar.f12796a;
        long j11 = cVar.f12797b;
        if (j10 != 0 || j11 != Long.MIN_VALUE || cVar.f12799d) {
            clippingMediaSource = new ClippingMediaSource(clippingMediaSource, C10134c0.m19026K(j10), C10134c0.m19026K(j11), !cVar.f12800e, cVar.f12798c, cVar.f12799d);
        }
        c2466pM7213a.f12772b.getClass();
        return clippingMediaSource;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
    /* JADX INFO: renamed from: b */
    public final InterfaceC2492i.a mo7270b(InterfaceC7287b interfaceC7287b) {
        if (interfaceC7287b == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        a aVar = this.f13083a;
        aVar.f13096f = interfaceC7287b;
        Iterator it = aVar.f13094d.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC2492i.a) it.next()).mo7270b(interfaceC7287b);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i.a
    /* JADX INFO: renamed from: c */
    public final InterfaceC2492i.a mo7271c(InterfaceC2528b interfaceC2528b) {
        if (interfaceC2528b == null) {
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        this.f13085c = interfaceC2528b;
        a aVar = this.f13083a;
        aVar.f13097g = interfaceC2528b;
        Iterator it = aVar.f13094d.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC2492i.a) it.next()).mo7271c(interfaceC2528b);
        }
        return this;
    }
}
