package p000;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grm {

    /* JADX INFO: renamed from: a */
    public final kpw f26152a;

    /* JADX INFO: renamed from: b */
    public final kay f26153b;

    /* JADX INFO: renamed from: c */
    public final nps f26154c;

    /* JADX INFO: renamed from: e */
    public final Rect f26156e;

    /* JADX INFO: renamed from: f */
    public final gyw f26157f;

    /* JADX INFO: renamed from: g */
    public final kmq f26158g;

    /* JADX INFO: renamed from: i */
    public final gzl f26160i;

    /* JADX INFO: renamed from: j */
    public final long f26161j;

    /* JADX INFO: renamed from: k */
    public final long f26162k;

    /* JADX INFO: renamed from: h */
    public final ExifInterface f26159h = null;

    /* JADX INFO: renamed from: d */
    public final hjy f26155d = null;

    /* JADX INFO: renamed from: l */
    public final drn f26163l = null;

    public grm(kpw kpwVar, gyw gywVar, kmq kmqVar, kay kayVar, nps npsVar, Rect rect, long j, long j2, gzl gzlVar) {
        this.f26152a = kpwVar;
        this.f26157f = gywVar;
        this.f26158g = kmqVar;
        this.f26153b = kayVar;
        this.f26154c = npsVar;
        this.f26156e = rect;
        this.f26161j = j;
        this.f26162k = j2;
        this.f26160i = gzlVar;
    }

    /* JADX INFO: renamed from: a */
    public static grl m9671a(kpw kpwVar) {
        return new grl(kpwVar);
    }

    /* JADX INFO: renamed from: b */
    public static grl m9672b(fxn fxnVar) {
        grl grlVar = new grl(fxnVar);
        grlVar.f26146d = fxnVar.m8924k();
        return grlVar;
    }

    /* JADX INFO: renamed from: c */
    public static grm m9673c(kpw kpwVar, grm grmVar) {
        grl grlVar = new grl(kpwVar);
        grlVar.f26143a = grmVar.f26158g;
        grlVar.f26144b = grmVar.f26157f;
        grlVar.f26145c = grmVar.f26153b;
        grlVar.f26146d = grmVar.f26154c;
        grlVar.f26149g = grmVar.f26160i;
        grlVar.f26147e = grmVar.f26156e;
        ExifInterface exifInterface = grmVar.f26159h;
        hjy hjyVar = grmVar.f26155d;
        grlVar.m9670b(grmVar.f26162k);
        grlVar.f26148f = Long.valueOf(grmVar.f26161j);
        return grlVar.m9669a();
    }
}
