package p000;

import com.google.android.gms.internal.measurement.AbstractC0964h;

/* JADX INFO: loaded from: classes.dex */
public final class r6d extends AbstractC0964h {

    /* JADX INFO: renamed from: e */
    public volatile long f58812e;

    /* JADX INFO: renamed from: f */
    public final long f58813f;

    public r6d(String str, pl1 pl1Var, long j) {
        super(str, pl1Var);
        this.f58813f = j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5410a() {
        return Long.valueOf(this.f58813f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo5411b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo5412c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo5413d() {
        return Long.valueOf(this.f58812e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo5414e(Object obj) {
        this.f58812e = ((Long) obj).longValue();
    }
}
