package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.support.v4.media.C0141b;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.common.collect.AbstractC3187f0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p150h9.C5903b;
import p239l9.InterfaceC7287b;
import p454wa.C9889n;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2397a implements InterfaceC7287b {

    /* JADX INFO: renamed from: a */
    public final Object f12197a = new Object();

    /* JADX INFO: renamed from: b */
    public C2466p.d f12198b;

    /* JADX INFO: renamed from: c */
    public DefaultDrmSessionManager f12199c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static DefaultDrmSessionManager m6959b(C2466p.d dVar) {
        C9889n.a aVar = new C9889n.a();
        aVar.f50507c = null;
        Uri uri = dVar.f12808b;
        C2404h c2404h = new C2404h(uri == null ? null : uri.toString(), dVar.f12812f, aVar);
        ImmutableMap<String, String> immutableMap = dVar.f12809c;
        ImmutableSet immutableSet = immutableMap.f16049a;
        ImmutableSet immutableSet2 = immutableSet;
        if (immutableSet == null) {
            ImmutableSet immutableSetMo9071b = immutableMap.mo9071b();
            immutableMap.f16049a = immutableSetMo9071b;
            immutableSet2 = immutableSetMo9071b;
        }
        AbstractC3187f0 it = immutableSet2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (c2404h.f12219d) {
                c2404h.f12219d.put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = C5903b.f35258a;
        C2527a c2527a = new C2527a();
        UUID uuid2 = dVar.f12807a;
        C0141b c0141b = C2403g.f12212d;
        uuid2.getClass();
        boolean z10 = dVar.f12810d;
        boolean z11 = dVar.f12811e;
        int[] iArrM9145o0 = Ints.m9145o0(dVar.f12813g);
        for (int i10 : iArrM9145o0) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            C10129a.m18990b(z12);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, c0141b, c2404h, map, z10, (int[]) iArrM9145o0.clone(), z11, c2527a, 300000L);
        byte[] bArr = dVar.f12814h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        C10129a.m18992d(defaultDrmSessionManager.f12164m.isEmpty());
        defaultDrmSessionManager.f12173v = 0;
        defaultDrmSessionManager.f12174w = bArrCopyOf;
        return defaultDrmSessionManager;
    }

    @Override // p239l9.InterfaceC7287b
    /* JADX INFO: renamed from: a */
    public final InterfaceC2399c mo6960a(C2466p c2466p) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        c2466p.f12772b.getClass();
        C2466p.d dVar = c2466p.f12772b.f12842c;
        if (dVar != null && C10134c0.f51354a >= 18) {
            synchronized (this.f12197a) {
                if (!C10134c0.m19034a(dVar, this.f12198b)) {
                    this.f12198b = dVar;
                    this.f12199c = m6959b(dVar);
                }
                defaultDrmSessionManager = this.f12199c;
                defaultDrmSessionManager.getClass();
            }
            return defaultDrmSessionManager;
        }
        return InterfaceC2399c.f12205a;
    }
}
