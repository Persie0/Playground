package p177ic;

import android.util.Property;
import android.view.ViewGroup;
import com.linguist.R;

/* JADX INFO: renamed from: ic.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6310c extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a */
    public static final C6310c f36529a = new C6310c();

    public C6310c() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f3 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f3 != null ? f3 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f3) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f3.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup2.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
