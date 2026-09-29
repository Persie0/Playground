package p000;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: ly */
/* JADX INFO: loaded from: classes2.dex */
public final class C3315ly {

    /* JADX INFO: renamed from: a */
    public final int f50284a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f50285b;

    /* JADX INFO: renamed from: c */
    public final Handler f50286c;

    /* JADX INFO: renamed from: d */
    public final C3476px f50287d;

    /* JADX INFO: renamed from: e */
    public final boolean f50288e;

    /* JADX INFO: renamed from: f */
    public final AudioFocusRequest f50289f;

    public C3315ly(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C3476px c3476px, boolean z, boolean z2) {
        this.f50284a = i;
        this.f50286c = handler;
        this.f50287d = c3476px;
        this.f50288e = z;
        this.f50285b = onAudioFocusChangeListener;
        this.f50289f = new AudioFocusRequest.Builder(i).setAudioAttributes(c3476px.m19557a()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
    }

    /* JADX INFO: renamed from: a */
    public final C3278ky m16569a() {
        C3278ky c3278ky = new C3278ky();
        c3278ky.f48571a = this.f50284a;
        c3278ky.f48572b = this.f50285b;
        c3278ky.f48573c = this.f50286c;
        c3278ky.f48574d = this.f50287d;
        c3278ky.f48575e = this.f50288e;
        return c3278ky;
    }

    /* JADX INFO: renamed from: b */
    public final AudioFocusRequest m16570b() {
        AudioFocusRequest audioFocusRequest = this.f50289f;
        audioFocusRequest.getClass();
        return audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3315ly)) {
            return false;
        }
        C3315ly c3315ly = (C3315ly) obj;
        return this.f50284a == c3315ly.f50284a && this.f50288e == c3315ly.f50288e && Objects.equals(this.f50285b, c3315ly.f50285b) && Objects.equals(this.f50286c, c3315ly.f50286c) && Objects.equals(this.f50287d, c3315ly.f50287d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f50284a), this.f50285b, this.f50286c, this.f50287d, Boolean.valueOf(this.f50288e));
    }
}
