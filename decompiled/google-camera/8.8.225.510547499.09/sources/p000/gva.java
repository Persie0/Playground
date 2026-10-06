package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gva {

    /* JADX INFO: renamed from: a */
    public final Object f26470a;

    /* JADX INFO: renamed from: b */
    public final Object f26471b;

    /* JADX INFO: renamed from: c */
    public final Object f26472c;

    /* JADX INFO: renamed from: d */
    public final Object f26473d;

    /* JADX INFO: renamed from: e */
    public final Object f26474e;

    /* JADX INFO: renamed from: f */
    public final Object f26475f;

    /* JADX INFO: renamed from: g */
    public final Object f26476g;

    /* JADX INFO: renamed from: h */
    public final Object f26477h;

    /* JADX INFO: renamed from: i */
    public final Object f26478i;

    /* JADX INFO: renamed from: j */
    public final Object f26479j;

    /* JADX INFO: renamed from: k */
    public final Object f26480k;

    /* JADX INFO: renamed from: l */
    public final Object f26481l;

    public gva(dmu dmuVar, hgx hgxVar, fcp fcpVar, jww jwwVar, djm djmVar, hmk hmkVar, ohb ohbVar, had hadVar, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, byte[] bArr, byte[] bArr2) {
        this.f26471b = dmuVar;
        this.f26472c = hgxVar;
        this.f26481l = fcpVar;
        this.f26474e = jwwVar;
        this.f26473d = djmVar;
        this.f26475f = hmkVar;
        this.f26476g = ohbVar;
        this.f26479j = hadVar;
        this.f26470a = mrmVar;
        this.f26480k = mrmVar2;
        this.f26478i = mrmVar3;
        this.f26477h = mrmVar4;
    }

    public gva(fca fcaVar, jfs jfsVar, ktz ktzVar, gxa gxaVar, gxq gxqVar, jww jwwVar, hah hahVar, kqj kqjVar, jww jwwVar2, jwn jwnVar, jww jwwVar3, jwn jwnVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f26480k = ktzVar;
        this.f26470a = fcaVar;
        this.f26481l = jfsVar;
        this.f26471b = gxaVar;
        this.f26472c = gxqVar;
        this.f26479j = kqjVar;
        this.f26473d = jwwVar;
        this.f26475f = jwnVar2;
        this.f26474e = jwwVar2;
        this.f26476g = jwnVar;
        this.f26478i = hahVar;
        this.f26477h = jwwVar3;
    }

    public gva(Map map) {
        this.f26480k = (kgg) map.get(gnf.RAW_HDRPLUS);
        this.f26475f = (kgg) map.get(gnf.f25701c);
        this.f26476g = (kgg) map.get(gnf.RAW_WIDE_ZOOM);
        this.f26479j = (kgg) map.get(gnf.RAW_TELE);
        this.f26478i = (kgg) map.get(gnf.RAW_TELE_ZOOM);
        this.f26481l = (kgg) map.get(gnf.RAW_ULTRAWIDE);
        this.f26472c = (kgg) map.get(gnf.PD);
        this.f26471b = (kgg) map.get(gnf.PD_RM);
        this.f26470a = (kgg) map.get(gnf.DEPTH);
        this.f26473d = (kgg) map.get(gnf.YUV_ANALYSIS);
        this.f26477h = (kgg) map.get(gnf.YUV_TELE_ZOOM);
        this.f26474e = (kgg) map.get(gnf.YUV_TELE_ZOOM_RM);
    }

    /* JADX INFO: renamed from: b */
    public static final String m9783b(kgg kggVar, Set set) {
        if (kggVar != null) {
            String str = kggVar.mo14193c().f36540a;
            if (set.contains(str)) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final gmc m9784a(key keyVar) {
        return new gmc(this, keyVar, null);
    }
}
