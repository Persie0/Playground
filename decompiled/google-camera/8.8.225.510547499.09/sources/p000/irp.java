package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class irp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f31927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f31928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f31929c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f31930d;

    public /* synthetic */ irp(ige igeVar, boolean z, boolean z2, int i) {
        this.f31930d = i;
        this.f31929c = igeVar;
        this.f31927a = z;
        this.f31928b = z2;
    }

    public /* synthetic */ irp(irs irsVar, boolean z, boolean z2, int i) {
        this.f31930d = i;
        this.f31929c = irsVar;
        this.f31927a = z;
        this.f31928b = z2;
    }

    public /* synthetic */ irp(isa isaVar, boolean z, boolean z2, int i) {
        this.f31930d = i;
        this.f31929c = isaVar;
        this.f31927a = z;
        this.f31928b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31930d) {
            case 0:
                Object obj = this.f31929c;
                boolean z = this.f31927a;
                boolean z2 = this.f31928b;
                if (!z) {
                    isa isaVar = ((irs) obj).f31940g;
                    if (!isaVar.f31971l) {
                        isaVar.mo11653ch(z2);
                    }
                } else {
                    irs irsVar = (irs) obj;
                    isa isaVar2 = irsVar.f31940g;
                    if (isaVar2.f31971l) {
                        isaVar2.f31967h.m13541c(new ipa(isaVar2, 17));
                    } else {
                        isaVar2.mo11651c(z2);
                    }
                    irsVar.m11664f();
                }
                break;
            case 1:
                Object obj2 = this.f31929c;
                boolean z3 = this.f31927a;
                boolean z4 = this.f31928b;
                ige igeVar = (ige) obj2;
                if (igeVar.f30726a.isEnabled() != z3) {
                    igeVar.f30726a.setEnabled(z3, z4);
                }
                break;
            case 2:
                Object obj3 = this.f31929c;
                boolean z5 = this.f31927a;
                boolean z6 = this.f31928b;
                if (!z5) {
                    ((irs) obj3).f31940g.mo11650b(z6);
                } else {
                    irs irsVar2 = (irs) obj3;
                    irsVar2.m11664f();
                    irsVar2.f31940g.mo11649a(z6);
                }
                break;
            case 3:
                Object obj4 = this.f31929c;
                boolean z7 = this.f31927a;
                boolean z8 = this.f31928b;
                if (z7) {
                    ((isa) obj4).m11672m();
                }
                isa isaVar3 = (isa) obj4;
                isaVar3.m11670k();
                if (!z8) {
                    isaVar3.f31969j.cancel();
                    isaVar3.f31969j.reverse();
                    isaVar3.f31969j.end();
                } else if (isaVar3.f31966g.getAlpha() != 0.0f) {
                    isaVar3.f31969j.reverse();
                }
                break;
            default:
                Object obj5 = this.f31929c;
                boolean z9 = this.f31927a;
                boolean z10 = this.f31928b;
                if (z9) {
                    ((isa) obj5).m11672m();
                } else if (!((Boolean) ((jwf) ((isa) obj5).f31970k).f34942d).booleanValue()) {
                    ((iru) obj5).mo11652d();
                }
                isa isaVar4 = (isa) obj5;
                if (isaVar4.f31968i.mo10826o() && isaVar4.f31966g.f7322a == hzj.STARFISH_LAYOUT && isaVar4.f31968i.mo10812a() != ilk.PORTRAIT) {
                    isaVar4.f31966g.setTranslationX(isaVar4.f31966g.getContext().getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_auto_ns_offset));
                } else {
                    isaVar4.f31966g.setTranslationX(0.0f);
                }
                isaVar4.f31966g.setVisibility(0);
                if (!z10) {
                    isaVar4.f31969j.cancel();
                    isaVar4.f31969j.end();
                } else {
                    isaVar4.f31969j.start();
                }
                break;
        }
    }
}
