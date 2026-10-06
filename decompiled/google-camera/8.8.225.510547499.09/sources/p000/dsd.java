package p000;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsd implements TextureFrame {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f12473a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ldz f12474b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Instant f12475c;

    public dsd(int i, ldz ldzVar, Instant instant) {
        this.f12473a = i;
        this.f12474b = ldzVar;
        this.f12475c = instant;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.f12474b.m15229b().f37877a.m15088a();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.f12473a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.f12475c.toEpochMilli();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.f12474b.m15229b().f37877a.m15089b();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ void retain() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ boolean supportsRetain() {
        return false;
    }
}
