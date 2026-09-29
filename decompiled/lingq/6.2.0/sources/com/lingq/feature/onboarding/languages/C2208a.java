package com.lingq.feature.onboarding.languages;

import com.lingq.core.data.repository.C1297m;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.cm4;
import p000.cx6;
import p000.dm4;
import p000.hm5;
import p000.il4;
import p000.lda;
import p000.lp4;
import p000.nn1;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.languages.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2208a extends wta {

    /* JADX INFO: renamed from: b */
    public final C1297m f27242b;

    /* JADX INFO: renamed from: c */
    public final nn1 f27243c;

    /* JADX INFO: renamed from: d */
    public final C3244l f27244d;

    /* JADX INFO: renamed from: e */
    public final c18 f27245e;

    public C2208a(hm5 hm5Var, C1297m c1297m, nn1 nn1Var) {
        Object value;
        hm5Var.getClass();
        c1297m.getClass();
        this.f27242b = c1297m;
        this.f27243c = nn1Var;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        ArrayList arrayList = new ArrayList();
        LanguageLearn[] languageLearnArrValues = LanguageLearn.values();
        ArrayList<LanguageLearn> arrayList2 = new ArrayList();
        for (LanguageLearn languageLearn : languageLearnArrValues) {
            if (languageLearn.isSupported()) {
                arrayList2.add(languageLearn);
            }
        }
        for (LanguageLearn languageLearn2 : arrayList2) {
            arrayList.add(new dm4(new il4(languageLearn2.getCode(), languageLearn2.isSupported())));
        }
        arrayList.add(new cm4(R$string.ui_more));
        LanguageLearn[] languageLearnArrValues2 = LanguageLearn.values();
        ArrayList<LanguageLearn> arrayList3 = new ArrayList();
        for (LanguageLearn languageLearn3 : languageLearnArrValues2) {
            if (!languageLearn3.isSupported()) {
                arrayList3.add(languageLearn3);
            }
        }
        for (LanguageLearn languageLearn4 : arrayList3) {
            arrayList.add(new dm4(new il4(languageLearn4.getCode(), languageLearn4.isSupported())));
        }
        do {
            value = c3244lM17114d.getValue();
        } while (!c3244lM17114d.m15570h(value, arrayList));
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(cx6.f34682a);
        this.f27244d = c3244lM17114d2;
        this.f27245e = AbstractC3224d.m15520B(new C3228h(c3244lM17114d, c3244lM17114d2, new OnboardingLanguageViewModel$languagesListUiState$1(3, null)), lda.m16103C(this), xi9.f68262a, new lp4(emptyList, cx6.f34682a));
        wfb.m23926u(lda.m16103C(this), this.f27243c, null, new OnboardingLanguageViewModel$1(this, null), 2);
    }
}
