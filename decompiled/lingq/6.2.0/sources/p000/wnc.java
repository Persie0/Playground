package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzr;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wnc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f67104b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67105c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67106d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f67107e;

    public /* synthetic */ wnc(int i, Object obj, Object obj2, Object obj3, String str) {
        this.f67103a = i;
        this.f67105c = obj;
        this.f67106d = obj2;
        this.f67104b = str;
        this.f67107e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f67103a;
        Object obj = this.f67107e;
        Object obj2 = this.f67106d;
        Object obj3 = this.f67105c;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                zzr zzrVar = (zzr) obj;
                boolean zIsEmpty = bundle.isEmpty();
                C1045d c1045d = ((eoc) obj3).f37647f;
                String str = this.f67104b;
                if (zIsEmpty) {
                    nnb nnbVar = c1045d.f12360c;
                    C1045d.m5885T(nnbVar);
                    nnbVar.mo12359D();
                    nnbVar.m13144E();
                    try {
                        nnbVar.m17559u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e) {
                        xcc xccVar = ((kjc) nnbVar.f60774a).f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17924b(e, "Error clearing default event params");
                        return;
                    }
                } else {
                    nnb nnbVar2 = c1045d.f12360c;
                    C1045d.m5885T(nnbVar2);
                    kjc kjcVar = (kjc) nnbVar2.f60774a;
                    nnbVar2.mo12359D();
                    nnbVar2.m13144E();
                    vob vobVar = new vob((kjc) nnbVar2.f60774a, "", str, "dep", 0L, 0L, 0L, bundle);
                    dad dadVar = nnbVar2.f55716b.f12367g;
                    C1045d.m5885T(dadVar);
                    byte[] bArrM3725a = dadVar.m10249d0(vobVar).m3725a();
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68076I.m17925c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrM3725a.length));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("parameters", bArrM3725a);
                    try {
                        if (nnbVar2.m17559u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            kjc.m15280l(xccVar2);
                            xccVar2.f68080f.m17924b(xcc.m24449L(str), "Failed to insert default event parameters (got -1). appId");
                        }
                    } catch (SQLiteException e2) {
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17925c("Error storing default event parameters. appId", xcc.m24449L(str), e2);
                    }
                    nnb nnbVar3 = c1045d.f12360c;
                    C1045d.m5885T(nnbVar3);
                    long j = zzrVar.f12430Y;
                    try {
                        if (nnbVar3.m17541a0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j)}, 0L) <= 0 && nnbVar3.m17541a0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j)}, 0L) > 0) {
                            nnb nnbVar4 = c1045d.f12360c;
                            C1045d.m5885T(nnbVar4);
                            nnbVar4.m17537W(str, Long.valueOf(j), null, bundle);
                        }
                    } catch (SQLiteException e3) {
                        xcc xccVar3 = ((kjc) nnbVar3.f60774a).f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68080f.m17924b(e3, "Error checking backfill conditions");
                        return;
                    }
                }
                break;
            default:
                qn3 qn3Var = pzc.f57062a;
                Level level = (Level) obj3;
                AbstractC3572sf abstractC3572sf = (AbstractC3572sf) qn3Var.f57974a;
                boolean zMo3704A = abstractC3572sf.mo3704A(level);
                String str2 = (String) abstractC3572sf.f60774a;
                ((xfb) sfb.f60802a).getClass();
                cgb.f10033b.mo4643a(str2, level, zMo3704A);
                ((qmd) ((qmd) (!zMo3704A ? qn3.f57973f : new rmd(qn3Var, level)).mo10513c((Throwable) obj2)).mo10511a()).mo10512b(this.f67104b, (Object[]) obj);
                break;
        }
    }
}
