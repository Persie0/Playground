package p000;

import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ej9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f37365a;

    static {
        int[] iArr = new int[StorageQueueChangedAction.values().length];
        f37365a = iArr;
        try {
            iArr[StorageQueueChangedAction.Add.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f37365a[StorageQueueChangedAction.Update.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f37365a[StorageQueueChangedAction.UpdateAll.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f37365a[StorageQueueChangedAction.Remove.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f37365a[StorageQueueChangedAction.RemoveAll.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
