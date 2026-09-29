package p000;

import com.google.common.util.concurrent.RunnableFutureC1123m;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class dfb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f35572c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35573d;

    public dfb(pcd pcdVar, s3d s3dVar, c26 c26Var, long j) {
        this.f35570a = 2;
        this.f35571b = s3dVar;
        this.f35573d = c26Var;
        this.f35572c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35570a;
        Object obj = this.f35573d;
        long j = this.f35572c;
        Object obj2 = this.f35571b;
        switch (i) {
            case 0:
                jwb jwbVar = (jwb) obj;
                String str = (String) obj2;
                jwbVar.mo12359D();
                lda.m16127m(str);
                C3275kv c3275kv = jwbVar.f46327c;
                if (c3275kv.isEmpty()) {
                    jwbVar.f46328d = j;
                }
                Integer num = (Integer) c3275kv.get(str);
                if (num != null) {
                    c3275kv.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c3275kv.f49254c < 100) {
                    c3275kv.put(str, 1);
                    jwbVar.f46326b.put(str, Long.valueOf(j));
                } else {
                    xcc xccVar = ((kjc) jwbVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17923a("Too many ads visible");
                }
                break;
            case 1:
                jwb jwbVar2 = (jwb) obj;
                String str2 = (String) obj2;
                jwbVar2.mo12359D();
                lda.m16127m(str2);
                C3275kv c3275kv2 = jwbVar2.f46327c;
                Integer num2 = (Integer) c3275kv2.get(str2);
                kjc kjcVar = (kjc) jwbVar2.f60774a;
                if (num2 == null) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17924b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    j0d j0dVar = kjcVar.f47444l;
                    xcc xccVar3 = kjcVar.f47438f;
                    kjc.m15279k(j0dVar);
                    bzc bzcVarM14237H = j0dVar.m14237H(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c3275kv2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        c3275kv2.remove(str2);
                        C3275kv c3275kv3 = jwbVar2.f46326b;
                        Long l = (Long) c3275kv3.get(str2);
                        if (l == null) {
                            kjc.m15280l(xccVar3);
                            xccVar3.f68080f.m17923a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            c3275kv3.remove(str2);
                            jwbVar2.m14733I(str2, jLongValue, bzcVarM14237H);
                        }
                        if (c3275kv2.isEmpty()) {
                            long j2 = jwbVar2.f46328d;
                            if (j2 != 0) {
                                jwbVar2.m14732H(j - j2, bzcVarM14237H);
                                jwbVar2.f46328d = 0L;
                            } else {
                                kjc.m15280l(xccVar3);
                                xccVar3.f68080f.m17923a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                ((s3d) obj2).run();
                c26 c26Var = (c26) obj;
                c26Var.getClass();
                RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m(Executors.callable(this, null));
                sed.m21322b(new a26(runnableFutureC1123m, c26Var.f9353b.schedule(runnableFutureC1123m, j, TimeUnit.MINUTES)));
                break;
        }
    }

    public /* synthetic */ dfb(jwb jwbVar, String str, long j, int i) {
        this.f35570a = i;
        this.f35571b = str;
        this.f35572c = j;
        this.f35573d = jwbVar;
    }
}
