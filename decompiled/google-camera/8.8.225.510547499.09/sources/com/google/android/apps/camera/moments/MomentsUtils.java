package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;
import java.util.Collection;
import p000.fpx;
import p000.fsl;
import p000.gta;
import p000.gtt;
import p000.key;
import p000.nps;
import p000.nqf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MomentsUtils {
    /* JADX INFO: renamed from: a */
    public static nps m4209a(key keyVar) {
        nqf nqfVarM17621g = nqf.m17621g();
        keyVar.mo7050k(new fsl(nqfVarM17621g));
        return nqfVarM17621g;
    }

    public static native HardwareBuffer allocateHardwareBuffer(int i, int i2, int i3, int i4, long j);

    /* JADX INFO: renamed from: b */
    public static boolean m4210b(fpx fpxVar, gta gtaVar, Collection collection) {
        if (!fpxVar.mo8673f().mo16813g() && !fpxVar.mo8672e().mo16813g()) {
            return false;
        }
        if (collection.size() <= 0) {
            return true;
        }
        if (fpxVar.mo8673f().mo16813g()) {
            int length = ((gtt) fpxVar.mo8673f().mo16809c()).f26393a.length;
        }
        return fpxVar.mo8668a() >= 0.0f && gtaVar.m9729a(fpxVar.mo8671d(), collection, true).f26337a > 0.07f;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4211c(fpx fpxVar, float f, gta gtaVar, Collection collection) {
        if (collection.size() < 2) {
            return true;
        }
        if (fpxVar.mo8673f().mo16813g()) {
            int length = ((gtt) fpxVar.mo8673f().mo16809c()).f26393a.length;
        }
        return fpxVar.mo8668a() - f >= -0.02f && gtaVar.m9729a(fpxVar.mo8671d(), collection, false).f26337a > 0.07f;
    }

    public static native long yuv2hwyuv(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, HardwareBuffer hardwareBuffer);
}
