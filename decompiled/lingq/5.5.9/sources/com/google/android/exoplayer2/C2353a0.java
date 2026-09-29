package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.activity.RunnableC0191j;
import com.google.android.exoplayer2.InterfaceC2532v;
import p402u0.C9370m;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10144m;
import p479xa.C10145n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2353a0 {

    /* JADX INFO: renamed from: a */
    public final Context f11825a;

    /* JADX INFO: renamed from: b */
    public final Handler f11826b;

    /* JADX INFO: renamed from: c */
    public final a f11827c;

    /* JADX INFO: renamed from: d */
    public final AudioManager f11828d;

    /* JADX INFO: renamed from: e */
    public b f11829e;

    /* JADX INFO: renamed from: f */
    public int f11830f;

    /* JADX INFO: renamed from: g */
    public int f11831g;

    /* JADX INFO: renamed from: h */
    public boolean f11832h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.a0$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.a0$b */
    public final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f11833b = 0;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C2353a0 c2353a0 = C2353a0.this;
            c2353a0.f11826b.post(new RunnableC0191j(10, c2353a0));
        }
    }

    public C2353a0(Context context, Handler handler, C2413j.b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11825a = applicationContext;
        this.f11826b = handler;
        this.f11827c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        C10129a.m18993e(audioManager);
        this.f11828d = audioManager;
        this.f11830f = 3;
        this.f11831g = m6783b(audioManager, 3);
        int i10 = this.f11830f;
        this.f11832h = C10134c0.f51354a >= 23 ? audioManager.isStreamMute(i10) : m6783b(audioManager, i10) == 0;
        b bVar2 = new b();
        try {
            applicationContext.registerReceiver(bVar2, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f11829e = bVar2;
        } catch (RuntimeException e10) {
            C10145n.m19100h("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m6783b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            C10145n.m19100h("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m6784a() {
        if (C10134c0.f51354a >= 28) {
            return this.f11828d.getStreamMinVolume(this.f11830f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m6785c(int i10) {
        if (this.f11830f == i10) {
            return;
        }
        this.f11830f = i10;
        m6786d();
        C2413j c2413j = C2413j.this;
        C2353a0 c2353a0 = c2413j.f12269B;
        C2412i c2412i = new C2412i(0, c2353a0.m6784a(), c2353a0.f11828d.getStreamMaxVolume(c2353a0.f11830f));
        if (c2412i.equals(c2413j.f12328r0)) {
            return;
        }
        c2413j.f12328r0 = c2412i;
        c2413j.f12315l.m19091e(29, new C9370m(5, c2412i));
    }

    /* JADX INFO: renamed from: d */
    public final void m6786d() {
        final boolean zIsStreamMute;
        int i10 = this.f11830f;
        AudioManager audioManager = this.f11828d;
        final int iM6783b = m6783b(audioManager, i10);
        int i11 = this.f11830f;
        if (C10134c0.f51354a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i11);
        } else {
            zIsStreamMute = m6783b(audioManager, i11) == 0;
        }
        if (this.f11831g == iM6783b && this.f11832h == zIsStreamMute) {
            return;
        }
        this.f11831g = iM6783b;
        this.f11832h = zIsStreamMute;
        C2413j.this.f12315l.m19091e(30, new C10144m.a() { // from class: h9.w
            @Override // p479xa.C10144m.a
            /* JADX INFO: renamed from: n */
            public final void mo780n(Object obj) {
                ((InterfaceC2532v.c) obj).mo7493W(iM6783b, zIsStreamMute);
            }
        });
    }
}
