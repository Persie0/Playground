package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class x26 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67678b;

    public /* synthetic */ x26(Object obj, int i) {
        this.f67677a = i;
        this.f67678b = obj;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.f67677a;
        Object obj = this.f67678b;
        switch (i) {
            case 0:
                return (float) ((fo2) obj).mo3907b(f);
            case 1:
                return (float) ((fo2) obj).mo3907b(f);
            case 2:
                return (float) ((fo2) obj).mo3907b(f);
            default:
                return ((ita) obj).f44560u.getInterpolation(f);
        }
    }
}
