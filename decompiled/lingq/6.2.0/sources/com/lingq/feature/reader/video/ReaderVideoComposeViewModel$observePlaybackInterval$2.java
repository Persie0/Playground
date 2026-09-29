package com.lingq.feature.reader.video;

import com.lingq.feature.reader.video.state.C2597c;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p000.hqa;
import p000.m97;
import p000.n08;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class ReaderVideoComposeViewModel$observePlaybackInterval$2 extends AdaptedFunctionReference implements zi3 {
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        m97 m97Var = (m97) obj;
        C2597c c2597c = (C2597c) this.f47695a;
        n08 n08Var = C2583a.Companion;
        c2597c.f31570t.m15571i(m97Var);
        if (((Boolean) c2597c.f31565o.getValue()).booleanValue() && !c2597c.f31564n && !((hqa) c2597c.f31553c.getValue()).f42796d) {
            long jM16701e = c2597c.f31568r;
            if (m97Var != null) {
                jM16701e = m97Var.m16701e(jM16701e);
            }
            c2597c.f31567q = jM16701e;
        }
        return xfa.f68157a;
    }
}
