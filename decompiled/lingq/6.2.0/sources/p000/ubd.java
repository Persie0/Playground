package p000;

import android.net.Uri;
import com.google.common.base.AbstractC1081a;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ubd implements InterfaceC3053gw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63686a;

    /* JADX INFO: renamed from: b */
    public final Object f63687b;

    /* JADX INFO: renamed from: c */
    public final Object f63688c;

    public /* synthetic */ ubd(int i, Object obj, Object obj2) {
        this.f63686a = i;
        this.f63687b = obj;
        this.f63688c = obj2;
    }

    @Override // p000.InterfaceC3053gw
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f63686a) {
            case 0:
                fcd fcdVar = (fcd) this.f63687b;
                return ((d2d) fcdVar.f38874d.get()).m9999a(new ccd(fcdVar, (zcd) this.f63688c));
            case 1:
                List list = (List) this.f63687b;
                xkd xkdVar = (xkd) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                d14 d14VarListIterator = ((ImmutableList) list).listIterator(0);
                if (d14VarListIterator.hasNext()) {
                    d14VarListIterator.next().getClass();
                    ho2.m13383c();
                    return null;
                }
                wjd wjdVar = new wjd(this, arrayList, size);
                int i = jmd.f45851a;
                int i2 = 3;
                ubd ubdVar = new ubd(i2, qld.m20020a(), wjdVar);
                Executor executorM6404a = AbstractC1120j.m6404a();
                return AbstractC1118h.m6403g(AbstractC1118h.m6402f(AbstractC1118h.m6403g(AbstractC1118h.m6400d(xkdVar.f68323a.f10204e.m62e()), new ubd(i2, qld.m20020a(), new pkd(xkdVar, ubdVar, executorM6404a, 2)), AbstractC1120j.m6404a()), AbstractC1081a.m6266c(), AbstractC1120j.m6404a()), new ubd(i2, qld.m20020a(), new wjd(this, size, arrayList)), AbstractC1120j.m6404a());
            case 2:
                rkd rkdVar = (rkd) this.f63687b;
                C3780y1 c3780y1 = (C3780y1) this.f63688c;
                rkdVar.m20686c((Uri) AbstractC1118h.m6398b(rkdVar.f59453b), obj);
                synchronized (rkdVar.f59459h) {
                    rkdVar.f59461j = c3780y1;
                    break;
                }
                return AbstractC1118h.m6399c(obj);
            default:
                gmd gmdVar = (gmd) this.f63687b;
                fmd fmdVarM20022c = qld.m20022c();
                gmd gmdVarM20021b = qld.m20021b(fmdVarM20022c, gmdVar);
                try {
                    ListenableFuture listenableFutureApply = ((InterfaceC3053gw) this.f63688c).apply(obj);
                    if (listenableFutureApply == null) {
                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                    }
                    qld.m20021b(fmdVarM20022c, gmdVarM20021b);
                    return listenableFutureApply;
                } catch (Throwable th) {
                    try {
                        pld.m19392a(th);
                        throw th;
                    } catch (Throwable th2) {
                        qld.m20021b(fmdVarM20022c, gmdVarM20021b);
                        throw th2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f63686a) {
            case 3:
                InterfaceC3053gw interfaceC3053gw = (InterfaceC3053gw) this.f63688c;
                StringBuilder sb = new StringBuilder(interfaceC3053gw.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(interfaceC3053gw);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
