package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jno implements jgc {

    /* JADX INFO: renamed from: a */
    public jfx f34407a;

    /* JADX INFO: renamed from: b */
    public boolean f34408b = true;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ jnp f34409c;

    public jno(jnp jnpVar, jfx jfxVar) {
        this.f34409c = jnpVar;
        this.f34407a = jfxVar;
    }

    @Override // p000.jgc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo13128a(Object obj, Object obj2) {
        jfv jfvVar;
        boolean z;
        jnu jnuVar = (jnu) obj;
        synchronized (this) {
            jfvVar = this.f34407a.f33922b;
            z = this.f34408b;
            this.f34407a.m13122a();
        }
        if (jfvVar == null) {
            ((khb) obj2).m14243i(false);
            return;
        }
        synchronized (jnuVar.f34419a) {
            jnb jnbVar = (jnb) jnuVar.f34419a.remove(jfvVar);
            if (jnbVar == null) {
                ((khb) obj2).m14243i(Boolean.FALSE);
                return;
            }
            jnbVar.f34393a.m13390b().m13122a();
            if (!z) {
                ((khb) obj2).m14243i(Boolean.TRUE);
            } else if (jnuVar.m13394I(jmy.f34390j)) {
                jnk jnkVar = (jnk) jnuVar.m13169u();
                jnv jnvVarM13395a = jnv.m13395a(null, jnbVar, null);
                jfr jfrVarM13393J = jnu.m13393J((khb) obj2, Boolean.TRUE);
                Parcel parcelM3398a = jnkVar.m3398a();
                cbs.m3404c(parcelM3398a, jnvVarM13395a);
                cbs.m3405d(parcelM3398a, jfrVarM13393J);
                jnkVar.m3400z(89, parcelM3398a);
            } else {
                ((jnk) jnuVar.m13169u()).m13388e(new jnx(2, null, jnbVar, null, null, new jnr(Boolean.TRUE, (khb) obj2, null, null), null));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized jfx m13390b() {
        return this.f34407a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m13391c(jfx jfxVar) {
        jfx jfxVar2 = this.f34407a;
        if (jfxVar2 != jfxVar) {
            jfxVar2.m13122a();
            this.f34407a = jfxVar;
        }
    }
}
