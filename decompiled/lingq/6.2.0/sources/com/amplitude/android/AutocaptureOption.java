package com.amplitude.android;

import java.util.Set;
import kotlin.enums.AbstractC3201a;
import p000.AbstractC3550rv;
import p000.u50;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.amplitude.android.AutocaptureOption, still in use, count: 1, list:
  (r0v0 com.amplitude.android.AutocaptureOption) from 0x004f: FILLED_NEW_ARRAY 
  (r0v0 com.amplitude.android.AutocaptureOption)
  (r1v1 com.amplitude.android.AutocaptureOption)
  (r2v2 com.amplitude.android.AutocaptureOption)
  (r3v2 com.amplitude.android.AutocaptureOption)
  (r4v2 com.amplitude.android.AutocaptureOption)
  (r5v2 com.amplitude.android.AutocaptureOption)
 A[WRAPPED] elemType: com.amplitude.android.AutocaptureOption
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class AutocaptureOption {
    SESSIONS,
    APP_LIFECYCLES,
    DEEP_LINKS,
    SCREEN_VIEWS,
    ELEMENT_INTERACTIONS,
    FRUSTRATION_INTERACTIONS;

    private static final /* synthetic */ ys2 $ENTRIES;
    private static final Set<AutocaptureOption> ALL;
    public static final u50 Companion;

    static {
        AutocaptureOption[] autocaptureOptionArrValues = values();
        $ENTRIES = AbstractC3201a.m15404a(autocaptureOptionArrValues);
        Companion = new u50();
        ALL = AbstractC3550rv.m20855w0(new AutocaptureOption[]{autocaptureOption, autocaptureOption, autocaptureOption, autocaptureOption, autocaptureOption, autocaptureOption});
    }

    private AutocaptureOption() {
        super(str, i);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static AutocaptureOption valueOf(String str) {
        return (AutocaptureOption) Enum.valueOf(AutocaptureOption.class, str);
    }

    public static AutocaptureOption[] values() {
        return (AutocaptureOption[]) $VALUES.clone();
    }
}
