package com.google.android.apps.camera.stats.timing;

import p000.hkk;
import p000.hkp;
import p000.hla;
import p000.hlb;
import p000.hlc;
import p000.kbz;
import p000.kcc;
import p000.ksc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraActivityTiming extends hlc {

    /* JADX INFO: renamed from: a */
    public static final hlb f6961a;

    /* JADX INFO: renamed from: b */
    public static final hlb f6962b;

    /* JADX INFO: renamed from: c */
    public boolean f6963c;

    /* JADX INFO: renamed from: d */
    public final hkk f6964d;

    /* JADX INFO: renamed from: e */
    public final kbz f6965e;

    /* JADX INFO: renamed from: f */
    public kcc f6966f;

    /* JADX INFO: renamed from: g */
    public kcc f6967g;

    /* JADX INFO: renamed from: h */
    public kcc f6968h;

    /* JADX INFO: renamed from: i */
    public kcc f6969i;

    static {
        hla hlaVarM10435a = hlb.m10435a();
        hlaVarM10435a.m10433b(false);
        f6961a = hlaVarM10435a.m10432a();
        f6962b = f28236j;
    }

    public CameraActivityTiming(long j, ksc kscVar, hkk hkkVar, kbz kbzVar) {
        super(kscVar, j, hkp.values());
        this.f6963c = false;
        this.f6969i = kcc.f35555b;
        this.f6964d = hkkVar;
        this.f6965e = kbzVar;
        this.f6966f = kbzVar.mo13957a("FirstPreviewFrame");
        this.f6968h = kbzVar.mo13957a("ShutterButtonEnabled");
        this.f6967g = kbzVar.mo13957a("FirstFrameReceived");
    }

    @Override // p000.hlc
    /* JADX INFO: renamed from: a */
    public final void mo4304a() {
        super.mo4304a();
        this.f6963c = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m4305c() {
        this.f6963c = true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4306d() {
        for (hkp hkpVar : hkp.values()) {
            if (hkpVar.f28204t && !m10440k(hkpVar)) {
                return false;
            }
        }
        return true;
    }

    public long getActivityInitializedNs() {
        return m10436g(hkp.ACTIVITY_INITIALIZED);
    }

    public long getActivityOnCreateEndNs() {
        return m10436g(hkp.ACTIVITY_ONCREATE_END);
    }

    public long getActivityOnCreateStartNs() {
        return m10436g(hkp.ACTIVITY_ONCREATE_START);
    }

    public long getActivityOnResumeEndNs() {
        return m10436g(hkp.ACTIVITY_ONRESUME_END);
    }

    public long getActivityOnResumeStartNs() {
        return m10436g(hkp.ACTIVITY_ONRESUME_START);
    }

    public long getActivityOnStartStartNs() {
        return m10436g(hkp.ACTIVITY_ONSTART_START);
    }

    public long getFirstPreviewFrameReceivedNs() {
        return m10436g(hkp.f28195l);
    }

    public long getFirstPreviewFrameRenderedNs() {
        return m10436g(hkp.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED);
    }

    public long getFirstVfePreviewFrameRenderedNs() {
        return m10436g(hkp.ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED);
    }

    public long getPermissionStartupTaskTimeEndNs() {
        return m10436g(hkp.PERMISSIONS_STARTUP_TASK_END);
    }

    public long getPermissionStartupTaskTimeStartNs() {
        return m10436g(hkp.PERMISSIONS_STARTUP_TASK_START);
    }

    public long getShutterButtonFirstDrawnNs() {
        return m10436g(hkp.ACTIVITY_SHUTTER_BUTTON_DRAWN);
    }

    public long getShutterButtonFirstEnabledNs() {
        return m10436g(hkp.ACTIVITY_SHUTTER_BUTTON_ENABLED);
    }

    public long getWaitForCameraDevicesTaskTimeEndNs() {
        return m10436g(hkp.WAIT_FOR_CAMERA_DEVICES_TASK_END);
    }

    public long getWaitForCameraDevicesTaskTimeStartNs() {
        return m10436g(hkp.WAIT_FOR_CAMERA_DEVICES_TASK_START);
    }

    public void recordActivityOnCreateStart(long j) {
        m10439j(hkp.ACTIVITY_ONCREATE_START, j, f6961a);
    }
}
