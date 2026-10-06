package p000;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.List;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gyc implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f26818a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f26819b;

    public /* synthetic */ gyc(Bitmap bitmap, int i) {
        this.f26819b = i;
        this.f26818a = bitmap;
    }

    public /* synthetic */ gyc(gyu gyuVar, int i) {
        this.f26819b = i;
        this.f26818a = gyuVar;
    }

    public /* synthetic */ gyc(hgm hgmVar, int i) {
        this.f26819b = i;
        this.f26818a = hgmVar;
    }

    public /* synthetic */ gyc(hha hhaVar, int i) {
        this.f26819b = i;
        this.f26818a = hhaVar;
    }

    public /* synthetic */ gyc(hhe hheVar, int i) {
        this.f26819b = i;
        this.f26818a = hheVar;
    }

    public /* synthetic */ gyc(hhh hhhVar, int i) {
        this.f26819b = i;
        this.f26818a = hhhVar;
    }

    public /* synthetic */ gyc(hhr hhrVar, int i) {
        this.f26819b = i;
        this.f26818a = hhrVar;
    }

    public /* synthetic */ gyc(ilk ilkVar, int i) {
        this.f26819b = i;
        this.f26818a = ilkVar;
    }

    public /* synthetic */ gyc(List list, int i) {
        this.f26819b = i;
        this.f26818a = list;
    }

    public /* synthetic */ gyc(mrm mrmVar, int i) {
        this.f26819b = i;
        this.f26818a = mrmVar;
    }

    public /* synthetic */ gyc(mwn mwnVar, int i) {
        this.f26819b = i;
        this.f26818a = mwnVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26819b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f26819b) {
            case 0:
                ((gyi) obj).mo3961n((Bitmap) this.f26818a);
                break;
            case 1:
                ((gyi) obj).mo3957j((gyu) this.f26818a);
                break;
            case 2:
                ((gyi) obj).mo3965r((gyu) this.f26818a);
                break;
            case 3:
                ((gyi) obj).mo3959l((gyu) this.f26818a);
                break;
            case 4:
                ((hgm) this.f26818a).f27696g.setVisibility(8);
                break;
            case 5:
                hgm hgmVar = (hgm) this.f26818a;
                hgmVar.f27696g.setVisibility(0);
                if (hgmVar.f27696g.getWidth() == 0 || hgmVar.f27696g.getHeight() == 0) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    hgmVar.f27696g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                hgmVar.f27696g.setRotation(jvh.m13573u(hgmVar.f27697h));
                View view = hgmVar.f27696g;
                view.setPivotX(view.getMeasuredHeight() / 2.0f);
                View view2 = hgmVar.f27696g;
                view2.setPivotY(view2.getMeasuredHeight() / 2.0f);
                if (!hgmVar.f27697h.equals(ilk.LANDSCAPE)) {
                    hgmVar.f27696g.setTranslationY(0.0f);
                } else {
                    View view3 = hgmVar.f27696g;
                    view3.setTranslationY(-(view3.getMeasuredWidth() - hgmVar.f27696g.getMeasuredHeight()));
                }
                break;
            case 6:
                ((hha) this.f26818a).f27784c.mo10045l((String) obj, true);
                break;
            case 7:
                ((hha) this.f26818a).f27784c.mo10045l((String) obj, false);
                break;
            case 8:
                ((hhe) this.f26818a).setVisibility(8);
                break;
            case 9:
                hhh hhhVar = (hhh) this.f26818a;
                hhhVar.setVisibility(0);
                hhhVar.m10295f(false);
                hhhVar.m10296g(mrm.m16829i(hhe.f27795a));
                hhhVar.m10294e(hhhVar.getChildCount() - 1);
                hhhVar.setPadding(0, hhhVar.m10290a(C0100R.dimen.social_share_menu_top_padding), 0, hhhVar.m10290a(C0100R.dimen.social_share_menu_bottom_padding));
                break;
            case 10:
                jvh.m13578z((hhe) obj, (ilk) this.f26818a);
                break;
            case 11:
                hhh hhhVar2 = (hhh) this.f26818a;
                hhhVar2.m10295f(true);
                hhhVar2.m10296g(mqu.f41450a);
                break;
            case 12:
                hhh hhhVar3 = (hhh) this.f26818a;
                hhhVar3.setVisibility(0);
                hhhVar3.m10295f(false);
                hhhVar3.m10294e(0);
                hhhVar3.setPadding(0, 0, 0, 0);
                break;
            case 13:
                ((hhh) this.f26818a).m10295f(true);
                break;
            case 14:
                ((hhe) obj).setColorFilter((ColorFilter) ((mrm) this.f26818a).mo16812f());
                break;
            case 15:
                ((hhh) this.f26818a).m10295f(false);
                break;
            case 16:
                ((hhh) this.f26818a).setVisibility(8);
                break;
            case 17:
                ((hhr) this.f26818a).m10312k();
                break;
            case 18:
                ((hhr) this.f26818a).f27841m.run();
                break;
            case 19:
                ((mwn) this.f26818a).m17082g((Animator) obj);
                break;
            default:
                hhe hheVar = (hhe) obj;
                boolean z = !this.f26818a.contains(hheVar.f27797c.activityInfo.packageName);
                hheVar.setEnabled(z);
                hheVar.setColorFilter(z ? null : hhe.f27795a);
                break;
        }
    }
}
