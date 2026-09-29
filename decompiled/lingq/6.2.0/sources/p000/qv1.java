package p000;

import com.lingq.feature.challenges.cup.data.CupPhase;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class qv1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58240a;

    static {
        int[] iArr = new int[CupPhase.values().length];
        try {
            iArr[CupPhase.LiveJoined.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CupPhase.LiveNotJoined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CupPhase.LiveSpectator.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CupPhase.Anonymous.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CupPhase.Finished.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CupPhase.PreCup.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f58240a = iArr;
    }
}
