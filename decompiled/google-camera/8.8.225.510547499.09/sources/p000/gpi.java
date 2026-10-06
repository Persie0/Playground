package p000;

import android.hardware.HardwareBuffer;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.PortraitOutputs;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.StringRawReadViewMap;
import com.google.googlex.gcam.base.function.LongConsumer;
import com.google.googlex.gcam.base.function.LongFloatConsumer;
import com.google.googlex.gcam.base.function.LongStringConsumer;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitImageCallback;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOpaqueHandleCallback;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitProcessorInterface;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class gpi implements fxp {

    /* JADX INFO: renamed from: a */
    public nsk f25938a;

    /* JADX INFO: renamed from: b */
    public DynamicDepthResult f25939b = null;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f25940c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f25941d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ PortraitRequest f25942e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ RawReadView f25943f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ ShotMetadata f25944g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ RawReadView f25945h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ ShotMetadata f25946i;

    /* JADX INFO: renamed from: j */
    final /* synthetic */ InterleavedImageU16 f25947j;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ InterleavedImageU8 f25948k;

    /* JADX INFO: renamed from: l */
    final /* synthetic */ gpl f25949l;

    /* JADX INFO: renamed from: m */
    final /* synthetic */ ehn f25950m;

    public gpi(gpl gplVar, long j, ehn ehnVar, boolean z, PortraitRequest portraitRequest, RawReadView rawReadView, ShotMetadata shotMetadata, RawReadView rawReadView2, ShotMetadata shotMetadata2, InterleavedImageU16 interleavedImageU16, InterleavedImageU8 interleavedImageU8) {
        this.f25949l = gplVar;
        this.f25940c = j;
        this.f25950m = ehnVar;
        this.f25941d = z;
        this.f25942e = portraitRequest;
        this.f25943f = rawReadView;
        this.f25944g = shotMetadata;
        this.f25945h = rawReadView2;
        this.f25946i = shotMetadata2;
        this.f25947j = interleavedImageU16;
        this.f25948k = interleavedImageU8;
    }

    /* JADX INFO: renamed from: d */
    public static final PortraitOpaqueHandleCallback m9599d(final gpj gpjVar) {
        return new PortraitOpaqueHandleCallback() { // from class: goz
            @Override // com.google.googlex.gcam.creativecamera.portraitmode.PortraitOpaqueHandleCallback
            public final void onImage(long j, Object obj, int i, String str, String str2, String str3) {
                gpj gpjVar2 = gpjVar;
                lku.m15669w(obj instanceof HardwareBuffer);
                gpjVar2.mo9598a(j, ihk.m11331j((HardwareBuffer) obj), nrx.m17636a(i), str2, str3);
            }
        };
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: a */
    public final nps mo6600a() {
        final nqf nqfVarM17621g = nqf.m17621g();
        final nqf nqfVarM17621g2 = nqf.m17621g();
        nbh nbhVar = gpl.f25955a;
        Executor executor = this.f25949l.f25959e;
        final ehn ehnVar = this.f25950m;
        final boolean z = this.f25941d;
        final PortraitRequest portraitRequest = this.f25942e;
        final RawReadView rawReadView = this.f25943f;
        final ShotMetadata shotMetadata = this.f25944g;
        final RawReadView rawReadView2 = this.f25945h;
        final ShotMetadata shotMetadata2 = this.f25946i;
        final InterleavedImageU16 interleavedImageU16 = this.f25947j;
        final InterleavedImageU8 interleavedImageU8 = this.f25948k;
        final long j = this.f25940c;
        executor.execute(new Runnable() { // from class: gpa
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                final gpi gpiVar = this.f25910a;
                final nqf nqfVar = nqfVarM17621g;
                final ehn ehnVar2 = ehnVar;
                final boolean z2 = z;
                final nqf nqfVar2 = nqfVarM17621g2;
                PortraitRequest portraitRequest2 = portraitRequest;
                RawReadView rawReadView3 = rawReadView;
                ShotMetadata shotMetadata3 = shotMetadata;
                RawReadView rawReadView4 = rawReadView2;
                ShotMetadata shotMetadata4 = shotMetadata2;
                InterleavedImageU16 interleavedImageU17 = interleavedImageU16;
                InterleavedImageU8 interleavedImageU9 = interleavedImageU8;
                long j2 = j;
                synchronized (gpiVar.f25949l.f25962h) {
                    if (!gpiVar.f25949l.f25965k) {
                        nqfVar.mo8566a(new kec(hIAHJKEnGsNbz.dHVujd));
                        return;
                    }
                    try {
                        try {
                            synchronized (gpiVar.f25949l.f25961g) {
                                try {
                                    LongFloatConsumer longFloatConsumer = new LongFloatConsumer() { // from class: gpc
                                        @Override // com.google.googlex.gcam.base.function.LongFloatConsumer
                                        public final void accept(long j3, float f) {
                                            ehn ehnVar3 = ehnVar2;
                                            nbh nbhVar2 = gpl.f25955a;
                                            if (ehnVar3 != null) {
                                                boolean z3 = false;
                                                if (f >= 0.0f && f <= 1.0f) {
                                                    z3 = true;
                                                }
                                                lku.m15669w(z3);
                                                if (f == 0.0f) {
                                                    ehnVar3.f14055d.f14065b = System.currentTimeMillis();
                                                }
                                                ehnVar3.f14052a.mo9016a(edx.f13532a, f);
                                            }
                                        }
                                    };
                                    LongStringConsumer longStringConsumer = new LongStringConsumer() { // from class: gpd
                                        @Override // com.google.googlex.gcam.base.function.LongStringConsumer
                                        public final void accept(long j3, String str) {
                                            nlh nlhVar;
                                            ehn ehnVar3 = ehnVar2;
                                            try {
                                                byte[] bArrDecode = Base64.decode(str, 0);
                                                nxq nxqVarM18123Q = nxq.m18123Q(nlh.f43516a, bArrDecode, 0, bArrDecode.length, nxf.m18011a());
                                                nxq.m18132ae(nxqVarM18123Q);
                                                nlhVar = (nlh) nxqVarM18123Q;
                                            } catch (nyb e) {
                                                ((nbe) ((nbe) ((nbe) gpl.f25955a.m17252c()).mo17283h(e)).mo17276G(3139)).mo17293r("Error deserializing native portrait logs: %s", e);
                                                nlhVar = nlh.f43516a;
                                            }
                                            nxl nxlVar = ehnVar3.f14055d.f14069f;
                                            if (!nxlVar.f44974b.m18142ac()) {
                                                nxlVar.mo18106p();
                                            }
                                            nlg nlgVar = (nlg) nxlVar.f44974b;
                                            nlg nlgVar2 = nlg.f43509f;
                                            nlhVar.getClass();
                                            nlgVar.f43515e = nlhVar;
                                            nlgVar.f43511a |= 8;
                                        }
                                    };
                                    LongConsumer longConsumer = new LongConsumer() { // from class: gpe
                                        @Override // com.google.googlex.gcam.base.function.LongConsumer
                                        public final void accept(long j3) {
                                            nqf nqfVar3 = nqfVar;
                                            ehn ehnVar3 = ehnVar2;
                                            nbh nbhVar2 = gpl.f25955a;
                                            nqfVar3.mo14894e(true);
                                            if (ehnVar3 != null) {
                                                nxl nxlVar = ehnVar3.f14055d.f14069f;
                                                long jCurrentTimeMillis = System.currentTimeMillis() - ehnVar3.f14055d.f14065b;
                                                if (!nxlVar.f44974b.m18142ac()) {
                                                    nxlVar.mo18106p();
                                                }
                                                int i = (int) jCurrentTimeMillis;
                                                nlg nlgVar = (nlg) nxlVar.f44974b;
                                                nlg nlgVar2 = nlg.f43509f;
                                                nlgVar.f43511a |= 2;
                                                nlgVar.f43513c = i;
                                                ehnVar3.f14055d.f14083t = true;
                                                ehnVar3.f14055d.m7329f(j3, mqu.f41450a);
                                            }
                                        }
                                    };
                                    gpj gpjVar = new gpj() { // from class: gpf
                                        @Override // p000.gpj
                                        /* JADX INFO: renamed from: a */
                                        public final void mo9598a(long j3, ihk ihkVar, nrx nrxVar, String str, String str2) {
                                            boolean z3 = z2;
                                            nqf nqfVar3 = nqfVar2;
                                            ehn ehnVar3 = ehnVar2;
                                            nbh nbhVar2 = gpl.f25955a;
                                            lku.m15669w(ntw.m17724j(nrxVar));
                                            if (z3) {
                                                nqfVar3.mo14894e(new gpk(ihkVar, str, str2, j3, null, null));
                                            } else if (ehnVar3 != null) {
                                                ehnVar3.f14055d.m7330h(j3, ihkVar, enc.m7549e(gpl.m9602b(str), gpl.m9602b(str2), mqu.f41450a), 0, eez.ORIGINAL, ehnVar3.f14055d.f14070g.m13114x(), mqu.f41450a);
                                            }
                                        }
                                    };
                                    gpj gpjVar2 = new gpj() { // from class: gpg
                                        @Override // p000.gpj
                                        /* JADX INFO: renamed from: a */
                                        public final void mo9598a(long j3, ihk ihkVar, nrx nrxVar, String str, String str2) {
                                            gpk gpkVar;
                                            long j4;
                                            ihk ihkVar2;
                                            boolean z3;
                                            gpi gpiVar2 = gpiVar;
                                            ehn ehnVar3 = ehnVar2;
                                            boolean z4 = z2;
                                            nqf nqfVar3 = nqfVar2;
                                            lku.m15669w(ntw.m17724j(nrxVar));
                                            nbh nbhVar2 = gpl.f25955a;
                                            if (ehnVar3 != null) {
                                                if (z4) {
                                                    try {
                                                        gpkVar = (gpk) nqfVar3.get();
                                                    } catch (InterruptedException e) {
                                                        gpkVar = null;
                                                    } catch (ExecutionException e2) {
                                                        gpkVar = null;
                                                    }
                                                } else {
                                                    gpkVar = null;
                                                }
                                                if (gpl.m9603f(ihkVar)) {
                                                    DynamicDepthResult dynamicDepthResult = gpiVar2.f25939b;
                                                    if (dynamicDepthResult != null) {
                                                        dynamicDepthResult.close();
                                                        gpiVar2.f25939b = null;
                                                    }
                                                    if (gpkVar != null) {
                                                        ihkVar2 = gpkVar.f25952b;
                                                        j4 = gpkVar.f25951a;
                                                        z3 = true;
                                                    } else {
                                                        j4 = j3;
                                                        ihkVar2 = ihkVar;
                                                        z3 = false;
                                                    }
                                                } else {
                                                    if (gpkVar != null) {
                                                        ihk ihkVar3 = gpkVar.f25952b;
                                                        mrm mrmVar = (mrm) ihkVar3.f30967b;
                                                        boolean zMo16813g = mrmVar.mo16813g();
                                                        Object obj = ihkVar3.f30966a;
                                                        if (zMo16813g) {
                                                            ((InterleavedImageU8) mrmVar.mo16809c()).m5007g();
                                                        }
                                                        mrm mrmVar2 = (mrm) obj;
                                                        if (mrmVar2.mo16813g()) {
                                                            ((HardwareBuffer) mrmVar2.mo16809c()).close();
                                                        }
                                                    }
                                                    j4 = j3;
                                                    ihkVar2 = ihkVar;
                                                    z3 = false;
                                                }
                                                gpv gpvVarM7549e = enc.m7549e(gpl.m9602b(str), gpl.m9602b(str2), mrm.m16828h(gpiVar2.f25939b));
                                                hcu hcuVarM13114x = ehnVar3.f14055d.f14070g.m13114x();
                                                mrm mrmVar3 = (mrm) ihkVar2.f30967b;
                                                boolean z5 = mrmVar3.mo16813g() && ((InterleavedImageU8) mrmVar3.mo16809c()).m5004c() > 0 && ((InterleavedImageU8) ((mrm) ihkVar2.f30967b).mo16809c()).m5003b() > 0;
                                                mrm mrmVar4 = (mrm) ihkVar2.f30966a;
                                                boolean z6 = mrmVar4.mo16813g() && ((HardwareBuffer) mrmVar4.mo16809c()).getWidth() > 0 && ((HardwareBuffer) ((mrm) ihkVar2.f30966a).mo16809c()).getHeight() > 0;
                                                if (!z5 && !z6) {
                                                    nbh nbhVar3 = ehr.f14086b;
                                                    ehq ehqVar = ehnVar3.f14055d;
                                                    hcuVarM13114x.close();
                                                    ehqVar.m7329f(j4, mqu.f41450a);
                                                    return;
                                                }
                                                if (z3) {
                                                    nbh nbhVar4 = ehr.f14086b;
                                                    ehnVar3.f14053b.mo9913s();
                                                    gyj gyjVarMo9900f = ehnVar3.f14053b.mo9900f();
                                                    Uri uriMo14682b = gyjVarMo9900f.f26832a.mo14682b();
                                                    if (uriMo14682b != null && !uriMo14682b.equals(Uri.EMPTY)) {
                                                        try {
                                                            String lastPathSegment = uriMo14682b.getLastPathSegment();
                                                            lastPathSegment.getClass();
                                                            ehnVar3.f14055d.f14068e.f14093i.mo6973b(Long.parseLong(lastPathSegment), dzk.NONE);
                                                        } catch (NumberFormatException e3) {
                                                            ((nbe) ((nbe) ((nbe) ehr.f14086b.m17251b()).mo17283h(e3)).mo17276G((char) 1459)).mo17293r("Failed to parse media store id from %s", uriMo14682b);
                                                        }
                                                    }
                                                    gyjVarMo9900f.f26834c = dzk.NONE;
                                                    gyjVarMo9900f.f26832a.mo14688h("ORIGINAL");
                                                } else {
                                                    nbh nbhVar5 = ehr.f14086b;
                                                }
                                                ehnVar3.f14055d.m7330h(j4, ihkVar2, gpvVarM7549e, 100, eez.PRIMARY, hcuVarM13114x, ehnVar3.f14054c);
                                            }
                                        }
                                    };
                                    gpiVar.f25938a = new nsk();
                                    PortraitOutputs portraitOutputs = new PortraitOutputs();
                                    gpiVar.f25949l.f25964j.setProgressCallback(portraitOutputs.f8336a, longFloatConsumer);
                                    gpiVar.f25949l.f25964j.setUpsampledInputImageCallback(portraitOutputs.f8336a, gpiVar.m9600c(gpjVar));
                                    if (portraitRequest2.m5080e()) {
                                        gpiVar.f25949l.f25964j.setUpsampledInputHardwareBufferCallback(portraitOutputs.f8336a, gpi.m9599d(gpjVar));
                                    }
                                    gpiVar.f25949l.f25964j.setImageCallback(portraitOutputs.f8336a, gpiVar.m9600c(gpjVar2));
                                    if (portraitRequest2.m5080e()) {
                                        gpiVar.f25949l.f25964j.setHardwareBufferCallback(portraitOutputs.f8336a, gpi.m9599d(gpjVar2));
                                    }
                                    gpiVar.f25949l.f25964j.setLogCallback(portraitOutputs.f8336a, longStringConsumer);
                                    gpiVar.f25949l.f25964j.setCompleteCallback(portraitOutputs.f8336a, longConsumer);
                                    gpiVar.f25949l.f25964j.setRgbAllocator(portraitOutputs.f8336a, gpiVar.f25938a);
                                    final int i = 1;
                                    if (gpiVar.f25949l.f25960f.mo6184l(dio.f11671m)) {
                                        gpj gpjVar3 = new gpj() { // from class: gph
                                            @Override // p000.gpj
                                            /* JADX INFO: renamed from: a */
                                            public final void mo9598a(long j3, ihk ihkVar, nrx nrxVar, String str, String str2) {
                                                switch (i) {
                                                    case 0:
                                                        ehn ehnVar3 = ehnVar2;
                                                        nbh nbhVar2 = gpl.f25955a;
                                                        lku.m15669w(ntw.m17724j(nrxVar));
                                                        if (ehnVar3 != null) {
                                                            gpv gpvVarM9601a = gpl.m9601a(str, str2);
                                                            hcu hcuVarM13114x = ehnVar3.f14055d.f14070g.m13114x();
                                                            ehq ehqVar = ehnVar3.f14055d;
                                                            int i2 = ehqVar.f14067d;
                                                            ehqVar.f14067d = i2 + 1;
                                                            ehqVar.m7330h(j3, ihkVar, gpvVarM9601a, i2, eez.DEBUG, hcuVarM13114x, mqu.f41450a);
                                                        }
                                                        break;
                                                    default:
                                                        ehn ehnVar4 = ehnVar2;
                                                        nbh nbhVar3 = gpl.f25955a;
                                                        lku.m15669w(ntw.m17724j(nrxVar));
                                                        if (ehnVar4 != null && !gpl.m9603f(ihkVar)) {
                                                            gpv gpvVarM9601a2 = gpl.m9601a(str, str2);
                                                            hcu hcuVarM13114x2 = ehnVar4.f14055d.f14070g.m13114x();
                                                            ehq ehqVar2 = ehnVar4.f14055d;
                                                            int i3 = ehqVar2.f14067d;
                                                            ehqVar2.f14067d = i3 + 1;
                                                            ehqVar2.m7330h(j3, ihkVar, gpvVarM9601a2, i3, eez.SECONDARY, hcuVarM13114x2, mqu.f41450a);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        gpiVar.f25949l.f25964j.setSecondaryImageCallback(portraitOutputs.f8336a, gpiVar.m9600c(gpjVar3));
                                        if (portraitRequest2.m5080e()) {
                                            gpiVar.f25949l.f25964j.setSecondaryHardwareBufferCallback(portraitOutputs.f8336a, gpi.m9599d(gpjVar3));
                                        }
                                    }
                                    final int i2 = 0;
                                    if (gpiVar.f25949l.f25960f.mo6184l(dio.f11669k)) {
                                        gpj gpjVar4 = new gpj() { // from class: gph
                                            @Override // p000.gpj
                                            /* JADX INFO: renamed from: a */
                                            public final void mo9598a(long j3, ihk ihkVar, nrx nrxVar, String str, String str2) {
                                                switch (i2) {
                                                    case 0:
                                                        ehn ehnVar3 = ehnVar2;
                                                        nbh nbhVar2 = gpl.f25955a;
                                                        lku.m15669w(ntw.m17724j(nrxVar));
                                                        if (ehnVar3 != null) {
                                                            gpv gpvVarM9601a = gpl.m9601a(str, str2);
                                                            hcu hcuVarM13114x = ehnVar3.f14055d.f14070g.m13114x();
                                                            ehq ehqVar = ehnVar3.f14055d;
                                                            int i3 = ehqVar.f14067d;
                                                            ehqVar.f14067d = i3 + 1;
                                                            ehqVar.m7330h(j3, ihkVar, gpvVarM9601a, i3, eez.DEBUG, hcuVarM13114x, mqu.f41450a);
                                                        }
                                                        break;
                                                    default:
                                                        ehn ehnVar4 = ehnVar2;
                                                        nbh nbhVar3 = gpl.f25955a;
                                                        lku.m15669w(ntw.m17724j(nrxVar));
                                                        if (ehnVar4 != null && !gpl.m9603f(ihkVar)) {
                                                            gpv gpvVarM9601a2 = gpl.m9601a(str, str2);
                                                            hcu hcuVarM13114x2 = ehnVar4.f14055d.f14070g.m13114x();
                                                            ehq ehqVar2 = ehnVar4.f14055d;
                                                            int i4 = ehqVar2.f14067d;
                                                            ehqVar2.f14067d = i4 + 1;
                                                            ehqVar2.m7330h(j3, ihkVar, gpvVarM9601a2, i4, eez.SECONDARY, hcuVarM13114x2, mqu.f41450a);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        gpiVar.f25949l.f25964j.setDebugRgbAllocator(portraitOutputs.f8336a, gpiVar.f25938a);
                                        gpiVar.f25949l.f25964j.setDebugImageCallback(portraitOutputs.f8336a, gpiVar.m9600c(gpjVar4));
                                        if (portraitRequest2.m5080e()) {
                                            gpiVar.f25949l.f25964j.setDebugHardwareBufferCallback(portraitOutputs.f8336a, gpi.m9599d(gpjVar4));
                                        }
                                    }
                                    StringRawReadViewMap stringRawReadViewMap = new StringRawReadViewMap();
                                    if (rawReadView3 != null && !rawReadView3.m5091b() && shotMetadata3 != null) {
                                        stringRawReadViewMap.m5131b(gpl.f25956b, rawReadView3);
                                        ehl.m7326a(gpl.f25956b, portraitRequest2, shotMetadata3);
                                    }
                                    if (rawReadView4 != null && !rawReadView4.m5091b() && shotMetadata4 != null) {
                                        String str = gpiVar.f25949l.f25960f.mo6184l(dib.f11273ag) ? gpl.f25958d : gpl.f25957c;
                                        stringRawReadViewMap.m5131b(str, rawReadView4);
                                        ehl.m7326a(str, portraitRequest2, shotMetadata4);
                                    }
                                    InterleavedReadViewU16 interleavedReadViewU16 = new InterleavedReadViewU16(GcamModuleJNI.InterleavedImageU16_read_view(interleavedImageU17.f8294a, interleavedImageU17));
                                    nry nryVar = new nry(GcamModuleJNI.new_PortraitDepthArguments(interleavedReadViewU16.f8298a, interleavedReadViewU16, stringRawReadViewMap.f8371a, stringRawReadViewMap));
                                    if (gpiVar.f25949l.f25960f.mo6184l(dio.f11647D)) {
                                        gpiVar.f25939b = new DynamicDepthResult(interleavedImageU9.m5004c(), interleavedImageU9.m5003b(), portraitRequest2.m5079d());
                                        GcamModuleJNI.PortraitOutputs_dynamic_depth_result_ptr_set(portraitOutputs.f8336a, portraitOutputs, gpiVar.f25939b.f6629a);
                                    }
                                    gpx gpxVar = gpiVar.f25949l.f25966l;
                                    long jMo9617a = gpxVar != null ? gpxVar.mo9617a() : 0L;
                                    gpw gpwVar = gpiVar.f25949l.f25967m;
                                    PortraitProcessorInterface portraitProcessorInterface = new PortraitProcessorInterface(jMo9617a, gpwVar != null ? gpwVar.mo9611a() : 0L, gpiVar.f25949l.f25960f.mo6184l(dio.f11655L));
                                    try {
                                        ktz ktzVar = new ktz(portraitOutputs, interleavedImageU9, nryVar, portraitRequest2);
                                        HashMap map = gpiVar.f25949l.f25963i;
                                        Long lValueOf = Long.valueOf(j2);
                                        map.put(lValueOf, ktzVar);
                                        long j3 = ((PortraitOutputs) ktzVar.f37200c).f8336a;
                                        long jM5001d = InterleavedImageU8.m5001d((InterleavedImageU8) ktzVar.f37201d);
                                        long j4 = ((nry) ktzVar.f37198a).f44323a;
                                        Object obj = ktzVar.f37199b;
                                        portraitProcessorInterface.processImpl(portraitProcessorInterface.f8397a, j2, j3, jM5001d, j4, 0L, obj == null ? 0L : ((PortraitRequest) obj).f8338a, gpiVar.f25949l.f25960f.mo6184l(dio.f11653J));
                                        gpiVar.f25949l.f25963i.remove(lValueOf);
                                        portraitProcessorInterface.close();
                                        return;
                                    } catch (Throwable th) {
                                        try {
                                            portraitProcessorInterface.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                throw th;
                                            } catch (Exception e) {
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            throw th;
                        } catch (Exception e2) {
                            e = e2;
                            ((nbe) ((nbe) ((nbe) gpl.f25955a.m17251b()).mo17283h(e)).mo17276G((char) 3146)).mo17290o("Error processing the input image:");
                            nqfVar.mo8566a(e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        nqfVar = nqfVar;
                    }
                }
            }
        });
        return nqfVarM17621g;
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: b */
    public final nps mo6601b() {
        return kxk.m14965K(false);
    }

    /* JADX INFO: renamed from: c */
    public final PortraitImageCallback m9600c(final gpj gpjVar) {
        return new PortraitImageCallback() { // from class: gpb
            @Override // com.google.googlex.gcam.creativecamera.portraitmode.PortraitImageCallback
            public final void onImage(long j, long j2, int i, String str, String str2, String str3) {
                gpjVar.mo9598a(j, ihk.m11330i((InterleavedImageU8) this.f25923a.f25938a.m17645a(j2).mo16809c()), nrx.m17636a(i), str2, str3);
            }
        };
    }
}
