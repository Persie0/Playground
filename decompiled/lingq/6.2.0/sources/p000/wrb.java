package p000;

import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface wrb extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(by3 by3Var);
}
