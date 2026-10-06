package com.google.p020vr.vrcore.controller.api;

import p000.oge;
import p000.ogf;
import p000.ogg;
import p000.ogi;
import p000.ogj;
import p000.ogk;
import p000.ogm;
import p000.ogn;
import p000.ogq;
import p000.ogr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class NativeCallbacks implements ControllerServiceBridge.Callbacks {

    /* JADX INFO: renamed from: a */
    private final long f8468a;

    /* JADX INFO: renamed from: b */
    private boolean f8469b;

    public NativeCallbacks(long j) {
        this.f8468a = j;
    }

    private native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleServiceConnected(long j, int i);

    private native void handleServiceDisconnected(long j);

    private native void handleServiceFailed(long j);

    private native void handleServiceInitFailed(long j, int i);

    private native void handleServiceUnavailable(long j);

    private native void handleStateChanged(long j, int i, int i2);

    private native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    private native void handleTrackingStatusEvent(long j, int i, long j2, int i2);

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: a */
    public final synchronized void mo5197a(ogj ogjVar) {
        if (!this.f8469b) {
            m5206j(ogjVar);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: b */
    public final synchronized void mo5198b(ogi ogiVar) {
        int i;
        if (this.f8469b) {
            return;
        }
        m5206j(ogiVar);
        int i2 = 0;
        for (int i3 = 0; !this.f8469b && i3 < (i = ogiVar.f45915c); i3++) {
            if (i3 >= i) {
                throw new IndexOutOfBoundsException();
            }
            ogn ognVar = ogiVar.f45916d[i3];
            handlePositionEvent(this.f8468a, ognVar.f45912e, ognVar.f45911d, ognVar.f45946a, ognVar.f45947b, ognVar.f45948c);
        }
        while (!this.f8469b) {
            int i4 = ogiVar.f45920h;
            if (i2 >= i4) {
                if (!ogiVar.f45917e) {
                    break;
                }
                ogf ogfVar = ogiVar.f45918f;
                handleBatteryEvent(this.f8468a, ogfVar.f45912e, ogfVar.f45911d, ogfVar.f45908b, ogfVar.f45907a);
                break;
            }
            if (i2 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            ogr ogrVar = ogiVar.f45921i[i2];
            handleTrackingStatusEvent(this.f8468a, ogrVar.f45912e, ogrVar.f45911d, ogrVar.f45957a);
            i2++;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: c */
    public final synchronized void mo5199c(ogm ogmVar) {
        if (!this.f8469b) {
            handleControllerRecentered(this.f8468a, ogmVar.f45912e, ogmVar.f45911d, ogmVar.f45942a, ogmVar.f45943b, ogmVar.f45944c, ogmVar.f45945f);
        }
    }

    public synchronized void close() {
        this.f8469b = true;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: d */
    public final synchronized void mo5200d(int i, int i2) {
        if (!this.f8469b) {
            handleStateChanged(this.f8468a, i, i2);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: e */
    public final synchronized void mo5201e() {
        if (!this.f8469b) {
            handleServiceDisconnected(this.f8468a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: f */
    public final synchronized void mo5202f() {
        if (!this.f8469b) {
            handleServiceFailed(this.f8468a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: g */
    public final synchronized void mo5203g(int i) {
        if (!this.f8469b) {
            handleServiceInitFailed(this.f8468a, i);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: h */
    public final synchronized void mo5204h() {
        if (!this.f8469b) {
            handleServiceUnavailable(this.f8468a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5205i() {
        if (!this.f8469b) {
            handleServiceConnected(this.f8468a, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m5206j(ogj ogjVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            if (this.f8469b) {
                i = 0;
                break;
            }
            int i7 = ogjVar.f45924l;
            if (i6 >= i7) {
                i = 0;
                break;
            } else {
                if (i6 >= i7) {
                    throw new IndexOutOfBoundsException();
                }
                oge ogeVar = ogjVar.f45925m[i6];
                handleAccelEvent(this.f8468a, ogeVar.f45912e, ogeVar.f45911d, ogeVar.f45904a, ogeVar.f45905b, ogeVar.f45906c);
                i6++;
            }
        }
        while (true) {
            if (this.f8469b) {
                i2 = 0;
                break;
            }
            int i8 = ogjVar.f45926n;
            if (i >= i8) {
                i2 = 0;
                break;
            } else {
                if (i >= i8) {
                    throw new IndexOutOfBoundsException();
                }
                ogg oggVar = ogjVar.f45927o[i];
                handleButtonEvent(this.f8468a, oggVar.f45912e, oggVar.f45911d, oggVar.f45909a, oggVar.f45910b);
                i++;
            }
        }
        while (true) {
            if (this.f8469b) {
                i3 = 0;
                break;
            }
            int i9 = ogjVar.f45928p;
            if (i2 >= i9) {
                i3 = 0;
                break;
            } else {
                if (i2 >= i9) {
                    throw new IndexOutOfBoundsException();
                }
                ogk ogkVar = ogjVar.f45929q[i2];
                handleGyroEvent(this.f8468a, ogkVar.f45912e, ogkVar.f45911d, ogkVar.f45934a, ogkVar.f45935b, ogkVar.f45936c);
                i2++;
            }
        }
        while (!this.f8469b && i3 < (i5 = ogjVar.f45930r)) {
            if (i3 >= i5) {
                throw new IndexOutOfBoundsException();
            }
            ogm ogmVar = ogjVar.f45931s[i3];
            handleOrientationEvent(this.f8468a, ogmVar.f45912e, ogmVar.f45911d, ogmVar.f45942a, ogmVar.f45943b, ogmVar.f45944c, ogmVar.f45945f);
            i3++;
        }
        for (int i10 = 0; !this.f8469b && i10 < (i4 = ogjVar.f45932t); i10++) {
            if (i10 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            ogq ogqVar = ogjVar.f45933u[i10];
            handleTouchEvent(this.f8468a, ogqVar.f45912e, ogqVar.f45911d, ogqVar.f45954b, ogqVar.f45955c, ogqVar.f45956f);
        }
    }
}
