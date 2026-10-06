package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.os.Process;
import android.os.SystemClock;
import androidx.wear.ambient.AmbientMode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.lens.sdk.LensApi;
import com.google.p020vr.ndk.base.DaydreamApi;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lmg implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f38655a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f38656b;

    public /* synthetic */ lmg(Activity activity, int i) {
        this.f38656b = i;
        this.f38655a = activity;
    }

    public /* synthetic */ lmg(BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f38656b = i;
        this.f38655a = pendingResult;
    }

    public lmg(DaydreamApi daydreamApi, int i) {
        this.f38656b = i;
        this.f38655a = daydreamApi;
    }

    public /* synthetic */ lmg(Stream stream, int i) {
        this.f38656b = i;
        this.f38655a = stream;
    }

    public /* synthetic */ lmg(ExecutionException executionException, int i) {
        this.f38656b = i;
        this.f38655a = executionException;
    }

    public lmg(Future future, int i) {
        this.f38656b = i;
        this.f38655a = future;
    }

    public /* synthetic */ lmg(lmi lmiVar, int i) {
        this.f38656b = i;
        this.f38655a = lmiVar;
    }

    public /* synthetic */ lmg(lnj lnjVar, int i) {
        this.f38656b = i;
        this.f38655a = lnjVar;
    }

    public /* synthetic */ lmg(lql lqlVar, int i) {
        this.f38656b = i;
        this.f38655a = lqlVar;
    }

    public /* synthetic */ lmg(lqq lqqVar, int i) {
        this.f38656b = i;
        this.f38655a = lqqVar;
    }

    public lmg(mgy mgyVar, int i) {
        this.f38656b = i;
        this.f38655a = mgyVar;
    }

    public lmg(mji mjiVar, int i) {
        this.f38656b = i;
        this.f38655a = mjiVar;
    }

    public /* synthetic */ lmg(mpx mpxVar, int i) {
        this.f38656b = i;
        this.f38655a = mpxVar;
    }

    public /* synthetic */ lmg(nps npsVar, int i) {
        this.f38656b = i;
        this.f38655a = npsVar;
    }

    public /* synthetic */ lmg(nuk nukVar, int i) {
        this.f38656b = i;
        this.f38655a = nukVar;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, msi] */
    /* JADX WARN: Type inference failed for: r0v53, types: [j$.util.stream.BaseStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.f38656b) {
            case 0:
                Object obj = this.f38655a;
                lij.m15453w();
                lmi lmiVar = (lmi) obj;
                if (lmiVar.f38660b.f38680i != 0) {
                    return;
                }
                lmiVar.f38660b.f38680i = SystemClock.elapsedRealtime();
                lmiVar.f38660b.f38683l.f38670j = true;
                return;
            case 1:
                lmf.m15728b((lmi) this.f38655a);
                return;
            case 2:
                Object obj2 = this.f38655a;
                lij.m15453w();
                lmi lmiVar2 = (lmi) obj2;
                if (lmiVar2.f38660b.f38679h != 0) {
                    return;
                }
                lmiVar2.f38660b.f38679h = SystemClock.elapsedRealtime();
                lmiVar2.f38660b.f38683l.f38669i = true;
                return;
            case 3:
                Object obj3 = this.f38655a;
                try {
                    ((lnj) obj3).f38751c.set(((lnj) obj3).f38752d.m15478a(((lnh) ((lnj) obj3).f38750b.get()).mo15379b() ? ((lnh) ((lnj) obj3).f38750b.get()).f38747a : 0.0f));
                    return;
                } catch (Throwable th) {
                    lnj lnjVar = (lnj) obj3;
                    lnjVar.f38751c.set(lnjVar.f38752d.m15478a(0.0f));
                    return;
                }
            case 4:
                ((BroadcastReceiver.PendingResult) this.f38655a).finish();
                return;
            case 5:
                ((lql) this.f38655a).m15883b();
                return;
            case 6:
                ((lql) this.f38655a).m15882a();
                return;
            case 7:
                lql lqlVar = (lql) this.f38655a;
                if (lqlVar.f38972c.equals("")) {
                    return;
                }
                lpj lpjVar = lqlVar.f38970a;
                nps npsVarM15978b = lqp.m15887b(lpjVar).m15978b(new dvz(lqlVar.f38971b, 12), lpjVar.m15826b());
                npsVarM15978b.mo2282d(new lll(lqlVar, npsVarM15978b, 7), lqlVar.f38970a.m15826b());
                return;
            case 8:
                try {
                    kxk.m14973S(this.f38655a);
                    return;
                } catch (ExecutionException e) {
                    lij.m15454x(new lmg(e, 9));
                    return;
                }
            case 9:
                throw new RuntimeException(((ExecutionException) this.f38655a).getCause());
            case 10:
                if (((Boolean) ((lqq) this.f38655a).f39003c.mo6051a()).booleanValue()) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 11:
                mgy mgyVar = (mgy) this.f38655a;
                mgyVar.f40467b = false;
                aia aiaVar = mgyVar.f40468c.f8129y;
                if (aiaVar != null && aiaVar.m751l()) {
                    mgy mgyVar2 = (mgy) this.f38655a;
                    mgyVar2.m16364a(mgyVar2.f40466a);
                    return;
                }
                mgy mgyVar3 = (mgy) this.f38655a;
                BottomSheetBehavior bottomSheetBehavior = mgyVar3.f40468c;
                if (bottomSheetBehavior.f8128x == 2) {
                    bottomSheetBehavior.m4809D(mgyVar3.f40466a);
                    return;
                }
                return;
            case 12:
                ((mji) this.f38655a).m16447e();
                return;
            case 13:
                mji mjiVar = (mji) this.f38655a;
                ((mjw) mjiVar.getCurrentDrawable()).m16473h(false, false, true);
                if (mjiVar.getProgressDrawable() == null || !mjiVar.getProgressDrawable().isVisible()) {
                    if (mjiVar.getIndeterminateDrawable() == null || !mjiVar.getIndeterminateDrawable().isVisible()) {
                        mjiVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                Object obj4 = this.f38655a;
                try {
                    Object obj5 = ((mpx) obj4).f41309d;
                    try {
                        byte[] bArr = new byte[400];
                        for (boolean z2 = false; ((mpx) obj4).m16790c() && !z2; z2 = z) {
                            int i = 0;
                            while (true) {
                                if (i >= 400) {
                                    z = false;
                                } else {
                                    int i2 = ((InputStream) ((mpx) obj4).f41309d).read(bArr, i, 400 - i);
                                    if (i2 < 0) {
                                        z = true;
                                    } else {
                                        i += i2;
                                    }
                                }
                            }
                            if (((mpx) obj4).m16790c() && i > 0) {
                                ((mpr) ((AmbientMode.AmbientController) ((mpx) obj4).f41311f).f1697a).m16744i(ByteBuffer.wrap(bArr, 0, i));
                            }
                        }
                        ((mpx) obj4).m16788a(null);
                        ((InputStream) obj5).close();
                        return;
                    } catch (Throwable th2) {
                        try {
                            ((InputStream) obj5).close();
                            break;
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                break;
                            } catch (Exception e2) {
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    ((mpx) obj4).m16788a(e3);
                    return;
                }
            case 15:
                this.f38655a.close();
                return;
            case 16:
                this.f38655a.cancel(false);
                return;
            case 17:
                nuk nukVar = (nuk) this.f38655a;
                nukVar.f44665c.close();
                nukVar.f44663a.close();
                return;
            case 18:
                LensApi.m5163h((Activity) this.f38655a);
                return;
            case 19:
                LensApi.m5163h((Activity) this.f38655a);
                return;
            default:
                (((DaydreamApi) this.f38655a).f8449a.getApplicationContext() != null ? ((DaydreamApi) this.f38655a).f8449a.getApplicationContext() : ((DaydreamApi) this.f38655a).f8449a).unbindService(((DaydreamApi) this.f38655a).f8452d);
                ((DaydreamApi) this.f38655a).f8453e = null;
                return;
        }
    }
}
