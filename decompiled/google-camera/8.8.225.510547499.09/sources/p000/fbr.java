package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fbr extends AbstractC0909pn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fbs f21195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbr(fbs fbsVar) {
        super(true);
        this.f21195a = fbsVar;
    }

    @Override // p000.AbstractC0909pn
    /* JADX INFO: renamed from: a */
    public final void mo3794a() {
        if (((Boolean) this.f21195a.f21197x.m8093a(fal.f21114a, false)).booleanValue()) {
            return;
        }
        m19324d(false);
        this.f21195a.onBackPressed();
    }
}
