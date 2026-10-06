package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxu {

    /* JADX INFO: renamed from: a */
    private boolean f29846a;

    /* JADX INFO: renamed from: b */
    private boolean f29847b;

    /* JADX INFO: renamed from: c */
    private boolean f29848c;

    /* JADX INFO: renamed from: d */
    private jwn f29849d;

    /* JADX INFO: renamed from: e */
    private jwn f29850e;

    /* JADX INFO: renamed from: f */
    private byte f29851f;

    /* JADX INFO: renamed from: a */
    public final hxv m10841a() {
        jwn jwnVar;
        jwn jwnVar2;
        if (this.f29851f == 7 && (jwnVar = this.f29849d) != null && (jwnVar2 = this.f29850e) != null) {
            return new hxv(this.f29846a, this.f29847b, this.f29848c, jwnVar, jwnVar2);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f29851f & 1) == 0) {
            sb.append(" showOutputTimer");
        }
        if ((this.f29851f & 2) == 0) {
            sb.append(" showMutedAudioIcon");
        }
        if ((this.f29851f & 4) == 0) {
            sb.append(" showSpeechEnhanceIcon");
        }
        if (this.f29849d == null) {
            sb.append(" showMicInputExtWired");
        }
        if (this.f29850e == null) {
            sb.append(" showMicInputExtBluetooth");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10842b(jwn jwnVar) {
        if (jwnVar == null) {
            throw new NullPointerException("Null showMicInputExtBluetooth");
        }
        this.f29850e = jwnVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m10843c(jwn jwnVar) {
        if (jwnVar == null) {
            throw new NullPointerException(zuAgeeF.geZ);
        }
        this.f29849d = jwnVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m10844d(boolean z) {
        this.f29847b = z;
        this.f29851f = (byte) (this.f29851f | 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m10845e(boolean z) {
        this.f29846a = z;
        this.f29851f = (byte) (this.f29851f | 1);
    }

    /* JADX INFO: renamed from: f */
    public final void m10846f(boolean z) {
        this.f29848c = z;
        this.f29851f = (byte) (this.f29851f | 4);
    }
}
