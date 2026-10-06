package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.TimingSession;
import java.util.ArrayList;
import java.util.List;
import p000.jzn;
import p000.kpp;
import p000.nje;
import p000.nxl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ViewfinderJankSession implements TimingSession {

    /* JADX INFO: renamed from: a */
    public final Object f6952a = new Object();

    /* JADX INFO: renamed from: b */
    public final List f6953b = new ArrayList(30);

    /* JADX INFO: renamed from: c */
    public final List f6954c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f6955d = 0;

    /* JADX INFO: renamed from: e */
    public int f6956e = 0;

    /* JADX INFO: renamed from: f */
    public int f6957f = 0;

    /* JADX INFO: renamed from: g */
    public int f6958g = 0;

    /* JADX INFO: renamed from: h */
    private nje f6959h;

    /* JADX INFO: renamed from: i */
    private Runnable f6960i;

    /* JADX INFO: renamed from: c */
    public static final nje m4301c(kpp kppVar, double d, double d2) {
        nxl nxlVarM18137O = nje.f42891i.m18137O();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nje njeVar = (nje) nxlVarM18137O.f44974b;
        njeVar.f42893a |= 1;
        njeVar.f42894b = jElapsedRealtimeNanos;
        long jB = kppVar.mo9515b();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nje njeVar2 = (nje) nxlVarM18137O.f44974b;
        njeVar2.f42893a |= 4;
        njeVar2.f42896d = jB;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        Long l3 = (Long) kppVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            long jLongValue = l.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nje njeVar3 = (nje) nxlVarM18137O.f44974b;
            njeVar3.f42893a |= 2;
            njeVar3.f42895c = jLongValue;
        }
        if (l2 != null) {
            int iM13808K = jzn.m13808K(l2.longValue());
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nje njeVar4 = (nje) nxlVarM18137O.f44974b;
            njeVar4.f42893a |= 8;
            njeVar4.f42897e = iM13808K;
        }
        if (l3 != null) {
            int iM13808K2 = jzn.m13808K(l3.longValue());
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nje njeVar5 = (nje) nxlVarM18137O.f44974b;
            njeVar5.f42893a |= 16;
            njeVar5.f42898f = iM13808K2;
        }
        if (d > 0.0d) {
            int iM13807J = jzn.m13807J(d);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nje njeVar6 = (nje) nxlVarM18137O.f44974b;
            njeVar6.f42893a |= 64;
            njeVar6.f42900h = iM13807J;
        }
        if (d2 > 0.0d) {
            int iM13807J2 = jzn.m13807J(d2);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nje njeVar7 = (nje) nxlVarM18137O.f44974b;
            njeVar7.f42893a |= 32;
            njeVar7.f42899g = iM13807J2;
        }
        return (nje) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: a */
    public final void m4302a(nje njeVar) {
        if (this.f6959h == null) {
            this.f6959h = njeVar;
        }
    }

    @Override // com.google.android.apps.camera.stats.timing.TimingSession
    /* JADX INFO: renamed from: b */
    public final void mo4303b(Runnable runnable) {
        this.f6960i = runnable;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = this.f6960i;
        if (runnable != null) {
            runnable.run();
        }
    }

    public int getDelay150PctCount() {
        return this.f6957f;
    }

    public int getDelay500PctCount() {
        return this.f6958g;
    }

    public int getDelay50PctCount() {
        return this.f6956e;
    }
}
