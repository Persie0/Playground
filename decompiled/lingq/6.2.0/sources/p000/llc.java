package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class llc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eoc f49808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f49809c;

    public /* synthetic */ llc(eoc eocVar, zzr zzrVar, int i) {
        this.f49807a = i;
        this.f49809c = zzrVar;
        this.f49808b = eocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49807a;
        zzr zzrVar = this.f49809c;
        eoc eocVar = this.f49808b;
        switch (i) {
            case 0:
                eocVar.f37647f.m5902V();
                C1045d c1045d = eocVar.f37647f;
                if (c1045d.f12349T != null) {
                    ArrayList arrayList = new ArrayList();
                    c1045d.f12350U = arrayList;
                    arrayList.addAll(c1045d.f12349T);
                }
                nnb nnbVar = c1045d.f12360c;
                C1045d.m5885T(nnbVar);
                kjc kjcVar = (kjc) nnbVar.f60774a;
                String str = zzrVar.f12432a;
                lda.m16130p(str);
                lda.m16127m(str);
                nnbVar.mo12359D();
                nnbVar.m13144E();
                try {
                    SQLiteDatabase sQLiteDatabaseM17559u0 = nnbVar.m17559u0();
                    String[] strArr = {str};
                    int iDelete = sQLiteDatabaseM17559u0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM17559u0.delete("upload_queue", "app_id=?", strArr);
                    ((jkb) ikb.f44247b.f44248a.get()).getClass();
                    if (kjcVar.f47436d.m4869O(null, z8c.f71161c1)) {
                        iDelete += sQLiteDatabaseM17559u0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseM17559u0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68076I.m17925c("Reset analytics data. app, records", str, Integer.valueOf(iDelete2));
                    }
                } catch (SQLiteException e) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17925c("Error resetting analytics data. appId, error", xcc.m24449L(str), e);
                }
                if (zzrVar.f12440h) {
                    c1045d.m5905Y(zzrVar);
                }
                break;
            default:
                C1045d c1045d2 = eocVar.f37647f;
                c1045d2.m5902V();
                c1045d2.m5934n0(zzrVar);
                break;
        }
    }
}
