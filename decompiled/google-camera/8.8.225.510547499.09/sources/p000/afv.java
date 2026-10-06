package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.core.view.ViewKt$allViews$1", m18657c = "View.kt", m18658d = "invokeSuspend", m18659e = {414, 416})
public final class afv extends omk implements onm {

    /* JADX INFO: renamed from: a */
    int f284a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ View f285b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Object f286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afv(View view, ols olsVar) {
        super(olsVar);
        this.f285b = view;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((afv) mo562c((opc) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r1.m18840c(r4, r3) == r0) goto L12;
     */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo561b(Object obj) {
        opc opcVar;
        View view;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f284a) {
            case 0:
                lkm.m15592s(obj);
                opcVar = (opc) this.f286c;
                View view2 = this.f285b;
                this.f286c = opcVar;
                this.f284a = 1;
                if (opcVar.mo18838a(view2, this) != omaVar) {
                    view = this.f285b;
                    if (view instanceof ViewGroup) {
                        opa opaVarM117f = abj.m117f((ViewGroup) view);
                        this.f286c = null;
                        this.f284a = 2;
                        break;
                    }
                    return oki.f46196a;
                }
                return omaVar;
            case 1:
                opcVar = (opc) this.f286c;
                lkm.m15592s(obj);
                view = this.f285b;
                if (view instanceof ViewGroup) {
                    opa opaVarM117f2 = abj.m117f((ViewGroup) view);
                    this.f286c = null;
                    this.f284a = 2;
                    break;
                }
                return oki.f46196a;
            default:
                lkm.m15592s(obj);
                return oki.f46196a;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        afv afvVar = new afv(this.f285b, olsVar);
        afvVar.f286c = obj;
        return afvVar;
    }
}
