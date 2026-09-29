package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p150h9.C5903b;
import p454wa.C9883h;
import p454wa.C9884i;
import p454wa.C9889n;
import p454wa.C9893r;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p482xd.C10170b;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2404h implements InterfaceC2405i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9882g.a f12216a;

    /* JADX INFO: renamed from: b */
    public final String f12217b;

    /* JADX INFO: renamed from: c */
    public final boolean f12218c;

    /* JADX INFO: renamed from: d */
    public final HashMap f12219d;

    public C2404h(String str, boolean z10, C9889n.a aVar) {
        C10129a.m18990b((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f12216a = aVar;
        this.f12217b = str;
        this.f12218c = z10;
        this.f12219d = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m6988b(InterfaceC9882g.a aVar, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        Map<String, List<String>> map2;
        List<String> list;
        C9893r c9893r = new C9893r(aVar.mo14771a());
        Collections.emptyMap();
        Uri uri = Uri.parse(str);
        C10129a.m18994f(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        C9884i c9884i = new C9884i(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i10 = 0;
        int i11 = 0;
        C9884i c9884i2 = c9884i;
        while (true) {
            try {
                C9883h c9883h = new C9883h(c9893r, c9884i2);
                try {
                    try {
                        int i12 = C10134c0.f51354a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i13 = c9883h.read(bArr2);
                            if (i13 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, i10, i13);
                            int i14 = C10134c0.f51354a;
                            try {
                                c9883h.close();
                            } catch (IOException unused) {
                            }
                            throw th;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        int i15 = C10134c0.f51354a;
                        try {
                            c9883h.close();
                        } catch (IOException unused2) {
                        }
                        return byteArray;
                    } catch (HttpDataSource$InvalidResponseCodeException e10) {
                        int i16 = e10.f13692d;
                        String str3 = ((((i16 == 307 || i16 == 308) && i11 < 5) ? 1 : i10) == 0 || (map2 = e10.f13693e) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i10);
                        if (str3 == null) {
                            throw e10;
                        }
                        int i17 = i11 + 1;
                        long j10 = c9884i2.f50437b;
                        int i18 = c9884i2.f50438c;
                        byte[] bArr3 = c9884i2.f50439d;
                        Map<String, String> map3 = c9884i2.f50440e;
                        long j11 = c9884i2.f50441f;
                        long j12 = c9884i2.f50442g;
                        String str4 = c9884i2.f50443h;
                        int i19 = c9884i2.f50444i;
                        Object obj = c9884i2.f50445j;
                        Uri uri2 = Uri.parse(str3);
                        String str5 = str2;
                        C10129a.m18994f(uri2, str5);
                        C9884i c9884i3 = new C9884i(uri2, j10, i18, bArr3, map3, j11, j12, str4, i19, obj);
                        int i20 = C10134c0.f51354a;
                        try {
                            c9883h.close();
                        } catch (IOException unused3) {
                        }
                        str2 = str5;
                        c9884i2 = c9884i3;
                        i10 = 0;
                        i11 = i17;
                    }
                } catch (Throwable th2) {
                    int i110 = C10134c0.f51354a;
                    c9883h.close();
                    throw th2;
                }
            } catch (Exception e11) {
                Uri uri3 = c9893r.f50527c;
                uri3.getClass();
                throw new MediaDrmCallbackException(c9884i, uri3, c9893r.mo7275h(), c9893r.f50526b, e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m6989a(UUID uuid, InterfaceC2402f.a aVar) throws MediaDrmCallbackException {
        String str;
        String str2 = aVar.f12209b;
        if (this.f12218c || TextUtils.isEmpty(str2)) {
            str2 = this.f12217b;
        }
        if (TextUtils.isEmpty(str2)) {
            Map mapEmptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            C10129a.m18994f(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new C9884i(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, ImmutableMap.m9070h(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C5903b.f35262e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C5903b.f35260c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f12219d) {
            map.putAll(this.f12219d);
        }
        return m6988b(this.f12216a, str2, aVar.f12208a, map);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m6990c(InterfaceC2402f.d dVar) throws MediaDrmCallbackException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f12211b);
        sb2.append("&signedRequest=");
        int i10 = C10134c0.f51354a;
        sb2.append(new String(dVar.f12210a, C10170b.f51477c));
        return m6988b(this.f12216a, sb2.toString(), null, Collections.emptyMap());
    }
}
