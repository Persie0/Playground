package androidx.emoji2.text;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: androidx.emoji2.text.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0896j {
    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: a */
    public static Set<int[]> m3530a() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set<int[]> set = (Set) objInvoke;
            Iterator<int[]> it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }
}
