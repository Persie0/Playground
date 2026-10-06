package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hho extends hhc {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ hhr f27822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho(hhr hhrVar, Context context) {
        super(context);
        this.f27822e = hhrVar;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hhr hhrVar = this.f27822e;
        if (hhrVar.f27830b) {
            return;
        }
        if (((Boolean) hhrVar.f27832d.mo10031c(gzy.f27006R)).booleanValue()) {
            hhrVar.f27839k.m11120a(false);
        } else {
            hhrVar.f27839k.m11121b();
        }
    }
}
