package com.google.android.libraries.vision.smartcapture;

import android.util.Log;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p000.msb;
import p000.nxf;
import p000.nxq;
import p000.nyb;
import p000.odh;
import p000.odn;
import p000.oed;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FrequentFacesProcessor implements Closeable {

    /* JADX INFO: renamed from: a */
    private final nxf f7971a;

    /* JADX INFO: renamed from: b */
    private long f7972b;

    static {
        try {
            System.loadLibrary("smartcapture_native");
        } catch (UnsatisfiedLinkError e) {
            if (HRLmc.jxjKdNHdHWMg.equals(msb.JAVA_VM_NAME.m16855a())) {
                throw e;
            }
        }
    }

    public FrequentFacesProcessor(oed oedVar) {
        this.f7972b = nativeCreate(oedVar.mo17760J());
        nxf nxfVarM18012b = nxf.m18012b();
        this.f7971a = nxfVarM18012b;
        nxfVarM18012b.m18014d(odn.f45633j);
    }

    private static native void nativeClose(long j);

    private static native byte[] nativeComputeFamiliarFaces(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr);

    private static native long nativeCreate(byte[] bArr);

    /* JADX INFO: renamed from: a */
    public final synchronized odh m4718a(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, odh odhVar) {
        odh odhVar2;
        long j = this.f7972b;
        if (j == 0) {
            Log.w(aJFPpVSaoDO.owlfJAumvGswTY, "Processor is closed");
            return odhVar;
        }
        byte[] bArrNativeComputeFamiliarFaces = nativeComputeFamiliarFaces(j, byteBuffer, i, i2, byteBuffer2, i3, i4, byteBuffer3, i5, i6, i7, i8, odhVar.mo17760J());
        if (bArrNativeComputeFamiliarFaces == null) {
            Log.e("FREQUENT_FACES_PROCESSOR", "output metadata bytes is null");
            return odhVar;
        }
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(odh.f45607m, bArrNativeComputeFamiliarFaces, 0, bArrNativeComputeFamiliarFaces.length, this.f7971a);
            nxq.m18132ae(nxqVarM18123Q);
            odhVar2 = (odh) nxqVarM18123Q;
        } catch (nyb e) {
            Log.e("FREQUENT_FACES_PROCESSOR", "Proto serialization error.", e);
            odhVar2 = odhVar;
        }
        return odhVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.f7972b;
        if (j != 0) {
            nativeClose(j);
            this.f7972b = 0L;
        }
    }
}
