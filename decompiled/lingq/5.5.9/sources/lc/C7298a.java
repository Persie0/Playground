package lc;

import ad.AbstractC0057a;
import android.content.Context;
import com.linguist.R;

/* JADX INFO: renamed from: lc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7298a extends AbstractC0057a {
    public C7298a(Context context) {
        super(context);
    }

    @Override // ad.AbstractC0057a
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // ad.AbstractC0057a
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
