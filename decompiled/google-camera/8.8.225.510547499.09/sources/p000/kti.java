package p000;

import android.os.HandlerThread;
import android.provider.Settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kti implements ktg {

    /* JADX INFO: renamed from: a */
    public static final kti f37161a = new kti();

    /* JADX INFO: renamed from: b */
    private final kth[] f37162b;

    private kti() {
        int[] iArrM18394a = oba.m18394a();
        int iMax = 0;
        for (int i = 0; i < 73; i++) {
            int i2 = iArrM18394a[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            iMax = Math.max(iMax, i3);
        }
        this.f37162b = new kth[iMax + 1];
        int[] iArrM18394a2 = oba.m18394a();
        for (int i4 = 0; i4 < 73; i4++) {
            int i5 = iArrM18394a2[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            switch (i6) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 17:
                case 19:
                case 20:
                case 21:
                case 27:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                    kth[] kthVarArr = this.f37162b;
                    kth kthVar = new kth();
                    kthVarArr[i6] = kthVar;
                    int i7 = mws.f41739d;
                    kthVar.f37160a = mzr.f41857a;
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, java.util.List] */
    @Override // p000.ktg
    /* JADX INFO: renamed from: a */
    public final ktf mo14837a(int i, ksr ksrVar) {
        int i2 = i - 1;
        ktc ktcVarM14835a = null;
        switch (i2) {
            case 0:
                return ktb.f37157a;
            case 1:
                return ktb.f37158b;
            case 2:
                lhz lhzVar = new lhz(ksrVar.f37126a.getApplicationContext(), (char[]) null);
                if (ktm.f37166a == null) {
                    synchronized (ktm.f37167b) {
                        if (ktm.f37166a == null) {
                            ktm ktmVar = new ktm(ksrVar.f37126a.getApplicationContext(), lhzVar, null, null, null);
                            HandlerThread handlerThread = new HandlerThread("CheckboxObserverThread");
                            handlerThread.start();
                            ktmVar.f37168c.getContentResolver().registerContentObserver(Settings.Global.getUriFor("multi_cb"), false, new ktl(ktmVar, new jmx(handlerThread.getLooper())));
                            ktm.f37166a = ktmVar;
                        }
                        break;
                    }
                }
                return ktm.f37166a;
            case 3:
                return ktb.f37157a;
            case 4:
                return ktb.f37158b;
            case 5:
                return ktb.f37158b;
            case 6:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 25:
            default:
                kth kthVar = this.f37162b[i2];
                if (kthVar != null) {
                    ?? r8 = kthVar.f37160a;
                    int i3 = ((mzr) r8).f41859c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        kte kteVar = (kte) r8.get(i4);
                        mrm mrmVarM14834a = kteVar.m14836b().m14834a();
                        if (!mrmVarM14834a.mo16813g() || ((mws) mrmVarM14834a.mo16809c()).isEmpty()) {
                            ktcVarM14835a = kteVar.m14835a();
                        }
                    }
                }
                return ktcVarM14835a != null ? ktcVarM14835a : ktb.f37157a;
            case 7:
                return ktb.f37158b;
            case 8:
                return ktb.f37158b;
            case 9:
                return ktb.f37158b;
            case 10:
                return ktb.f37158b;
            case 22:
                return ktb.f37158b;
            case 23:
                return ktb.f37158b;
            case 24:
                return ktb.f37158b;
            case 26:
                return ktb.f37158b;
        }
    }
}
