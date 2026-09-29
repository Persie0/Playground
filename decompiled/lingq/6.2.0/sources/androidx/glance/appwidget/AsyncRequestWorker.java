package androidx.glance.appwidget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.coroutines.Continuation;
import p000.C3386nv;
import p000.dp5;
import p000.nn1;
import p000.or4;
import p000.ph2;
import p000.sz1;
import p000.v72;
import p000.vz1;
import p000.xq3;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncRequestWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xq3 f5836g;

    /* JADX INFO: renamed from: h */
    public final or4 f5837h;

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v72 v72Var = ph2.f56212a;
        this.f5836g = dp5.f36000a;
        sz1 sz1Var = workerParameters.f7166b;
        sz1Var.getClass();
        Object obj = sz1Var.f61646a.get("request");
        byte[] bArr = null;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    C3386nv.m17635v("null cannot be cast to non-null type kotlin.Byte");
                    throw null;
                }
                bArr2[i] = ((Byte) obj2).byteValue();
            }
            bArr = bArr2;
        }
        this.f5837h = or4.m18312F(bArr);
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) {
        return vz1.m23649s(new AsyncRequestWorker$doWork$2(this, null), continuation);
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: e */
    public final nn1 mo2214e() {
        return this.f5836g;
    }
}
