package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbz {

    /* JADX INFO: renamed from: a */
    public final jby f33690a;

    /* JADX INFO: renamed from: b */
    protected boolean f33691b;

    /* JADX INFO: renamed from: c */
    public ArrayList f33692c;

    /* JADX INFO: renamed from: d */
    public ArrayList f33693d;

    /* JADX INFO: renamed from: e */
    public String f33694e;

    /* JADX INFO: renamed from: f */
    public final String f33695f;

    /* JADX INFO: renamed from: g */
    public final nyw f33696g;

    /* JADX INFO: renamed from: h */
    public ktr f33697h;

    /* JADX INFO: renamed from: i */
    public final nxn f33698i;

    public jbz(jcb jcbVar, nyw nywVar) {
        nxn nxnVar = (nxn) ogy.f45974i.m18137O();
        this.f33698i = nxnVar;
        this.f33691b = false;
        this.f33692c = null;
        this.f33693d = null;
        this.f33690a = jcbVar;
        this.f33695f = jcbVar.f33687f;
        this.f33694e = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        ogy ogyVar = (ogy) nxnVar.f44974b;
        ogyVar.f45976a |= 1;
        ogyVar.f45977b = jCurrentTimeMillis;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(((ogy) nxnVar.f44974b).f45977b));
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        ogy ogyVar2 = (ogy) nxnVar.f44974b;
        ogyVar2.f45976a |= 131072;
        ogyVar2.f45981f = seconds;
        if (kuh.m14888c(jcbVar.f33685d)) {
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            ogy ogyVar3 = (ogy) nxnVar.f44974b;
            ogyVar3.f45976a |= 8388608;
            ogyVar3.f45982g = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            ogy ogyVar4 = (ogy) nxnVar.f44974b;
            ogyVar4.f45976a |= 2;
            ogyVar4.f45978c = jElapsedRealtime;
        }
        this.f33696g = nywVar;
    }

    /* JADX INFO: renamed from: a */
    public final jeg m12882a() {
        if (this.f33691b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.f33691b = true;
        return ((jcb) this.f33690a).f33686e.mo12889a(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilder");
        sb.append("uploadAccount: ");
        sb.append(this.f33694e);
        sb.append(", logSourceName: ");
        sb.append(this.f33695f);
        sb.append(", qosTier: ");
        sb.append(0);
        sb.append(", veMessage: ");
        sb.append((Object) null);
        sb.append(", testCodes: null, mendelPackages: ");
        ArrayList arrayList = this.f33692c;
        sb.append(arrayList != null ? jby.m12878a(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList2 = this.f33693d;
        sb.append(arrayList2 != null ? jby.m12878a(arrayList2) : null);
        sb.append(", experimentTokens: null, experimentTokensBytes: ");
        int i = jby.f33680a;
        sb.append("null, addPhenotype: ");
        sb.append(true);
        sb.append("]");
        return sb.toString();
    }
}
