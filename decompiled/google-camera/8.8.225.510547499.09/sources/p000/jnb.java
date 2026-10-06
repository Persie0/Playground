package p000;

import android.location.Location;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnb extends cbr implements jnc {

    /* JADX INFO: renamed from: a */
    public final jno f34393a;

    public jnb() {
        super("com.google.android.gms.location.ILocationListener");
    }

    @Override // p000.jnc
    /* JADX INFO: renamed from: e */
    public final void mo13385e() {
        this.f34393a.m13390b().m13123b(new jnt(this, 0));
    }

    public jnb(jno jnoVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.f34393a = jnoVar;
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Location location = (Location) cbs.m3402a(parcel, Location.CREATOR);
                cbs.m3403b(parcel);
                this.f34393a.m13390b().m13123b(new jnt(location, 1));
                return true;
            case 2:
                mo13385e();
                return true;
            default:
                return false;
        }
    }
}
