package p323pi;

import com.lingq.shared.uimodel.CardStatus;

/* JADX INFO: renamed from: pi.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8394a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f45513a;

    static {
        int[] iArr = new int[CardStatus.values().length];
        try {
            iArr[CardStatus.Ignored.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardStatus.New.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardStatus.Recognized.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardStatus.Familiar.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardStatus.Learned.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardStatus.Known.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f45513a = iArr;
    }
}
