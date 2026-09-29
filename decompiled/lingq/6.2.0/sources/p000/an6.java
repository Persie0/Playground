package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.lingq.core.domain.model.milestones.Milestone;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class an6 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f880b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Milestone f881c;

    public /* synthetic */ an6(int i, Context context, Milestone milestone) {
        this.f879a = i;
        this.f880b = context;
        this.f881c = milestone;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f879a;
        xfa xfaVar = xfa.f68157a;
        Milestone milestone = this.f881c;
        Context context = this.f880b;
        Bitmap bitmap = (Bitmap) obj;
        switch (i) {
            case 0:
                AbstractC3423or.m18247c0(context, bitmap, ss5.m21681F(context, milestone));
                break;
            case 1:
                AbstractC3423or.m18247c0(context, bitmap, ss5.m21681F(context, milestone));
                break;
            default:
                AbstractC3423or.m18247c0(context, bitmap, ss5.m21681F(context, milestone));
                break;
        }
        return xfaVar;
    }
}
