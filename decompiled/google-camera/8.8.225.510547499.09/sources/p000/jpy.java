package p000;

import android.content.Context;
import android.location.Location;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jpy implements jgc {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ jpy f34580a = new jpy(1);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f34581b;

    public /* synthetic */ jpy(int i) {
        this.f34581b = i;
    }

    @Override // p000.jgc
    /* JADX INFO: renamed from: a */
    public final void mo13128a(Object obj, Object obj2) {
        switch (this.f34581b) {
            case 0:
                jpz jpzVar = new jpz((khb) obj2, null, null);
                jqk jqkVar = (jqk) ((jqp) obj).m13169u();
                Parcel parcelM3398a = jqkVar.m3398a();
                cbs.m3405d(parcelM3398a, jpzVar);
                jqkVar.m3400z(2, parcelM3398a);
                break;
            default:
                jnu jnuVar = (jnu) obj;
                jnd jndVar = new jnd(Long.MAX_VALUE, 0, false, null, null);
                Context context = jnuVar.f33986c;
                if (!jnuVar.m13394I(jmy.f34386f)) {
                    jnk jnkVar = (jnk) jnuVar.m13169u();
                    Parcel parcelM3399y = jnkVar.m3399y(7, jnkVar.m3398a());
                    Location location = (Location) cbs.m3402a(parcelM3399y, Location.CREATOR);
                    parcelM3399y.recycle();
                    ((khb) obj2).m14243i(location);
                } else {
                    jnk jnkVar2 = (jnk) jnuVar.m13169u();
                    jnl jnlVar = new jnl((khb) obj2, 0, null, null);
                    Parcel parcelM3398a2 = jnkVar2.m3398a();
                    cbs.m3404c(parcelM3398a2, jndVar);
                    cbs.m3405d(parcelM3398a2, jnlVar);
                    jnkVar2.m3400z(82, parcelM3398a2);
                }
                break;
        }
    }
}
