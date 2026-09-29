package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p174i9.C6215e0;
import p218k9.InterfaceC6632b;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2402f {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final byte[] f12208a;

        /* JADX INFO: renamed from: b */
        public final String f12209b;

        public a(String str, byte[] bArr) {
            this.f12208a = bArr;
            this.f12209b = str;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC2402f mo624a(UUID uuid);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.f$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final byte[] f12210a;

        /* JADX INFO: renamed from: b */
        public final String f12211b;

        public d(String str, byte[] bArr) {
            this.f12210a = bArr;
            this.f12211b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    Map<String, String> mo6973a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    d mo6974b();

    /* JADX INFO: renamed from: c */
    default void mo6985c(byte[] bArr, C6215e0 c6215e0) {
    }

    /* JADX INFO: renamed from: d */
    InterfaceC6632b mo6975d(byte[] bArr) throws MediaCryptoException;

    /* JADX INFO: renamed from: e */
    byte[] mo6976e() throws MediaDrmException;

    /* JADX INFO: renamed from: f */
    void mo6977f(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: g */
    void mo6978g(byte[] bArr);

    /* JADX INFO: renamed from: h */
    byte[] mo6979h(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    /* JADX INFO: renamed from: i */
    void mo6980i(byte[] bArr) throws DeniedByServerException;

    /* JADX INFO: renamed from: j */
    void mo6981j(DefaultDrmSessionManager.C2390a c2390a);

    /* JADX INFO: renamed from: k */
    a mo6982k(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    /* JADX INFO: renamed from: l */
    int mo6983l();

    /* JADX INFO: renamed from: m */
    boolean mo6984m(String str, byte[] bArr);

    void release();
}
