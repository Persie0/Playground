package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: it */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0276it extends PopupWindow {
    public C0276it(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23275s, i, 0);
        if (ambientDelegateM1568D.m1575A(2)) {
            ahp.m682b(this, ambientDelegateM1568D.m1623z(2, false));
        }
        setBackgroundDrawable(ambientDelegateM1568D.m1618u(0));
        ambientDelegateM1568D.m1622y();
    }
}
