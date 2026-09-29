package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: renamed from: ux */
/* JADX INFO: loaded from: classes2.dex */
public final class C3664ux extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3738wx f64482a;

    public C3664ux(C3738wx c3738wx) {
        this.f64482a = c3738wx;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f64482a.m24191g();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C3738wx c3738wx = this.f64482a;
        AudioDeviceInfo audioDeviceInfo = c3738wx.f67463i;
        String str = uma.f64080a;
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo2, audioDeviceInfo)) {
                c3738wx.f67463i = null;
                break;
            }
        }
        c3738wx.m24191g();
    }
}
