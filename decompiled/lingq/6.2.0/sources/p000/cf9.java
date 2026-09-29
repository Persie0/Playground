package p000;

import androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class cf9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10006a;

    static {
        int[] iArr = new int[SpecialEffectsController$Operation$LifecycleImpact.values().length];
        try {
            iArr[SpecialEffectsController$Operation$LifecycleImpact.ADDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpecialEffectsController$Operation$LifecycleImpact.REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpecialEffectsController$Operation$LifecycleImpact.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f10006a = iArr;
    }
}
