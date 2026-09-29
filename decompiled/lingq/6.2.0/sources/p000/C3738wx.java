package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: wx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3738wx {

    /* JADX INFO: renamed from: a */
    public final Context f67455a;

    /* JADX INFO: renamed from: b */
    public final C3440oy f67456b;

    /* JADX INFO: renamed from: c */
    public final Handler f67457c;

    /* JADX INFO: renamed from: d */
    public final C3664ux f67458d;

    /* JADX INFO: renamed from: e */
    public final C3693vp f67459e;

    /* JADX INFO: renamed from: f */
    public final C3701vx f67460f;

    /* JADX INFO: renamed from: g */
    public nc0 f67461g;

    /* JADX INFO: renamed from: h */
    public C3627tx f67462h;

    /* JADX INFO: renamed from: i */
    public AudioDeviceInfo f67463i;

    /* JADX INFO: renamed from: j */
    public C3476px f67464j;

    /* JADX INFO: renamed from: k */
    public boolean f67465k;

    public C3738wx(Context context, C3440oy c3440oy, C3476px c3476px, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f67455a = applicationContext;
        this.f67456b = c3440oy;
        this.f67464j = c3476px;
        this.f67463i = audioDeviceInfo;
        String str = uma.f64080a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f67457c = handler;
        this.f67458d = new C3664ux(this);
        this.f67459e = new C3693vp(this, 1);
        ImmutableList immutableList = C3627tx.f63028e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f67460f = uriFor != null ? new C3701vx(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: a */
    public final List m24185a() {
        nc0 nc0Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 32 || (nc0Var = this.f67461g) == null) {
            return ImmutableList.m6289v();
        }
        if (((Spatializer) nc0Var.f52585c) == null || !nc0Var.f52584b || !nc0Var.m17329f() || !nc0Var.m17330g()) {
            return ImmutableList.m6289v();
        }
        if (i < 36) {
            return ImmutableList.m6291y(252);
        }
        Spatializer spatializer = (Spatializer) nc0Var.f52585c;
        spatializer.getClass();
        return AbstractC3439ox.m18547c(spatializer).getSpatializedChannelMasks();
    }

    /* JADX INFO: renamed from: b */
    public final void m24186b(C3627tx c3627tx) {
        if (!this.f67465k || c3627tx.equals(this.f67462h)) {
            return;
        }
        this.f67462h = c3627tx;
        b00 b00Var = (b00) this.f67456b.f55160b;
        b00Var.m3143f();
        C3627tx c3627tx2 = b00Var.f7713h;
        if (c3627tx2 == null || c3627tx.equals(c3627tx2)) {
            return;
        }
        b00Var.f7713h = c3627tx;
        vg5 vg5Var = b00Var.f7711f;
        if (vg5Var != null) {
            vg5Var.m23271d(-1, new hm2(5));
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3627tx m24187c() {
        if (this.f67465k) {
            C3627tx c3627tx = this.f67462h;
            c3627tx.getClass();
            return c3627tx;
        }
        this.f67465k = true;
        C3701vx c3701vx = this.f67460f;
        if (c3701vx != null) {
            c3701vx.f66036a.registerContentObserver(c3701vx.f66037b, false, c3701vx);
        }
        Context context = this.f67455a;
        AudioManager audioManagerM17083B = AbstractC3352my.m17083B(context);
        C3664ux c3664ux = this.f67458d;
        Handler handler = this.f67457c;
        audioManagerM17083B.registerAudioDeviceCallback(c3664ux, handler);
        if (Build.VERSION.SDK_INT >= 32 && this.f67461g == null) {
            this.f67461g = new nc0(context, new RunnableC3781y2(this, 5), Boolean.valueOf(uma.m22796A(context)));
        }
        C3627tx c3627txM22332b = C3627tx.m22332b(context, context.registerReceiver(this.f67459e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f67464j, this.f67463i, m24185a());
        this.f67462h = c3627txM22332b;
        return c3627txM22332b;
    }

    /* JADX INFO: renamed from: d */
    public final void m24188d(C3476px c3476px) {
        if (Objects.equals(c3476px, this.f67464j)) {
            return;
        }
        this.f67464j = c3476px;
        AudioDeviceInfo audioDeviceInfo = this.f67463i;
        List listM24185a = m24185a();
        ImmutableList immutableList = C3627tx.f63028e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f67455a;
        m24186b(C3627tx.m22332b(context, context.registerReceiver(null, intentFilter), c3476px, audioDeviceInfo, listM24185a));
    }

    /* JADX INFO: renamed from: e */
    public final void m24189e(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.f67463i)) {
            return;
        }
        this.f67463i = audioDeviceInfo;
        C3476px c3476px = this.f67464j;
        List listM24185a = m24185a();
        ImmutableList immutableList = C3627tx.f63028e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f67455a;
        m24186b(C3627tx.m22332b(context, context.registerReceiver(null, intentFilter), c3476px, audioDeviceInfo, listM24185a));
    }

    /* JADX INFO: renamed from: f */
    public final void m24190f() {
        nc0 nc0Var;
        if (this.f67465k) {
            this.f67462h = null;
            Context context = this.f67455a;
            AbstractC3352my.m17083B(context).unregisterAudioDeviceCallback(this.f67458d);
            if (Build.VERSION.SDK_INT >= 32 && (nc0Var = this.f67461g) != null) {
                nc0Var.m17333k();
                this.f67461g = null;
            }
            context.unregisterReceiver(this.f67459e);
            C3701vx c3701vx = this.f67460f;
            if (c3701vx != null) {
                c3701vx.f66036a.unregisterContentObserver(c3701vx);
            }
            this.f67465k = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m24191g() {
        List listM24185a = m24185a();
        C3476px c3476px = this.f67464j;
        AudioDeviceInfo audioDeviceInfo = this.f67463i;
        ImmutableList immutableList = C3627tx.f63028e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f67455a;
        m24186b(C3627tx.m22332b(context, context.registerReceiver(null, intentFilter), c3476px, audioDeviceInfo, listM24185a));
    }
}
