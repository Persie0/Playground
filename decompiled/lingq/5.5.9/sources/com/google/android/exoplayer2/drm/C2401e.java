package com.google.android.exoplayer2.drm;

import java.util.UUID;
import p150h9.C5903b;
import p218k9.InterfaceC6632b;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2401e implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final DrmSession.DrmSessionException f12207a;

    public C2401e(DrmSession.DrmSessionException drmSessionException) {
        this.f12207a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: f */
    public final DrmSession.DrmSessionException mo6936f() {
        return this.f12207a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public final void mo6937g(InterfaceC2398b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: h */
    public final void mo6938h(InterfaceC2398b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: j */
    public final UUID mo6939j() {
        return C5903b.f35258a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: k */
    public final boolean mo6940k() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: l */
    public final boolean mo6941l(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: m */
    public final InterfaceC6632b mo6942m() {
        return null;
    }
}
