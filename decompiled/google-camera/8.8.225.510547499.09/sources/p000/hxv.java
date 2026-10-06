package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxv {

    /* JADX INFO: renamed from: a */
    public final boolean f29852a;

    /* JADX INFO: renamed from: b */
    public final boolean f29853b;

    /* JADX INFO: renamed from: c */
    public final boolean f29854c;

    /* JADX INFO: renamed from: d */
    public final jwn f29855d;

    /* JADX INFO: renamed from: e */
    public final jwn f29856e;

    public hxv() {
    }

    public hxv(boolean z, boolean z2, boolean z3, jwn jwnVar, jwn jwnVar2) {
        this.f29852a = z;
        this.f29853b = z2;
        this.f29854c = z3;
        this.f29855d = jwnVar;
        this.f29856e = jwnVar2;
    }

    /* JADX INFO: renamed from: a */
    public static hxu m10847a() {
        hxu hxuVar = new hxu();
        hxuVar.m10845e(false);
        hxuVar.m10844d(false);
        hxuVar.m10846f(false);
        hxuVar.m10843c(new jwf(false));
        hxuVar.m10842b(new jwf(false));
        return hxuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxv) {
            hxv hxvVar = (hxv) obj;
            if (this.f29852a == hxvVar.f29852a && this.f29853b == hxvVar.f29853b && this.f29854c == hxvVar.f29854c && this.f29855d.equals(hxvVar.f29855d) && this.f29856e.equals(hxvVar.f29856e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.f29852a ? 1237 : 1231;
        return ((((((((i ^ 1000003) * 1000003) ^ (true != this.f29853b ? 1237 : 1231)) * 1000003) ^ (true == this.f29854c ? 1231 : 1237)) * 1000003) ^ this.f29855d.hashCode()) * 1000003) ^ this.f29856e.hashCode();
    }

    public final String toString() {
        return "ElapsedTimeUIConfig{showOutputTimer=" + this.f29852a + ", showMutedAudioIcon=" + this.f29853b + ", showSpeechEnhanceIcon=" + this.f29854c + ", showMicInputExtWired=" + String.valueOf(this.f29855d) + ", showMicInputExtBluetooth=" + String.valueOf(this.f29856e) + "}";
    }
}
