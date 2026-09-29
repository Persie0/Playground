package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p218k9.InterfaceC6632b;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2400d implements InterfaceC2402f {
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: a */
    public final Map<String, String> mo6973a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: b */
    public final InterfaceC2402f.d mo6974b() {
        throw new IllegalStateException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: d */
    public final InterfaceC6632b mo6975d(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: e */
    public final byte[] mo6976e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: f */
    public final void mo6977f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: g */
    public final void mo6978g(byte[] bArr) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: h */
    public final byte[] mo6979h(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: i */
    public final void mo6980i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: j */
    public final void mo6981j(DefaultDrmSessionManager.C2390a c2390a) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: k */
    public final InterfaceC2402f.a mo6982k(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: l */
    public final int mo6983l() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    /* JADX INFO: renamed from: m */
    public final boolean mo6984m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2402f
    public final void release() {
    }
}
