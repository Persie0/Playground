package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.node.C0364n;
import kotlin.jvm.internal.Lambda;
import p000.ui3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidViewHolder$runUpdate$1 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0442b f5131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AbstractC0442b abstractC0442b) {
        super(0);
        this.f5131b = abstractC0442b;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        AbstractC0442b abstractC0442b = this.f5131b;
        if (abstractC0442b.f5195e && abstractC0442b.isAttachedToWindow() && abstractC0442b.getView().getParent() == abstractC0442b) {
            C0364n snapshotObserver = abstractC0442b.getSnapshotObserver();
            snapshotObserver.f4460a.m11067c(abstractC0442b, AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.f5104b, abstractC0442b.getUpdate());
        }
        return xfa.f68157a;
    }
}
