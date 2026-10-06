package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class izw extends jai {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ izy f32738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izw(izy izyVar, izv izvVar) {
        super(izvVar);
        this.f32738a = izyVar;
    }

    @Override // p000.jai
    /* JADX INFO: renamed from: a */
    public final void mo11953a() {
        izy izyVar = this.f32738a;
        izo.m11916a();
        if (izyVar.m11955D()) {
            izyVar.m11936q("Inactivity, disconnecting from device AnalyticsService");
            izyVar.m11957b();
        }
    }
}
