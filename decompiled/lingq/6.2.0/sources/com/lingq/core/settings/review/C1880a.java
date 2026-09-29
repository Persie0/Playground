package com.lingq.core.settings.review;

import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.settings.R$string;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.domain.C1866e;
import com.lingq.core.settings.domain.C1868g;
import com.lingq.core.settings.domain.C1870i;
import com.lingq.core.settings.domain.C1872k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3173k6;
import p000.C3540rl;
import p000.bf8;
import p000.bg8;
import p000.bx0;
import p000.c18;
import p000.c83;
import p000.cf8;
import p000.cg8;
import p000.cma;
import p000.df8;
import p000.dg8;
import p000.do0;
import p000.e29;
import p000.ef8;
import p000.eh9;
import p000.ff8;
import p000.gf8;
import p000.gm5;
import p000.hf8;
import p000.i19;
import p000.i83;
import p000.if8;
import p000.ig8;
import p000.jf8;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.o19;
import p000.p33;
import p000.ph4;
import p000.q19;
import p000.vz1;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.xi9;
import p000.yf8;
import p000.z19;
import p000.zf8;

/* JADX INFO: renamed from: com.lingq.core.settings.review.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1880a extends wta implements cma, jf8 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f23178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jf8 f23179c;

    /* JADX INFO: renamed from: d */
    public final C1870i f23180d;

    /* JADX INFO: renamed from: e */
    public final C1872k f23181e;

    /* JADX INFO: renamed from: f */
    public final C1866e f23182f;

    /* JADX INFO: renamed from: g */
    public final C1868g f23183g;

    /* JADX INFO: renamed from: h */
    public final nn1 f23184h;

    /* JADX INFO: renamed from: i */
    public final ViewKeys f23185i;

    /* JADX INFO: renamed from: j */
    public final Integer f23186j;

    /* JADX INFO: renamed from: k */
    public final C3244l f23187k;

    /* JADX INFO: renamed from: l */
    public final C3244l f23188l;

    /* JADX INFO: renamed from: m */
    public final C3244l f23189m;

    /* JADX INFO: renamed from: n */
    public final C3244l f23190n;

    /* JADX INFO: renamed from: o */
    public final C3244l f23191o;

    /* JADX INFO: renamed from: p */
    public final C3244l f23192p;

    /* JADX INFO: renamed from: q */
    public final c18 f23193q;

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00dd. Please report as an issue. */
    public C1880a(p33 p33Var, C1870i c1870i, C1872k c1872k, C1866e c1866e, C1868g c1868g, nn1 nn1Var, cma cmaVar, jf8 jf8Var, nl8 nl8Var) {
        Integer numValueOf;
        c83 wz0Var;
        c83 bg8Var;
        cg8 cg8Var;
        ig8 ig8Var = (ig8) p33Var.f55513b;
        cmaVar.getClass();
        jf8Var.getClass();
        nl8Var.getClass();
        this.f23178b = cmaVar;
        this.f23179c = jf8Var;
        this.f23180d = c1870i;
        this.f23181e = c1872k;
        this.f23182f = c1866e;
        this.f23183g = c1868g;
        this.f23184h = nn1Var;
        ViewKeys viewKeys = (ViewKeys) nl8Var.m17488b("viewKey");
        viewKeys = viewKeys == null ? ViewKeys.ActivitiesSettings : viewKeys;
        this.f23185i = viewKeys;
        int[] iArr = zf8.f71494a;
        switch (iArr[viewKeys.ordinal()]) {
            case 1:
                numValueOf = Integer.valueOf(R$string.activities_settings);
                break;
            case 2:
                numValueOf = Integer.valueOf(R$string.settings_flashcards);
                break;
            case 3:
                numValueOf = Integer.valueOf(R$string.settings_reverse_flashcards);
                break;
            case 4:
                numValueOf = Integer.valueOf(R$string.settings_cloze_test);
                break;
            case 5:
                numValueOf = Integer.valueOf(R$string.settings_multiple_choice);
                break;
            case 6:
                numValueOf = Integer.valueOf(R$string.settings_dictation);
                break;
            case 7:
                numValueOf = Integer.valueOf(R$string.settings_text_matching_settings);
                break;
            case 8:
                numValueOf = Integer.valueOf(R$string.settings_text_unscramble_settings);
                break;
            case 9:
                numValueOf = Integer.valueOf(R$string.review_settings_speaking);
                break;
            default:
                numValueOf = null;
                break;
        }
        this.f23186j = numValueOf;
        this.f23187k = AbstractC3352my.m17114d(new C3173k6(10, true, true, true, true, true, true, true, true, false));
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f23188l = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f23189m = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d("Off");
        this.f23190n = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f23191o = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(10);
        this.f23192p = c3244lM17114d5;
        int i = iArr[viewKeys.ordinal()];
        EmptyList emptyList = EmptyList.f47638a;
        int i2 = 5;
        if (i != 9) {
            int i3 = 1;
            switch (i) {
                case 1:
                    String strMo4589b2 = cmaVar.mo4589b2();
                    strMo4589b2.getClass();
                    C1370c c1370c = (C1370c) ig8Var;
                    i2 = 5;
                    wz0Var = new bg8(AbstractC3224d.m15531j(c1370c.f18501M, AbstractC3224d.m15530i(c1370c.f18502N, c1370c.f18503O, c1370c.f18504P, c1370c.f18505Q, c1370c.f18506R, new ReviewSettingsProvider$observeActivities$1(null)), AbstractC3224d.m15532k(c1370c.f18546p0, c1370c.f18548q0, c1370c.f18550r0, new ReviewSettingsProvider$observeActivities$2(4, null)), new bx0(((C1307w) p33Var.f55514c).m7396k(strMo4589b2), 19), new ReviewSettingsProvider$observeActivities$4(5, null)), this, 0);
                    break;
                case 2:
                    C1370c c1370c2 = (C1370c) ig8Var;
                    cg8Var = new cg8(AbstractC3224d.m15530i(AbstractC3224d.m15530i(c1370c2.f18507S, c1370c2.f18509U, c1370c2.f18508T, c1370c2.f18510V, c1370c2.f18518b0, new ReviewSettingsProvider$observeFlashcardSettings$1(null)), AbstractC3224d.m15530i(c1370c2.f18511W, c1370c2.f18514Z, c1370c2.f18512X, c1370c2.f18516a0, c1370c2.f18520c0, new ReviewSettingsProvider$observeFlashcardSettings$2(null)), c1370c2.f18522d0, new C3540rl(c1370c2.f18513Y, 5), new C3228h(new C3540rl(c1370c2.f18552s0, 5), new C3540rl(c1370c2.f18500L, 5), new ReviewSettingsProvider$observeFlashcardSettings$3(3, null)), new ReviewSettingsProvider$observeFlashcardSettings$4(null)), this, 0);
                    bg8Var = cg8Var;
                    emptyList = emptyList;
                    i2 = 5;
                    break;
                case 3:
                    C1370c c1370c3 = (C1370c) ig8Var;
                    cg8Var = new cg8(AbstractC3224d.m15530i(AbstractC3224d.m15530i(c1370c3.f18524e0, c1370c3.f18528g0, c1370c3.f18526f0, c1370c3.f18530h0, c1370c3.f18540m0, new ReviewSettingsProvider$observeReverseFlashcardSettings$1(null)), AbstractC3224d.m15530i(c1370c3.f18532i0, c1370c3.f18536k0, c1370c3.f18534j0, c1370c3.f18538l0, c1370c3.f18542n0, new ReviewSettingsProvider$observeReverseFlashcardSettings$2(null)), c1370c3.f18544o0, new C3540rl(c1370c3.f18513Y, 5), new C3228h(new C3540rl(c1370c3.f18552s0, 5), new C3540rl(c1370c3.f18500L, 5), new ReviewSettingsProvider$observeReverseFlashcardSettings$3(3, null)), new ReviewSettingsProvider$observeReverseFlashcardSettings$4(null)), this, 1);
                    bg8Var = cg8Var;
                    emptyList = emptyList;
                    i2 = 5;
                    break;
                case 4:
                case 5:
                case 6:
                    C1370c c1370c4 = (C1370c) ig8Var;
                    bg8Var = new bg8(AbstractC3224d.m15531j(new C3540rl(c1370c4.f18552s0, 5), new C3540rl(c1370c4.f18513Y, 5), new C3540rl(c1370c4.f18500L, 5), new C3540rl(c1370c4.f18554t0, 5), new ReviewSettingsProvider$observeActivityDetail$1(5, null)), this, i3);
                    emptyList = emptyList;
                    break;
                default:
                    bg8Var = new i83(emptyList, i3);
                    emptyList = emptyList;
                    break;
            }
            this.f23193q = AbstractC3224d.m15520B(AbstractC3224d.m15532k(bg8Var, c3244lM17114d, AbstractC3224d.m15531j(c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, new ReviewSettingsViewModel$state$1(i2, null)), new ReviewSettingsViewModel$state$2(4, null)), lda.m16103C(this), xi9.f68262a, new yf8(emptyList, null, null, "Off", false, 10));
        }
        wz0Var = new wz0(26, new ph4(new C3540rl(((C1370c) ig8Var).f18552s0, 5), 7), this);
        bg8Var = wz0Var;
        this.f23193q = AbstractC3224d.m15520B(AbstractC3224d.m15532k(bg8Var, c3244lM17114d, AbstractC3224d.m15531j(c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, new ReviewSettingsViewModel$state$1(i2, null)), new ReviewSettingsViewModel$state$2(4, null)), lda.m16103C(this), xi9.f68262a, new yf8(emptyList, null, null, "Off", false, 10));
    }

    /* JADX INFO: renamed from: V2 */
    public static final ListBuilder m8659V2(C1880a c1880a, do0 do0Var, boolean z) {
        Map map;
        int i;
        String str;
        cma cmaVar = c1880a.f23178b;
        ReviewSettingsKeys reviewSettingsKeys = z ? ReviewSettingsKeys.ReverseFlashcards : ReviewSettingsKeys.Flashcards;
        ViewKeys viewKeys = z ? ViewKeys.ReverseFlashcardsFrontTransliteration : ViewKeys.FlashcardsFrontTransliteration;
        ViewKeys viewKeys2 = z ? ViewKeys.ReverseFlashcardsBackTransliteration : ViewKeys.FlashcardsBackTransliteration;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        listBuilderM23650t.add(new o19(R$string.settings_text_options));
        int i2 = R$string.settings_shuffle;
        Map map2 = do0Var.f35928n;
        Map map3 = do0Var.f35926l;
        Boolean bool = (Boolean) map2.get(reviewSettingsKeys.name());
        listBuilderM23650t.add(new z19(i2, null, bool != null ? bool.booleanValue() : false, ViewKeys.ShuffleCards, false));
        int i3 = R$string.settings_autoplay_tts;
        Boolean bool2 = (Boolean) do0Var.f35927m.get(reviewSettingsKeys.name());
        listBuilderM23650t.add(new z19(i3, null, bool2 != null ? bool2.booleanValue() : false, ViewKeys.AutoplayTTS, false));
        listBuilderM23650t.add(new o19(R$string.settings_text_flashcards_front));
        listBuilderM23650t.add(new z19(R$string.settings_flashcards_term, null, do0Var.f35915a, z ? ViewKeys.ReverseFlashcardsFrontTerm : ViewKeys.FlashcardsFrontTerm, false));
        q19 q19Var = q19.f57132a;
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_source_text, null, do0Var.f35916b, z ? ViewKeys.ReverseFlashcardsFrontPhrase : ViewKeys.FlashcardsFrontPhrase, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.settings_translation, null, do0Var.f35917c, z ? ViewKeys.ReverseFlashcardsFrontTranslation : ViewKeys.FlashcardsFrontTranslation, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.lingq_tags, null, do0Var.f35919e, z ? ViewKeys.ReverseFlashcardFrontTags : ViewKeys.FlashcardFrontTags, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_flashcards_status_bar, null, do0Var.f35918d, z ? ViewKeys.ReverseFlashcardsFrontStatusBar : ViewKeys.FlashcardsFrontStatusBar, false));
        String str2 = "Off";
        if (AbstractC3184kh.m15231z(cmaVar.mo4589b2())) {
            int i4 = R$string.settings_transliteration_style;
            String string = (String) map3.get(i19.m13627a(viewKeys).name());
            if (string != null) {
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(string.charAt(0));
                    strValueOf.getClass();
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    sb.append((Object) upperCase);
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
                str = string;
            } else {
                str = "Off";
            }
            map = map3;
            i = 0;
            listBuilderM23650t.add(new e29(i4, null, viewKeys, str, null, 104));
        } else {
            map = map3;
            i = 0;
        }
        listBuilderM23650t.add(new o19(com.lingq.core.p012ui.R$string.ui_back));
        listBuilderM23650t.add(new z19(R$string.settings_flashcards_term, null, do0Var.f35920f, z ? ViewKeys.ReverseFlashcardsBackTerm : ViewKeys.FlashcardsBackTerm, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_source_text, null, do0Var.f35921g, z ? ViewKeys.ReverseFlashcardsBackPhrase : ViewKeys.FlashcardsBackPhrase, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.settings_translation, null, do0Var.f35922h, z ? ViewKeys.ReverseFlashcardsBackTranslation : ViewKeys.FlashcardsBackTranslation, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.lingq_tags, null, do0Var.f35924j, z ? ViewKeys.ReverseFlashcardBackTags : ViewKeys.FlashcardBackTags, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_note, null, do0Var.f35925k, z ? ViewKeys.ReverseFlashcardBackNotes : ViewKeys.FlashcardBackNotes, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_flashcards_status_bar, null, do0Var.f35923i, z ? ViewKeys.ReverseFlashcardsBackStatusBar : ViewKeys.FlashcardsBackStatusBar, false));
        if (AbstractC3184kh.m15231z(cmaVar.mo4589b2())) {
            int i5 = R$string.settings_transliteration_style;
            String string2 = (String) map.get(i19.m13627a(viewKeys2).name());
            if (string2 != null) {
                if (string2.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String strValueOf2 = String.valueOf(string2.charAt(i));
                    strValueOf2.getClass();
                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    sb2.append((Object) upperCase2);
                    sb2.append(string2.substring(1));
                    string2 = sb2.toString();
                }
                str2 = string2;
            }
            listBuilderM23650t.add(new e29(i5, null, viewKeys2, str2, null, 104));
        }
        return vz1.m23635i(listBuilderM23650t);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f23178b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f23178b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f23178b.mo4573B1();
    }

    @Override // p000.jf8
    /* JADX INFO: renamed from: C0 */
    public final void mo8660C0(boolean z) {
        this.f23179c.mo8660C0(z);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f23178b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f23178b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f23178b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f23178b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f23178b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f23178b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f23178b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f23178b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f23178b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f23178b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f23178b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f23178b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f23178b.mo4586T0();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m8661W2(if8 if8Var) {
        Object next;
        String str;
        if8Var.getClass();
        boolean z = if8Var instanceof gf8;
        nn1 nn1Var = this.f23184h;
        if (z) {
            gf8 gf8Var = (gf8) if8Var;
            ViewKeys viewKeys = gf8Var.f40738a;
            boolean z2 = gf8Var.f40739b;
            Set set = i19.f43354a;
            viewKeys.getClass();
            if (i19.f43354a.contains(viewKeys)) {
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReviewSettingsViewModel$onSwitchChanged$1(this, viewKeys, z2, null), 2);
                return;
            } else {
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReviewSettingsViewModel$onSwitchChanged$2(this, viewKeys, z2, null), 2);
                return;
            }
        }
        boolean z3 = if8Var instanceof ff8;
        C3244l c3244l = this.f23189m;
        C3244l c3244l2 = this.f23191o;
        if (!z3) {
            if (if8Var instanceof hf8) {
                hf8 hf8Var = (hf8) if8Var;
                ViewKeys viewKeys2 = hf8Var.f42307a;
                String str2 = hf8Var.f42308b;
                c3244l.m15571i(null);
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReviewSettingsViewModel$onTransliterationSelected$1(this, viewKeys2, str2, null), 2);
                return;
            }
            if (if8Var instanceof ef8) {
                int i = ((ef8) if8Var).f37191a;
                Boolean bool = Boolean.FALSE;
                c3244l2.getClass();
                c3244l2.m15572j(null, bool);
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new ReviewSettingsViewModel$onCardsPerSessionChanged$1(this, i, null), 2);
                return;
            }
            if (if8Var instanceof cf8) {
                this.f23188l.m15571i(null);
                return;
            }
            if (if8Var instanceof df8) {
                c3244l.m15571i(null);
                return;
            } else {
                if (!(if8Var instanceof bf8)) {
                    gm5.m12750e();
                    return;
                }
                Boolean bool2 = Boolean.FALSE;
                c3244l2.getClass();
                c3244l2.m15572j(null, bool2);
                return;
            }
        }
        ViewKeys viewKeys3 = ((ff8) if8Var).f39010a;
        if (viewKeys3 == ViewKeys.CardsPerSession) {
            Integer numValueOf = Integer.valueOf(((C3173k6) this.f23187k.getValue()).f46740a);
            C3244l c3244l3 = this.f23192p;
            c3244l3.getClass();
            c3244l3.m15572j(null, numValueOf);
            Boolean bool3 = Boolean.TRUE;
            c3244l2.getClass();
            c3244l2.m15572j(null, bool3);
            return;
        }
        if (dg8.f35622a.contains(viewKeys3)) {
            List list = ((yf8) ((C3244l) this.f23193q.f9311a).getValue()).f69771a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof e29) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((e29) next).f36626c != viewKeys3);
            e29 e29Var = (e29) next;
            if (e29Var == null || (str = e29Var.f36627d) == null) {
                str = "Off";
            }
            C3244l c3244l4 = this.f23190n;
            c3244l4.getClass();
            c3244l4.m15572j(null, str);
            c3244l.m15571i(viewKeys3);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f23178b.mo4587X();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f23178b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f23178b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f23178b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f23178b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f23178b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f23178b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f23178b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f23178b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f23178b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f23178b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f23178b.mo4598w2();
    }
}
