package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjt extends jju {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jjx f34187a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjt(jec jecVar, jjx jjxVar) {
        super(jecVar);
        this.f34187a = jjxVar;
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ void mo12838b(jdp jdpVar) {
        jkc jkcVar = (jkc) jdpVar;
        jjx jjxVar = this.f34187a;
        jmv.m13378e(jjxVar);
        if (((Boolean) jke.f34230a.mo13520a()).booleanValue()) {
            jkd jkdVar = (jkd) jkcVar.m13169u();
            Parcel parcelM3398a = jkdVar.m3398a();
            cbs.m3404c(parcelM3398a, jjxVar);
            Parcel parcelM3399y = jkdVar.m3399y(7, parcelM3398a);
            cbs.m3406e(parcelM3399y);
            parcelM3399y.recycle();
        } else {
            jkd jkdVar2 = (jkd) jkcVar.m13169u();
            ErrorReport errorReport = new ErrorReport(jjxVar, jkcVar.f34229a.getCacheDir());
            Parcel parcelM3398a2 = jkdVar2.m3398a();
            cbs.m3404c(parcelM3398a2, errorReport);
            Parcel parcelM3399y2 = jkdVar2.m3399y(3, parcelM3398a2);
            cbs.m3406e(parcelM3399y2);
            parcelM3399y2.recycle();
        }
        m4649i(Status.f7601a);
    }
}
