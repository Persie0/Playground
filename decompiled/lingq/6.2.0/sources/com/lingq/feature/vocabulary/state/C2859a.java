package com.lingq.feature.vocabulary.state;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3244l;
import p000.e83;
import p000.kp4;
import p000.pg9;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2859a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2860b f33771a;

    public C2859a(C2860b c2860b) {
        this.f33771a = c2860b;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        kp4 kp4Var = (kp4) obj;
        if (kp4Var != null) {
            List list = kp4Var.f48282b;
            if (!list.isEmpty()) {
                C2860b c2860b = this.f33771a;
                C3244l c3244l = c2860b.f33788q;
                c3244l.getClass();
                c3244l.m15572j(null, list);
                C2860b.m9763b(c2860b, false);
                pg9 pg9Var = c2860b.f33786o;
                if (pg9Var != null) {
                    pg9Var.mo4537a(null);
                }
                c2860b.f33786o = wfb.m23926u(c2860b.f33779h, null, null, new VocabularyFilterSheetStateHolder$collectTagItems$1(c2860b, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
