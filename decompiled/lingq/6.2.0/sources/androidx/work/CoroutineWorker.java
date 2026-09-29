package androidx.work;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractC3208a;
import p000.eh0;
import p000.fa4;
import p000.gm0;
import p000.lz6;
import p000.nn1;
import p000.pg5;
import p000.sd4;
import p000.xn1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CoroutineWorker extends pg5 {

    /* JADX INFO: renamed from: e */
    public final WorkerParameters f7154e;

    /* JADX INFO: renamed from: f */
    public final xn1 f7155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f7154e = workerParameters;
        this.f7155f = xn1.f68390c;
    }

    @Override // p000.pg5
    /* JADX INFO: renamed from: a */
    public final gm0 mo2899a() {
        nn1 nn1VarMo2214e = mo2214e();
        sd4 sd4VarM15434a = AbstractC3208a.m15434a();
        nn1VarMo2214e.getClass();
        return lz6.m16582g(eh0.m11113J(nn1VarMo2214e, sd4VarM15434a), new CoroutineWorker$getForegroundInfoAsync$1(this, null));
    }

    @Override // p000.pg5
    /* JADX INFO: renamed from: c */
    public final gm0 mo2900c() {
        nn1 nn1VarMo2214e = !fa4.m11650l(mo2214e(), xn1.f68390c) ? mo2214e() : this.f7154e.f7169e;
        nn1VarMo2214e.getClass();
        return lz6.m16582g(eh0.m11113J(nn1VarMo2214e, AbstractC3208a.m15434a()), new CoroutineWorker$startWork$1(this, null));
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo2213d(Continuation continuation);

    /* JADX INFO: renamed from: e */
    public nn1 mo2214e() {
        return this.f7155f;
    }
}
