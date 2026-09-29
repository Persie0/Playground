package androidx.media3.exoplayer.source;

import androidx.media3.common.C0713b;
import java.util.concurrent.atomic.AtomicReference;
import p000.h02;
import p000.k47;
import p000.m8a;
import p000.n8a;
import p000.ug2;
import p000.yk8;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0716a implements n8a {

    /* JADX INFO: renamed from: a */
    public final yk8 f6461a;

    /* JADX INFO: renamed from: b */
    public final yk8 f6462b;

    /* JADX INFO: renamed from: c */
    public final ug2 f6463c = new ug2();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f6464d = new AtomicReference(ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode.PASS_THROUGH);

    public C0716a(yk8 yk8Var) {
        this.f6461a = yk8Var;
        this.f6462b = yk8Var;
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: a */
    public final void mo2531a(long j, int i, int i2, int i3, m8a m8aVar) {
        m2538h().mo2531a(j, i, i2, i3, m8aVar);
        AtomicReference atomicReference = this.f6464d;
        if (atomicReference.get() == ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.f6462b.m25178q(false);
            atomicReference.set(ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode.DISCARDING);
        }
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: b */
    public final void mo2532b(k47 k47Var, int i, int i2) {
        m2538h().mo2532b(k47Var, i, i2);
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: c */
    public final int mo2533c(h02 h02Var, int i, boolean z) {
        return m2538h().mo2533c(h02Var, i, z);
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: d */
    public final void mo2534d(long j) {
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: e */
    public final void mo2535e(int i, k47 k47Var) {
        m2538h().mo2535e(i, k47Var);
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: f */
    public final int mo2536f(h02 h02Var, int i, boolean z) {
        return m2538h().mo2536f(h02Var, i, z);
    }

    @Override // p000.n8a
    /* JADX INFO: renamed from: g */
    public final void mo2537g(C0713b c0713b) {
        this.f6461a.mo2537g(c0713b);
    }

    /* JADX INFO: renamed from: h */
    public final n8a m2538h() {
        return this.f6464d.get() == ProgressiveMediaPeriod$ControlledTrackOutput$OutputMode.DISCARDING ? this.f6463c : this.f6462b;
    }
}
