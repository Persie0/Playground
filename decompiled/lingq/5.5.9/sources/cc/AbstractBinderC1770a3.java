package cc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.internal.measurement.BinderC2639e0;
import com.google.android.gms.internal.measurement.C2653f0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p152hb.RunnableC5960c2;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.a3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1770a3 extends BinderC2639e0 implements InterfaceC1779b3 {
    public AbstractBinderC1770a3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2639e0
    /* JADX INFO: renamed from: h */
    public final boolean mo5490h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        ArrayList arrayList;
        boolean z10 = false;
        int i11 = 1;
        switch (i10) {
            case 1:
                zzaw zzawVar = (zzaw) C2653f0.m7797a(parcel, zzaw.CREATOR);
                zzq zzqVar = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5505f0(zzawVar, zzqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzli zzliVar = (zzli) C2653f0.m7797a(parcel, zzli.CREATOR);
                zzq zzqVar2 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5499C0(zzliVar, zzqVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzq zzqVar3 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5506k0(zzqVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzaw zzawVar2 = (zzaw) C2653f0.m7797a(parcel, zzaw.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                C2653f0.m7798b(parcel);
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) this;
                C6272i.m12915i(zzawVar2);
                C6272i.m12912f(string);
                binderC1987y4.m5926d1(string, true);
                binderC1987y4.m5927h0(new RunnableC5960c2(binderC1987y4, zzawVar2, string, 1));
                parcel2.writeNoException();
                return true;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                zzq zzqVar4 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5509q(zzqVar4);
                parcel2.writeNoException();
                return true;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                zzq zzqVar5 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                boolean z11 = parcel.readInt() != 0;
                C2653f0.m7798b(parcel);
                BinderC1987y4 binderC1987y5 = (BinderC1987y4) this;
                binderC1987y5.m5925b1(zzqVar5);
                String str = zzqVar5.f14638a;
                C6272i.m12915i(str);
                C1846i7 c1846i7 = binderC1987y5.f10411a;
                try {
                    List list = (List) c1846i7.mo5518f().m5751n(new CallableC1969w4(str, 0, binderC1987y5)).get();
                    arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                parcel2.writeNoException();
                                parcel2.writeTypedList(arrayList);
                                return true;
                            }
                            C1882m7 c1882m7 = (C1882m7) it.next();
                            if (z11 || !C1900o7.m5792V(c1882m7.f10015c)) {
                                arrayList.add(new zzli(c1882m7));
                            }
                        }
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    c1846i7.mo5517e().f9942f.m5625c(C1860k3.m5700q(str), e10, "Failed to get user properties. appId");
                    arrayList = null;
                }
                break;
            case 9:
                zzaw zzawVar3 = (zzaw) C2653f0.m7797a(parcel, zzaw.CREATOR);
                String string2 = parcel.readString();
                C2653f0.m7798b(parcel);
                byte[] bArrMo5500E = ((BinderC1987y4) this).mo5500E(zzawVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo5500E);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5508o0(j10, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzq zzqVar6 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                String strMo5503K = ((BinderC1987y4) this).mo5503K(zzqVar6);
                parcel2.writeNoException();
                parcel2.writeString(strMo5503K);
                return true;
            case 12:
                zzac zzacVar = (zzac) C2653f0.m7797a(parcel, zzac.CREATOR);
                zzq zzqVar7 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5502J0(zzacVar, zzqVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzac zzacVar2 = (zzac) C2653f0.m7797a(parcel, zzac.CREATOR);
                C2653f0.m7798b(parcel);
                BinderC1987y4 binderC1987y6 = (BinderC1987y4) this;
                C6272i.m12915i(zzacVar2);
                C6272i.m12915i(zzacVar2.f14603c);
                C6272i.m12912f(zzacVar2.f14601a);
                binderC1987y6.m5926d1(zzacVar2.f14601a, true);
                binderC1987y6.m5927h0(new RunnableC1865l(binderC1987y6, i11, new zzac(zzacVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = C2653f0.f14186a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                zzq zzqVar8 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                List listMo5498A0 = ((BinderC1987y4) this).mo5498A0(string6, string7, z10, zzqVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5498A0);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = C2653f0.f14186a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                C2653f0.m7798b(parcel);
                List listMo5512y = ((BinderC1987y4) this).mo5512y(string8, string9, string10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5512y);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzq zzqVar9 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                List listMo5507l0 = ((BinderC1987y4) this).mo5507l0(string11, string12, zzqVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5507l0);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                C2653f0.m7798b(parcel);
                List listMo5504O = ((BinderC1987y4) this).mo5504O(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo5504O);
                return true;
            case 18:
                zzq zzqVar10 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5501F0(zzqVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                zzq zzqVar11 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5510v(bundle, zzqVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzq zzqVar12 = (zzq) C2653f0.m7797a(parcel, zzq.CREATOR);
                C2653f0.m7798b(parcel);
                ((BinderC1987y4) this).mo5511x0(zzqVar12);
                parcel2.writeNoException();
                return true;
        }
    }
}
