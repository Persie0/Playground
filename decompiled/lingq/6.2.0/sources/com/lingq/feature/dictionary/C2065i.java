package com.lingq.feature.dictionary;

import com.lingq.core.common.util.AbstractC1263a;
import kotlinx.coroutines.flow.C3244l;
import p000.bh4;
import p000.lda;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2065i implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DictionariesManageFragment f25832a;

    public /* synthetic */ C2065i(DictionariesManageFragment dictionariesManageFragment) {
        this.f25832a = dictionariesManageFragment;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        ((Integer) obj).getClass();
        bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
        DictionariesManageFragment dictionariesManageFragment = this.f25832a;
        C3244l c3244l = dictionariesManageFragment.m8963B0().f25795e;
        Boolean bool = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        C2057b c2057bM8963B0 = dictionariesManageFragment.m8963B0();
        AbstractC1263a.m7047b(lda.m16103C(c2057bM8963B0), c2057bM8963B0.f25794d, "reorderActiveDictionaries", new DictManageViewModel$reorderActiveDictionaries$1(c2057bM8963B0, null));
        return xfa.f68157a;
    }
}
