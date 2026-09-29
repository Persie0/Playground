package p000;

import android.view.View;
import android.widget.Button;
import com.amplitude.android.internal.ViewTarget$Type;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: nl */
/* JADX INFO: loaded from: classes.dex */
public final class C3376nl implements lva {
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    @Override // p000.lva
    /* JADX INFO: renamed from: a */
    public final kva mo5076a(View view, Pair pair, ViewTarget$Type viewTarget$Type) {
        String string;
        CharSequence text;
        view.getClass();
        viewTarget$Type.getClass();
        float fFloatValue = ((Number) pair.f47623a).floatValue();
        float fFloatValue2 = ((Number) pair.f47624b).floatValue();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        if (((fFloatValue < ((float) i) || fFloatValue > ((float) (view.getWidth() + i)) || fFloatValue2 < ((float) i2) || fFloatValue2 > ((float) (view.getHeight() + i2)) || viewTarget$Type != ViewTarget$Type.Clickable || !view.isClickable() || view.getVisibility() != 0) ? null : view) == null) {
            return null;
        }
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        String str = canonicalName;
        String strM24432a = xad.m24432a(view);
        ArrayList arrayList = new ArrayList();
        View view2 = view;
        while (view2 != null) {
            arrayList.add(view2.getClass().getSimpleName());
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        String strM22596N0 = u91.m22596N0(arrayList, " → ", null, null, null, 62);
        Object tag = view.getTag();
        if (tag == null) {
            string = null;
        } else {
            if (!(tag instanceof String) && !(tag instanceof Number) && !(tag instanceof Boolean) && !(tag instanceof Character)) {
                tag = null;
            }
            if (tag != null) {
                string = tag.toString();
            } else {
                string = null;
            }
        }
        Button button = view instanceof Button ? (Button) view : null;
        String string2 = (button == null || (text = button.getText()) == null) ? null : text.toString();
        CharSequence contentDescription = view.getContentDescription();
        String string3 = contentDescription != null ? contentDescription.toString() : null;
        Object tag2 = view.getTag(-1989905945);
        Boolean bool = tag2 instanceof Boolean ? (Boolean) tag2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Object tag3 = view.getTag(-633031234);
        Boolean bool2 = tag3 instanceof Boolean ? (Boolean) tag3 : null;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Object tag4 = view.getTag(457577948);
        Boolean bool3 = tag4 instanceof Boolean ? (Boolean) tag4 : null;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        C3339ml c3339ml = new C3339ml(zBooleanValue || zBooleanValue3, zBooleanValue2 || zBooleanValue3);
        return new kva(view, str, strM24432a, string, string2, string3, "android_view", strM22596N0, c3339ml.m16916b(), c3339ml.m16915a());
    }
}
