package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dym implements dyl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dyl f12923a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f12924b;

    public dym(dyl dylVar, long j) {
        this.f12923a = dylVar;
        this.f12924b = j;
    }

    @Override // p000.dyl
    /* JADX INFO: renamed from: a */
    public final jzk mo6934a(long j) {
        jzk jzkVarMo6935b = this.f12923a.mo6935b(j);
        if (jzkVarMo6935b == null || Math.abs(jzkVarMo6935b.f35296a - j) > this.f12924b) {
            return null;
        }
        return jzkVarMo6935b;
    }

    @Override // p000.dyl
    /* JADX INFO: renamed from: b */
    public final jzk mo6935b(long j) {
        return this.f12923a.mo6935b(j);
    }

    public final String toString() {
        return String.valueOf(this.f12923a) + gBCSQzBeB.BsFZ + this.f12924b + "]";
    }
}
