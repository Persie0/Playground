package p000;

import android.view.View;

/* JADX INFO: renamed from: lw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0810lw implements InterfaceC0862nu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0812ly f39421a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39422b;

    public C0810lw(AbstractC0812ly abstractC0812ly, int i) {
        this.f39422b = i;
        this.f39421a = abstractC0812ly;
    }

    @Override // p000.InterfaceC0862nu
    /* JADX INFO: renamed from: c */
    public final int mo16099c() {
        switch (this.f39422b) {
            case 0:
                AbstractC0812ly abstractC0812ly = this.f39421a;
                return abstractC0812ly.f39544B - abstractC0812ly.m16169ap();
            default:
                AbstractC0812ly abstractC0812ly2 = this.f39421a;
                return abstractC0812ly2.f39543A - abstractC0812ly2.m16171ar();
        }
    }

    @Override // p000.InterfaceC0862nu
    /* JADX INFO: renamed from: d */
    public final int mo16100d() {
        switch (this.f39422b) {
            case 0:
                return this.f39421a.m16172as();
            default:
                return this.f39421a.m16170aq();
        }
    }

    @Override // p000.InterfaceC0862nu
    /* JADX INFO: renamed from: e */
    public final View mo16101e(int i) {
        switch (this.f39422b) {
            case 0:
                break;
        }
        return this.f39421a.m16174av(i);
    }

    @Override // p000.InterfaceC0862nu
    /* JADX INFO: renamed from: a */
    public final int mo16097a(View view) {
        switch (this.f39422b) {
            case 0:
                return AbstractC0812ly.m16140bo(view) + ((C0813lz) view.getLayoutParams()).bottomMargin;
            default:
                return AbstractC0812ly.m16142bq(view) + ((C0813lz) view.getLayoutParams()).rightMargin;
        }
    }

    @Override // p000.InterfaceC0862nu
    /* JADX INFO: renamed from: b */
    public final int mo16098b(View view) {
        switch (this.f39422b) {
            case 0:
                return AbstractC0812ly.m16143br(view) - ((C0813lz) view.getLayoutParams()).topMargin;
            default:
                return AbstractC0812ly.m16141bp(view) - ((C0813lz) view.getLayoutParams()).leftMargin;
        }
    }
}
