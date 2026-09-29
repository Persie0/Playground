package com.lingq.feature.dictionary;

import com.lingq.core.domain.model.language.DictionaryLocale;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import p000.bj3;
import p000.ft4;
import p000.tj3;
import p000.vi3;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2058c implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f25803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2061e f25804b;

    public C2058c(List list, C2061e c2061e) {
        this.f25803a = list;
        this.f25804b = c2061e;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft4 ft4Var = (ft4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
            DictionaryLocale dictionaryLocale = (DictionaryLocale) this.f25803a.get(iIntValue);
            tj3Var.m22111b0(1015821385);
            C2061e c2061e = this.f25804b;
            boolean zM22124i = tj3Var.m22124i(c2061e);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                DictionariesLocaleScreenKt$DictionariesLocaleScreen$3$1$1$1$1$1 dictionariesLocaleScreenKt$DictionariesLocaleScreen$3$1$1$1$1$1 = new DictionariesLocaleScreenKt$DictionariesLocaleScreen$3$1$1$1$1$1(1, c2061e, C2061e.class, "updateHintLocale", "updateHintLocale(Ljava/lang/String;)V", 0);
                tj3Var.m22131l0(dictionariesLocaleScreenKt$DictionariesLocaleScreen$3$1$1$1$1$1);
                objM22097O = dictionariesLocaleScreenKt$DictionariesLocaleScreen$3$1$1$1$1$1;
            }
            AbstractC2059d.m8976l(dictionaryLocale, (vi3) ((FunctionReference) objM22097O), tj3Var, 0);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
