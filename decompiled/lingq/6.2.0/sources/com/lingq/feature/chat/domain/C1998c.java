package com.lingq.feature.chat.domain;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.chat.ChatPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.ao0;
import p000.c83;
import p000.i83;
import p000.kk8;
import p000.si7;
import p000.u91;
import p000.v91;

/* JADX INFO: renamed from: com.lingq.feature.chat.domain.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1998c {

    /* JADX INFO: renamed from: a */
    public final Object f25213a;

    public C1998c(si7 si7Var) {
        si7Var.getClass();
        this.f25213a = si7Var;
    }

    /* JADX INFO: renamed from: a */
    public c83 m8861a() {
        C1368a c1368a = (C1368a) ((si7) this.f25213a);
        return AbstractC3224d.m15536o(AbstractC3224d.m15530i(c1368a.f18336E1, c1368a.f18345H1, c1368a.f18460x0, c1368a.f18339F1, c1368a.f18342G1, new GetLynxSettingsUseCase$invoke$1(null)));
    }

    /* JADX INFO: renamed from: b */
    public c83 m8862b(String str, Map map) {
        str.getClass();
        map.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        ArrayList arrayListM23190r0 = v91.m23190r0(map.values());
        ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM23190r0, 10));
        Iterator it = arrayListM23190r0.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChatPhrase) it.next()).f18937a);
        }
        List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList));
        return listM22622n1.isEmpty() ? new i83(AbstractC3194a.m15360M(), 1) : new kk8(new GetCardsForSuggestedPhrasesUseCase$invoke$1(listM22622n1, this, str, localeForLanguageTag, null));
    }

    public C1998c(ao0 ao0Var) {
        ao0Var.getClass();
        this.f25213a = ao0Var;
    }
}
