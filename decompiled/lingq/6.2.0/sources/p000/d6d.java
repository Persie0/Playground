package p000;

import com.google.android.gms.internal.measurement.AbstractC0964h;

/* JADX INFO: loaded from: classes.dex */
public final class d6d extends AbstractC0964h {

    /* JADX INFO: renamed from: e */
    public volatile boolean f35066e;

    /* JADX INFO: renamed from: f */
    public final boolean f35067f;

    public d6d(String str, pl1 pl1Var, boolean z) {
        super(str, pl1Var);
        this.f35067f = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo5410a() {
        return Boolean.valueOf(this.f35067f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo5411b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo5412c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object mo5413d() {
        return Boolean.valueOf(this.f35066e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0964h
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo5414e(Object obj) {
        this.f35066e = ((Boolean) obj).booleanValue();
    }
}
