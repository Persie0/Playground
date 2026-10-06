package com.google.p020vr.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import p000.oeu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DeviceInfo {

    /* JADX INFO: renamed from: a */
    public final long f8433a;

    /* JADX INFO: renamed from: b */
    private final Context f8434b;

    /* JADX INFO: renamed from: c */
    private final BroadcastReceiver f8435c = new oeu(this);

    private DeviceInfo(long j, Context context) {
        this.f8433a = j;
        this.f8434b = context;
    }

    private static DeviceInfo createDeviceInfo(long j, Context context) {
        return new DeviceInfo(j, context);
    }

    private int getSystemBufferSize() {
        String property = ((AudioManager) this.f8434b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Integer.parseInt(property);
        }
        Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
        return 256;
    }

    private int getSystemSampleRate() {
        String property = ((AudioManager) this.f8434b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property != null) {
            return Integer.parseInt(property);
        }
        Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
        return 48000;
    }

    private boolean isBluetoothAudioDevicePluggedIn() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f8434b.getSystemService(pIeXJQLZLfgIN.INV)).getDevices(2)) {
            if (audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    private boolean isHeadphonePluggedIn() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.f8434b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    private void registerHandlers() {
        this.f8434b.registerReceiver(this.f8435c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    private void unregisterHandlers() {
        this.f8434b.unregisterReceiver(this.f8435c);
    }

    public native void nativeUpdateHeadphoneStateChange(long j, int i);
}
