package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", m18657c = "F250Worker.kt", m18658d = "doWork", m18659e = {58})
public final class mbs extends omf {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39863a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ F250Worker f39864b;

    /* JADX INFO: renamed from: c */
    public int f39865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbs(F250Worker f250Worker, ols olsVar) {
        super(olsVar);
        this.f39864b = f250Worker;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39863a = obj;
        this.f39865c |= Integer.MIN_VALUE;
        return this.f39864b.mo1696b(this);
    }
}
