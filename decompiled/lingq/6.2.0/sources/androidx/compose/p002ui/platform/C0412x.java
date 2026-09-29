package androidx.compose.p002ui.platform;

import androidx.compose.runtime.C0277e;
import androidx.compose.runtime.C0281i;
import androidx.lifecycle.Lifecycle$Event;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import p000.C3552rx;
import p000.gm5;
import p000.qm0;
import p000.rb5;
import p000.sm0;
import p000.ub5;
import p000.vl1;
import p000.wfb;
import p000.xfa;
import p000.y6b;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0412x implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vl1 f4869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0277e f4870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0281i f4871c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f4872d;

    public C0412x(vl1 vl1Var, C0277e c0277e, C0281i c0281i, Ref$ObjectRef ref$ObjectRef) {
        this.f4869a = vl1Var;
        this.f4870b = c0277e;
        this.f4871c = c0281i;
        this.f4872d = ref$ObjectRef;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        boolean z;
        qm0 qm0VarM1284y = null;
        switch (y6b.f69387a[lifecycle$Event.ordinal()]) {
            case 1:
                wfb.m23926u(this.f4869a, null, CoroutineStart.UNDISPATCHED, new C0387x149b840a(this.f4872d, this.f4871c, ub5Var, this, null), 1);
                return;
            case 2:
                C0277e c0277e = this.f4870b;
                if (c0277e != null) {
                    C3552rx c3552rx = c0277e.f3740b;
                    synchronized (c3552rx.f59987b) {
                        try {
                            synchronized (c3552rx.f59987b) {
                                z = c3552rx.f59986a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) c3552rx.f59988c;
                                c3552rx.f59988c = (ArrayList) c3552rx.f59989d;
                                c3552rx.f59989d = arrayList;
                                c3552rx.f59986a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((Continuation) arrayList.get(i)).resumeWith(xfa.f68157a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C0281i c0281i = this.f4871c;
                synchronized (c0281i.f3757d) {
                    if (c0281i.f3775v) {
                        c0281i.f3775v = false;
                        qm0VarM1284y = c0281i.m1284y();
                    }
                    break;
                }
                if (qm0VarM1284y != null) {
                    ((sm0) qm0VarM1284y).resumeWith(xfa.f68157a);
                    return;
                }
                return;
            case 3:
                C0281i c0281i2 = this.f4871c;
                synchronized (c0281i2.f3757d) {
                    c0281i2.f3775v = true;
                }
                return;
            case 4:
                this.f4871c.m1283x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                gm5.m12750e();
                return;
        }
    }
}
