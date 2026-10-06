package p000;

import android.view.GestureDetector;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.babelfish.device.avenh.l2l.speechenhancer2.jni.SpeechEnhancerJniWrapperRealtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hfr implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f27573a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27574b;

    public /* synthetic */ hfr(cou couVar, int i, byte[] bArr) {
        this.f27574b = i;
        this.f27573a = couVar;
    }

    public /* synthetic */ hfr(hfu hfuVar, int i) {
        this.f27574b = i;
        this.f27573a = hfuVar;
    }

    public /* synthetic */ hfr(hgk hgkVar, int i) {
        this.f27574b = i;
        this.f27573a = hgkVar;
    }

    public /* synthetic */ hfr(hgm hgmVar, int i) {
        this.f27574b = i;
        this.f27573a = hgmVar;
    }

    public /* synthetic */ hfr(hhi hhiVar, int i) {
        this.f27574b = i;
        this.f27573a = hhiVar;
    }

    public /* synthetic */ hfr(hhr hhrVar, int i) {
        this.f27574b = i;
        this.f27573a = hhrVar;
    }

    public /* synthetic */ hfr(hhv hhvVar, int i) {
        this.f27574b = i;
        this.f27573a = hhvVar;
    }

    public /* synthetic */ hfr(hic hicVar, int i) {
        this.f27574b = i;
        this.f27573a = hicVar;
    }

    public /* synthetic */ hfr(hio hioVar, int i) {
        this.f27574b = i;
        this.f27573a = hioVar;
    }

    public /* synthetic */ hfr(hjb hjbVar, int i) {
        this.f27574b = i;
        this.f27573a = hjbVar;
    }

    public /* synthetic */ hfr(hje hjeVar, int i) {
        this.f27574b = i;
        this.f27573a = hjeVar;
    }

    public /* synthetic */ hfr(hjh hjhVar, int i) {
        this.f27574b = i;
        this.f27573a = hjhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [hhi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [hhi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [hgd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, mpk] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, mpk] */
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
        int i = 0;
        switch (this.f27574b) {
            case 0:
                ((hgk) this.f27573a).mo5711f();
                return;
            case 1:
                ?? r0 = this.f27573a;
                final hfu hfuVar = (hfu) r0;
                jvb jvbVarM3529i = hfuVar.f27603s.m3529i();
                hgk hgkVar = (hgk) hfuVar.f27587c.get();
                hfuVar.f27602r = "[" + Integer.toHexString(hgkVar.hashCode()) + "]";
                hfuVar.mo10210a(new hft(hfuVar, 0));
                hfuVar.f27595k.m8097e(hgkVar);
                hfuVar.f27595k.m8097e(r0);
                hfuVar.f27591g.mo3730c(hfuVar.f27589e);
                hfuVar.f27592h.m9966a(hfuVar.f27589e);
                jvbVarM3529i.m13537d(new hcu(hfuVar, 2));
                jvbVarM3529i.m13537d(hfuVar.f27593i.mo3830a(new gmd(hgkVar, 19), hfuVar.f27596l));
                hgm hgmVar = hfuVar.f27588d;
                AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(hfuVar);
                hgmVar.f27699j = ambientController;
                hgmVar.f27692c.mo10306i(ambientController);
                hgm hgmVar2 = hfuVar.f27588d;
                hgmVar2.f27693d.mo10189f(new cln(new GestureDetector(hgmVar2.f27690a, new hgl(hgmVar2, hgmVar2.f27699j, null, null, null, null)), 8));
                hfuVar.f27603s.m3529i().m13537d(hfuVar.f27597m.mo10029a(gzy.f27036at).mo3830a(new gmd(hfuVar, 20), jvh.m13554b()));
                jvb jvbVarM3529i2 = hfuVar.f27603s.m3529i();
                BottomBar.OnContentVisibilityChangedListener onContentVisibilityChangedListener = new BottomBar.OnContentVisibilityChangedListener() { // from class: hfq
                    @Override // com.google.android.apps.camera.bottombar.BottomBar.OnContentVisibilityChangedListener
                    public final void onContentVisibilityChanged(View view, int i2) {
                        hfu hfuVar2 = hfuVar;
                        if (view.equals(hfuVar2.f27594j.getThumbnailButton())) {
                            hfuVar2.f27601q = i2;
                            boolean zIsFinishing = hfuVar2.f27585a.isFinishing();
                            boolean zIsDestroyed = hfuVar2.f27585a.isDestroyed();
                            if (i2 != 0 || zIsFinishing || zIsDestroyed) {
                                hfuVar2.m10215j(hgn.THUMBNAIL_INVISIBLE);
                            } else {
                                hfuVar2.m10216k(hgn.THUMBNAIL_INVISIBLE);
                            }
                        }
                    }
                };
                hfuVar.f27594j.addOnContentVisibilityChangedListener(BottomBar.SideButtonPosition.CENTER_RIGHT, onContentVisibilityChangedListener);
                jvbVarM3529i2.m13537d(new gto(hfuVar, onContentVisibilityChangedListener, 9));
                hfuVar.f27596l.m13541c(new hfr(hgkVar, i));
                return;
            case 2:
                ((hfu) this.f27573a).m10212g(false);
                return;
            case 3:
                ((hgk) this.f27573a).mo10201j();
                return;
            case 4:
                this.f27573a.mo10304g();
                return;
            case 5:
                this.f27573a.mo10303f();
                return;
            case 6:
                this.f27573a.mo10202k();
                return;
            case 7:
                ((hgm) this.f27573a).f27691b.mo14894e(null);
                return;
            case 8:
                hhr hhrVar = (hhr) this.f27573a;
                hhr.m10307m(hhrVar.f27836h, hhrVar.f27842n, hhrVar.m10311j(hhrVar.f27840l, ((hzp) hhrVar.f27833e.mo6051a()).f30074a.f30073i));
                hhrVar.f27836h.setVisibility(0);
                return;
            case 9:
                ((hhv) this.f27573a).m10323h();
                return;
            case 10:
                Object obj = this.f27573a;
                synchronized (((hic) obj).f27880b) {
                    if (!((hic) obj).f27882d) {
                        ((hic) obj).m10331g().autoResume();
                    }
                    break;
                }
                return;
            case 11:
                ((hio) this.f27573a).f27934l.f33914a.mo16738g();
                return;
            case 12:
                hio hioVar = (hio) this.f27573a;
                hioVar.m10347c();
                kxk.m14975U(hioVar.f27925c.submit(new mpj(0)), new cou(hioVar, hioVar.f27928f.mo13957a("SEController#initLibrary"), 6), not.INSTANCE);
                return;
            case 13:
                ((hio) this.f27573a).f27934l.f33914a.mo16732a();
                return;
            case 14:
                cou couVar = (cou) this.f27573a;
                ((hio) couVar.f8501a).f27928f.mo13961e("SEController#warmupModel");
                SpeechEnhancerJniWrapperRealtime.modelWarmup(((hio) couVar.f8501a).f27931i, true);
                ((hio) couVar.f8501a).f27928f.mo13962f();
                return;
            case 15:
                ((hjb) this.f27573a).f27988e = true;
                return;
            case 16:
                hjb hjbVar = (hjb) this.f27573a;
                if (hjbVar.m10370j()) {
                    View viewMo9114a = hjbVar.f27987d.mo9114a();
                    igt igtVar = new igt(hjbVar.f27984a.getString(C0100R.string.try_speech_enhancement_tooltip));
                    igtVar.m11314r(viewMo9114a);
                    igtVar.mo11305i();
                    igtVar.mo11307k();
                    igtVar.mo11300d(new fff(hjbVar, 3));
                    igtVar.mo11303g(new hfr(hjbVar, 15), hjbVar.f27985b);
                    igtVar.f30869d = 300;
                    igtVar.mo11308l();
                    igtVar.f30870e = 5000;
                    igtVar.f30871f = false;
                    igtVar.f30873h = false;
                    igtVar.f30874i = hjbVar.f27986c;
                    igtVar.f30878m = 4;
                    hjbVar.f27990g = igtVar.mo11297a();
                    return;
                }
                return;
            case 17:
                hjb hjbVar2 = (hjb) this.f27573a;
                hjbVar2.f27989f = true;
                if (hjbVar2.f27988e) {
                    hjbVar2.mo10365e();
                    return;
                }
                return;
            case 18:
                ((hje) this.f27573a).f28025f = true;
                return;
            case 19:
                ((hje) this.f27573a).f28024e = true;
                return;
            default:
                ((hjh) this.f27573a).m10377e();
                return;
        }
    }
}
