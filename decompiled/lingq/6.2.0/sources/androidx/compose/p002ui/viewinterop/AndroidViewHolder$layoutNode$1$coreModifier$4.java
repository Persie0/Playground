package androidx.compose.p002ui.viewinterop;

import kotlin.jvm.internal.Lambda;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidViewHolder$layoutNode$1$coreModifier$4 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0442b f5120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$4(AbstractC0442b abstractC0442b) {
        super(1);
        this.f5120b = abstractC0442b;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        this.f5120b.f5181L = (vi3) obj;
        return xfa.f68157a;
    }
}
