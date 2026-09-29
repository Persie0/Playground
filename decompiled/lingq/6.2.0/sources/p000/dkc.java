package p000;

import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;

/* JADX INFO: loaded from: classes.dex */
public final class dkc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f35757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f35758c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f35759d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f35760e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f35761f;

    public /* synthetic */ dkc(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.f35756a = i;
        this.f35757b = str;
        this.f35758c = str2;
        this.f35760e = obj2;
        this.f35759d = j;
        this.f35761f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35756a;
        Object obj = this.f35761f;
        switch (i) {
            case 0:
                eoc eocVar = (eoc) obj;
                String str = this.f35758c;
                String str2 = this.f35757b;
                if (str2 != null) {
                    bzc bzcVar = new bzc(this.f35759d, (String) this.f35760e, str2);
                    C1045d c1045d = eocVar.f37647f;
                    c1045d.mo5913d().mo12359D();
                    String str3 = c1045d.f12359b0;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    c1045d.f12359b0 = str;
                    c1045d.f12357a0 = bzcVar;
                } else {
                    C1045d c1045d2 = eocVar.f37647f;
                    c1045d2.mo5913d().mo12359D();
                    String str4 = c1045d2.f12359b0;
                    if (str4 == null || str4.equals(str)) {
                        c1045d2.f12359b0 = str;
                        c1045d2.f12357a0 = null;
                    }
                }
                break;
            default:
                ((C1043b) obj).m5858O(this.f35759d, this.f35760e, this.f35757b, this.f35758c);
                break;
        }
    }
}
