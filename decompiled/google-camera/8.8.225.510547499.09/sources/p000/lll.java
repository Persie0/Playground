package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.p020vr.ndk.base.DaydreamApi;
import java.util.Map;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lll implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f38583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f38584b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f38585c;

    public /* synthetic */ lll(Context context, String str, int i) {
        this.f38585c = i;
        this.f38583a = context;
        this.f38584b = str;
    }

    public lll(DaydreamApi daydreamApi, ogc ogcVar, int i) {
        this.f38585c = i;
        this.f38583a = daydreamApi;
        this.f38584b = ogcVar;
    }

    public /* synthetic */ lll(lgx lgxVar, Runnable runnable, int i) {
        this.f38585c = i;
        this.f38583a = lgxVar;
        this.f38584b = runnable;
    }

    public /* synthetic */ lll(llm llmVar, String str, int i) {
        this.f38585c = i;
        this.f38583a = llmVar;
        this.f38584b = str;
    }

    public /* synthetic */ lll(lln llnVar, String str, int i) {
        this.f38585c = i;
        this.f38583a = llnVar;
        this.f38584b = str;
    }

    public /* synthetic */ lll(lnt lntVar, ohb ohbVar, int i) {
        this.f38585c = i;
        this.f38583a = lntVar;
        this.f38584b = ohbVar;
    }

    public /* synthetic */ lll(lpj lpjVar, String str, int i) {
        this.f38585c = i;
        this.f38583a = lpjVar;
        this.f38584b = str;
    }

    public /* synthetic */ lll(lql lqlVar, nps npsVar, int i) {
        this.f38585c = i;
        this.f38583a = lqlVar;
        this.f38584b = npsVar;
    }

    public lll(lyz lyzVar, nbr nbrVar, int i, byte[] bArr) {
        this.f38585c = i;
        this.f38584b = lyzVar;
        this.f38583a = nbrVar;
    }

    public /* synthetic */ lll(nsy nsyVar, kpw kpwVar, int i) {
        this.f38585c = i;
        this.f38584b = nsyVar;
        this.f38583a = kpwVar;
    }

    public lll(opx opxVar, otb otbVar, int i) {
        this.f38585c = i;
        this.f38583a = opxVar;
        this.f38584b = otbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, opx] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, ohb] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38585c) {
            case 0:
                ((llm) this.f38583a).f38587b.f38591a.mo15708a(5, (String) this.f38584b);
                return;
            case 1:
                Object obj = this.f38583a;
                ?? r1 = this.f38584b;
                int i = ((lgx) obj).f38242a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                r1.run();
                return;
            case 2:
                ((lln) this.f38583a).f38589b.f38591a.mo15708a(6, (String) this.f38584b);
                return;
            case 3:
                ((lnt) this.f38583a).m15772a(this.f38584b);
                return;
            case 4:
                Object obj2 = this.f38583a;
                Object obj3 = this.f38584b;
                SharedPreferences sharedPreferencesM15895a = lqr.m15895a((Context) obj2);
                SharedPreferences.Editor editorEdit = null;
                for (Map.Entry<String, ?> entry : sharedPreferencesM15895a.getAll().entrySet()) {
                    if ((entry.getValue() instanceof String) && entry.getValue().equals(obj3)) {
                        if (editorEdit == null) {
                            editorEdit = sharedPreferencesM15895a.edit();
                        }
                        editorEdit.remove(entry.getKey());
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    return;
                }
                return;
            case 5:
                Object obj4 = this.f38583a;
                Object obj5 = this.f38584b;
                mrm mrmVar = lqh.f38959a;
                if (lqm.m15885a(((lpj) obj4).f38894c).containsKey(obj5)) {
                    return;
                }
                Log.e("PhenotypeCombinedFlags", "Config package " + ((String) obj5) + " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                return;
            case 6:
                ((lql) this.f38583a).m15884c(this.f38584b);
                return;
            case 7:
                Object obj6 = this.f38583a;
                try {
                    kxk.m14973S(this.f38584b);
                    return;
                } catch (Exception e) {
                    Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + ((lql) obj6).f38971b + YmzeHXaMYOLk.zydnwlqdj, e);
                    return;
                }
            case 8:
                ((ConcurrentHashMap) ((lyz) this.f38584b).f39584a).remove(this.f38583a);
                return;
            case 9:
                Object obj7 = this.f38584b;
                ?? r2 = this.f38583a;
                synchronized (((nsy) obj7).f44456a) {
                    ((nsy) obj7).f44457b = true;
                    if (((nsy) obj7).f44459d && !((nsy) obj7).f44458c) {
                        r2.close();
                        ((nsy) obj7).f44458c = true;
                    }
                    break;
                }
                return;
            case 10:
                ogb ogbVar = ((DaydreamApi) this.f38583a).f8454f;
                if (ogbVar != null) {
                    try {
                        ?? r3 = this.f38584b;
                        Parcel parcelM3398a = ogbVar.m3398a();
                        cbs.m3405d(parcelM3398a, r3);
                        Parcel parcelM3399y = ogbVar.m3399y(9, parcelM3398a);
                        boolean zM3406e = cbs.m3406e(parcelM3399y);
                        parcelM3399y.recycle();
                        if (zM3406e) {
                            return;
                        }
                    } catch (RemoteException e2) {
                        Log.e("DaydreamApi", "RemoteException while launching VR transition: ", e2);
                    }
                }
                Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
                try {
                    ((ogc) this.f38584b).m18474b();
                    return;
                } catch (RemoteException e3) {
                    return;
                }
            default:
                this.f38583a.mo18872c((oqo) this.f38584b, oki.f46196a);
                return;
        }
    }
}
