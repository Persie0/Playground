package androidx.compose.p017ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C0782a;
import com.linguist.R;
import dm.C5207g;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.compose.ui.platform.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0638k1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComposeView f4322a;

    public ViewOnAttachStateChangeListenerC0638k1(AbstractComposeView abstractComposeView) {
        this.f4322a = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C5207g.m11111f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zBooleanValue;
        C5207g.m11111f(view, "v");
        AbstractComposeView abstractComposeView = this.f4322a;
        C5207g.m11111f(abstractComposeView, "<this>");
        Iterator it = C0782a.m2981c(abstractComposeView).iterator();
        while (true) {
            zBooleanValue = false;
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                C5207g.m11111f(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                if (zBooleanValue) {
                    zBooleanValue = true;
                    break;
                }
            }
        }
        if (!zBooleanValue) {
            abstractComposeView.m2242c();
        }
    }
}
