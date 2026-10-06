package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlr implements jkz {

    /* JADX INFO: renamed from: a */
    private final msn f34333a;

    /* JADX INFO: renamed from: b */
    private final long f34334b;

    /* JADX INFO: renamed from: c */
    private final jlu f34335c;

    public jlr(jlu jluVar) {
        this.f34335c = jluVar;
        msn msnVar = mqt.f41449a;
        this.f34333a = msnVar;
        this.f34334b = msnVar.mo15326a();
    }

    @Override // p000.jkz
    /* JADX INFO: renamed from: a */
    public final void mo13327a(int i, String str) {
        Status status = new Status(i, str);
        long jMo15326a = this.f34333a.mo15326a() - this.f34334b;
        try {
            jlu jluVar = this.f34335c;
            Parcel parcelM3398a = jluVar.m3398a();
            cbs.m3404c(parcelM3398a, status);
            parcelM3398a.writeLong(jMo15326a);
            jluVar.m3400z(3, parcelM3398a);
        } catch (RemoteException e) {
            Log.w(HEePJw.kvENFFCvCEmFb, "onStartQueryFailure AIDL call failed, ignoring", e);
        }
    }

    @Override // p000.jkz
    /* JADX INFO: renamed from: b */
    public final void mo13328b(jky jkyVar) {
        jkyVar.getClass();
        long jMo15326a = this.f34333a.mo15326a() - this.f34334b;
        jlt jltVar = new jlt(jkyVar, this.f34333a);
        try {
            jlu jluVar = this.f34335c;
            Parcel parcelM3398a = jluVar.m3398a();
            cbs.m3405d(parcelM3398a, jltVar);
            parcelM3398a.writeLong(jMo15326a);
            jluVar.m3400z(2, parcelM3398a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", e);
            jltVar.m13343b();
        }
    }
}
