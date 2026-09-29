package p000;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class az7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f7691b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ty1 f7692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f7693d;

    public /* synthetic */ az7(Context context, ty1 ty1Var, String str, int i) {
        this.f7690a = i;
        this.f7691b = context;
        this.f7692c = ty1Var;
        this.f7693d = str;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f7690a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f7693d;
        ty1 ty1Var = this.f7692c;
        Context context = this.f7691b;
        Bitmap bitmap = (Bitmap) obj;
        switch (i) {
            case 0:
                AbstractC3423or.m18247c0(context, bitmap, ss5.m21682G(ty1Var.f63087a, context, str));
                break;
            default:
                AbstractC3423or.m18247c0(context, bitmap, ss5.m21682G(ty1Var.f63087a, context, str));
                break;
        }
        return xfaVar;
    }
}
