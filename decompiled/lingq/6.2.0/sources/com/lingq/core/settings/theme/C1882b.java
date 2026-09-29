package com.lingq.core.settings.theme;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.settings.CantoneseScript;
import com.lingq.core.domain.model.settings.ChineseScript;
import com.lingq.core.domain.model.settings.ChineseTraditionalScript;
import com.lingq.core.domain.model.settings.JapaneseScript;
import com.lingq.core.domain.model.settings.LatinScript;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.domain.token.C1538f;
import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.AbstractC3423or;
import p000.c83;
import p000.fa4;
import p000.gm5;
import p000.i83;
import p000.n78;
import p000.n83;
import p000.si7;
import p000.v91;
import p000.va3;
import p000.vi7;
import p000.wi7;
import p000.ys2;

/* JADX INFO: renamed from: com.lingq.core.settings.theme.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1882b {

    /* JADX INFO: renamed from: a */
    public final si7 f23297a;

    /* JADX INFO: renamed from: b */
    public final C1530a f23298b;

    /* JADX INFO: renamed from: c */
    public final C1538f f23299c;

    /* JADX INFO: renamed from: d */
    public final va3 f23300d;

    public C1882b(si7 si7Var, C1530a c1530a, C1538f c1538f, va3 va3Var) {
        si7Var.getClass();
        va3Var.getClass();
        this.f23297a = si7Var;
        this.f23298b = c1530a;
        this.f23299c = c1538f;
        this.f23300d = va3Var;
    }

    /* JADX INFO: renamed from: b */
    public static List m8682b(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        if (fa4.m11650l(str, LanguageLearn.Mandarin.getCode())) {
            ys2<ChineseScript> entries = ChineseScript.getEntries();
            ArrayList arrayList = new ArrayList(v91.m23189q0(entries, 10));
            for (ChineseScript chineseScript : entries) {
                chineseScript.getClass();
                int i5 = n78.f52459o[chineseScript.ordinal()];
                if (i5 == 1) {
                    i4 = R$string.settings_asian_no_transliteration;
                } else if (i5 == 2) {
                    i4 = R$string.settings_asian_pinyin;
                } else {
                    if (i5 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    i4 = R$string.settings_asian_traditional;
                }
                arrayList.add(new Pair(Integer.valueOf(i4), chineseScript.name()));
            }
            return arrayList;
        }
        if (fa4.m11650l(str, LanguageLearn.Japanese.getCode())) {
            ys2<JapaneseScript> entries2 = JapaneseScript.getEntries();
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(entries2, 10));
            for (JapaneseScript japaneseScript : entries2) {
                arrayList2.add(new Pair(Integer.valueOf(AbstractC3423or.m18257h0(japaneseScript)), japaneseScript.name()));
            }
            return arrayList2;
        }
        if (fa4.m11650l(str, LanguageLearn.ChineseTraditional.getCode())) {
            ys2<ChineseTraditionalScript> entries3 = ChineseTraditionalScript.getEntries();
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(entries3, 10));
            for (ChineseTraditionalScript chineseTraditionalScript : entries3) {
                chineseTraditionalScript.getClass();
                int i6 = n78.f52460p[chineseTraditionalScript.ordinal()];
                if (i6 == 1) {
                    i3 = R$string.settings_asian_no_transliteration;
                } else if (i6 == 2) {
                    i3 = R$string.settings_asian_pinyin;
                } else {
                    if (i6 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    i3 = R$string.settings_asian_simplified;
                }
                arrayList3.add(new Pair(Integer.valueOf(i3), chineseTraditionalScript.name()));
            }
            return arrayList3;
        }
        if (fa4.m11650l(str, LanguageLearn.Cantonese.getCode())) {
            ys2<CantoneseScript> entries4 = CantoneseScript.getEntries();
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(entries4, 10));
            for (CantoneseScript cantoneseScript : entries4) {
                cantoneseScript.getClass();
                int i7 = n78.f52462r[cantoneseScript.ordinal()];
                if (i7 == 1) {
                    i2 = R$string.settings_asian_jyutping;
                } else if (i7 == 2) {
                    i2 = R$string.settings_asian_no_transliteration;
                } else {
                    if (i7 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    i2 = R$string.settings_asian_simplified;
                }
                arrayList4.add(new Pair(Integer.valueOf(i2), cantoneseScript.name()));
            }
            return arrayList4;
        }
        if (!AbstractC3184kh.m15230y(str)) {
            return EmptyList.f47638a;
        }
        ys2<LatinScript> entries5 = LatinScript.getEntries();
        ArrayList arrayList5 = new ArrayList(v91.m23189q0(entries5, 10));
        for (LatinScript latinScript : entries5) {
            latinScript.getClass();
            int i8 = n78.f52458n[latinScript.ordinal()];
            if (i8 == 1) {
                i = R$string.settings_latin;
            } else {
                if (i8 != 2) {
                    gm5.m12750e();
                    return null;
                }
                i = R$string.settings_asian_no_transliteration;
            }
            arrayList5.add(new Pair(Integer.valueOf(i), latinScript.name()));
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m8683a(String str, boolean z) {
        c83 i83Var;
        c83 i83Var2;
        si7 si7Var = this.f23297a;
        C1368a c1368a = (C1368a) si7Var;
        c83 c83Var = z ? c1368a.f18344H0 : c1368a.f18466z0;
        C1368a c1368a2 = (C1368a) si7Var;
        vi7 vi7Var = z ? c1368a2.f18347I0 : c1368a2.f18341G0;
        C1368a c1368a3 = (C1368a) si7Var;
        C1368a c1368a4 = (C1368a) si7Var;
        n83 n83VarM15530i = AbstractC3224d.m15530i(c83Var, vi7Var, z ? c1368a3.f18350J0 : c1368a3.f18329C0, c1368a4.f18326B0, c1368a4.f18463y0, new ThemeSettingsProvider$build$readerSettings$1(null));
        n83 n83VarM15530i2 = AbstractC3224d.m15530i(this.f23298b.m8209a(), this.f23300d.mo8236I0(), this.f23299c.m8224a(str), c1368a4.f18324A1, c1368a4.f18327B1, new ThemeSettingsProvider$build$readerUiSettings$1(null));
        n83 n83VarM15532k = AbstractC3224d.m15532k(c1368a4.f18410g1, c1368a4.f18383W0, c1368a4.f18419j1, new ThemeSettingsProvider$build$readingToggleSettings$1());
        wi7 wi7Var = c1368a4.f18452u1;
        vi7 vi7Var2 = c1368a4.f18387Y0;
        vi7 vi7Var3 = c1368a4.f18385X0;
        LanguageLearn languageLearn = LanguageLearn.Mandarin;
        int i = 1;
        String str2 = "Off";
        if (str.equals(languageLearn.getCode())) {
            i83Var = c1368a4.f18389Z0;
        } else if (str.equals(LanguageLearn.Japanese.getCode())) {
            i83Var = c1368a4.f18392a1;
        } else if (str.equals(LanguageLearn.ChineseTraditional.getCode())) {
            i83Var = c1368a4.f18395b1;
        } else if (str.equals(LanguageLearn.Cantonese.getCode())) {
            i83Var = c1368a4.f18398c1;
        } else {
            i83Var = AbstractC3184kh.m15230y(str) ? c1368a4.f18401d1 : new i83(str2, i);
        }
        if (str.equals(languageLearn.getCode())) {
            i83Var2 = c1368a4.f18437p1;
        } else if (str.equals(LanguageLearn.Japanese.getCode())) {
            i83Var2 = c1368a4.f18440q1;
        } else if (str.equals(LanguageLearn.ChineseTraditional.getCode())) {
            i83Var2 = c1368a4.f18443r1;
        } else if (str.equals(LanguageLearn.Cantonese.getCode())) {
            i83Var2 = c1368a4.f18446s1;
        } else {
            i83Var2 = AbstractC3184kh.m15230y(str) ? c1368a4.f18449t1 : new i83(str2, i);
        }
        return AbstractC3224d.m15530i(n83VarM15530i, n83VarM15530i2, c1368a4.f18332D0, n83VarM15532k, AbstractC3224d.m15530i(wi7Var, vi7Var2, vi7Var3, i83Var, i83Var2, new ThemeSettingsProvider$build$readingDisplaySettings$1(null)), new ThemeSettingsProvider$build$1(this, str, null));
    }
}
