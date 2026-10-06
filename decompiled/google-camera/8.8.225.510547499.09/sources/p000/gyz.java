package p000;

import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyz {

    /* JADX INFO: renamed from: e */
    private static final nbh f26911e = nbh.m17259h("com/google/android/apps/camera/settings/AudioDeviceStateManager");

    /* JADX INFO: renamed from: a */
    public final jww f26912a;

    /* JADX INFO: renamed from: g */
    private AudioDeviceInfo f26917g;

    /* JADX INFO: renamed from: h */
    private AudioDeviceInfo f26918h;

    /* JADX INFO: renamed from: i */
    private AudioDeviceInfo f26919i;

    /* JADX INFO: renamed from: f */
    private final jww f26916f = new jwf(false);

    /* JADX INFO: renamed from: b */
    public final jww f26913b = new jwf(false);

    /* JADX INFO: renamed from: c */
    public final jww f26914c = new jwf(false);

    /* JADX INFO: renamed from: d */
    public final jww f26915d = new jwf(false);

    public gyz(jww jwwVar) {
        this.f26912a = jwwVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m10004a(gyy gyyVar) {
        AudioDeviceInfo audioDeviceInfo = this.f26917g;
        if (gyyVar.equals(gyy.EXT_WIRED)) {
            audioDeviceInfo = this.f26918h;
        } else if (gyyVar.equals(gyy.EXT_BLUETOOTH)) {
            audioDeviceInfo = this.f26919i;
        }
        if (audioDeviceInfo == null) {
            ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3386)).mo17293r("no available audioDeviceInfo for %s", gyyVar);
        }
        if (audioDeviceInfo != null) {
            return audioDeviceInfo.getType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final gzn m10005b() {
        return (gzn) this.f26912a.mo3831be();
    }

    /* JADX INFO: renamed from: c */
    public final String m10006c(gyy gyyVar) {
        AudioDeviceInfo audioDeviceInfo = this.f26917g;
        if (gyyVar.equals(gyy.EXT_WIRED)) {
            audioDeviceInfo = this.f26918h;
        } else if (gyyVar.equals(gyy.EXT_BLUETOOTH)) {
            audioDeviceInfo = this.f26919i;
        }
        return audioDeviceInfo != null ? audioDeviceInfo.getProductName().toString() : "";
    }

    /* JADX INFO: renamed from: d */
    public final void m10007d(gyy gyyVar, AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            audioDeviceInfo.getType();
        }
        gyy gyyVar2 = gyy.UNKNOWN;
        switch (gyyVar.ordinal()) {
            case 1:
                this.f26917g = audioDeviceInfo;
                break;
            case 2:
                this.f26918h = audioDeviceInfo;
                this.f26916f.mo3415bf(Boolean.valueOf(audioDeviceInfo != null));
                this.f26913b.mo3415bf((Boolean) ((jwf) this.f26916f).f34942d);
                break;
            case 3:
                this.f26919i = audioDeviceInfo;
                this.f26914c.mo3415bf(Boolean.valueOf(audioDeviceInfo != null));
                break;
            default:
                ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3388)).mo17293r("setAudioDeviceInfo type %s is not supported", gyyVar);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10008e(gyy gyyVar, Boolean bool) {
        gyy gyyVar2 = gyy.UNKNOWN;
        switch (gyyVar.ordinal()) {
            case 2:
                if (!m10009f(gyy.EXT_WIRED)) {
                    ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3390)).mo17290o("setMicConnected failed, wired mic is not available");
                } else {
                    this.f26913b.mo3415bf(bool);
                }
                break;
            case 3:
                if (!m10009f(gyy.EXT_BLUETOOTH)) {
                    ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3391)).mo17290o("setMicConnected failed, bluetooth is not available");
                } else {
                    this.f26915d.mo3415bf(bool);
                }
                break;
            default:
                ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3389)).mo17293r("setMicConnected type %s is not supported", gyyVar);
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10009f(gyy gyyVar) {
        gyy gyyVar2 = gyy.UNKNOWN;
        switch (gyyVar.ordinal()) {
            case 1:
                return true;
            case 2:
                return ((Boolean) ((jwf) this.f26916f).f34942d).booleanValue();
            case 3:
                return ((Boolean) ((jwf) this.f26914c).f34942d).booleanValue();
            default:
                ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3392)).mo17293r("isMicAvailable type %s is not supported", gyyVar);
                return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10010g(gyy gyyVar) {
        gyy gyyVar2 = gyy.UNKNOWN;
        switch (gyyVar.ordinal()) {
            case 1:
                return true;
            case 2:
                return ((Boolean) ((jwf) this.f26913b).f34942d).booleanValue();
            case 3:
                return ((Boolean) ((jwf) this.f26915d).f34942d).booleanValue();
            default:
                ((nbe) ((nbe) f26911e.m17252c()).mo17276G((char) 3393)).mo17293r("getMicConnected type %s is not supported", gyyVar);
                return false;
        }
    }
}
