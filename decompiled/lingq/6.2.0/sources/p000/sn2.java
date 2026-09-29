package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class sn2 extends AbstractC3184kh {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f61055y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn2(int i) {
        super(14);
        this.f61055y = i;
    }

    @Override // p000.AbstractC3184kh
    /* JADX INFO: renamed from: H */
    public final void mo11327H(Object obj, float f) {
        switch (this.f61055y) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setScaleX(f);
                break;
            case 2:
                ((View) obj).setScaleY(f);
                break;
            case 3:
                ((View) obj).setRotation(f);
                break;
            case 4:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }

    @Override // p000.AbstractC3184kh
    /* JADX INFO: renamed from: u */
    public final float mo11328u(Object obj) {
        switch (this.f61055y) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}
