package cc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C2625d0;
import com.google.android.gms.internal.measurement.C2653f0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: cc.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1993z2 extends C2625d0 implements InterfaceC1779b3 {
    public C1993z2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: A0 */
    public final List mo5498A0(String str, String str2, boolean z10, zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        ClassLoader classLoader = C2653f0.f14186a;
        parcelM7743h.writeInt(z10 ? 1 : 0);
        C2653f0.m7799c(parcelM7743h, zzqVar);
        Parcel parcelM7745j = m7745j(parcelM7743h, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM7745j.createTypedArrayList(zzli.CREATOR);
        parcelM7745j.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: C0 */
    public final void mo5499C0(zzli zzliVar, zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzliVar);
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 2);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: E */
    public final byte[] mo5500E(zzaw zzawVar, String str) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzawVar);
        parcelM7743h.writeString(str);
        Parcel parcelM7745j = m7745j(parcelM7743h, 9);
        byte[] bArrCreateByteArray = parcelM7745j.createByteArray();
        parcelM7745j.recycle();
        return bArrCreateByteArray;
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: F0 */
    public final void mo5501F0(zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 18);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: J0 */
    public final void mo5502J0(zzac zzacVar, zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzacVar);
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 12);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: K */
    public final String mo5503K(zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzqVar);
        Parcel parcelM7745j = m7745j(parcelM7743h, 11);
        String string = parcelM7745j.readString();
        parcelM7745j.recycle();
        return string;
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: O */
    public final List mo5504O(String str, String str2, String str3) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(null);
        parcelM7743h.writeString(str2);
        parcelM7743h.writeString(str3);
        Parcel parcelM7745j = m7745j(parcelM7743h, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM7745j.createTypedArrayList(zzac.CREATOR);
        parcelM7745j.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: f0 */
    public final void mo5505f0(zzaw zzawVar, zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzawVar);
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 1);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: k0 */
    public final void mo5506k0(zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 4);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: l0 */
    public final List mo5507l0(String str, String str2, zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        C2653f0.m7799c(parcelM7743h, zzqVar);
        Parcel parcelM7745j = m7745j(parcelM7743h, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM7745j.createTypedArrayList(zzac.CREATOR);
        parcelM7745j.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: o0 */
    public final void mo5508o0(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeLong(j10);
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        parcelM7743h.writeString(str3);
        m7744h0(parcelM7743h, 10);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: q */
    public final void mo5509q(zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 6);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: v */
    public final void mo5510v(Bundle bundle, zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, bundle);
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 19);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: x0 */
    public final void mo5511x0(zzq zzqVar) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, zzqVar);
        m7744h0(parcelM7743h, 20);
    }

    @Override // cc.InterfaceC1779b3
    /* JADX INFO: renamed from: y */
    public final List mo5512y(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(null);
        parcelM7743h.writeString(str2);
        parcelM7743h.writeString(str3);
        ClassLoader classLoader = C2653f0.f14186a;
        parcelM7743h.writeInt(z10 ? 1 : 0);
        Parcel parcelM7745j = m7745j(parcelM7743h, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM7745j.createTypedArrayList(zzli.CREATOR);
        parcelM7745j.recycle();
        return arrayListCreateTypedArrayList;
    }
}
