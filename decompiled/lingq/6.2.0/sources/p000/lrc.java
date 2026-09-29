package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjs;

/* JADX INFO: loaded from: classes2.dex */
public final class lrc extends wpb {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f50053f = 2;

    /* JADX INFO: renamed from: g */
    public final Object f50054g;

    public lrc(wr9 wr9Var) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f50054g = wr9Var;
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        switch (this.f50053f) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) bqb.m4105b(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                bqb.m4109f(parcel);
                wr9 wr9Var = (wr9) this.f50054g;
                if (status.m5282r()) {
                    try {
                        phb phbVar = phb.f56224a;
                        int i2 = dhb.f35664a;
                        h6d.m13105d(status, g5d.m12375u(bArrCreateByteArray, phb.f56225b), wr9Var);
                    } catch (zzaeh e) {
                        wr9Var.m24137a(e);
                    }
                } else {
                    h6d.m13105d(status, null, wr9Var);
                }
                return true;
            case 1:
                wr9 wr9Var2 = (wr9) this.f50054g;
                switch (i) {
                    case 1:
                        Status status2 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status2, null, wr9Var2);
                        break;
                    case 2:
                        Status status3 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status3, null, wr9Var2);
                        break;
                    case 3:
                        Status status4 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status4, null, wr9Var2);
                        break;
                    case 4:
                        Status status5 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        zzjh zzjhVar = (zzjh) bqb.m4105b(parcel, zzjh.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status5, zzjhVar, wr9Var2);
                        break;
                    case 5:
                        Status status6 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status6, null, wr9Var2);
                        break;
                    case 6:
                        Status status7 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        zzjl zzjlVar = (zzjl) bqb.m4105b(parcel, zzjl.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status7, zzjlVar, wr9Var2);
                        break;
                    case 7:
                        Status status8 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        zzjj zzjjVar = (zzjj) bqb.m4105b(parcel, zzjj.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status8, zzjjVar, wr9Var2);
                        break;
                    case 8:
                        Status status9 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status9, null, wr9Var2);
                        break;
                    case 9:
                        Status status10 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        zzjo zzjoVar = (zzjo) bqb.m4105b(parcel, zzjo.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status10, zzjoVar, wr9Var2);
                        break;
                    case 10:
                        Status status11 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        zzjh zzjhVar2 = (zzjh) bqb.m4105b(parcel, zzjh.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status11, zzjhVar2, wr9Var2);
                        break;
                    case 11:
                        Status status12 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        parcel.readLong();
                        bqb.m4109f(parcel);
                        h6d.m13105d(status12, null, wr9Var2);
                        break;
                    case 12:
                        Status status13 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status13, null, wr9Var2);
                        break;
                    case 13:
                        Status status14 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        zzjs zzjsVar = (zzjs) bqb.m4105b(parcel, zzjs.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status14, zzjsVar, wr9Var2);
                        break;
                    case 14:
                        Status status15 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status15, null, wr9Var2);
                        break;
                    case 15:
                        Status status16 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        bqb.m4109f(parcel);
                        h6d.m13105d(status16, null, wr9Var2);
                        break;
                    case 16:
                        Status status17 = (Status) bqb.m4105b(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        bqb.m4109f(parcel);
                        h6d.m13105d(status17, Long.valueOf(j), wr9Var2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                bqb.m4109f(parcel);
                nha nhaVar = new nha(this, bArrCreateByteArray2);
                wo3 wo3Var = (wo3) this.f50054g;
                ((zq3) wo3Var.f67119a).execute(new kj3(12, wo3Var, nhaVar));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrc(ltc ltcVar, wo3 wo3Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.f50054g = wo3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrc(ltc ltcVar, wr9 wr9Var) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.f50054g = wr9Var;
    }
}
