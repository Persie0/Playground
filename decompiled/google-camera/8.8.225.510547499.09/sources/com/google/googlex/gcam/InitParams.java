package com.google.googlex.gcam;

import p000.nri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InitParams {

    /* JADX INFO: renamed from: a */
    public transient long f8291a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8292b;

    public InitParams() {
        long jNew_InitParams = GcamModuleJNI.new_InitParams();
        this.f8292b = true;
        this.f8291a = jNew_InitParams;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[LOOP:0: B:10:0x0017->B:15:0x0022, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final nri m4995a() {
        nri[] nriVarArr;
        nri nriVar;
        int iInitParams_execute_finish_on_get = GcamModuleJNI.InitParams_execute_finish_on_get(this.f8291a, this);
        nri[] nriVarArr2 = nri.f44217e;
        int i = 0;
        if (iInitParams_execute_finish_on_get >= 4 || iInitParams_execute_finish_on_get < 0) {
            while (true) {
                nriVarArr = nri.f44217e;
                if (i < 4) {
                    throw new IllegalArgumentException("No enum " + nri.class.toString() + " with value " + iInitParams_execute_finish_on_get);
                }
                nriVar = nriVarArr[i];
                if (nriVar.f44219f == iInitParams_execute_finish_on_get) {
                    i++;
                }
            }
        } else {
            nriVar = nriVarArr2[iInitParams_execute_finish_on_get];
            if (nriVar.f44219f != iInitParams_execute_finish_on_get) {
                while (true) {
                    nriVarArr = nri.f44217e;
                    if (i < 4) {
                        throw new IllegalArgumentException("No enum " + nri.class.toString() + " with value " + iInitParams_execute_finish_on_get);
                    }
                    nriVar = nriVarArr[i];
                    if (nriVar.f44219f == iInitParams_execute_finish_on_get) {
                        i++;
                    }
                }
            }
        }
        return nriVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4996b() {
        long j = this.f8291a;
        if (j != 0) {
            if (this.f8292b) {
                this.f8292b = false;
                GcamModuleJNI.delete_InitParams(j);
            }
            this.f8291a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4997c(nri nriVar) {
        GcamModuleJNI.InitParams_execute_finish_on_set(this.f8291a, this, nriVar.f44219f);
    }

    protected final void finalize() {
        m4996b();
    }
}
