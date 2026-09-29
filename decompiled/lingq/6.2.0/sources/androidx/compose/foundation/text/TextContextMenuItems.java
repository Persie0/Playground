package androidx.compose.foundation.text;

import android.R;
import android.content.res.Resources;
import androidx.compose.p002ui.platform.AbstractC0394f;
import kotlin.enums.AbstractC3201a;
import p000.b34;
import p000.tj3;
import p000.ye1;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum TextContextMenuItems {
    Cut(b34.f7849j, R.string.cut, R.attr.actionModeCutDrawable),
    Copy(b34.f7850k, R.string.copy, R.attr.actionModeCopyDrawable),
    Paste(b34.f7851l, R.string.paste, R.attr.actionModePasteDrawable),
    SelectAll(b34.f7852m, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(b34.f7853n, R.string.autofill, 0);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int drawableId;
    private final Object key;
    private final int stringId;

    TextContextMenuItems(Object obj, int i, int i2) {
        this.key = obj;
        this.stringId = i;
        this.drawableId = i2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getDrawableId-3I4p1mQ, reason: not valid java name */
    public final int m25903getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getStringId-9Hzcbyc, reason: not valid java name */
    public final int m25904getStringId9Hzcbyc() {
        return this.stringId;
    }

    public final String resolvedString(ye1 ye1Var, int i) {
        return ((Resources) ((tj3) ye1Var).m22128k(AbstractC0394f.f4762c)).getString(this.stringId);
    }
}
