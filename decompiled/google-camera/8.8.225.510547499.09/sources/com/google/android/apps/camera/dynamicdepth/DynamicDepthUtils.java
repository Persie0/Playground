package com.google.android.apps.camera.dynamicdepth;

import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import java.io.File;
import p000.cik;
import p000.gug;
import p000.kpb;
import p000.kpw;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.nbz;
import p000.nch;
import p000.nsz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DynamicDepthUtils {

    /* JADX INFO: renamed from: a */
    public static final nbh f6630a = nbh.m17259h("com/google/android/apps/camera/dynamicdepth/DynamicDepthUtils");

    /* JADX INFO: renamed from: b */
    private final boolean f6631b;

    /* JADX INFO: renamed from: c */
    private final String f6632c;

    /* JADX INFO: renamed from: d */
    private final String f6633d;

    /* JADX INFO: renamed from: e */
    private boolean f6634e = false;

    /* JADX INFO: renamed from: f */
    private final kpb f6635f;

    public DynamicDepthUtils(boolean z, mrm mrmVar, kpb kpbVar) {
        String absolutePath;
        this.f6631b = z;
        this.f6635f = kpbVar;
        if (z && mrmVar.mo16813g()) {
            String absolutePath2 = ((File) mrmVar.mo16809c()).getAbsolutePath();
            this.f6633d = absolutePath2;
            absolutePath = new File(absolutePath2, "ddc_opencl_cache.bin").getAbsolutePath();
        } else {
            absolutePath = "";
            this.f6633d = "";
        }
        this.f6632c = absolutePath;
    }

    private static native boolean createDynamicDepthFromPdImpl(long j, long j2, long j3, long j4);

    public static native boolean createDynamicDepthFromUltradepthImpl(long j, long j2, long j3, long j4, boolean z, long j5);

    /* JADX INFO: renamed from: d */
    public static byte[] m4095d(byte[] bArr, DynamicDepthResult dynamicDepthResult, gug gugVar) {
        byte[] bArrWriteDynamicDepthIntoJpegStreamImpl = writeDynamicDepthIntoJpegStreamImpl(bArr, dynamicDepthResult.f6629a, gugVar == null ? 0L : gugVar.mo4280a());
        if (bArrWriteDynamicDepthIntoJpegStreamImpl == null) {
            return null;
        }
        nbz nbzVar = nch.f41987a;
        return bArrWriteDynamicDepthIntoJpegStreamImpl;
    }

    private static native void initializePdImpl(boolean z, String str, int i);

    public static native void savePdCacheImpl();

    private static native byte[] writeDynamicDepthIntoJpegStreamImpl(byte[] bArr, long j, long j2);

    /* JADX INFO: renamed from: a */
    public final synchronized Runnable m4096a() {
        cik cikVar;
        if (this.f6634e) {
            cikVar = cik.f5800h;
        } else {
            initializePdImpl(this.f6631b, this.f6632c, (true != this.f6635f.m14669i() ? 2 : 3) - 1);
            this.f6634e = true;
            cikVar = cik.f5799g;
        }
        return cikVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m4097b(kpw kpwVar, kpw kpwVar2, DynamicDepthResult dynamicDepthResult, ShotMetadata shotMetadata) {
        nsz nszVar = new nsz();
        mrm mrmVarM17648a = nszVar.m17648a(kpwVar);
        if (mrmVarM17648a.mo16813g()) {
            return m4098c((RawWriteView) mrmVarM17648a.mo16809c(), nszVar.m17650c(kpwVar2), dynamicDepthResult, shotMetadata);
        }
        ((nbe) ((nbe) f6630a.m17251b().mo17282g(nch.f41987a, "CAM_DynDepthUtils")).mo17276G((char) 1047)).mo17290o("Error converting the PD image.");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m4098c(RawWriteView rawWriteView, YuvWriteView yuvWriteView, DynamicDepthResult dynamicDepthResult, ShotMetadata shotMetadata) {
        boolean zCreateDynamicDepthFromPdImpl;
        Runnable runnableM4096a = m4096a();
        zCreateDynamicDepthFromPdImpl = createDynamicDepthFromPdImpl(RawWriteView.m5092c(rawWriteView), YuvWriteView.m5150c(yuvWriteView), ShotMetadata.m5095a(shotMetadata), dynamicDepthResult.f6629a);
        runnableM4096a.run();
        return zCreateDynamicDepthFromPdImpl;
    }
}
