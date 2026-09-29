package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ViewKt$ancestors$1 f5518i = new ViewKt$ancestors$1(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
