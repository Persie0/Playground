package p000;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.BiConsumer$CC;
import p021j$.util.function.BiPredicate$CC;
import p021j$.util.function.Consumer$CC;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24194a;

    /* JADX INFO: renamed from: b */
    private final oju f24195b;

    /* JADX INFO: renamed from: c */
    private final oju f24196c;

    /* JADX INFO: renamed from: d */
    private final oju f24197d;

    /* JADX INFO: renamed from: e */
    private final oju f24198e;

    /* JADX INFO: renamed from: f */
    private final oju f24199f;

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f24200g;

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i) {
        this.f24200g = i;
        this.f24194a = ojuVar;
        this.f24195b = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24197d = ojuVar4;
        this.f24198e = ojuVar5;
        this.f24199f = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr) {
        this.f24200g = i;
        this.f24199f = ojuVar;
        this.f24197d = ojuVar2;
        this.f24198e = ojuVar3;
        this.f24194a = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24196c = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr, byte[] bArr2) {
        this.f24200g = i;
        this.f24194a = ojuVar;
        this.f24195b = ojuVar2;
        this.f24199f = ojuVar3;
        this.f24198e = ojuVar4;
        this.f24196c = ojuVar5;
        this.f24197d = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr) {
        this.f24200g = i;
        this.f24199f = ojuVar;
        this.f24196c = ojuVar2;
        this.f24195b = ojuVar3;
        this.f24197d = ojuVar4;
        this.f24194a = ojuVar5;
        this.f24198e = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr, byte[] bArr) {
        this.f24200g = i;
        this.f24199f = ojuVar;
        this.f24196c = ojuVar2;
        this.f24194a = ojuVar3;
        this.f24197d = ojuVar4;
        this.f24198e = ojuVar5;
        this.f24195b = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[] fArr) {
        this.f24200g = i;
        this.f24195b = ojuVar;
        this.f24198e = ojuVar2;
        this.f24197d = ojuVar3;
        this.f24199f = ojuVar4;
        this.f24196c = ojuVar5;
        this.f24194a = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[] iArr) {
        this.f24200g = i;
        this.f24196c = ojuVar;
        this.f24194a = ojuVar2;
        this.f24197d = ojuVar3;
        this.f24198e = ojuVar4;
        this.f24199f = ojuVar5;
        this.f24195b = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[] sArr) {
        this.f24200g = i;
        this.f24197d = ojuVar;
        this.f24199f = ojuVar2;
        this.f24198e = ojuVar3;
        this.f24195b = ojuVar4;
        this.f24196c = ojuVar5;
        this.f24194a = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[] zArr) {
        this.f24200g = i;
        this.f24195b = ojuVar;
        this.f24196c = ojuVar2;
        this.f24198e = ojuVar3;
        this.f24194a = ojuVar4;
        this.f24199f = ojuVar5;
        this.f24197d = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][] bArr) {
        this.f24200g = i;
        this.f24199f = ojuVar;
        this.f24197d = ojuVar2;
        this.f24198e = ojuVar3;
        this.f24195b = ojuVar4;
        this.f24196c = ojuVar5;
        this.f24194a = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][] cArr) {
        this.f24200g = i;
        this.f24198e = ojuVar;
        this.f24197d = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24199f = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24194a = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][] fArr) {
        this.f24200g = i;
        this.f24198e = ojuVar;
        this.f24199f = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24194a = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24197d = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][] iArr) {
        this.f24200g = i;
        this.f24198e = ojuVar;
        this.f24194a = ojuVar2;
        this.f24197d = ojuVar3;
        this.f24196c = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24199f = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][] sArr) {
        this.f24200g = i;
        this.f24199f = ojuVar;
        this.f24197d = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24198e = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24194a = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][] zArr) {
        this.f24200g = i;
        this.f24197d = ojuVar;
        this.f24199f = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24195b = ojuVar4;
        this.f24194a = ojuVar5;
        this.f24198e = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][][] bArr) {
        this.f24200g = i;
        this.f24197d = ojuVar;
        this.f24198e = ojuVar2;
        this.f24199f = ojuVar3;
        this.f24196c = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24194a = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][][] cArr) {
        this.f24200g = i;
        this.f24197d = ojuVar;
        this.f24194a = ojuVar2;
        this.f24198e = ojuVar3;
        this.f24196c = ojuVar4;
        this.f24195b = ojuVar5;
        this.f24199f = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][][] fArr) {
        this.f24200g = i;
        this.f24194a = ojuVar;
        this.f24195b = ojuVar2;
        this.f24198e = ojuVar3;
        this.f24199f = ojuVar4;
        this.f24196c = ojuVar5;
        this.f24197d = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][][] iArr) {
        this.f24200g = i;
        this.f24194a = ojuVar;
        this.f24197d = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24195b = ojuVar4;
        this.f24198e = ojuVar5;
        this.f24199f = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][][] sArr) {
        this.f24200g = i;
        this.f24197d = ojuVar;
        this.f24196c = ojuVar2;
        this.f24195b = ojuVar3;
        this.f24199f = ojuVar4;
        this.f24194a = ojuVar5;
        this.f24198e = ojuVar6;
    }

    public gcj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][][] zArr) {
        this.f24200g = i;
        this.f24198e = ojuVar;
        this.f24199f = ojuVar2;
        this.f24196c = ojuVar3;
        this.f24195b = ojuVar4;
        this.f24197d = ojuVar5;
        this.f24194a = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static gcj m9049a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 0);
    }

    /* JADX INFO: renamed from: b */
    public static gcj m9050b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static gcj m9051c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static gcj m9052d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static gcj m9053e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 9, (short[][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static gcj m9054f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 10, (int[][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static gcj m9055g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static gcj m9056h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new gcj(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 14, (char[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        gbi gbiVar;
        kfc kfcVarM14708j;
        jwn jwnVarM13633c;
        Object objM17136H;
        gof gofVarM19486n;
        switch (this.f24200g) {
            case 0:
                boolean zBooleanValue = ((gck) this.f24194a).m9058b().booleanValue();
                mrm mrmVar = (mrm) this.f24195b.get();
                oju ojuVar = this.f24196c;
                oju ojuVar2 = this.f24197d;
                oju ojuVar3 = this.f24198e;
                ikw ikwVarM11415a = ((ikv) this.f24199f).m11415a();
                if (zBooleanValue && ikwVarM11415a != ikw.IMAGE_INTENT) {
                    gbiVar = (gbi) ojuVar3.get();
                } else {
                    if (!mrmVar.mo16813g()) {
                        throw new UnsupportedOperationException("Stream configuration not supported");
                    }
                    gbiVar = ikwVarM11415a == ikw.IMAGE_INTENT ? (gbi) ojuVar2.get() : (gbi) ojuVar.get();
                }
                gbiVar.getClass();
                return gbiVar;
            case 1:
                return new fvk(((err) this.f24199f).get(), ((fvg) this.f24197d).get(), ((emn) this.f24198e).get(), ((kak) this.f24194a).get(), (hyf) this.f24195b.get(), (Executor) this.f24196c.get());
            case 2:
                dhv dhvVar = (dhv) this.f24199f.get();
                oju ojuVar4 = this.f24196c;
                oju ojuVar5 = this.f24195b;
                hee heeVar = (hee) this.f24197d.get();
                iay iayVar = (iay) this.f24194a.get();
                bkn bknVar = (bkn) this.f24198e.get();
                gbi gbiVarM15531g = dhvVar.mo6184l(dib.f11334bo) ? ((gkg) ojuVar5).get().m15531g() : ((gkj) ojuVar4).get();
                return heeVar.m10147f(iayVar.m10996a(bknVar.m2561J(gbiVarM15531g)), gbiVarM15531g);
            case 3:
                jvb jvbVar = (jvb) this.f24197d.get();
                oju ojuVar6 = this.f24199f;
                kfk kfkVar = (kfk) this.f24198e.get();
                mrm mrmVar2 = (mrm) this.f24195b.get();
                oju ojuVar7 = this.f24196c;
                Set set = ((ohm) this.f24194a).get();
                if (mrmVar2.mo16813g()) {
                    kfcVarM14708j = kfkVar.mo14131r(kfkVar.mo14134u((kgg) mrmVar2.mo16809c(), set), 3);
                } else if (((Map) ojuVar7.get()).size() == 1) {
                    kfcVarM14708j = kfkVar.mo14131r(kfkVar.mo14134u((kgg) ((Map) ojuVar7.get()).values().iterator().next(), set), 3);
                } else {
                    lku.m15614I(!((Map) ojuVar7.get()).isEmpty(), qQLA.hXhnTIgfLv);
                    kfcVarM14708j = ((gjc) ojuVar6).get().m14708j(3);
                }
                jvbVar.m13537d(kfcVarM14708j);
                return kfcVarM14708j;
            case 4:
                return new ges((jww) this.f24196c.get(), ((cjm) this.f24194a).m3825a(), ((hzr) this.f24197d).get(), (jwn) this.f24198e.get(), ((err) this.f24199f).get(), ((ity) this.f24195b).get());
            case 5:
                return new gfo((hai) this.f24195b.get(), ((dww) this.f24196c).m6836a(), ((iig) this.f24198e).get(), (dhv) this.f24194a.get(), (fmz) this.f24199f.get(), (jwn) this.f24197d.get());
            case 6:
                hai haiVar = (hai) this.f24195b.get();
                final jwn jwnVarM9065a = ((gcw) this.f24198e).m9065a();
                dhv dhvVar2 = (dhv) this.f24197d.get();
                final dox doxVar = (dox) this.f24199f.get();
                final jwn jwnVar = (jwn) this.f24196c.get();
                final boolean zBooleanValue2 = ((Boolean) this.f24194a.get()).booleanValue();
                final geu geuVar = new geu(haiVar.mo10030b(gzy.f27060s), (String) gzy.f27060s.m10026c(dhvVar2), "ns", gfc.PHOTO_FLASH_NS, "auto", gfc.PHOTO_FLASH_AUTO, "on", gfc.PHOTO_FLASH_ON, "off", gfc.PHOTO_FLASH_OFF);
                if (zBooleanValue2 && gfc.PHOTO_FLASH_AUTO.equals(geuVar.mo3831be())) {
                    geuVar.mo3415bf(gfc.PHOTO_FLASH_NS);
                } else if (!zBooleanValue2 && gfc.PHOTO_FLASH_NS.equals(geuVar.mo3831be())) {
                    geuVar.mo3415bf(gfc.PHOTO_FLASH_OFF);
                }
                gfw gfwVar = new gfw(jwnVar, 1);
                Predicate predicate = new Predicate() { // from class: gfs
                    public final /* synthetic */ Predicate and(Predicate predicate2) {
                        return Predicate$CC.$default$and(this, predicate2);
                    }

                    public final /* synthetic */ Predicate negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public final /* synthetic */ Predicate m9185or(Predicate predicate2) {
                        return Predicate$CC.$default$or(this, predicate2);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        jwn jwnVar2 = jwnVarM9065a;
                        dox doxVar2 = doxVar;
                        boolean z = zBooleanValue2;
                        nbh nbhVar = gfy.f24631a;
                        boolean zBooleanValue3 = ((Boolean) jwnVar2.mo3831be()).booleanValue();
                        boolean zBooleanValue4 = ((Boolean) ((jwf) doxVar2.mo6465a()).f34942d).booleanValue();
                        if (z) {
                            return true;
                        }
                        return zBooleanValue4 && !zBooleanValue3;
                    }
                };
                final BiPredicate biPredicate = new BiPredicate() { // from class: gft
                    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                        return BiPredicate$CC.$default$and(this, biPredicate2);
                    }

                    public final /* synthetic */ BiPredicate negate() {
                        return BiPredicate$CC.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public final /* synthetic */ BiPredicate m9186or(BiPredicate biPredicate2) {
                        return BiPredicate$CC.$default$or(this, biPredicate2);
                    }

                    @Override // java.util.function.BiPredicate
                    public final boolean test(Object obj, Object obj2) {
                        boolean z = zBooleanValue2;
                        jwn jwnVar2 = jwnVarM9065a;
                        dox doxVar2 = doxVar;
                        gfc gfcVar = (gfc) obj2;
                        nbh nbhVar = gfy.f24631a;
                        if (z && gfc.PHOTO_FLASH_ON.equals(gfcVar)) {
                            return ((Boolean) ((jwf) doxVar2.mo6465a()).f34942d).booleanValue() && !((Boolean) jwnVar2.mo3831be()).booleanValue();
                        }
                        return true;
                    }
                };
                BiConsumer biConsumer = new BiConsumer() { // from class: gfu
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        jww jwwVar = geuVar;
                        BiPredicate biPredicate2 = biPredicate;
                        gfa gfaVar = (gfa) obj;
                        nbh nbhVar = gfy.f24631a;
                        boolean z = false;
                        if (((Boolean) obj2).booleanValue() && gfc.PHOTO_FLASH_ON.equals(jwwVar.mo3831be()) && biPredicate2.test(gfaVar, gfc.PHOTO_FLASH_ON)) {
                            z = true;
                        }
                        gfaVar.mo9134u(z, gfx.FLASH_ON);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer2);
                    }
                };
                Consumer consumer = new Consumer() { // from class: gfv
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        jwn jwnVar2 = jwnVar;
                        jwn jwnVar3 = jwnVarM9065a;
                        final jww jwwVar = geuVar;
                        final boolean z = zBooleanValue2;
                        dox doxVar2 = doxVar;
                        final gfa gfaVar = (gfa) obj;
                        nbh nbhVar = gfy.f24631a;
                        jvb jvbVarMo9110I = gfaVar.mo9110I();
                        jvbVarMo9110I.m13537d(jwnVar2.mo3830a(new gcu(gfaVar, 11), not.INSTANCE));
                        final int i = 1;
                        jvbVarMo9110I.m13537d(jwnVar3.mo3830a(new kbg() { // from class: gfr
                            @Override // p000.kbg
                            /* JADX INFO: renamed from: bf */
                            public final void mo3415bf(Object obj2) {
                                switch (i) {
                                    case 0:
                                        jww jwwVar2 = jwwVar;
                                        boolean z2 = z;
                                        gfa gfaVar2 = gfaVar;
                                        nbh nbhVar2 = gfy.f24631a;
                                        if (!((Boolean) obj2).booleanValue() && gfc.PHOTO_FLASH_ON.equals(jwwVar2.mo3831be()) && z2) {
                                            ((nbe) ((nbe) gfy.f24631a.m17252c()).mo17276G((char) 2616)).mo17290o("MenuItemModule.BackPhotoFlash.evCompViewController: fallback to ANS");
                                            jwwVar2.mo3415bf(gfc.PHOTO_FLASH_NS);
                                        }
                                        gfaVar2.mo9129o(false, gev.BACK_PHOTO_FLASH);
                                        break;
                                    default:
                                        jww jwwVar3 = jwwVar;
                                        boolean z3 = z;
                                        gfa gfaVar3 = gfaVar;
                                        nbh nbhVar3 = gfy.f24631a;
                                        if (((Boolean) obj2).booleanValue() && gfc.PHOTO_FLASH_ON.equals(jwwVar3.mo3831be()) && z3) {
                                            ((nbe) ((nbe) gfy.f24631a.m17252c()).mo17276G((char) 2615)).mo17290o("MenuItemModule.BackPhotoFlash.flashDisabledThermally: fallback to ANS");
                                            jwwVar3.mo3415bf(gfc.PHOTO_FLASH_NS);
                                        }
                                        gfaVar3.mo9129o(false, gev.BACK_PHOTO_FLASH);
                                        break;
                                }
                            }
                        }, not.INSTANCE));
                        jwn jwnVarM13624c = jwj.m13624c(doxVar2.mo6465a());
                        final int i2 = 0;
                        jvbVarMo9110I.m13537d(jwnVarM13624c.mo3830a(new kbg() { // from class: gfr
                            @Override // p000.kbg
                            /* JADX INFO: renamed from: bf */
                            public final void mo3415bf(Object obj2) {
                                switch (i2) {
                                    case 0:
                                        jww jwwVar2 = jwwVar;
                                        boolean z2 = z;
                                        gfa gfaVar2 = gfaVar;
                                        nbh nbhVar2 = gfy.f24631a;
                                        if (!((Boolean) obj2).booleanValue() && gfc.PHOTO_FLASH_ON.equals(jwwVar2.mo3831be()) && z2) {
                                            ((nbe) ((nbe) gfy.f24631a.m17252c()).mo17276G((char) 2616)).mo17290o("MenuItemModule.BackPhotoFlash.evCompViewController: fallback to ANS");
                                            jwwVar2.mo3415bf(gfc.PHOTO_FLASH_NS);
                                        }
                                        gfaVar2.mo9129o(false, gev.BACK_PHOTO_FLASH);
                                        break;
                                    default:
                                        jww jwwVar3 = jwwVar;
                                        boolean z3 = z;
                                        gfa gfaVar3 = gfaVar;
                                        nbh nbhVar3 = gfy.f24631a;
                                        if (((Boolean) obj2).booleanValue() && gfc.PHOTO_FLASH_ON.equals(jwwVar3.mo3831be()) && z3) {
                                            ((nbe) ((nbe) gfy.f24631a.m17252c()).mo17276G((char) 2615)).mo17290o("MenuItemModule.BackPhotoFlash.flashDisabledThermally: fallback to ANS");
                                            jwwVar3.mo3415bf(gfc.PHOTO_FLASH_NS);
                                        }
                                        gfaVar3.mo9129o(false, gev.BACK_PHOTO_FLASH);
                                        break;
                                }
                            }
                        }, not.INSTANCE));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                gfj gfjVarM9188a = gfy.m9188a(zBooleanValue2);
                gfjVarM9188a.f24545a = geuVar;
                gfjVarM9188a.m9179s(gfwVar);
                gfjVarM9188a.m9175o(predicate);
                gfjVarM9188a.m9176p(biPredicate);
                gfjVarM9188a.m9177q(biConsumer);
                gfjVarM9188a.m9172l(consumer);
                gfjVarM9188a.m9178r(gev.BACK_PHOTO_FLASH);
                return gfjVarM9188a.m9161a();
            case 7:
                dhv dhvVar3 = (dhv) this.f24199f.get();
                jww jwwVar = (jww) this.f24197d.get();
                jww jwwVar2 = (jww) this.f24198e.get();
                hmw hmwVar = (hmw) this.f24195b.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f24196c);
                hah hahVar = (hah) this.f24194a.get();
                nbh nbhVar = gfy.f24631a;
                jwn jwnVarMo10029a = hahVar.mo10029a(gzy.f27036at);
                geu geuVar2 = new geu(jwwVar, false, true, gfc.SELECTED, false, gfc.UNSELECTED);
                dam damVar = new dam(jwwVar2, 20);
                dan danVar = new dan(dhvVar3, 3);
                hnc hncVar = new hnc(jwwVar2, jwnVarMo10029a, damVar, hmwVar, 1);
                gek gekVar = new gek(jwnVarMo10029a, hmwVar, 4);
                gfj gfjVarM9181o = gfk.m9181o();
                gfjVarM9181o.m9178r(gev.f24452l);
                gfjVarM9181o.m9168h(C0100R.string.raw_desc);
                gfjVarM9181o.m9163c(C0100R.string.raw_output_desc);
                gfjVarM9181o.m9174n(gfc.UNSELECTED, gfc.SELECTED);
                Integer numValueOf = Integer.valueOf(C0100R.string.raw_output_off_desc);
                Integer numValueOf2 = Integer.valueOf(C0100R.string.raw_output_on_desc);
                gfjVarM9181o.m9170j(numValueOf, numValueOf2);
                gfjVarM9181o.m9165e(numValueOf, numValueOf2);
                gfjVarM9181o.m9167g(Integer.valueOf(C0100R.drawable.ic_raw_off_gm2_24px), Integer.valueOf(C0100R.drawable.ic_raw_on_gm2_24px));
                gfjVarM9181o.f24545a = geuVar2;
                gfjVarM9181o.m9179s(damVar);
                gfjVarM9181o.m9172l(hncVar);
                gfjVarM9181o.m9175o(gekVar);
                gfjVarM9181o.m9177q(danVar);
                gfjVarM9181o.m9171k((gfd) ohbVarM18485a.get());
                return gfjVarM9181o.m9161a();
            case 8:
                return new ggr(((dws) this.f24198e).m6830a(), (Executor) this.f24197d.get(), (kbz) this.f24196c.get(), ((fav) this.f24199f).get(), (cie) this.f24195b.get(), (jvd) this.f24194a.get());
            case 9:
                drj drjVar = (drj) this.f24199f.get();
                kfk kfkVar2 = (kfk) this.f24197d.get();
                cky ckyVar = (cky) this.f24196c.get();
                glu gluVar = (glu) this.f24198e.get();
                jvb jvbVar2 = (jvb) this.f24195b.get();
                dhv dhvVar4 = (dhv) this.f24194a.get();
                dhw dhwVar = dhu.f11199a;
                dhvVar4.mo6175c();
                gluVar.mo9463g();
                return dez.m6036f(new efc(jvbVar2, gluVar, ckyVar, dhvVar4, kfkVar2, drjVar, 3, null, null), "3aexcomp");
            case 10:
                final ikw ikwVarM11415a2 = ((ikv) this.f24198e).m11415a();
                final dhv dhvVar5 = (dhv) this.f24194a.get();
                kmd kmdVar = ((fxk) this.f24197d).get();
                final eby ebyVar = (eby) this.f24196c.get();
                final msi msiVar = (msi) this.f24195b.get();
                final jwn jwnVarM6611a = ((dqz) this.f24199f).m6611a();
                return (((Integer) dhvVar5.mo6173a(did.f11449c).orElse(0)).intValue() <= 0 || kmdVar.mo14558k() != kmq.BACK) ? ffw.f21757c : new msi() { // from class: ghd
                    @Override // p000.msi
                    /* JADX INFO: renamed from: a */
                    public final Object mo6051a() {
                        jwn jwnVar2 = jwnVarM6611a;
                        dhv dhvVar6 = dhvVar5;
                        eby ebyVar2 = ebyVar;
                        ikw ikwVar = ikwVarM11415a2;
                        msi msiVar2 = msiVar;
                        gzk gzkVar = (gzk) jwnVar2.mo3831be();
                        return Boolean.valueOf((ikwVar == ikw.LONG_EXPOSURE || (dhvVar6.mo6184l(did.f11424ac) && dhvVar6.mo6184l(did.f11431aj) && ((Boolean) ebyVar2.f13316b.mo3831be()).booleanValue())) && !(gzkVar != null && gzkVar != gzk.ON && gzkVar != gzk.ON_LOCKED) && ((Boolean) msiVar2.mo6051a()).booleanValue());
                    }
                };
            case 11:
                return new gkb((ecq) this.f24197d.get(), ((fxk) this.f24199f).get(), ((geb) this.f24196c).get(), (kbz) this.f24195b.get(), ((gjk) this.f24194a).get(), (gva) this.f24198e.get(), null);
            case 12:
                dhv dhvVar6 = (dhv) this.f24198e.get();
                kfk kfkVar3 = (kfk) this.f24199f.get();
                Map map = (Map) this.f24196c.get();
                mrm mrmVar3 = (mrm) this.f24194a.get();
                mrm mrmVar4 = (mrm) this.f24195b.get();
                oju ojuVar8 = this.f24197d;
                kgg kggVar = (kgg) map.get(gnf.f25701c);
                kgg kggVar2 = (kgg) map.get(gnf.RAW_TELE);
                if (!dhvVar6.mo6184l(dio.f11683y) || kggVar == null || kggVar2 == null) {
                    return mqu.f41450a;
                }
                return gmz.m9536d(kfkVar3, mxk.m17137I(kggVar, kggVar2), dhvVar6.mo6184l(did.f11436ao) ? mrmVar4 : mqu.f41450a, mrmVar3, mqu.f41450a, ((ohm) ojuVar8).get());
            case 13:
                boolean zBooleanValue3 = ((gck) this.f24197d).m9058b().booleanValue();
                oju ojuVar9 = this.f24198e;
                dhv dhvVar7 = (dhv) this.f24199f.get();
                oju ojuVar10 = this.f24196c;
                kbz kbzVar = (kbz) this.f24195b.get();
                bkn bknVar2 = ((gan) this.f24194a).get();
                if (zBooleanValue3) {
                    ArrayList arrayList = new ArrayList();
                    int i = (dhvVar7.mo6184l(did.f11413X) ? 1 : 0) + 1 + (dhvVar7.mo6184l(did.f11401L) ? 1 : 0);
                    jwn jwnVarMo9523b = ((gmo) ojuVar9.get()).mo9523b();
                    ((jvb) ojuVar10.get()).m13537d(jwnVarMo9523b.mo3830a(new gmb(kbzVar.mo13958b("FrameStreamCapacity"), bknVar2, 0, (byte[]) null, (byte[]) null), not.INSTANCE));
                    cjz cjzVar = new cjz(jwnVarMo9523b, jwr.m13637g(1), jwr.m13637g(Integer.valueOf(i + 1)));
                    arrayList.add(cjzVar);
                    dhx dhxVar = dib.f11240a;
                    dhvVar7.mo6175c();
                    ((jvb) ojuVar10.get()).m13537d(cjzVar.mo3830a(new ctz(ojuVar9, jwnVarMo9523b, kbzVar.mo13958b("FrameStreamAvailability"), 12), not.INSTANCE));
                    jwnVarM13633c = jwr.m13633c(arrayList);
                } else {
                    jwnVarM13633c = jwr.m13637g(false);
                }
                jwnVarM13633c.getClass();
                return jwnVarM13633c;
            case 14:
                jvd jvdVar = (jvd) this.f24197d.get();
                jvb jvbVar3 = (jvb) this.f24194a.get();
                kfk kfkVar4 = (kfk) this.f24198e.get();
                mrm mrmVar5 = (mrm) this.f24196c.get();
                nps npsVar = ((fxa) this.f24195b).get();
                mrm mrmVarM8495b = ((fjp) this.f24199f).m8495b();
                if (!mrmVar5.mo16813g()) {
                    return ciz.f5911a;
                }
                if (!mrmVarM8495b.mo16813g()) {
                    jvbVar3.m13537d(kfkVar4.mo14129p(kfkVar4.mo14132s((kgg) mrmVar5.mo16809c())));
                }
                return dez.m6038h(new dxt(npsVar, mrmVarM8495b, mrmVar5, jvdVar, 2), "pckvf");
            case 15:
                dhv dhvVar8 = (dhv) this.f24197d.get();
                hah hahVar2 = (hah) this.f24196c.get();
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.f24195b.get();
                ((cde) this.f24199f).m3490a().booleanValue();
                ohb ohbVarM18485a2 = ohh.m18485a(this.f24194a);
                ohh.m18485a(this.f24198e);
                if (dhvVar8.mo6184l(dio.f11667i)) {
                    objM17136H = mxk.m17136H(new clq(ambientController, dhvVar8.mo6184l(did.f11425ad) ? mxk.m17137I(ikw.PHOTO, ikw.LONG_EXPOSURE) : mxk.m17136H(ikw.PHOTO), hahVar2.mo10029a(gzy.f27058q), ohbVarM18485a2, 3, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 16:
                return new gpq(((dww) this.f24194a).m6836a(), (fly) this.f24197d.get(), (jfs) this.f24196c.get(), (jwn) this.f24195b.get(), (ScheduledExecutorService) this.f24198e.get(), ((cmx) this.f24199f).get(), null, null, null);
            case 17:
                kfk kfkVar5 = (kfk) this.f24198e.get();
                oju ojuVar11 = this.f24199f;
                oju ojuVar12 = this.f24196c;
                oju ojuVar13 = this.f24195b;
                mrm mrmVar6 = (mrm) this.f24197d.get();
                oju ojuVar14 = this.f24194a;
                ffw ffwVar = ffw.f21758d;
                long nanos = TimeUnit.SECONDS.toNanos(5L);
                if (mrmVar6.mo16813g()) {
                    gofVarM19486n = ((gjg) ojuVar11).get().m10142a(nanos, kfkVar5.mo14131r((kho) mrmVar6.mo16809c(), 6), ffwVar, 2);
                } else {
                    lku.m15669w(((Map) ojuVar14.get()).size() > 1);
                    gofVarM19486n = ((gjb) ojuVar12).get().m19486n(nanos, 6, ffwVar);
                }
                gofVarM19486n.mo9308f().mo9414n(((guw) ojuVar13).get());
                return gofVarM19486n;
            case 18:
                return new kqj(((kqy) this.f24194a).get(), (kbz) this.f24195b.get(), ((kbm) this.f24198e).get(), (dhv) this.f24199f.get(), (hah) this.f24196c.get(), (krj) this.f24197d.get());
            case 19:
                return new hec((jvd) this.f24194a.get(), (fcp) this.f24195b.get(), ((hsm) this.f24199f).get(), (djm) this.f24198e.get(), (ihk) this.f24196c.get(), (dhv) this.f24197d.get(), null, null, null, null, null);
            default:
                ActivityC0157ei activityC0157ei = ((emd) this.f24199f).get();
                hmy hmyVar = (hmy) this.f24196c.get();
                msi msiVar2 = ((hzr) this.f24194a).get();
                return new hff(activityC0157ei, hmyVar, msiVar2, ((emc) this.f24195b).get());
        }
    }
}
