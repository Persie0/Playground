package p000;

import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bf9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8481a;

    static {
        int[] iArr = new int[SpecialEffectsController$Operation$State.values().length];
        try {
            iArr[SpecialEffectsController$Operation$State.REMOVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpecialEffectsController$Operation$State.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpecialEffectsController$Operation$State.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SpecialEffectsController$Operation$State.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f8481a = iArr;
    }
}
