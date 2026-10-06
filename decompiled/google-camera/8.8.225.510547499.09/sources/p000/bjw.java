package p000;

import android.graphics.Path;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjw implements bjo {

    /* JADX INFO: renamed from: a */
    public final Path.FillType f3536a;

    /* JADX INFO: renamed from: b */
    public final String f3537b;

    /* JADX INFO: renamed from: c */
    public final bja f3538c;

    /* JADX INFO: renamed from: d */
    public final bjd f3539d;

    /* JADX INFO: renamed from: e */
    public final boolean f3540e;

    /* JADX INFO: renamed from: f */
    private final boolean f3541f;

    public bjw(String str, boolean z, Path.FillType fillType, bja bjaVar, bjd bjdVar, boolean z2) {
        this.f3537b = str;
        this.f3541f = z;
        this.f3536a = fillType;
        this.f3538c = bjaVar;
        this.f3539d = bjdVar;
        this.f3540e = z2;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhm(bgvVar, bkcVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f3541f + EArqVBjecl.CinWcQmyayyNDy;
    }
}
