package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.feature.imports.data.UserImportSourceType;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v4a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f64864b;

    public /* synthetic */ v4a(vi3 vi3Var, int i) {
        this.f64863a = i;
        this.f64864b = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f64863a;
        qf6 qf6Var = qf6.f57699a;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f64864b;
        switch (i) {
            case 0:
                TokenMeaning tokenMeaning = (TokenMeaning) obj;
                if (tokenMeaning != null) {
                    vi3Var.invoke(new d2a(tokenMeaning));
                }
                vi3Var.invoke(k2a.f46595a);
                return xfaVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new e3a(str));
                return xfaVar;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new c2a(str2));
                return xfaVar;
            case 3:
                TokenStatus tokenStatus = (TokenStatus) obj;
                tokenStatus.getClass();
                vi3Var.invoke(new i3a(tokenStatus));
                return xfaVar;
            case 4:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                aq4 aq4VarMo1662D = aq4Var.mo1662D();
                float fIntBitsToFloat = Float.intBitsToFloat((int) ((aq4VarMo1662D != null ? aq4VarMo1662D.mo1667K(aq4Var, 0L) : 0L) >> 32));
                aq4 aq4VarMo1662D2 = aq4Var.mo1662D();
                vi3Var.invoke(new gq6((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) ((aq4VarMo1662D2 != null ? aq4VarMo1662D2.mo1667K(aq4Var, 0L) : 0L) & 4294967295L)) + (((int) (aq4Var.mo1687j() & 4294967295L)) / 2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
                return xfaVar;
            case 5:
                cka ckaVar = (cka) obj;
                ckaVar.getClass();
                if (ckaVar.equals(aka.f783a)) {
                    vi3Var.invoke(tg6Var);
                } else {
                    if (!ckaVar.equals(bka.f8646a)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(wg6.f66795a);
                }
                return xfaVar;
            case 6:
                t14 t14Var = (t14) obj;
                t14Var.getClass();
                if (t14Var.equals(o14.f53586a)) {
                    vi3Var.invoke(tg6Var);
                } else if (t14Var.equals(p14.f55428a)) {
                    vi3Var.invoke(fh6.f39108a);
                } else if (t14Var.equals(r14.f58484a)) {
                    vi3Var.invoke(hh6.f42374a);
                } else if (t14Var instanceof s14) {
                    vi3Var.invoke(new ih6(((s14) t14Var).f60147a));
                } else {
                    if (!(t14Var instanceof q14)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(new gh6(((q14) t14Var).f57126a));
                }
                return xfaVar;
            case 7:
                vi3Var.invoke(new y14(((Boolean) obj).booleanValue()));
                return xfaVar;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                vi3Var.invoke(new q14(str3));
                return xfaVar;
            case 9:
                js4 js4Var = (js4) obj;
                js4Var.getClass();
                ys2 entries = UserImportSourceType.getEntries();
                js4Var.f46073b.m12798a(entries.size(), new is4(null, js4.f46071c, new C3050gt(entries, 4), new C0282a(-1117249557, true, new jq0(entries, vi3Var, 3))));
                return xfaVar;
            case 10:
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) obj;
                playerConstants$PlayerState.getClass();
                int i2 = gqa.f41202a[playerConstants$PlayerState.ordinal()];
                if (i2 == 1) {
                    vi3Var.invoke(new ora(xa7.f67999e));
                } else if (i2 == 2) {
                    vi3Var.invoke(new ora(ua7.f63643e));
                }
                return xfaVar;
            case 11:
                vi3Var.invoke(new ora(new ia7(((Float) obj).floatValue())));
                return xfaVar;
            case 12:
                vi3Var.invoke(new ora(new la7(((Float) obj).floatValue())));
                return xfaVar;
            case 13:
                ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) obj;
                themeSettingsTab.getClass();
                vi3Var.invoke(new nra(themeSettingsTab));
                return xfaVar;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                vi3Var.invoke(new ixa(str4));
                return xfaVar;
            case 15:
                fg6 fg6Var = (fg6) obj;
                fg6Var.getClass();
                if (fg6Var instanceof zf6) {
                    vi3Var.invoke(new si6(((zf6) fg6Var).f71493a));
                } else if (!fg6Var.equals(qf6Var)) {
                    gm5.m12750e();
                    return null;
                }
                return xfaVar;
            case 16:
                fg6 fg6Var2 = (fg6) obj;
                fg6Var2.getClass();
                if (fg6Var2.equals(qf6Var)) {
                    vi3Var.invoke(tg6Var);
                } else if (!(fg6Var2 instanceof zf6)) {
                    gm5.m12750e();
                    return null;
                }
                return xfaVar;
            case 17:
                TokenStatus tokenStatus2 = (TokenStatus) obj;
                tokenStatus2.getClass();
                vi3Var.invoke(Integer.valueOf(y7d.m24986e(tokenStatus2)));
                return xfaVar;
            case 18:
                TokenStatus tokenStatus3 = (TokenStatus) obj;
                tokenStatus3.getClass();
                vi3Var.invoke(Integer.valueOf(y7d.m24986e(tokenStatus3)));
                return xfaVar;
            case 19:
                sxa sxaVar = (sxa) obj;
                sxaVar.getClass();
                vi3Var.invoke(new i0b(sxaVar.f61563b));
                return xfaVar;
            case 20:
                sxa sxaVar2 = (sxa) obj;
                sxaVar2.getClass();
                vi3Var.invoke(new exa(sxaVar2));
                return xfaVar;
            case 21:
                String str5 = (String) obj;
                str5.getClass();
                vi3Var.invoke(new zwa(str5));
                return xfaVar;
            default:
                VocabularyContentFilter vocabularyContentFilter = (VocabularyContentFilter) obj;
                vocabularyContentFilter.getClass();
                vi3Var.invoke(new rwa(vocabularyContentFilter));
                return xfaVar;
        }
    }
}
