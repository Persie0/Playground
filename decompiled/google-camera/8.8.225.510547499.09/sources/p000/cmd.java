package p000;

import android.animation.AnimatorSet;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cmd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6208a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6209b;

    public /* synthetic */ cmd(cme cmeVar, int i) {
        this.f6209b = i;
        this.f6208a = cmeVar;
    }

    public /* synthetic */ cmd(cmf cmfVar, int i) {
        this.f6209b = i;
        this.f6208a = cmfVar;
    }

    public /* synthetic */ cmd(cmk cmkVar, int i) {
        this.f6209b = i;
        this.f6208a = cmkVar;
    }

    public /* synthetic */ cmd(cmp cmpVar, int i) {
        this.f6209b = i;
        this.f6208a = cmpVar;
    }

    public /* synthetic */ cmd(cok cokVar, int i) {
        this.f6209b = i;
        this.f6208a = cokVar;
    }

    public /* synthetic */ cmd(cor corVar, int i) {
        this.f6209b = i;
        this.f6208a = corVar;
    }

    public /* synthetic */ cmd(cpi cpiVar, int i) {
        this.f6209b = i;
        this.f6208a = cpiVar;
    }

    public /* synthetic */ cmd(cpj cpjVar, int i) {
        this.f6209b = i;
        this.f6208a = cpjVar;
    }

    public /* synthetic */ cmd(cpw cpwVar, int i) {
        this.f6209b = i;
        this.f6208a = cpwVar;
    }

    public /* synthetic */ cmd(cqg cqgVar, int i) {
        this.f6209b = i;
        this.f6208a = cqgVar;
    }

    public /* synthetic */ cmd(cqi cqiVar, int i) {
        this.f6209b = i;
        this.f6208a = cqiVar;
    }

    public /* synthetic */ cmd(cqm cqmVar, int i) {
        this.f6209b = i;
        this.f6208a = cqmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [fbp, java.lang.Object] */
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        switch (this.f6209b) {
            case 0:
                cme cmeVar = (cme) this.f6208a;
                cmf cmfVar = cmeVar.f6211b;
                cmfVar.animate().withStartAction(new cmd(cmfVar, i)).alpha(1.0f).setDuration(cmfVar.getResources().getInteger(C0100R.integer.autotimer_tutorial_background_anim_duration)).start();
                cmc cmcVar = cmeVar.f6212c;
                AnimatorSet animatorSetClone = cmcVar.f6202c.clone();
                animatorSetClone.setTarget(cmcVar.f6200a);
                AnimatorSet animatorSetClone2 = cmcVar.f6202c.clone();
                animatorSetClone2.setTarget(cmcVar.f6201b);
                AnimatorSet animatorSet = cmcVar.f6206g;
                if (animatorSet != null) {
                    lku.m15662p(animatorSet);
                    animatorSet.end();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(animatorSetClone).after(cmcVar.getResources().getInteger(C0100R.integer.autotimer_tutorial_text_title_delay));
                animatorSet2.play(animatorSetClone2).after(cmcVar.getResources().getInteger(C0100R.integer.autotimer_tutorial_text_body_delay));
                animatorSet2.addListener(new cma(cmcVar));
                animatorSet2.setInterpolator(cmcVar.f6205f);
                animatorSet2.start();
                cmcVar.f6206g = animatorSet2;
                return;
            case 1:
                cme cmeVar2 = (cme) this.f6208a;
                cmf cmfVar2 = cmeVar2.f6211b;
                cmfVar2.animate().alpha(0.0f).withEndAction(new cmd(cmfVar2, 2)).setDuration(cmfVar2.getResources().getInteger(C0100R.integer.autotimer_tutorial_background_anim_duration)).start();
                cmc cmcVar2 = cmeVar2.f6212c;
                if (cmcVar2.getVisibility() == 8) {
                    return;
                }
                AnimatorSet animatorSetClone3 = cmcVar2.f6203d.clone();
                animatorSetClone3.setTarget(cmcVar2.f6200a);
                AnimatorSet animatorSetClone4 = cmcVar2.f6203d.clone();
                animatorSetClone4.setTarget(cmcVar2.f6201b);
                AnimatorSet animatorSet3 = cmcVar2.f6206g;
                if (animatorSet3 != null) {
                    lku.m15662p(animatorSet3);
                    animatorSet3.end();
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setInterpolator(cmcVar2.f6204e);
                animatorSet4.play(animatorSetClone3).after(cmcVar2.getResources().getInteger(C0100R.integer.autotimer_tutorial_text_body_delay));
                animatorSet4.play(animatorSetClone4).after(cmcVar2.getResources().getInteger(C0100R.integer.autotimer_tutorial_text_title_delay));
                animatorSet4.addListener(new cmb(cmcVar2));
                animatorSet4.start();
                cmcVar2.f6206g = animatorSet4;
                return;
            case 2:
                ((cmf) this.f6208a).setVisibility(8);
                return;
            case 3:
                cmf cmfVar3 = (cmf) this.f6208a;
                cmfVar3.setAlpha(0.0f);
                cmfVar3.setVisibility(0);
                return;
            case 4:
                Object obj = this.f6208a;
                try {
                    ((cmk) obj).mo3531a();
                    ((cmk) obj).f6226h.mo14894e(true);
                    return;
                } catch (Exception e) {
                    ((cmk) obj).f6226h.mo8566a(e);
                    return;
                }
            case 5:
                ?? r0 = this.f6208a;
                ((cmp) r0).f6265f.m8097e(r0);
                return;
            case 6:
                Object obj2 = this.f6208a;
                synchronized (((cok) obj2).f6444f) {
                    if (((cok) obj2).f6450l) {
                        return;
                    }
                    ((cok) obj2).f6450l = true;
                    ((cok) obj2).m4008a();
                    ((cok) obj2).f6448j.close();
                    ((cok) obj2).f6446h.close();
                    return;
                }
            case 7:
                ?? r1 = this.f6208a;
                ((cor) r1).f8496i.m8097e(r1);
                return;
            case 8:
                ((cpj) this.f6208a).m5246r(3);
                return;
            case 9:
                ((cpi) this.f6208a).f8574c.m5235g(false);
                return;
            case 10:
                cpi cpiVar = (cpi) this.f6208a;
                dbr dbrVar = cpiVar.f8574c.f8591c;
                dbrVar.m5897f(dbrVar.mo5895d());
                cpiVar.f8574c.f8591c.m5899h(new cmd(cpiVar, 11));
                return;
            case 11:
                ((cpi) this.f6208a).f8574c.m5246r(7);
                return;
            case 12:
                cpw cpwVar = (cpw) this.f6208a;
                cpwVar.m5260b();
                cpwVar.f8688d.m5369j(true);
                return;
            case 13:
                csr csrVar = ((cqm) this.f6208a).f8951f;
                csrVar.f9378c.execute(new cqr(csrVar, 15));
                return;
            case 14:
                ((cpw) this.f6208a).f8688d.m5369j(false);
                return;
            case 15:
                ((cpw) this.f6208a).m5260b();
                return;
            case 16:
                Object obj3 = this.f6208a;
                synchronized (((cqg) obj3).f8854f) {
                    if (((cqg) obj3).f8830E == cqf.STARTING_RECORDING) {
                        cuu cuuVar = ((cqg) obj3).f8831F;
                        cuuVar.getClass();
                        cuuVar.f9689a.mo13749h();
                        cug cugVar = ((cqg) obj3).f8865q;
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                        synchronized (cugVar) {
                            mzj mzjVar = (mzj) cugVar.f9608b.removeLast();
                            cugVar.f9608b.add(mzj.m17175e((Long) mzjVar.m17180i(), Long.valueOf(jElapsedRealtimeNanos)));
                            cugVar.f9607a += jElapsedRealtimeNanos - ((Long) mzjVar.m17180i()).longValue();
                            break;
                        }
                        ((cqg) obj3).f8855g.m5531d();
                        if (((cqg) obj3).f8860l.f9330B) {
                            ((cqg) obj3).f8870v.m5745c(true);
                        }
                        ((cqg) obj3).m5354j(cqf.RECORDING);
                    }
                }
                return;
            case 17:
                cqg cqgVar = (cqg) this.f6208a;
                Iterator it = cqgVar.f8827B.iterator();
                while (it.hasNext()) {
                    cqgVar.f8872x.mo6360h(((gyv) it.next()).f26876b, null);
                }
                return;
            case 18:
                ((cqi) this.f6208a).f8904a.m4503a();
                return;
            case 19:
                ((cqm) this.f6208a).f8970y.mo5725i();
                return;
            default:
                ((cqm) this.f6208a).f8970y.mo5724d();
                return;
        }
    }
}
