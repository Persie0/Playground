package com.google.googlex.gcam;

import p000.nre;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FrameRequest {

    /* JADX INFO: renamed from: a */
    public transient long f8267a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8268b;

    public FrameRequest() {
        this(GcamModuleJNI.new_FrameRequest__SWIG_0(), true);
    }

    public FrameRequest(long j, boolean z) {
        this.f8268b = z;
        this.f8267a = j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[LOOP:0: B:10:0x0018->B:15:0x0023, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final nre m4965a() {
        nre[] nreVarArr;
        nre nreVar;
        int iFrameRequest_type_get = GcamModuleJNI.FrameRequest_type_get(this.f8267a, this);
        nre[] nreVarArr2 = nre.f44169i;
        int i = 0;
        if (iFrameRequest_type_get >= 8 || iFrameRequest_type_get < 0) {
            while (true) {
                nreVarArr = nre.f44169i;
                if (i < 8) {
                    throw new IllegalArgumentException("No enum " + nre.class.toString() + " with value " + iFrameRequest_type_get);
                }
                nreVar = nreVarArr[i];
                if (nreVar.f44171j == iFrameRequest_type_get) {
                    i++;
                }
            }
        } else {
            nreVar = nreVarArr2[iFrameRequest_type_get];
            if (nreVar.f44171j != iFrameRequest_type_get) {
                while (true) {
                    nreVarArr = nre.f44169i;
                    if (i < 8) {
                        throw new IllegalArgumentException("No enum " + nre.class.toString() + " with value " + iFrameRequest_type_get);
                    }
                    nreVar = nreVarArr[i];
                    if (nreVar.f44171j == iFrameRequest_type_get) {
                        i++;
                    }
                }
            }
        }
        return nreVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4966b() {
        long j = this.f8267a;
        if (j != 0) {
            if (this.f8268b) {
                this.f8268b = false;
                GcamModuleJNI.delete_FrameRequest(j);
            }
            this.f8267a = 0L;
        }
    }

    protected final void finalize() {
        m4966b();
    }
}
