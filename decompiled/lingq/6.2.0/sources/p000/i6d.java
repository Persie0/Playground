package p000;

import com.google.android.gms.internal.measurement.AbstractC0964h;

/* JADX INFO: loaded from: classes2.dex */
public final class i6d extends AbstractC0964h {

    /* JADX INFO: renamed from: e */
    public volatile double f43614e;

    public i6d(pl1 pl1Var) {
        super("measurement.test.double_flag", pl1Var);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5410a() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo5411b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo5412c(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo5413d() {
        return Double.valueOf(this.f43614e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo5414e(Object obj) {
        this.f43614e = ((Double) obj).doubleValue();
    }
}
