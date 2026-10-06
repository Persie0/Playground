package com.google.android.apps.camera.autotimer.analysis.jni;

import java.nio.ByteBuffer;
import java.util.List;
import p000.kpv;
import p000.kpw;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class AnalysisImage {

    /* JADX INFO: renamed from: a */
    private final kpw f6492a;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    class Plane implements kpv {

        /* JADX INFO: renamed from: a */
        private final kpv f6493a;

        public Plane(kpv kpvVar) {
            this.f6493a = kpvVar;
        }

        @Override // p000.kpv
        public ByteBuffer getBuffer() {
            return this.f6493a.getBuffer();
        }

        @Override // p000.kpv
        public int getPixelStride() {
            return this.f6493a.getPixelStride();
        }

        @Override // p000.kpv
        public int getRowStride() {
            return this.f6493a.getRowStride();
        }
    }

    public AnalysisImage(kpw kpwVar) {
        lku.m15613H(kpwVar.mo7245a() == 35);
        this.f6492a = kpwVar;
    }

    int getHeight() {
        return this.f6492a.mo7246b();
    }

    Plane[] getPlanes() {
        List listMo7251g = this.f6492a.mo7251g();
        Plane[] planeArr = new Plane[listMo7251g.size()];
        for (int i = 0; i < listMo7251g.size(); i++) {
            planeArr[i] = new Plane((kpv) listMo7251g.get(i));
        }
        return planeArr;
    }

    int getWidth() {
        return this.f6492a.mo7247c();
    }
}
