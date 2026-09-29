package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class nr1 implements xy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53161a;

    /* JADX INFO: renamed from: b */
    public final Object f53162b;

    public /* synthetic */ nr1(Object obj, int i) {
        this.f53161a = i;
        this.f53162b = obj;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f53161a;
        Object obj = this.f53162b;
        switch (i) {
            case 0:
                int i2 = 17;
                return new C3309ls((Context) ((nr1) obj).f53162b, (Object) new nj0(18), (Object) new jj5(i2), i2);
            default:
                return obj;
        }
    }
}
