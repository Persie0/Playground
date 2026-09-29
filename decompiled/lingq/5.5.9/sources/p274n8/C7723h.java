package p274n8;

import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import jm.C6520c;
import jm.C6526i;
import kotlin.collections.C6752c;
import kotlin.random.Random;
import kotlin.text.C7076b;
import p260m8.C7499b;

/* JADX INFO: renamed from: n8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7723h {

    /* JADX INFO: renamed from: a */
    public final Set<String> f42264a;

    /* JADX INFO: renamed from: b */
    public final String f42265b;

    /* JADX INFO: renamed from: c */
    public final String f42266c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7723h(Collection collection) {
        String string = UUID.randomUUID().toString();
        C5207g.m11110e(string, "randomUUID().toString()");
        C6526i c6526i = new C6526i(43, BuildConfig.SDK_TRUNCATE_LENGTH);
        Random.Default r10 = Random.f38128a;
        C5207g.m11111f(r10, "random");
        try {
            int iM14950l0 = C7499b.m14950l0(r10, c6526i);
            ArrayList arrayListM13439g0 = C6752c.m13439g0('~', C6752c.m13439g0('_', C6752c.m13439g0('.', C6752c.m13439g0('-', C6752c.m13438f0(new C6520c('0', '9'), C6752c.m13436d0(new C6520c('a', 'z'), new C6520c('A', 'Z')))))));
            ArrayList arrayList = new ArrayList(iM14950l0);
            boolean z10 = false;
            for (int i10 = 0; i10 < iM14950l0; i10++) {
                arrayList.add(Character.valueOf(((Character) C6752c.m13440h0(arrayListM13439g0, Random.f38128a)).charValue()));
            }
            String strM13430X = C6752c.m13430X(arrayList, "", null, null, null, 62);
            if ((string.length() == 0 ? false : !(C7076b.m14284d3(string, ' ', 0, false, 6) >= 0)) && C7730o.m15324b(strM13430X)) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            C5207g.m11110e(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.f42264a = setUnmodifiableSet;
            this.f42265b = string;
            this.f42266c = strM13430X;
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
