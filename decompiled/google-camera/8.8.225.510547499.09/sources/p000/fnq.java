package p000;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnq implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22799a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22800b;

    public fnq(ciq ciqVar, int i) {
        this.f22800b = i;
        this.f22799a = ciqVar;
    }

    public fnq(foc focVar, int i) {
        this.f22800b = i;
        this.f22799a = focVar;
    }

    public fnq(iha ihaVar, int i) {
        this.f22800b = i;
        this.f22799a = ihaVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.f22800b;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.f22800b;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        ieq ieqVar;
        int iM11320a;
        switch (this.f22800b) {
            case 0:
                int iM9211c = ggi.m9211c(((foc) this.f22799a).f22842U.m5650I());
                foc focVar = (foc) this.f22799a;
                if (((iM9211c - focVar.f22894y) + 360) % 360 == 180) {
                    focVar.m8618I();
                }
                ((foc) this.f22799a).f22894y = iM9211c;
                break;
            case 1:
                int iM9211c2 = ggi.m9211c(((ciq) this.f22799a).f5858x);
                ciq ciqVar = (ciq) this.f22799a;
                if (((iM9211c2 - ciqVar.f5847m) + 360) % 360 == 180 && (ieqVar = ciqVar.f5849o) != null) {
                    ieqVar.mo11147c();
                    ((ciq) this.f22799a).f5852r.mo11156g();
                }
                ((ciq) this.f22799a).f5847m = iM9211c2;
                break;
            default:
                if (i == 0 && (iM11320a = ((iha) this.f22799a).m11320a()) > 0 && ((iha) this.f22799a).f30922e.get() != iM11320a) {
                    ((iha) this.f22799a).m11321b(false);
                    break;
                }
                break;
        }
    }
}
