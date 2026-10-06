package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gth implements Comparable, kba {

    /* JADX INFO: renamed from: a */
    public final long f26339a;

    /* JADX INFO: renamed from: b */
    public final float f26340b;

    /* JADX INFO: renamed from: c */
    public final float f26341c;

    /* JADX INFO: renamed from: d */
    public final float f26342d;

    /* JADX INFO: renamed from: e */
    public final float f26343e;

    /* JADX INFO: renamed from: f */
    public final float f26344f;

    /* JADX INFO: renamed from: g */
    public final float f26345g;

    /* JADX INFO: renamed from: h */
    public final float f26346h;

    /* JADX INFO: renamed from: i */
    public final float f26347i;

    /* JADX INFO: renamed from: j */
    public final float f26348j;

    /* JADX INFO: renamed from: k */
    public final float f26349k;

    /* JADX INFO: renamed from: l */
    public final float f26350l;

    /* JADX INFO: renamed from: m */
    public final float f26351m;

    /* JADX INFO: renamed from: n */
    public final boolean f26352n;

    /* JADX INFO: renamed from: o */
    public final boolean f26353o;

    /* JADX INFO: renamed from: p */
    public final mrm f26354p;

    /* JADX INFO: renamed from: q */
    public final mrm f26355q;

    /* JADX INFO: renamed from: r */
    public final mrm f26356r;

    public gth(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        this.f26339a = j;
        this.f26340b = f;
        this.f26341c = f2;
        this.f26342d = f3;
        this.f26343e = f4;
        this.f26344f = f5;
        this.f26345g = f6;
        this.f26346h = f7;
        this.f26347i = f8;
        this.f26348j = f9;
        this.f26349k = f10;
        this.f26350l = f11;
        this.f26351m = f12;
        this.f26352n = z;
        this.f26353o = z2;
        this.f26354p = mrmVar;
        this.f26355q = mrmVar2;
        this.f26356r = mrmVar3;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.f26339a > ((gth) obj).f26339a ? 1 : (this.f26339a == ((gth) obj).f26339a ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gth)) {
            return false;
        }
        gth gthVar = (gth) obj;
        return this.f26339a == gthVar.f26339a && Float.compare(gthVar.f26340b, this.f26340b) == 0 && Float.compare(gthVar.f26341c, this.f26341c) == 0 && Float.compare(gthVar.f26342d, this.f26342d) == 0 && Float.compare(gthVar.f26343e, this.f26343e) == 0 && Float.compare(gthVar.f26344f, this.f26344f) == 0 && Float.compare(gthVar.f26345g, this.f26345g) == 0 && Float.compare(gthVar.f26346h, this.f26346h) == 0 && Float.compare(gthVar.f26347i, this.f26347i) == 0 && Float.compare(gthVar.f26348j, this.f26348j) == 0 && Float.compare(gthVar.f26349k, this.f26349k) == 0 && Float.compare(gthVar.f26350l, this.f26350l) == 0 && Float.compare(gthVar.f26351m, this.f26351m) == 0 && exg.m7984n(gthVar.f26352n, this.f26352n) == 0 && exg.m7984n(gthVar.f26353o, this.f26353o) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26339a), Float.valueOf(this.f26340b), Float.valueOf(this.f26341c), Float.valueOf(this.f26342d), Float.valueOf(this.f26343e), Float.valueOf(this.f26344f), Float.valueOf(this.f26345g), Float.valueOf(this.f26346h), Float.valueOf(this.f26347i), Float.valueOf(this.f26348j), Float.valueOf(this.f26349k), Float.valueOf(this.f26350l), Float.valueOf(this.f26351m), Boolean.valueOf(this.f26352n), Boolean.valueOf(this.f26353o));
    }

    public final String toString() {
        long j = this.f26339a;
        float f = this.f26340b;
        float f2 = this.f26341c;
        float f3 = this.f26342d;
        float f4 = this.f26343e;
        float f5 = this.f26344f;
        float f6 = this.f26345g;
        float f7 = this.f26346h;
        float f8 = this.f26347i;
        float f9 = this.f26348j;
        float f10 = this.f26349k;
        float f11 = this.f26350l;
        float f12 = this.f26351m;
        boolean z = this.f26352n;
        boolean z2 = this.f26353o;
        mrm mrmVar = this.f26354p;
        String string = mrmVar.mo16813g() ? mrmVar.toString() : "unavailable";
        mrm mrmVar2 = this.f26355q;
        String string2 = mrmVar2.mo16813g() ? mrmVar2.toString() : "unavailable";
        mrm mrmVar3 = this.f26356r;
        return "FrameQualityScore{timestampNs=" + j + ", topShotScore=" + f + ", autoExposureStability=" + f2 + ", autoFocusStability=" + f3 + ", autoWhiteBalanceStability=" + f4 + ", faceCount=" + f5 + ", facePosition=" + f6 + ", faceQuality=" + f7 + ", globalMotionSharpness=" + f8 + ", lensStability=" + f9 + ", subjectMotion=" + f10 + rmwTRjObXLGH.fPvjqKbL + f11 + ", aesthetic=" + f12 + ", shouldSkipUnscoredFaceFrame=" + z + ", shouldSkipUnscoredNonfaceFrame=" + z2 + ", smartCaptureFrameQualityScore=" + string + ", cameraPose=" + string2 + gBCSQzBeB.osbmzbdpNnVlLk + (mrmVar3.mo16813g() ? mrmVar3.toString() : "unavailable") + "}";
    }
}
