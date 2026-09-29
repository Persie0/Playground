package androidx.compose.p002ui.focus;

import kotlin.jvm.internal.Lambda;
import p000.C3386nv;
import p000.fa4;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class FocusOwnerImpl$focusSearch$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0302d f3878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0301c f3879c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f3880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$focusSearch$1(C0302d c0302d, C0301c c0301c, vi3 vi3Var) {
        super(1);
        this.f3878b = c0302d;
        this.f3879c = c0301c;
        this.f3880d = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        C0302d c0302d = (C0302d) obj;
        if (fa4.m11650l(c0302d, this.f3878b)) {
            zBooleanValue = false;
        } else {
            if (fa4.m11650l(c0302d, this.f3879c.f3908c)) {
                C3386nv.m17633t("Focus search landed at the root.");
                return null;
            }
            zBooleanValue = ((Boolean) this.f3880d.invoke(c0302d)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
