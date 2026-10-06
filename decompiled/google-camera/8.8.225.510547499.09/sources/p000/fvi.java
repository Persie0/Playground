package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.rewind.RewindThumbnailScrollView;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import p021j$.util.Collection$EL;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fvi implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23630a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23631b;

    public /* synthetic */ fvi(fvh fvhVar, int i) {
        this.f23631b = i;
        this.f23630a = fvhVar;
    }

    public /* synthetic */ fvi(geo geoVar, int i) {
        this.f23631b = i;
        this.f23630a = geoVar;
    }

    public /* synthetic */ fvi(gfc gfcVar, int i) {
        this.f23631b = i;
        this.f23630a = gfcVar;
    }

    public /* synthetic */ fvi(ggb ggbVar, int i) {
        this.f23631b = i;
        this.f23630a = ggbVar;
    }

    public /* synthetic */ fvi(gyu gyuVar, int i) {
        this.f23631b = i;
        this.f23630a = gyuVar;
    }

    public /* synthetic */ fvi(String str, int i) {
        this.f23631b = i;
        this.f23630a = str;
    }

    public /* synthetic */ fvi(Executor executor, int i) {
        this.f23631b = i;
        this.f23630a = executor;
    }

    public /* synthetic */ fvi(jwf jwfVar, int i) {
        this.f23631b = i;
        this.f23630a = jwfVar;
    }

    public /* synthetic */ fvi(jww jwwVar, int i) {
        this.f23631b = i;
        this.f23630a = jwwVar;
    }

    public /* synthetic */ fvi(kiq kiqVar, int i) {
        this.f23631b = i;
        this.f23630a = kiqVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f23631b) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [gfa, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f23631b) {
            case 0:
                ((fvh) this.f23630a).m8828a((String) obj);
                return;
            case 1:
                ((fvh) this.f23630a).m8828a((String) obj);
                return;
            case 2:
                this.f23630a.execute((Runnable) obj);
                return;
            case 3:
                ((jwf) this.f23630a).mo3415bf((Integer) obj);
                return;
            case 4:
                ((geo) this.f23630a).m9137x((gfb) obj);
                return;
            case 5:
                ?? r2 = this.f23630a;
                gfb gfbVar = (gfb) obj;
                gfbVar.mo5840z(r2, gfbVar.mo5778n(r2) && gfbVar.mo5777m(r2));
                return;
            case 6:
                Object obj2 = this.f23630a;
                gfb gfbVar2 = (gfb) obj;
                jww jwwVarMo5773i = gfbVar2.mo5773i();
                gev gevVarMo5771g = gfbVar2.mo5771g();
                jwwVarMo5773i.mo3831be();
                geo geoVar = (geo) obj2;
                geoVar.f24413q.m13537d(jwwVarMo5773i.mo3830a(new ecr(geoVar, gevVarMo5771g, 14), geoVar.f24399c));
                return;
            case 7:
                ((gfb) obj).mo5775k(this.f23630a);
                return;
            case 8:
                gev gevVar = (gev) obj;
                OptionsMenuView optionsMenuView = ((geo) this.f23630a).f24404h;
                synchronized (optionsMenuView) {
                    Collection$EL.removeIf(optionsMenuView.f6842b, new gek(optionsMenuView, gevVar, 5));
                    break;
                }
                return;
            case 9:
                ?? r0 = this.f23630a;
                gfb gfbVar3 = (gfb) obj;
                jww jwwVarMo5773i2 = gfbVar3.mo5773i();
                geo geoVar2 = (geo) r0;
                gfl gflVarM9151b = gew.m9151b(gfbVar3, geoVar2.f24405i.getResources());
                gfc gfcVar = (gfc) jwwVarMo5773i2.mo3831be();
                if (gfcVar == gfc.UNKNOWN) {
                    ((nbe) ((nbe) geo.f24397a.m17252c()).mo17276G((char) 2598)).mo17293r("Property value %s is not associated with a MenuOption.", jwwVarMo5773i2.mo3831be());
                }
                mws mwsVar = (mws) Collection$EL.stream(gfbVar3.mo5774j()).map(new gei(geoVar2, gfbVar3, 2)).collect(muc.f41626a);
                boolean zMo5777m = gfbVar3.mo5777m(r0);
                OptionsMenuView optionsMenuView2 = geoVar2.f24404h;
                int iMo9148x = gfbVar3.mo9148x();
                gff gffVarMo5772h = gfbVar3.mo5772h();
                int iMo5767c = zMo5777m ? 0 : gfbVar3.mo5767c();
                boolean zMo5776l = gfbVar3.mo5776l();
                synchronized (optionsMenuView2) {
                    Context context = optionsMenuView2.getContext();
                    gfe gfeVar = optionsMenuView2.f6846f;
                    gfeVar.getClass();
                    int i = iMo5767c;
                    ggg gggVar = new ggg(context, gflVarM9151b, gfcVar, gfeVar, gffVarMo5772h, gfbVar3, iMo9148x, false, zMo5776l);
                    gggVar.setId(View.generateViewId());
                    String string = i == 0 ? null : optionsMenuView2.getResources().getString(i);
                    gggVar.m9207e();
                    if (zMo5777m) {
                        for (int i2 = 0; i2 < mwsVar.size(); i2++) {
                            if (!((Boolean) mwsVar.get(i2)).booleanValue()) {
                                gggVar.m9205c(((gfm) gggVar.f24655c.f24583d.get(i2)).f24584a);
                            }
                        }
                    } else {
                        gggVar.m9204b(string);
                        gggVar.setEnabled(false);
                    }
                    for (int i3 = 0; i3 < optionsMenuView2.m4247a(); i3++) {
                        LinearLayout linearLayout = optionsMenuView2.f6847g;
                        linearLayout.getClass();
                        View childAt = linearLayout.getChildAt(i3);
                        if ((childAt instanceof ggg) && iMo9148x < ((ggg) childAt).f24656d) {
                            LinearLayout linearLayout2 = optionsMenuView2.f6847g;
                            linearLayout2.getClass();
                            linearLayout2.addView(gggVar, i3);
                            optionsMenuView2.f6842b.add(gggVar);
                        }
                        break;
                    }
                    LinearLayout linearLayout3 = optionsMenuView2.f6847g;
                    linearLayout3.getClass();
                    linearLayout3.addView(gggVar, i3);
                    optionsMenuView2.f6842b.add(gggVar);
                    break;
                }
                return;
            case 10:
                ?? r1 = this.f23630a;
                gfa gfaVar = (gfa) obj;
                nbh nbhVar = gfy.f24631a;
                gfaVar.mo9110I().m13537d(r1.mo3830a(new gcu(gfaVar, 10), not.INSTANCE));
                return;
            case 11:
                ((ggb) this.f23630a).f24638a.setTranslationY(0.0f);
                return;
            case 12:
                ((ggb) this.f23630a).f24638a.sendAccessibilityEvent(8);
                return;
            case 13:
                ((ggg) obj).m9205c((gfc) this.f23630a);
                return;
            case 14:
                ggg gggVar2 = (ggg) obj;
                gggVar2.m9204b((String) this.f23630a);
                gggVar2.setEnabled(false);
                return;
            case 15:
                ((ggg) obj).m9208f((gfc) this.f23630a);
                return;
            case 16:
                Object obj3 = this.f23630a;
                ggg gggVar3 = (ggg) obj;
                ImageButton imageButton = (ImageButton) gggVar3.f24654b.get(obj3);
                if (imageButton == null) {
                    ((nbe) ((nbe) ggg.f24653a.m17252c()).mo17276G(2623)).mo17301z("enableOption: nonexistent option %s for category %s", obj3, gggVar3.m9203a());
                    return;
                } else {
                    if (imageButton != ((ImageButton) gggVar3.f24654b.get(gggVar3.f24659g))) {
                        imageButton.setEnabled(true);
                        imageButton.setImageAlpha(255);
                        return;
                    }
                    return;
                }
            case 17:
                ((kfb) obj).mo3625c((kiq) this.f23630a);
                return;
            case 18:
                ((RewindThumbnailScrollView) this.f23630a).f6915e = null;
                return;
            case 19:
                ((gyi) obj).mo3971x((gyu) this.f23630a);
                return;
            default:
                ((gyi) obj).mo3958k((gyu) this.f23630a);
                return;
        }
    }
}
