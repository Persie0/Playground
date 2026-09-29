package p226kl;

import android.content.Context;
import dm.C5206f;
import java.util.Set;
import p260m8.C7499b;

/* JADX INFO: renamed from: kl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6717a {

    /* JADX INFO: renamed from: kl.a$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        Set<Boolean> mo13335c();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13334a(Context context) {
        Set<Boolean> setMo13335c = ((a) C7499b.m14976z(context, a.class)).mo13335c();
        C5206f.m11030y0(setMo13335c.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setMo13335c.isEmpty()) {
            return true;
        }
        return setMo13335c.iterator().next().booleanValue();
    }
}
