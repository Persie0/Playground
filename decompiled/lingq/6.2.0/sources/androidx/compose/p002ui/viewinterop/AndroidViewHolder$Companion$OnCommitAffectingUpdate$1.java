package androidx.compose.p002ui.viewinterop;

import kotlin.jvm.internal.Lambda;
import p000.RunnableC3501qk;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 f5104b = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        AbstractC0442b abstractC0442b = (AbstractC0442b) obj;
        abstractC0442b.getHandler().post(new RunnableC3501qk(2, abstractC0442b.f5182M));
        return xfa.f68157a;
    }
}
