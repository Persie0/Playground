package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.support.v4.media.C0141b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2381c;
import com.google.android.exoplayer2.audio.C2367a;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2381c {

    /* JADX INFO: renamed from: a */
    public final AudioManager f12047a;

    /* JADX INFO: renamed from: b */
    public final a f12048b;

    /* JADX INFO: renamed from: c */
    public b f12049c;

    /* JADX INFO: renamed from: d */
    public C2367a f12050d;

    /* JADX INFO: renamed from: e */
    public int f12051e;

    /* JADX INFO: renamed from: f */
    public int f12052f;

    /* JADX INFO: renamed from: g */
    public float f12053g = 1.0f;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f12054h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final Handler f12055a;

        public a(Handler handler) {
            this.f12055a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i10) {
            this.f12055a.post(new Runnable() { // from class: h9.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2381c c2381c = C2381c.this;
                    c2381c.getClass();
                    int i11 = i10;
                    if (i11 == -3 || i11 == -2) {
                        if (i11 != -2) {
                            C2367a c2367a = c2381c.f12050d;
                            if (!(c2367a != null && c2367a.f11938a == 1)) {
                                c2381c.m6902d(3);
                                return;
                            }
                        }
                        c2381c.m6900b(0);
                        c2381c.m6902d(2);
                        return;
                    }
                    if (i11 == -1) {
                        c2381c.m6900b(-1);
                        c2381c.m6899a();
                    } else if (i11 != 1) {
                        C0141b.m620p("Unknown focus change type: ", i11, "AudioFocusManager");
                    } else {
                        c2381c.m6902d(1);
                        c2381c.m6900b(1);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c$b */
    public interface b {
    }

    public C2381c(Context context, Handler handler, C2413j.b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f12047a = audioManager;
        this.f12049c = bVar;
        this.f12048b = new a(handler);
        this.f12051e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m6899a() {
        if (this.f12051e == 0) {
            return;
        }
        int i10 = C10134c0.f51354a;
        AudioManager audioManager = this.f12047a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f12054h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            m6902d(0);
        }
        audioManager.abandonAudioFocus(this.f12048b);
        m6902d(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m6900b(int i10) {
        b bVar = this.f12049c;
        if (bVar != null) {
            C2413j c2413j = C2413j.this;
            boolean playWhenReady = c2413j.getPlayWhenReady();
            int i11 = 1;
            if (playWhenReady && i10 != 1) {
                i11 = 2;
            }
            c2413j.m7018A(i10, i11, playWhenReady);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX INFO: renamed from: c */
    public final void m6901c(C2367a c2367a) {
        int i10;
        if (C10134c0.m19034a(this.f12050d, c2367a)) {
            return;
        }
        this.f12050d = c2367a;
        if (c2367a != null) {
            int i11 = c2367a.f11940c;
            switch (i11) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C10145n.m19099g("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i10 = 1;
                    break;
                case 1:
                case 14:
                    i10 = 1;
                    break;
                case 2:
                case 4:
                    i10 = 2;
                    break;
                case 3:
                    break;
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    i10 = 3;
                    break;
                case 11:
                    if (c2367a.f11938a != 1) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                    break;
                case 15:
                default:
                    C0141b.m620p("Unidentified audio usage: ", i11, "AudioFocusManager");
                    break;
                case 16:
                    if (C10134c0.f51354a < 19) {
                        i10 = 2;
                    } else {
                        i10 = 4;
                    }
                    break;
            }
            this.f12052f = i10;
            C10129a.m18989a("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
        }
        i10 = 0;
        this.f12052f = i10;
        if (i10 != 1) {
        }
        C10129a.m18989a("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m6902d(int i10) {
        if (this.f12051e == i10) {
            return;
        }
        this.f12051e = i10;
        float f3 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f12053g == f3) {
            return;
        }
        this.f12053g = f3;
        b bVar = this.f12049c;
        if (bVar != null) {
            C2413j c2413j = C2413j.this;
            c2413j.m7035u(1, 2, Float.valueOf(c2413j.f12310i0 * c2413j.f12268A.f12053g));
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m6903e(int i10, boolean z10) {
        int iRequestAudioFocus;
        int i11 = 1;
        if (i10 == 1 || this.f12052f != 1) {
            m6899a();
            return z10 ? 1 : -1;
        }
        if (!z10) {
            return -1;
        }
        if (this.f12051e != 1) {
            int i12 = C10134c0.f51354a;
            a aVar = this.f12048b;
            AudioManager audioManager = this.f12047a;
            if (i12 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f12054h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f12052f) : new AudioFocusRequest.Builder(this.f12054h);
                    C2367a c2367a = this.f12050d;
                    boolean z11 = c2367a != null && c2367a.f11938a == 1;
                    c2367a.getClass();
                    this.f12054h = builder.setAudioAttributes(c2367a.m6838a().f11944a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(aVar).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f12054h);
            } else {
                C2367a c2367a2 = this.f12050d;
                c2367a2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(aVar, C10134c0.m19057x(c2367a2.f11940c), this.f12052f);
            }
            if (iRequestAudioFocus == 1) {
                m6902d(1);
            } else {
                m6902d(0);
                i11 = -1;
            }
        }
        return i11;
    }
}
