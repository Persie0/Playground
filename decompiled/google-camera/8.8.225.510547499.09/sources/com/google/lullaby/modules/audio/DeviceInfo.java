package com.google.lullaby.modules.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import p000.nvo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfo {

    /* JADX INFO: renamed from: a */
    public final long f8411a;

    /* JADX INFO: renamed from: b */
    private final Context f8412b;

    /* JADX INFO: renamed from: c */
    private final BroadcastReceiver f8413c = new nvo(this);

    private DeviceInfo(long j, Context context) {
        this.f8411a = j;
        this.f8412b = context;
    }

    private static DeviceInfo createAudioDeviceInfo(long j, Context context) {
        return new DeviceInfo(j, context);
    }

    private int getSystemBufferSize() {
        String property = ((AudioManager) this.f8412b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Integer.parseInt(property);
        }
        Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
        return 256;
    }

    private int getSystemSampleRate() {
        String property = ((AudioManager) this.f8412b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property != null) {
            return Integer.parseInt(property);
        }
        Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
        return 48000;
    }

    private boolean isBluetoothAudioDevicePluggedIn() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f8412b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    private boolean isHeadphonePluggedIn() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f8412b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    private void registerHandlers() {
        this.f8412b.registerReceiver(this.f8413c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    private void unregisterHandlers() {
        this.f8412b.unregisterReceiver(this.f8413c);
    }

    public native void nativeUpdateHeadphoneStateChange(long j, int i);
}
