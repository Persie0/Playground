package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.os.Handler;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jzp implements knr {

    /* JADX INFO: renamed from: a */
    private final lek f35343a;

    public jzp(lek lekVar) {
        this.f35343a = lekVar;
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: a */
    public final int mo5426a() {
        return ((lel) this.f35343a).f38035a.getRecordingState();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.f35343a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: b */
    public final AudioFormat mo5427b() {
        return this.f35343a.mo15249a();
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: c */
    public final void mo5428c() {
        this.f35343a.mo15251c();
    }

    @Override // p000.knr, java.lang.AutoCloseable
    public final void close() {
        this.f35343a.close();
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: d */
    public final void mo5429d() {
        this.f35343a.mo15252d();
    }

    @Override // p000.knr
    /* JADX INFO: renamed from: e */
    public final khb mo5430e(ByteBuffer byteBuffer, int i) {
        lej lejVarMo15250b = this.f35343a.mo15250b(byteBuffer, i);
        if (lejVarMo15250b == null) {
            return null;
        }
        return new khb(lejVarMo15250b);
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.f35343a.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.f35343a.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.f35343a.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.f35343a.setPreferredDevice(audioDeviceInfo);
    }
}
