package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cvc extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cvd f9761a;

    public cvc(cvd cvdVar) {
        this.f9761a = cvdVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f9761a.m5562b();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.f9761a.m5562b();
    }
}
