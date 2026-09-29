package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;

/* JADX INFO: loaded from: classes3.dex */
public final class hy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final AudioUnderlineMode f43220a;

    public hy9(AudioUnderlineMode audioUnderlineMode) {
        audioUnderlineMode.getClass();
        this.f43220a = audioUnderlineMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy9) && this.f43220a == ((hy9) obj).f43220a;
    }

    public final int hashCode() {
        return this.f43220a.hashCode();
    }

    public final String toString() {
        return "UpdateAudioUnderlineMode(mode=" + this.f43220a + ")";
    }
}
