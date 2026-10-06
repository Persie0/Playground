package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jml implements jlz {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f34357e;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jml f34356d = new jml(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jml f34355c = new jml(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ jml f34354b = new jml(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ jml f34353a = new jml(0);

    private /* synthetic */ jml(int i) {
        this.f34357e = i;
    }

    @Override // p000.jlz
    /* JADX INFO: renamed from: a */
    public final IInterface mo13345a(IBinder iBinder) {
        switch (this.f34357e) {
            case 0:
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
                return iInterfaceQueryLocalInterface instanceof jmh ? (jmh) iInterfaceQueryLocalInterface : new jmg(iBinder);
            case 1:
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
                return iInterfaceQueryLocalInterface2 instanceof jlv ? (jlv) iInterfaceQueryLocalInterface2 : new jlv(iBinder);
            case 2:
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
                return iInterfaceQueryLocalInterface3 instanceof jmi ? (jmi) iInterfaceQueryLocalInterface3 : new jmi(iBinder);
            default:
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
                return iInterfaceQueryLocalInterface4 instanceof jmk ? (jmk) iInterfaceQueryLocalInterface4 : new jmj(iBinder);
        }
    }
}
