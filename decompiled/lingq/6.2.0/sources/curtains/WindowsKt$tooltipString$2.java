package curtains;

import android.content.res.Resources;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final class WindowsKt$tooltipString$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final WindowsKt$tooltipString$2 f34564b = new WindowsKt$tooltipString$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        try {
            return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", "android"));
        } catch (Resources.NotFoundException unused) {
            return "Tooltip";
        }
    }
}
