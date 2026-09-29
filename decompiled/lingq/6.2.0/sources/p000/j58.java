package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class j58 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f45096a;

    /* JADX INFO: renamed from: b */
    public final Bundle f45097b;

    /* JADX INFO: renamed from: c */
    public final HashSet f45098c;

    public j58(String str, Bundle bundle, HashSet hashSet) {
        this.f45096a = str;
        this.f45097b = bundle;
        this.f45098c = hashSet;
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m14300a(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
