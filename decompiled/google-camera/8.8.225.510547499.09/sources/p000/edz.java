package p000;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edz {

    /* JADX INFO: renamed from: a */
    public InterleavedImageU8 f13533a;

    /* JADX INFO: renamed from: b */
    public eev f13534b;

    /* JADX INFO: renamed from: c */
    public HardwareBuffer f13535c;

    /* JADX INFO: renamed from: d */
    public long f13536d;

    /* JADX INFO: renamed from: e */
    public drn f13537e;

    /* JADX INFO: renamed from: f */
    public InterleavedImageU8 f13538f;

    /* JADX INFO: renamed from: g */
    public gug f13539g;

    /* JADX INFO: renamed from: h */
    public ShotParams f13540h;

    /* JADX INFO: renamed from: i */
    public byte f13541i;

    /* JADX INFO: renamed from: j */
    public ebn f13542j;

    /* JADX INFO: renamed from: k */
    public glk f13543k;

    /* JADX INFO: renamed from: l */
    public gtd f13544l;

    /* JADX INFO: renamed from: m */
    private ShotMetadata f13545m;

    /* JADX INFO: renamed from: n */
    private kay f13546n;

    /* JADX INFO: renamed from: o */
    private kpp f13547o;

    /* JADX INFO: renamed from: p */
    private nps f13548p;

    public edz() {
    }

    public edz(eea eeaVar) {
        this.f13533a = eeaVar.f13584a;
        this.f13534b = eeaVar.f13585b;
        this.f13535c = eeaVar.f13586c;
        this.f13545m = eeaVar.f13587d;
        this.f13546n = eeaVar.f13588e;
        this.f13547o = eeaVar.f13589f;
        this.f13536d = eeaVar.f13590g;
        this.f13542j = eeaVar.f13596m;
        this.f13544l = eeaVar.f13598o;
        this.f13548p = eeaVar.f13591h;
        this.f13543k = eeaVar.f13597n;
        this.f13537e = eeaVar.f13592i;
        this.f13538f = eeaVar.f13593j;
        this.f13539g = eeaVar.f13594k;
        this.f13540h = eeaVar.f13595l;
        this.f13541i = (byte) 1;
    }

    /* JADX INFO: renamed from: a */
    public final eea m7190a() {
        ShotMetadata shotMetadata;
        kay kayVar;
        kpp kppVar;
        ebn ebnVar;
        nps npsVar;
        glk glkVar;
        if (this.f13541i == 1 && (shotMetadata = this.f13545m) != null && (kayVar = this.f13546n) != null && (kppVar = this.f13547o) != null && (ebnVar = this.f13542j) != null && (npsVar = this.f13548p) != null && (glkVar = this.f13543k) != null) {
            eea eeaVar = new eea(this.f13533a, this.f13534b, this.f13535c, shotMetadata, kayVar, kppVar, this.f13536d, ebnVar, this.f13544l, npsVar, glkVar, this.f13537e, this.f13538f, this.f13539g, this.f13540h, null, null, null, null, null);
            int i = eeaVar.f13584a != null ? 1 : 0;
            if (eeaVar.f13585b != null) {
                i++;
            }
            if (eeaVar.f13586c != null) {
                i++;
            }
            if (i == 1) {
                return eeaVar;
            }
            throw new IllegalArgumentException("We need exactly one image set; we have " + i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13545m == null) {
            sb.append(" shotMetadata");
        }
        if (this.f13546n == null) {
            sb.append(" orientation");
        }
        if (this.f13547o == null) {
            sb.append(" metadata");
        }
        if (this.f13541i == 0) {
            sb.append(" timestampNs");
        }
        if (this.f13542j == null) {
            sb.append(" gcaShotSettings");
        }
        if (this.f13548p == null) {
            sb.append(" mergedPdData");
        }
        if (this.f13543k == null) {
            sb.append(" pictureTakerParameters");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m7191b() {
        this.f13534b = null;
        this.f13533a = null;
        this.f13535c = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m7192c(nps npsVar) {
        if (npsVar == null) {
            throw new NullPointerException("Null mergedPdData");
        }
        this.f13548p = npsVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m7193d(kpp kppVar) {
        if (kppVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.f13547o = kppVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m7194e(kay kayVar) {
        if (kayVar == null) {
            throw new NullPointerException("Null orientation");
        }
        this.f13546n = kayVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m7195f(ShotMetadata shotMetadata) {
        if (shotMetadata == null) {
            throw new NullPointerException(gBCSQzBeB.ugjLtc);
        }
        this.f13545m = shotMetadata;
    }

    /* JADX INFO: renamed from: g */
    public final void m7196g(long j) {
        this.f13536d = j;
        this.f13541i = (byte) 1;
    }
}
