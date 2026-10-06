package p000;

import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgj implements bgx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f3161a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f3162b;

    public bgj(LottieAnimationView lottieAnimationView, int i) {
        this.f3162b = i;
        this.f3161a = lottieAnimationView;
    }

    public bgj(String str, int i) {
        this.f3162b = i;
        this.f3161a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.graphics.drawable.Drawable$Callback, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.bgx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo2414a(Object obj) {
        switch (this.f3162b) {
            case 0:
                Throwable th = (Throwable) obj;
                Object obj2 = this.f3161a;
                int i = ((LottieAnimationView) obj2).f6454b;
                if (i != 0) {
                    ((AppCompatImageView) obj2).setImageResource(i);
                }
                LottieAnimationView.f6453a.mo2414a(th);
                break;
            case 1:
                bgm bgmVar = (bgm) obj;
                ?? r0 = this.f3161a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r0;
                lottieAnimationView.f6455c.setCallback(r0);
                lottieAnimationView.f6459g = bgmVar;
                lottieAnimationView.f6456d = true;
                boolean zM2450q = lottieAnimationView.f6455c.m2450q(bgmVar);
                lottieAnimationView.f6456d = false;
                lottieAnimationView.m4015a();
                if (lottieAnimationView.getDrawable() == lottieAnimationView.f6455c) {
                    if (!zM2450q) {
                    }
                } else if (!zM2450q) {
                    boolean zM4023i = lottieAnimationView.m4023i();
                    AppCompatImageView appCompatImageView = (AppCompatImageView) r0;
                    appCompatImageView.setImageDrawable(null);
                    appCompatImageView.setImageDrawable(lottieAnimationView.f6455c);
                    if (zM4023i) {
                        lottieAnimationView.f6455c.m2445l();
                    }
                }
                lottieAnimationView.onVisibilityChanged((View) r0, lottieAnimationView.getVisibility());
                lottieAnimationView.requestLayout();
                Iterator it = lottieAnimationView.f6458f.iterator();
                while (it.hasNext()) {
                    ((bgz) it.next()).m2454a();
                }
                break;
            case 2:
                bgp.f3193a.remove(this.f3161a);
                break;
            default:
                bgp.f3193a.remove(this.f3161a);
                break;
        }
    }
}
