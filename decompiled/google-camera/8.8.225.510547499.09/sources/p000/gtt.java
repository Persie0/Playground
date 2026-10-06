package p000;

import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtt {

    /* JADX INFO: renamed from: a */
    public final gts[] f26393a;

    /* JADX INFO: renamed from: b */
    public final float f26394b;

    /* JADX INFO: renamed from: c */
    public final float f26395c;

    /* JADX INFO: renamed from: d */
    public final float f26396d;

    /* JADX INFO: renamed from: e */
    public final float f26397e;

    /* JADX INFO: renamed from: f */
    public final long f26398f;

    public gtt(odh odhVar) {
        this.f26394b = odhVar.f45618j;
        odg odgVar = odhVar.f45617i;
        float f = (odgVar == null ? odg.f45596i : odgVar).f45602e;
        odg odgVar2 = odhVar.f45617i;
        this.f26395c = (odgVar2 == null ? odg.f45596i : odgVar2).f45604g;
        this.f26396d = (odgVar2 == null ? odg.f45596i : odgVar2).f45603f;
        this.f26397e = (odgVar2 == null ? odg.f45596i : odgVar2).f45605h;
        this.f26398f = odhVar.f45611c;
        ocd ocdVar = odhVar.f45613e;
        ocdVar = ocdVar == null ? ocd.f45443b : ocdVar;
        this.f26393a = new gts[ocdVar.f45445a.size()];
        int i = 0;
        while (true) {
            gts[] gtsVarArr = this.f26393a;
            if (i >= gtsVarArr.length) {
                break;
            }
            gtsVarArr[i] = new gts((occ) ocdVar.f45445a.get(i), odhVar.f45615g);
            i++;
        }
        if ((odhVar.f45609a & 8388608) != 0) {
            ocj ocjVar = odhVar.f45620l;
            if (!(ocjVar == null ? ocj.f45473b : ocjVar).f45475a.isEmpty()) {
                ocj ocjVar2 = odhVar.f45620l;
                if ((((oci) (ocjVar2 == null ? ocj.f45473b : ocjVar2).f45475a.get(0)).f45470a & 1) != 0) {
                    ocj ocjVar3 = odhVar.f45620l;
                    oci ociVar = (oci) (ocjVar3 == null ? ocj.f45473b : ocjVar3).f45475a.get(0);
                    och ochVar = ociVar.f45471b;
                    ochVar = ochVar == null ? och.f45462e : ochVar;
                    if (ochVar.f45465b.size() <= 0 || ochVar.f45467d.size() <= 0 || ochVar.f45464a.size() <= 0 || ochVar.f45466c.size() <= 0) {
                        new RectF();
                    } else {
                        new RectF(ebr.m7075a(1080.0f - ochVar.f45466c.mo18032d(0), 1080.0f), ebr.m7075a(ochVar.f45465b.mo18032d(0), 1440.0f), ebr.m7075a(1080.0f - ochVar.f45464a.mo18032d(0), 1080.0f), ebr.m7075a(ochVar.f45467d.mo18032d(0), 1440.0f));
                    }
                    ((String) ociVar.f45472c.get(0)).hashCode();
                    return;
                }
            }
        }
        new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
