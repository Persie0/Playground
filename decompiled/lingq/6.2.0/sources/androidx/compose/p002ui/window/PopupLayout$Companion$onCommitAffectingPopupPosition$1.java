package androidx.compose.p002ui.window;

import kotlin.jvm.internal.Lambda;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 f5279b = new PopupLayout$Companion$onCommitAffectingPopupPosition$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        C0461i c0461i = (C0461i) obj;
        if (c0461i.isAttachedToWindow()) {
            c0461i.m1907q();
        }
        return xfa.f68157a;
    }
}
