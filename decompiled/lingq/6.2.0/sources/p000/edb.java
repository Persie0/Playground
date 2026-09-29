package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class edb extends qcb implements qo3, ro3 {

    /* JADX INFO: renamed from: n */
    public static final ncb f37087n = hdb.f42228a;

    /* JADX INFO: renamed from: g */
    public final Context f37088g;

    /* JADX INFO: renamed from: h */
    public final Handler f37089h;

    /* JADX INFO: renamed from: i */
    public final ncb f37090i;

    /* JADX INFO: renamed from: j */
    public final Set f37091j;

    /* JADX INFO: renamed from: k */
    public final co7 f37092k;

    /* JADX INFO: renamed from: l */
    public b79 f37093l;

    /* JADX INFO: renamed from: m */
    public ucb f37094m;

    public edb(Context context, wdb wdbVar, co7 co7Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.f37088g = context;
        this.f37089h = wdbVar;
        this.f37092k = co7Var;
        this.f37091j = (Set) co7Var.f10360c;
        this.f37090i = f37087n;
    }

    @Override // p000.qcb
    /* JADX INFO: renamed from: F */
    public final boolean mo11078F(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                zcb.m25556c(parcel);
                break;
            case 4:
                zcb.m25556c(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zcb.m25556c(parcel);
                break;
            case 7:
                zcb.m25556c(parcel);
                break;
            case 8:
                zak zakVar = (zak) zcb.m25554a(parcel, zak.CREATOR);
                zcb.m25556c(parcel);
                this.f37089h.post(new gvb(this, zakVar, z, 12));
                break;
            case 9:
                zcb.m25556c(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.qo3
    public final void onConnected(Bundle bundle) {
        this.f37093l.m3408v(this);
    }

    @Override // p000.ro3
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f37094m.m22675b(connectionResult);
    }

    @Override // p000.qo3
    public final void onConnectionSuspended(int i) {
        this.f37094m.m22676c(i);
    }
}
