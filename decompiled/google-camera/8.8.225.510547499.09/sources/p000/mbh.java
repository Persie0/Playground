package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker", m18657c = "F250AutoWorker.kt", m18658d = "doWork", m18659e = {46})
public final class mbh extends omf {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39792a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ F250AutoWorker f39793b;

    /* JADX INFO: renamed from: c */
    public int f39794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbh(F250AutoWorker f250AutoWorker, ols olsVar) {
        super(olsVar);
        this.f39793b = f250AutoWorker;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39792a = obj;
        this.f39794c |= Integer.MIN_VALUE;
        return this.f39793b.mo1696b(this);
    }
}
