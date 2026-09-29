package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.layout.AbstractC0342i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.thb;
import p000.ui3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final class FocusTargetInteropNode$retrievePinnableContainer$1 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f5163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0449i f5164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetInteropNode$retrievePinnableContainer$1(Ref$ObjectRef ref$ObjectRef, C0449i c0449i) {
        super(0);
        this.f5163b = ref$ObjectRef;
        this.f5164c = c0449i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        this.f5163b.f47718a = thb.m22050i(this.f5164c, AbstractC0342i.f4215a);
        return xfa.f68157a;
    }
}
