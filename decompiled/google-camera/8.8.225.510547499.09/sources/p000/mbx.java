package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", m18657c = "F250Worker.kt", m18658d = "uploadAllValidResources", m18659e = {163, 169})
public final class mbx extends omf {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39890a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ F250Worker f39891b;

    /* JADX INFO: renamed from: c */
    public int f39892c;

    /* JADX INFO: renamed from: d */
    public F250Worker f39893d;

    /* JADX INFO: renamed from: e */
    public mau f39894e;

    /* JADX INFO: renamed from: f */
    public ArrayList f39895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbx(F250Worker f250Worker, ols olsVar) {
        super(olsVar);
        this.f39891b = f250Worker;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39890a = obj;
        this.f39892c |= Integer.MIN_VALUE;
        return this.f39891b.m4732k(null, this);
    }
}
