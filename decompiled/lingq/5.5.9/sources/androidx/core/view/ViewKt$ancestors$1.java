package androidx.core.view;

import android.view.ViewParent;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements InterfaceC2052l<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: j */
    public static final ViewKt$ancestors$1 f5602j = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final ViewParent mo528n(ViewParent viewParent) {
        ViewParent viewParent2 = viewParent;
        C5207g.m11111f(viewParent2, "p0");
        return viewParent2.getParent();
    }
}
