package p000;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import android.util.Range;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PhysicalStabilityThresholds;
import com.google.googlex.gcam.PostShutterAfParams;
import com.google.googlex.gcam.ViewfinderResults;
import java.util.concurrent.Executor;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dtb implements kfb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12541a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12542b;

    public /* synthetic */ dtb(clh clhVar, int i) {
        this.f12542b = i;
        this.f12541a = clhVar;
    }

    public /* synthetic */ dtb(dtc dtcVar, int i) {
        this.f12542b = i;
        this.f12541a = dtcVar;
    }

    public dtb(epf epfVar, int i) {
        this.f12542b = i;
        this.f12541a = epfVar;
    }

    public /* synthetic */ dtb(gjv gjvVar, int i) {
        this.f12542b = i;
        this.f12541a = gjvVar;
    }

    public /* synthetic */ dtb(glf glfVar, int i) {
        this.f12542b = i;
        this.f12541a = glfVar;
    }

    public /* synthetic */ dtb(glj gljVar, int i) {
        this.f12542b = i;
        this.f12541a = gljVar;
    }

    public /* synthetic */ dtb(hpg hpgVar, int i) {
        this.f12542b = i;
        this.f12541a = hpgVar;
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        Executor executor;
        mws mwsVarM17095j;
        int i = 0;
        switch (this.f12542b) {
            case 0:
                Object obj = this.f12541a;
                key keyVarM14357a = kiqVar.m14357a();
                if (keyVarM14357a != null) {
                    dtc dtcVar = (dtc) obj;
                    new jvw(dtcVar.f12546d, new drs(keyVarM14357a, 5), not.INSTANCE, 1).execute(new dgq(dtcVar, keyVarM14357a, 8));
                    return;
                }
                return;
            case 1:
                kfv.m14174w(kiqVar, new clf((clh) this.f12541a, i));
                return;
            case 2:
                Object obj2 = this.f12541a;
                if (((epf) obj2).f14967g) {
                    ((nbe) ((nbe) epf.f14961a.m17252c()).mo17276G((char) 1694)).mo17290o("Already closed, cannot process analysis frame.");
                    return;
                }
                synchronized (obj2) {
                    Object obj3 = this.f12541a;
                    if (((epf) obj3).f14966f == null) {
                        ((epf) obj3).m7618f(kiqVar, false);
                    }
                    break;
                }
                return;
            case 3:
                Object obj4 = this.f12541a;
                if (kiqVar.m14358b() == null) {
                    return;
                }
                final gjv gjvVar = (gjv) obj4;
                kfv.m14174w(kiqVar, new kfu() { // from class: gju
                    @Override // p000.kfu
                    /* JADX INFO: renamed from: a */
                    public final void mo3915a(key keyVar) {
                        boolean zM9787c;
                        Duration durationOfMillis;
                        gjv gjvVar2 = gjvVar;
                        try {
                            kpp kppVarMo7042c = keyVar.mo7042c();
                            if (kppVarMo7042c == null) {
                                gjvVar2.f25142d.mo13942d("Error retrieving metadata, ignoring frame");
                            } else {
                                try {
                                    String strE = (String) kppVarMo7042c.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                                    if (strE == null || strE.isEmpty()) {
                                        strE = kppVarMo7042c.mo9518e();
                                    }
                                    ecq ecqVar = gjvVar2.f25145g;
                                    strE.getClass();
                                    int iMo7136c = ecqVar.mo7136c(kppVarMo7042c, kmg.m14575b(strE));
                                    if (gjvVar2.f25151m.f13306h) {
                                        if (gjvVar2.f25144f.m7103n()) {
                                            gjvVar2.f25142d.mo13940b("Ignoring viewfinder updates to capture time since viewfinder processing is locked");
                                        } else {
                                            ViewfinderResults viewfinderResultsMo7146m = gjvVar2.f25145g.mo7146m(iMo7136c);
                                            PostShutterAfParams postShutterAfParamsMo7144k = gjvVar2.f25145g.mo7144k(iMo7136c);
                                            float fViewfinderResults_total_capture_time_ms_get = GcamModuleJNI.ViewfinderResults_total_capture_time_ms_get(viewfinderResultsMo7146m.f8381a, viewfinderResultsMo7146m);
                                            if (fViewfinderResults_total_capture_time_ms_get < 0.0f) {
                                                durationOfMillis = Duration.ofMillis(-1L);
                                            } else {
                                                float fPostShutterAfParams_max_handheld_exposure_time_ms_get = GcamModuleJNI.PostShutterAfParams_max_handheld_exposure_time_ms_get(postShutterAfParamsMo7144k.f8340a, postShutterAfParamsMo7144k);
                                                durationOfMillis = Duration.ofMillis((long) (fViewfinderResults_total_capture_time_ms_get < 1000.0f ? fViewfinderResults_total_capture_time_ms_get + fPostShutterAfParams_max_handheld_exposure_time_ms_get : fViewfinderResults_total_capture_time_ms_get + (Math.max((2000.0f - fViewfinderResults_total_capture_time_ms_get) / 1000.0f, 0.0f) * fPostShutterAfParams_max_handheld_exposure_time_ms_get)));
                                            }
                                            if (!durationOfMillis.isNegative() && !durationOfMillis.isZero()) {
                                                gjvVar2.f25150l.mo3415bf(durationOfMillis);
                                            }
                                        }
                                    }
                                    if (gjvVar2.f25147i || gjvVar2.f25149k.equals(ikw.PHOTO)) {
                                        gjvVar2.f25148j.mo13961e("StabilityProcessing");
                                        float fM5061a = gjvVar2.f25145g.mo7143j(iMo7136c).m5059a().m5061a();
                                        PhysicalStabilityThresholds physicalStabilityThresholdsM5059a = gjvVar2.f25145g.mo7143j(iMo7136c).m5059a();
                                        float fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get = GcamModuleJNI.PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(physicalStabilityThresholdsM5059a.f8330a, physicalStabilityThresholdsM5059a) * 1.6f;
                                        if (gjvVar2.f25153o == null && fM5061a < fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get) {
                                            gjvVar2.f25153o = new gvd(new Range(Float.valueOf(fM5061a), Float.valueOf(fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get)), gjv.f25140b, gjv.f25141c);
                                        }
                                        if (gjvVar2.f25154p == null) {
                                            gjvVar2.f25154p = new gvd(new Range(Float.valueOf(0.0f), Float.valueOf(fM5061a)), gjv.f25140b, gjv.f25141c);
                                        }
                                        float fM5138a = gjvVar2.f25145g.mo7146m(iMo7136c).m5138a();
                                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                        gvd gvdVar = gjvVar2.f25153o;
                                        if (gvdVar != null) {
                                            gvdVar.m9785a(fM5138a, jElapsedRealtimeNanos);
                                        }
                                        gvd gvdVar2 = gjvVar2.f25154p;
                                        if (gvdVar2 != null) {
                                            gvdVar2.m9785a(fM5138a, jElapsedRealtimeNanos);
                                        }
                                        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                                        gvd gvdVar3 = gjvVar2.f25154p;
                                        if (gvdVar3 != null) {
                                            zM9787c = gvdVar3.m9787c(jElapsedRealtimeNanos2);
                                        } else {
                                            float fM5138a2 = gjvVar2.f25145g.mo7146m(iMo7136c).m5138a();
                                            zM9787c = fM5138a2 >= 0.0f && fM5138a2 <= gjvVar2.f25145g.mo7143j(iMo7136c).m5059a().m5061a();
                                        }
                                        gvd gvdVar4 = gjvVar2.f25153o;
                                        boolean zM9787c2 = gvdVar4 != null ? gvdVar4.m9787c(jElapsedRealtimeNanos2) : false;
                                        gjvVar2.f25148j.mo13962f();
                                        gjvVar2.f25152n.mo8225a(zM9787c, zM9787c2, gjvVar2.f25146h.mo14558k(), gjvVar2.f25147i);
                                    }
                                    gjvVar2.f25143e.mo3594a(kppVarMo7042c);
                                    Long l = (Long) kppVarMo7042c.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
                                    l.getClass();
                                    if (l.longValue() > gjv.f25139a.longValue()) {
                                        gjvVar2.f25142d.mo13947i("Frame dropped with ultra long exposure time: " + String.valueOf(kppVarMo7042c.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME)));
                                    }
                                } catch (IllegalArgumentException e) {
                                    gjvVar2.f25148j.mo13962f();
                                    gjvVar2.f25142d.mo13948j("Error getting physical camera ID", e);
                                }
                            }
                            keyVar.close();
                        } catch (Throwable th) {
                            try {
                                keyVar.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception e2) {
                                }
                            }
                            throw th;
                        }
                    }
                });
                return;
            case 4:
                glf glfVar = (glf) this.f12541a;
                if (glfVar.f25472e || (executor = glfVar.f25470c) == null) {
                    return;
                }
                executor.execute(new fro(glfVar, kiqVar, 17));
                return;
            case 5:
                Object obj5 = this.f12541a;
                if (((glj) obj5).f25497g) {
                    return;
                }
                synchronized (obj5) {
                    mwsVarM17095j = mws.m17095j(((glj) obj5).f25493c);
                    break;
                }
                int size = mwsVarM17095j.size();
                while (i < size) {
                    ((kfb) mwsVarM17095j.get(i)).mo3625c(kiqVar);
                    i++;
                }
                return;
            case 6:
                Object obj6 = this.f12541a;
                key keyVarM14357a2 = kiqVar.m14357a();
                if (keyVarM14357a2 != null) {
                    keyVarM14357a2.mo7050k(new hpf((hpg) obj6, keyVarM14357a2));
                    return;
                }
                return;
            default:
                Object obj7 = this.f12541a;
                key keyVarM14357a3 = kiqVar.m14357a();
                if (keyVarM14357a3 != null) {
                    keyVarM14357a3.mo7050k(new hpe((hpg) obj7, keyVarM14357a3));
                    return;
                }
                return;
        }
    }
}
